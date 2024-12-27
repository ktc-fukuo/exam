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
public class Tb1Entity1 implements IEntity {

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

    /** 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime insertTs;

    /** @return 作成タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_TS")
    public java.time.LocalDateTime getInsertTs() {
        return this.insertTs;
    }

    /** @param o 作成タイムスタンプ */
    public void setInsertTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.insertTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.insertTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.insertTs = null;
        }
    }

    /** 作成者 */
    private Integer insertUserId;

    /** @return 作成者 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_ID")
    public Integer getInsertUserId() {
        return this.insertUserId;
    }

    /** @param o 作成者 */
    public void setInsertUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.insertUserId = Integer.valueOf(o.toString());
        } else {
            this.insertUserId = null;
        }
    }

    /** 更新タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateTimeSerializer.class)
    private java.time.LocalDateTime updateTs;

    /** @return 更新タイムスタンプ */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_TS")
    public java.time.LocalDateTime getUpdateTs() {
        return this.updateTs;
    }

    /** @param o 更新タイムスタンプ */
    public void setUpdateTs(final Object o) {
        if (o != null && o instanceof Long) {
            java.util.Date d = new java.util.Date((Long) o);
            this.updateTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (o != null && o.toString().matches("^[0-9]+")) {
            java.util.Date d = new java.util.Date(Long.valueOf(o.toString()));
            this.updateTs = java.time.LocalDateTime.ofInstant(d.toInstant(), java.time.ZoneId.systemDefault());
        } else if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateTs = java.time.LocalDateTime.parse(o.toString().replace(" ", "T").replace("/", "-"));
        } else {
            this.updateTs = null;
        }
    }

    /** 更新者 */
    private Integer updateUserId;

    /** @return 更新者 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_ID")
    public Integer getUpdateUserId() {
        return this.updateUserId;
    }

    /** @param o 更新者 */
    public void setUpdateUserId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.updateUserId = Integer.valueOf(o.toString());
        } else {
            this.updateUserId = null;
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

    /** ステータス区分 */
    private String statusKb;

    /** @return ステータス区分 */
    @com.fasterxml.jackson.annotation.JsonProperty("STATUS_KB")
    public String getStatusKb() {
        return this.statusKb;
    }

    /** @param o ステータス区分 */
    public void setStatusKb(final Object o) {
        if (o != null) {
            this.statusKb = o.toString();
        } else {
            this.statusKb = null;
        }
    }

    /**
     * エンティティ１照会
     * @param param1 祖先ID
     * @param param2 親枝番
     * @param param3 エンティティ枝番
     * @return エンティティ１
     */
    public static Tb1Entity1 get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SOSEN_ID\" = :sosen_id");
        whereList.add("\"OYA_BN\" = :oya_bn");
        whereList.add("\"ENTITY_BN\" = :entity_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.\"SOSEN_ID\" \n";
        sql += "    , a.\"OYA_BN\" \n";
        sql += "    , a.\"ENTITY_BN\" \n";
        sql += "    , a.\"ENTITY1_MEI\" \n";
        sql += "    , a.\"SANSHO1_ID\" \n";
        sql += "    , a.\"SANSHO1_MEI\" \n";
        sql += "    , RTRIM (RTRIM (a.\"SANSHO2_CD\"), '　') AS SANSHO2_CD \n";
        sql += "    , a.\"SANSHO2_MEI\" \n";
        sql += "    , RTRIM (RTRIM (a.\"SANSHO3_NO\"), '　') AS SANSHO3_NO \n";
        sql += "    , a.\"SANSHO3_MEI\" \n";
        sql += "    , a.\"BETSU_SANSHO1_ID\" \n";
        sql += "    , a.\"BETSU_SANSHO1_MEI\" \n";
        sql += "    , TO_CHAR (a.\"INSERT_TS\", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS \n";
        sql += "    , a.\"INSERT_USER_ID\" \n";
        sql += "    , TO_CHAR (a.\"UPDATE_TS\", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS \n";
        sql += "    , a.\"UPDATE_USER_ID\" \n";
        sql += "    , RTRIM (RTRIM (a.\"DELETE_F\"), '　') AS DELETE_F \n";
        sql += "    , a.\"STATUS_KB\" \n";
        sql += "FROM \n";
        sql += "    TB1_ENTITY1 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.get(sql, map, Tb1Entity1.class);
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
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                tb1Ko.setSosenId(this.getSosenId());
                tb1Ko.setOyaBn(this.getOyaBn());
                tb1Ko.setEntityBn(this.getEntityBn());
                tb1Ko.insert(now, execId);
            }
        }

        // 添付ファイルの登録
        if (this.tb1TenpuFiles != null) {
            for (Tb1TenpuFile tb1TenpuFile : this.tb1TenpuFiles) {
                tb1TenpuFile.setSosenId(this.getSosenId());
                tb1TenpuFile.setOyaBn(this.getOyaBn());
                tb1TenpuFile.setEntityBn(this.getEntityBn());
                tb1TenpuFile.insert(now, execId);
            }
        }

        // エンティティ２の登録
        if (this.tb1Entity2 != null) {
            this.tb1Entity2.setSosenId(this.getSosenId());
            this.tb1Entity2.setOyaBn(this.getOyaBn());
            this.tb1Entity2.setEntityBn(this.getEntityBn());
            this.tb1Entity2.insert(now, execId);
        }

        // エンティティ３の登録
        if (this.tb1Entity3 != null) {
            this.tb1Entity3.setSosenId(this.getSosenId());
            this.tb1Entity3.setOyaBn(this.getOyaBn());
            this.tb1Entity3.setEntityBn(this.getEntityBn());
            this.tb1Entity3.insert(now, execId);
        }

        // エンティティ４の登録
        if (this.tb1Entity4 != null) {
            this.tb1Entity4.setSosenId(this.getSosenId());
            this.tb1Entity4.setOyaBn(this.getOyaBn());
            this.tb1Entity4.setEntityBn(this.getEntityBn());
            this.tb1Entity4.insert(now, execId);
        }

        // エンティティ５の登録
        if (this.tb1Entity5 != null) {
            this.tb1Entity5.setSosenId(this.getSosenId());
            this.tb1Entity5.setOyaBn(this.getOyaBn());
            this.tb1Entity5.setEntityBn(this.getEntityBn());
            this.tb1Entity5.insert(now, execId);
        }

        // エンティティ１履歴の登録
        Tb1Entity1His tb1Entity1His = new Tb1Entity1His();
        tb1Entity1His.setSosenId(this.sosenId);
        tb1Entity1His.setOyaBn(this.oyaBn);
        tb1Entity1His.setEntityBn(this.entityBn);
        tb1Entity1His.setEntity1Mei(this.entity1Mei);
        tb1Entity1His.setSansho1Id(this.sansho1Id);
        tb1Entity1His.setSansho1Mei(this.sansho1Mei);
        tb1Entity1His.setSansho2Cd(this.sansho2Cd);
        tb1Entity1His.setSansho2Mei(this.sansho2Mei);
        tb1Entity1His.setSansho3No(this.sansho3No);
        tb1Entity1His.setSansho3Mei(this.sansho3Mei);
        tb1Entity1His.setBetsuSansho1Id(this.betsuSansho1Id);
        tb1Entity1His.setBetsuSansho1Mei(this.betsuSansho1Mei);
        tb1Entity1His.setInsertTs(this.insertTs);
        tb1Entity1His.setInsertUserId(this.insertUserId);
        tb1Entity1His.setUpdateTs(this.updateTs);
        tb1Entity1His.setUpdateUserId(this.updateUserId);
        tb1Entity1His.setDeleteF(this.deleteF);
        tb1Entity1His.setStatusKb(this.statusKb);
        tb1Entity1His.insert(now, execId);

        // エンティティ１の登録
        String sql = "INSERT INTO TB1_ENTITY1(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("\"SOSEN_ID\" -- :sosen_id");
        nameList.add("\"OYA_BN\" -- :oya_bn");
        nameList.add("\"ENTITY_BN\" -- :entity_bn");
        nameList.add("\"ENTITY1_MEI\" -- :entity_1_mei");
        nameList.add("\"SANSHO1_ID\" -- :sansho_1_id");
        nameList.add("\"SANSHO1_MEI\" -- :sansho_1_mei");
        nameList.add("\"SANSHO2_CD\" -- :sansho_2_cd");
        nameList.add("\"SANSHO2_MEI\" -- :sansho_2_mei");
        nameList.add("\"SANSHO3_NO\" -- :sansho_3_no");
        nameList.add("\"SANSHO3_MEI\" -- :sansho_3_mei");
        nameList.add("\"BETSU_SANSHO1_ID\" -- :betsu_sansho_1_id");
        nameList.add("\"BETSU_SANSHO1_MEI\" -- :betsu_sansho_1_mei");
        nameList.add("\"INSERT_TS\" -- :insert_ts");
        nameList.add("\"INSERT_USER_ID\" -- :insert_user_id");
        nameList.add("\"UPDATE_TS\" -- :update_ts");
        nameList.add("\"UPDATE_USER_ID\" -- :update_user_id");
        nameList.add("\"DELETE_F\" -- :delete_f");
        nameList.add("\"STATUS_KB\" -- :status_kb");
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
        valueList.add("TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')");
        valueList.add(":insert_user_id");
        valueList.add("TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** エンティティ枝番の採番処理 */
    private void numbering() {
        if (this.entityBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.\"ENTITY_BN\") IS NULL THEN 0 ELSE MAX(e.\"ENTITY_BN\") * 1 END + 1 AS \"ENTITY_BN\" FROM TB1_ENTITY1 e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.\"SOSEN_ID\" = :sosen_id");
        whereList.add("e.\"OYA_BN\" = :oya_bn");
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
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                if (tb1Ko == null) {
                    continue;
                }
                tb1Ko.setSosenId(this.sosenId);
                tb1Ko.setOyaBn(this.oyaBn);
                tb1Ko.setEntityBn(this.entityBn);
                try {
                    tb1Ko.insert(now, execId);
                } catch (Exception e) {
                    tb1Ko.update(now, execId);
                }
            }
        }

        // 添付ファイルの登録
        if (this.tb1TenpuFiles != null) {
            for (Tb1TenpuFile tb1TenpuFile : this.tb1TenpuFiles) {
                if (tb1TenpuFile == null) {
                    continue;
                }
                tb1TenpuFile.setSosenId(this.sosenId);
                tb1TenpuFile.setOyaBn(this.oyaBn);
                tb1TenpuFile.setEntityBn(this.entityBn);
                try {
                    tb1TenpuFile.insert(now, execId);
                } catch (Exception e) {
                    tb1TenpuFile.update(now, execId);
                }
            }
        }

        // エンティティ２の登録
        if (this.tb1Entity2 != null) {
            tb1Entity2.setSosenId(this.getSosenId());
            tb1Entity2.setOyaBn(this.getOyaBn());
            tb1Entity2.setEntityBn(this.getEntityBn());
            try {
                tb1Entity2.insert(now, execId);
            } catch (Exception e) {
                tb1Entity2.update(now, execId);
            }
        }

        // エンティティ３の登録
        if (this.tb1Entity3 != null) {
            tb1Entity3.setSosenId(this.getSosenId());
            tb1Entity3.setOyaBn(this.getOyaBn());
            tb1Entity3.setEntityBn(this.getEntityBn());
            try {
                tb1Entity3.insert(now, execId);
            } catch (Exception e) {
                tb1Entity3.update(now, execId);
            }
        }

        // エンティティ４の登録
        if (this.tb1Entity4 != null) {
            tb1Entity4.setSosenId(this.getSosenId());
            tb1Entity4.setOyaBn(this.getOyaBn());
            tb1Entity4.setEntityBn(this.getEntityBn());
            try {
                tb1Entity4.insert(now, execId);
            } catch (Exception e) {
                tb1Entity4.update(now, execId);
            }
        }

        // エンティティ５の登録
        if (this.tb1Entity5 != null) {
            tb1Entity5.setSosenId(this.getSosenId());
            tb1Entity5.setOyaBn(this.getOyaBn());
            tb1Entity5.setEntityBn(this.getEntityBn());
            try {
                tb1Entity5.insert(now, execId);
            } catch (Exception e) {
                tb1Entity5.update(now, execId);
            }
        }

        // エンティティ１履歴の登録
        Tb1Entity1His tb1Entity1His = new Tb1Entity1His();
        tb1Entity1His.setSosenId(this.sosenId);
        tb1Entity1His.setOyaBn(this.oyaBn);
        tb1Entity1His.setEntityBn(this.entityBn);
        tb1Entity1His.setEntity1Mei(this.entity1Mei);
        tb1Entity1His.setSansho1Id(this.sansho1Id);
        tb1Entity1His.setSansho1Mei(this.sansho1Mei);
        tb1Entity1His.setSansho2Cd(this.sansho2Cd);
        tb1Entity1His.setSansho2Mei(this.sansho2Mei);
        tb1Entity1His.setSansho3No(this.sansho3No);
        tb1Entity1His.setSansho3Mei(this.sansho3Mei);
        tb1Entity1His.setBetsuSansho1Id(this.betsuSansho1Id);
        tb1Entity1His.setBetsuSansho1Mei(this.betsuSansho1Mei);
        tb1Entity1His.setInsertTs(this.insertTs);
        tb1Entity1His.setInsertUserId(this.insertUserId);
        tb1Entity1His.setUpdateTs(this.updateTs);
        tb1Entity1His.setUpdateUserId(this.updateUserId);
        tb1Entity1His.setDeleteF(this.deleteF);
        tb1Entity1His.setStatusKb(this.statusKb);
        tb1Entity1His.insert(now, execId);

        // エンティティ１の登録
        String sql = "UPDATE TB1_ENTITY1\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("\"SOSEN_ID\" = :sosen_id");
        setList.add("\"OYA_BN\" = :oya_bn");
        setList.add("\"ENTITY_BN\" = :entity_bn");
        setList.add("\"ENTITY1_MEI\" = :entity_1_mei");
        setList.add("\"SANSHO1_ID\" = :sansho_1_id");
        setList.add("\"SANSHO1_MEI\" = :sansho_1_mei");
        setList.add("\"SANSHO2_CD\" = :sansho_2_cd");
        setList.add("\"SANSHO2_MEI\" = :sansho_2_mei");
        setList.add("\"SANSHO3_NO\" = :sansho_3_no");
        setList.add("\"SANSHO3_MEI\" = :sansho_3_mei");
        setList.add("\"BETSU_SANSHO1_ID\" = :betsu_sansho_1_id");
        setList.add("\"BETSU_SANSHO1_MEI\" = :betsu_sansho_1_mei");
        setList.add("\"UPDATE_TS\" = TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')");
        setList.add("\"UPDATE_USER_ID\" = :update_user_id");
        setList.add("\"DELETE_F\" = :delete_f");
        setList.add("\"STATUS_KB\" = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * エンティティ１削除
     * @return 削除件数
     */
    public int delete() {

        // 子の削除
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                tb1Ko.delete();
            }
        }

        // 添付ファイルの削除
        if (this.tb1TenpuFiles != null) {
            for (Tb1TenpuFile tb1TenpuFile : this.tb1TenpuFiles) {
                tb1TenpuFile.delete();
            }
        }

        // エンティティ２の削除
        if (this.tb1Entity2 != null) {
            this.tb1Entity2.delete();
        }

        // エンティティ３の削除
        if (this.tb1Entity3 != null) {
            this.tb1Entity3.delete();
        }

        // エンティティ４の削除
        if (this.tb1Entity4 != null) {
            this.tb1Entity4.delete();
        }

        // エンティティ５の削除
        if (this.tb1Entity5 != null) {
            this.tb1Entity5.delete();
        }

        // エンティティ１の削除
        String sql = "DELETE FROM TB1_ENTITY1 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("\"SOSEN_ID\" = :sosen_id");
        whereList.add("\"OYA_BN\" = :oya_bn");
        whereList.add("\"ENTITY_BN\" = :entity_bn");
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
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** エンティティ２ */
    private Tb1Entity2 tb1Entity2;

    /** @return エンティティ２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity2")
    public Tb1Entity2 getTb1Entity2() {
        return this.tb1Entity2;
    }

    /** @param p エンティティ２ */
    public void setTb1Entity2(final Tb1Entity2 p) {
        this.tb1Entity2 = p;
    }

    /** @return エンティティ２ */
    public Tb1Entity2 referTb1Entity2() {
        if (this.tb1Entity2 == null) {
            try {
                this.tb1Entity2 = Tb1Entity2.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity2;
    }

    /** エンティティ３ */
    private Tb1Entity3 tb1Entity3;

    /** @return エンティティ３ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity3")
    public Tb1Entity3 getTb1Entity3() {
        return this.tb1Entity3;
    }

    /** @param p エンティティ３ */
    public void setTb1Entity3(final Tb1Entity3 p) {
        this.tb1Entity3 = p;
    }

    /** @return エンティティ３ */
    public Tb1Entity3 referTb1Entity3() {
        if (this.tb1Entity3 == null) {
            try {
                this.tb1Entity3 = Tb1Entity3.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity3;
    }

    /** エンティティ４ */
    private Tb1Entity4 tb1Entity4;

    /** @return エンティティ４ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity4")
    public Tb1Entity4 getTb1Entity4() {
        return this.tb1Entity4;
    }

    /** @param p エンティティ４ */
    public void setTb1Entity4(final Tb1Entity4 p) {
        this.tb1Entity4 = p;
    }

    /** @return エンティティ４ */
    public Tb1Entity4 referTb1Entity4() {
        if (this.tb1Entity4 == null) {
            try {
                this.tb1Entity4 = Tb1Entity4.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity4;
    }

    /** エンティティ５ */
    private Tb1Entity5 tb1Entity5;

    /** @return エンティティ５ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Entity5")
    public Tb1Entity5 getTb1Entity5() {
        return this.tb1Entity5;
    }

    /** @param p エンティティ５ */
    public void setTb1Entity5(final Tb1Entity5 p) {
        this.tb1Entity5 = p;
    }

    /** @return エンティティ５ */
    public Tb1Entity5 referTb1Entity5() {
        if (this.tb1Entity5 == null) {
            try {
                this.tb1Entity5 = Tb1Entity5.get(this.sosenId, this.oyaBn, this.entityBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb1Entity5;
    }

    /** 子のリスト */
    private List<Tb1Ko> tb1Kos;

    /** @return 子のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Kos")
    public List<Tb1Ko> getTb1Kos() {
        return this.tb1Kos;
    }

    /** @param list 子のリスト */
    public void setTb1Kos(final List<Tb1Ko> list) {
        this.tb1Kos = list;
    }

    /** @param tb1Ko */
    public void addTb1Kos(final Tb1Ko tb1Ko) {
        if (this.tb1Kos == null) {
            this.tb1Kos = new ArrayList<Tb1Ko>();
        }
        this.tb1Kos.add(tb1Ko);
    }

    /** @return 子のリスト */
    public List<Tb1Ko> referTb1Kos() {
        this.tb1Kos = Tb1Entity1.referTb1Kos(this.sosenId, this.oyaBn, this.entityBn);
        return this.tb1Kos;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @param param3 entityBn
     * @return List<Tb1Ko>
     */
    public static List<Tb1Ko> referTb1Kos(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        whereList.add("ENTITY_BN = :entity_bn");
        String sql = "SELECT * FROM TB1_KO WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN, KO_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.select(sql, map, Tb1Ko.class, null, null);
    }

    /** 添付ファイルのリスト */
    private List<Tb1TenpuFile> tb1TenpuFiles;

    /** @return 添付ファイルのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1TenpuFiles")
    public List<Tb1TenpuFile> getTb1TenpuFiles() {
        return this.tb1TenpuFiles;
    }

    /** @param list 添付ファイルのリスト */
    public void setTb1TenpuFiles(final List<Tb1TenpuFile> list) {
        this.tb1TenpuFiles = list;
    }

    /** @param tb1TenpuFile */
    public void addTb1TenpuFiles(final Tb1TenpuFile tb1TenpuFile) {
        if (this.tb1TenpuFiles == null) {
            this.tb1TenpuFiles = new ArrayList<Tb1TenpuFile>();
        }
        this.tb1TenpuFiles.add(tb1TenpuFile);
    }

    /** @return 添付ファイルのリスト */
    public List<Tb1TenpuFile> referTb1TenpuFiles() {
        this.tb1TenpuFiles = Tb1Entity1.referTb1TenpuFiles(this.sosenId, this.oyaBn, this.entityBn);
        return this.tb1TenpuFiles;
    }

    /**
     * @param param1 sosenId
     * @param param2 oyaBn
     * @param param3 entityBn
     * @return List<Tb1TenpuFile>
     */
    public static List<Tb1TenpuFile> referTb1TenpuFiles(final Integer param1, final Integer param2, final Integer param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("SOSEN_ID = :sosen_id");
        whereList.add("OYA_BN = :oya_bn");
        whereList.add("ENTITY_BN = :entity_bn");
        String sql = "SELECT * FROM TB1_TENPU_FILE WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "SOSEN_ID, OYA_BN, ENTITY_BN, TENPU_FILE_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sosen_id", param1);
        map.put("oya_bn", param2);
        map.put("entity_bn", param3);
        return Queries.select(sql, map, Tb1TenpuFile.class, null, null);
    }
}
