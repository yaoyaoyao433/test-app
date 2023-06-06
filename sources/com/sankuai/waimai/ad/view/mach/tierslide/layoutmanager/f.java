package com.sankuai.waimai.ad.view.mach.tierslide.layoutmanager;

import android.view.animation.Interpolator;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    int b;
    int c;
    Interpolator d;
    int e;
    int f;
    private int g;
    private int h;

    public f(int i, int i2, int i3, Interpolator interpolator) {
        Object[] objArr = {0, 0, 350, interpolator};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e578377379559d91f50c4db9e9b87c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e578377379559d91f50c4db9e9b87c8");
            return;
        }
        this.g = 0;
        this.h = 0;
        this.c = 350;
        this.d = interpolator;
    }

    public f(int i, int i2, int i3, Interpolator interpolator, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), interpolator, Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "820933badc75271848bf1ed8dfc2c1f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "820933badc75271848bf1ed8dfc2c1f1");
            return;
        }
        this.g = i;
        this.h = i2;
        this.c = i3;
        this.d = interpolator;
        this.b = i4;
    }

    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "deeede9f6df73012c29f0c381100defd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "deeede9f6df73012c29f0c381100defd");
            return;
        }
        this.e = this.g - i;
        this.f = this.h - i2;
    }
}
