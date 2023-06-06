package com.alibaba.android.bindingx.core.internal;

import android.support.annotation.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class j {
    public final String a;
    public final String b;

    private j(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public static j a(@Nullable String str, @Nullable String str2) {
        return new j(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        j jVar = (j) obj;
        if (this.a == null ? jVar.a == null : this.a.equals(jVar.a)) {
            return this.b != null ? this.b.equals(jVar.b) : jVar.b == null;
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a != null ? this.a.hashCode() : 0) * 31) + (this.b != null ? this.b.hashCode() : 0);
    }
}
