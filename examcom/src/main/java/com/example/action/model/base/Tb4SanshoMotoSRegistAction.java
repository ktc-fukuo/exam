package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb4SanshoMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照元一覧登録
 *
 * @author emarfkrow
 */
public class Tb4SanshoMotoSRegistAction extends BaseAction {

    /** 参照元一覧登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb4SanshoMotoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb4SanshoMoto e = FormValidator.toBean(Tb4SanshoMoto.class.getName(), gridRow);

            // 主キーが不足していたらINSERT
            boolean isNew = false;
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getSanshoMotoId())) {
                isNew = true;
            }
            // 楽観ロック値がなくてもINSERT
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getUpdateTs())) {
                isNew = true;
            }

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
