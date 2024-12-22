package com.example.form.model.base;

import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * エンティティ１履歴登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1Entity1HisRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1Entity1HisRegistForm.class);

    /** 祖先ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sosenId;

    /**
     * @return 祖先ID
     */
    public String getSosenId() {
        return sosenId;
    }

    /**
     * @param p 祖先ID
     */
    public void setSosenId(final String p) {
        this.sosenId = p;
    }

    /** 親枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaBn;

    /**
     * @return 親枝番
     */
    public String getOyaBn() {
        return oyaBn;
    }

    /**
     * @param p 親枝番
     */
    public void setOyaBn(final String p) {
        this.oyaBn = p;
    }

    /** エンティティ枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String entityBn;

    /**
     * @return エンティティ枝番
     */
    public String getEntityBn() {
        return entityBn;
    }

    /**
     * @param p エンティティ枝番
     */
    public void setEntityBn(final String p) {
        this.entityBn = p;
    }

    /** 履歴枝番 */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String historyBn;

    /**
     * @return 履歴枝番
     */
    public String getHistoryBn() {
        return historyBn;
    }

    /**
     * @param p 履歴枝番
     */
    public void setHistoryBn(final String p) {
        this.historyBn = p;
    }

    /** エンティティ１名 */
    @jakarta.validation.constraints.NotBlank
    @jakarta.validation.constraints.Size(max = 60)
    private String entity1Mei;

    /**
     * @return エンティティ１名
     */
    public String getEntity1Mei() {
        return entity1Mei;
    }

    /**
     * @param p エンティティ１名
     */
    public void setEntity1Mei(final String p) {
        this.entity1Mei = p;
    }

    /** 参照１ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String sansho1Id;

    /**
     * @return 参照１ID
     */
    public String getSansho1Id() {
        return sansho1Id;
    }

    /**
     * @param p 参照１ID
     */
    public void setSansho1Id(final String p) {
        this.sansho1Id = p;
    }

    /** 参照１名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String sansho1Mei;

    /**
     * @return 参照１名
     */
    public String getSansho1Mei() {
        return sansho1Mei;
    }

    /**
     * @param p 参照１名
     */
    public void setSansho1Mei(final String p) {
        this.sansho1Mei = p;
    }

    /** 参照２CD */
    @jakarta.validation.constraints.Size(max = 6)
    private String sansho2Cd;

    /**
     * @return 参照２CD
     */
    public String getSansho2Cd() {
        return sansho2Cd;
    }

    /**
     * @param p 参照２CD
     */
    public void setSansho2Cd(final String p) {
        this.sansho2Cd = p;
    }

    /** 参照２名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String sansho2Mei;

    /**
     * @return 参照２名
     */
    public String getSansho2Mei() {
        return sansho2Mei;
    }

    /**
     * @param p 参照２名
     */
    public void setSansho2Mei(final String p) {
        this.sansho2Mei = p;
    }

    /** 参照３NO */
    @jakarta.validation.constraints.Size(max = 10)
    private String sansho3No;

    /**
     * @return 参照３NO
     */
    public String getSansho3No() {
        return sansho3No;
    }

    /**
     * @param p 参照３NO
     */
    public void setSansho3No(final String p) {
        this.sansho3No = p;
    }

    /** 参照３名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String sansho3Mei;

    /**
     * @return 参照３名
     */
    public String getSansho3Mei() {
        return sansho3Mei;
    }

    /**
     * @param p 参照３名
     */
    public void setSansho3Mei(final String p) {
        this.sansho3Mei = p;
    }

    /** 別参照１ID */
    @jakarta.validation.constraints.Pattern(regexp = "([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String betsuSansho1Id;

    /**
     * @return 別参照１ID
     */
    public String getBetsuSansho1Id() {
        return betsuSansho1Id;
    }

    /**
     * @param p 別参照１ID
     */
    public void setBetsuSansho1Id(final String p) {
        this.betsuSansho1Id = p;
    }

    /** 別参照１名 */
    @jakarta.validation.constraints.Size(max = 60)
    private String betsuSansho1Mei;

    /**
     * @return 別参照１名
     */
    public String getBetsuSansho1Mei() {
        return betsuSansho1Mei;
    }

    /**
     * @param p 別参照１名
     */
    public void setBetsuSansho1Mei(final String p) {
        this.betsuSansho1Mei = p;
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
        LOG.trace("validate() not overridden in subclasses.");
    }

}