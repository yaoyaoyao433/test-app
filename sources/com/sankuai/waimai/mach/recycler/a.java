package com.sankuai.waimai.mach.recycler;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a {
    public static ChangeQuickRedirect a;
    protected String b;
    protected com.sankuai.waimai.mach.node.a c;

    public abstract void e();

    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8459dff28a1600b094a7e6aec36c93ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8459dff28a1600b094a7e6aec36c93ac");
        }
    }

    public final String a() {
        return this.b;
    }

    public final com.sankuai.waimai.mach.node.a b() {
        return this.c;
    }

    public final void a(com.sankuai.waimai.mach.node.a aVar) {
        this.c = aVar;
    }

    public final int c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35e31d4e3102beba4013c899afe8642", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35e31d4e3102beba4013c899afe8642")).intValue();
        }
        if (this.c != null) {
            return this.c.t();
        }
        return 0;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d40684e26bf84ea06d54087129a4d838", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d40684e26bf84ea06d54087129a4d838")).intValue();
        }
        if (this.c != null) {
            return this.c.s();
        }
        return 0;
    }
}
