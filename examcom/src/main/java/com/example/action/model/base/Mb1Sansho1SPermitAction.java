package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.example.entity.Mb1Sansho1;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 参照１マスタ一覧承認
 *
 * @author emarfkrow
 */
public class Mb1Sansho1SPermitAction extends BaseAction {

    /** 参照１マスタ一覧承認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        Map<String, Object> map = new HashMap<String, Object>();

        int count = 0;

        @SuppressWarnings("unchecked")
        List<Map<String, Object>> gridData = (List<Map<String, Object>>) postJson.get("Mb1Sansho1Grid");
        for (Map<String, Object> gridRow : gridData) {

            if (gridRow.isEmpty()) {
                continue;
            }

            Mb1Sansho1 e = FormValidator.toBean(Mb1Sansho1.class.getName(), gridRow);

            // 主キーが不足していたらエラー
            Object sansho1Id = e.getSansho1Id();
            if (sansho1Id == null) {
                throw new OptLockError("error.cant.permit");
            }

            Mb1Sansho1 f = Mb1Sansho1.get(sansho1Id);
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
