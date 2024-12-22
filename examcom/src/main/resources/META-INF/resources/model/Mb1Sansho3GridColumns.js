/**
 * 参照３マスタグリッド定義
 */

let Mb1Sansho3GridColumns = [
    Column.text('SANSHO3_NO', Messages['Mb1Sansho3Grid.sansho3No'], 80, 'primaryKey', null),
    Column.text('SANSHO3_MEI', Messages['Mb1Sansho3Grid.sansho3Mei'], 300, 'notblank', null),
    Column.check('DELETE_F', Messages['Mb1Sansho3Grid.deleteF'], 30, ''),
];