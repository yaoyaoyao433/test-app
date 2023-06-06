package com.sankuai.waimai.business.page.home.ugc;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.platform.capacity.abtest.a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "755432e454521d38779b30e244034b64", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "755432e454521d38779b30e244034b64")).booleanValue();
        }
        ABStrategy a2 = a("pick_me_pre_request_wm", null);
        return a2 != null && ("A".equals(a2.expName) || ErrorCode.ERROR_TYPE_B.equals(a2.expName));
    }
}
