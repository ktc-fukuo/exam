package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 集約抑止元１
 * @author emarfkrow
 */
public class Tb7ShuyakuYokushiMoto1 implements IEntity {

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

    /** 集約抑止元１ID */
    private Integer shuyakuYokushiMoto1Id;

    /** @return 集約抑止元１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SHUYAKU_YOKUSHI_MOTO1_ID")
    public Integer getShuyakuYokushiMoto1Id() {
        return this.shuyakuYokushiMoto1Id;
    }

    /** @param o 集約抑止元１ID */
    public void setShuyakuYokushiMoto1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuyakuYokushiMoto1Id = Integer.valueOf(o.toString());
        } else {
            this.shuyakuYokushiMoto1Id = null;
        }
    }

    /** 転生抑止ID */
    private Integer shuyakuYokushiId;

    /** @return 転生抑止ID */
    @com.fasterxml.jackson.annotation.JsonProperty("SHUYAKU_YOKUSHI_ID")
    public Integer getShuyakuYokushiId() {
        return this.shuyakuYokushiId;
    }

    /** @param o 転生抑止ID */
    public void setShuyakuYokushiId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.shuyakuYokushiId = Integer.valueOf(o.toString());
        } else {
            this.shuyakuYokushiId = null;
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
     * 集約抑止元１照会
     * @param param1 集約抑止元１ID
     * @return 集約抑止元１
     */
    public static Tb7ShuyakuYokushiMoto1 get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SHUYAKU_YOKUSHI_MOTO1_ID` = :shuyaku_yokushi_moto_1_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`SHUYAKU_YOKUSHI_MOTO1_ID` \n";
        sql += "    , a.`SHUYAKU_YOKUSHI_ID` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB7_SHUYAKU_YOKUSHI_MOTO1 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("shuyaku_yokushi_moto_1_id", param1);
        return Queries.get(sql, map, Tb7ShuyakuYokushiMoto1.class);
    }

    /**
     * 集約抑止元１追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 集約抑止元１IDの採番処理
        numbering();

        // 集約抑止元１の登録
        String sql = "INSERT INTO TB7_SHUYAKU_YOKUSHI_MOTO1(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`SHUYAKU_YOKUSHI_MOTO1_ID` -- :shuyaku_yokushi_moto_1_id");
        nameList.add("`SHUYAKU_YOKUSHI_ID` -- :shuyaku_yokushi_id");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":shuyaku_yokushi_moto_1_id");
        valueList.add(":shuyaku_yokushi_id");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 集約抑止元１IDの採番処理 */
    private void numbering() {
        if (this.shuyakuYokushiMoto1Id != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`SHUYAKU_YOKUSHI_MOTO1_ID`) IS NULL THEN 0 ELSE MAX(e.`SHUYAKU_YOKUSHI_MOTO1_ID`) * 1 END + 1 AS `SHUYAKU_YOKUSHI_MOTO1_ID` FROM TB7_SHUYAKU_YOKUSHI_MOTO1 e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("SHUYAKU_YOKUSHI_MOTO1_ID");
        this.setShuyakuYokushiMoto1Id(o);
    }

    /**
     * 集約抑止元１更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 集約抑止元１の登録
        String sql = "UPDATE TB7_SHUYAKU_YOKUSHI_MOTO1\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`SHUYAKU_YOKUSHI_MOTO1_ID` = :shuyaku_yokushi_moto_1_id");
        setList.add("`SHUYAKU_YOKUSHI_ID` = :shuyaku_yokushi_id");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 集約抑止元１削除
     * @return 削除件数
     */
    public int delete() {

        // 集約抑止元１の削除
        String sql = "DELETE FROM TB7_SHUYAKU_YOKUSHI_MOTO1 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`SHUYAKU_YOKUSHI_MOTO1_ID` = :shuyaku_yokushi_moto_1_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("shuyaku_yokushi_moto_1_id", this.shuyakuYokushiMoto1Id);
        map.put("shuyaku_yokushi_id", this.shuyakuYokushiId);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }
}
