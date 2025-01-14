/**
 * 転生グリッド定義
 */

let Tb1TenseiGridColumns = [];

$(function() {
    Tb1TenseiGridColumns = [
        Column.comma('TENSEI_ID', Messages['Tb1TenseiGrid.tenseiId'], 80, 'primaryKey numbering', null),
        Column.text('TENSEI_MEI', Messages['Tb1TenseiGrid.tenseiMei'], 300, 'notblank', null),
        Column.cell('SOSEN_ID', Messages['Tb1TenseiGrid.sosenId'], 80, 'notblank', null),
        Column.cell('UPDATE_TS', Messages['Tb1TenseiGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb1TenseiGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb1TenseiGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
