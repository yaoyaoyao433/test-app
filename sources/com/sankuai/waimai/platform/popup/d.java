package com.sankuai.waimai.platform.popup;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.platform.capacity.log.i;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static final d c = new d();
    private String b;

    public d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb8f2b8bfbf4f1491029cf44b02e427f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb8f2b8bfbf4f1491029cf44b02e427f");
        } else {
            this.b = "skyfallNew";
        }
    }

    public static d a() {
        return c;
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "297ca028ea703f44e90e2f14e99b3cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "297ca028ea703f44e90e2f14e99b3cda");
        } else {
            i.c(new c().a(this.b).b("path").d(str).b());
        }
    }

    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3fe1777e8cc9f19c00a34cb2d9b2c173", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3fe1777e8cc9f19c00a34cb2d9b2c173");
        } else {
            i.c(new c().a(this.b).b("info").d(str).b());
        }
    }
}
