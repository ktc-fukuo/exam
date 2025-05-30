package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Satogo;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 里子削除
 *
 * @author emarfkrow
 */
public class Tb2SatogoDeleteAction extends BaseAction {

    /** 里子削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object satogoId = postJson.get("satogoId");
        if (satogoId == null) {
            satogoId = postJson.get("Tb2Satogo.satogoId");
        }
        if (satogoId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb2Satogo e = FormValidator.toBean(Tb2Satogo.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
