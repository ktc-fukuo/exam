/**
 * 長男３グリッド定義
 */

let Tb2Chonan3GridColumns = [];

$(function() {
    Tb2Chonan3GridColumns = [
        Column.comma('CHONAN_ID', Messages['Tb2Chonan3Grid.chonanId'], 80, 'primaryKey numbering', null),
        Column.text('CHONAN3_INFO', Messages['Tb2Chonan3Grid.chonan3Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Chonan3Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Chonan3Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Chonan3Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
