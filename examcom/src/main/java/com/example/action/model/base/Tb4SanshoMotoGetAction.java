package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb4SanshoMoto;

import jp.co.golorp.emarf.action.BaseAction;

/**
 * 参照元照会
 *
 * @author emarfkrow
 */
public class Tb4SanshoMotoGetAction extends BaseAction {

    /** 参照元照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object sanshoMotoId = postJson.get("sanshoMotoId");
        if (sanshoMotoId == null) {
            sanshoMotoId = postJson.get("Tb4SanshoMoto.sanshoMotoId");
        }
        if (sanshoMotoId == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        Tb4SanshoMoto tb4SanshoMoto = Tb4SanshoMoto.get(sanshoMotoId);
        map.put("Tb4SanshoMoto", tb4SanshoMoto);
        return map;
    }

}
