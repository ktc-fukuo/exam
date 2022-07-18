/**
 * エンティティグリッド定義
 */

let TEntityGridColumns = [
    Column.cell('SOSEN_ID', Messages['TEntityGrid.sosenId'], 100, 'primaryKey', null),
    Column.cell('OYA_SN', Messages['TEntityGrid.oyaSn'], 100, 'primaryKey', null),
    Column.cell('ENTITY_SN', Messages['TEntityGrid.entitySn'], 100, 'primaryKey', null),
    Column.text('ENTITY_MEI', Messages['TEntityGrid.entityMei'], 300, '', null),
    Column.text('SANSHO1_ID', Messages['TEntityGrid.sansho1Id'], 100, '', null),
    Column.text('SANSHO1_MEI', Messages['TEntityGrid.sansho1Mei'], 300, '', null),
    Column.text('SANSHO2_ID', Messages['TEntityGrid.sansho2Id'], 100, '', null),
    Column.text('SANSHO2_MEI', Messages['TEntityGrid.sansho2Mei'], 300, '', null),
    Column.text('BETSU_SANSHO1_ID', Messages['TEntityGrid.betsuSansho1Id'], 100, '', null),
    Column.text('BETSU_SANSHO1_MEI', Messages['TEntityGrid.betsuSansho1Mei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TEntityGrid.insertDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TEntityGrid.insertBy'], 100, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TEntityGrid.updateDt'], 230, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TEntityGrid.updateBy'], 100, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TEntityGrid.deleteF'], 10, ''),
];