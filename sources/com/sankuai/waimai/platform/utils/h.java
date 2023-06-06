package com.sankuai.waimai.platform.utils;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static String a(Context context, Throwable th) {
        Object[] objArr = {context, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3231b1703854bd7f3c8410297bf62a71", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3231b1703854bd7f3c8410297bf62a71");
        }
        if (th != null && (th instanceof com.sankuai.waimai.platform.modular.network.error.a)) {
            th = ((com.sankuai.waimai.platform.modular.network.error.a) th).d();
        }
        return ((context == null || com.sankuai.waimai.foundation.utils.p.f(context)) && (th == null || th.getMessage() == null || !th.getMessage().equalsIgnoreCase("cip tunnel timeout."))) ? "" : context.getString(R.string.wm_common_loading_fail_without_network);
    }
}
