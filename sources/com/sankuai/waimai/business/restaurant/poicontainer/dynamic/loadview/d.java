package com.sankuai.waimai.business.restaurant.poicontainer.dynamic.loadview;

import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d {
    public static ChangeQuickRedirect a;
    private static ABStrategy b;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "35ba96f0dce545a27a4dc41969e1f130", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "35ba96f0dce545a27a4dc41969e1f130")).booleanValue();
        }
        if (b == null) {
            b = ABTestManager.getInstance(context).getStrategy("restaurant_menu_list_slide_optimize", null);
        }
        return b != null && ErrorCode.ERROR_TYPE_B.equalsIgnoreCase(b.expName);
    }
}
