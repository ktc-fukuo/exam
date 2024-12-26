package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.MhrUser;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * ユーザマスタ一覧承認
 *
 * @author emarfkrow
 */
public class MhrUserSPermitAction extends BaseAction {

    /** ユーザマスタ一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("MhrUserGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            MhrUser e = FormValidator.toBean(MhrUser.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object userId = e.getUserId();
            if (userId == null) {
                throw new OptLockError("error.cant.permit");
            }

            MhrUser f = MhrUser.get(userId);
            f.setStatusKb(1);
            if (f.update(now, execId) != 1) {
                throw new OptLockError("error.cant.permit");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.permit"));
        return map;
    }

}