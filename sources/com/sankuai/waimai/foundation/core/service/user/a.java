package com.sankuai.waimai.foundation.core.service.user;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static EnumC0947a a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.foundation.core.service.user.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public enum EnumC0947a {
        NONE,
        FROM_COLLECT,
        FROM_COUPON,
        FROM_PRODUCT_LIST_PREORDER,
        FROM_ORDER_LIST_PREORDER,
        FROM_ORDER_DETAIL_PREORDER,
        FROM_RETAIL_JSBRIDGE,
        FROM_GLOBAL_SHOP_CART,
        FROM_SMART_ASSISTANT,
        FROM_COMPOSE_ORDER,
        FROM_TODAY_RECOMMEND;
        
        public static ChangeQuickRedirect a;

        EnumC0947a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cb112c8288163b5d25a0040e359908e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cb112c8288163b5d25a0040e359908e");
            }
        }

        public static EnumC0947a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "524428dcc8554ec77d6223ceebb4941d", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0947a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "524428dcc8554ec77d6223ceebb4941d") : (EnumC0947a) Enum.valueOf(EnumC0947a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static EnumC0947a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "417dea1688ad0111e882462a49985e44", RobustBitConfig.DEFAULT_VALUE) ? (EnumC0947a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "417dea1688ad0111e882462a49985e44") : (EnumC0947a[]) values().clone();
        }
    }
}
