package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb5TenseiMoto;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 転生元一覧削除
 *
 * @author emarfkrow
 */
public class Tb5TenseiMotoSDeleteAction extends BaseAction {

    /** 転生元一覧削除処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb5TenseiMotoGrid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            // 主キーが不足していたらエラー
            if (jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(gridRow.get("TENSEI_MOTO_ID"))) {
                throw new OptLockError("error.cant.delete");
            }

            Tb5TenseiMoto e = FormValidator.toBean(Tb5TenseiMoto.class.getName(), gridRow);

            java.util.List<com.example.entity.Tb5TenseiMotoDet> tb5TenseiMotoDets = e.referTb5TenseiMotoDets();
            if (tb5TenseiMotoDets != null) {
                for (com.example.entity.Tb5TenseiMotoDet tb5TenseiMotoDet : tb5TenseiMotoDets) {

                    if (tb5TenseiMotoDet.delete() != 1) {
                        throw new OptLockError("error.cant.delete");
                    }
                }
            }

            if (e.delete() != 1) {
                throw new OptLockError("error.cant.delete");
            }
            ++count;
        }

        if (count == 0) {
            map.put("ERROR", Messages.get("error.nopost"));
            return map;
        }

        map.put("INFO", Messages.get("info.delete"));
        return map;
    }

}
