package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.MKbn;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 区分マスタ照会
 *
 * @author emarfkrow
 */
public class MKbnGetAction extends BaseAction {

    /** 区分マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーが不足していたら終了
        Object kbnNm = postJson.get("kbnNm");
        if (kbnNm == null) {
            kbnNm = postJson.get("MKbn.kbnNm");
        }
        if (kbnNm == null) {
            return map;
        }

        MKbn mKbn = MKbn.get(kbnNm);
        mKbn.referMKbnValues();
        map.put("MKbn", mKbn);
        return map;
    }

}
