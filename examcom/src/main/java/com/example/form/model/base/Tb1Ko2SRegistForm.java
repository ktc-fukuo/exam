package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 子２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Ko2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Ko2RegistForm.class);

    /** 子２登録フォームのリスト */
    @Valid
    private List<Tb1Ko2RegistForm> tb1Ko2Grid;

    /**
     * @return 子２登録フォームのリスト
     */
    public List<Tb1Ko2RegistForm> getTb1Ko2Grid() {
        return tb1Ko2Grid;
    }

    /**
     * @param p 子２登録フォームのリスト
     */
    public void setTb1Ko2Grid(final List<Tb1Ko2RegistForm> p) {
        this.tb1Ko2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
