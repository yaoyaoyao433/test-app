package com.meituan.msc.modules.page.render.rn.fps;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b {
    public static ChangeQuickRedirect a;
    public double b;
    public int c;
    public long d;
    public volatile boolean e;
    double f;
    long g;
    int h;
    private final String i;
    private int j;

    private b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2070b8c525da372cbb3c68b7f3a124fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2070b8c525da372cbb3c68b7f3a124fb");
            return;
        }
        this.b = 2.147483647E9d;
        this.c = 0;
        this.d = 0L;
        this.f = 0.0d;
        this.i = str;
    }

    public b(String str, int i) {
        this(str);
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9a4e6918b6d47160f9860ac90d8108e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9a4e6918b6d47160f9860ac90d8108e");
        } else {
            this.j = i;
        }
    }

    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f607da0d71e42f70876ac771ec2d0e4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f607da0d71e42f70876ac771ec2d0e4")).booleanValue() : !Double.isNaN(this.f);
    }

    public final double b() {
        if (this.f > this.j && this.j > 0) {
            this.f = this.j;
        }
        return this.f;
    }
}
