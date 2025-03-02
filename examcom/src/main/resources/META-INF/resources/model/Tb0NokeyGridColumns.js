/**
 * 主キーなしグリッド定義
 */

let Tb0NokeyGridColumns = [];

$(function() {
    Tb0NokeyGridColumns = [
        Column.text('COL_A', Messages['Tb0NokeyGrid.colA'], 300, 'primaryKey', null),
        Column.text('COL_B', Messages['Tb0NokeyGrid.colB'], 300, 'primaryKey', null),
        Column.text('COL_C', Messages['Tb0NokeyGrid.colC'], 300, 'uniqueKey', null),
        Column.text('COL_D', Messages['Tb0NokeyGrid.colD'], 300, '', null),
        Column.text('COL_E', Messages['Tb0NokeyGrid.colE'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb0NokeyGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
