/**
 * 集約抑止元１グリッド定義
 */

let Tb7ShuyakuYokushiMoto1GridColumns = [];

$(function() {
    Tb7ShuyakuYokushiMoto1GridColumns = [
        Column.text('SHUYAKU_YOKUSHI_MOTO1_ID', Messages['Tb7ShuyakuYokushiMoto1Grid.shuyakuYokushiMoto1Id'], 90, 'primaryKey numbering', null),
        Column.text('SHUYAKU_YOKUSHI_ID', Messages['Tb7ShuyakuYokushiMoto1Grid.shuyakuYokushiId'], 90, '', null),
        Column.cell('UPDATE_TS', Messages['Tb7ShuyakuYokushiMoto1Grid.updateTs'], 207, 'metaInfo', Slick.Formatters.Extends.Timestamp),
    ];
});
