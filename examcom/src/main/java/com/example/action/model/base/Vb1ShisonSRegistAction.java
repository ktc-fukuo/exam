package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Vb1Shison;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 子孫一覧登録
 *
 * @author emarfkrow
 */
public class Vb1ShisonSRegistAction extends BaseAction {

    /** 子孫一覧登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Vb1ShisonGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Vb1Shison e = FormValidator.toBean(Vb1Shison.class.getName(), gridRow);

            // 主キーが不足していたらINSERT
            boolean isNew = false;

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
