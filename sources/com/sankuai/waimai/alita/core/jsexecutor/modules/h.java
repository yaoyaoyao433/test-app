package com.sankuai.waimai.alita.core.jsexecutor.modules;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "finishCallBack";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e78d4859c1e619aa57a124c6c65beb85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e78d4859c1e619aa57a124c6c65beb85");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge finishCallBack: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        Object[] objArr2 = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = a.a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61d1d3ed5f5fd79499f261293226f1a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61d1d3ed5f5fd79499f261293226f1a7");
            return;
        }
        com.sankuai.waimai.alita.core.jsexecutor.g a = a(str);
        if (a != null) {
            a.b(str, str2, str3);
        }
    }
}
