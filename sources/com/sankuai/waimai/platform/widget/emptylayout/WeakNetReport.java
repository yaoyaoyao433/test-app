package com.sankuai.waimai.platform.widget.emptylayout;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class WeakNetReport {
    public static ChangeQuickRedirect a = null;
    private static ABStrategy b = null;
    private static boolean c = false;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes5.dex */
    public @interface CatCode {
    }

    public static ABStrategy a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a0b7fc40dd7657276aca601e502f89c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ABStrategy) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a0b7fc40dd7657276aca601e502f89c5");
        }
        if (b == null && !c) {
            b = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy("time_limit_interfaces_group", null);
            c = true;
        }
        return b;
    }

    public static void a(int i, Context context) {
        Object[] objArr = {Integer.valueOf(i), context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63d1b0e17ef0ec59d633bc2fd1d2ef46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63d1b0e17ef0ec59d633bc2fd1d2ef46");
            return;
        }
        String str = "waimai_network_retrieve";
        ABStrategy a2 = a();
        if (a2 != null && "true".equals(a2.getParamWithKey("switch"))) {
            str = "waimai_network_retrieve_time_limit_" + a2.expName;
        }
        if (context != null && (context instanceof Activity)) {
            str = str + CommonConstant.Symbol.UNDERLINE + context.getClass().getSimpleName();
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(i, str, SystemClock.elapsedRealtime());
    }

    public static void a(String str, int i, long j, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), new Long(j), str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "12e1f9b923a020e22b29ebd88ffe5125", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "12e1f9b923a020e22b29ebd88ffe5125");
            return;
        }
        ABStrategy a2 = a();
        if (a2 == null || a2.getParams() == null || a2.getParams().isEmpty()) {
            return;
        }
        com.sankuai.waimai.platform.capacity.log.c.a().a(i, (int) j, "waimai_network_" + str2 + CommonConstant.Symbol.UNDERLINE + str);
    }
}
