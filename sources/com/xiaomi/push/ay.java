package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
/* loaded from: classes6.dex */
public class ay {
    private static volatile ay a;
    private Context b;

    private ay(Context context) {
        this.b = context;
    }

    public static ay a(Context context) {
        if (a == null) {
            synchronized (ay.class) {
                if (a == null) {
                    a = new ay(context);
                }
            }
        }
        return a;
    }

    public final synchronized void a(String str, String str2, long j) {
        SharedPreferences.Editor edit = this.b.getSharedPreferences(str, 4).edit();
        edit.putLong(str2, j);
        edit.commit();
    }

    public final synchronized void a(String str, String str2, String str3) {
        SharedPreferences.Editor edit = this.b.getSharedPreferences(str, 4).edit();
        edit.putString(str2, str3);
        edit.commit();
    }

    public final synchronized long b(String str, String str2, long j) {
        try {
        } catch (Throwable unused) {
            return 0L;
        }
        return this.b.getSharedPreferences(str, 4).getLong(str2, 0L);
    }

    public final synchronized String b(String str, String str2, String str3) {
        try {
        } catch (Throwable unused) {
            return str3;
        }
        return this.b.getSharedPreferences(str, 4).getString(str2, str3);
    }
}
