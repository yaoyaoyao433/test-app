package com.meituan.msc.mmpviews.text;

import android.text.TextUtils;
import com.meituan.msc.utils.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class a {
    public static ChangeQuickRedirect a;
    MPLeafTextView A;
    CharSequence b;
    int c;
    int d;
    boolean e;
    float f;
    float g;
    int h;
    boolean i;
    boolean j;
    boolean k;
    int l;
    int m;
    String n;
    boolean o;
    boolean p;
    float q;
    float r;
    float s;
    int t;
    int u;
    int v;
    int w;
    boolean x;
    int y;
    TextUtils.TruncateAt z;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d78877a28296a777c9399859ca5d255f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d78877a28296a777c9399859ca5d255f");
            return;
        }
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.y = -1;
        this.z = null;
    }

    public boolean equals(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d494441351e9e9b9670ddc9ab3d901b2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d494441351e9e9b9670ddc9ab3d901b2")).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.c == aVar.c && this.d == aVar.d && this.e == aVar.e && Float.compare(aVar.f, this.f) == 0 && Float.compare(aVar.g, this.g) == 0 && this.h == aVar.h && this.i == aVar.i && this.j == aVar.j && this.k == aVar.k && this.l == aVar.l && this.m == aVar.m && this.o == aVar.o && this.p == aVar.p && Float.compare(aVar.q, this.q) == 0 && Float.compare(aVar.r, this.r) == 0 && Float.compare(aVar.s, this.s) == 0 && this.t == aVar.t && this.u == aVar.u && this.v == aVar.v && this.w == aVar.w && this.x == aVar.x && b.a(this.b, aVar.b) && b.a(this.n, aVar.n) && b.a(this.z, aVar.z) && this.y == aVar.y;
    }

    public int hashCode() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21fa9db828fc734f94b168bed1218481", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21fa9db828fc734f94b168bed1218481")).intValue() : b.a(this.b, Integer.valueOf(this.c), Integer.valueOf(this.d), Boolean.valueOf(this.e), Float.valueOf(this.f), Float.valueOf(this.g), Integer.valueOf(this.h), Boolean.valueOf(this.i), Boolean.valueOf(this.j), Boolean.valueOf(this.k), Integer.valueOf(this.l), Integer.valueOf(this.m), this.n, Boolean.valueOf(this.o), Boolean.valueOf(this.p), Float.valueOf(this.q), Float.valueOf(this.r), Float.valueOf(this.s), Integer.valueOf(this.t), Integer.valueOf(this.u), Integer.valueOf(this.v), Integer.valueOf(this.w), Boolean.valueOf(this.x), this.z, Integer.valueOf(this.y));
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.mmpviews.text.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static class C0451a {
        public static ChangeQuickRedirect a;
        a b;

        public C0451a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854ef1f355d4d7b1df057cd3a8c0b331", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854ef1f355d4d7b1df057cd3a8c0b331");
            } else {
                this.b = new a();
            }
        }
    }
}
