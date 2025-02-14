package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Kyodai2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 兄弟２承認
 *
 * @author emarfkrow
 */
public class Tb2Kyodai2PermitAction extends BaseAction {

    /** 兄弟２承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object kyodaiId = postJson.get("kyodaiId");
        if (kyodaiId == null) {
            kyodaiId = postJson.get("Tb2Kyodai2.kyodaiId");
        }
        if (kyodaiId == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb2Kyodai2 e = FormValidator.toBean(Tb2Kyodai2.class.getName(), postJson);

        Tb2Kyodai2 f = Tb2Kyodai2.get(e.getKyodaiId());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
