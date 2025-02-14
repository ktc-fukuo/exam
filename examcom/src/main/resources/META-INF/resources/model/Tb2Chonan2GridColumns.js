/**
 * 長男２グリッド定義
 */

let Tb2Chonan2GridColumns = [];

$(function() {
    Tb2Chonan2GridColumns = [
        Column.comma('CHONAN_ID', Messages['Tb2Chonan2Grid.chonanId'], 80, 'primaryKey numbering', null),
        Column.text('CHONAN2_INFO', Messages['Tb2Chonan2Grid.chonan2Info'], 300, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2Chonan2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2Chonan2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2Chonan2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
