package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6HaseiSaki2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 派生先２削除
 *
 * @author emarfkrow
 */
public class Tb6HaseiSaki2DeleteAction extends BaseAction {

    /** 派生先２削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object haseiSaki2Id = postJson.get("haseiSaki2Id");
        if (haseiSaki2Id == null) {
            haseiSaki2Id = postJson.get("Tb6HaseiSaki2.haseiSaki2Id");
        }
        if (haseiSaki2Id == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6HaseiSaki2 e = FormValidator.toBean(Tb6HaseiSaki2.class.getName(), postJson);

        java.util.List<com.example.entity.Tb6HaseiSaki2Det> tb6HaseiSaki2Dets = e.referTb6HaseiSaki2Dets();
        if (tb6HaseiSaki2Dets != null) {
            for (com.example.entity.Tb6HaseiSaki2Det tb6HaseiSaki2Det : tb6HaseiSaki2Dets) {

                if (tb6HaseiSaki2Det.delete() != 1) {
                    throw new OptLockError("error.cant.delete");
                }
            }
        }

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
