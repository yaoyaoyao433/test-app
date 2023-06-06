package com.sankuai.waimai.business.restaurant.goodsdetail;

import android.support.annotation.Keep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.base.shopcart.b;
import com.sankuai.waimai.business.restaurant.base.shopcart.d;
import com.sankuai.waimai.business.restaurant.comment.model.CartInfo;
import com.sankuai.waimai.foundation.utils.e;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class GoodDetailHelper {
    public static ChangeQuickRedirect a;
    public static final Integer b = 1;
    public static final Integer c = 2;
    public static final Integer d = 3;
    public static final Integer e = 4;
    private static e f = new e("restaurant_goods_detail");
    private static a g = a.NONE;

    /* compiled from: ProGuard */
    @Keep
    /* loaded from: classes4.dex */
    public enum GoodsDetailKeys {
        FAVORITE_PRODUCT;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        public static GoodsDetailKeys valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8f613bb3b98fddc331487f40a0dfd297", RobustBitConfig.DEFAULT_VALUE) ? (GoodsDetailKeys) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8f613bb3b98fddc331487f40a0dfd297") : (GoodsDetailKeys) Enum.valueOf(GoodsDetailKeys.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static GoodsDetailKeys[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bb6bd94390992e812f79b81610e8082", RobustBitConfig.DEFAULT_VALUE) ? (GoodsDetailKeys[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bb6bd94390992e812f79b81610e8082") : (GoodsDetailKeys[]) values().clone();
        }

        GoodsDetailKeys() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "19d1feff21743522202570dc90ad08e8", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "19d1feff21743522202570dc90ad08e8");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public enum a {
        NONE,
        FAVORITE_PRODUCT;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea285a369c4f5be68800756cf3214840", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea285a369c4f5be68800756cf3214840");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c3c6a34a02208ac5ab43aba9301eda7d", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c3c6a34a02208ac5ab43aba9301eda7d") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "348d726f9fbc095413f87f5cdb1d4a9d", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "348d726f9fbc095413f87f5cdb1d4a9d") : (a[]) values().clone();
        }
    }

    public static a a() {
        return g;
    }

    public static String a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        CartInfo cartInfo = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "706fd0ca277f31c980a9e76f1924bd86", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "706fd0ca277f31c980a9e76f1924bd86");
        }
        b n = k.a().n(str);
        if (n != null) {
            cartInfo = new CartInfo();
            if (!com.sankuai.waimai.foundation.utils.b.b(n.b)) {
                cartInfo.shoppingCartSkuList = new ArrayList<>();
                for (d dVar : n.b) {
                    if (!com.sankuai.waimai.foundation.utils.b.b(dVar.c)) {
                        for (ShopCartItem shopCartItem : dVar.c) {
                            if (shopCartItem.food != null) {
                                cartInfo.getClass();
                                CartInfo.a aVar = new CartInfo.a();
                                if (shopCartItem.food.sku != null && shopCartItem.food.spu != null) {
                                    aVar.a = shopCartItem.food.sku.id;
                                    aVar.b = shopCartItem.food.spu.id;
                                    cartInfo.shoppingCartSkuList.add(aVar);
                                }
                            }
                        }
                    }
                }
            }
        }
        return (cartInfo == null || com.sankuai.waimai.foundation.utils.b.b(cartInfo.shoppingCartSkuList)) ? "" : com.sankuai.waimai.foundation.utils.k.a().toJson(cartInfo);
    }
}
