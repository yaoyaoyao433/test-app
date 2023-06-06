package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class v extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "Phoenix";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c99ffa7531b2b62a3df56c834c2941f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c99ffa7531b2b62a3df56c834c2941f2");
            return;
        }
        Object[] objArr2 = {application, "waimai"};
        ChangeQuickRedirect changeQuickRedirect2 = com.meituan.phoenix.b.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "775ca3be7993a88521a935ec1cbe8c02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "775ca3be7993a88521a935ec1cbe8c02");
            return;
        }
        com.meituan.phoenix.b.c = application.getApplicationContext();
        com.meituan.phoenix.b.b = "waimai";
    }
}
