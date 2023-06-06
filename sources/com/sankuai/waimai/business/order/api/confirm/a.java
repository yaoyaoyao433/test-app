package com.sankuai.waimai.business.order.api.confirm;

import android.text.TextUtils;
import com.meituan.android.singleton.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.monitor.model.ErrorCode;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public static String b;

    static {
        if (com.sankuai.waimai.foundation.core.a.e()) {
            b = "scheme_order_common_mt_android";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            b = "scheme_order_common_dp_android";
        } else {
            b = "scheme_order_common_android";
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b3986d0bbff7e4758bafe18ee076ab5d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b3986d0bbff7e4758bafe18ee076ab5d")).booleanValue();
        }
        ABStrategy strategy = ABTestManager.getInstance(b.a).getStrategy(b, null);
        if (strategy == null || TextUtils.isEmpty(strategy.expName)) {
            return false;
        }
        return strategy.expName.equalsIgnoreCase(ErrorCode.ERROR_TYPE_B);
    }
}
