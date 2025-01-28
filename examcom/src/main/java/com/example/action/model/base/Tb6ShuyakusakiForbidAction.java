package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6Shuyakusaki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約先否認
 *
 * @author emarfkrow
 */
public class Tb6ShuyakusakiForbidAction extends BaseAction {

    /** 集約先否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakusakiId = postJson.get("shuyakusakiId");
        if (shuyakusakiId == null) {
            shuyakusakiId = postJson.get("Tb6Shuyakusaki.shuyakusakiId");
        }
        if (shuyakusakiId == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb6Shuyakusaki e = FormValidator.toBean(Tb6Shuyakusaki.class.getName(), postJson);

        Tb6Shuyakusaki f = Tb6Shuyakusaki.get(e.getShuyakusakiId());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
