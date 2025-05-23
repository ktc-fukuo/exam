package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb7ShuyakuYokushi;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * 集約抑止照会
 *
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiGetAction extends BaseAction {

    /** 集約抑止照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object shuyakuYokushiId = postJson.get("shuyakuYokushiId");
        if (shuyakuYokushiId == null) {
            shuyakuYokushiId = postJson.get("Tb7ShuyakuYokushi.shuyakuYokushiId");
        }
        if (shuyakuYokushiId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Tb7ShuyakuYokushi tb7ShuyakuYokushi = Tb7ShuyakuYokushi.get(shuyakuYokushiId);
            map.put("Tb7ShuyakuYokushi", tb7ShuyakuYokushi);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
