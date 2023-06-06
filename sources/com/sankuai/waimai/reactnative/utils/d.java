package com.sankuai.waimai.reactnative.utils;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a;
    public static String[] b = {"rn_waimai_wm-recently-often-eat", "rn_waimai_city-delivery-subpage", "rn_waimai_wm-similar-poi-page", "rn_waimai_all-subcategory", "rn_waimai_coupon-poilist", "rn_waimai_my-address", "rn_waimai_wm-city-list", "rn_waimai_coupon-poilist", "rn_waimai_wm-search-recommend-card", "rn_waimai_too-far-page", "rn_waimai_self-delivery", "rn_waimai_subcategory-today-recommed", "rn_waimai_coupon-unavailable-poilist", "rn_waimai_applyrefund", "rn_waimai_refundstatus", "rn_waimai_order-edit-info", "rn_waimai_order-recommend", "rn_waimai_pay-by-another", "rn_waimai_order-address-modify", "rn_waimai_food-security", "rn_waimai_coupon-collection", "rn_waimai_redpacket", "rn_waimai_coupon-list", "rn_waimai_coupon-refund-detail", "rn_waimai_expired-redpacket", "rn_waimai_select-redpacket", "rn_waimai_expired-coupon", "rn_waimai_coupon-select", "rn_waimai_coupon-record", "rn_waimai_order-detail", "rn_waimai_multi-person-bill", "rn_waimai_poialbum", "rn_waimai_goods-comment", "rn_waimai_multi-person", "rn_waimai_globalcart", "rn_waimai_productRank", "rn_waimai_interactionRecommend", "rn_waimai_want-to-eat", "rn_waimai_private-menu", "rn_waimai_search-label-rank", "rn_waimai_search-non-delivery", "rn_waimai_wm-search-recommend-card"};

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8eaa96ff7a931fbfec7a0b70bb8e2af3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8eaa96ff7a931fbfec7a0b70bb8e2af3")).booleanValue();
        }
        if (!TextUtils.isEmpty(str)) {
            for (String str2 : b) {
                if (str2.equals(str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
