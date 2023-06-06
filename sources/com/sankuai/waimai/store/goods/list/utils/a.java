package com.sankuai.waimai.store.goods.list.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.mrn.shopcartbridge.AddProdctResult;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static AddProdctResult a(long j, String str, List<OrderedFood> list) {
        Object[] objArr = {new Long(j), str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7acef2362d5694bc0bda37751702ad02", RobustBitConfig.DEFAULT_VALUE)) {
            return (AddProdctResult) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7acef2362d5694bc0bda37751702ad02");
        }
        AddProdctResult addProdctResult = new AddProdctResult();
        addProdctResult.setPoiId(j);
        addProdctResult.setPoiIdStr(str);
        ArrayList arrayList = new ArrayList();
        if (!com.sankuai.shangou.stone.util.a.b(list)) {
            for (OrderedFood orderedFood : list) {
                AddProdctResult.FoodsBean foodsBean = new AddProdctResult.FoodsBean();
                if (orderedFood != null) {
                    if (orderedFood.spu != null) {
                        foodsBean.setSpu_id(orderedFood.spu.id);
                        foodsBean.setName(orderedFood.spu.name);
                        foodsBean.setTagId(orderedFood.spu.physicalTag);
                    }
                    if (orderedFood.sku != null) {
                        foodsBean.setPrice(orderedFood.sku.price);
                        foodsBean.setOriginalPrice(orderedFood.sku.originPrice);
                        foodsBean.setPicture(orderedFood.sku.picture);
                        foodsBean.setMinOrderCount(orderedFood.sku.minOrderCount);
                        foodsBean.setSkuId(orderedFood.sku.id);
                        foodsBean.setSpec(orderedFood.sku.spec);
                        foodsBean.setDescription(orderedFood.sku.description);
                    }
                    foodsBean.setCount(orderedFood.count);
                    if (!com.sankuai.shangou.stone.util.a.b(orderedFood.getAttrIds())) {
                        foodsBean.setAttrs(com.sankuai.shangou.stone.util.a.d(orderedFood.getAttrIds()));
                    }
                    arrayList.add(foodsBean);
                }
            }
        }
        addProdctResult.setFoods(arrayList);
        return addProdctResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.sankuai.waimai.store.goods.list.model.AddCrossModel a(@android.support.annotation.NonNull android.content.Intent r17, java.lang.String r18) {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.utils.a.a(android.content.Intent, java.lang.String):com.sankuai.waimai.store.goods.list.model.AddCrossModel");
    }
}
