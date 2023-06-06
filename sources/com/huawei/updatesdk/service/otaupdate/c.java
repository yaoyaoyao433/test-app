package com.huawei.updatesdk.service.otaupdate;

import android.content.Context;
import android.os.AsyncTask;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c {
    private static String a;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public interface a {
        void a(Boolean bool);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class b extends AsyncTask<Void, Void, Boolean> {
        a a;

        public b(a aVar) {
            this.a = aVar;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0071, code lost:
            if (r1 == null) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0073, code lost:
            r1.close();
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0096, code lost:
            if (r1 == null) goto L7;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0099, code lost:
            com.huawei.updatesdk.a.a.c.a.a.a.b("AutoUpdateUtil", "cursor Execption");
         */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00a8 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public java.lang.Boolean doInBackground(java.lang.Void... r11) {
            /*
                r10 = this;
                r11 = 0
                r0 = 0
                com.huawei.updatesdk.a.b.a.a r1 = com.huawei.updatesdk.a.b.a.a.c()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                android.content.Context r1 = r1.a()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                java.lang.String r2 = com.huawei.updatesdk.service.otaupdate.c.a()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                android.net.Uri r4 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                android.content.ContentResolver r3 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                r5 = 0
                r6 = 0
                r7 = 0
                r8 = 0
                android.database.Cursor r1 = r3.query(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> L77 java.lang.Exception -> L7b
                if (r1 == 0) goto L6a
                boolean r11 = r1.moveToFirst()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                if (r11 == 0) goto L6a
                java.lang.String r11 = "isagree"
                int r11 = r1.getColumnIndex(r11)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.String r11 = r1.getString(r11)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                boolean r11 = r11.booleanValue()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.String r2 = "isopenautoupdate"
                int r2 = r1.getColumnIndex(r2)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.String r2 = r1.getString(r2)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                boolean r2 = r2.booleanValue()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.String r3 = "isneverreminder"
                int r3 = r1.getColumnIndex(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.String r3 = r1.getString(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                boolean r3 = r3.booleanValue()     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
                if (r11 == 0) goto L71
                if (r2 != 0) goto L71
                if (r3 != 0) goto L71
                r11 = 1
                r0 = 1
                goto L71
            L68:
                r11 = move-exception
                goto L7f
            L6a:
                java.lang.String r11 = "AutoUpdateUtil"
                java.lang.String r2 = "cursor == null"
                com.huawei.updatesdk.a.a.a.a(r11, r2)     // Catch: java.lang.Exception -> L68 java.lang.Throwable -> La5
            L71:
                if (r1 == 0) goto La0
            L73:
                r1.close()     // Catch: java.lang.Exception -> L99
                goto La0
            L77:
                r0 = move-exception
                r1 = r11
                r11 = r0
                goto La6
            L7b:
                r1 = move-exception
                r9 = r1
                r1 = r11
                r11 = r9
            L7f:
                java.lang.String r2 = "AutoUpdateUtil"
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
                java.lang.String r4 = "close cursor error: "
                r3.<init>(r4)     // Catch: java.lang.Throwable -> La5
                java.lang.String r11 = r11.toString()     // Catch: java.lang.Throwable -> La5
                r3.append(r11)     // Catch: java.lang.Throwable -> La5
                java.lang.String r11 = r3.toString()     // Catch: java.lang.Throwable -> La5
                com.huawei.updatesdk.a.a.a.a(r2, r11)     // Catch: java.lang.Throwable -> La5
                if (r1 == 0) goto La0
                goto L73
            L99:
                java.lang.String r11 = "AutoUpdateUtil"
                java.lang.String r1 = "cursor Execption"
                com.huawei.updatesdk.a.a.c.a.a.a.b(r11, r1)
            La0:
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r0)
                return r11
            La5:
                r11 = move-exception
            La6:
                if (r1 == 0) goto Lb3
                r1.close()     // Catch: java.lang.Exception -> Lac
                goto Lb3
            Lac:
                java.lang.String r0 = "AutoUpdateUtil"
                java.lang.String r1 = "cursor Execption"
                com.huawei.updatesdk.a.a.c.a.a.a.b(r0, r1)
            Lb3:
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.huawei.updatesdk.service.otaupdate.c.b.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* renamed from: a */
        public void onPostExecute(Boolean bool) {
            a aVar = this.a;
            if (aVar != null) {
                aVar.a(bool);
            }
        }
    }

    public void a(Context context, String str, a aVar) {
        if (com.huawei.updatesdk.b.h.b.e(context, str) && f.f().d()) {
            b bVar = new b(aVar);
            com.sankuai.waimai.launcher.util.aop.b.a(bVar, Executors.newSingleThreadExecutor(), new Void[0]);
            try {
                a = String.format(Locale.ROOT, "content://%s.commondata/item/4", str);
                bVar.get(500L, TimeUnit.MILLISECONDS);
                return;
            } catch (Exception e) {
                bVar.cancel(true);
                com.huawei.updatesdk.a.a.a.a("AutoUpdateUtil", "init AutoUpdateInfo error: " + e.toString());
            }
        }
        aVar.a(Boolean.FALSE);
    }
}
