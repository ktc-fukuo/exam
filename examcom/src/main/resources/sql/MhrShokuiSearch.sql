SELECT
      a."SHOKUI_ID"
    , a."SHOKUI_MEI"
    , a."SHOKUI_ON"
    , TO_CHAR (a."KAISHI_BI", 'YYYY-MM-DD') AS KAISHI_BI
    , TO_CHAR (a."SHURYO_BI", 'YYYY-MM-DD') AS SHURYO_BI
    , TO_CHAR (a."INSERT_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS INSERT_TS
    , a."INSERT_USER_ID"
    , (SELECT r1."USER_SEI" FROM MHR_USER r1 WHERE r1."USER_ID" = a."INSERT_USER_ID") AS "INSERT_USER_SEI"
    , TO_CHAR (a."UPDATE_TS", 'YYYY-MM-DD HH24:MI:SS.FF3') AS UPDATE_TS
    , a."UPDATE_USER_ID"
    , (SELECT r2."USER_SEI" FROM MHR_USER r2 WHERE r2."USER_ID" = a."UPDATE_USER_ID") AS "UPDATE_USER_SEI"
    , RTRIM (RTRIM (a."DELETE_F"), '　') AS DELETE_F
    , a."STATUS_KB"
FROM
    MHR_SHOKUI a 
WHERE
    1 = 1 
    AND a."SHOKUI_ID" = :shokui_id 
    AND RTRIM (RTRIM (a."SHOKUI_MEI"), '　') LIKE '%' || :shokui_mei || '%' 
    AND a."SHOKUI_ON" = :shokui_on 
    AND a."KAISHI_BI" = TO_DATE (SUBSTR (:kaishi_bi, 0, 10), 'YYYY-MM-DD') 
    AND a."KAISHI_BI" >= TO_DATE (SUBSTR (:kaishi_bi_1 , 0, 10), 'YYYY-MM-DD')
    AND a."KAISHI_BI" <= TO_DATE (SUBSTR (:kaishi_bi_2 , 0, 10), 'YYYY-MM-DD')
    AND a."SHURYO_BI" = TO_DATE (SUBSTR (:shuryo_bi, 0, 10), 'YYYY-MM-DD') 
    AND a."SHURYO_BI" >= TO_DATE (SUBSTR (:shuryo_bi_1 , 0, 10), 'YYYY-MM-DD')
    AND a."SHURYO_BI" <= TO_DATE (SUBSTR (:shuryo_bi_2 , 0, 10), 'YYYY-MM-DD')
    AND a."INSERT_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."INSERT_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:insert_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."INSERT_USER_ID" = :insert_user_id 
    AND a."UPDATE_TS" = TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts, 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3') 
    AND a."UPDATE_TS" >= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_1 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_TS" <= TO_TIMESTAMP (REPLACE (SUBSTR (:update_ts_2 , 0, 23), 'T', ' '), 'YYYY-MM-DD HH24:MI:SS.FF3')
    AND a."UPDATE_USER_ID" = :update_user_id 
    AND CASE WHEN TRIM (a."DELETE_F") IS NULL THEN '0' ELSE TO_CHAR (a."DELETE_F") END IN (:delete_f) 
    AND TRIM (a."STATUS_KB") IN (:status_kb) 
ORDER BY
    a."SHOKUI_ID"
