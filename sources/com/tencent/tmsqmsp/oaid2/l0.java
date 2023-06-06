package com.tencent.tmsqmsp.oaid2;

import android.content.Context;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class l0 {
    public Context a;

    public l0(Context context) {
        this.a = context;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            if (r8 == 0) goto L29
            r1 = 1
            if (r8 == r1) goto L1a
            r1 = 2
            if (r8 == r1) goto Lb
            r2 = r0
            goto L30
        Lb:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r8.concat(r9)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L2f
        L1a:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r8 = r8.concat(r9)
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L2f
        L29:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L2f:
            r2 = r8
        L30:
            android.content.Context r8 = r7.a
            android.content.ContentResolver r1 = r8.getContentResolver()
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)
            if (r8 != 0) goto L46
            java.lang.String r8 = "return cursor is null,return"
            com.tencent.tmsqmsp.oaid2.c.b(r8)
            goto L5a
        L46:
            boolean r9 = r8.moveToNext()
            if (r9 == 0) goto L57
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)
            java.lang.String r9 = r8.getString(r9)
            r0 = r9
        L57:
            r8.close()
        L5a:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.tmsqmsp.oaid2.l0.a(int, java.lang.String):java.lang.String");
    }
}
