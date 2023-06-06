package com.meituan.android.common.metricx.utils;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.IOUtils;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
import java.util.concurrent.locks.ReentrantLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProcessLock {
    public static final String LOCK_BABEL = "kitefly.lock";
    public static final String LOCK_METRICS = "metrics.lock";
    public static final String LOCK_METRICS_TRAFFIC = "metrics_traffic.lock";
    public static final String LOCK_SNIFFER = "sniffer.lock";
    private static final int LOCK_WAIT_EACH_TIME = 10;
    private static final int MAX_LOCK_ATTEMPTS = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static ReentrantLock sLock = new ReentrantLock();
    private FileLock cacheLock;
    private FileChannel lockChannel;
    private final RandomAccessFile lockRaf;

    public static ProcessLock lock(Context context, String str) throws IOException {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c725ff4074697ca32156b499ecf42f26", RobustBitConfig.DEFAULT_VALUE)) {
            return (ProcessLock) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c725ff4074697ca32156b499ecf42f26");
        }
        if (context == null) {
            return null;
        }
        return new ProcessLock(context, str);
    }

    public ProcessLock(Context context, String str) throws IOException {
        FileLock lock;
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c951657823270179c9277f3ec2cd7c65", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c951657823270179c9277f3ec2cd7c65");
            return;
        }
        File cache = StoreUtils.getCache(context, "/kitefly/" + str);
        if (!cache.exists()) {
            cache.getParentFile().mkdirs();
            cache.createNewFile();
        }
        this.lockRaf = new RandomAccessFile(cache, "rw");
        if (this.lockRaf == null) {
            return;
        }
        this.lockChannel = this.lockRaf.getChannel();
        if (this.lockChannel == null || sLock.isHeldByCurrentThread()) {
            return;
        }
        sLock.lock();
        FileLock fileLock = null;
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            i++;
            try {
                lock = this.lockChannel.lock();
            } catch (Exception e) {
                e = e;
            }
            if (lock != null) {
                fileLock = lock;
                break;
            }
            try {
                Thread.sleep(10L);
                fileLock = lock;
            } catch (Exception e2) {
                e = e2;
                fileLock = lock;
                Logger.getBabelLogger().e("getInfoLock Thread failed time:10", e);
            }
        }
        this.cacheLock = fileLock;
    }

    public void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3af720543b8e1746b58a846ce7515dea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3af720543b8e1746b58a846ce7515dea");
            return;
        }
        if (this.cacheLock != null) {
            try {
                if (this.cacheLock.isValid()) {
                    this.cacheLock.release();
                }
            } catch (IOException unused) {
            }
            try {
                sLock.unlock();
            } catch (IllegalMonitorStateException unused2) {
            }
        }
        IOUtils.close(this.lockChannel);
        IOUtils.close(this.lockRaf);
    }
}
