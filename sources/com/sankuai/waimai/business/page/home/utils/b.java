package com.sankuai.waimai.business.page.home.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7a3ed540610292724c232f38fbfd2ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7a3ed540610292724c232f38fbfd2ba5");
        } else {
            JudasManualManager.a("b_zFsP1").a("c_m84bv26").a("source", 1).a("type", com.sankuai.waimai.business.page.home.helper.b.a().c ? 1 : 0).a();
        }
    }
}
