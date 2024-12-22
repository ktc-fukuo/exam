package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Entity1His;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * エンティティ１履歴削除
 *
 * @author emarfkrow
 */
public class Tb1Entity1HisDeleteAction extends BaseAction {

    /** エンティティ１履歴削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Entity1His.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Entity1His.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object entityBn = postJson.get("entityBn");
        if (entityBn == null) {
            entityBn = postJson.get("Tb1Entity1His.entityBn");
        }
        if (entityBn == null) {
            throw new OptLockError("error.cant.delete");
        }
        Object historyBn = postJson.get("historyBn");
        if (historyBn == null) {
            historyBn = postJson.get("Tb1Entity1His.historyBn");
        }
        if (historyBn == null) {
            throw new OptLockError("error.cant.delete");
        }

        Tb1Entity1His e = FormValidator.toBean(Tb1Entity1His.class.getName(), postJson);

        if (e.delete() != 1) {
            throw new OptLockError("error.cant.delete");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}