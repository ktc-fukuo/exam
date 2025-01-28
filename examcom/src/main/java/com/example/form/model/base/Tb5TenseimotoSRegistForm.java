package com.example.form.model.base;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.validation.Valid;
import jp.co.golorp.emarf.process.BaseProcess;
import jp.co.golorp.emarf.validation.IForm;

/**
 * 転生元一覧登録フォーム
 *
 * @author emarfkrow
 */
public class Tb5TenseimotoSRegistForm implements IForm {

    /** logger */
    private static final Logger LOG = LoggerFactory.getLogger(Tb5TenseimotoRegistForm.class);

    /** 転生元登録フォームのリスト */
    @Valid
    private List<Tb5TenseimotoRegistForm> tb5TenseimotoGrid;

    /**
     * @return 転生元登録フォームのリスト
     */
    public List<Tb5TenseimotoRegistForm> getTb5TenseimotoGrid() {
        return tb5TenseimotoGrid;
    }

    /**
     * @param p 転生元登録フォームのリスト
     */
    public void setTb5TenseimotoGrid(final List<Tb5TenseimotoRegistForm> p) {
        this.tb5TenseimotoGrid = p;
    }

    /** 関連チェック */
    @Override
    public void validate(final Map<String, String> errors, final BaseProcess baseProcess) {
        LOG.debug("validate() not overridden in subclasses.");
    }

}
