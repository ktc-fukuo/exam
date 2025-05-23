package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生明細一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseiDetSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseiDetRegistForm.class);

    /** 転生明細登録フォームのリスト */
    @Valid
    private List<Tb5TenseiDetRegistForm> tb5TenseiDetGrid;

    /**
     * @return 転生明細登録フォームのリスト
     */
    public List<Tb5TenseiDetRegistForm> getTb5TenseiDetGrid() {
        return tb5TenseiDetGrid;
    }

    /**
     * @param p 転生明細登録フォームのリスト
     */
    public void setTb5TenseiDetGrid(final List<Tb5TenseiDetRegistForm> p) {
        this.tb5TenseiDetGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
