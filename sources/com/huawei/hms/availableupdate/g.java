package com.huawei.hms.availableupdate;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class g {
    public int a;
    public String b;
    public String c;
    public int d;
    public String e;

    public g(String str, int i, String str2, int i2, String str3) {
        this.a = 0;
        this.b = "";
        this.c = "";
        this.d = 0;
        this.e = "";
        this.b = str;
        this.a = i;
        this.c = str2;
        this.d = i2;
        this.e = str3;
    }

    public boolean a() {
        String str;
        return this.a > 0 && this.d > 0 && (str = this.c) != null && !str.isEmpty();
    }
}
