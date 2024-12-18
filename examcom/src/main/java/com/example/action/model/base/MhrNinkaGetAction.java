package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MhrNinka;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 認可マスタ照会
 *
 * @author emarfkrow
 */
public class MhrNinkaGetAction extends BaseAction {

    /** 認可マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object bushoId = postJson.get("bushoId");
        if (bushoId == null) {
            bushoId = postJson.get("MhrNinka.bushoId");
        }
        if (bushoId == null) {
            return map;
        }
        Object shokuiId = postJson.get("shokuiId");
        if (shokuiId == null) {
            shokuiId = postJson.get("MhrNinka.shokuiId");
        }
        if (shokuiId == null) {
            return map;
        }
        Object kinoNm = postJson.get("kinoNm");
        if (kinoNm == null) {
            kinoNm = postJson.get("MhrNinka.kinoNm");
        }
        if (kinoNm == null) {
            return map;
        }

        MhrNinka mhrNinka = MhrNinka.get(bushoId, shokuiId, kinoNm);
        map.put("MhrNinka", mhrNinka);
        return map;
    }

}
