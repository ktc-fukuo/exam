/**
 * 子孫グリッド定義
 */

let Tb1ShisonGridColumns = [
    Column.refer('SOSEN_ID', Messages['Tb1ShisonGrid.sosenId'], 80, 'primaryKey numbering', 'null'),
    Column.comma('OYA_BN', Messages['Tb1ShisonGrid.oyaBn'], 80, 'primaryKey numbering', null),
    Column.comma('ENTITY_BN', Messages['Tb1ShisonGrid.entityBn'], 80, 'primaryKey numbering', null),
    Column.comma('KO_BN', Messages['Tb1ShisonGrid.koBn'], 80, 'primaryKey numbering', null),
    Column.comma('SHISON_BN', Messages['Tb1ShisonGrid.shisonBn'], 80, 'primaryKey numbering', null),
    Column.text('SHISON_MEI', Messages['Tb1ShisonGrid.shisonMei'], 300, '', null),
    Column.cell('INSERT_DT', Messages['Tb1ShisonGrid.insertDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['Tb1ShisonGrid.insertBy'], 80, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['Tb1ShisonGrid.updateDt'], 152, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['Tb1ShisonGrid.updateBy'], 80, 'metaInfo', null),
    Column.check('DELETE_F', Messages['Tb1ShisonGrid.deleteF'], 30, ''),
];
