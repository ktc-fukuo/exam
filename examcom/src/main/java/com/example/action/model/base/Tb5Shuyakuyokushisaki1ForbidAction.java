package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb5Shuyakuyokushisaki1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約抑止先１否認
 *
 * @author emarfkrow
 */
public class Tb5Shuyakuyokushisaki1ForbidAction extends BaseAction {

    /** 集約抑止先１否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuyokushisaki1Id = postJson.get("shuyakuyokushisaki1Id");
        if (shuyakuyokushisaki1Id == null) {
            shuyakuyokushisaki1Id = postJson.get("Tb5Shuyakuyokushisaki1.shuyakuyokushisaki1Id");
        }
        if (shuyakuyokushisaki1Id == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb5Shuyakuyokushisaki1 e = FormValidator.toBean(Tb5Shuyakuyokushisaki1.class.getName(), postJson);

        Tb5Shuyakuyokushisaki1 f = Tb5Shuyakuyokushisaki1.get(e.getShuyakuyokushisaki1Id());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}
