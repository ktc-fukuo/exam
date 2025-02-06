package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 集約元登録フォーム
 *
 * @author emarfkrow
 */
public class Tb6ShuyakuMotoRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb6ShuyakuMotoRegistForm.class);

    /** 集約元ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuMotoId;

    /**
     * @return 集約元ID
     */
    public String getShuyakuMotoId() {
        return shuyakuMotoId;
    }

    /**
     * @param p 集約元ID
     */
    public void setShuyakuMotoId(final String p) {
        this.shuyakuMotoId = p;
    }

    /** 集約元情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String shuyakuMotoInfo;

    /**
     * @return 集約元情報
     */
    public String getShuyakuMotoInfo() {
        return shuyakuMotoInfo;
    }

    /**
     * @param p 集約元情報
     */
    public void setShuyakuMotoInfo(final String p) {
        this.shuyakuMotoInfo = p;
    }

    /** 集約先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String shuyakuSakiId;

    /**
     * @return 集約先ID
     */
    public String getShuyakuSakiId() {
        return shuyakuSakiId;
    }

    /**
     * @param p 集約先ID
     */
    public void setShuyakuSakiId(final String p) {
        this.shuyakuSakiId = p;
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

    /** ステータス区分 */
    @jakarta.validation.constraints.Size(max = 2)
    private String statusKb;

    /**
     * @return ステータス区分
     */
    public String getStatusKb() {
        return statusKb;
    }

    /**
     * @param p ステータス区分
     */
    public void setStatusKb(final String p) {
        this.statusKb = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
