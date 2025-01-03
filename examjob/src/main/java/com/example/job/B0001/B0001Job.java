package com.example.job.B0001;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.entity.Tb1Entity1;

import jp.co.golorp.emarf.exception.AppError;
import jp.co.golorp.emarf.job.BaseJob;

/**
 * エンティティEntity 追加・照会・更新・削除バッチ
 *
 * @author toshiyuki
 *
 */
public class B0001Job extends BaseJob {

    /**
     * logger
     */
    private static final Logger LOG = LoggerFactory.getLogger(B0001Job.class);

    /**
     * エントリポイント
     *
     * @param args
     */
    public static void main(final String[] args) {
        new B0001Job().run(args);
    }

    /**
     * 主処理
     *
     * @param now
     * @param jobId
     * @param args
     */
    public void running(final LocalDateTime now, final String jobId, final String[] args) {

        // 追加
        Tb1Entity1 tEntity = new Tb1Entity1();
        tEntity.setSosenId(2);
        tEntity.setOyaBn(1);
        tEntity.setEntityBn(1);
        tEntity.setEntity1Mei("1");
        if (tEntity.insert(now, jobId) != 1) {
            throw new AppError("error.cant.insert");
        }

        // 照会
        tEntity = Tb1Entity1.get(1, 1, 1);
        tEntity.getTb1Kos();
        LOG.debug(tEntity.toString());

        // 更新
        tEntity.setEntity1Mei("2");
        if (tEntity.update(now, jobId) != 1) {
            throw new AppError("error.cant.update");
        }

        // 削除
        if (tEntity.delete() != 1) {
            throw new AppError("error.cant.delete");
        }

    }

}
