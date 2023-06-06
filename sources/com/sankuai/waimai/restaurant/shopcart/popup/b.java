package com.sankuai.waimai.restaurant.shopcart.popup;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.base.shopcart.d;
import com.sankuai.waimai.business.restaurant.rn.bridge.WMRNOldStyleShoppingCartManager;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect r;
    public boolean s;

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final String j() {
        return "waimai";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final String k() {
        return "cart-goods-list-details";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final String l() {
        return "LocalCartListDetails";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final String m() {
        return "LocalCartListDetailsBlock";
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final int[] g() {
        return new int[4];
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final c h() {
        return c.BOTTOM_UP;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final Bundle i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a95dc39b1434175e0bd5cd18d46b286", RobustBitConfig.DEFAULT_VALUE)) {
            return (Bundle) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a95dc39b1434175e0bd5cd18d46b286");
        }
        Bundle bundle = new Bundle();
        bundle.putString("isRestrict", this.s ? "true" : "false");
        return bundle;
    }

    public static OrderedFood a(String str, long j, long j2, long[] jArr) {
        Object[] objArr = {str, new Long(j), new Long(j2), jArr};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9dbcde92932475fc63aa14643dfd7520", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9dbcde92932475fc63aa14643dfd7520");
        }
        if (TextUtils.isEmpty(str) || j <= 0 || j2 <= 0) {
            return null;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b n = k.a().n(str);
        if (TextUtils.isEmpty(str) || n == null) {
            return null;
        }
        ArrayList<d> arrayList = new ArrayList();
        List<d> list = n.b;
        if (list != null && !list.isEmpty()) {
            arrayList.addAll(list);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        for (d dVar : arrayList) {
            if (dVar != null && dVar.c != null && !dVar.c.isEmpty()) {
                for (ShopCartItem shopCartItem : dVar.c) {
                    if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == j && shopCartItem.food.getSkuId() == j2 && a(shopCartItem.food.getAttrIds(), jArr)) {
                        return shopCartItem.food;
                    }
                }
                continue;
            }
        }
        return null;
    }

    private static boolean a(GoodsAttr[] goodsAttrArr, long[] jArr) {
        Object[] objArr = {goodsAttrArr, jArr};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5d9b1cd5488fedc4e1d3087e9b51e19f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5d9b1cd5488fedc4e1d3087e9b51e19f")).booleanValue();
        }
        if ((goodsAttrArr == null || goodsAttrArr.length == 0) && (jArr == null || jArr.length == 0)) {
            return true;
        }
        if (goodsAttrArr == null || jArr == null || goodsAttrArr.length != jArr.length) {
            return false;
        }
        for (int i = 0; i < goodsAttrArr.length; i++) {
            if (goodsAttrArr[i].id != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int a(OrderedFood orderedFood, List<OrderedFood> list) {
        Object[] objArr = {orderedFood, list};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65b762b437682cfad9f223abd3fc0a75", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65b762b437682cfad9f223abd3fc0a75")).intValue();
        }
        if (orderedFood == null || com.sankuai.waimai.foundation.utils.b.b(list)) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            OrderedFood orderedFood2 = list.get(i);
            if (orderedFood2 != null && orderedFood2.getSkuId() == orderedFood.getSkuId() && orderedFood2.isSameAttrs(orderedFood.getAttrIds())) {
                return i;
            }
        }
        return -1;
    }

    public static long[] a(GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68fa4a32978cdc0e78ce67bb9c83473a", RobustBitConfig.DEFAULT_VALUE)) {
            return (long[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68fa4a32978cdc0e78ce67bb9c83473a");
        }
        if (goodsAttrArr == null || goodsAttrArr.length <= 0) {
            return null;
        }
        long[] jArr = new long[goodsAttrArr.length];
        for (int i = 0; i < goodsAttrArr.length; i++) {
            jArr[i] = goodsAttrArr[i].id;
        }
        return jArr;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final List<i> n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d99990b73a70792818ce2d9fe7e267ff", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d99990b73a70792818ce2d9fe7e267ff");
        }
        i iVar = new i() { // from class: com.sankuai.waimai.restaurant.shopcart.popup.b.1
            public static ChangeQuickRedirect a;

            @Override // com.facebook.react.i
            @NonNull
            public final List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "af9add080176fc5f4b2b4662d1129efc", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "af9add080176fc5f4b2b4662d1129efc");
                }
                b bVar = b.this;
                Object[] objArr3 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect3 = b.r;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "e9427918ac84a515e5ca4bdf86e8a15d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (List) PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "e9427918ac84a515e5ca4bdf86e8a15d");
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(new WMRNOldStyleShoppingCartManager(reactApplicationContext));
                return arrayList;
            }

            @Override // com.facebook.react.i
            @NonNull
            public final List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
                Object[] objArr2 = {reactApplicationContext};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0aaa1c723473e938cabfabe1dc477a0e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0aaa1c723473e938cabfabe1dc477a0e") : Collections.emptyList();
            }
        };
        ArrayList arrayList = new ArrayList();
        arrayList.add(iVar);
        return arrayList;
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final int e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d93dd6766c719a225ee2b75b5679c76", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d93dd6766c719a225ee2b75b5679c76")).intValue() : (int) (g.b(com.meituan.android.singleton.b.a) * 0.8d);
    }

    @Override // com.sankuai.waimai.restaurant.shopcart.popup.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ef06fde6dd485229226858f7af8c552", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ef06fde6dd485229226858f7af8c552")).intValue() : (int) (g.b(com.meituan.android.singleton.b.a) * 0.28d);
    }
}
