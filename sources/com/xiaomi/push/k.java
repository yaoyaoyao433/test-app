package com.xiaomi.push;

import android.content.Context;
import android.os.Build;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileLock;
/* loaded from: classes6.dex */
public final class k {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d6 A[Catch: all -> 0x00ea, IOException -> 0x00ec, LOOP:0: B:36:0x00d0->B:38:0x00d6, LOOP_END, TRY_LEAVE, TryCatch #7 {IOException -> 0x00ec, all -> 0x00ea, blocks: (B:35:0x00cc, B:36:0x00d0, B:38:0x00d6), top: B:62:0x00cc }] */
    /* JADX WARN: Type inference failed for: r8v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean b(android.content.Context r16, java.lang.String r17, long r18) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.k.b(android.content.Context, java.lang.String, long):boolean");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v7, types: [java.io.RandomAccessFile, java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r2v8, types: [android.content.pm.PackageManager] */
    public static boolean a(Context context, String str, long j) {
        FileLock lock;
        ?? r2 = 23;
        if (Build.VERSION.SDK_INT >= 23) {
            r2 = context.getPackageManager();
            if (!(com.sankuai.meituan.takeoutnew.util.aop.f.a(r2, "android.permission.WRITE_EXTERNAL_STORAGE", context.getPackageName()) == 0)) {
                return true;
            }
        }
        FileLock fileLock = null;
        try {
            try {
                File file = new File(new File(context.getExternalFilesDir(null), "/.vdevdir/"), "lcfp.lock");
                b.b(file);
                r2 = new RandomAccessFile(file, "rw");
                try {
                    lock = r2.getChannel().lock();
                } catch (IOException e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                boolean b = b(context, str, j);
                if (lock != null && lock.isValid()) {
                    try {
                        lock.release();
                    } catch (IOException unused) {
                    }
                }
                b.a((Closeable) r2);
                return b;
            } catch (IOException e2) {
                e = e2;
                fileLock = lock;
                e.printStackTrace();
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException unused2) {
                    }
                }
                b.a((Closeable) r2);
                return true;
            } catch (Throwable th2) {
                th = th2;
                fileLock = lock;
                if (fileLock != null && fileLock.isValid()) {
                    try {
                        fileLock.release();
                    } catch (IOException unused3) {
                    }
                }
                b.a((Closeable) r2);
                throw th;
            }
        } catch (IOException e3) {
            e = e3;
            r2 = 0;
        } catch (Throwable th3) {
            th = th3;
            r2 = 0;
        }
    }
}
