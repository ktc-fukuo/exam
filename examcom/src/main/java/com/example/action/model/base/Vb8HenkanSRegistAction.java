package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Vb8Henkan;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * VIEW一覧登録
 *
 * @author emarfkrow
 */
public class Vb8HenkanSRegistAction extends BaseAction {

    /** VIEW一覧登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Vb8HenkanGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            String className = Vb8Henkan.class.getName();
            // 変換ビューの場合
            className = "com.example.entity." + gridRow.get("TABLE_NAME").toString();
            jp.co.golorp.emarf.entity.IEntity e = FormValidator.toBean(className, gridRow);

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
