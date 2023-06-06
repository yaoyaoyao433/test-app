package com.sankuai.waimai.bussiness.order.base.mach;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.ah;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends b {
    public static ChangeQuickRedirect g;

    public e(Activity activity, String str, String str2) {
        super(activity, str, str2);
        Object[] objArr = {activity, str, str2};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7292f38ebd963e9771a1bac043094d0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7292f38ebd963e9771a1bac043094d0");
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eac0c426ff82b84d00caa3584d21a534", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eac0c426ff82b84d00caa3584d21a534");
            return;
        }
        a(ah.a(this.l));
        super.b();
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void a(com.sankuai.waimai.mach.node.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62bcf44b2136d407fdf6545c45b86415", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62bcf44b2136d407fdf6545c45b86415");
            return;
        }
        com.sankuai.waimai.mach.node.a d = d(aVar);
        if (d != null) {
            com.sankuai.waimai.mach.component.scroller.b bVar = (com.sankuai.waimai.mach.component.scroller.b) d.e.h;
            if (com.sankuai.waimai.foundation.utils.d.a(bVar.e())) {
                return;
            }
            List<Integer> e = bVar.e();
            int indexOf = d.e.b().indexOf(d);
            if (indexOf < 0 || !e.contains(Integer.valueOf(indexOf))) {
                return;
            }
            c(aVar);
            return;
        }
        super.b(aVar);
    }

    private com.sankuai.waimai.mach.node.a d(com.sankuai.waimai.mach.node.a aVar) {
        while (true) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = g;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0a8ff0bd7a23a37077e2346206bfa5d", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.waimai.mach.node.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0a8ff0bd7a23a37077e2346206bfa5d");
            }
            if (aVar == null) {
                return null;
            }
            if (com.sankuai.waimai.mach.utils.e.a(aVar, com.sankuai.waimai.mach.component.scroller.b.class)) {
                return aVar;
            }
            aVar = aVar.e;
        }
    }

    @Override // com.sankuai.waimai.platform.mach.a
    public final void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = g;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e49772f850397446a8b703c19fdbd657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e49772f850397446a8b703c19fdbd657");
            return;
        }
        super.f();
        this.b = false;
    }
}
