package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Rireki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 履歴元否認
 *
 * @author emarfkrow
 */
public class Tb3RirekiForbidAction extends BaseAction {

    /** 履歴元否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object rirekiMotoId = postJson.get("rirekiMotoId");
        if (rirekiMotoId == null) {
            rirekiMotoId = postJson.get("Tb3Rireki.rirekiMotoId");
        }
        if (rirekiMotoId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb3Rireki e = FormValidator.toBean(Tb3Rireki.class.getName(), postJson);

        Tb3Rireki f = Tb3Rireki.get(e.getRirekiMotoId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
