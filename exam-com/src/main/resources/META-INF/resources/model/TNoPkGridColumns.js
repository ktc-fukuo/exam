/**
 * 主キーなしグリッド定義
 */

let TNoPkGridColumns = [
    Column.text('COLUMN_A', Messages['TNoPkGrid.columnA'], 300, '', null),
    Column.text('COLUMN_B', Messages['TNoPkGrid.columnB'], 300, '', null),
    Column.text('COLUMN_C', Messages['TNoPkGrid.columnC'], 300, '', null),
    Column.text('COLUMN_D', Messages['TNoPkGrid.columnD'], 300, '', null),
    Column.text('COLUMN_E', Messages['TNoPkGrid.columnE'], 300, '', null),
    Column.cell('INSERT_DT', Messages['TNoPkGrid.insertDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('INSERT_BY', Messages['TNoPkGrid.insertBy'], 150, 'metaInfo', null),
    Column.cell('UPDATE_DT', Messages['TNoPkGrid.updateDt'], 285, 'metaInfo', Slick.Formatters.Extends.DateTime),
    Column.cell('UPDATE_BY', Messages['TNoPkGrid.updateBy'], 150, 'metaInfo', null),
    Column.check('DELETE_F', Messages['TNoPkGrid.deleteF'], 30, ''),
];
