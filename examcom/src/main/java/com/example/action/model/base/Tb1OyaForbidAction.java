package com.example.action.model.base;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.Map;

import com.example.entity.Tb1Oya;

import jp.co.golorp.emarf.action.BaseAction;
import jp.co.golorp.emarf.exception.OptLockError;
import jp.co.golorp.emarf.util.Messages;
import jp.co.golorp.emarf.validation.FormValidator;

/**
 * 親否認
 *
 * @author emarfkrow
 */
public class Tb1OyaForbidAction extends BaseAction {

    /** 親否認処理 */
    @Override
    public Map<String, Object> running(final LocalDateTime now, final String execId, final Map<String, Object> postJson) {

        // 主キーが不足していたらエラー
        Object sosenId = postJson.get("sosenId");
        if (sosenId == null) {
            sosenId = postJson.get("Tb1Oya.sosenId");
        }
        if (sosenId == null) {
            throw new OptLockError("error.cant.forbid");
        }
        Object oyaBn = postJson.get("oyaBn");
        if (oyaBn == null) {
            oyaBn = postJson.get("Tb1Oya.oyaBn");
        }
        if (oyaBn == null) {
            throw new OptLockError("error.cant.forbid");
        }

        Tb1Oya e = FormValidator.toBean(Tb1Oya.class.getName(), postJson);

        java.util.List<com.example.entity.Tb1Entity1> tb1Entity1s = e.referTb1Entity1s();
        if (tb1Entity1s != null) {
            for (com.example.entity.Tb1Entity1 tb1Entity1 : tb1Entity1s) {

                // child:Tb1Ko, parents:5

                // child:Tb1TenpuFile, parents:5

                tb1Entity1.setStatusKb(-1);
                if (tb1Entity1.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        java.util.List<com.example.entity.Tb1Entity2> tb1Entity2s = e.referTb1Entity2s();
        if (tb1Entity2s != null) {
            for (com.example.entity.Tb1Entity2 tb1Entity2 : tb1Entity2s) {

                // child:Tb1Ko, parents:5

                // child:Tb1TenpuFile, parents:5

                tb1Entity2.setStatusKb(-1);
                if (tb1Entity2.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        java.util.List<com.example.entity.Tb1Entity3> tb1Entity3s = e.referTb1Entity3s();
        if (tb1Entity3s != null) {
            for (com.example.entity.Tb1Entity3 tb1Entity3 : tb1Entity3s) {

                // child:Tb1Ko, parents:5

                // child:Tb1TenpuFile, parents:5

                tb1Entity3.setStatusKb(-1);
                if (tb1Entity3.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        java.util.List<com.example.entity.Tb1Entity4> tb1Entity4s = e.referTb1Entity4s();
        if (tb1Entity4s != null) {
            for (com.example.entity.Tb1Entity4 tb1Entity4 : tb1Entity4s) {

                // child:Tb1Ko, parents:5

                // child:Tb1TenpuFile, parents:5

                tb1Entity4.setStatusKb(-1);
                if (tb1Entity4.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        java.util.List<com.example.entity.Tb1Entity5> tb1Entity5s = e.referTb1Entity5s();
        if (tb1Entity5s != null) {
            for (com.example.entity.Tb1Entity5 tb1Entity5 : tb1Entity5s) {

                // child:Tb1Ko, parents:5

                // child:Tb1TenpuFile, parents:5

                tb1Entity5.setStatusKb(-1);
                if (tb1Entity5.update(now, execId) != 1) {
                    throw new OptLockError("error.cant.forbid");
                }
            }
        }

        Tb1Oya f = Tb1Oya.get(e.getSosenId(), e.getOyaBn());
        f.setStatusKb(-1);
        if (f.update(now, execId) != 1) {
            throw new OptLockError("error.cant.forbid");
        }

        Map<String, Object> map = new HashMap<String, Object>();
        map.put("INFO", Messages.get("info.forbid"));
        return map;
    }

}