package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 複合
 * @author emarfkrow
 */
public class Tb8Fukugo implements IEntity {

    /** SlickGridのDataView用ID */
    private Integer id;

    /** @return id */
    public final Integer getId() {
        return id;
    }

    /** @param o id */
    public final void setId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.id = Integer.valueOf(o.toString());
        } else {
            this.id = null;
        }
    }

    /** 参照ID */
    private Integer sanshoId;

    /** @return 参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO_ID")
    public Integer getSanshoId() {
        return this.sanshoId;
    }

    /** @param o 参照ID */
    public void setSanshoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.sanshoId = Integer.valueOf(o.toString());
        } else {
            this.sanshoId = null;
        }
    }

    /** 参照ID参照 */
    private String sanshoMei;

    /** @return 参照ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("SANSHO_MEI")
    public String getSanshoMei() {
        return this.sanshoMei;
    }

    /** @param o 参照ID参照 */
    public void setSanshoMei(final Object o) {
        if (o != null) {
            this.sanshoMei = o.toString();
        } else {
            this.sanshoMei = null;
        }
    }

    /** 制約ID */
    private Integer seiyakuId;

    /** @return 制約ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SEIYAKU_ID")
    public Integer getSeiyakuId() {
        return this.seiyakuId;
    }

    /** @param o 制約ID */
    public void setSeiyakuId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.seiyakuId = Integer.valueOf(o.toString());
        } else {
            this.seiyakuId = null;
        }
    }

    /** 制約ID参照 */
    private String seiyakuMei;

    /** @return 制約ID参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("SEIYAKU_MEI")
    public String getSeiyakuMei() {
        return this.seiyakuMei;
    }

    /** @param o 制約ID参照 */
    public void setSeiyakuMei(final Object o) {
        if (o != null) {
            this.seiyakuMei = o.toString();
        } else {
            this.seiyakuMei = null;
        }
    }

    /** 適用日 */
    @com.fasterxml.jackson.annotation.JsonFormat(pattern = "yyyy-MM-dd")
    @com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.datatype.jsr310.deser.LocalDateDeserializer.class)
    @com.fasterxml.jackson.databind.annotation.JsonSerialize(using = com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer.class)
    private java.time.LocalDate tekiyoBi;

    /** @return 適用日 */
    @com.fasterxml.jackson.annotation.JsonProperty("TEKIYO_BI")
    public java.time.LocalDate getTekiyoBi() {
        return this.tekiyoBi;
    }

    /** @param o 適用日 */
    public void setTekiyoBi(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.tekiyoBi = java.time.LocalDate.parse(o.toString().substring(0, 10));
        } else {
            this.tekiyoBi = null;
        }
    }

    /** 複合情報 */
    private String fukugoInfo;

    /** @return 複合情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("FUKUGO_INFO")
    public String getFukugoInfo() {
        return this.fukugoInfo;
    }

    /** @param o 複合情報 */
    public void setFukugoInfo(final Object o) {
        if (o != null) {
            this.fukugoInfo = o.toString();
        } else {
            this.fukugoInfo = null;
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

    /** 作成者参照 */
    private String insertUserSei;

    /** @return 作成者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("INSERT_USER_SEI")
    public String getInsertUserSei() {
        return this.insertUserSei;
    }

    /** @param o 作成者参照 */
    public void setInsertUserSei(final Object o) {
        if (o != null) {
            this.insertUserSei = o.toString();
        } else {
            this.insertUserSei = null;
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

    /** 更新者参照 */
    private String updateUserSei;

    /** @return 更新者参照 */
    @com.fasterxml.jackson.annotation.JsonProperty("UPDATE_USER_SEI")
    public String getUpdateUserSei() {
        return this.updateUserSei;
    }

    /** @param o 更新者参照 */
    public void setUpdateUserSei(final Object o) {
        if (o != null) {
            this.updateUserSei = o.toString();
        } else {
            this.updateUserSei = null;
        }
    }

    /**
     * 複合照会
     * @param param1 参照ID
     * @param param2 制約ID
     * @param param3 適用日
     * @return 複合
     */
    public static Tb8Fukugo get(final Object param1, final Object param2, final Object param3) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SANSHO_ID` = :sansho_id");
        whereList.add("`SEIYAKU_ID` = :seiyaku_id");
        whereList.add("`TEKIYO_BI` = :tekiyo_bi");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SANSHO_ID` \n";
        sql += "    , a.`SEIYAKU_ID` \n";
        sql += "    , a.`TEKIYO_BI` AS TEKIYO_BI \n";
        sql += "    , a.`FUKUGO_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB8_FUKUGO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sansho_id", param1);
        map.put("seiyaku_id", param2);
        map.put("tekiyo_bi", param3);
        return Queries.get(sql, map, Tb8Fukugo.class);
    }

    /**
     * 複合追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 複合の登録
        String sql = "INSERT INTO TB8_FUKUGO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SANSHO_ID` -- :sansho_id");
        nameList.add("`SEIYAKU_ID` -- :seiyaku_id");
        nameList.add("`TEKIYO_BI` -- :tekiyo_bi");
        nameList.add("`FUKUGO_INFO` -- :fukugo_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":sansho_id");
        valueList.add(":seiyaku_id");
        valueList.add(":tekiyo_bi");
        valueList.add(":fukugo_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /**
     * 複合更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 複合の登録
        String sql = "UPDATE TB8_FUKUGO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SANSHO_ID` = :sansho_id");
        setList.add("`SEIYAKU_ID` = :seiyaku_id");
        setList.add("`TEKIYO_BI` = :tekiyo_bi");
        setList.add("`FUKUGO_INFO` = :fukugo_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 複合削除
     * @return 削除件数
     */
    public int delete() {

        // 複合の削除
        String sql = "DELETE FROM TB8_FUKUGO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SANSHO_ID` = :sansho_id");
        whereList.add("`SEIYAKU_ID` = :seiyaku_id");
        whereList.add("`TEKIYO_BI` = :tekiyo_bi");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("sansho_id", this.sanshoId);
        map.put("seiyaku_id", this.seiyakuId);
        map.put("tekiyo_bi", this.tekiyoBi);
        map.put("fukugo_info", this.fukugoInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
