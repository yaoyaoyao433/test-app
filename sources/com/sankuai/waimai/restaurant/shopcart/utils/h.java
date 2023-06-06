package com.sankuai.waimai.restaurant.shopcart.utils;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h {
    public static ChangeQuickRedirect a;

    public static List<com.sankuai.waimai.business.restaurant.base.shopcart.g> a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) {
        String string;
        Object[] objArr = {bVar, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fcd9fec0d5d5807248a47a6492c5769a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fcd9fec0d5d5807248a47a6492c5769a");
        }
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list = bVar.b;
            if (com.sankuai.waimai.foundation.utils.b.a(list)) {
                int size = list.size();
                int i = 0;
                while (i < size) {
                    com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = list.get(i);
                    if (dVar != null && (gVar.d || !b.a(dVar.c))) {
                        int i2 = i + 1;
                        if (!gVar.d) {
                            string = com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_pocket_has_select_goods);
                        } else {
                            string = com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_cart_pocket_index, Integer.valueOf(i2));
                        }
                        a(i, size, string, arrayList, dVar.e, i == 0, com.sankuai.waimai.foundation.utils.b.a(dVar.c), dVar.d, gVar.d);
                        a(i, dVar.c, arrayList);
                    }
                    i++;
                }
            }
        }
        return arrayList;
    }

    private static void a(int i, List<ShopCartItem> list, List<com.sankuai.waimai.business.restaurant.base.shopcart.g> list2) {
        Object[] objArr = {Integer.valueOf(i), list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ece7f5b487e7726d1629113cb92d03b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ece7f5b487e7726d1629113cb92d03b");
        } else if (com.sankuai.waimai.foundation.utils.b.a(list)) {
            int i2 = 0;
            while (i2 < list.size()) {
                com.sankuai.waimai.business.restaurant.base.shopcart.g gVar = new com.sankuai.waimai.business.restaurant.base.shopcart.g();
                ShopCartItem shopCartItem = list.get(i2);
                gVar.h = shopCartItem;
                gVar.g = i2;
                if (i == com.sankuai.waimai.business.restaurant.base.shopcart.g.c) {
                    gVar.d = com.sankuai.waimai.business.restaurant.base.shopcart.g.c;
                    gVar.f = 0;
                    gVar.i = false;
                } else {
                    gVar.d = i;
                    gVar.i = true;
                    gVar.f = i;
                }
                if (shopCartItem.getFood().getProductType() == 4) {
                    gVar.e = 3;
                } else {
                    gVar.e = 1;
                }
                gVar.r = i2 == list.size() - 1;
                list2.add(gVar);
                i2++;
            }
        }
    }

    private static void a(int i, int i2, String str, List<com.sankuai.waimai.business.restaurant.base.shopcart.g> list, double d, boolean z, boolean z2, boolean z3, boolean z4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), str, list, Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0), Byte.valueOf(z3 ? (byte) 1 : (byte) 0), Byte.valueOf(z4 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "984e72f97a1da9db82db9dfec8d6c5ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "984e72f97a1da9db82db9dfec8d6c5ea");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.g gVar = new com.sankuai.waimai.business.restaurant.base.shopcart.g();
        gVar.f = i;
        if (i == i2 - 1) {
            if (i != 5 || !z2) {
                gVar.m = com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_shopcart_pocket_new_tip);
            }
            gVar.r = true;
        }
        gVar.p = z2;
        gVar.k = true;
        gVar.i = false;
        gVar.j = str;
        gVar.e = 0;
        gVar.l = d;
        gVar.o = z;
        gVar.q = z3;
        gVar.n = z4;
        list.add(gVar);
    }
}
