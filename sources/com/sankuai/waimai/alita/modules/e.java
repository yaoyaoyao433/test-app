package com.sankuai.waimai.alita.modules;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes4.dex */
public final class e extends com.sankuai.waimai.alita.core.jsexecutor.modules.b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.l
    public final String a() {
        return "Core";
    }

    public e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "225da9ae8a8ed9b3dbac67bf03b64fa4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "225da9ae8a8ed9b3dbac67bf03b64fa4");
            return;
        }
        a(a.a, new b());
        a(a.b, new d());
        a(a.c, new WMNetworkRequestMethod());
    }
}
