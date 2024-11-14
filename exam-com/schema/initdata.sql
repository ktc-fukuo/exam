TRUNCATE TABLE m_kbn;
INSERT INTO m_kbn(kbn_nm, kbn_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('check_f', 'チェックフラグ', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn(kbn_nm, kbn_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', 'ラジオ区分', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn(kbn_nm, kbn_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', 'プルダウン区分', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn(kbn_nm, kbn_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('delete_f', '削除フラグ', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn(kbn_nm, kbn_mei, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '権限区分', SYSDATE(), 'initdata', SYSDATE(), 'initdata');

TRUNCATE TABLE m_kbn_value;
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('check_f', '0', 'なし', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('check_f', '1', 'あり', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', '1', '一つ目', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', '2', '二つ目', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('radio_kb', '3', '三つ目', 3, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '01', '一番目', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '02', '二番目', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '03', '三番目', 3, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '04', '四番目', 4, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '05', '五番目', 5, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '06', '六番目', 6, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '07', '七番目', 7, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '08', '八番目', 8, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '09', '九番目', 9, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('pulldown_kb', '10', '十番目', 10, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('delete_f', '0', '未削除', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('delete_f', '1', '削除', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '0', 'なし', 1, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '1', '閲覧', 2, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '2', '出力', 3, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '3', '更新', 4, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '4', '追加', 5, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');
INSERT INTO m_kbn_value(kbn_nm, kbn_kb, kbn_kb_mei, hyoji_on, criteria, insert_dt, insert_by, update_dt, update_by) VALUES ('kengen_kb', '5', '承認', 6, '', SYSDATE(), 'initdata', SYSDATE(), 'initdata');

TRUNCATE TABLE m_busho;
insert into m_busho(BUSHO_ID,BUSHO_MEI,KAISHI_BI,SHURYO_BI,OYA_BUSHO_ID,INSERT_DT,INSERT_BY,UPDATE_DT,UPDATE_BY,DELETE_F) values 
    (0, 'システム管理者', null, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (1, '企業名',         null, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (2, '東京本社',       null, null,    1, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (3, '京都本社',       null, null,    1, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (4, '営業部',         null, null,    3, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (5, '開発部',         null, null,    3, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (6, '開発課',         null, null,    5, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (7, '開発係',         null, null,    6, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
;

TRUNCATE TABLE m_shokui;
insert into m_shokui(SHOKUI_ID,SHOKUI_MEI,SHOKUI_ON,KAISHI_BI,SHURYO_BI,INSERT_DT,INSERT_BY,UPDATE_DT,UPDATE_BY,DELETE_F) values 
    ( 0, 'システム管理者', 0, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 1, '会長',           1, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 2, '社長',           2, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 3, '専務',           3, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 4, '常務',           4, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 5, '監査役',         5, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 6, '事業部長',       6, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 7, '本部長',         7, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 8, '部長',           8, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , ( 9, '次長',           9, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (10, '課長',          10, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (11, '係長',          11, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (12, '主任',          12, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (13, '一般',          13, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (14, '嘱託',          14, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (15, '契約',          15, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (16, 'パート',        16, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (17, 'アルバイト',    17, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (18, '子会社',        18, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
  , (19, '協力会社',      19, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
;

TRUNCATE TABLE m_user;
insert into m_user (user_id, user_sei, user_mei, email, password, insert_dt, insert_by, update_dt, update_by, delete_f) values 
    (0, '姓', '名', 'hoge@example.com', 'b109f3bbbc244eb82441917ed06d618b9008dd09b3befd1b5e07394c706a8bb980b1d7785e5976ec049b46df5f1326af5a2ea6d103fd07c95385ffab0cacbc86', SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
;

TRUNCATE TABLE m_shozoku;
insert into m_shozoku(BUSHO_ID, SHOKUI_ID, USER_ID, KAISHI_BI, SHURYO_BI, INSERT_DT, INSERT_BY, UPDATE_DT, UPDATE_BY, DELETE_F) values
    (0, 0, 0, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
;

TRUNCATE TABLE m_ninka;
insert into m_ninka(BUSHO_ID, SHOKUI_ID, KINO_NM, KENGEN_KB, KAISHI_BI, SHURYO_BI, INSERT_DT, INSERT_BY, UPDATE_DT, UPDATE_BY, DELETE_F) values
    (0 ,0, '^.+$', 99, null, null, SYSDATE(), 'initdata', SYSDATE(), 'initdata', null)
;

