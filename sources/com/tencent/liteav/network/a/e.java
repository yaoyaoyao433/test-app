package com.tencent.liteav.network.a;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class e {
    public final String a;
    public final int b;
    public final int c;
    public final long d;

    public e(String str, int i, int i2, long j) {
        this.a = str;
        this.b = i;
        this.c = i2 >= 600 ? i2 : 600;
        this.d = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.a.equals(eVar.a) && this.b == eVar.b && this.c == eVar.c && this.d == eVar.d;
    }

    public final boolean a() {
        return this.b == 5;
    }
}
