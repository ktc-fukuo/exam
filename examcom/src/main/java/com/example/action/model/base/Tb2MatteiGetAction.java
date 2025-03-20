package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb2Mattei;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 末弟照会
 *
 * @author emarfkrow
 */
public class Tb2MatteiGetAction extends BaseAction {

    /** 末弟照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object matteiId = postJson.get("matteiId");
        if (matteiId == null) {
            matteiId = postJson.get("Tb2Mattei.matteiId");
        }
        if (matteiId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb2Mattei tb2Mattei = Tb2Mattei.get(matteiId);
        map.put("Tb2Mattei", tb2Mattei);
        return map;
    }

}
