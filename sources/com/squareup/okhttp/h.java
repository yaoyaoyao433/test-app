package com.squareup.okhttp;

import com.meituan.robust.common.CommonConstant;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class h {
    public final String a;
    public final String b;

    public h(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof h) {
            h hVar = (h) obj;
            return com.squareup.okhttp.internal.j.a(this.a, hVar.a) && com.squareup.okhttp.internal.j.a(this.b, hVar.b);
        }
        return false;
    }

    public final int hashCode() {
        return (((this.b != null ? this.b.hashCode() : 0) + 899) * 31) + (this.a != null ? this.a.hashCode() : 0);
    }

    public final String toString() {
        return this.a + " realm=\"" + this.b + CommonConstant.Symbol.DOUBLE_QUOTES;
    }
}
