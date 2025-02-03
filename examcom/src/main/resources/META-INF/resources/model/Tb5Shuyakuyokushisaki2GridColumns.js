/**
 * 集約抑止先２グリッド定義
 */

let Tb5Shuyakuyokushisaki2GridColumns = [];

$(function() {
    Tb5Shuyakuyokushisaki2GridColumns = [
        Column.comma('SHUYAKUYOKUSHISAKI2_ID', Messages['Tb5Shuyakuyokushisaki2Grid.shuyakuyokushisaki2Id'], 80, 'primaryKey numbering', null),
        Column.comma('TENSEIYOKUSHI_ID', Messages['Tb5Shuyakuyokushisaki2Grid.tenseiyokushiId'], 80, '', null),
        Column.cell('UPDATE_TS', Messages['Tb5Shuyakuyokushisaki2Grid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb5Shuyakuyokushisaki2Grid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb5Shuyakuyokushisaki2Grid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
