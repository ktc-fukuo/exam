package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * ID参照マスタ
 * @author emarfkrow
 */
public class Mb4Idsansho implements IEntity {

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

    /** ID参照ID */
    private Integer idrefId;

    /** @return ID参照ID */
    @com.fasterxml.jackson.annotation.JsonProperty("IDREF_ID")
    public Integer getIdrefId() {
        return this.idrefId;
    }

    /** @param o ID参照ID */
    public void setIdrefId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.idrefId = Integer.valueOf(o.toString());
        } else {
            this.idrefId = null;
        }
    }

    /** ID参照名 */
    private String idrefMei;

    /** @return ID参照名 */
    @com.fasterxml.jackson.annotation.JsonProperty("IDREF_MEI")
    public String getIdrefMei() {
        return this.idrefMei;
    }

    /** @param o ID参照名 */
    public void setIdrefMei(final Object o) {
        if (o != null) {
            this.idrefMei = o.toString();
        } else {
            this.idrefMei = null;
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
     * ID参照マスタ照会
     * @param param1 ID参照ID
     * @return ID参照マスタ
     */
    public static Mb4Idsansho get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`IDREF_ID` = :idref_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`IDREF_ID` \n";
        sql += "    , a.`IDREF_MEI` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    MB4_IDSANSHO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("idref_id", param1);
        return Queries.get(sql, map, Mb4Idsansho.class);
    }

    /**
     * ID参照マスタ追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // ID参照IDの採番処理
        numbering();

        // IDBN参照マスタの登録
        if (this.mb4Idbns != null) {
            for (Mb4Idbn mb4Idbn : this.mb4Idbns) {
                if (mb4Idbn != null) {
                    mb4Idbn.setIdrefId(this.getIdrefId());
                }
                mb4Idbn.insert(now, execId);
            }
        }

        // ID参照マスタの登録
        String sql = "INSERT INTO MB4_IDSANSHO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`IDREF_ID` -- :idref_id");
        nameList.add("`IDREF_MEI` -- :idref_mei");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":idref_id");
        valueList.add(":idref_mei");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** ID参照IDの採番処理 */
    private void numbering() {
        if (this.idrefId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`IDREF_ID`) IS NULL THEN 0 ELSE MAX(e.`IDREF_ID`) * 1 END + 1 AS `IDREF_ID` FROM MB4_IDSANSHO e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("IDREF_ID");
        this.setIdrefId(o);
    }

    /**
     * ID参照マスタ更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // IDBN参照マスタの登録
        if (this.mb4Idbns != null) {
            for (Mb4Idbn mb4Idbn : this.mb4Idbns) {
                if (mb4Idbn == null) {
                    continue;
                }
                mb4Idbn.setIdrefId(this.idrefId);
                try {
                    mb4Idbn.insert(now, execId);
                } catch (Exception e) {
                    mb4Idbn.update(now, execId);
                }
            }
        }

        // ID参照マスタの登録
        String sql = "UPDATE MB4_IDSANSHO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`IDREF_ID` = :idref_id");
        setList.add("`IDREF_MEI` = :idref_mei");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * ID参照マスタ削除
     * @return 削除件数
     */
    public int delete() {

        // IDBN参照マスタの削除
        if (this.mb4Idbns != null) {
            for (Mb4Idbn mb4Idbn : this.mb4Idbns) {
                mb4Idbn.delete();
            }
        }

        // ID参照マスタの削除
        String sql = "DELETE FROM MB4_IDSANSHO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`IDREF_ID` = :idref_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("idref_id", this.idrefId);
        map.put("idref_mei", this.idrefMei);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** IDBN参照マスタのリスト */
    private List<Mb4Idbn> mb4Idbns;

    /** @return IDBN参照マスタのリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Mb4Idbns")
    public List<Mb4Idbn> getMb4Idbns() {
        return this.mb4Idbns;
    }

    /** @param list IDBN参照マスタのリスト */
    public void setMb4Idbns(final List<Mb4Idbn> list) {
        this.mb4Idbns = list;
    }

    /** @param mb4Idbn */
    public void addMb4Idbns(final Mb4Idbn mb4Idbn) {
        if (this.mb4Idbns == null) {
            this.mb4Idbns = new ArrayList<Mb4Idbn>();
        }
        this.mb4Idbns.add(mb4Idbn);
    }

    /** @return IDBN参照マスタのリスト */
    public List<Mb4Idbn> referMb4Idbns() {
        this.mb4Idbns = Mb4Idsansho.referMb4Idbns(this.idrefId);
        return this.mb4Idbns;
    }

    /**
     * @param param1 idrefId
     * @return List<Mb4Idbn>
     */
    public static List<Mb4Idbn> referMb4Idbns(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("IDREF_ID = :idref_id");
        String sql = "SELECT ";
        sql += "`IDREF_ID`";
        sql += ", `IDBN_BN`";
        sql += ", `IDBN_NO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM MB4_IDBN a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "IDREF_ID, IDBN_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("idref_id", param1);
        return Queries.select(sql, map, Mb4Idbn.class, null, null);
    }
}
