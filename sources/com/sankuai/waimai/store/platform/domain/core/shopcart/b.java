package com.sankuai.waimai.store.platform.domain.core.shopcart;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.HandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.order.ShopCartPrice;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartCouponInfo;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartHandPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartWeightInfo;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.NetPriceCalculatorResult;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.g;
import com.sankuai.waimai.store.platform.domain.manager.order.b;
import com.sankuai.waimai.store.platform.domain.manager.order.d;
import com.sankuai.waimai.store.platform.domain.manager.order.f;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends a {
    public static ChangeQuickRedirect f;
    public NetPriceCalculatorResult.SubmitBuyInfo A;
    public int B;
    public Map<String, String> C;
    private com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.b D;
    private f E;
    private ShopCartApiModel F;
    public ShopCartPrice g;
    public String h;
    public com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c i;
    public String j;
    public g k;
    public d l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public long r;
    public boolean s;
    public CartWeightInfo t;
    public CartCouponInfo u;
    public ShopCartTotalBoxPriceInfo v;
    public List<CartHandPriceInfo> w;
    public Map<String, Object> x;
    public Map<String, Object> y;
    public Map<String, Object> z;

    public final void a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, int i2, @Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        b.a aVar2;
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96766e77de31652ac7bd6782db8267f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96766e77de31652ac7bd6782db8267f7");
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            Object[] objArr2 = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), Integer.valueOf(i2), arrayList, aVar};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "11116c33f29ada7b2617ca6d8b98fb97", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "11116c33f29ada7b2617ca6d8b98fb97");
            } else {
                OrderedFood a = a(goodsSpu, goodsSku, goodsAttrArr, i, aVar, i2);
                if (a != null) {
                    d dVar = this.l;
                    Object[] objArr3 = {a, Integer.valueOf(i), Integer.valueOf(i2), arrayList};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "8e5d577771a60b3d4e02afb1cb261799", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "8e5d577771a60b3d4e02afb1cb261799");
                    } else {
                        b bVar2 = dVar.b;
                        Object[] objArr4 = {bVar2, a, Integer.valueOf(i), Integer.valueOf(i2), arrayList};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "e7949b77136effd31e257f7806eb4d83", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "e7949b77136effd31e257f7806eb4d83");
                        } else {
                            c a2 = d.a.a(bVar2, i, a.spu);
                            List<c> a3 = d.a.a(bVar2, i);
                            a.setBuyType(i);
                            a.setCheckStatus(1);
                            d.a.a(a2, a, i2, arrayList);
                            if (!arrayList.isEmpty() && (aVar2 = (b.a) arrayList.get(0)) != null) {
                                aVar2.a = a3.indexOf(a2);
                                aVar2.e = i;
                            }
                            d.a.b(bVar2);
                        }
                    }
                }
            }
            com.sankuai.waimai.store.platform.domain.manager.order.b bVar3 = new com.sankuai.waimai.store.platform.domain.manager.order.b();
            bVar3.a = this;
            bVar3.b = arrayList;
            if (goodsSpu.couponPageSource == 10) {
                a(goodsSpu, aVar, bVar3, bVar);
            } else {
                a(aVar, bVar3, bVar);
            }
        } catch (com.sankuai.waimai.store.exceptions.a e) {
            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(e, bVar);
        }
    }

    public final void a(OrderedFood orderedFood, int i, int i2, int i3, @Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i4, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar2;
        c cVar;
        com.sankuai.waimai.store.platform.domain.manager.order.b bVar3;
        Object[] objArr = {orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar, Integer.valueOf(i4), bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9936fc1cf4a33f63a6191017a59f1d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9936fc1cf4a33f63a6191017a59f1d4");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Object[] objArr2 = {orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, aVar, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9214dd9ccb2bfe2c267c3a73d3a8532", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9214dd9ccb2bfe2c267c3a73d3a8532");
            } else {
                OrderedFood a = a(orderedFood.spu, orderedFood.sku, orderedFood.getAttrIds(), i3, aVar, i4);
                d dVar = this.l;
                int i5 = a.count;
                Object[] objArr3 = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, Integer.valueOf(i5)};
                ChangeQuickRedirect changeQuickRedirect3 = d.a;
                try {
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "12022a13403ed6b622a00a8cf8765ccf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "12022a13403ed6b622a00a8cf8765ccf");
                    } else {
                        b bVar4 = dVar.b;
                        Object[] objArr4 = {bVar4, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "2204ee99fff584686d556ff4b5dbd651", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "2204ee99fff584686d556ff4b5dbd651");
                        } else {
                            List<c> a2 = d.a.a(bVar4, i3);
                            if (a2.size() > i && (cVar = a2.get(i)) != null && cVar.j != null && cVar.j.size() > i2) {
                                ShopCartItem shopCartItem = cVar.j.get(i2);
                                if (shopCartItem.isFoodAvailable()) {
                                    OrderedFood orderedFood2 = shopCartItem.food;
                                    orderedFood2.setCheckStatus(1);
                                    orderedFood2.addCount(i5);
                                    if (orderedFood2.sku != null) {
                                        orderedFood2.sku.clearInstallment();
                                    }
                                    b.a aVar2 = new b.a();
                                    arrayList.add(aVar2);
                                    aVar2.c = 3;
                                    aVar2.a = i;
                                    aVar2.b = i2;
                                    aVar2.d = i5;
                                    aVar2.e = i3;
                                }
                            }
                            d.a.b(bVar4);
                        }
                    }
                } catch (com.sankuai.waimai.store.exceptions.a e) {
                    e = e;
                    bVar2 = bVar;
                    com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(e, bVar2);
                }
            }
            bVar3 = new com.sankuai.waimai.store.platform.domain.manager.order.b();
            bVar3.a = this;
            bVar3.b = arrayList;
            bVar2 = bVar;
        } catch (com.sankuai.waimai.store.exceptions.a e2) {
            e = e2;
            bVar2 = bVar;
        }
        try {
            a(aVar, bVar3, bVar2);
        } catch (com.sankuai.waimai.store.exceptions.a e3) {
            e = e3;
            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(e, bVar2);
        }
    }

    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r9v3 */
    public final OrderedFood a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7539b964139e9dfff8ad890ccb6e7d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7539b964139e9dfff8ad890ccb6e7d3");
        }
        Object[] objArr2 = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), null, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "94e23ea168ac8df58d0fa7d18b0ffd93", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "94e23ea168ac8df58d0fa7d18b0ffd93");
        }
        OrderedFood a = a(goodsSpu, goodsSku, goodsAttrArr, aVar);
        if (a != null) {
            int c = c(a);
            a.setCheckStatus(1);
            ?? r9 = c <= a.getMinCount() ? 1 : 0;
            int[] iArr = new int[1];
            d dVar = this.l;
            Object[] objArr3 = {a, Integer.valueOf(i), Byte.valueOf((byte) r9), null, iArr};
            ChangeQuickRedirect changeQuickRedirect3 = d.a;
            if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "eeedeae5f54f6189cb990e413d9812d1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "eeedeae5f54f6189cb990e413d9812d1");
            } else {
                d.a.a(dVar.b, a, i, r9, null, iArr);
            }
            a.isRemoveAll = r9;
            if (r9 != 0) {
                a.setCount(c);
            } else {
                a.setCount(iArr[0]);
            }
        }
        return a;
    }

    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r0v6 */
    public final void b(OrderedFood orderedFood, int i, int i2, int i3, @Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i4, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar2;
        c cVar;
        ShopCartItem shopCartItem;
        com.sankuai.waimai.store.platform.domain.manager.order.b bVar3;
        Object[] objArr = {orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), aVar, Integer.valueOf(i4), bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e4d1a856e639e2abc1806bcdff232c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e4d1a856e639e2abc1806bcdff232c6");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Object[] objArr2 = {orderedFood, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, aVar, Integer.valueOf(i4)};
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5aacaf824550f74856f73b7c1e932dd2", RobustBitConfig.DEFAULT_VALUE)) {
                OrderedFood orderedFood2 = (OrderedFood) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5aacaf824550f74856f73b7c1e932dd2");
            } else {
                OrderedFood a = a(orderedFood.spu, orderedFood.sku, orderedFood.getAttrIds(), aVar);
                if (a != null) {
                    a.setCheckStatus(1);
                    ?? r0 = c(orderedFood) <= a.getMinCount() ? 1 : 0;
                    d dVar = this.l;
                    Object[] objArr3 = {Byte.valueOf((byte) r0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect3 = d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "37c88fc72e3a30ed704d7722f5daedd5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "37c88fc72e3a30ed704d7722f5daedd5");
                    } else {
                        b bVar4 = dVar.b;
                        Object[] objArr4 = {bVar4, Byte.valueOf((byte) r0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), arrayList, Integer.valueOf(i4)};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "337be8e398746943a620e7e47ec99320", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "337be8e398746943a620e7e47ec99320");
                        } else {
                            List<c> a2 = d.a.a(bVar4, i3);
                            if (i >= 0 && i < a2.size() && (cVar = a2.get(i)) != null) {
                                List<ShopCartItem> list = cVar.j;
                                d.a.a(list);
                                if (i2 >= 0 && list != null && i2 < list.size() && (shopCartItem = list.get(i2)) != null && shopCartItem.isFoodAvailable()) {
                                    OrderedFood orderedFood3 = shopCartItem.food;
                                    if (r0 != 0) {
                                        d.a.a(bVar4, orderedFood3);
                                    } else if (orderedFood3.getCount() == i4) {
                                        d.a.a(bVar4, i, i2, i3);
                                    } else {
                                        orderedFood3.addCount(-i4);
                                        b.a aVar2 = new b.a();
                                        arrayList.add(aVar2);
                                        aVar2.c = 4;
                                        aVar2.a = i;
                                        aVar2.b = i2;
                                        aVar2.d = i4;
                                        aVar2.e = i3;
                                    }
                                }
                            }
                            d.a.b(bVar4);
                        }
                    }
                    a.isRemoveAll = r0;
                }
            }
            bVar3 = new com.sankuai.waimai.store.platform.domain.manager.order.b();
            bVar3.a = this;
            bVar3.b = arrayList;
            bVar2 = bVar;
        } catch (com.sankuai.waimai.store.exceptions.a e) {
            e = e;
            bVar2 = bVar;
        }
        try {
            a(aVar, bVar3, bVar2);
        } catch (com.sankuai.waimai.store.exceptions.a e2) {
            e = e2;
            com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b.a(e, bVar2);
        }
    }

    public final void a(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a7d939eda22bc4b7e9481239c99eb04", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a7d939eda22bc4b7e9481239c99eb04");
            return;
        }
        this.l.a(orderedFood);
        for (c cVar : this.d) {
            Object[] objArr2 = {orderedFood};
            ChangeQuickRedirect changeQuickRedirect2 = c.a;
            if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "16393357de973982d99830d59f085b26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "16393357de973982d99830d59f085b26");
            } else {
                for (ShopCartItem shopCartItem : cVar.j) {
                    if (shopCartItem.food != null && orderedFood != null && orderedFood.equals(shopCartItem.food)) {
                        cVar.j.remove(orderedFood);
                    }
                }
            }
        }
    }

    public final void a(GoodsSpu goodsSpu, long j) {
        Object[] objArr = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ffd8dd5e595d11ab9b5a0a88c7ab2ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ffd8dd5e595d11ab9b5a0a88c7ab2ad");
            return;
        }
        d dVar = this.l;
        Object[] objArr2 = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "4ab5bd2640305f70f3a2a73e68271fb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "4ab5bd2640305f70f3a2a73e68271fb5");
            return;
        }
        b bVar = dVar.b;
        Object[] objArr3 = {bVar, goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect3 = d.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "d6b1894f5cdc43d31bc1ad387ad9576d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "d6b1894f5cdc43d31bc1ad387ad9576d");
        } else if (goodsSpu != null) {
            d.a.a(bVar.c, goodsSpu, j);
            d.a.a(bVar.b, goodsSpu, j);
            d.a.b(bVar);
        }
    }

    public final void a(@Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4ac19d3d5539909a62e96f22f508530", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4ac19d3d5539909a62e96f22f508530");
            return;
        }
        c();
        com.sankuai.waimai.store.platform.domain.manager.order.b bVar2 = new com.sankuai.waimai.store.platform.domain.manager.order.b();
        bVar2.a = this;
        bVar2.b = null;
        a(aVar, bVar2, bVar);
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a20280ab04fc4885459f55102142fcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a20280ab04fc4885459f55102142fcc");
        } else {
            m();
        }
    }

    public final void b(@Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9783bb2435aa977b985117a0d5ffcfb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9783bb2435aa977b985117a0d5ffcfb");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.order.b bVar2 = new com.sankuai.waimai.store.platform.domain.manager.order.b();
        bVar2.a = this;
        a(aVar, bVar2, bVar);
    }

    public final void a(GoodsSpu goodsSpu, @Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar) {
        Object[] objArr = {goodsSpu, aVar, bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "828249970ddfbd1fafa7ab2d070f52e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "828249970ddfbd1fafa7ab2d070f52e4");
            return;
        }
        com.sankuai.waimai.store.platform.domain.manager.order.b bVar2 = new com.sankuai.waimai.store.platform.domain.manager.order.b();
        bVar2.a = this;
        a(goodsSpu, aVar, bVar2, bVar);
    }

    private void a(@Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.order.b bVar, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar2) {
        Object[] objArr = {aVar, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d56999f8be02f7ad6fc05637c0489046", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d56999f8be02f7ad6fc05637c0489046");
        } else {
            this.D.a(null, aVar, this, bVar.b, bVar2);
        }
    }

    private void a(@Nullable GoodsSpu goodsSpu, @Nullable com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, @NonNull com.sankuai.waimai.store.platform.domain.manager.order.b bVar, @Nullable com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b bVar2) {
        Object[] objArr = {goodsSpu, aVar, bVar, bVar2};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9653f554ab8ce163996b813fca316c65", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9653f554ab8ce163996b813fca316c65");
        } else {
            this.D.a(goodsSpu, aVar, this, bVar.b, bVar2);
        }
    }

    private void m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9a457b810aecb4204bf5f76ba26bb8d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9a457b810aecb4204bf5f76ba26bb8d");
            return;
        }
        this.l = new d(this);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.g = new ShopCartPrice();
        this.E = new f(this);
        this.r = System.currentTimeMillis();
        this.F = new ShopCartApiModel();
        this.i = new com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c();
        this.x = new HashMap();
    }

    public final ShopCartApiModel d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f62d97cdca8c04ecf1a7afbcccd2d3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShopCartApiModel) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f62d97cdca8c04ecf1a7afbcccd2d3e");
        }
        if (this.F == null) {
            this.F = new ShopCartApiModel();
        }
        return this.F;
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99d829243a591502122edd21293ddb8d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99d829243a591502122edd21293ddb8d");
            return;
        }
        this.D = new com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.b();
        this.m = 0;
        this.n = 0;
        this.o = 0;
        this.p = 0;
        m();
    }

    public final int e() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8440cce0a46ccdb066f3a7ec3c25a9d0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8440cce0a46ccdb066f3a7ec3c25a9d0")).intValue();
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null) {
                i += next.a();
            }
        }
        return i;
    }

    public final int a(long j) {
        int i = 0;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b1fe9dea328993fbb33a47fab9d9c9e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b1fe9dea328993fbb33a47fab9d9c9e")).intValue();
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null) {
                i += next.a(j);
            }
        }
        return i;
    }

    public final int a(long j, long j2) {
        int i = 0;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "508026dec2df497e4fef6d227396344c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "508026dec2df497e4fef6d227396344c")).intValue();
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null) {
                i += next.a(j, j2);
            }
        }
        return i;
    }

    public final int a(long j, long j2, String str) {
        int i = 0;
        Object[] objArr = {new Long(j), new Long(j2), str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f152de97d9cb746f50b59166f4260450", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f152de97d9cb746f50b59166f4260450")).intValue();
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null) {
                i += next.a(j, j2, str);
            }
        }
        return i;
    }

    public final int a(long j, String str) {
        int i = 0;
        Object[] objArr = {new Long(j), str};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d143e0011cc1b8703ec56767a680ab8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d143e0011cc1b8703ec56767a680ab8")).intValue();
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null) {
                i += next.a(j, str);
            }
        }
        return i;
    }

    public final int a(long j, long j2, GoodsAttr[] goodsAttrArr) {
        int i = 0;
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4658b7e81bc1b6a66147bb7e803330c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4658b7e81bc1b6a66147bb7e803330c1")).intValue();
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null) {
                i += next.a(j, j2, goodsAttrArr);
            }
        }
        return i;
    }

    private int c(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7971105db2a2fd8fe0335722a8df8ef", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7971105db2a2fd8fe0335722a8df8ef")).intValue() : a(orderedFood.getSpuId(), orderedFood.getSkuId(), orderedFood.getAttrIds());
    }

    public final HandPriceInfo b(long j, long j2) {
        HandPriceInfo b;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee78e63fdd1ed51b2cb3125f14567283", RobustBitConfig.DEFAULT_VALUE)) {
            return (HandPriceInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee78e63fdd1ed51b2cb3125f14567283");
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null && (b = next.b(j, j2)) != null) {
                return b;
            }
        }
        return null;
    }

    public final String c(long j, long j2) {
        String c;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8ea2e8d739823dcf8e468037a1a3c54", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8ea2e8d739823dcf8e468037a1a3c54");
        }
        Iterator<c> a = a();
        while (a.hasNext()) {
            c next = a.next();
            if (next != null && (c = next.c(j, j2)) != null) {
                return c;
            }
        }
        return null;
    }

    public final double f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "407b29e6162935bc6e0e72d43f63afa9", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "407b29e6162935bc6e0e72d43f63afa9")).doubleValue() : d().orderActualPurchaseThresholdPrice;
    }

    public final double g() {
        if (this.g != null) {
            return this.g.mTotalDiscountedAndBoxPrice;
        }
        return 0.0d;
    }

    private OrderedFood a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, int i2) throws com.sankuai.waimai.store.exceptions.a {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i), aVar, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fc09bb1a8ee20e102b1c57edb3d558a", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fc09bb1a8ee20e102b1c57edb3d558a");
        }
        int a = a(goodsSpu.getId(), goodsSku.getSkuId(), goodsAttrArr);
        int a2 = com.sankuai.waimai.store.platform.domain.manager.order.a.a(goodsSku, a, i2);
        this.E.a(goodsSpu, goodsSku, goodsAttrArr, a, a2, i, aVar);
        return new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, a2);
    }

    private OrderedFood a(GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {goodsSpu, goodsSku, goodsAttrArr, aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90470739ce6624876c3eba088e847d8f", RobustBitConfig.DEFAULT_VALUE)) {
            return (OrderedFood) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90470739ce6624876c3eba088e847d8f");
        }
        int a = a(aVar);
        if (this.g.hasTipsOrderNumLimit && n() <= a) {
            this.g.hasTipsOrderNumLimit = false;
        }
        return new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, 0);
    }

    private int n() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df5decbdabff7c75b259ded0ea39920a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df5decbdabff7c75b259ded0ea39920a")).intValue();
        }
        for (c cVar : this.b) {
            if (cVar != null) {
                i += cVar.b();
            }
        }
        return i;
    }

    private int a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a754ebe8c93f42b5f4b025049d90d42", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a754ebe8c93f42b5f4b025049d90d42")).intValue();
        }
        if (aVar == null || !aVar.c()) {
            return Integer.MAX_VALUE;
        }
        return aVar.b.getNumDiscountRestrict();
    }

    public final void b(final OrderedFood orderedFood) {
        final int stock;
        int a;
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fea1ecc803cd1ec5748c0c3aad35a941", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fea1ecc803cd1ec5748c0c3aad35a941");
            return;
        }
        final d dVar = this.l;
        Object[] objArr2 = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "9c605d68e3e61910de5a1c7cdaa49138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "9c605d68e3e61910de5a1c7cdaa49138");
        } else if (orderedFood == null || (a = dVar.b.a(orderedFood.getSpuId(), orderedFood.getSkuId())) <= (stock = orderedFood.getStock())) {
        } else {
            final int i = a - stock;
            d.a.InterfaceC1265a interfaceC1265a = new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.d.2
                public static ChangeQuickRedirect a;
                public int b;

                {
                    this.b = i;
                }

                @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                public final boolean a(ShopCartItem shopCartItem, int i2, int i3, int i4, int i5) {
                    Object[] objArr3 = {shopCartItem, Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2a0d6eec968df5b9e0d3e81006cf2ed3", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2a0d6eec968df5b9e0d3e81006cf2ed3")).booleanValue();
                    }
                    if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getSpuId() == orderedFood.getSpuId() && shopCartItem.food.getSkuId() == orderedFood.getSkuId()) {
                        shopCartItem.food.setStock(stock);
                        if (shopCartItem.food.count > this.b) {
                            shopCartItem.food.count -= this.b;
                            this.b = 0;
                            return false;
                        }
                        d dVar2 = d.this;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
                        ChangeQuickRedirect changeQuickRedirect4 = d.a;
                        if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "79f99bd02c18f3ffd7e4d58b007fde0e", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "79f99bd02c18f3ffd7e4d58b007fde0e");
                        } else {
                            a.a(dVar2.b, i3, i4, i5);
                        }
                        this.b -= shopCartItem.food.count;
                    }
                    return true;
                }
            };
            d.a.a(dVar.b, interfaceC1265a);
            d.a.b(dVar.b, interfaceC1265a);
        }
    }

    public final boolean h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0d5fddeade6513d412c10268131f407", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0d5fddeade6513d412c10268131f407")).booleanValue() : e() > 0;
    }

    public final ArrayList<OrderedFood> i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6269434494aabe491eeba82ab726fdd9", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6269434494aabe491eeba82ab726fdd9");
        }
        final ArrayList<OrderedFood> arrayList = new ArrayList<>();
        d.a.c(this, new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.core.shopcart.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
            public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9563b230d36117414ed08547c129ebc3", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9563b230d36117414ed08547c129ebc3")).booleanValue();
                }
                if (shopCartItem.food != null) {
                    OrderedFood orderedFood = shopCartItem.food;
                    if (i4 == 0) {
                        if (arrayList.contains(orderedFood)) {
                            ((OrderedFood) arrayList.get(arrayList.indexOf(orderedFood))).addCount(orderedFood.getCount());
                        } else {
                            arrayList.add(orderedFood.m22clone());
                        }
                    } else if (i4 == 1) {
                        if (arrayList.contains(orderedFood)) {
                            OrderedFood orderedFood2 = (OrderedFood) arrayList.get(arrayList.indexOf(orderedFood));
                            orderedFood2.addCount(orderedFood.getCount());
                            orderedFood2.plusCount += orderedFood.count;
                        } else {
                            OrderedFood m22clone = orderedFood.m22clone();
                            m22clone.plusCount = m22clone.count;
                            arrayList.add(m22clone);
                        }
                    }
                }
                return true;
            }
        });
        return arrayList;
    }

    public final ArrayList<OrderedFood> b(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f257e7def477490554a61a131b25d9e3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f257e7def477490554a61a131b25d9e3");
        }
        ArrayList<OrderedFood> i = i();
        ArrayList<OrderedFood> arrayList = new ArrayList<>();
        if (i != null) {
            Iterator<OrderedFood> it = i.iterator();
            while (it.hasNext()) {
                OrderedFood next = it.next();
                if (next.getSpuId() == j) {
                    arrayList.add(next.m22clone());
                }
            }
        }
        return arrayList;
    }

    public final int j() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9c3aa0139cb0d5134b1c34d6437d49", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9c3aa0139cb0d5134b1c34d6437d49")).intValue();
        }
        Iterator<c> b = b();
        while (b.hasNext()) {
            c next = b.next();
            if (next != null) {
                i += next.a();
            }
        }
        return i;
    }

    public final List<OrderedFood> a(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "437838f9eebf20ee60a42d03469603d7", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "437838f9eebf20ee60a42d03469603d7");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OrderedFood orderedFood : list) {
            if (orderedFood.getStatus() == 0 && orderedFood.getCount() >= orderedFood.getMinCount()) {
                arrayList.add(orderedFood);
            } else {
                arrayList2.add(orderedFood);
            }
        }
        d(arrayList2);
        d dVar = this.l;
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "928a92a4f2535445cb6b887dbc4a0846", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "928a92a4f2535445cb6b887dbc4a0846") : d.a.b(dVar.b, arrayList);
    }

    public final List<OrderedFood> b(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21c817b424d415863fd662d848b24920", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21c817b424d415863fd662d848b24920");
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (OrderedFood orderedFood : list) {
            if (orderedFood.getStatus() == 0 && orderedFood.getCount() >= orderedFood.getMinCount()) {
                arrayList.add(orderedFood);
            } else {
                arrayList2.add(orderedFood);
            }
        }
        d(arrayList2);
        d dVar = this.l;
        Object[] objArr2 = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = d.a;
        return PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "ec280cc1c881858836f3ca6b9d255df2", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "ec280cc1c881858836f3ca6b9d255df2") : d.a.a(dVar.b, arrayList);
    }

    private void d(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ce3329a6b49e5c05be83e3c9fd7ded5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ce3329a6b49e5c05be83e3c9fd7ded5");
        } else {
            this.l.a(list);
        }
    }

    public final com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc857fcc48d5314abea85bc8868e5e12", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc857fcc48d5314abea85bc8868e5e12");
        }
        if (this.i == null) {
            this.i = new com.sankuai.waimai.store.platform.domain.core.shopcart.tip.c();
        }
        return this.i;
    }

    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffd25b88c5f91770914efe28d0b97c07", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffd25b88c5f91770914efe28d0b97c07")).booleanValue();
        }
        Iterator<c> b = b();
        while (b.hasNext()) {
            c next = b.next();
            if (next != null && next.j != null) {
                for (ShopCartItem shopCartItem : next.j) {
                    if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.spu != null && shopCartItem.food.sku != null) {
                        return false;
                    }
                }
                continue;
            }
        }
        return true;
    }

    public final boolean c(List<GoodsSpu> list) {
        Map map;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8169f0610d7f5b2851ad0c8bb505bb19", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8169f0610d7f5b2851ad0c8bb505bb19")).booleanValue();
        }
        Object[] objArr2 = {list};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "585d867bc256ea7c91283696d3ef5004", RobustBitConfig.DEFAULT_VALUE)) {
            map = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "585d867bc256ea7c91283696d3ef5004");
        } else if (list == null) {
            map = null;
        } else {
            HashMap hashMap = new HashMap();
            for (GoodsSpu goodsSpu : list) {
                if (goodsSpu != null) {
                    long id = goodsSpu.getId();
                    if (hashMap.get(Long.valueOf(id)) == null) {
                        hashMap.put(Long.valueOf(id), goodsSpu);
                    }
                }
            }
            map = hashMap;
        }
        if (map == null) {
            return false;
        }
        ArrayList<OrderedFood> i = i();
        if (com.sankuai.shangou.stone.util.a.b(i)) {
            return false;
        }
        Iterator<OrderedFood> it = i.iterator();
        while (it.hasNext()) {
            OrderedFood next = it.next();
            GoodsSpu goodsSpu2 = (GoodsSpu) map.get(Long.valueOf(next.getSpuId()));
            if (goodsSpu2 != null) {
                return com.sankuai.waimai.store.platform.domain.manager.order.a.a(next, goodsSpu2);
            }
        }
        return false;
    }
}
