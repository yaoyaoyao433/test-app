package com.tencent.smtt.sdk;

import android.content.Context;
import com.tencent.smtt.utils.FileUtil;
import com.tencent.smtt.utils.TbsLog;
import java.nio.channels.FileLock;
/* loaded from: classes6.dex */
public class x {
    private static x a;
    private static FileLock e;
    private y b;
    private boolean c;
    private boolean d;

    private x() {
    }

    public static x a() {
        if (a == null) {
            synchronized (x.class) {
                if (a == null) {
                    a = new x();
                }
            }
        }
        return a;
    }

    private boolean c(Context context) {
        return this.b == null && com.tencent.smtt.utils.r.n(context);
    }

    public y a(boolean z) {
        return z ? this.b : c();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00bf A[Catch: all -> 0x0264, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0030, B:24:0x0093, B:26:0x00bf, B:42:0x0132, B:44:0x013e, B:50:0x0201, B:52:0x0221, B:59:0x0260, B:45:0x0178, B:46:0x01b1, B:48:0x01b7, B:49:0x01f0, B:53:0x0228, B:55:0x0241, B:56:0x0244, B:58:0x024a, B:10:0x0036, B:11:0x0048, B:13:0x0054, B:19:0x0076, B:21:0x007a, B:16:0x005b, B:17:0x0073, B:22:0x0089, B:30:0x00d0, B:32:0x00d6, B:33:0x00e2, B:35:0x00e6, B:36:0x0112, B:38:0x0116), top: B:67:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0228 A[Catch: all -> 0x0264, TryCatch #3 {, blocks: (B:3:0x0001, B:6:0x002c, B:8:0x0030, B:24:0x0093, B:26:0x00bf, B:42:0x0132, B:44:0x013e, B:50:0x0201, B:52:0x0221, B:59:0x0260, B:45:0x0178, B:46:0x01b1, B:48:0x01b7, B:49:0x01f0, B:53:0x0228, B:55:0x0241, B:56:0x0244, B:58:0x024a, B:10:0x0036, B:11:0x0048, B:13:0x0054, B:19:0x0076, B:21:0x007a, B:16:0x005b, B:17:0x0073, B:22:0x0089, B:30:0x00d0, B:32:0x00d6, B:33:0x00e2, B:35:0x00e6, B:36:0x0112, B:38:0x0116), top: B:67:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void a(android.content.Context r12) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.x.a(android.content.Context):void");
    }

    public FileLock b(Context context) {
        String str;
        String str2;
        TbsLog.i("X5CoreEngine", "tryTbsCoreLoadFileLock ##");
        if (e != null) {
            return e;
        }
        synchronized (x.class) {
            if (e == null) {
                FileLock e2 = FileUtil.e(context);
                e = e2;
                if (e2 == null) {
                    str = "X5CoreEngine";
                    str2 = "init -- sTbsCoreLoadFileLock failed!";
                } else {
                    str = "X5CoreEngine";
                    str2 = "init -- sTbsCoreLoadFileLock succeeded: " + e;
                }
                TbsLog.i(str, str2);
            }
        }
        return e;
    }

    public boolean b() {
        if (QbSdk.a) {
            return false;
        }
        return this.c;
    }

    public y c() {
        if (QbSdk.a) {
            return null;
        }
        return this.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return this.d;
    }
}
