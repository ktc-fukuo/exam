package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ５一覧登録フォーム
 *
 * @author emarfkrow
 */
public class TEntity5SRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TEntity5RegistForm.class);

    /** エンティティ５登録フォームのリスト */
    @Valid
    private List<TEntity5RegistForm> tEntity5Grid;

    /**
     * @return エンティティ５登録フォームのリスト
     */
    public List<TEntity5RegistForm> getTEntity5Grid() {
        return tEntity5Grid;
    }

    /**
     * @param p エンティティ５登録フォームのリスト
     */
    public void setTEntity5Grid(final List<TEntity5RegistForm> p) {
        this.tEntity5Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
