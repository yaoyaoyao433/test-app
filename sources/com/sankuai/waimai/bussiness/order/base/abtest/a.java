package com.sankuai.waimai.bussiness.order.base.abtest;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.waimai.platform.capacity.abtest.a {
    public static ChangeQuickRedirect a = null;
    public static final String b = "wm_orderdetail_openpushwindow";
    public static final String c = "group_orderdetail_openpushwindow";

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e6e62e2cb224f284d41a1496fdd6f85e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e6e62e2cb224f284d41a1496fdd6f85e")).booleanValue();
        }
        String str = "kdg_power";
        if (com.sankuai.waimai.foundation.core.a.e()) {
            str = "kdg_power_mt";
        } else if (com.sankuai.waimai.foundation.core.a.f()) {
            str = "kdg_power_dp";
        }
        ABStrategy a2 = a(str, null);
        return a2 == null || !TextUtils.equals(a2.expName, "kdg_off");
    }
}
