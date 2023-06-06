package com.sankuai.waimai.alita.core.jsexecutor.task;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends a {
    public static ChangeQuickRedirect h;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final String f() {
        return "BundleDeleteTask";
    }

    public e(g gVar) {
        super(gVar);
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "603265b6533bfadafcc56ebd49521714", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "603265b6533bfadafcc56ebd49521714");
        }
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.task.a
    public final Runnable g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1988690c88c3a37925a471646bbb9d33", RobustBitConfig.DEFAULT_VALUE) ? (Runnable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1988690c88c3a37925a471646bbb9d33") : new Runnable() { // from class: com.sankuai.waimai.alita.core.jsexecutor.task.e.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8cf65c7d0746be04dedb7301e12d7f87", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8cf65c7d0746be04dedb7301e12d7f87");
                    return;
                }
                g gVar = e.this.b;
                e eVar = e.this;
                eVar.a("this." + gVar.b + ".onDestroyed();");
                e eVar2 = e.this;
                eVar2.a("delete this." + gVar.b + ";");
            }
        };
    }
}
