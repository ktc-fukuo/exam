package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MNinka;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 認可マスタ登録
 *
 * @author emarfkrow
 */
public class MNinkaRegistAction extends BaseAction {

    /** 認可マスタ登録処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String id, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        MNinka e = FormValidator.toBean(MNinka.class.getName(), postJson);

        // 主キーが不足していたらINSERT
        boolean isNew = false;
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getBushoId())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getShokuiId())) {
            isNew = true;
        }
        if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(e.getGamenNm())) {
            isNew = true;
        }

        if (isNew) {

            if (e.insert(now, id) != 1) {
                throw new OptLockError("error.cant.insert");
            }

            map.put("INFO", Messages.get("info.insert"));

        } else {

            if (e.update(now, id) == 1) {
                map.put("INFO", Messages.get("info.update"));
            } else if (e.insert(now, id) == 1) {
                map.put("INFO", Messages.get("info.insert"));
            } else {
                throw new OptLockError("error.cant.update");
            }
        }

        return map;
    }

}
