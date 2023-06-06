package com.unionpay.mobile.android.utils;
/* loaded from: classes6.dex */
public final class k {
    private static boolean a = false;
    private static int b = Integer.MAX_VALUE;

    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int a(int r2, java.lang.String r3, java.lang.String r4) {
        /*
            r0 = 0
            if (r3 == 0) goto L8e
            if (r4 == 0) goto L8e
            switch(r2) {
                case 2: goto L1d;
                case 3: goto L18;
                case 4: goto L13;
                case 5: goto Le;
                case 6: goto L9;
                default: goto L8;
            }
        L8:
            goto L22
        L9:
            int r2 = android.util.Log.e(r3, r4)
            goto L21
        Le:
            int r2 = android.util.Log.w(r3, r4)
            goto L21
        L13:
            int r2 = android.util.Log.i(r3, r4)
            goto L21
        L18:
            int r2 = android.util.Log.d(r3, r4)
            goto L21
        L1d:
            int r2 = android.util.Log.v(r3, r4)
        L21:
            r0 = r2
        L22:
            boolean r2 = com.unionpay.mobile.android.utils.k.a
            if (r2 == 0) goto L8e
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r1 = "[ ERROR ] "
            r2.<init>(r1)
            r2.append(r3)
            java.lang.String r3 = ":"
            r2.append(r3)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            java.io.File r3 = android.os.Environment.getExternalStorageDirectory()     // Catch: java.io.IOException -> L8a
            java.io.File r4 = new java.io.File     // Catch: java.io.IOException -> L8a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8a
            r1.<init>()     // Catch: java.io.IOException -> L8a
            java.lang.String r3 = r3.getAbsolutePath()     // Catch: java.io.IOException -> L8a
            r1.append(r3)     // Catch: java.io.IOException -> L8a
            java.lang.String r3 = java.io.File.separator     // Catch: java.io.IOException -> L8a
            r1.append(r3)     // Catch: java.io.IOException -> L8a
            java.lang.String r3 = "upmp_log.txt"
            r1.append(r3)     // Catch: java.io.IOException -> L8a
            java.lang.String r3 = r1.toString()     // Catch: java.io.IOException -> L8a
            r4.<init>(r3)     // Catch: java.io.IOException -> L8a
            boolean r3 = r4.exists()     // Catch: java.io.IOException -> L8a
            if (r3 != 0) goto L68
            r4.createNewFile()     // Catch: java.io.IOException -> L8a
        L68:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L8a
            r3.<init>()     // Catch: java.io.IOException -> L8a
            r3.append(r2)     // Catch: java.io.IOException -> L8a
            java.lang.String r2 = "\n"
            r3.append(r2)     // Catch: java.io.IOException -> L8a
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> L8a
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L8a
            r1 = 1
            r3.<init>(r4, r1)     // Catch: java.io.IOException -> L8a
            byte[] r2 = r2.getBytes()     // Catch: java.io.IOException -> L8a
            r3.write(r2)     // Catch: java.io.IOException -> L8a
            r3.close()     // Catch: java.io.IOException -> L8a
            goto L8e
        L8a:
            r2 = move-exception
            r2.printStackTrace()
        L8e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unionpay.mobile.android.utils.k.a(int, java.lang.String, java.lang.String):int");
    }

    public static int a(String str, String str2) {
        if (b <= 3) {
            a(3, str, str2);
            return 0;
        }
        return 0;
    }

    public static int b(String str, String str2) {
        if (b <= 4) {
            a(4, str, str2);
            return 0;
        }
        return 0;
    }

    public static int c(String str, String str2) {
        if (b <= 6) {
            return a(6, str, str2);
        }
        return 0;
    }
}
