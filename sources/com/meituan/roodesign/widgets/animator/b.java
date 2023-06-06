package com.meituan.roodesign.widgets.animator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Objects;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b implements com.meituan.roodesign.widgets.internal.pool.b {
    public static ChangeQuickRedirect a;
    public long[] b;
    public float[] c;
    public float d;
    long e;
    public String f;
    private a g;

    public b(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d965e99a0f8e8521df97a3cf6608ba2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d965e99a0f8e8521df97a3cf6608ba2");
            return;
        }
        this.d = 100.0f;
        this.g = aVar;
    }

    public final b a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f4ff681a8250ddda67b1aaabe7a09fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f4ff681a8250ddda67b1aaabe7a09fd");
        }
        this.e = j;
        return this;
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e3f58bf6c1e573dc9521d303126a5de", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e3f58bf6c1e573dc9521d303126a5de")).booleanValue() : d() != 0;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e47c88719d68617b6fafc1e13e07ceb3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e47c88719d68617b6fafc1e13e07ceb3")).booleanValue() : this.e != 0 && e() == this.e;
    }

    private long d() {
        if (this.b == null || this.b.length == 0) {
            return 0L;
        }
        return this.b[0];
    }

    private long e() {
        if (this.b == null || this.b.length == 0) {
            return 0L;
        }
        return this.b[this.b.length - 1];
    }

    public final float c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9389e1e2b8a02baf5e6bbe95a4dfe074", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9389e1e2b8a02baf5e6bbe95a4dfe074")).floatValue();
        }
        if (this.c == null && this.c.length == 0) {
            return 0.0f;
        }
        return a(this.c.length - 1);
    }

    public final float a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d7e99785728ce8e36f4fbf50d225c35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d7e99785728ce8e36f4fbf50d225c35")).floatValue();
        }
        if (!(this.c == null && this.c.length == 0) && i >= 0 && i < this.c.length) {
            return this.c[i] / this.d;
        }
        return 0.0f;
    }

    public final boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6897b7921393ea70f017da375ca2527b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6897b7921393ea70f017da375ca2527b")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return Float.compare(bVar.d, this.d) == 0 && this.e == bVar.e && Arrays.equals(this.b, bVar.b) && Arrays.equals(this.c, bVar.c) && Objects.equals(this.f, bVar.f);
    }

    public final int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acfefbd5603990167cf3827bcac4c250", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acfefbd5603990167cf3827bcac4c250")).intValue() : (((Objects.hash(Float.valueOf(this.d), Long.valueOf(this.e), this.f) * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    public static class a extends com.meituan.roodesign.widgets.internal.pool.a<b> {
        public static ChangeQuickRedirect a;
        private static a d;

        @Override // com.meituan.roodesign.widgets.internal.pool.a
        public final /* synthetic */ b b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d26c286bc96e0138b8717143560781", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d26c286bc96e0138b8717143560781") : new b(this);
        }

        public static synchronized a a() {
            synchronized (a.class) {
                Object[] objArr = new Object[0];
                ChangeQuickRedirect changeQuickRedirect = a;
                if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "af6c3b254c262c0b8b0d854921b25383", RobustBitConfig.DEFAULT_VALUE)) {
                    return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "af6c3b254c262c0b8b0d854921b25383");
                }
                if (d == null) {
                    d = new a();
                }
                d.c = 0;
                return d;
            }
        }
    }
}
