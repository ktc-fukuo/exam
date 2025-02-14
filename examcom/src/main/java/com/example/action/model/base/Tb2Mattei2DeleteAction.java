package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Mattei2;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 末弟２削除
 *
 * @author emarfkrow
 */
public class Tb2Mattei2DeleteAction extends BaseAction {

    /** 末弟２削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object matteiId = postJson.get("matteiId");
        if (matteiId == null) {
            matteiId = postJson.get("Tb2Mattei2.matteiId");
        }
        if (matteiId == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb2Mattei2 e = FormValidator.toBean(Tb2Mattei2.class.getName(), postJson);
        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
