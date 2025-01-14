/**
 * エンティティグリッド定義
 */

let Tb2EntityGridColumns = [];

$(function() {
    Tb2EntityGridColumns = [
        Column.comma('ENTITY_ID', Messages['Tb2EntityGrid.entityId'], 80, 'primaryKey numbering', null),
        Column.text('ENTITY_NM', Messages['Tb2EntityGrid.entityNm'], 160, 'notblank', null),
        Column.text('ENTITY_MEI', Messages['Tb2EntityGrid.entityMei'], 300, 'notblank', null),
        Column.check('CHECK_F', Messages['Tb2EntityGrid.checkF'], 30, 'notblank'),
        Column.select('RADIO_KB', Messages['Tb2EntityGrid.radioKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.select('PULLDOWN_KB', Messages['Tb2EntityGrid.pulldownKb'], 30, 'notblank', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.longText('MEMO_TX', Messages['Tb2EntityGrid.memoTx'], 300, 'notblank', null),
        Column.text('NEN_Y', Messages['Tb2EntityGrid.nenY'], 32, 'notblank', null),
        Column.text('TSUKI_M', Messages['Tb2EntityGrid.tsukiM'], 30, 'notblank', null),
        Column.text('HI_D', Messages['Tb2EntityGrid.hiD'], 30, 'notblank', null),
        Column.month('NENGETSU_YM', Messages['Tb2EntityGrid.nengetsuYm'], 48, 'notblank', null),
        Column.date8('NENGAPPI_YMD', Messages['Tb2EntityGrid.nengappiYmd'], 64, 'notblank', null),
        Column.text('TIMESTAMP_TS', Messages['Tb2EntityGrid.timestampTs'], 184, 'notblank', Slick.Formatters.Extends.Timestamp),
        Column.dateTime('NICHIJI_DT', Messages['Tb2EntityGrid.nichijiDt'], 152, 'notblank'),
        Column.date('HIDUKE_BI', Messages['Tb2EntityGrid.hidukeBi'], 80, 'notblank', Slick.Formatters.Extends.Date),
        Column.time('JIKOKU_HM', Messages['Tb2EntityGrid.jikokuHm'], 40, 'notblank', null),
        Column.text('JIKAN_TM', Messages['Tb2EntityGrid.jikanTm'], 72, 'notblank', null),
        Column.dec2('SURYO_QT', Messages['Tb2EntityGrid.suryoQt'], 72, 'notblank', null),
        Column.dec3('TANKA_KG', Messages['Tb2EntityGrid.tankaKg'], 88, 'notblank', null),
        Column.dec3('ZEINUKI_KG', Messages['Tb2EntityGrid.zeinukiKg'], 88, 'notblank', null),
        Column.link('FILE_PATH', Messages['Tb2EntityGrid.filePath'], 300, 'notblank'),
        Column.text('NULL_ENTITY_NM', Messages['Tb2EntityGrid.nullEntityNm'], 160, '', null),
        Column.text('NULL_ENTITY_MEI', Messages['Tb2EntityGrid.nullEntityMei'], 300, '', null),
        Column.check('NULL_CHECK_F', Messages['Tb2EntityGrid.nullCheckF'], 30, ''),
        Column.select('NULL_RADIO_KB', Messages['Tb2EntityGrid.nullRadioKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.select('NULL_PULLDOWN_KB', Messages['Tb2EntityGrid.nullPulldownKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
        Column.longText('NULL_MEMO_TX', Messages['Tb2EntityGrid.nullMemoTx'], 300, '', null),
        Column.text('NULL_NEN_Y', Messages['Tb2EntityGrid.nullNenY'], 32, '', null),
        Column.text('NULL_TSUKI_M', Messages['Tb2EntityGrid.nullTsukiM'], 30, '', null),
        Column.text('NULL_HI_D', Messages['Tb2EntityGrid.nullHiD'], 30, '', null),
        Column.month('NULL_NENGETSU_YM', Messages['Tb2EntityGrid.nullNengetsuYm'], 48, '', null),
        Column.date8('NULL_NENGAPPI_YMD', Messages['Tb2EntityGrid.nullNengappiYmd'], 64, '', null),
        Column.text('NULL_TIMESTAMP_TS', Messages['Tb2EntityGrid.nullTimestampTs'], 184, '', Slick.Formatters.Extends.Timestamp),
        Column.dateTime('NULL_NICHIJI_DT', Messages['Tb2EntityGrid.nullNichijiDt'], 152, ''),
        Column.date('NULL_HIDUKE_BI', Messages['Tb2EntityGrid.nullHidukeBi'], 80, '', Slick.Formatters.Extends.Date),
        Column.time('NULL_JIKOKU_HM', Messages['Tb2EntityGrid.nullJikokuHm'], 40, '', null),
        Column.text('NULL_JIKAN_TM', Messages['Tb2EntityGrid.nullJikanTm'], 72, '', null),
        Column.dec2('NULL_SURYO_QT', Messages['Tb2EntityGrid.nullSuryoQt'], 72, '', null),
        Column.dec3('NULL_TANKA_KG', Messages['Tb2EntityGrid.nullTankaKg'], 88, '', null),
        Column.dec3('NULL_ZEINUKI_KG', Messages['Tb2EntityGrid.nullZeinukiKg'], 88, '', null),
        Column.cell('UPDATE_TS', Messages['Tb2EntityGrid.updateTs'], 184, 'metaInfo', Slick.Formatters.Extends.Timestamp),
        Column.check('DELETE_F', Messages['Tb2EntityGrid.deleteF'], 30, ''),
        Column.select('STATUS_KB', Messages['Tb2EntityGrid.statusKb'], 30, '', { json: 'MsyKbnValSearch.json', paramkey: 'KBN_NM', value: 'KBN_VAL', label: 'KBN_VAL_MEI' }),
    ];
});
