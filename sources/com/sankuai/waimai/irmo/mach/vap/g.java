package com.sankuai.waimai.irmo.mach.vap;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.Mach;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class g {
    public static ChangeQuickRedirect a;
    private static volatile g c;
    public String b;

    public static g a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a98df1ca7197c1f2907bcc659b0948a4", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a98df1ca7197c1f2907bcc659b0948a4");
        }
        if (c == null) {
            synchronized (g.class) {
                if (c == null) {
                    c = new g();
                }
            }
        }
        return c;
    }

    public final void a(com.sankuai.waimai.mach.component.base.a aVar) {
        com.sankuai.waimai.mach.manager.cache.e machBundle;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f68f251368db93f02d7b44fb5efea09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f68f251368db93f02d7b44fb5efea09d");
            return;
        }
        Mach mach = aVar.m;
        if (mach == null || (machBundle = mach.getMachBundle()) == null) {
            return;
        }
        this.b = machBundle.j;
    }
}
