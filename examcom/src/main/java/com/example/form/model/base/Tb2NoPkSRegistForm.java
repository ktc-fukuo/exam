package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 主キーなし一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2NoPkSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2NoPkRegistForm.class);

    /** 主キーなし登録フォームのリスト */
    @Valid
    private List<Tb2NoPkRegistForm> tb2NoPkGrid;

    /**
     * @return 主キーなし登録フォームのリスト
     */
    public List<Tb2NoPkRegistForm> getTb2NoPkGrid() {
        return tb2NoPkGrid;
    }

    /**
     * @param p 主キーなし登録フォームのリスト
     */
    public void setTb2NoPkGrid(final List<Tb2NoPkRegistForm> p) {
        this.tb2NoPkGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
