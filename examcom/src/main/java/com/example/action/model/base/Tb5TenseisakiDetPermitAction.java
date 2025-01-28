package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseisakiDet;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生先明細承認
 *
 * @author emarfkrow
 */
public class Tb5TenseisakiDetPermitAction extends BaseAction {

    /** 転生先明細承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseisakiId = postJson.get("tenseisakiId");
        if (tenseisakiId == null) {
            tenseisakiId = postJson.get("Tb5TenseisakiDet.tenseisakiId");
        }
        if (tenseisakiId == null) {
            throw new OptLockError("error.cant.permit");
        }
        Object tenseisakiBn = postJson.get("tenseisakiBn");
        if (tenseisakiBn == null) {
            tenseisakiBn = postJson.get("Tb5TenseisakiDet.tenseisakiBn");
        }
        if (tenseisakiBn == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb5TenseisakiDet e = FormValidator.toBean(Tb5TenseisakiDet.class.getName(), postJson);

        Tb5TenseisakiDet f = Tb5TenseisakiDet.get(e.getTenseisakiId(), e.getTenseisakiBn());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
