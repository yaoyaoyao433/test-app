package com.huawei.hms.hatool;

import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class i0 implements m0 {
    public byte[] a;
    public String b;
    public String c;
    public String d;
    public String e;
    public List<q> f;

    public i0(byte[] bArr, String str, String str2, String str3, String str4, List<q> list) {
        this.a = (byte[]) bArr.clone();
        this.b = str;
        this.c = str2;
        this.e = str3;
        this.d = str4;
        this.f = list;
    }

    public final b0 a(Map<String, String> map) {
        return a0.a(this.b, this.a, map);
    }

    public final Map<String, String> a() {
        return b1.b(this.c, this.e, this.d);
    }

    public final void b() {
        n0.b().a(new l0(this.f, this.c, this.d, this.e));
    }

    @Override // java.lang.Runnable
    public void run() {
        y.c("hmsSdk", "send data running");
        int a = a(a()).a();
        if (a != 200) {
            b();
            return;
        }
        y.b("hmsSdk", "events PostRequest sendevent TYPE : %s, TAG : %s, resultCode: %d ,reqID:" + this.d, this.e, this.c, Integer.valueOf(a));
    }
}
