package com.sankuai.waimai.platform.capacity.abtest;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect a;

    public static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f79ba908dfd21d20e1b937d4b5d1cea5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f79ba908dfd21d20e1b937d4b5d1cea5")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("address_sdk_mmp_android", null);
        if (strategy == null || TextUtils.isEmpty(strategy.expName)) {
            return false;
        }
        return strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B);
    }

    public static boolean b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "02e159aea5e4b35d210f8ff86576e595", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "02e159aea5e4b35d210f8ff86576e595")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("order_confirm_mach_alert_android", null);
        if (strategy == null || TextUtils.isEmpty(strategy.expName)) {
            return false;
        }
        return strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B);
    }

    public static String c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2dbc4dfd73baa542146b3f390a5ce781", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2dbc4dfd73baa542146b3f390a5ce781");
        }
        ABStrategy strategy = ABTestManager.getInstance(context).getStrategy("waimai_address_create", null);
        return strategy != null ? strategy.expName : "";
    }
}
