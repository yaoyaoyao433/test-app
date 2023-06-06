package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator;

import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.order.ShopCartPrice;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartApiModel;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.d;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.e;
import com.sankuai.waimai.store.platform.domain.manager.order.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static e a(@Nullable GoodsSpu goodsSpu, @NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, List<b.a> list) {
        Object[] objArr = {goodsSpu, aVar, bVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9315a71a579340fb7903ce243c2ef013", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9315a71a579340fb7903ce243c2ef013");
        }
        e eVar = new e();
        eVar.b = aVar.h();
        eVar.a(aVar.g());
        eVar.c(aVar.s());
        eVar.a(aVar.b.shippingFee);
        eVar.b(aVar.b.packingFee);
        eVar.f = bVar.j;
        eVar.g = aVar.b.marketingInfoExtend;
        eVar.h = bVar.d().wmExtendInfo;
        eVar.j = (String) bVar.e.a("cart_extend_info");
        ArrayList arrayList = new ArrayList();
        a(arrayList, bVar.b, 0, list);
        a(arrayList, bVar.c, 1, list);
        eVar.c = arrayList;
        ArrayList arrayList2 = new ArrayList();
        a(arrayList2, bVar.d, 0, list);
        eVar.d = arrayList2;
        eVar.e = bVar.q;
        eVar.i = aVar.b.originalDeliveryType;
        if (goodsSpu != null) {
            eVar.k = goodsSpu.couponPageSource;
        }
        return eVar;
    }

    public static void a(List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a> list, List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list2, int i, List<b.a> list3) {
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a aVar;
        String json;
        int i2;
        char c = 0;
        Object[] objArr = {list, list2, Integer.valueOf(i), list3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "170172eb7888d86b129663858f1efc34", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "170172eb7888d86b129663858f1efc34");
        } else if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
            int i3 = 0;
            while (i3 < list2.size()) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar = list2.get(i3);
                if (cVar != null && cVar.j != null) {
                    int i4 = 0;
                    while (i4 < cVar.j.size()) {
                        ShopCartItem shopCartItem = cVar.j.get(i4);
                        if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.spu != null && shopCartItem.food.sku != null) {
                            int i5 = cVar.b;
                            Object[] objArr2 = new Object[2];
                            objArr2[c] = shopCartItem;
                            objArr2[1] = Integer.valueOf(i5);
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "7698faeab125d92b1b7c3461c0a04ca4", RobustBitConfig.DEFAULT_VALUE)) {
                                aVar = (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "7698faeab125d92b1b7c3461c0a04ca4");
                            } else {
                                com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a aVar2 = new com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.a();
                                aVar2.a(shopCartItem.getFoodSpu().getId());
                                aVar2.b(shopCartItem.getFoodSku().getSkuId());
                                aVar2.b = shopCartItem.getFoodSpu().getName();
                                aVar2.a(shopCartItem.getFoodSku().getOriginPrice());
                                aVar2.c = shopCartItem.getFoodCount();
                                aVar2.l = shopCartItem.getMinCount();
                                aVar2.d = shopCartItem.getFoodSku().getSpec();
                                aVar2.e = i5;
                                aVar2.b(shopCartItem.getFoodSku().getBoxNum());
                                aVar2.c(shopCartItem.getFoodSku().getBoxPrice());
                                aVar2.f = shopCartItem.getFoodSpu().getPhysicalTag();
                                aVar2.k = shopCartItem.getFoodAttrArr();
                                aVar2.g = shopCartItem.getFoodSpu().getActivityTag();
                                aVar = aVar2;
                            }
                            for (int i6 = 0; list3 != null && i6 < list3.size(); i6++) {
                                b.a aVar3 = list3.get(i6);
                                if (aVar3 != null && aVar3.e == i && aVar3.a == i3 && aVar3.b == i4) {
                                    int i7 = aVar3.d;
                                    int i8 = aVar3.c;
                                    if (i8 == 1 || i8 == 3) {
                                        i2 = 1;
                                    } else {
                                        if (i8 != 2 && i8 != 4) {
                                            i2 = 0;
                                        }
                                        i2 = 2;
                                    }
                                    aVar.h = i2;
                                    aVar.i = i7;
                                }
                            }
                            if (i == 1) {
                                int i9 = aVar.c;
                                Object[] objArr3 = new Object[2];
                                objArr3[c] = "plus_discount";
                                objArr3[1] = Integer.valueOf(i9);
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f7184261ac2cd89b7fab0d3d5290ff94", RobustBitConfig.DEFAULT_VALUE)) {
                                    json = (String) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f7184261ac2cd89b7fab0d3d5290ff94");
                                } else {
                                    ArrayList arrayList = new ArrayList();
                                    d.a aVar4 = new d.a();
                                    aVar4.a = "plus_discount";
                                    aVar4.b = i9;
                                    arrayList.add(aVar4);
                                    d dVar = new d();
                                    dVar.a = arrayList;
                                    json = new Gson().toJson(dVar);
                                }
                                aVar.j = json;
                            }
                            list.add(aVar);
                        }
                        i4++;
                        c = 0;
                    }
                }
                i3++;
                c = 0;
            }
        }
    }

    private static com.sankuai.waimai.store.platform.domain.core.shopcart.c a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c cVar) {
        Object[] objArr = {bVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c4d4adc7d2f5e167e354e1094348c6e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.platform.domain.core.shopcart.c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c4d4adc7d2f5e167e354e1094348c6e");
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar2 = new com.sankuai.waimai.store.platform.domain.core.shopcart.c(cVar.a);
        cVar2.d = cVar.b;
        if (t.a(cVar.c)) {
            cVar2.c = cVar.d;
        } else {
            cVar2.c = cVar.c + "，" + cVar.d;
        }
        cVar2.e = cVar.c;
        cVar2.g = cVar.f;
        cVar2.f = cVar.e;
        cVar2.h = cVar.i;
        cVar2.i = cVar.j;
        List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b> list = cVar.g;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) != null) {
                cVar2.j.add(a(bVar, list.get(i), cVar.a));
            }
        }
        return cVar2;
    }

    private static List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c> a(@NonNull List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2cba33349856583e98e5a011f66543fd", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2cba33349856583e98e5a011f66543fd");
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c cVar : list) {
            if (cVar != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) cVar.g) && cVar.a == -1) {
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    private static List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c> b(@NonNull List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b80bbbe7e09d3b97b477798a22ddb9d0", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b80bbbe7e09d3b97b477798a22ddb9d0");
        }
        ArrayList arrayList = new ArrayList();
        for (com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c cVar : list) {
            if (cVar != null && com.sankuai.shangou.stone.util.a.a((Collection<?>) cVar.h) && cVar.a != -1) {
                arrayList.addAll(cVar.h);
            }
        }
        return arrayList;
    }

    private static void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, @Nullable List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b> list) {
        Object[] objArr = {cVar, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2a058daf0926afd4138c658586b8c17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2a058daf0926afd4138c658586b8c17");
        } else if (!com.sankuai.shangou.stone.util.a.b(list)) {
            LinkedList linkedList = new LinkedList();
            for (ShopCartItem shopCartItem : cVar.j) {
                if (shopCartItem != null && shopCartItem.food != null) {
                    Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b> it = list.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b next = it.next();
                        if (next != null && a(next, shopCartItem)) {
                            linkedList.add(shopCartItem);
                            break;
                        }
                    }
                }
            }
            cVar.j.removeAll(linkedList);
        }
    }

    private static ShopCartItem a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, @NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b bVar2, int i) {
        int i2;
        boolean z;
        Object[] objArr = {bVar, bVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "33d9107b31eefea2dc742eb2cbb50211", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShopCartItem) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "33d9107b31eefea2dc742eb2cbb50211");
        }
        ShopCartItem shopCartItem = new ShopCartItem();
        Iterator<com.sankuai.waimai.store.platform.domain.core.shopcart.c> b = bVar.b();
        while (b.hasNext()) {
            com.sankuai.waimai.store.platform.domain.core.shopcart.c next = b.next();
            if (next != null && !com.sankuai.shangou.stone.util.a.b(next.j)) {
                Iterator<ShopCartItem> it = next.j.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    ShopCartItem next2 = it.next();
                    if (next2 != null && next2.food != null && a(bVar2, next2)) {
                        shopCartItem.food = next2.food.deepCopy();
                        z = true;
                        break;
                    }
                }
                if (z) {
                    break;
                }
            }
        }
        if (shopCartItem.food == null) {
            OrderedFood orderedFood = new OrderedFood();
            GoodsSku goodsSku = new GoodsSku();
            GoodsSpu goodsSpu = new GoodsSpu();
            goodsSku.id = bVar2.a;
            goodsSpu.id = bVar2.b;
            goodsSpu.physicalTag = bVar2.l;
            goodsSpu.activityTag = bVar2.m;
            goodsSpu.name = bVar2.c;
            orderedFood.setAttrIds(bVar2.s);
            orderedFood.spu = goodsSpu;
            orderedFood.sku = goodsSku;
            shopCartItem.food = orderedFood;
        }
        shopCartItem.food.setOriginPrice(bVar2.j);
        shopCartItem.food.spu.detailScheme = bVar2.A;
        shopCartItem.food.spu.setActivityTag(bVar2.m);
        shopCartItem.food.spu.exchangePrice = bVar2.G;
        shopCartItem.food.spu.exchangePriceStr = bVar2.H;
        shopCartItem.descText = bVar2.p;
        shopCartItem.activityLabel = bVar2.e;
        shopCartItem.activityDescription = bVar2.n;
        shopCartItem.invalidReasonText = bVar2.g;
        shopCartItem.itemStockText = bVar2.f;
        shopCartItem.subBoxPrice = bVar2.v;
        shopCartItem.subBoxPriceDesc = bVar2.t;
        shopCartItem.descText = bVar2.p;
        shopCartItem.handPriceInfo = bVar2.w;
        shopCartItem.handPriceInfoList = bVar2.x;
        shopCartItem.importDutiesDesc = bVar2.z;
        shopCartItem.activityTip = bVar2.C;
        shopCartItem.overLimit = bVar2.D;
        shopCartItem.productPrice = bVar2.E;
        shopCartItem.memberIcon = bVar2.F;
        shopCartItem.activityText = bVar2.o;
        shopCartItem.priceAB = bVar.C;
        if (t.a(bVar2.f) && (i2 = shopCartItem.food.sku.realStock) > 0 && i2 <= 9) {
            shopCartItem.itemStockText = com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_shopcart_stock_copy, Integer.valueOf(i2));
        }
        shopCartItem.pocketId = i;
        shopCartItem.food.setCount(bVar2.k);
        shopCartItem.food.setItemCollectionRelations(bVar2.d);
        shopCartItem.food.plusCount = 0;
        shopCartItem.food.setShowPoiMember(bVar2.q);
        shopCartItem.food.setPoiMemberPrice(bVar2.r);
        shopCartItem.food.setCartId(i);
        shopCartItem.food.setProductIcons(bVar2.y);
        shopCartItem.food.setSubTotalPrice(bVar2.h);
        shopCartItem.food.setSubTotalOriginalPrice(bVar2.i);
        shopCartItem.food.shopCartKanoLabel = bVar2.B;
        shopCartItem.food.countDiscountNum = 0;
        if (t.a(shopCartItem.food.spu.picture)) {
            if (!t.a(bVar2.u)) {
                shopCartItem.food.spu.picture = bVar2.u;
            }
        } else {
            bVar2.u = shopCartItem.food.spu.picture;
        }
        return shopCartItem;
    }

    private static boolean a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b bVar, @NonNull ShopCartItem shopCartItem) {
        Object[] objArr = {bVar, shopCartItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9e83beecb4d0642c1f98c68e8c914711", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9e83beecb4d0642c1f98c68e8c914711")).booleanValue();
        }
        if (bVar == null || shopCartItem.food == null) {
            return false;
        }
        long j = bVar.b;
        long j2 = bVar.a;
        GoodsAttr[] goodsAttrArr = bVar.s;
        long spuId = shopCartItem.food.getSpuId();
        long skuId = shopCartItem.food.getSkuId();
        GoodsAttr[] attrIds = shopCartItem.food.getAttrIds();
        if (j == spuId && j2 == skuId && a(goodsAttrArr, attrIds)) {
            if (TextUtils.equals(shopCartItem.food.getActivityTag(), GoodsSpu.ITEM_COLLECTION_REDEEM) || TextUtils.equals(bVar.m, GoodsSpu.ITEM_COLLECTION_REDEEM)) {
                return TextUtils.equals(shopCartItem.food.getActivityTag(), bVar.m);
            }
            return true;
        }
        return false;
    }

    public static boolean a(GoodsAttr[] goodsAttrArr, GoodsAttr[] goodsAttrArr2) {
        int length;
        Object[] objArr = {goodsAttrArr, goodsAttrArr2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f6e988bb0a7ce896736303622a2c4071", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f6e988bb0a7ce896736303622a2c4071")).booleanValue();
        }
        if (((goodsAttrArr == null || goodsAttrArr.length == 0) && (goodsAttrArr2 == null || goodsAttrArr2.length == 0)) || goodsAttrArr == goodsAttrArr2) {
            return true;
        }
        if (goodsAttrArr == null || goodsAttrArr2 == null || goodsAttrArr2.length != (length = goodsAttrArr.length)) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            GoodsAttr goodsAttr = goodsAttrArr[i];
            GoodsAttr goodsAttr2 = goodsAttrArr2[i];
            if (goodsAttr == null) {
                if (goodsAttr2 != null) {
                    return false;
                }
            } else if (goodsAttr.id != goodsAttr2.id) {
                return false;
            }
        }
        return true;
    }

    public static void a(@NonNull com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar, NetPriceCalculatorResult netPriceCalculatorResult) {
        Object[] objArr = {bVar, netPriceCalculatorResult};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "155709ae1fb2c83552d86cac02de91ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "155709ae1fb2c83552d86cac02de91ae");
        } else if (netPriceCalculatorResult != null) {
            bVar.j = netPriceCalculatorResult.o;
            bVar.C = netPriceCalculatorResult.L;
            ShopCartPrice shopCartPrice = bVar.g;
            if (shopCartPrice == null) {
                shopCartPrice = new ShopCartPrice();
                bVar.g = shopCartPrice;
            }
            shopCartPrice.mTotalDiscountedAndBoxPrice = netPriceCalculatorResult.d;
            shopCartPrice.mTotalAndBoxPrice = netPriceCalculatorResult.e;
            shopCartPrice.mThresholdPrice = netPriceCalculatorResult.g;
            shopCartPrice.mShippingFeeTxt = netPriceCalculatorResult.h;
            shopCartPrice.mOriginShippingFeeTxt = netPriceCalculatorResult.j;
            shopCartPrice.mEstimatePackFee = netPriceCalculatorResult.i;
            shopCartPrice.originPacketFee = netPriceCalculatorResult.J;
            shopCartPrice.bagPacketFee = netPriceCalculatorResult.K;
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c> list = netPriceCalculatorResult.r;
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b> list2 = netPriceCalculatorResult.I != null ? netPriceCalculatorResult.I.exceptionProductList : null;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c> b = b(list);
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.c> a2 = a(list);
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.b> list3 = netPriceCalculatorResult.s;
            for (int i = 0; i < com.sankuai.shangou.stone.util.a.a((List) b); i++) {
                if (b.get(i) != null) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c a3 = a(bVar, b.get(i));
                    arrayList.add(a3);
                    a(a3, list2);
                }
            }
            for (int i2 = 0; i2 < com.sankuai.shangou.stone.util.a.a((List) a2); i2++) {
                if (a2.get(i2) != null) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c a4 = a(bVar, a2.get(i2));
                    arrayList2.add(a4);
                    a(a4, list2);
                }
            }
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list3)) {
                com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar = new com.sankuai.waimai.store.platform.domain.core.shopcart.c(0);
                for (int i3 = 0; i3 < list3.size(); i3++) {
                    if (list3.get(i3) != null) {
                        cVar.j.add(a(bVar, list3.get(i3), 0));
                    }
                }
                arrayList3.add(cVar);
            }
            bVar.c = arrayList2;
            bVar.b = arrayList;
            bVar.d = arrayList3;
            bVar.k = netPriceCalculatorResult.n;
            com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c k = bVar.k();
            if (k == null) {
                k = new com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c();
                bVar.i = k;
            }
            k.d = bVar.k().d;
            k.c = false;
            k.f = netPriceCalculatorResult.m;
            k.a(netPriceCalculatorResult.k);
            k.a(netPriceCalculatorResult.G);
            k.a(netPriceCalculatorResult.f);
            k.e = netPriceCalculatorResult.l;
            bVar.t = netPriceCalculatorResult.t;
            bVar.u = netPriceCalculatorResult.u;
            bVar.v = netPriceCalculatorResult.v;
            bVar.w = netPriceCalculatorResult.w;
            bVar.h = netPriceCalculatorResult.x;
            bVar.A = netPriceCalculatorResult.F;
            bVar.B = netPriceCalculatorResult.H;
            ShopCartApiModel d = bVar.d();
            d.collectTitle = netPriceCalculatorResult.y;
            d.collageOrderButtonText = netPriceCalculatorResult.B;
            d.collagePopUpsButtonText = netPriceCalculatorResult.z;
            d.aloneOrderButtonText = netPriceCalculatorResult.A;
            d.orderActualPurchaseThresholdPrice = netPriceCalculatorResult.E;
            d.wmExtendInfo = netPriceCalculatorResult.p;
            d.drugExtra = netPriceCalculatorResult.C;
            d.autoExpand = netPriceCalculatorResult.D;
            d.getShopCartDrugRisk().a = netPriceCalculatorResult.q;
            d.getShopCartDrugRisk().b = SystemClock.elapsedRealtime();
        }
    }
}
