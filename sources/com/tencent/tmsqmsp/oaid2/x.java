package com.tencent.tmsqmsp.oaid2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.database.Cursor;
import com.meituan.android.common.statistics.Constants;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class x {
    public static volatile x g;
    public Boolean e;
    public BroadcastReceiver f;
    public w a = new w(Constants.Environment.KEY_UDID);
    public w b = new w("oaid");
    public w d = new w("vaid");
    public w c = new w("aaid");

    public static z a(Cursor cursor) {
        z zVar = new z(null, 0);
        if (cursor == null) {
            b("parseValue fail, cursor is null.");
        } else if (!cursor.isClosed()) {
            cursor.moveToFirst();
            int columnIndex = cursor.getColumnIndex("value");
            if (columnIndex >= 0) {
                zVar.c = cursor.getString(columnIndex);
            } else {
                b("parseValue fail, index < 0.");
            }
            int columnIndex2 = cursor.getColumnIndex("code");
            if (columnIndex2 >= 0) {
                zVar.a = cursor.getInt(columnIndex2);
            } else {
                b("parseCode fail, index < 0.");
            }
            int columnIndex3 = cursor.getColumnIndex("expired");
            if (columnIndex3 >= 0) {
                zVar.b = cursor.getLong(columnIndex3);
            } else {
                b("parseExpired fail, index < 0.");
            }
        } else {
            b("parseValue fail, cursor is closed.");
        }
        return zVar;
    }

    public static void b(String str) {
        c.a("MzOpenIdManager ".concat(String.valueOf(str)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d0, code lost:
        if (r2 == null) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00d2, code lost:
        r2.close();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(android.content.Context r10, com.tencent.tmsqmsp.oaid2.w r11) {
        /*
            r9 = this;
            r0 = 0
            if (r11 != 0) goto L5
            goto Ld5
        L5:
            boolean r1 = r11.a()
            if (r1 != 0) goto Ld6
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "queryId : "
            r1.<init>(r2)
            java.lang.String r2 = r11.c
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            b(r1)
            java.lang.String r1 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r1)
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcf
            r4 = 0
            r5 = 0
            r1 = 1
            java.lang.String[] r6 = new java.lang.String[r1]     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcf
            java.lang.String r7 = r11.c     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcf
            r8 = 0
            r6[r8] = r7     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcf
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lc7 java.lang.Exception -> Lcf
            if (r2 != 0) goto L59
            r9.a(r10, r8)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Ld0
            boolean r10 = r9.a(r10, r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Ld0
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Ld0
            java.lang.String r1 = "forceQuery isSupported : "
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Ld0
            r11.append(r10)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Ld0
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Ld0
            b(r10)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Ld0
            if (r2 == 0) goto L56
            r2.close()
        L56:
            return r0
        L57:
            r10 = move-exception
            goto Lc9
        L59:
            com.tencent.tmsqmsp.oaid2.z r3 = a(r2)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lc1
            java.lang.String r4 = r3.c     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lc1
            r11.a(r4)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            long r5 = r3.b     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            r11.a(r5)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            int r5 = r3.a     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            r11.a(r5)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            r5.<init>()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            java.lang.String r6 = r11.c     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            r5.append(r6)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            java.lang.String r6 = " errorCode : "
            r5.append(r6)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            int r11 = r11.a     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            r5.append(r11)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            java.lang.String r11 = r5.toString()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            b(r11)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            int r11 = r3.a     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            r3 = 1000(0x3e8, float:1.401E-42)
            if (r11 != r3) goto L93
            if (r2 == 0) goto L92
            r2.close()
        L92:
            return r4
        L93:
            r9.a(r10)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            boolean r11 = r9.a(r10, r8)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            if (r11 == 0) goto La2
            if (r2 == 0) goto La1
            r2.close()
        La1:
            return r4
        La2:
            boolean r10 = r9.a(r10, r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            java.lang.String r1 = "not support, forceQuery isSupported: "
            r11.<init>(r1)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            r11.append(r10)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            b(r10)     // Catch: java.lang.Throwable -> L57 java.lang.Exception -> Lbd
            if (r2 == 0) goto Lbc
            r2.close()
        Lbc:
            return r4
        Lbd:
            if (r2 == 0) goto Ld5
            goto Ld2
        Lc1:
            if (r2 == 0) goto Lc6
            r2.close()
        Lc6:
            return r0
        Lc7:
            r10 = move-exception
            r2 = r0
        Lc9:
            if (r2 == 0) goto Lce
            r2.close()
        Lce:
            throw r10
        Lcf:
            r2 = r0
        Ld0:
            if (r2 == 0) goto Ld5
        Ld2:
            r2.close()
        Ld5:
            return r0
        Ld6:
            java.lang.String r10 = r11.d
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.x.a(android.content.Context, com.tencent.tmsqmsp.oaid2.w):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
        if (r11.resolveContentProvider("com.meizu.flyme.openidsdk", 0) == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.content.Context r10, boolean r11) {
        /*
            r9 = this;
            java.lang.Boolean r0 = r9.e
            r1 = 0
            if (r0 == 0) goto Ld
            if (r11 != 0) goto Ld
            boolean r1 = r0.booleanValue()
            goto L8e
        Ld:
            if (r10 != 0) goto L11
        Lf:
            r0 = 0
            goto L23
        L11:
            android.content.pm.PackageManager r11 = r10.getPackageManager()
            if (r11 != 0) goto L19
            r0 = 0
            goto L1a
        L19:
            r0 = 1
        L1a:
            java.lang.String r2 = "com.meizu.flyme.openidsdk"
            android.content.pm.ProviderInfo r11 = r11.resolveContentProvider(r2, r1)
            if (r11 != 0) goto L23
            goto Lf
        L23:
            if (r0 != 0) goto L2f
            java.lang.String r10 = "is not Supported, for isLegalProvider : false"
            b(r10)
            java.lang.Boolean r10 = java.lang.Boolean.FALSE
            r9.e = r10
            goto L8e
        L2f:
            java.lang.String r11 = "content://com.meizu.flyme.openidsdk/"
            android.net.Uri r3 = android.net.Uri.parse(r11)
            r11 = 0
            android.content.ContentResolver r2 = r10.getContentResolver()     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L87
            r4 = 0
            r5 = 0
            java.lang.String r10 = "supported"
            java.lang.String[] r6 = new java.lang.String[]{r10}     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L87
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L7d java.lang.Exception -> L87
            if (r10 != 0) goto L50
            java.lang.Boolean r11 = java.lang.Boolean.FALSE     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L88
            r9.e = r11     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L88
            goto L50
        L4e:
            r11 = move-exception
            goto L81
        L50:
            com.tencent.tmsqmsp.oaid2.z r11 = a(r10)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            java.lang.String r11 = r11.c     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            java.lang.String r0 = "querySupport, result : "
            java.lang.String r2 = java.lang.String.valueOf(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            java.lang.String r0 = r0.concat(r2)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            b(r0)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            java.lang.String r0 = "0"
            boolean r11 = r0.equals(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            r9.e = r11     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L4e java.lang.Exception -> L79
            if (r10 == 0) goto L78
            r10.close()
        L78:
            return r11
        L79:
            if (r10 == 0) goto L8e
            goto L8b
        L7d:
            r10 = move-exception
            r8 = r11
            r11 = r10
            r10 = r8
        L81:
            if (r10 == 0) goto L86
            r10.close()
        L86:
            throw r11
        L87:
            r10 = r11
        L88:
            if (r10 != 0) goto L8b
            goto L8e
        L8b:
            r10.close()
        L8e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.x.a(android.content.Context, boolean):boolean");
    }

    public final void a(Context context) {
        synchronized (this) {
            if (this.f == null) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.meizu.flyme.openid.ACTION_OPEN_ID_CHANGE");
                v vVar = new v();
                this.f = vVar;
                context.registerReceiver(vVar, intentFilter, "com.meizu.flyme.openid.permission.OPEN_ID_CHANGE", null);
            }
        }
    }

    public static final x a() {
        if (g == null) {
            synchronized (x.class) {
                g = new x();
            }
        }
        return g;
    }

    public w a(String str) {
        if ("oaid".equals(str)) {
            return this.b;
        }
        if ("vaid".equals(str)) {
            return this.d;
        }
        if ("aaid".equals(str)) {
            return this.c;
        }
        if (Constants.Environment.KEY_UDID.equals(str)) {
            return this.a;
        }
        return null;
    }
}
