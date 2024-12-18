SELECT
      a.`USER_ID`
    , a.`USER_SEI`
    , a.`USER_MEI`
    , a.`EMAIL`
    , a.`PASSWORD`
    , a.`KAISHI_BI` AS KAISHI_BI
    , a.`SHURYO_BI` AS SHURYO_BI
    , a.`INSERT_TS` AS INSERT_TS
    , a.`INSERT_ID`
    , a.`UPDATE_TS` AS UPDATE_TS
    , a.`UPDATE_ID`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    mhr_user a 
WHERE
    1 = 1 
    AND a.`USER_ID` = :user_id 
    AND TRIM(TRAILING ' ' FROM a.`USER_SEI`) LIKE CONCAT ('%', :user_sei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`USER_MEI`) LIKE CONCAT ('%', :user_mei, '%') 
    AND TRIM(TRAILING ' ' FROM a.`EMAIL`) LIKE CONCAT ('%', :email, '%') 
    AND TRIM(TRAILING ' ' FROM a.`PASSWORD`) LIKE CONCAT ('%', :password, '%') 
    AND a.`KAISHI_BI` = :kaishi_bi 
    AND a.`KAISHI_BI` >= :kaishi_bi_1 
    AND a.`KAISHI_BI` <= :kaishi_bi_2 
    AND a.`SHURYO_BI` = :shuryo_bi 
    AND a.`SHURYO_BI` >= :shuryo_bi_1 
    AND a.`SHURYO_BI` <= :shuryo_bi_2 
    AND a.`INSERT_TS` = :insert_ts 
    AND a.`INSERT_TS` >= :insert_ts_1 
    AND a.`INSERT_TS` <= :insert_ts_2 
    AND a.`INSERT_ID` = :insert_id 
    AND a.`UPDATE_TS` = :update_ts 
    AND a.`UPDATE_TS` >= :update_ts_1 
    AND a.`UPDATE_TS` <= :update_ts_2 
    AND a.`UPDATE_ID` = :update_id 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`USER_ID`
