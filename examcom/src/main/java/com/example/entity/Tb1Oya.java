package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 親
 * @author emarfkrow
 */
public class Tb1Oya implements IEntity {

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

    /** 親ID */
    private Integer oyaId;

    /** @return 親ID */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_ID")
    public Integer getOyaId() {
        return this.oyaId;
    }

    /** @param o 親ID */
    public void setOyaId(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.oyaId = Integer.valueOf(o.toString());
        } else {
            this.oyaId = null;
        }
    }

    /** 親情報 */
    private String oyaInfo;

    /** @return 親情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("OYA_INFO")
    public String getOyaInfo() {
        return this.oyaInfo;
    }

    /** @param o 親情報 */
    public void setOyaInfo(final Object o) {
        if (o != null) {
            this.oyaInfo = o.toString();
        } else {
            this.oyaInfo = null;
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
     * 親照会
     * @param param1 親ID
     * @return 親
     */
    public static Tb1Oya get(final Object param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`OYA_ID` = :oya_id");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`OYA_ID` \n";
        sql += "    , a.`OYA_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "FROM \n";
        sql += "    TB1_OYA a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", param1);
        return Queries.get(sql, map, Tb1Oya.class);
    }

    /**
     * 親追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 親IDの採番処理
        numbering();

        // 子の登録
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                if (tb1Ko != null) {
                    tb1Ko.setOyaId(this.getOyaId());
                }
                tb1Ko.insert(now, execId);
            }
        }

        // 子２の登録
        if (this.tb1Ko2s != null) {
            for (Tb1Ko2 tb1Ko2 : this.tb1Ko2s) {
                if (tb1Ko2 != null) {
                    tb1Ko2.setOyaId(this.getOyaId());
                }
                tb1Ko2.insert(now, execId);
            }
        }

        // 親の登録
        String sql = "INSERT INTO TB1_OYA(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`OYA_ID` -- :oya_id");
        nameList.add("`OYA_INFO` -- :oya_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":oya_id");
        valueList.add(":oya_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        return String.join("\r\n    , ", valueList);
    }

    /** 親IDの採番処理 */
    private void numbering() {
        if (this.oyaId != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`OYA_ID`) IS NULL THEN 0 ELSE MAX(e.`OYA_ID`) * 1 END + 1 AS `OYA_ID` FROM TB1_OYA e";
        Map<String, Object> map = new HashMap<String, Object>();
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("OYA_ID");
        this.setOyaId(o);
    }

    /**
     * 親更新
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
                tb1Ko.setOyaId(this.oyaId);
                try {
                    tb1Ko.insert(now, execId);
                } catch (Exception e) {
                    tb1Ko.update(now, execId);
                }
            }
        }

        // 子２の登録
        if (this.tb1Ko2s != null) {
            for (Tb1Ko2 tb1Ko2 : this.tb1Ko2s) {
                if (tb1Ko2 == null) {
                    continue;
                }
                tb1Ko2.setOyaId(this.oyaId);
                try {
                    tb1Ko2.insert(now, execId);
                } catch (Exception e) {
                    tb1Ko2.update(now, execId);
                }
            }
        }

        // 親の登録
        String sql = "UPDATE TB1_OYA\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`OYA_ID` = :oya_id");
        setList.add("`OYA_INFO` = :oya_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 親削除
     * @return 削除件数
     */
    public int delete() {

        // 子の削除
        if (this.tb1Kos != null) {
            for (Tb1Ko tb1Ko : this.tb1Kos) {
                tb1Ko.delete();
            }
        }

        // 子２の削除
        if (this.tb1Ko2s != null) {
            for (Tb1Ko2 tb1Ko2 : this.tb1Ko2s) {
                tb1Ko2.delete();
            }
        }

        // 親の削除
        String sql = "DELETE FROM TB1_OYA WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`OYA_ID` = :oya_id");
        return String.join(" AND ", whereList);
    }

    /**
     * @param now システム日時
     * @param execId 実行ID
     * @return マップ化したエンティティ
     */
    private Map<String, Object> toMap(final LocalDateTime now, final String execId) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", this.oyaId);
        map.put("oya_info", this.oyaInfo);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
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
        this.tb1Kos = Tb1Oya.referTb1Kos(this.oyaId);
        return this.tb1Kos;
    }

    /**
     * @param param1 oyaId
     * @return List<Tb1Ko>
     */
    public static List<Tb1Ko> referTb1Kos(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("OYA_ID = :oya_id");
        String sql = "SELECT ";
        sql += "`OYA_ID`";
        sql += ", `KO_BN`";
        sql += ", `KO_INFO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM TB1_KO a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "OYA_ID, KO_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", param1);
        return Queries.select(sql, map, Tb1Ko.class, null, null);
    }

    /** 子２のリスト */
    private List<Tb1Ko2> tb1Ko2s;

    /** @return 子２のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Ko2s")
    public List<Tb1Ko2> getTb1Ko2s() {
        return this.tb1Ko2s;
    }

    /** @param list 子２のリスト */
    public void setTb1Ko2s(final List<Tb1Ko2> list) {
        this.tb1Ko2s = list;
    }

    /** @param tb1Ko2 */
    public void addTb1Ko2s(final Tb1Ko2 tb1Ko2) {
        if (this.tb1Ko2s == null) {
            this.tb1Ko2s = new ArrayList<Tb1Ko2>();
        }
        this.tb1Ko2s.add(tb1Ko2);
    }

    /** @return 子２のリスト */
    public List<Tb1Ko2> referTb1Ko2s() {
        this.tb1Ko2s = Tb1Oya.referTb1Ko2s(this.oyaId);
        return this.tb1Ko2s;
    }

    /**
     * @param param1 oyaId
     * @return List<Tb1Ko2>
     */
    public static List<Tb1Ko2> referTb1Ko2s(final Integer param1) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("OYA_ID = :oya_id");
        String sql = "SELECT ";
        sql += "`OYA_ID`";
        sql += ", `KO_BN`";
        sql += ", `KO2_INFO`";
        sql += ", `INSERT_TS` AS INSERT_TS";
        sql += ", `INSERT_USER_ID`";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", `UPDATE_TS` AS UPDATE_TS";
        sql += ", `UPDATE_USER_ID`";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += " FROM TB1_KO2 a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "OYA_ID, KO_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", param1);
        return Queries.select(sql, map, Tb1Ko2.class, null, null);
    }
}
