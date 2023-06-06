package com.sankuai.waimai.business.restaurant.base;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.e;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class RestaurantSP {
    public static ChangeQuickRedirect a;
    private static e<RestaurantSPKey> b = new e<>("waimai_restaurant_common");

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum RestaurantSPKey {
        SHOPCART_SESSION_CACHE_INTERVAL,
        ENABLE_CART_DATA_CLONE;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static RestaurantSPKey valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6447128f397847068f403521151c0f52", RobustBitConfig.DEFAULT_VALUE) ? (RestaurantSPKey) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6447128f397847068f403521151c0f52") : (RestaurantSPKey) Enum.valueOf(RestaurantSPKey.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static RestaurantSPKey[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1305bbdca15ba628028fb0158c44ce1d", RobustBitConfig.DEFAULT_VALUE) ? (RestaurantSPKey[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1305bbdca15ba628028fb0158c44ce1d") : (RestaurantSPKey[]) values().clone();
        }

        RestaurantSPKey() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8e5061764bed455410c29eef9b9693b2", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8e5061764bed455410c29eef9b9693b2");
            }
        }
    }

    public static void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f78596ac9908986a85ce45af83d47675", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f78596ac9908986a85ce45af83d47675");
        } else {
            b.a((e<RestaurantSPKey>) RestaurantSPKey.SHOPCART_SESSION_CACHE_INTERVAL, i);
        }
    }

    public static int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "404090a0b43b5a684ec8287076536cb7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "404090a0b43b5a684ec8287076536cb7")).intValue() : b.b((e<RestaurantSPKey>) RestaurantSPKey.SHOPCART_SESSION_CACHE_INTERVAL, 0);
    }

    public static void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "96a2d6c32f7176e69dd7c78030b52c28", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "96a2d6c32f7176e69dd7c78030b52c28");
        } else {
            b.a((e<RestaurantSPKey>) RestaurantSPKey.ENABLE_CART_DATA_CLONE, z);
        }
    }

    public static boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bdb3b1c86a672b5be12220312d7ffae", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bdb3b1c86a672b5be12220312d7ffae")).booleanValue() : b.b((e<RestaurantSPKey>) RestaurantSPKey.ENABLE_CART_DATA_CLONE, false);
    }
}
