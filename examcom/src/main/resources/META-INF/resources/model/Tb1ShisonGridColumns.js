/**
 * 子孫グリッド定義
 */

let Tb1ShisonGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1ShisonGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1ShisonGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1ShisonGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.comma('KO_BN', Messages['Tb1ShisonGrid.koBn'], 80, 'primaryKey numbering', null),
    Column.comma('SHISON_BN', Messages['Tb1ShisonGrid.shisonBn'], 80, 'primaryKey numbering', null),
    Column.text('SHISON_MEI', Messages['Tb1ShisonGrid.shisonMei'], 300, 'notblank', null),
    Column.cell('INSERT_TS', Messages['Tb1ShisonGrid.insertTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('INSERT_ID', Messages['Tb1ShisonGrid.insertId'], 80, 'metaInfo', null),
    Column.cell('UPDATE_TS', Messages['Tb1ShisonGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    Column.cell('UPDATE_ID', Messages['Tb1ShisonGrid.updateId'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1ShisonGrid.deleteF'], 30, ''),
];
