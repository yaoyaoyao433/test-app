package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.meituan.android.common.horn.Horn;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.uuid.GetUUID;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.irmo.canvas.b;
import com.sankuai.waimai.irmo.utils.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class l extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "INFInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35843a343ffbe219dc47e15743119f1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35843a343ffbe219dc47e15743119f1b");
            return;
        }
        super.init(application);
        com.sankuai.waimai.irmo.a.a().b = application;
        com.sankuai.waimai.irmo.a a2 = com.sankuai.waimai.irmo.a.a();
        b.a aVar = new b.a();
        aVar.d = true ^ com.sankuai.waimai.foundation.core.a.c();
        aVar.b = "waimai";
        aVar.c = com.sankuai.waimai.platform.b.A().c();
        aVar.f = com.sankuai.waimai.platform.b.A().B();
        aVar.e = com.sankuai.waimai.platform.b.A().d();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a.a;
        a2.c = PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "83b81e2f3db23c6fb0cc202e66a0708a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.irmo.canvas.b) PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "83b81e2f3db23c6fb0cc202e66a0708a") : new com.sankuai.waimai.irmo.canvas.b(aVar);
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e84baff0de6d0913aa8cdb511c0ea717", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e84baff0de6d0913aa8cdb511c0ea717");
            return;
        }
        super.idleInit(application);
        com.sankuai.waimai.irmo.a a2 = com.sankuai.waimai.irmo.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.irmo.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5f466ca4bb30f51eaa97f1b9d351d60a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5f466ca4bb30f51eaa97f1b9d351d60a");
            return;
        }
        try {
            com.sankuai.waimai.irmo.resource.a.a().b();
            com.sankuai.waimai.irmo.utils.b a3 = com.sankuai.waimai.irmo.utils.b.a();
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.irmo.utils.b.a;
            if (PatchProxy.isSupport(objArr3, a3, changeQuickRedirect3, false, "71031762531244f32d5a5366006cf620", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, a3, changeQuickRedirect3, false, "71031762531244f32d5a5366006cf620");
            } else {
                Horn.register("infinite_downgrade_switch", new b.C0979b(GetUUID.REGISTER));
                Horn.accessCache("infinite_downgrade_switch", new b.C0979b("accessCache"));
            }
            com.sankuai.waimai.irmo.canvas.a.a().b();
        } catch (Exception e) {
            com.sankuai.waimai.irmo.utils.d.e("Init Error: " + e.getMessage(), new Object[0]);
        }
    }
}
