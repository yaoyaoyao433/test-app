package com.huawei.updatesdk.b.b;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class b {
    private SharedPreferences a;

    private b(SharedPreferences sharedPreferences) {
        this.a = sharedPreferences;
    }

    public static b a(String str, Context context) {
        SharedPreferences sharedPreferences;
        try {
            if (Build.VERSION.SDK_INT >= 24) {
                context = context.createDeviceProtectedStorageContext();
            }
            sharedPreferences = context.getSharedPreferences(str, 0);
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("SharedPreferencesWrapper", "getSharedPreference error");
            sharedPreferences = null;
        }
        return new b(sharedPreferences);
    }

    public long a(String str, long j) {
        try {
            return this.a.getLong(str, j);
        } catch (Exception unused) {
            return j;
        }
    }

    public String a(String str, String str2) {
        try {
            return this.a.getString(str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    public void a(String str) {
        try {
            if (this.a.contains(str)) {
                SharedPreferences.Editor edit = this.a.edit();
                edit.remove(str);
                edit.commit();
            }
        } catch (Exception unused) {
            com.huawei.updatesdk.a.a.c.a.a.a.b("SharedPreferencesWrapper", "remove error!!key:" + str);
        }
    }

    public void b(String str, long j) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putLong(str, j);
            edit.commit();
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("SharedPreferencesWrapper", "putLong error!!key:" + str, e);
        }
    }

    public void b(String str, String str2) {
        try {
            SharedPreferences.Editor edit = this.a.edit();
            edit.putString(str, str2);
            edit.commit();
        } catch (Exception e) {
            com.huawei.updatesdk.a.a.c.a.a.a.a("SharedPreferencesWrapper", "putString error!!key:" + str, e);
        }
    }
}
