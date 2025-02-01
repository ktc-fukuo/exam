package com.example.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import jp.co.golorp.emarf.entity.IEntity;
import jp.co.golorp.emarf.sql.Queries;

/**
 * 子
 * @author emarfkrow
 */
public class Tb1Ko implements IEntity {

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

    /** 子枝番 */
    private Integer koBn;

    /** @return 子枝番 */
    @com.fasterxml.jackson.annotation.JsonProperty("KO_BN")
    public Integer getKoBn() {
        return this.koBn;
    }

    /** @param o 子枝番 */
    public void setKoBn(final Object o) {
        if (!jp.co.golorp.emarf.lang.StringUtil.isNullOrBlank(o)) {
            this.koBn = Integer.valueOf(o.toString());
        } else {
            this.koBn = null;
        }
    }

    /** 子情報 */
    private String koInfo;

    /** @return 子情報 */
    @com.fasterxml.jackson.annotation.JsonProperty("KO_INFO")
    public String getKoInfo() {
        return this.koInfo;
    }

    /** @param o 子情報 */
    public void setKoInfo(final Object o) {
        if (o != null) {
            this.koInfo = o.toString();
        } else {
            this.koInfo = null;
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
     * 子照会
     * @param param1 親ID
     * @param param2 子枝番
     * @return 子
     */
    public static Tb1Ko get(final Object param1, final Object param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`OYA_ID` = :oya_id");
        whereList.add("`KO_BN` = :ko_bn");
        String sql = "";
        sql += "SELECT \n";
        sql += "      a.`OYA_ID` \n";
        sql += "    , a.`KO_BN` \n";
        sql += "    , a.`KO_INFO` \n";
        sql += "    , a.`INSERT_TS` AS INSERT_TS \n";
        sql += "    , a.`INSERT_USER_ID` \n";
        sql += "    , a.`UPDATE_TS` AS UPDATE_TS \n";
        sql += "    , a.`UPDATE_USER_ID` \n";
        sql += "    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F \n";
        sql += "    , a.`STATUS_KB` \n";
        sql += "FROM \n";
        sql += "    TB1_KO a \n";
        sql += "WHERE \n";
        sql += String.join(" AND \n", whereList);
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", param1);
        map.put("ko_bn", param2);
        return Queries.get(sql, map, Tb1Ko.class);
    }

    /**
     * 子追加
     * @param now システム日時
     * @param execId 登録者
     * @return 追加件数
     */
    public int insert(final LocalDateTime now, final String execId) {

        // 子枝番の採番処理
        numbering();

        // 孫の登録
        if (this.tb1Magos != null) {
            for (Tb1Mago tb1Mago : this.tb1Magos) {
                if (tb1Mago != null) {
                    tb1Mago.setOyaId(this.getOyaId());
                    tb1Mago.setKoBn(this.getKoBn());
                }
                tb1Mago.insert(now, execId);
            }
        }

        // 兄弟２の登録
        if (this.tb3Kyodai2 != null) {
            this.tb3Kyodai2.setOyaId(this.getOyaId());
            this.tb3Kyodai2.setKoBn(this.getKoBn());
            this.tb3Kyodai2.insert(now, execId);
        }

        // 兄弟３の登録
        if (this.tb3Kyodai3 != null) {
            this.tb3Kyodai3.setOyaId(this.getOyaId());
            this.tb3Kyodai3.setKoBn(this.getKoBn());
            this.tb3Kyodai3.insert(now, execId);
        }

        // 兄弟４の登録
        if (this.tb3Kyodai4 != null) {
            this.tb3Kyodai4.setOyaId(this.getOyaId());
            this.tb3Kyodai4.setKoBn(this.getKoBn());
            this.tb3Kyodai4.insert(now, execId);
        }

        // 兄弟５の登録
        if (this.tb3Kyodai5 != null) {
            this.tb3Kyodai5.setOyaId(this.getOyaId());
            this.tb3Kyodai5.setKoBn(this.getKoBn());
            this.tb3Kyodai5.insert(now, execId);
        }

        // 履歴の登録
        Tb1KoRireki tb1KoRireki = new Tb1KoRireki();
        tb1KoRireki.setOyaId(this.oyaId);
        tb1KoRireki.setKoBn(this.koBn);
        tb1KoRireki.setKoInfo(this.koInfo);
        tb1KoRireki.setInsertTs(this.insertTs);
        tb1KoRireki.setInsertUserId(this.insertUserId);
        tb1KoRireki.setUpdateTs(this.updateTs);
        tb1KoRireki.setUpdateUserId(this.updateUserId);
        tb1KoRireki.setDeleteF(this.deleteF);
        tb1KoRireki.setStatusKb(this.statusKb);
        tb1KoRireki.insert(now, execId);

        // 子の登録
        String sql = "INSERT INTO TB1_KO(\r\n      " + names() + "\r\n) VALUES (\r\n      " + values() + "\r\n)";
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return insert用のname句 */
    private String names() {
        List<String> nameList = new ArrayList<String>();
        nameList.add("`OYA_ID` -- :oya_id");
        nameList.add("`KO_BN` -- :ko_bn");
        nameList.add("`KO_INFO` -- :ko_info");
        nameList.add("`INSERT_TS` -- :insert_ts");
        nameList.add("`INSERT_USER_ID` -- :insert_user_id");
        nameList.add("`UPDATE_TS` -- :update_ts");
        nameList.add("`UPDATE_USER_ID` -- :update_user_id");
        nameList.add("`DELETE_F` -- :delete_f");
        nameList.add("`STATUS_KB` -- :status_kb");
        return String.join("\r\n    , ", nameList);
    }

    /** @return insert用のvalue句 */
    private String values() {
        List<String> valueList = new ArrayList<String>();
        valueList.add(":oya_id");
        valueList.add(":ko_bn");
        valueList.add(":ko_info");
        valueList.add(":insert_ts");
        valueList.add(":insert_user_id");
        valueList.add(":update_ts");
        valueList.add(":update_user_id");
        valueList.add(":delete_f");
        valueList.add(":status_kb");
        return String.join("\r\n    , ", valueList);
    }

    /** 子枝番の採番処理 */
    private void numbering() {
        if (this.koBn != null) {
            return;
        }
        String sql = "SELECT CASE WHEN MAX(e.`KO_BN`) IS NULL THEN 0 ELSE MAX(e.`KO_BN`) * 1 END + 1 AS `KO_BN` FROM TB1_KO e";
        Map<String, Object> map = new HashMap<String, Object>();
        List<String> whereList = new ArrayList<String>();
        whereList.add("e.`OYA_ID` = :oya_id");
        sql += " WHERE " + String.join(" AND ", whereList);
        map.put("oya_id", this.oyaId);
        jp.co.golorp.emarf.util.MapList mapList = Queries.select(sql, map, null, null);
        Object o = mapList.get(0).get("KO_BN");
        this.setKoBn(o);
    }

    /**
     * 子更新
     * @param now システム日時
     * @param execId 更新者
     * @return 更新件数
     */
    public int update(final LocalDateTime now, final String execId) {

        // 孫の登録
        if (this.tb1Magos != null) {
            for (Tb1Mago tb1Mago : this.tb1Magos) {
                if (tb1Mago == null) {
                    continue;
                }
                tb1Mago.setOyaId(this.oyaId);
                tb1Mago.setKoBn(this.koBn);
                try {
                    tb1Mago.insert(now, execId);
                } catch (Exception e) {
                    tb1Mago.update(now, execId);
                }
            }
        }

        // 兄弟２の登録
        if (this.tb3Kyodai2 != null) {
            tb3Kyodai2.setOyaId(this.getOyaId());
            tb3Kyodai2.setKoBn(this.getKoBn());
            try {
                tb3Kyodai2.insert(now, execId);
            } catch (Exception e) {
                tb3Kyodai2.update(now, execId);
            }
        }

        // 兄弟３の登録
        if (this.tb3Kyodai3 != null) {
            tb3Kyodai3.setOyaId(this.getOyaId());
            tb3Kyodai3.setKoBn(this.getKoBn());
            try {
                tb3Kyodai3.insert(now, execId);
            } catch (Exception e) {
                tb3Kyodai3.update(now, execId);
            }
        }

        // 兄弟４の登録
        if (this.tb3Kyodai4 != null) {
            tb3Kyodai4.setOyaId(this.getOyaId());
            tb3Kyodai4.setKoBn(this.getKoBn());
            try {
                tb3Kyodai4.insert(now, execId);
            } catch (Exception e) {
                tb3Kyodai4.update(now, execId);
            }
        }

        // 兄弟５の登録
        if (this.tb3Kyodai5 != null) {
            tb3Kyodai5.setOyaId(this.getOyaId());
            tb3Kyodai5.setKoBn(this.getKoBn());
            try {
                tb3Kyodai5.insert(now, execId);
            } catch (Exception e) {
                tb3Kyodai5.update(now, execId);
            }
        }

        // 履歴の登録
        Tb1KoRireki tb1KoRireki = new Tb1KoRireki();
        tb1KoRireki.setOyaId(this.oyaId);
        tb1KoRireki.setKoBn(this.koBn);
        tb1KoRireki.setKoInfo(this.koInfo);
        tb1KoRireki.setInsertTs(this.insertTs);
        tb1KoRireki.setInsertUserId(this.insertUserId);
        tb1KoRireki.setUpdateTs(this.updateTs);
        tb1KoRireki.setUpdateUserId(this.updateUserId);
        tb1KoRireki.setDeleteF(this.deleteF);
        tb1KoRireki.setStatusKb(this.statusKb);
        tb1KoRireki.insert(now, execId);

        // 子の登録
        String sql = "UPDATE TB1_KO\r\nSET\r\n      " + getSet() + "\r\nWHERE\r\n    " + getWhere();
        return Queries.regist(sql, toMap(now, execId));
    }

    /** @return update用のset句 */
    private String getSet() {
        List<String> setList = new ArrayList<String>();
        setList.add("`OYA_ID` = :oya_id");
        setList.add("`KO_BN` = :ko_bn");
        setList.add("`KO_INFO` = :ko_info");
        setList.add("`UPDATE_TS` = :update_ts");
        setList.add("`UPDATE_USER_ID` = :update_user_id");
        setList.add("`DELETE_F` = :delete_f");
        setList.add("`STATUS_KB` = :status_kb");
        return String.join("\r\n    , ", setList);
    }

    /**
     * 子削除
     * @return 削除件数
     */
    public int delete() {

        // 孫の削除
        if (this.tb1Magos != null) {
            for (Tb1Mago tb1Mago : this.tb1Magos) {
                tb1Mago.delete();
            }
        }

        // 兄弟２の削除
        if (this.tb3Kyodai2 != null) {
            this.tb3Kyodai2.delete();
        }

        // 兄弟３の削除
        if (this.tb3Kyodai3 != null) {
            this.tb3Kyodai3.delete();
        }

        // 兄弟４の削除
        if (this.tb3Kyodai4 != null) {
            this.tb3Kyodai4.delete();
        }

        // 兄弟５の削除
        if (this.tb3Kyodai5 != null) {
            this.tb3Kyodai5.delete();
        }

        // 子の削除
        String sql = "DELETE FROM TB1_KO WHERE " + getWhere();
        return Queries.regist(sql, toMap(null, null));
    }

    /** @return where句 */
    private String getWhere() {
        List<String> whereList = new ArrayList<String>();
        whereList.add("`OYA_ID` = :oya_id");
        whereList.add("`KO_BN` = :ko_bn");
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
        map.put("ko_bn", this.koBn);
        map.put("ko_info", this.koInfo);
        map.put("delete_f", this.deleteF);
        map.put("status_kb", this.statusKb);
        map.put("insert_ts", now);
        map.put("insert_user_id", execId);
        map.put("update_ts", now);
        map.put("update_user_id", execId);
        return map;
    }

    /** 兄弟２ */
    private Tb3Kyodai2 tb3Kyodai2;

    /** @return 兄弟２ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb3Kyodai2")
    public Tb3Kyodai2 getTb3Kyodai2() {
        return this.tb3Kyodai2;
    }

    /** @param p 兄弟２ */
    public void setTb3Kyodai2(final Tb3Kyodai2 p) {
        this.tb3Kyodai2 = p;
    }

    /** @return 兄弟２ */
    public Tb3Kyodai2 referTb3Kyodai2() {
        if (this.tb3Kyodai2 == null) {
            try {
                this.tb3Kyodai2 = Tb3Kyodai2.get(this.oyaId, this.koBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb3Kyodai2;
    }

    /** 兄弟３ */
    private Tb3Kyodai3 tb3Kyodai3;

    /** @return 兄弟３ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb3Kyodai3")
    public Tb3Kyodai3 getTb3Kyodai3() {
        return this.tb3Kyodai3;
    }

    /** @param p 兄弟３ */
    public void setTb3Kyodai3(final Tb3Kyodai3 p) {
        this.tb3Kyodai3 = p;
    }

    /** @return 兄弟３ */
    public Tb3Kyodai3 referTb3Kyodai3() {
        if (this.tb3Kyodai3 == null) {
            try {
                this.tb3Kyodai3 = Tb3Kyodai3.get(this.oyaId, this.koBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb3Kyodai3;
    }

    /** 兄弟４ */
    private Tb3Kyodai4 tb3Kyodai4;

    /** @return 兄弟４ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb3Kyodai4")
    public Tb3Kyodai4 getTb3Kyodai4() {
        return this.tb3Kyodai4;
    }

    /** @param p 兄弟４ */
    public void setTb3Kyodai4(final Tb3Kyodai4 p) {
        this.tb3Kyodai4 = p;
    }

    /** @return 兄弟４ */
    public Tb3Kyodai4 referTb3Kyodai4() {
        if (this.tb3Kyodai4 == null) {
            try {
                this.tb3Kyodai4 = Tb3Kyodai4.get(this.oyaId, this.koBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb3Kyodai4;
    }

    /** 兄弟５ */
    private Tb3Kyodai5 tb3Kyodai5;

    /** @return 兄弟５ */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb3Kyodai5")
    public Tb3Kyodai5 getTb3Kyodai5() {
        return this.tb3Kyodai5;
    }

    /** @param p 兄弟５ */
    public void setTb3Kyodai5(final Tb3Kyodai5 p) {
        this.tb3Kyodai5 = p;
    }

    /** @return 兄弟５ */
    public Tb3Kyodai5 referTb3Kyodai5() {
        if (this.tb3Kyodai5 == null) {
            try {
                this.tb3Kyodai5 = Tb3Kyodai5.get(this.oyaId, this.koBn);
            } catch (jp.co.golorp.emarf.exception.NoDataError e) {
            }
        }
        return this.tb3Kyodai5;
    }

    /** 孫のリスト */
    private List<Tb1Mago> tb1Magos;

    /** @return 孫のリスト */
    @com.fasterxml.jackson.annotation.JsonProperty("Tb1Magos")
    public List<Tb1Mago> getTb1Magos() {
        return this.tb1Magos;
    }

    /** @param list 孫のリスト */
    public void setTb1Magos(final List<Tb1Mago> list) {
        this.tb1Magos = list;
    }

    /** @param tb1Mago */
    public void addTb1Magos(final Tb1Mago tb1Mago) {
        if (this.tb1Magos == null) {
            this.tb1Magos = new ArrayList<Tb1Mago>();
        }
        this.tb1Magos.add(tb1Mago);
    }

    /** @return 孫のリスト */
    public List<Tb1Mago> referTb1Magos() {
        this.tb1Magos = Tb1Ko.referTb1Magos(this.oyaId, this.koBn);
        return this.tb1Magos;
    }

    /**
     * @param param1 oyaId
     * @param param2 koBn
     * @return List<Tb1Mago>
     */
    public static List<Tb1Mago> referTb1Magos(final Integer param1, final Integer param2) {
        List<String> whereList = new ArrayList<String>();
        whereList.add("OYA_ID = :oya_id");
        whereList.add("KO_BN = :ko_bn");
        String sql = "SELECT ";
        sql += "OYA_ID";
        sql += ", KO_BN";
        sql += ", MAGO_BN";
        sql += ", MAGO_INFO";
        sql += ", INSERT_TS";
        sql += ", INSERT_USER_ID";
        sql += ", (SELECT r0.`USER_SEI` FROM MHR_USER r0 WHERE r0.`USER_ID` = a.`INSERT_USER_ID`) AS `INSERT_USER_SEI`";
        sql += ", UPDATE_TS";
        sql += ", UPDATE_USER_ID";
        sql += ", (SELECT r1.`USER_SEI` FROM MHR_USER r1 WHERE r1.`USER_ID` = a.`UPDATE_USER_ID`) AS `UPDATE_USER_SEI`";
        sql += ", DELETE_F";
        sql += ", STATUS_KB";
        sql += " FROM TB1_MAGO a WHERE " + String.join(" AND ", whereList);
        sql += " ORDER BY ";
        sql += "OYA_ID, KO_BN, MAGO_BN";
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("oya_id", param1);
        map.put("ko_bn", param2);
        return Queries.select(sql, map, Tb1Mago.class, null, null);
    }
}
