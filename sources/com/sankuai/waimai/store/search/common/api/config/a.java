package com.sankuai.waimai.store.search.common.api.config;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ba65f9b6db159608f5b0643bf25e30a", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ba65f9b6db159608f5b0643bf25e30a")).booleanValue() : com.sankuai.waimai.store.manager.abtest.a.a("search_locate_optimized", ErrorCode.ERROR_TYPE_B).c();
    }
}
