package com.huawei.updatesdk.service.otaupdate;

import android.text.TextUtils;
import com.huawei.hms.common.PackageConstants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class f {
    private static f e = new f();
    private String a;
    private String b;
    private String c = PackageConstants.SERVICES_PACKAGE_APPMARKET;
    private String d;

    private f() {
    }

    public static f f() {
        return e;
    }

    public String a() {
        return !TextUtils.isEmpty(this.a) ? this.a : this.b;
    }

    public void a(String str) {
        this.b = str;
    }

    public String b() {
        return this.a;
    }

    public void b(String str) {
        this.a = str;
    }

    public String c() {
        return this.c;
    }

    public void c(String str) {
        this.d = str;
    }

    public void d(String str) {
        this.c = str;
    }

    public boolean d() {
        String str = this.a;
        if (str != null) {
            return str.equals(this.b);
        }
        return true;
    }

    public boolean e() {
        return TextUtils.equals(this.d, "AppTouch");
    }
}
