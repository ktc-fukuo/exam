package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * エンティティ１
 * @author emarfkrow
 */
public class TEntity1 implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /**
     * @return id
     */
    public final Integer getId() {
        return id;
    }

    /**
     * @param o セットする id
     */
    public final void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.id = Integer.valueOf(o.toString());
        } else {
            this.id = null;
        }
    }

    /** 祖先ID */
    private Integer sosenId;

    /** @return 祖先ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SOSEN_ID")
    public Integer getSosenId() {
        return this.sosenId;
    }

    /** @param o 祖先ID */
    public void setSosenId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sosenId = Integer.valueOf(o.toString());
        } else {
            this.sosenId = null;
        }
    }

    /** 親枝番 */
    private Integer oyaBn;

    /** @return 親枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_BN")
    public Integer getOyaBn() {
        return this.oyaBn;
    }

    /** @param o 親枝番 */
    public void setOyaBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaBn = Integer.valueOf(o.toString());
        } else {
            this.oyaBn = null;
        }
    }

    /** エンティティ枝番 */
    private Integer entityBn;

    /** @return エンティティ枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY_BN")
    public Integer getEntityBn() {
        return this.entityBn;
    }

    /** @param o エンティティ枝番 */
    public void setEntityBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.entityBn = Integer.valueOf(o.toString());
        } else {
            this.entityBn = null;
        }
    }

    /** エンティティ名 */
    private String entity1Mei;

    /** @return エンティティ名 */
    @com.fasterxml.jackson.annotation.JsonProperty("ENTITY1_MEI")
    public String getEntity1Mei() {
        return this.entity1Mei;
    }

    /** @param o エンティティ名 */
    public void setEntity1Mei(final Object o) {
        if (o != null) {
            this.entity1Mei = o.toString();
        } else {
            this.entity1Mei = null;
        }
    }

    /** 参照１ID */
    private Integer sansho1Id;

    /** @return 参照１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO1_ID")
    public Integer getSansho1Id() {
        return this.sansho1Id;
    }

    /** @param o 参照１ID */
    public void setSansho1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sansho1Id = Integer.valueOf(o.toString());
        } else {
            this.sansho1Id = null;
        }
    }

    /** 参照１名 */
    private String sansho1Mei;

    /** @return 参照１名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO1_MEI")
    public String getSansho1Mei() {
        return this.sansho1Mei;
    }

    /** @param o 参照１名 */
    public void setSansho1Mei(final Object o) {
        if (o != null) {
            this.sansho1Mei = o.toString();
        } else {
            this.sansho1Mei = null;
        }
    }

    /** 参照２CD */
    private String sansho2Cd;

    /** @return 参照２CD */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO2_CD")
    public String getSansho2Cd() {
        return this.sansho2Cd;
    }

    /** @param o 参照２CD */
    public void setSansho2Cd(final Object o) {
        if (o != null) {
            this.sansho2Cd = o.toString();
        } else {
            this.sansho2Cd = null;
        }
    }

    /** 参照２名 */
    private String sansho2Mei;

    /** @return 参照２名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO2_MEI")
    public String getSansho2Mei() {
        return this.sansho2Mei;
    }

    /** @param o 参照２名 */
    public void setSansho2Mei(final Object o) {
        if (o != null) {
            this.sansho2Mei = o.toString();
        } else {
            this.sansho2Mei = null;
        }
    }

    /** 参照３NO */
    private String sansho3No;

    /** @return 参照３NO */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO3_NO")
    public String getSansho3No() {
        return this.sansho3No;
    }

    /** @param o 参照３NO */
    public void setSansho3No(final Object o) {
        if (o != null) {
            this.sansho3No = o.toString();
        } else {
            this.sansho3No = null;
        }
    }

    /** 参照３名 */
    private String sansho3Mei;

    /** @return 参照３名 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO3_MEI")
    public String getSansho3Mei() {
        return this.sansho3Mei;
    }

    /** @param o 参照３名 */
    public void setSansho3Mei(final Object o) {
        if (o != null) {
            this.sansho3Mei = o.toString();
        } else {
            this.sansho3Mei = null;
        }
    }

    /** 別参照１ID */
    private Integer betsuSansho1Id;

    /** @return 別参照１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_SANSHO1_ID")
    public Integer getBetsuSansho1Id() {
        return this.betsuSansho1Id;
    }

    /** @param o 別参照１ID */
    public void setBetsuSansho1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.betsuSansho1Id = Integer.valueOf(o.toString());
        } else {
            this.betsuSansho1Id = null;
        }
    }

    /** 別参照１名 */
    private String betsuSansho1Mei;

    /** @return 別参照１名 */
    @com.fasterxml.jackson.annotation.JsonProperty("BETSU_SANSHO1_MEI")
    public String getBetsuSansho1Mei() {
        return this.betsuSansho1Mei;
    }

    /** @param o 別参照１名 */
    public void setBetsuSansho1Mei(final Object o) {
        if (o != null) {
            this.betsuSansho1Mei = o.toString();
        } else {
            this.betsuSansho1Mei = null;
        }
    }

    /** 登録日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertDt;

    /** @return 登録日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_DT")
    public java.time.LocalDateTime getInsertDt() {
        return this.insertDt;
    }

    /** @param o 登録日時 */
    public void setInsertDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.insertDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.insertDt = null;
        }
    }

    /** 登録者 */
    private String insertBy;

    /** @return 登録者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_BY")
    public String getInsertBy() {
        return this.insertBy;
    }

    /** @param o 登録者 */
    public void setInsertBy(final Object o) {
        if (o != null) {
            this.insertBy = o.toString();
        } else {
            this.insertBy = null;
        }
    }

    /** 更新日時 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateDt;

    /** @return 更新日時 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_DT")
    public java.time.LocalDateTime getUpdateDt() {
        return this.updateDt;
    }

    /** @param o 更新日時 */
    public void setUpdateDt(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateDt = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateDt = java.time.LocalDateTime.parse(o.toString());
        } else {
            this.updateDt = null;
        }
    }

    /** 更新者 */
    private String updateBy;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_BY")
    public String getUpdateBy() {
        return this.updateBy;
    }

    /** @param o 更新者 */
    public void setUpdateBy(final Object o) {
        if (o != null) {
            this.updateBy = o.toString();
        } else {
            this.updateBy = null;
        }
    }

    /** 削除フラグ */
    private String deleteF = "0";

    /** @return 削除フラグ */
    @com.fasterxml.jackson.annotation.JsonProperty("DELETE_F")
    public String getDeleteF() {
        return this.deleteF;
    }

    /** @param o 削除フラグ */
    public void setDeleteF(final Object o) {
        if (o != null) {
            this.deleteF = o.toString();
        } else {
            this.deleteF = null;
        }
    }

    /**
     * エンティティ１照会
     * @param param1 祖先ID
     * @param param2 親枝番
     * @param param3 エンティティ枝番
     * @return エンティティ１
     */
    public static TEntity1 get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SOSEN_ID` \n";
        sql += "    , a.`OYA_BN` \n";
        sql += "    , a.`ENTITY_BN` \n";
        sql += "    , a.`ENTITY1_MEI` \n";
        sql += "    , a.`SANSHO1_ID` \n";
        sql += "    , a.`SANSHO1_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`SANSHO2_CD`) AS SANSHO2_CD \n";
        sql += "    , a.`SANSHO2_MEI` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`SANSHO3_NO`) AS SANSHO3_NO \n";
        sql += "    , a.`SANSHO3_MEI` \n";
        sql += "    , a.`BETSU_SANSHO1_ID` \n";
        sql += "    , a.`BETSU_SANSHO1_MEI` \n";
        sql += "    , a.`INSERT_DT` \n";
        sql += "    , a.`INSERT_BY` \n";
        sql += "    , a.`UPDATE_DT` \n";
        sql += "    , a.`UPDATE_BY` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "FROM \n";
        sql += "    t_entity1 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.get(sql, map, TEntity1.class);
    }

    /**
     * エンティティ１追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // エンティティ枝番の採番処理
        numbering();

        // 子の登録
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.setSosenId(this.getSosenId());
                tKo.setOyaBn(this.getOyaBn());
                tKo.setEntityBn(this.getEntityBn());
                tKo.insert(now, execId);
            }
        }

        // 添付ファイルの登録
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                tTenpuFile.setSosenId(this.getSosenId());
                tTenpuFile.setOyaBn(this.getOyaBn());
                tTenpuFile.setEntityBn(this.getEntityBn());
                tTenpuFile.insert(now, execId);
            }
        }

        // エンティティ３の登録
        if (this.tEntity3 != null) {
            this.tEntity3.setSosenId(this.getSosenId());
            this.tEntity3.setOyaBn(this.getOyaBn());
            this.tEntity3.setEntityBn(this.getEntityBn());
            this.tEntity3.insert(now, execId);
        }

        // エンティティ４の登録
        if (this.tEntity4 != null) {
            this.tEntity4.setSosenId(this.getSosenId());
            this.tEntity4.setOyaBn(this.getOyaBn());
            this.tEntity4.setEntityBn(this.getEntityBn());
            this.tEntity4.insert(now, execId);
        }

        // エンティティ５の登録
        if (this.tEntity5 != null) {
            this.tEntity5.setSosenId(this.getSosenId());
            this.tEntity5.setOyaBn(this.getOyaBn());
            this.tEntity5.setEntityBn(this.getEntityBn());
            this.tEntity5.insert(now, execId);
        }

        // エンティティ１履歴の登録
        TEntity1His tEntity1His = new TEntity1His();
        tEntity1His.setSosenId(this.sosenId);
        tEntity1His.setOyaBn(this.oyaBn);
        tEntity1His.setEntityBn(this.entityBn);
        tEntity1His.setEntity1Mei(this.entity1Mei);
        tEntity1His.setSansho1Id(this.sansho1Id);
        tEntity1His.setSansho1Mei(this.sansho1Mei);
        tEntity1His.setSansho2Cd(this.sansho2Cd);
        tEntity1His.setSansho2Mei(this.sansho2Mei);
        tEntity1His.setSansho3No(this.sansho3No);
        tEntity1His.setSansho3Mei(this.sansho3Mei);
        tEntity1His.setBetsuSansho1Id(this.betsuSansho1Id);
        tEntity1His.setBetsuSansho1Mei(this.betsuSansho1Mei);
        tEntity1His.setInsertDt(this.insertDt);
        tEntity1His.setInsertBy(this.insertBy);
        tEntity1His.setUpdateDt(this.updateDt);
        tEntity1His.setUpdateBy(this.updateBy);
        tEntity1His.setDeleteF(this.deleteF);
        tEntity1His.insert(now, execId);

        // エンティティ１の登録
        String sql = "INSERT INTO t_entity1(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SOSEN_ID` -- :sosen_id");
        nameList.add("`OYA_BN` -- :oya_bn");
        nameList.add("`ENTITY_BN` -- :entity_bn");
        nameList.add("`ENTITY1_MEI` -- :entity_1_mei");
        nameList.add("`SANSHO1_ID` -- :sansho_1_id");
        nameList.add("`SANSHO1_MEI` -- :sansho_1_mei");
        nameList.add("`SANSHO2_CD` -- :sansho_2_cd");
        nameList.add("`SANSHO2_MEI` -- :sansho_2_mei");
        nameList.add("`SANSHO3_NO` -- :sansho_3_no");
        nameList.add("`SANSHO3_MEI` -- :sansho_3_mei");
        nameList.add("`BETSU_SANSHO1_ID` -- :betsu_sansho_1_id");
        nameList.add("`BETSU_SANSHO1_MEI` -- :betsu_sansho_1_mei");
        nameList.add("`INSERT_DT` -- :insert_dt");
        nameList.add("`INSERT_BY` -- :insert_by");
        nameList.add("`UPDATE_DT` -- :update_dt");
        nameList.add("`UPDATE_BY` -- :update_by");
        nameList.add("`DELETE_F` -- :delete_f");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sosen_id");
        valueList.add(":oya_bn");
        valueList.add(":entity_bn");
        valueList.add(":entity_1_mei");
        valueList.add(":sansho_1_id");
        valueList.add(":sansho_1_mei");
        valueList.add(":sansho_2_cd");
        valueList.add(":sansho_2_mei");
        valueList.add(":sansho_3_no");
        valueList.add(":sansho_3_mei");
        valueList.add(":betsu_sansho_1_id");
        valueList.add(":betsu_sansho_1_mei");
        valueList.add(":insert_dt");
        valueList.add(":insert_by");
        valueList.add(":update_dt");
        valueList.add(":update_by");
        valueList.add(":delete_f");
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティ枝番の採番処理 */
    private void numbering() {
        if (this.entityBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`ENTITY_BN`) IS NULL THEN 0 ELSE MAX(e.`ENTITY_BN`) * 1 END + 1 AS `ENTITY_BN` FROM t_entity1 e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`SOSEN_ID` = :sosen_id");
        whereList.add("e.`OYA_BN` = :oya_bn");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("sosen_id", this.sosenId);
        map.put("oya_bn", this.oyaBn);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("ENTITY_BN");
        this.setEntityBn(o);
    }

    /**
     * エンティティ１更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 子の登録
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                if (tKo == null) {
                    continue;
                }
                tKo.setSosenId(this.sosenId);
                tKo.setOyaBn(this.oyaBn);
                tKo.setEntityBn(this.entityBn);
                try {
                    tKo.insert(now, execId);
                } catch (Exception e) {
                    tKo.update(now, execId);
                }
            }
        }

        // 添付ファイルの登録
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                if (tTenpuFile == null) {
                    continue;
                }
                tTenpuFile.setSosenId(this.sosenId);
                tTenpuFile.setOyaBn(this.oyaBn);
                tTenpuFile.setEntityBn(this.entityBn);
                try {
                    tTenpuFile.insert(now, execId);
                } catch (Exception e) {
                    tTenpuFile.update(now, execId);
                }
            }
        }

        // エンティティ３の登録
        if (this.tEntity3 != null) {
            tEntity3.setSosenId(this.getSosenId());
            tEntity3.setOyaBn(this.getOyaBn());
            tEntity3.setEntityBn(this.getEntityBn());
            try {
                tEntity3.insert(now, execId);
            } catch (Exception e) {
                tEntity3.update(now, execId);
            }
        }

        // エンティティ４の登録
        if (this.tEntity4 != null) {
            tEntity4.setSosenId(this.getSosenId());
            tEntity4.setOyaBn(this.getOyaBn());
            tEntity4.setEntityBn(this.getEntityBn());
            try {
                tEntity4.insert(now, execId);
            } catch (Exception e) {
                tEntity4.update(now, execId);
            }
        }

        // エンティティ５の登録
        if (this.tEntity5 != null) {
            tEntity5.setSosenId(this.getSosenId());
            tEntity5.setOyaBn(this.getOyaBn());
            tEntity5.setEntityBn(this.getEntityBn());
            try {
                tEntity5.insert(now, execId);
            } catch (Exception e) {
                tEntity5.update(now, execId);
            }
        }

        // エンティティ１履歴の登録
        TEntity1His tEntity1His = new TEntity1His();
        tEntity1His.setSosenId(this.sosenId);
        tEntity1His.setOyaBn(this.oyaBn);
        tEntity1His.setEntityBn(this.entityBn);
        tEntity1His.setEntity1Mei(this.entity1Mei);
        tEntity1His.setSansho1Id(this.sansho1Id);
        tEntity1His.setSansho1Mei(this.sansho1Mei);
        tEntity1His.setSansho2Cd(this.sansho2Cd);
        tEntity1His.setSansho2Mei(this.sansho2Mei);
        tEntity1His.setSansho3No(this.sansho3No);
        tEntity1His.setSansho3Mei(this.sansho3Mei);
        tEntity1His.setBetsuSansho1Id(this.betsuSansho1Id);
        tEntity1His.setBetsuSansho1Mei(this.betsuSansho1Mei);
        tEntity1His.setInsertDt(this.insertDt);
        tEntity1His.setInsertBy(this.insertBy);
        tEntity1His.setUpdateDt(this.updateDt);
        tEntity1His.setUpdateBy(this.updateBy);
        tEntity1His.setDeleteF(this.deleteF);
        tEntity1His.insert(now, execId);

        // エンティティ１の登録
        String sql = "UPDATE t_entity1\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SOSEN_ID` = :sosen_id");
        setList.add("`OYA_BN` = :oya_bn");
        setList.add("`ENTITY_BN` = :entity_bn");
        setList.add("`ENTITY1_MEI` = :entity_1_mei");
        setList.add("`SANSHO1_ID` = :sansho_1_id");
        setList.add("`SANSHO1_MEI` = :sansho_1_mei");
        setList.add("`SANSHO2_CD` = :sansho_2_cd");
        setList.add("`SANSHO2_MEI` = :sansho_2_mei");
        setList.add("`SANSHO3_NO` = :sansho_3_no");
        setList.add("`SANSHO3_MEI` = :sansho_3_mei");
        setList.add("`BETSU_SANSHO1_ID` = :betsu_sansho_1_id");
        setList.add("`BETSU_SANSHO1_MEI` = :betsu_sansho_1_mei");
        setList.add("`UPDATE_DT` = :update_dt");
        setList.add("`UPDATE_BY` = :update_by");
        setList.add("`DELETE_F` = :delete_f");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ１削除
     * @return 削除件数
     */
    public int delete() {

        // 子の削除
        if (this.tKos != null) {
            for (TKo tKo : this.tKos) {
                tKo.delete();
            }
        }

        // 添付ファイルの削除
        if (this.tTenpuFiles != null) {
            for (TTenpuFile tTenpuFile : this.tTenpuFiles) {
                tTenpuFile.delete();
            }
        }

        // エンティティ３の削除
        if (this.tEntity3 != null) {
            this.tEntity3.delete();
        }

        // エンティティ４の削除
        if (this.tEntity4 != null) {
            this.tEntity4.delete();
        }

        // エンティティ５の削除
        if (this.tEntity5 != null) {
            this.tEntity5.delete();
        }

        // エンティティ１の削除
        String sql = "DELETE FROM t_entity1 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SOSEN_ID` = :sosen_id");
        whereList.add("`OYA_BN` = :oya_bn");
        whereList.add("`ENTITY_BN` = :entity_bn");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", this.sosenId);
        map.put("oya_bn", this.oyaBn);
        map.put("entity_bn", this.entityBn);
        map.put("entity_1_mei", this.entity1Mei);
        map.put("sansho_1_id", this.sansho1Id);
        map.put("sansho_1_mei", this.sansho1Mei);
        map.put("sansho_2_cd", this.sansho2Cd);
        map.put("sansho_2_mei", this.sansho2Mei);
        map.put("sansho_3_no", this.sansho3No);
        map.put("sansho_3_mei", this.sansho3Mei);
        map.put("betsu_sansho_1_id", this.betsuSansho1Id);
        map.put("betsu_sansho_1_mei", this.betsuSansho1Mei);
        map.put("delete_f", this.deleteF);
        map.put("insert_dt", now);
        map.put("insert_by", execId);
        map.put("update_dt", now);
        map.put("update_by", execId);
        return map;
    }

    /** エンティティ３ */
    private TEntity3 tEntity3;

    /** @return エンティティ３ */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntity3")
    public TEntity3 getTEntity3() {
        return this.tEntity3;
    }

    /** @param p エンティティ３ */
    public void setTEntity3(final TEntity3 p) {
        this.tEntity3 = p;
    }

    /** @return エンティティ３ */
    public TEntity3 referTEntity3() {
        if (this.tEntity3 == null) {
            try {
                this.tEntity3 = TEntity3.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tEntity3;
    }

    /** エンティティ４ */
    private TEntity4 tEntity4;

    /** @return エンティティ４ */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntity4")
    public TEntity4 getTEntity4() {
        return this.tEntity4;
    }

    /** @param p エンティティ４ */
    public void setTEntity4(final TEntity4 p) {
        this.tEntity4 = p;
    }

    /** @return エンティティ４ */
    public TEntity4 referTEntity4() {
        if (this.tEntity4 == null) {
            try {
                this.tEntity4 = TEntity4.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tEntity4;
    }

    /** エンティティ５ */
    private TEntity5 tEntity5;

    /** @return エンティティ５ */
    @com.fasterxml.jackson.annotation.JsonProperty("TEntity5")
    public TEntity5 getTEntity5() {
        return this.tEntity5;
    }

    /** @param p エンティティ５ */
    public void setTEntity5(final TEntity5 p) {
        this.tEntity5 = p;
    }

    /** @return エンティティ５ */
    public TEntity5 referTEntity5() {
        if (this.tEntity5 == null) {
            try {
                this.tEntity5 = TEntity5.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tEntity5;
    }

    /** 子のリスト */
    private List<TKo> tKos;

    /** @return 子のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TKos")
    public List<TKo> getTKos() {
        return this.tKos;
    }

    /** @param list 子のリスト */
    public void setTKos(final List<TKo> list) {
        this.tKos = list;
    }

    /** @param tKo */
    public void addTKos(final TKo tKo) {
        if (this.tKos == null) {
            this.tKos = new ArrayList<TKo>();
        }
        this.tKos.add(tKo);
    }

    /** @return 子のリスト */
    public List<TKo> referTKos() {
        if (this.tKos == null) {
            this.tKos = TEntity1.referTKos(this.sosenId, this.oyaBn, this.entityBn);
        }
        return this.tKos;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @param param3 entityBn
     * @return List<TKo>
     */
    public static List<TKo> referTKos(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        whereList.add("ENTITY_BN = :entity_bn");
        String sql = "SELECT * FROM t_ko WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.select(sql, map, TKo.class, null, null);
    }

    /** 添付ファイルのリスト */
    private List<TTenpuFile> tTenpuFiles;

    /** @return 添付ファイルのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("TTenpuFiles")
    public List<TTenpuFile> getTTenpuFiles() {
        return this.tTenpuFiles;
    }

    /** @param list 添付ファイルのリスト */
    public void setTTenpuFiles(final List<TTenpuFile> list) {
        this.tTenpuFiles = list;
    }

    /** @param tTenpuFile */
    public void addTTenpuFiles(final TTenpuFile tTenpuFile) {
        if (this.tTenpuFiles == null) {
            this.tTenpuFiles = new ArrayList<TTenpuFile>();
        }
        this.tTenpuFiles.add(tTenpuFile);
    }

    /** @return 添付ファイルのリスト */
    public List<TTenpuFile> referTTenpuFiles() {
        if (this.tTenpuFiles == null) {
            this.tTenpuFiles = TEntity1.referTTenpuFiles(this.sosenId, this.oyaBn, this.entityBn);
        }
        return this.tTenpuFiles;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @param param3 entityBn
     * @return List<TTenpuFile>
     */
    public static List<TTenpuFile> referTTenpuFiles(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        whereList.add("ENTITY_BN = :entity_bn");
        String sql = "SELECT * FROM t_tenpu_file WHERE " + String.join(" AND ", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.select(sql, map, TTenpuFile.class, null, null);
    }
}
