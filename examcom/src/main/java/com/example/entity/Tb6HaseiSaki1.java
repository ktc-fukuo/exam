package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 派生先１
 * @author emarfkrow
 */
public class Tb6HaseiSaki1 implements IEntity {

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

    /** 派生先１ID */
    private Integer haseiSaki1Id;

    /** @return 派生先１ID */
    @com.fasterxml.jackson.annotation.JsonProperty("HASEI_SAKI1_ID")
    public Integer getHaseiSaki1Id() {
        return this.haseiSaki1Id;
    }

    /** @param o 派生先１ID */
    public void setHaseiSaki1Id(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.haseiSaki1Id = Integer.valueOf(o.toString());
        } else {
            this.haseiSaki1Id = null;
        }
    }

    /** 派生元ID */
    private Integer haseiMotoId;

    /** @return 派生元ID */
    @com.fasterxml.jackson.annotation.JsonProperty("HASEI_MOTO_ID")
    public Integer getHaseiMotoId() {
        return this.haseiMotoId;
    }

    /** @param o 派生元ID */
    public void setHaseiMotoId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.haseiMotoId = Integer.valueOf(o.toString());
        } else {
            this.haseiMotoId = null;
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
     * 派生先１照会
     * @param param1 派生先１ID
     * @return 派生先１
     */
    public static Tb6HaseiSaki1 get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`HASEI_SAKI1_ID` = :hasei_saki_1_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`HASEI_SAKI1_ID` \n";
        sql += "    , a.`HASEI_MOTO_ID` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB6_HASEI_SAKI1 a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hasei_saki_1_id", param1);
        return Queries.get(sql, map, Tb6HaseiSaki1.class);
    }

    /**
     * 派生先１追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 派生先１IDの採番処理
        numbering();

        // 派生先１明細の登録
        if (this.tb6HaseiSaki1Dets != null) {
            for (Tb6HaseiSaki1Det tb6HaseiSaki1Det : this.tb6HaseiSaki1Dets) {
                if (tb6HaseiSaki1Det != null) {
                    tb6HaseiSaki1Det.setHaseiSaki1Id(this.getHaseiSaki1Id());
                }
                tb6HaseiSaki1Det.insert(now, execId);
            }
        }

        // 派生先１の登録
        String sql = "INSERT INTO TB6_HASEI_SAKI1(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`HASEI_SAKI1_ID` -- :hasei_saki_1_id");
        nameList.add("`HASEI_MOTO_ID` -- :hasei_moto_id");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":hasei_saki_1_id");
        valueList.add(":hasei_moto_id");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 派生先１IDの採番処理 */
    private void numbering() {
        if (this.haseiSaki1Id != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`HASEI_SAKI1_ID`) IS NULL THEN 0 ELSE MAX(e.`HASEI_SAKI1_ID`) * 1 END + 1 AS `HASEI_SAKI1_ID` FROM TB6_HASEI_SAKI1 e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("HASEI_SAKI1_ID");
        this.setHaseiSaki1Id(o);
    }

    /**
     * 派生先１更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 派生先１明細の登録
        if (this.tb6HaseiSaki1Dets != null) {
            for (Tb6HaseiSaki1Det tb6HaseiSaki1Det : this.tb6HaseiSaki1Dets) {
                if (tb6HaseiSaki1Det == null) {
                    continue;
                }
                tb6HaseiSaki1Det.setHaseiSaki1Id(this.haseiSaki1Id);
                try {
                    tb6HaseiSaki1Det.insert(now, execId);
                } catch (Exception e) {
                    tb6HaseiSaki1Det.update(now, execId);
                }
            }
        }

        // 派生先１の登録
        String sql = "UPDATE TB6_HASEI_SAKI1\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`HASEI_SAKI1_ID` = :hasei_saki_1_id");
        setList.add("`HASEI_MOTO_ID` = :hasei_moto_id");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 派生先１削除
     * @return 削除件数
     */
    public int delete() {

        // 派生先１明細の削除
        if (this.tb6HaseiSaki1Dets != null) {
            for (Tb6HaseiSaki1Det tb6HaseiSaki1Det : this.tb6HaseiSaki1Dets) {
                tb6HaseiSaki1Det.delete();
            }
        }

        // 派生先１の削除
        String sql = "DELETE FROM TB6_HASEI_SAKI1 WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`HASEI_SAKI1_ID` = :hasei_saki_1_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hasei_saki_1_id", this.haseiSaki1Id);
        map.put("hasei_moto_id", this.haseiMotoId);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 派生先１明細のリスト */
    private List<Tb6HaseiSaki1Det> tb6HaseiSaki1Dets;

    /** @return 派生先１明細のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb6HaseiSaki1Dets")
    public List<Tb6HaseiSaki1Det> getTb6HaseiSaki1Dets() {
        return this.tb6HaseiSaki1Dets;
    }

    /** @param list 派生先１明細のリスト */
    public void setTb6HaseiSaki1Dets(final List<Tb6HaseiSaki1Det> list) {
        this.tb6HaseiSaki1Dets = list;
    }

    /** @param tb6HaseiSaki1Det */
    public void addTb6HaseiSaki1Dets(final Tb6HaseiSaki1Det tb6HaseiSaki1Det) {
        if (this.tb6HaseiSaki1Dets == null) {
            this.tb6HaseiSaki1Dets = new ArrayList<Tb6HaseiSaki1Det>();
        }
        this.tb6HaseiSaki1Dets.add(tb6HaseiSaki1Det);
    }

    /** @return 派生先１明細のリスト */
    public List<Tb6HaseiSaki1Det> referTb6HaseiSaki1Dets() {
        this.tb6HaseiSaki1Dets = Tb6HaseiSaki1.referTb6HaseiSaki1Dets(this.haseiSaki1Id);
        return this.tb6HaseiSaki1Dets;
    }

    /**
     * @param param1 haseiSaki1Id
     * @return List<Tb6HaseiSaki1Det>
     */
    public static List<Tb6HaseiSaki1Det> referTb6HaseiSaki1Dets(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("HASEI_SAKI1_ID = :hasei_saki_1_id");
        String sql = "SELECT ";
        sql += "`HASEI_SAKI1_ID`";
        sql += ", `HASEI_SAKI1_BN`";
        sql += ", `HASEI_SAKI1_DET_INFO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM TB6_HASEI_SAKI1_DET a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "HASEI_SAKI1_ID, HASEI_SAKI1_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("hasei_saki_1_id", param1);
        return Queries.select(sql, map, Tb6HaseiSaki1Det.class, null, null);
    }
}
