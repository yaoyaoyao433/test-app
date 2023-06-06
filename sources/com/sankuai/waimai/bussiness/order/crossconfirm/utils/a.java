package com.sankuai.waimai.bussiness.order.crossconfirm.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.coupon.model.OrderCouponRequestParams;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static String[] a(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c42de51923c86874e87c3c431c29648e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c42de51923c86874e87c3c431c29648e");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i).getSkuId());
        }
        return strArr;
    }

    public static ArrayList<OrderCouponRequestParams.a> b(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cf15497c00daa56dd14264603129b09", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cf15497c00daa56dd14264603129b09");
        }
        ArrayList<OrderCouponRequestParams.a> arrayList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null) {
                    OrderCouponRequestParams.a aVar = new OrderCouponRequestParams.a();
                    aVar.a = orderedFood.getSkuId();
                    aVar.b = orderedFood.getCount();
                    aVar.c = orderedFood.getOriginPrice();
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }

    public static ArrayList<OrderCouponRequestParams.b> c(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9fd3bf2065e56a3f35480c99fc96d5c5", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9fd3bf2065e56a3f35480c99fc96d5c5");
        }
        ArrayList<OrderCouponRequestParams.b> arrayList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (OrderedFood orderedFood : list) {
                if (orderedFood != null) {
                    OrderCouponRequestParams.b bVar = new OrderCouponRequestParams.b();
                    bVar.a = orderedFood.getSkuId();
                    bVar.c = orderedFood.getCount();
                    bVar.b = orderedFood.getSpuId();
                    bVar.d = orderedFood.getOriginPrice();
                    bVar.e = orderedFood.originalBoxPrice;
                    bVar.f = orderedFood.originalBoxNum;
                    if (!aa.a(orderedFood.getActivityTag())) {
                        bVar.g = orderedFood.getActivityTag();
                    } else {
                        bVar.g = "";
                    }
                    arrayList.add(bVar);
                }
            }
        }
        return arrayList;
    }

    public static String[] d(List<OrderFoodOutput> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c510ff43735cf5c7b28372ff0656125", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c510ff43735cf5c7b28372ff0656125");
        }
        if (list == null || list.size() == 0) {
            return null;
        }
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = String.valueOf(list.get(i).id);
        }
        return strArr;
    }

    public static ArrayList<OrderCouponRequestParams.a> e(List<OrderFoodOutput> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c2a0f3a30a7d4f7426059c5f8beec04c", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c2a0f3a30a7d4f7426059c5f8beec04c");
        }
        ArrayList<OrderCouponRequestParams.a> arrayList = new ArrayList<>();
        if (list != null && !list.isEmpty()) {
            for (OrderFoodOutput orderFoodOutput : list) {
                if (orderFoodOutput != null) {
                    OrderCouponRequestParams.a aVar = new OrderCouponRequestParams.a();
                    aVar.a = orderFoodOutput.id;
                    aVar.b = orderFoodOutput.count;
                    aVar.c = orderFoodOutput.originalPrice;
                    arrayList.add(aVar);
                }
            }
        }
        return arrayList;
    }
}
