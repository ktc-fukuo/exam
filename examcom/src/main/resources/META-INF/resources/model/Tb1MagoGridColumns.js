/**
 * 孫グリッド定義
 */

let Tb1MagoGridColumns = [];

$(function() {
    Tb1MagoGridColumns = [
        Column.text('OYA_ID', Messages['Tb1MagoGrid.oyaId'], 90, 'primaryKey numbering', null),
        Column.text('KO_BN', Messages['Tb1MagoGrid.koBn'], 90, 'primaryKey numbering', null),
        Column.text('MAGO_BN', Messages['Tb1MagoGrid.magoBn'], 90, 'primaryKey numbering', null),
        Column.text('MAGO_INFO', Messages['Tb1MagoGrid.magoInfo'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb1MagoGrid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
