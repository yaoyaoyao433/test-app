package com.sankuai.waimai.rocks.log;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.m;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static String a(boolean z) {
        return z ? "rocks_data_first_end_load_prerender" : "rocks_data_end_load_prerender";
    }

    public static String a(String str, boolean z) {
        String str2;
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0aab7e269398ed07b8cf556134b100c6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0aab7e269398ed07b8cf556134b100c6");
        }
        StringBuilder sb = new StringBuilder("rocks_mach_prerender_");
        sb.append(z ? "optimization_" : "");
        if (m.d()) {
            str2 = "preThreadOptOpen_" + m.g() + CommonConstant.Symbol.UNDERLINE;
        } else {
            str2 = "preThreadOptClose_";
        }
        sb.append(str2);
        sb.append(str);
        return sb.toString();
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4312195384b5ae5272dca53058f8347", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4312195384b5ae5272dca53058f8347");
        }
        return "rocks_mach_scroll_" + str;
    }
}
