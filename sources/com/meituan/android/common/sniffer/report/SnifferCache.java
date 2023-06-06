package com.meituan.android.common.sniffer.report;

import android.text.TextUtils;
import com.meituan.android.common.kitefly.Log;
import com.meituan.android.common.metricx.utils.Logger;
import com.meituan.android.common.sniffer.Sniffer;
import com.meituan.android.common.sniffer.bean.SnifferLogEntity;
import com.meituan.android.common.sniffer.db.SnifferDBHandler;
import com.meituan.metrics.laggy.anr.MetricsAnrManager;
import com.sankuai.android.jarvis.c;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SnifferCache {
    private final int QUEUE_MAX_SIZE;
    private SnifferDBHandler mDbHandler;
    final BlockingQueue<SnifferLogEntity> queue;
    ScheduledExecutorService snifferComsumer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static final class SubHolder {
        private static final SnifferCache INSTANCES = new SnifferCache();

        private SubHolder() {
        }
    }

    public static SnifferCache getInstance() {
        return SubHolder.INSTANCES;
    }

    private SnifferCache() {
        this.QUEUE_MAX_SIZE = 1000;
        this.queue = new LinkedBlockingDeque(1000);
        this.mDbHandler = new SnifferDBHandler(Sniffer.getContext());
    }

    void ensureComsumer() {
        if (this.snifferComsumer == null) {
            this.snifferComsumer = c.c("sniffer_consumer");
            this.snifferComsumer.schedule(new Runnable() { // from class: com.meituan.android.common.sniffer.report.SnifferCache.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ArrayList arrayList = new ArrayList();
                        while (!SnifferCache.this.queue.isEmpty()) {
                            arrayList.add(SnifferCache.this.queue.poll());
                        }
                        SnifferCache.this.mDbHandler.cacheBatch(arrayList);
                    } finally {
                        try {
                        } finally {
                        }
                    }
                }
            }, MetricsAnrManager.ANR_THRESHOLD, TimeUnit.MILLISECONDS);
        }
    }

    public void cacheData(String str, Log.Builder builder, long j) {
        if (TextUtils.isEmpty(str) || builder == null) {
            return;
        }
        String md5 = md5(str);
        if (TextUtils.isEmpty(md5)) {
            SnifferExReport.reportErrorLog(SnifferExReport.ERROR_MODULE_FAILED, "keyMd5", "key Md5 failed. key = " + str);
            return;
        }
        SnifferLogEntity snifferLogEntity = new SnifferLogEntity();
        snifferLogEntity.md5 = md5;
        snifferLogEntity.logData = builder;
        snifferLogEntity.weight = j;
        try {
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (this.queue.size() >= 1000) {
            Logger.getMetricxLogger().e("Sniffer queue is full！");
            return;
        }
        this.queue.put(snifferLogEntity);
        ensureComsumer();
    }

    public List<Log> queryAll() {
        return this.mDbHandler.queryAll();
    }

    public void clear() {
        this.mDbHandler.deleteAll();
    }

    private static String md5(String str) {
        byte[] bArr;
        try {
            bArr = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
        } catch (Exception unused) {
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            int i = b & 255;
            if (i < 16) {
                sb.append("0");
            }
            sb.append(Integer.toHexString(i));
        }
        return sb.toString();
    }
}
