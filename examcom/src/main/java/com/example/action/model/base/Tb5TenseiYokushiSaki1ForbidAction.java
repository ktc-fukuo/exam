package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5TenseiYokushiSaki1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生抑止先１否認
 *
 * @author emarfkrow
 */
public class Tb5TenseiYokushiSaki1ForbidAction extends BaseAction {

    /** 転生抑止先１否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object tenseiYokushiSaki1Id = postJson.get("tenseiYokushiSaki1Id");
        if (tenseiYokushiSaki1Id == null) {
            tenseiYokushiSaki1Id = postJson.get("Tb5TenseiYokushiSaki1.tenseiYokushiSaki1Id");
        }
        if (tenseiYokushiSaki1Id == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5TenseiYokushiSaki1 e = FormValidator.toBean(Tb5TenseiYokushiSaki1.class.getName(), postJson);

        Tb5TenseiYokushiSaki1 f = Tb5TenseiYokushiSaki1.get(e.getTenseiYokushiSaki1Id());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
