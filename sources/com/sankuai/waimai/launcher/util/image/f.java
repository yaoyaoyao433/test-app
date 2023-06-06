package com.sankuai.waimai.launcher.util.image;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f {
    public static ChangeQuickRedirect a;
    public String b;
    public double c;
    public double d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public String i;
    public String j;

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b572b48a7cff41c390b4ed393402083b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b572b48a7cff41c390b4ed393402083b");
            return;
        }
        this.c = 1.0d;
        this.d = 1.0d;
        this.e = "";
        this.f = false;
        this.g = false;
        this.h = false;
        this.i = "100";
        this.j = "100";
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff867d634b4fbc5a7e8fc11fdbe5dd1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff867d634b4fbc5a7e8fc11fdbe5dd1b");
        }
        return "WeakNetImageConfig{, midShrinkRatio=" + this.c + ", shrinkRatio=" + this.d + ", bizPage='" + this.e + "', enable=" + this.f + ", midMaxQuality='" + this.i + "', maxQuality='" + this.j + "'}";
    }
}
