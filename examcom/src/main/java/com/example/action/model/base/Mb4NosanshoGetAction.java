package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Mb4Nosansho;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.NoDataError;

/**
 * NO参照マスタ照会
 *
 * @author emarfkrow
 */
public class Mb4NosanshoGetAction extends BaseAction {

    /** NO参照マスタ照会処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        // 主キーのチェック
        boolean isAllKey = true;

        Object norefNo = postJson.get("norefNo");
        if (norefNo == null) {
            norefNo = postJson.get("Mb4Nosansho.norefNo");
        }
        if (norefNo == null) {
            isAllKey = false;
        }

        // 主キーが不足していたら終了
        if (!isAllKey) {
            return map;
        }

        try {
            Mb4Nosansho mb4Nosansho = Mb4Nosansho.get(norefNo);
            map.put("Mb4Nosansho", mb4Nosansho);
        } catch (NoDataError e) {
            if (!postJson.get("IsSilent").equals("true")) {
                throw e;
            }
        }

        return map;
    }

}
