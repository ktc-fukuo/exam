package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb2Mattei3;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 末弟３一覧登録
 *
 * @author emarfkrow
 */
public class Tb2Mattei3SRegistAction extends BaseAction {

    /** 末弟３一覧登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb2Mattei3Grid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb2Mattei3 e = FormValidator.toBean(Tb2Mattei3.class.getName(), gridRow);

            // 主キーが不足していたらINSERT
            boolean isNew = false;
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getMatteiId())) {
                isNew = true;
            }
            // 楽観ロック値がなくてもINSERT
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getUpdateTs())) {
                isNew = true;
            }

            e.setStatusKb(0);

            if (isNew) {

                if (e.insert(now, execId) != 1) {
                    throw new OptLockError("error.cant.insert");
                }
                ++count;

            } else {

                if (e.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.update");
                }
                ++count;
            }
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.regist"));
        return map;
    }

}
