SELECT
      a.`SOSEN_ID`
    , a.`OYA_BN`
    , a.`ENTITY_BN`
    , a.`KO_BN`
    , a.`SHISON_BN`
    , a.`SHISON_MEI`
    , a.`INSERT_DT`
    , a.`INSERT_BY`
    , a.`UPDATE_DT`
    , a.`UPDATE_BY`
    , TRIM(TRAILING ' ' FROM a.`DELETE_F`) AS DELETE_F
FROM
    t_shison a 
WHERE
    1 = 1 
    AND a.`SOSEN_ID` = :sosen_id 
    AND a.`OYA_BN` = :oya_bn 
    AND a.`ENTITY_BN` = :entity_bn 
    AND a.`KO_BN` = :ko_bn 
    AND a.`SHISON_BN` = :shison_bn 
    AND TRIM(TRAILING ' ' FROM a.`SHISON_MEI`) LIKE CONCAT ('%', :shison_mei, '%') 
    AND a.`INSERT_DT` = :insert_dt 
    AND a.`INSERT_DT` >= :insert_dt_1 
    AND a.`INSERT_DT` <= :insert_dt_2 
    AND TRIM(TRAILING ' ' FROM a.`INSERT_BY`) LIKE CONCAT ('%', :insert_by, '%') 
    AND a.`UPDATE_DT` = :update_dt 
    AND a.`UPDATE_DT` >= :update_dt_1 
    AND a.`UPDATE_DT` <= :update_dt_2 
    AND TRIM(TRAILING ' ' FROM a.`UPDATE_BY`) LIKE CONCAT ('%', :update_by, '%') 
    AND CASE WHEN TRIM (a.`DELETE_F`) IS NULL THEN '0' ELSE TO_CHAR (a.`DELETE_F`) END IN (:delete_f) 
ORDER BY
    a.`SOSEN_ID`, a.`OYA_BN`, a.`ENTITY_BN`, a.`KO_BN`, a.`SHISON_BN`
