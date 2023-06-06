package com.tencent.smtt.sdk;
/* loaded from: classes6.dex */
public class a {
    public static int a = 600;
    private static int b;

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0026, code lost:
        r1 = r1.substring(r3 + 9).trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0030, code lost:
        if (r1 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0036, code lost:
        if (r1.length() == 0) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x003e, code lost:
        if (r1.contains(com.meituan.android.common.badge.data.Data.TB_DATA_COL_KEY) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
        r2 = java.lang.Integer.parseInt(r1.substring(0, r1.indexOf(com.meituan.android.common.badge.data.Data.TB_DATA_COL_KEY)).trim()) / 1024;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005a -> B:50:0x0080). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int a() {
        /*
            int r0 = com.tencent.smtt.sdk.a.b
            if (r0 <= 0) goto L7
            int r0 = com.tencent.smtt.sdk.a.b
            return r0
        L7:
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r3 = new java.io.FileReader     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L67 java.io.IOException -> L74
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L67 java.io.IOException -> L74
            java.io.BufferedReader r0 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L67 java.io.IOException -> L74
            r4 = 8192(0x2000, float:1.14794E-41)
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L62 java.lang.Throwable -> L67 java.io.IOException -> L74
        L17:
            java.lang.String r1 = r0.readLine()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            if (r1 == 0) goto L55
            java.lang.String r3 = "MemTotal:"
            int r3 = r1.indexOf(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            r4 = -1
            if (r4 == r3) goto L17
            int r3 = r3 + 9
            java.lang.String r1 = r1.substring(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            if (r1 == 0) goto L55
            int r3 = r1.length()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            if (r3 == 0) goto L55
            java.lang.String r3 = "k"
            boolean r3 = r1.contains(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            if (r3 == 0) goto L55
            java.lang.String r3 = "k"
            int r3 = r1.indexOf(r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            java.lang.String r1 = r1.substring(r2, r3)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L60 java.lang.Throwable -> L83
            int r1 = r1 / 1024
            r2 = r1
        L55:
            r0.close()     // Catch: java.io.IOException -> L59
            goto L80
        L59:
            r0 = move-exception
            r0.printStackTrace()
            goto L80
        L5e:
            r1 = move-exception
            goto L6b
        L60:
            r1 = move-exception
            goto L78
        L62:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
            goto L84
        L67:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L6b:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L80
            r0.close()     // Catch: java.io.IOException -> L59
            goto L80
        L74:
            r0 = move-exception
            r5 = r1
            r1 = r0
            r0 = r5
        L78:
            r1.printStackTrace()     // Catch: java.lang.Throwable -> L83
            if (r0 == 0) goto L80
            r0.close()     // Catch: java.io.IOException -> L59
        L80:
            com.tencent.smtt.sdk.a.b = r2
            return r2
        L83:
            r1 = move-exception
        L84:
            if (r0 == 0) goto L8e
            r0.close()     // Catch: java.io.IOException -> L8a
            goto L8e
        L8a:
            r0 = move-exception
            r0.printStackTrace()
        L8e:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.smtt.sdk.a.a():int");
    }
}
