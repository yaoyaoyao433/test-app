package com.alibaba.android.bindingx.core.internal;

import java.util.Collections;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class i {
    String a;
    String b;
    j c;
    String d;
    String e;
    Map<String, Object> f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(String str, String str2, j jVar, String str3, String str4, Map<String, Object> map) {
        this.a = str;
        this.b = str2;
        this.c = jVar;
        this.d = str3;
        this.e = str4;
        if (map == null) {
            this.f = Collections.emptyMap();
        } else {
            this.f = Collections.unmodifiableMap(map);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        i iVar = (i) obj;
        if (this.a == null ? iVar.a == null : this.a.equals(iVar.a)) {
            if (this.c == null ? iVar.c == null : this.c.equals(iVar.c)) {
                if (this.d == null ? iVar.d == null : this.d.equals(iVar.d)) {
                    if (this.e == null ? iVar.e == null : this.e.equals(iVar.e)) {
                        return this.f != null ? this.f.equals(iVar.f) : iVar.f == null;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((this.a != null ? this.a.hashCode() : 0) * 31) + (this.c != null ? this.c.hashCode() : 0)) * 31) + (this.d != null ? this.d.hashCode() : 0)) * 31) + (this.e != null ? this.e.hashCode() : 0)) * 31) + (this.f != null ? this.f.hashCode() : 0);
    }
}
