package com.sankuai.waimai.machpro;

import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.mach.l;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g {
    public static ChangeQuickRedirect a = null;
    private static Map<String, Object> b = null;
    private static int c = -1;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d086e5d8a38676663fc2e11b4438a226", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d086e5d8a38676663fc2e11b4438a226");
            return;
        }
        String a2 = l.a(context, "waimai_takeout", "mach_pro_switch", "");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            com.sankuai.waimai.machpro.util.a.b("mach_pro_switch-> " + a2);
            b = com.sankuai.waimai.mach.utils.b.a(a2);
        } catch (Exception e) {
            com.sankuai.waimai.machpro.util.a.a(e.getMessage());
        }
    }

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "67b608550a0d1912e536ca939cc7c359", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "67b608550a0d1912e536ca939cc7c359")).booleanValue();
        }
        if (c == -1) {
            if (b == null || !b.containsKey("async_gc")) {
                return true;
            }
            c = com.sankuai.waimai.machpro.util.b.c(b.get("async_gc"));
        }
        return c == 1;
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8ad7f772e5033013e12006a8e55458b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8ad7f772e5033013e12006a8e55458b3")).booleanValue() : (TextUtils.isEmpty(str) || "mach_pro_waimai_restaurant_page".equals(str) || "mach_pro_waimai_restaurant_recommend_helper".equals(str) || "mach_pro_waimai_restaurant_food_list".equals(str) || "mach_pro_waimai_restaurant_reduce_detail".equals(str) || "mach_pro_waimai_pickme".equals(str) || "mach_pro_waimai_restaurant_rest_pop_view".equals(str) || "mach_pro_waimai_restaurant_poi_detail".equals(str) || "mach_pro_waimai_restaurant_food_list_page".equals(str) || "mach_pro_waimai_restaurant_combo_page".equals(str) || "mach_pro_waimai_comment-top-index".equals(str) || "mach_pro_waimai_withdraw_list".equals(str) || "mach_pro_waimai_comment-top-analyze".equals(str) || "mach_pro_waimai_comment-top-calculator".equals(str) || "mach_pro_waimai_comment-top-detail".equals(str) || "mach_pro_waimai_order_middle".equals(str) || "mach_pro_waimai_brand_list".equals(str) || "mach_pro_waimai_media_detail".equals(str) || "mach_pro_waimai_restaurant_page_new".equals(str) || "mach_pro_waimai_brand-rule".equals(str) || "mach_pro_waimai_brand_rule".equals(str) || "mach_pro_waimai_restaurant_rank_page".equals(str)) ? false : true;
    }
}
