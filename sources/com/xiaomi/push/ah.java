package com.xiaomi.push;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
/* loaded from: classes6.dex */
public final class ah implements v {
    private static String a = "content://com.vivo.vms.IdProvider/IdentifierId/";
    private static String b = a + "OAID";
    private static String c = a + "VAID_";
    private static String d = a + "AAID_";
    private static String e = a + "OAIDSTATUS";
    private static String f = "persist.sys.identifierid.supported";
    private Context g;

    public ah(Context context) {
        this.g = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r10 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        r10.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003a, code lost:
        if (r10 == null) goto L7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003d, code lost:
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private java.lang.String a(java.lang.String r10) {
        /*
            r9 = this;
            r0 = 0
            android.content.Context r1 = r9.g     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            android.content.ContentResolver r2 = r1.getContentResolver()     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            android.net.Uri r3 = android.net.Uri.parse(r10)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            android.database.Cursor r10 = r2.query(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L32 java.lang.Exception -> L39
            if (r10 == 0) goto L2c
            boolean r1 = r10.moveToNext()     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            if (r1 == 0) goto L2c
            java.lang.String r1 = "value"
            int r1 = r10.getColumnIndex(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            java.lang.String r1 = r10.getString(r1)     // Catch: java.lang.Throwable -> L27 java.lang.Exception -> L3a
            r0 = r1
            goto L2c
        L27:
            r0 = move-exception
            r8 = r0
            r0 = r10
            r10 = r8
            goto L33
        L2c:
            if (r10 == 0) goto L3d
        L2e:
            r10.close()
            goto L3d
        L32:
            r10 = move-exception
        L33:
            if (r0 == 0) goto L38
            r0.close()
        L38:
            throw r10
        L39:
            r10 = r0
        L3a:
            if (r10 == 0) goto L3d
            goto L2e
        L3d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ah.a(java.lang.String):java.lang.String");
    }

    public static boolean a(Context context) {
        try {
            ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(Uri.parse(a).getAuthority(), 128);
            if (resolveContentProvider != null) {
                if ((resolveContentProvider.applicationInfo.flags & 1) != 0) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    @Override // com.xiaomi.push.v
    public final boolean a() {
        return "1".equals(jq.a(f, "0"));
    }

    @Override // com.xiaomi.push.v
    public final String b() {
        return a(b);
    }
}
