package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb3Rireki;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 履歴元照会
 *
 * @author emarfkrow
 */
public class Tb3RirekiGetAction extends BaseAction {

    /** 履歴元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object rirekiId = postJson.get("rirekiId");
        if (rirekiId == null) {
            rirekiId = postJson.get("Tb3Rireki.rirekiId");
        }
        if (rirekiId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb3Rireki tb3Rireki = Tb3Rireki.get(rirekiId);
            map.put("Tb3Rireki", tb3Rireki);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
