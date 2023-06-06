package com.sankuai.eh.component.web.bridge.local;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d extends a {
    public static ChangeQuickRedirect d;

    @Override // com.sankuai.eh.component.web.bridge.local.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c915057db10c0a6d0a09ed6f1be905d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c915057db10c0a6d0a09ed6f1be905d");
        } else {
            a("null js handler");
        }
    }
}
