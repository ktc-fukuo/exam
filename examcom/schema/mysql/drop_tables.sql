/*
SELECT
      'DROP TABLE ' || table_name || ' PURGE;' AS "--DROP TABLE PURGE" 
FROM
    user_tables 
ORDER BY
    table_name
*/
--DROP TABLE PURGE
DROP TABLE MHR_BUSHO PURGE;
DROP TABLE MHR_NINKA PURGE;
DROP TABLE MHR_SHOKUI PURGE;
DROP TABLE MHR_SHOZOKU PURGE;
DROP TABLE MHR_USER PURGE;
DROP TABLE MIV_AREA PURGE;
DROP TABLE MIV_LOC PURGE;
DROP TABLE MIV_TATEYA PURGE;
DROP TABLE MLG_UNSO PURGE;
DROP TABLE MSL_KOKYAKU PURGE;
DROP TABLE MSL_KOKYAKU_NONYUSAKI PURGE;
DROP TABLE MSL_NONYUSAKI PURGE;
DROP TABLE MSL_TANKA PURGE;
DROP TABLE MSL_TOKUISAKI PURGE;
DROP TABLE MST_HINBAN PURGE;
DROP TABLE MST_KOSEI PURGE;
DROP TABLE MSY_KBN PURGE;
DROP TABLE MSY_KBN_VAL PURGE;
DROP TABLE TAP_HIKIAI PURGE;
DROP TABLE TAP_HIKIAI_DET PURGE;
DROP TABLE TAP_MITSU PURGE;
DROP TABLE TAP_MITSU_DET PURGE;
DROP TABLE TCH_CHUMON PURGE;
DROP TABLE TCH_CHUMON_DET PURGE;
DROP TABLE TCH_JUCHU PURGE;
DROP TABLE TCH_JUCHU_DET PURGE;
DROP TABLE TCH_JUCHU_HIK PURGE;
DROP TABLE TCH_JUCHU_HIK_HIS PURGE;
DROP TABLE TCH_JUCHU_SHUYYO PURGE;
DROP TABLE TCH_JUCHU_ZAN PURGE;
DROP TABLE TCH_JUCHU_ZAN_DET PURGE;
DROP TABLE TIV_NYUKEI PURGE;
DROP TABLE TIV_NYUKO PURGE;
DROP TABLE TIV_NYUSHUKKO_HIS PURGE;
DROP TABLE TIV_SHUKKEI PURGE;
DROP TABLE TIV_SHUKKO PURGE;
DROP TABLE TIV_ZAIKO PURGE;
DROP TABLE TLG_SHUKKA PURGE;
DROP TABLE TPR_NYUYO PURGE;
DROP TABLE TSK_SEIKYU PURGE;
DROP TABLE TSK_SEIKYU_MEISAI PURGE;
DROP TABLE TSK_URIAGE PURGE;
DROP TABLE TSK_URIAGE_DET PURGE;
DROP TABLE TUK_KAISHU PURGE;
DROP TABLE TUK_KOK_YOSHIN PURGE;
DROP TABLE TUK_NYUKIN PURGE;
DROP TABLE TUK_TOK_YOSHIN PURGE;
DROP TABLE TUK_URIKAKE PURGE;

