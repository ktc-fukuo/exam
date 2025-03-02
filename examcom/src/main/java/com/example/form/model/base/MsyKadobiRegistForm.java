package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 稼働日マスタ登録フォーム
 *
 * @author emarfkrow
 */
public class MsyKadobiRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(MsyKadobiRegistForm.class);

    /** 稼働日 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{4}(\\/|\\-)[0-9]{1,2}(\\/|\\-)[0-9]{1,2})?")
    private String kadoBi;

    /**
     * @return 稼働日
     */
    public String getKadoBi() {
        return kadoBi;
    }

    /**
     * @param p 稼働日
     */
    public void setKadoBi(final String p) {
        this.kadoBi = p;
    }

    /** 部署ID */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String bushoId;

    /**
     * @return 部署ID
     */
    public String getBushoId() {
        return bushoId;
    }

    /**
     * @param p 部署ID
     */
    public void setBushoId(final String p) {
        this.bushoId = p;
    }

    /** 稼働日フラグ */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 1)
    private String kadobiF;

    /**
     * @return 稼働日フラグ
     */
    public String getKadobiF() {
        return kadobiF;
    }

    /**
     * @param p 稼働日フラグ
     */
    public void setKadobiF(final String p) {
        this.kadobiF = p;
    }

    /** メモ */
    @jakarta.validation.constraints.Size(max = 300)
    private String memo;

    /**
     * @return メモ
     */
    public String getMemo() {
        return memo;
    }

    /**
     * @param p メモ
     */
    public void setMemo(final String p) {
        this.memo = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
