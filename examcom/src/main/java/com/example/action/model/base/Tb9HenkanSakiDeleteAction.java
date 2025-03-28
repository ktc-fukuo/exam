package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb9HenkanSaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 変換先削除
 *
 * @author emarfkrow
 */
public class Tb9HenkanSakiDeleteAction extends BaseAction {

    /** 変換先削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object henkanSakiId = postJson.get("henkanSakiId");
        if (henkanSakiId == null) {
            henkanSakiId = postJson.get("Tb9HenkanSaki.henkanSakiId");
        }
        if (henkanSakiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb9HenkanSaki e = FormValidator.toBean(Tb9HenkanSaki.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
