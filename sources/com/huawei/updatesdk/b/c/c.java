package com.huawei.updatesdk.b.c;

import android.os.Build;
import android.text.TextUtils;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class c {
    private String a;
    private String b;

    public abstract String a();

    public abstract int b();

    abstract String c();

    abstract String d();

    public String e() {
        if (TextUtils.isEmpty(this.b)) {
            this.b = c();
            if (TextUtils.isEmpty(this.b)) {
                this.b = Build.MANUFACTURER;
            }
            return this.b;
        }
        return this.b;
    }

    public String f() {
        if (TextUtils.isEmpty(this.a)) {
            this.a = d();
            if (TextUtils.isEmpty(this.a)) {
                this.a = Build.MODEL;
            }
            return this.a;
        }
        return this.a;
    }

    public abstract List<String> g();
}
