package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 孤児一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb2KojiSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb2KojiRegistForm.class);

    /** 孤児登録フォームのリスト */
    @Valid
    private List<Tb2KojiRegistForm> tb2KojiGrid;

    /**
     * @return 孤児登録フォームのリスト
     */
    public List<Tb2KojiRegistForm> getTb2KojiGrid() {
        return tb2KojiGrid;
    }

    /**
     * @param p 孤児登録フォームのリスト
     */
    public void setTb2KojiGrid(final List<Tb2KojiRegistForm> p) {
        this.tb2KojiGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
