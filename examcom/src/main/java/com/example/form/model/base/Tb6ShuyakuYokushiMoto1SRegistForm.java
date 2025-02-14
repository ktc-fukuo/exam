package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約抑止元１一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuYokushiMoto1SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6ShuyakuYokushiMoto1RegistForm.class);

    /** 集約抑止元１登録フォームのリスト */
    @Valid
    private List<Tb6ShuyakuYokushiMoto1RegistForm> tb6ShuyakuYokushiMoto1Grid;

    /**
     * @return 集約抑止元１登録フォームのリスト
     */
    public List<Tb6ShuyakuYokushiMoto1RegistForm> getTb6ShuyakuYokushiMoto1Grid() {
        return tb6ShuyakuYokushiMoto1Grid;
    }

    /**
     * @param p 集約抑止元１登録フォームのリスト
     */
    public void setTb6ShuyakuYokushiMoto1Grid(final List<Tb6ShuyakuYokushiMoto1RegistForm> p) {
        this.tb6ShuyakuYokushiMoto1Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
