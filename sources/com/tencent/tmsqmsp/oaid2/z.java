package com.tencent.tmsqmsp.oaid2;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class z {
    public int a;
    public long b = System.currentTimeMillis() + 86400000;
    public String c;

    public z(String str, int i) {
        this.c = str;
        this.a = i;
    }

    public String toString() {
        return "ValueData{value='" + this.c + "', code=" + this.a + ", expired=" + this.b + '}';
    }
}
