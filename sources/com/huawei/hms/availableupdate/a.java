package com.huawei.hms.availableupdate;

import android.content.Context;
import android.content.SharedPreferences;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class a {
    public String a;
    public int b;
    public String c;
    public int d;

    public void a(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0);
        this.a = sharedPreferences.getString("mUri", "");
        this.b = sharedPreferences.getInt("mSize", 0);
        this.c = sharedPreferences.getString("mHash", "");
        this.d = sharedPreferences.getInt("mReceived", 0);
    }

    public final void b(Context context, String str) {
        SharedPreferences.Editor edit = context.getSharedPreferences("com.huawei.hms.update.DOWNLOAD_RECORD" + str, 0).edit();
        edit.putString("mUri", this.a);
        edit.putInt("mSize", this.b);
        edit.putString("mHash", this.c);
        edit.putInt("mReceived", this.d);
        edit.commit();
    }

    public void a(String str, int i, String str2) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = 0;
    }

    public void a(Context context, int i, String str) {
        this.d = i;
        b(context, str);
    }

    public int b() {
        return this.b;
    }

    public boolean b(String str, int i, String str2) {
        String str3;
        String str4;
        return str != null && str2 != null && (str3 = this.a) != null && str3.equals(str) && this.b == i && (str4 = this.c) != null && str4.equals(str2) && this.d <= this.b;
    }

    public int a() {
        return this.d;
    }
}
