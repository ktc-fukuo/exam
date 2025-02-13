package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孤児２一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2Koji2SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2Koji2RegistForm.class);

    /** 孤児２登録フォームのリスト */
    @Valid
    private List<Tb2Koji2RegistForm> tb2Koji2Grid;

    /**
     * @return 孤児２登録フォームのリスト
     */
    public List<Tb2Koji2RegistForm> getTb2Koji2Grid() {
        return tb2Koji2Grid;
    }

    /**
     * @param p 孤児２登録フォームのリスト
     */
    public void setTb2Koji2Grid(final List<Tb2Koji2RegistForm> p) {
        this.tb2Koji2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
