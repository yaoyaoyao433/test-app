package com.sankuai.waimai.bussiness.order.confirm.pgablock.foodInfo;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.submit.model.DiscountItem;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.business.order.submit.model.CouponInfo;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.bussiness.order.base.utils.i;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.collectfood.e;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.OrderFoodOutput;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public c b;
    com.sankuai.waimai.bussiness.order.confirm.a c;
    Context d;
    boolean e;
    boolean f;
    private e g;

    public a(com.sankuai.waimai.bussiness.order.confirm.a aVar, Context context) {
        Object[] objArr = {aVar, context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef89097490abdacb87368e9d2d7f391", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef89097490abdacb87368e9d2d7f391");
            return;
        }
        this.c = aVar;
        this.d = context;
        this.g = aVar.aC.a().b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(CouponInfo couponInfo) {
        Object[] objArr = {couponInfo};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f95582ad000786d9bf3e70d0606b25f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f95582ad000786d9bf3e70d0606b25f")).booleanValue() : (couponInfo.collectOrder == null || TextUtils.isEmpty(couponInfo.collectOrder.collectOrderTip) || couponInfo.collectOrder.spreadMoney == -1.0d || couponInfo.collectOrder.couponPrice == -1.0d || couponInfo.collectOrder.couponDiscountPrice == -1.0d) ? false : true;
    }

    public final void a(@Nullable Map<String, Object> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c85b87eee55c7401c4f5859dc92afbf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c85b87eee55c7401c4f5859dc92afbf6");
            return;
        }
        List<OrderedFood> b = b(map);
        ArrayList arrayList = new ArrayList();
        long a2 = r.a(String.valueOf(map.get("poi_id")), 0L);
        String valueOf = String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR));
        try {
            JSONArray optJSONArray = new JSONObject(d.a().toJson(map)).optJSONArray("collectfoods");
            for (int i = 0; i < optJSONArray.length(); i++) {
                int i2 = optJSONArray.optJSONObject(i).getInt("itemCount");
                GoodsSpu goodsSpu = (GoodsSpu) d.a().fromJson(optJSONArray.optJSONObject(i).toString(), (Class<Object>) GoodsSpu.class);
                if (goodsSpu != null) {
                    arrayList.add(a(goodsSpu, b, i2));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.g.a(a2, valueOf, a(b, arrayList));
    }

    private List<OrderedFood> a(List<OrderedFood> list, List<com.sankuai.waimai.bussiness.order.confirm.collect.model.a> list2) {
        boolean z;
        int i = 2;
        char c = 0;
        char c2 = 1;
        Object[] objArr = {list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1b715ed2264e462ff1ee8f54e1bafd2", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1b715ed2264e462ff1ee8f54e1bafd2");
        }
        ArrayList<OrderedFood> arrayList = new ArrayList();
        for (com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar : list2) {
            aVar.a();
            arrayList.add(aVar.b);
        }
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            Iterator<OrderedFood> it = list.iterator();
            while (it.hasNext()) {
                OrderedFood next = it.next();
                boolean z2 = false;
                for (OrderedFood orderedFood : arrayList) {
                    Object[] objArr2 = new Object[i];
                    objArr2[c] = next;
                    objArr2[c2] = orderedFood;
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0a99818c986e8ab310d1d2b8556084d9", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0a99818c986e8ab310d1d2b8556084d9")).booleanValue();
                    } else {
                        z = next != null && orderedFood != null && a(next.spu, orderedFood.spu) && next.getCartId() == orderedFood.getCartId();
                    }
                    if (z) {
                        orderedFood.setCount(orderedFood.getCount() + next.getCount());
                        i = 2;
                        c = 0;
                        c2 = 1;
                        z2 = true;
                    } else {
                        i = 2;
                        c = 0;
                        c2 = 1;
                    }
                }
                if (!z2) {
                    arrayList2.add(next);
                }
                i = 2;
                c = 0;
                c2 = 1;
            }
            arrayList2.addAll(arrayList);
            return arrayList2;
        }
        return null;
    }

    private com.sankuai.waimai.bussiness.order.confirm.collect.model.a a(GoodsSpu goodsSpu, List<OrderedFood> list, int i) {
        Object[] objArr = {goodsSpu, list, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da43695976d4ff9a797f63e4bc25e52", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.bussiness.order.confirm.collect.model.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da43695976d4ff9a797f63e4bc25e52");
        }
        com.sankuai.waimai.bussiness.order.confirm.collect.model.a aVar = new com.sankuai.waimai.bussiness.order.confirm.collect.model.a();
        aVar.a(goodsSpu);
        for (OrderedFood orderedFood : list) {
            if (a(orderedFood.spu, goodsSpu)) {
                if (aVar.j < 0) {
                    aVar.j = orderedFood.getCartId();
                } else {
                    aVar.j = Math.min(orderedFood.getCartId(), aVar.j);
                }
                aVar.d += orderedFood.count;
            }
        }
        if (aVar.j < 0) {
            aVar.j = 0;
        }
        aVar.e = i;
        return aVar;
    }

    private boolean a(GoodsSpu goodsSpu, GoodsSpu goodsSpu2) {
        Object[] objArr = {goodsSpu, goodsSpu2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eacf7a4cd7b6ac3a2487d28840ca1c44", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eacf7a4cd7b6ac3a2487d28840ca1c44")).booleanValue() : (goodsSpu == null || goodsSpu2 == null || com.sankuai.waimai.foundation.utils.b.b(goodsSpu.skus) || com.sankuai.waimai.foundation.utils.b.b(goodsSpu2.skus) || goodsSpu.id != goodsSpu2.id || goodsSpu.skus.get(0).id != goodsSpu2.skus.get(0).id) ? false : true;
    }

    public final List<OrderedFood> b(@Nullable Map<String, Object> map) {
        char c = 1;
        char c2 = 0;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8c77dcd196dee6dc674e8aed56f7f57", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8c77dcd196dee6dc674e8aed56f7f57");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        try {
            JSONArray optJSONArray = new JSONObject(d.a().toJson(map)).optJSONArray("food_list");
            for (int i = 0; i < optJSONArray.length(); i++) {
                OrderFoodOutput orderFoodOutput = (OrderFoodOutput) d.a().fromJson(optJSONArray.optJSONObject(i).toString(), (Class<Object>) OrderFoodOutput.class);
                if (orderFoodOutput != null) {
                    arrayList2.add(orderFoodOutput);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        List<OrderedFood> requestOrderedList = GlobalCartManager.getInstance().getRequestOrderedList(i.b(String.valueOf(map.get(FoodDetailNetWorkPreLoader.URI_POI_STR))), SubmitOrderManager.getInstance().getSourceType());
        if (requestOrderedList != null && requestOrderedList.size() > 0) {
            for (OrderedFood orderedFood : requestOrderedList) {
                if (orderedFood != null) {
                    Iterator<OrderedFood> it = this.b.a((List<OrderFoodOutput>) arrayList2).iterator();
                    while (true) {
                        if (it.hasNext()) {
                            OrderedFood next = it.next();
                            if (orderedFood.getSpuId() == next.getSpuId()) {
                                Object[] objArr2 = new Object[2];
                                objArr2[c2] = orderedFood;
                                objArr2[c] = next;
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d2ce0ecd58fb1c1ff8afa2ceded7b39e", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d2ce0ecd58fb1c1ff8afa2ceded7b39e");
                                } else if (orderedFood != null && next != null) {
                                    orderedFood.originalBoxNum = next.originalBoxNum;
                                    orderedFood.originalBoxPrice = next.originalBoxPrice;
                                }
                                arrayList.add(orderedFood);
                                c = 1;
                                c2 = 0;
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NotNull
    public String a(DiscountItem.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd585eba3dcc3e48af275e848a66f40d", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd585eba3dcc3e48af275e848a66f40d");
        }
        String str = "[";
        if (dVar.e != null && dVar.e.d != null && dVar.e.d.size() > 0) {
            str = "[" + dVar.e.d.get(0).e;
            for (int i = 1; i < dVar.e.d.size(); i++) {
                str = str + CommonConstant.Symbol.COMMA + dVar.e.d.get(i).e;
            }
        }
        return str + CommonConstant.Symbol.MIDDLE_BRACKET_RIGHT;
    }
}
