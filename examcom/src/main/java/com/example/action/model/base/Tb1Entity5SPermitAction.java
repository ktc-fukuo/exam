package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Tb1Entity5;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * エンティティ５一覧承認
 *
 * @author emarfkrow
 */
public class Tb1Entity5SPermitAction extends BaseAction {

    /** エンティティ５一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Tb1Entity5Grid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Tb1Entity5 e = FormValidator.toBean(Tb1Entity5.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object sosenId = e.getSosenId();
            if (sosenId == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object oyaBn = e.getOyaBn();
            if (oyaBn == null) {
                throw new OptLockError("error.cant.permit");
            }
            Object entityBn = e.getEntityBn();
            if (entityBn == null) {
                throw new OptLockError("error.cant.permit");
            }

            // child:Tb1Ko, parents:5

            // child:Tb1TenpuFile, parents:5

            Tb1Entity5 f = Tb1Entity5.get(sosenId, oyaBn, entityBn);
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
