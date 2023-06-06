package com.xiaomi.push;

import android.content.ContentValues;
import android.content.Context;
import com.xiaomi.push.bm;
/* loaded from: classes6.dex */
public final class bj extends bm.e {
    private String a;

    private bj(String str, ContentValues contentValues, String str2) {
        super(str, contentValues);
        this.a = "MessageInsertJob";
        this.a = str2;
    }

    public static bj a(Context context, String str, he heVar) {
        byte[] a = ik.a(heVar);
        if (a == null || a.length <= 0) {
            return null;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("status", (Integer) 0);
        contentValues.put("messageId", "");
        contentValues.put("messageItemId", heVar.i);
        contentValues.put("messageItem", a);
        contentValues.put("appId", az.a(context).c);
        contentValues.put("packageName", az.a(context).b);
        contentValues.put("createTimeStamp", Long.valueOf(System.currentTimeMillis()));
        contentValues.put("uploadTimestamp", (Integer) 0);
        return new bj(str, contentValues, "a job build to insert message to db");
    }
}
