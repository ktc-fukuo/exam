package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Shuyakumoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約元承認
 *
 * @author emarfkrow
 */
public class Tb6ShuyakumotoPermitAction extends BaseAction {

    /** 集約元承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakumotoId = postJson.get("shuyakumotoId");
        if (shuyakumotoId == null) {
            shuyakumotoId = postJson.get("Tb6Shuyakumoto.shuyakumotoId");
        }
        if (shuyakumotoId == null) {
            throw new OptLockError("error.cant.permit");
        }

        Tb6Shuyakumoto e = FormValidator.toBean(Tb6Shuyakumoto.class.getName(), postJson);

        Tb6Shuyakumoto f = Tb6Shuyakumoto.get(e.getShuyakumotoId());
        f.setStatusKb(1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.permit");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}
