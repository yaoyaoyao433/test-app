package com.vivo.identifier;

import android.content.ContentValues;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a {
    private Context a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(Context context) {
        this.a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a(int i, String str, ContentValues[] contentValuesArr) {
        int bulkInsert;
        Uri parse = Uri.parse("content://com.vivo.vms.IdProvider/IdentifierId/STATISTICS_" + str);
        if (parse == null) {
            return false;
        }
        try {
            bulkInsert = this.a.getContentResolver().bulkInsert(parse, contentValuesArr);
            new StringBuilder("insert:").append(bulkInsert);
        } catch (Exception unused) {
            Log.e("VMS_SDK_DB", "return insert is error");
        }
        return bulkInsert != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0079, code lost:
        if (r8 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
        r8.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008a, code lost:
        if (r8 == null) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
        return r0;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String a(int r8, java.lang.String r9) {
        /*
            r7 = this;
            r0 = 0
            switch(r8) {
                case 0: goto L4d;
                case 1: goto L3a;
                case 2: goto L27;
                case 3: goto L20;
                case 4: goto Ld;
                case 5: goto L6;
                default: goto L4;
            }
        L4:
            r2 = r0
            goto L54
        L6:
            java.lang.String r8 = "content://com.vivo.abe.exidentifier/guid"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L53
        Ld:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/OAIDSTATUS_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L53
        L20:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/UDID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L53
        L27:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/AAID_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L53
        L3a:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r1 = "content://com.vivo.vms.IdProvider/IdentifierId/VAID_"
            r8.<init>(r1)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.net.Uri r8 = android.net.Uri.parse(r8)
            goto L53
        L4d:
            java.lang.String r8 = "content://com.vivo.vms.IdProvider/IdentifierId/OAID"
            android.net.Uri r8 = android.net.Uri.parse(r8)
        L53:
            r2 = r8
        L54:
            if (r2 != 0) goto L57
            return r0
        L57:
            android.content.Context r8 = r7.a     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L82
            android.content.ContentResolver r1 = r8.getContentResolver()     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L82
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            android.database.Cursor r8 = r1.query(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L7f java.lang.Exception -> L82
            if (r8 == 0) goto L79
            boolean r9 = r8.moveToNext()     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L8e
            if (r9 == 0) goto L79
            java.lang.String r9 = "value"
            int r9 = r8.getColumnIndex(r9)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L8e
            java.lang.String r9 = r8.getString(r9)     // Catch: java.lang.Exception -> L83 java.lang.Throwable -> L8e
            r0 = r9
        L79:
            if (r8 == 0) goto L8d
        L7b:
            r8.close()
            goto L8d
        L7f:
            r9 = move-exception
            r8 = r0
            goto L8f
        L82:
            r8 = r0
        L83:
            java.lang.String r9 = "VMS_SDK_DB"
            java.lang.String r1 = "return cursor is error"
            android.util.Log.e(r9, r1)     // Catch: java.lang.Throwable -> L8e
            if (r8 == 0) goto L8d
            goto L7b
        L8d:
            return r0
        L8e:
            r9 = move-exception
        L8f:
            if (r8 == 0) goto L94
            r8.close()
        L94:
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vivo.identifier.a.a(int, java.lang.String):java.lang.String");
    }
}
