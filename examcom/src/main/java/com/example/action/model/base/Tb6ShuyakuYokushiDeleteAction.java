package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb6ShuyakuYokushi;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 集約抑止削除
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiDeleteAction extends BaseAction {

    /** 集約抑止削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object shuyakuYokushiId = postJson.get("shuyakuYokushiId");
        if (shuyakuYokushiId == null) {
            shuyakuYokushiId = postJson.get("Tb6ShuyakuYokushi.shuyakuYokushiId");
        }
        if (shuyakuYokushiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb6ShuyakuYokushi e = FormValidator.toBean(Tb6ShuyakuYokushi.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
