package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止元２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6ShuyakuYokushiMoto2RegistForm.class);

    /** 集約抑止元２登録フォームのリスト */
    @Valid
    private List<Tb6ShuyakuYokushiMoto2RegistForm> tb6ShuyakuYokushiMoto2Grid;

    /**
     * @return 集約抑止元２登録フォームのリスト
     */
    public List<Tb6ShuyakuYokushiMoto2RegistForm> getTb6ShuyakuYokushiMoto2Grid() {
        return tb6ShuyakuYokushiMoto2Grid;
    }

    /**
     * @param p 集約抑止元２登録フォームのリスト
     */
    public void setTb6ShuyakuYokushiMoto2Grid(final List<Tb6ShuyakuYokushiMoto2RegistForm> p) {
        this.tb6ShuyakuYokushiMoto2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
