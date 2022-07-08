package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 主キーなし登録フォーム
 *
 * @author emarfkrow
 */
public class TNoPkRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(TNoPkRegistForm.class);

    /** 列Ａ */
    @jakarta.validation.constraints.Size(max = 30)
    private String columnA;

    /**
     * @return 列Ａ
     */
    public String getColumnA() {
        return columnA;
    }

    /**
     * @param p 列Ａ
     */
    public void setColumnA(final String p) {
        this.columnA = p;
    }

    /** 列Ｂ */
    @jakarta.validation.constraints.Size(max = 30)
    private String columnB;

    /**
     * @return 列Ｂ
     */
    public String getColumnB() {
        return columnB;
    }

    /**
     * @param p 列Ｂ
     */
    public void setColumnB(final String p) {
        this.columnB = p;
    }

    /** 列Ｃ */
    @jakarta.validation.constraints.Size(max = 30)
    private String columnC;

    /**
     * @return 列Ｃ
     */
    public String getColumnC() {
        return columnC;
    }

    /**
     * @param p 列Ｃ
     */
    public void setColumnC(final String p) {
        this.columnC = p;
    }

    /** 削除フラグ */
    @jakarta.validation.constraints.Size(max = 1)
    private String deleteF;

    /**
     * @return 削除フラグ
     */
    public String getDeleteF() {
        return deleteF;
    }

    /**
     * @param p 削除フラグ
     */
    public void setDeleteF(final String p) {
        this.deleteF = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("not overridden in subclasses.");
    }

}
