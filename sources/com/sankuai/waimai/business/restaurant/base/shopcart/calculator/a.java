package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.c;
import com.sankuai.waimai.business.restaurant.base.manager.order.h;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartPrice;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c5e6349ee7eea902712e87565ec11154", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c5e6349ee7eea902712e87565ec11154")).booleanValue();
        }
        if (i2 > i) {
            return false;
        }
        return (i3 <= 0 || i2 + i3 != i) && i3 > 0 && i2 + i3 > i;
    }

    @Nullable
    public static com.sankuai.waimai.business.restaurant.base.shopcart.b a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cecf8ad09ed3656b05e61b46f2d8de66", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.base.shopcart.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cecf8ad09ed3656b05e61b46f2d8de66");
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new ObjectOutputStream(byteArrayOutputStream).writeObject(bVar);
            return (com.sankuai.waimai.business.restaurant.base.shopcart.b) new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray())).readObject();
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a> list, List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list2, int i, List<c.a> list3) {
        int i2;
        Object[] objArr = {list, list2, 0, list3};
        ChangeQuickRedirect changeQuickRedirect = a;
        Object obj = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "325b5f10f236597a2d6716f65dc92d86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "325b5f10f236597a2d6716f65dc92d86");
        } else if (com.sankuai.waimai.foundation.utils.b.a(list2)) {
            int i3 = 0;
            while (i3 < list2.size()) {
                com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = list2.get(i3);
                if (dVar != null && dVar.c != null) {
                    int i4 = 0;
                    while (i4 < dVar.c.size()) {
                        ShopCartItem shopCartItem = dVar.c.get(i4);
                        if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.spu != null && shopCartItem.food.sku != null) {
                            int i5 = dVar.b;
                            Object[] objArr2 = {shopCartItem, Integer.valueOf(i5)};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a a2 = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "42a386547bba841a387e762c201bb1df", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a) PatchProxy.accessDispatch(objArr2, obj, changeQuickRedirect2, true, "42a386547bba841a387e762c201bb1df") : a(shopCartItem.food, i5);
                            for (int i6 = 0; list3 != null && i6 < list3.size(); i6++) {
                                c.a aVar = list3.get(i6);
                                if (aVar != null && aVar.e == 0 && aVar.a == i3 && aVar.b == i4) {
                                    int i7 = aVar.d;
                                    int i8 = aVar.c;
                                    if (i8 != 1 && i8 != 3) {
                                        if (i8 != 2 && i8 != 4) {
                                            i2 = 0;
                                            a2.l = i2;
                                            a2.m = i7;
                                        }
                                        i2 = 2;
                                        a2.l = i2;
                                        a2.m = i7;
                                    }
                                    i2 = 1;
                                    a2.l = i2;
                                    a2.m = i7;
                                }
                            }
                            if (shopCartItem.food.sku.activityType == 9) {
                                a2.q = shopCartItem.food.sku.goodsCouponViewId;
                            }
                            list.add(a2);
                        }
                        i4++;
                        obj = null;
                    }
                }
                i3++;
                obj = null;
            }
        }
    }

    private static void a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, @NonNull List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.c> list, List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b> list2) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        int i = 0;
        Object[] objArr = {bVar, list, list2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "933f69fd4ccd6db92ca063a204e96137", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "933f69fd4ccd6db92ca063a204e96137");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.c cVar : list) {
            com.sankuai.waimai.business.restaurant.base.shopcart.d a2 = a(bVar, cVar);
            arrayList.add(a2);
            a(a2, list2);
        }
        while (i < bVar.b.size() && !bVar.b.get(i).d) {
            i++;
        }
        if (i < arrayList.size()) {
            ((com.sankuai.waimai.business.restaurant.base.shopcart.d) arrayList.get(i)).d = true;
        }
        bVar.b = arrayList;
    }

    private static void a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.d dVar, List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b> list) {
        Object[] objArr = {dVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "de82b54b357f4f9459d69c3040f964b3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "de82b54b357f4f9459d69c3040f964b3");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (ShopCartItem shopCartItem : dVar.c) {
            if (shopCartItem != null && shopCartItem.food != null && list != null && list.size() != 0) {
                Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b> it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b next = it.next();
                    if (next != null && next.c().equals(shopCartItem.food)) {
                        arrayList.add(shopCartItem);
                        break;
                    }
                }
            }
        }
        dVar.c.removeAll(arrayList);
    }

    private static void a(@NonNull ShopCartItem shopCartItem, @NonNull com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b bVar) {
        Object[] objArr = {shopCartItem, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "615c1d20d0b676683185e29a3421ab1a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "615c1d20d0b676683185e29a3421ab1a");
            return;
        }
        a(shopCartItem.food, bVar);
        shopCartItem.activityIconUrl = bVar.q != null ? bVar.q.a : "";
        shopCartItem.actTags = bVar.b();
    }

    private static com.sankuai.waimai.business.restaurant.base.shopcart.d a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, @NonNull com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.c cVar) {
        ShopCartItem shopCartItem;
        boolean z;
        boolean equals;
        int i = 2;
        char c = 0;
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2718e3a1d1a9f624fdbc8fbe127c8099", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.base.shopcart.d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2718e3a1d1a9f624fdbc8fbe127c8099");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = new com.sankuai.waimai.business.restaurant.base.shopcart.d(cVar.a);
        dVar.e = cVar.b;
        List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b> list = cVar.c;
        int i2 = 0;
        while (i2 < list.size()) {
            if (list.get(i2) != null) {
                com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b bVar2 = list.get(i2);
                int i3 = cVar.a;
                Object[] objArr2 = new Object[3];
                objArr2[c] = bVar;
                objArr2[1] = bVar2;
                objArr2[i] = Integer.valueOf(i3);
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3e84a433caf087795dd52cbcd0760be", RobustBitConfig.DEFAULT_VALUE)) {
                    shopCartItem = (ShopCartItem) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3e84a433caf087795dd52cbcd0760be");
                } else {
                    ShopCartItem a2 = a(bVar2);
                    Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> a3 = bVar.a();
                    while (a3.hasNext()) {
                        com.sankuai.waimai.business.restaurant.base.shopcart.d next = a3.next();
                        if (next != null && !com.sankuai.waimai.foundation.utils.b.b(next.c)) {
                            Iterator<ShopCartItem> it = next.c.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    z = false;
                                    break;
                                }
                                ShopCartItem next2 = it.next();
                                if (next2 != null && next2.food != null) {
                                    Object[] objArr3 = new Object[i];
                                    objArr3[c] = a2;
                                    objArr3[1] = next2;
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "46aec0003cf2540fd1347ec9d987494c", RobustBitConfig.DEFAULT_VALUE)) {
                                        equals = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "46aec0003cf2540fd1347ec9d987494c")).booleanValue();
                                    } else {
                                        equals = (a2.food == null || next2.food == null) ? false : a2.food.equals(next2.food);
                                    }
                                    if (equals) {
                                        a2.food = next2.food.deepCopy();
                                        z = true;
                                        break;
                                    }
                                    i = 2;
                                    c = 0;
                                }
                            }
                            if (z) {
                                break;
                            }
                            i = 2;
                            c = 0;
                        }
                    }
                    a2.pocketId = i3;
                    a2.food.setCartId(i3);
                    a(a2, bVar2);
                    if (!aa.a(a2.food.sku.goodsCouponViewId)) {
                        bVar.r = a2.food.sku.goodsCouponViewId;
                    }
                    shopCartItem = a2;
                }
                dVar.c.add(shopCartItem);
            }
            i2++;
            i = 2;
            c = 0;
        }
        return dVar;
    }

    private static List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.c> a(@NonNull List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11f2f369e53d974508f6a9ac2cbc5a09", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11f2f369e53d974508f6a9ac2cbc5a09");
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.c cVar : list) {
            if (cVar != null && com.sankuai.waimai.foundation.utils.b.a(cVar.c) && cVar.a != -1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private static ShopCartItem a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "bd38e2bede0a4d1ac0c7856f77a8b519", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShopCartItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "bd38e2bede0a4d1ac0c7856f77a8b519");
        }
        ShopCartItem shopCartItem = new ShopCartItem();
        OrderedFood orderedFood = new OrderedFood();
        GoodsSku goodsSku = new GoodsSku();
        GoodsSpu goodsSpu = new GoodsSpu();
        goodsSku.id = bVar.b;
        goodsSpu.id = bVar.c;
        goodsSpu.physicalTag = bVar.h;
        goodsSpu.activityTag = bVar.i;
        goodsSpu.name = bVar.d;
        orderedFood.spu = goodsSpu;
        orderedFood.sku = goodsSku;
        shopCartItem.food = orderedFood;
        a(shopCartItem, bVar);
        return shopCartItem;
    }

    private static com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a a(@NonNull OrderedFood orderedFood, int i) {
        Object[] objArr = {orderedFood, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "45f2f1153e932dfc3179e5b5e8b8518b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "45f2f1153e932dfc3179e5b5e8b8518b");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a aVar = new com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a();
        long id = orderedFood.getFoodSpu().getId();
        Object[] objArr2 = {new Long(id)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a.a;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "841fbcf41baa5064d1192e95b0a0d239", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "841fbcf41baa5064d1192e95b0a0d239");
        } else {
            aVar.b = id;
        }
        long skuId = orderedFood.getFoodSku().getSkuId();
        Object[] objArr3 = {new Long(skuId)};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "08b60a33a6d20fad0ba8f91c742c7854", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "08b60a33a6d20fad0ba8f91c742c7854");
        } else {
            aVar.c = skuId;
        }
        aVar.d = orderedFood.getFoodSpu().getName();
        double originPrice = orderedFood.getFoodSku().getOriginPrice();
        Object[] objArr4 = {Double.valueOf(originPrice)};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "67f2a1332ec1d68759f51433deb16bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "67f2a1332ec1d68759f51433deb16bf3");
        } else {
            aVar.e = originPrice;
        }
        aVar.f = orderedFood.getCount();
        aVar.g = orderedFood.getFoodSku().getSpec();
        aVar.h = i;
        double boxNum = orderedFood.getFoodSku().getBoxNum();
        Object[] objArr5 = {Double.valueOf(boxNum)};
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "67e959e90ceeaf4270d76189f069a8e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "67e959e90ceeaf4270d76189f069a8e8");
        } else {
            aVar.i = boxNum;
        }
        double boxPrice = orderedFood.getFoodSku().getBoxPrice();
        Object[] objArr6 = {Double.valueOf(boxPrice)};
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a.a;
        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "59f3c7f2c961807db805152b0bd95a9e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "59f3c7f2c961807db805152b0bd95a9e");
        } else {
            aVar.j = boxPrice;
        }
        aVar.k = orderedFood.getFoodSpu().getPhysicalTag();
        GoodsAttr[] attrIds = orderedFood.getAttrIds();
        if (com.sankuai.waimai.foundation.utils.b.a(attrIds)) {
            attrIds = new GoodsAttr[0];
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (GoodsAttr goodsAttr : attrIds) {
            if (goodsAttr.mode == 999) {
                arrayList2.add(goodsAttr);
            } else {
                arrayList.add(goodsAttr);
            }
        }
        if (arrayList2.size() > 0) {
            aVar.p = (GoodsAttr[]) arrayList2.toArray(new GoodsAttr[arrayList2.size()]);
        }
        if (arrayList.size() > 0) {
            aVar.o = (GoodsAttr[]) arrayList.toArray(new GoodsAttr[arrayList.size()]);
        }
        JSONObject jSONObject = new JSONObject();
        double d = orderedFood.getFoodSku().fullDiscountPrice;
        try {
            if (!Double.isNaN(d) && com.sankuai.waimai.foundation.utils.h.e(Double.valueOf(d), Double.valueOf(0.0d))) {
                jSONObject.put("showFullDiscount", 1);
            } else {
                jSONObject.put("showFullDiscount", 0);
            }
            jSONObject.put("groupChatShare", orderedFood.getFoodSku().getGroupChatShare());
            jSONObject.put("seckill", orderedFood.getFoodSku().getSeckill());
            aVar.n = jSONObject.toString();
        } catch (JSONException unused) {
        }
        long groupId = orderedFood.getGroupId();
        Object[] objArr7 = {new Long(groupId)};
        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.a.a;
        if (PatchProxy.isSupport(objArr7, aVar, changeQuickRedirect7, false, "2896fe29369b2538a5385c41135dd010", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, aVar, changeQuickRedirect7, false, "2896fe29369b2538a5385c41135dd010");
        } else {
            aVar.s = groupId;
        }
        if (!com.sankuai.waimai.foundation.utils.b.b(orderedFood.getComboItems())) {
            ArrayList arrayList3 = new ArrayList();
            for (OrderedFood orderedFood2 : orderedFood.getComboItems()) {
                arrayList3.add(a(orderedFood2, i));
            }
            aVar.r = arrayList3;
        }
        return aVar;
    }

    public static void a(@NonNull ShopCartPrice shopCartPrice) {
        Object[] objArr = {shopCartPrice};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "40dd3e4badcd07ad29e248d4d80a62ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "40dd3e4badcd07ad29e248d4d80a62ba");
            return;
        }
        shopCartPrice.mTotalDiscountedPrice = 0.0d;
        shopCartPrice.mTotalBoxPrice = 0.0d;
        shopCartPrice.mTotalAndBoxPrice = 0.0d;
        shopCartPrice.mTotalDiscountedAndBoxPrice = 0.0d;
    }

    public static int a(int i, int i2, int i3, int i4, int i5, int i6) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "657003aa2452318df7280b66a59078ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "657003aa2452318df7280b66a59078ae")).intValue();
        }
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i6), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        return c(b(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "9f62fa9e185374366cb3fab6e80b20fd", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "9f62fa9e185374366cb3fab6e80b20fd")).intValue() : Math.max(0, Math.min(i, i6 - i3)), i4, i2), i5, i2);
    }

    public static int b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dad116fd7795d0ef2c9f7221223573a6", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dad116fd7795d0ef2c9f7221223573a6")).intValue() : i2 >= 0 ? Math.max(0, Math.max(0, Math.min(i + i3, i2)) - i3) : i;
    }

    public static int c(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "df1dd719f4b4f2fd501593f21f3150ec", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "df1dd719f4b4f2fd501593f21f3150ec")).intValue() : Math.max(0, Math.max(0, Math.min(i + i3, i2)) - i3);
    }

    public static void a(@NonNull ShopCartItem shopCartItem, @NonNull ShopCartPrice shopCartPrice, int i, int i2, double d) {
        Object[] objArr = {shopCartItem, shopCartPrice, Integer.valueOf(i), Integer.valueOf(i2), Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "783c4e4aa5a9775c7746d52fcd40402d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "783c4e4aa5a9775c7746d52fcd40402d");
            return;
        }
        double originPrice = shopCartItem.food.getOriginPrice();
        double d2 = i;
        double boxPrice = shopCartItem.food.getBoxPrice() * shopCartItem.food.getBoxNum() * d2;
        double d3 = (i2 * d) + ((i - i2) * originPrice);
        shopCartPrice.mTotalAndBoxPrice += (d2 * originPrice) + boxPrice;
        shopCartPrice.mTotalDiscountedPrice += d3;
        shopCartPrice.mTotalDiscountedAndBoxPrice += d3 + boxPrice;
        shopCartPrice.mTotalBoxPrice += boxPrice;
        shopCartItem.food.setSubTotalPrice(d3);
    }

    public static String a(long j, long j2) {
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6c864fd27116de4ea8e34dbf3d59e853", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6c864fd27116de4ea8e34dbf3d59e853");
        }
        return String.valueOf(j) + CommonConstant.Symbol.COMMA + String.valueOf(j2);
    }

    public static void a(@NonNull com.sankuai.waimai.business.restaurant.base.shopcart.b bVar, com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.f fVar) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = {bVar, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6e866d15647f2b9de6542d203b114e2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6e866d15647f2b9de6542d203b114e2c");
        } else if (fVar == null) {
        } else {
            List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.c> list = fVar.r;
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.g gVar = fVar.z;
            List<com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b> list2 = gVar != null ? gVar.c : null;
            if (com.sankuai.waimai.foundation.utils.b.a(list) || com.sankuai.waimai.foundation.utils.b.a(list2)) {
                if (bVar.b == null) {
                    bVar.b = new ArrayList();
                }
                a(bVar, a(list), list2);
                h.a.b(bVar);
            }
            bVar.g = fVar.p;
            ShopCartPrice shopCartPrice = bVar.e;
            if (shopCartPrice == null) {
                shopCartPrice = new ShopCartPrice();
                bVar.e = shopCartPrice;
            }
            shopCartPrice.mTotalDiscountedAndBoxPrice = fVar.c;
            shopCartPrice.mTotalAndBoxPrice = fVar.e;
            if (fVar.d != null) {
                shopCartPrice.totalBoxPrice = fVar.d.totalBoxPrice;
            } else {
                shopCartPrice.totalBoxPrice = "";
            }
            shopCartPrice.mThresholdPrice = fVar.g;
            shopCartPrice.mShippingFeeTxt = fVar.h;
            shopCartPrice.mOriginShippingFeeTxt = fVar.j;
            shopCartPrice.previewSubTip = fVar.k;
            shopCartPrice.crossTip = fVar.l;
            shopCartPrice.pricePrefix = fVar.i;
            com.sankuai.waimai.business.restaurant.base.shopcart.tip.c i = bVar.i();
            if (i == null) {
                i = new com.sankuai.waimai.business.restaurant.base.shopcart.tip.c();
                bVar.f = i;
            }
            i.e = bVar.i().e;
            i.d = false;
            i.g = fVar.o;
            i.c = fVar.m;
            i.a(fVar.f);
            i.f = fVar.n;
            bVar.s = fVar.s;
            if (!TextUtils.isEmpty(fVar.t) && com.sankuai.waimai.business.restaurant.base.abtest.a.b()) {
                if (bVar.t != null) {
                    bVar.t.a(fVar.t);
                } else {
                    bVar.t = new com.sankuai.waimai.business.restaurant.base.shopcart.f(fVar.t);
                }
            }
            bVar.y = fVar.x;
            bVar.z = fVar.w;
            bVar.C = fVar.y;
            if (fVar.u != null) {
                ShopCartMemberInfo shopCartMemberInfo = new ShopCartMemberInfo();
                shopCartMemberInfo.tipTextJson = fVar.u.tipTextJson;
                shopCartMemberInfo.cartMemberInfo = fVar.u.cartMemberInfo;
                shopCartMemberInfo.memberFloatingLayerInfo = fVar.u.memberFloatingLayerInfo;
                bVar.v = shopCartMemberInfo;
                bVar.a(fVar.v);
            } else {
                bVar.v = null;
                bVar.a(0.0d);
            }
            bVar.D = fVar.A;
        }
    }

    private static void a(OrderedFood orderedFood, @NonNull com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b bVar) {
        OrderedFood orderedFood2;
        Object[] objArr = {orderedFood, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32ea674cbb3a557efeceb4b6933c995e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32ea674cbb3a557efeceb4b6933c995e");
            return;
        }
        orderedFood.setCount(bVar.g);
        orderedFood.setSubTotalPrice(bVar.e);
        orderedFood.setSubTotalOriginalPrice(bVar.f);
        orderedFood.setAttrIds(bVar.a());
        orderedFood.sku.goodsCouponViewId = bVar.k;
        orderedFood.setSubBoxPrice(bVar.m);
        orderedFood.setSubBoxPriceDesc(bVar.l);
        orderedFood.setGroupId(bVar.s);
        orderedFood.setFoodDesc(bVar.j);
        orderedFood.setCartPoiPicUrl(bVar.n);
        orderedFood.setProductType(bVar.t);
        List<OrderedFood> comboItems = orderedFood.getComboItems();
        if (com.sankuai.waimai.foundation.utils.b.b(bVar.r)) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.b bVar2 : bVar.r) {
            OrderedFood c = bVar2.c();
            if (!com.sankuai.waimai.foundation.utils.b.b(comboItems)) {
                Iterator<OrderedFood> it = comboItems.iterator();
                while (it.hasNext()) {
                    orderedFood2 = it.next();
                    if (orderedFood2.equals(c)) {
                        break;
                    }
                }
            }
            orderedFood2 = null;
            if (orderedFood2 == null) {
                orderedFood2 = a(bVar2).food;
            } else {
                a(orderedFood2, bVar2);
            }
            arrayList.add(orderedFood2);
        }
        orderedFood.setComboItemList(arrayList);
    }
}
