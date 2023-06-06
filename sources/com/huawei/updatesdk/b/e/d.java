package com.huawei.updatesdk.b.e;

import android.os.AsyncTask;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class d extends AsyncTask<Void, Void, String> {
    private String a;
    private String b;

    public d(String str, String str2) {
        this.a = null;
        this.a = str;
        this.b = str2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0066 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:? A[RETURN, SYNTHETIC] */
    @Override // android.os.AsyncTask
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String doInBackground(java.lang.Void... r9) {
        /*
            r8 = this;
            java.lang.String r9 = r8.a
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            r0 = 0
            if (r9 == 0) goto La
            return r0
        La:
            java.lang.String r9 = r8.a
            android.net.Uri r2 = android.net.Uri.parse(r9)
            com.huawei.updatesdk.a.b.a.a r9 = com.huawei.updatesdk.a.b.a.a.c()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            android.content.Context r9 = r9.a()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            android.content.ContentResolver r1 = r9.getContentResolver()     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r9 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6a java.lang.Exception -> L6f
            if (r9 == 0) goto L5d
            boolean r1 = r9.moveToFirst()     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L9b
            if (r1 == 0) goto L5d
            java.lang.String r1 = "homecountry"
            int r1 = r9.getColumnIndex(r1)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L9b
            java.lang.String r1 = r9.getString(r1)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L9b
            com.huawei.updatesdk.service.otaupdate.f r0 = com.huawei.updatesdk.service.otaupdate.f.f()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            r0.a(r1)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            com.huawei.updatesdk.b.b.a r0 = com.huawei.updatesdk.b.b.a.d()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            java.lang.String r2 = r8.b     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            long r3 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            r0.a(r2, r3)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            com.huawei.updatesdk.b.b.a r0 = com.huawei.updatesdk.b.b.a.d()     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            java.lang.String r2 = r8.b     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            r0.b(r2, r1)     // Catch: java.lang.Exception -> L56 java.lang.Throwable -> L9b
            r0 = r1
            goto L64
        L56:
            r0 = move-exception
            goto L73
        L58:
            r1 = move-exception
            r7 = r1
            r1 = r0
            r0 = r7
            goto L73
        L5d:
            java.lang.String r1 = "GetAccountZoneTask"
            java.lang.String r2 = "cursor == null: "
            com.huawei.updatesdk.a.a.a.a(r1, r2)     // Catch: java.lang.Exception -> L58 java.lang.Throwable -> L9b
        L64:
            if (r9 == 0) goto L9a
            r9.close()     // Catch: java.lang.Exception -> L91
            goto L9a
        L6a:
            r9 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
            goto L9c
        L6f:
            r9 = move-exception
            r1 = r0
            r0 = r9
            r9 = r1
        L73:
            java.lang.String r2 = "GetAccountZoneTask"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9b
            java.lang.String r4 = "close cursor error: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L9b
            r3.append(r0)     // Catch: java.lang.Throwable -> L9b
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L9b
            com.huawei.updatesdk.a.a.a.a(r2, r0)     // Catch: java.lang.Throwable -> L9b
            if (r9 == 0) goto L99
            r9.close()     // Catch: java.lang.Exception -> L90
            goto L99
        L90:
            r0 = r1
        L91:
            java.lang.String r9 = "GetAccountZoneTask"
            java.lang.String r1 = "cursor Execption"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r9, r1)
            goto L9a
        L99:
            r0 = r1
        L9a:
            return r0
        L9b:
            r0 = move-exception
        L9c:
            if (r9 == 0) goto La9
            r9.close()     // Catch: java.lang.Exception -> La2
            goto La9
        La2:
            java.lang.String r9 = "GetAccountZoneTask"
            java.lang.String r1 = "cursor Execption"
            com.huawei.updatesdk.a.a.c.a.a.a.b(r9, r1)
        La9:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.b.e.d.doInBackground(java.lang.Void[]):java.lang.String");
    }
}
