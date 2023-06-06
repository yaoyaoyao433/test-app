package com.meituan.android.common.horn;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ProcessLock {
    private static final int LOCK_WAIT_EACH_TIME = 10;
    private static final int MAX_LOCK_ATTEMPTS = 3;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile InnerFile sInnerFile;
    private FileLock cacheLock;

    public static ProcessLock lock(Context context) throws IOException {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "537da1d3439e1290e3b1df24738bd972", 6917529027641081856L)) {
            return (ProcessLock) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "537da1d3439e1290e3b1df24738bd972");
        }
        if (context == null) {
            return null;
        }
        return new ProcessLock(context);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    static class InnerFile {
        public static ChangeQuickRedirect changeQuickRedirect;
        private final FileChannel lockChannel;
        private final RandomAccessFile lockRaf;

        public InnerFile(Context context) throws IOException {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6875203ffc6a8d5b9aa8a67d465963b6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6875203ffc6a8d5b9aa8a67d465963b6");
                return;
            }
            File file = new File(context.getFilesDir() + File.separator + "horn", "horn.lock");
            if (!file.exists()) {
                file.getParentFile().mkdirs();
                file.createNewFile();
            }
            this.lockRaf = new RandomAccessFile(file, "rw");
            this.lockChannel = this.lockRaf.getChannel();
        }
    }

    public ProcessLock(Context context) throws IOException {
        FileLock fileLock;
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1d08777a9767808a5ddfabb37e6bc3e8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1d08777a9767808a5ddfabb37e6bc3e8");
            return;
        }
        FileLock fileLock2 = null;
        if (sInnerFile == null) {
            synchronized (ProcessLock.class) {
                if (sInnerFile == null) {
                    sInnerFile = new InnerFile(context);
                }
            }
        }
        int i = 0;
        while (true) {
            if (i >= 3) {
                fileLock = fileLock2;
                break;
            }
            i++;
            try {
                fileLock = sInnerFile.lockChannel.lock();
            } catch (Exception unused) {
            }
            if (fileLock != null) {
                break;
            }
            try {
                Thread.sleep(10L);
                fileLock2 = fileLock;
            } catch (Exception unused2) {
                fileLock2 = fileLock;
                Logw.e(Logw.TAG, "getInfoLock Thread failed time:10");
            }
        }
        this.cacheLock = fileLock;
    }

    public void close() throws IOException {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dd4caa9305bb7adbe009ee4e286547f8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dd4caa9305bb7adbe009ee4e286547f8");
        } else if (this.cacheLock != null) {
            try {
                if (this.cacheLock.isValid()) {
                    this.cacheLock.release();
                }
            } catch (IOException unused) {
            }
        }
    }
}
