package com.sankuai.waimai.alita.modules;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.sankuai.waimai.alita.core.jsexecutor.modules.b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.l
    public final String a() {
        return "waimai";
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "864b301ecd68e99590545ddb6aafe952", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "864b301ecd68e99590545ddb6aafe952");
            return;
        }
        a(a.a, new b());
        a(a.b, new d());
        a(a.c, new WMNetworkRequestMethod());
        a(a.d, new c());
    }
}
