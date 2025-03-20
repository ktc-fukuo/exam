package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 親登録フォーム
 *
 * @author emarfkrow
 */
public class Tb1OyaRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb1OyaRegistForm.class);

    /** 親ID */
    @jakarta.validation.constraints.Pattern(regexp = "-?([0-9]{0,10}\\.?[0-9]{0,0}?)?")
    private String oyaId;

    /**
     * @return 親ID
     */
    public String getOyaId() {
        return oyaId;
    }

    /**
     * @param p 親ID
     */
    public void setOyaId(final String p) {
        this.oyaId = p;
    }

    /** 親情報 */
    @jakarta.validation.constraints.Size(max = 300)
    private String oyaInfo;

    /**
     * @return 親情報
     */
    public String getOyaInfo() {
        return oyaInfo;
    }

    /**
     * @param p 親情報
     */
    public void setOyaInfo(final String p) {
        this.oyaInfo = p;
    }

    /** 子 */
    @jakarta.validation.Valid
    private List<Tb1KoRegistForm> tb1KoGrid;

    /**
     * @return 子
     */
    public List<Tb1KoRegistForm> getTb1KoGrid() {
        return tb1KoGrid;
    }

    /**
     * @param p
     */
    public void setTb1KoGrid(final List<Tb1KoRegistForm> p) {
        this.tb1KoGrid = p;
    }

    /** 子２ */
    @jakarta.validation.Valid
    private List<Tb1Ko2RegistForm> tb1Ko2Grid;

    /**
     * @return 子２
     */
    public List<Tb1Ko2RegistForm> getTb1Ko2Grid() {
        return tb1Ko2Grid;
    }

    /**
     * @param p
     */
    public void setTb1Ko2Grid(final List<Tb1Ko2RegistForm> p) {
        this.tb1Ko2Grid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.trace("validate() not overridden in subclasses.");
    }

}
