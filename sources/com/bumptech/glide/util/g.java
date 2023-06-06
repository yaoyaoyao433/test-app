package com.bumptech.glide.util;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class g {
    private Class<?> a;
    private Class<?> b;

    public g() {
    }

    public g(Class<?> cls, Class<?> cls2) {
        a(cls, cls2);
    }

    public final void a(Class<?> cls, Class<?> cls2) {
        this.a = cls;
        this.b = cls2;
    }

    public final String toString() {
        return "MultiClassKey{first=" + this.a + ", second=" + this.b + '}';
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        g gVar = (g) obj;
        return this.a.equals(gVar.a) && this.b.equals(gVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }
}
