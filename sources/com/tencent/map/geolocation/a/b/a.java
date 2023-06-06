package com.tencent.map.geolocation.a.b;

import android.content.Context;
import java.io.File;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    private static boolean b = false;
    public File a;
    private File c;

    public a(Context context) {
        if (context == null) {
            return;
        }
        try {
            this.a = new File(context.getExternalFilesDir("data").getAbsolutePath() + "/d_l");
        } catch (Throwable unused) {
            this.a = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(byte[] r6) {
        /*
            r5 = this;
            if (r6 == 0) goto L44
            int r0 = r6.length     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L6
            goto L44
        L6:
            java.io.File r0 = r5.c     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L10
            java.io.File r0 = r5.a()     // Catch: java.lang.Throwable -> L43
            r5.c = r0     // Catch: java.lang.Throwable -> L43
        L10:
            java.io.File r0 = r5.c     // Catch: java.lang.Throwable -> L43
            if (r0 != 0) goto L15
            return
        L15:
            r0 = 0
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            java.io.File r3 = r5.c     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r4 = 1
            r2.<init>(r3, r4)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L2f java.io.IOException -> L31
            r1.write(r6)     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L3b
            r1.flush()     // Catch: java.io.IOException -> L32 java.lang.Throwable -> L3b
            r1.close()     // Catch: java.io.IOException -> L2c java.lang.Throwable -> L43
        L2c:
            r5.c = r0     // Catch: java.lang.Throwable -> L43
            return
        L2f:
            r6 = move-exception
            goto L3d
        L31:
            r1 = r0
        L32:
            r5.c = r0     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3a
            r1.close()     // Catch: java.io.IOException -> L3a java.lang.Throwable -> L43
            return
        L3a:
            return
        L3b:
            r6 = move-exception
            r0 = r1
        L3d:
            if (r0 == 0) goto L42
            r0.close()     // Catch: java.io.IOException -> L42 java.lang.Throwable -> L43
        L42:
            throw r6     // Catch: java.lang.Throwable -> L43
        L43:
            return
        L44:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.map.geolocation.a.b.a.a(byte[]):void");
    }

    private File a() {
        try {
            File file = this.a;
            if (!file.exists()) {
                file.mkdirs();
            }
            return new File(file, "d_".concat(String.valueOf(h.a(String.valueOf(System.currentTimeMillis())))));
        } catch (Throwable unused) {
            return null;
        }
    }
}
