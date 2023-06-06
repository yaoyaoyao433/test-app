package com.xiaomi.push.service;

import android.annotation.SuppressLint;
import android.content.Context;
import android.provider.Settings;
/* loaded from: classes6.dex */
public final class an {
    private static an a;
    private Context b;
    private int c = 0;

    private an(Context context) {
        this.b = context.getApplicationContext();
    }

    public static an a(Context context) {
        if (a == null) {
            a = new an(context);
        }
        return a;
    }

    @SuppressLint({"NewApi"})
    public final int a() {
        if (this.c != 0) {
            return this.c;
        }
        try {
            this.c = Settings.Global.getInt(this.b.getContentResolver(), "device_provisioned", 0);
        } catch (Exception unused) {
        }
        return this.c;
    }
}
