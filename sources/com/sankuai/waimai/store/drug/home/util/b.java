package com.sankuai.waimai.store.drug.home.util;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a = null;
    public static String b = "api_request_num";
    public static String c = "page_first_render_flag";
    public static String d = "first_sub_tab_code";
    public static String e = "quick_filter_selected_json";
    public static String f = "quick_filter_selected_code";
    public static String g = "is_exist_super_resource";
    public static String h = "is_price_update";

    private static void a(com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "47727c13ff35a7c1bf5456526da0aa17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "47727c13ff35a7c1bf5456526da0aa17");
        } else if (aVar.aC == null) {
            aVar.aC = new HashMap();
        }
    }

    private static boolean b(com.sankuai.waimai.store.param.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c91ea4be7839675905ca8a7b0600d6c5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c91ea4be7839675905ca8a7b0600d6c5")).booleanValue() : (aVar == null || TextUtils.isEmpty(str)) ? false : true;
    }

    public static void a(com.sankuai.waimai.store.param.a aVar, String str, Object obj) {
        Object[] objArr = {aVar, str, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ee476ca75c126f12e88108444717d07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ee476ca75c126f12e88108444717d07");
        } else if (b(aVar, str)) {
            a(aVar);
            aVar.aC.put(str, obj);
        }
    }

    public static <T> T b(com.sankuai.waimai.store.param.a aVar, String str, T t) {
        T t2;
        Object[] objArr = {aVar, str, t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "01bb2c9f094712ab1d9312265e2db1c9", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "01bb2c9f094712ab1d9312265e2db1c9") : (!b(aVar, str) || aVar.aC == null || (t2 = (T) aVar.aC.get(str)) == null) ? t : t2;
    }

    public static void a(com.sankuai.waimai.store.param.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ee480ee10170e0a533f60101d1498dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ee480ee10170e0a533f60101d1498dc");
        } else if (b(aVar, str)) {
            a(aVar);
            a(aVar, str, Integer.valueOf(((Integer) b(aVar, str, 0)).intValue() + 1));
        }
    }
}
