package com.sankuai.waimai.business.restaurant.base.shopcart;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.c;
import com.sankuai.waimai.business.restaurant.base.manager.order.h;
import com.sankuai.waimai.business.restaurant.base.manager.order.j;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.repository.model.RequiredTagInfo;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.poi.RestRecommendPoi;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends a {
    public static ChangeQuickRedirect d;
    public int A;
    public int B;
    public boolean C;
    public String D;
    private j E;
    private com.sankuai.waimai.business.restaurant.base.manager.order.a F;
    public ShopCartPrice e;
    public com.sankuai.waimai.business.restaurant.base.shopcart.tip.c f;
    public String g;
    public h h;
    public int i;
    public int j;
    public int k;
    public int l;
    public String m;
    public RequiredTagInfo n;
    public RestRecommendPoi o;
    public long p;
    public boolean q;
    public String r;
    public String s;
    public f t;
    public int u;
    public ShopCartMemberInfo v;
    public double w;
    public int x;
    public com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.d y;
    public com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.h z;

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ffea47bf75e8b5d9b73694af1502525", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ffea47bf75e8b5d9b73694af1502525");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.b("ShopCartSession", "clear session !", new Object[0]);
        this.t = null;
    }

    public final void a(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d314dc5df9d61a0c1fc8d55dee6f9e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d314dc5df9d61a0c1fc8d55dee6f9e96");
        } else {
            this.w = d2;
        }
    }

    public final void a(Activity activity, int i, int i2, OrderedFood orderedFood, int i3, List<c.a> list, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), orderedFood, Integer.valueOf(i3), list, gVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24cfee3b08cc69d69ab4a3489b995e49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24cfee3b08cc69d69ab4a3489b995e49");
            return;
        }
        a(activity, orderedFood, i2, gVar);
        this.h.a(orderedFood, i, i3, i2, list);
    }

    public final void a(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ece080e378cfdfb81f3615a41949a08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ece080e378cfdfb81f3615a41949a08");
        } else {
            this.h.a(orderedFood);
        }
    }

    public final void b(OrderedFood orderedFood) {
        Object[] objArr = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ad1ce7ee3a2311f89718658a6365e5a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ad1ce7ee3a2311f89718658a6365e5a");
            return;
        }
        this.h.a(orderedFood);
        for (d dVar : this.c) {
            dVar.a(orderedFood);
        }
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6061b08f88c919e129ff7deea8b594f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6061b08f88c919e129ff7deea8b594f");
        } else {
            o();
        }
    }

    public final void a(@Nullable com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, @Nullable e eVar) {
        Object[] objArr = {gVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75876adc7b50ebbef30e313e469fa16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75876adc7b50ebbef30e313e469fa16");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.manager.order.c cVar = new com.sankuai.waimai.business.restaurant.base.manager.order.c();
        cVar.a = this;
        a(gVar, cVar, eVar);
    }

    public final void a(@Nullable com.sankuai.waimai.business.restaurant.base.manager.order.g gVar, @NonNull com.sankuai.waimai.business.restaurant.base.manager.order.c cVar, @Nullable e eVar) {
        Object[] objArr = {gVar, cVar, eVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b085aa62d56060ad4aa6ef047e975c4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b085aa62d56060ad4aa6ef047e975c4a");
        } else {
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.b.a().a(gVar, cVar, eVar);
        }
    }

    private void o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38d8e0908b2b0d26e7928f72d947fb0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38d8e0908b2b0d26e7928f72d947fb0f");
            return;
        }
        this.h = new h(this);
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.e = new ShopCartPrice();
        this.E = new j(this);
        this.F = new com.sankuai.waimai.business.restaurant.base.manager.order.a(this, this.e);
        this.p = System.currentTimeMillis();
    }

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb528392cd6fb9d5fa05c6f8402cb7bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb528392cd6fb9d5fa05c6f8402cb7bf");
            return;
        }
        this.i = 0;
        this.j = 0;
        this.k = 0;
        this.l = 0;
        this.u = -1;
        this.x = 0;
        this.A = 0;
        this.B = 0;
        this.C = false;
        o();
    }

    @Nullable
    public final b d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6c9c869e2ab9318e32e2d800c42ae3", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6c9c869e2ab9318e32e2d800c42ae3") : com.sankuai.waimai.business.restaurant.base.shopcart.calculator.a.a(this);
    }

    public final int e() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1888cbaa5c0ea16aa5c418da362dcb47", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1888cbaa5c0ea16aa5c418da362dcb47")).intValue();
        }
        Iterator<d> a = a();
        while (a.hasNext()) {
            d next = a.next();
            if (next != null) {
                i += next.a();
            }
        }
        return i;
    }

    public final int a(long j) {
        int i = 0;
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd0206149d8dceba1d2387c014e843f8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd0206149d8dceba1d2387c014e843f8")).intValue();
        }
        Iterator<d> a = a();
        while (a.hasNext()) {
            d next = a.next();
            if (next != null) {
                i += next.a(j);
            }
        }
        return i;
    }

    public final int a(long j, long j2) {
        int i = 0;
        Object[] objArr = {new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcecfd9810438e57be418b73db4d9bb0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcecfd9810438e57be418b73db4d9bb0")).intValue();
        }
        Iterator<d> a = a();
        while (a.hasNext()) {
            d next = a.next();
            if (next != null) {
                i += next.a(j, j2);
            }
        }
        return i;
    }

    public final int a(long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "78941295fa992f4c997f76e585b670c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "78941295fa992f4c997f76e585b670c7")).intValue() : a(j, j2, goodsAttrArr, (List<OrderedFood>) null);
    }

    public final int a(long j, long j2, GoodsAttr[] goodsAttrArr, List<OrderedFood> list) {
        Object[] objArr = {new Long(j), new Long(j2), goodsAttrArr, list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e2148763aa754647c607a673b86242a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e2148763aa754647c607a673b86242a")).intValue();
        }
        Iterator<d> a = a();
        int i = 0;
        while (a.hasNext()) {
            d next = a.next();
            if (next != null) {
                i += next.a(j, j2, goodsAttrArr, list);
            }
        }
        return i;
    }

    public final double f() {
        if (this.e != null) {
            return this.e.mTotalDiscountedAndBoxPrice;
        }
        return 0.0d;
    }

    private void a(Activity activity, OrderedFood orderedFood, int i, com.sankuai.waimai.business.restaurant.base.manager.order.g gVar) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = {activity, orderedFood, Integer.valueOf(i), gVar};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542bd834f7fa0b63c81edbe04cc93fee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542bd834f7fa0b63c81edbe04cc93fee");
            return;
        }
        int a = a(orderedFood.getSpuId(), orderedFood.getSkuId());
        int a2 = com.sankuai.waimai.business.restaurant.base.manager.order.b.a(orderedFood.getFoodSku(), a, i);
        this.E.a(activity, orderedFood.getFoodSpu(), orderedFood.getFoodSku(), orderedFood.getAttrIds(), a, a2, gVar);
        this.F.a(activity, orderedFood.getFoodSpu(), orderedFood.getFoodSku(), orderedFood.getAttrIds(), a, a2, gVar);
        orderedFood.setCount(a2);
    }

    public final int g() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7b110e976790410af67c7c120a1b1d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7b110e976790410af67c7c120a1b1d7")).intValue();
        }
        for (d dVar : this.b) {
            if (dVar != null) {
                i += dVar.b();
            }
        }
        return i;
    }

    public final boolean a(int i, Map<Long, GoodsSpu> map, boolean z) {
        boolean z2;
        ArrayList<OrderedFood> h;
        Object[] objArr = {Integer.valueOf(i), map, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c21898d150b376a13b42fc0bf938b4f5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c21898d150b376a13b42fc0bf938b4f5")).booleanValue();
        }
        if (i != 1 && i != 3 && map != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = d;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4a4431f00446da6945ab627a6299c088", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4a4431f00446da6945ab627a6299c088")).booleanValue();
            } else {
                z2 = e() > 0;
            }
            if (!z2 || (h = h()) == null || h.isEmpty()) {
                return false;
            }
            ArrayList arrayList = new ArrayList();
            Iterator<OrderedFood> it = h.iterator();
            while (it.hasNext()) {
                OrderedFood next = it.next();
                GoodsSpu goodsSpu = map.get(Long.valueOf(next.getSpuId()));
                if (z || goodsSpu != null) {
                    boolean b = com.sankuai.waimai.business.restaurant.base.manager.order.b.b(next, goodsSpu);
                    boolean c = com.sankuai.waimai.business.restaurant.base.manager.order.b.c(next, goodsSpu);
                    if (b || !c) {
                        arrayList.add(next);
                    } else {
                        next.updateGoodSpu(goodsSpu);
                        a(goodsSpu);
                    }
                }
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                a((OrderedFood) it2.next());
            }
            c(arrayList);
            return arrayList.size() > 0;
        }
        return false;
    }

    public Map<Long, GoodsSpu> a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f59ac1f8e6639c7da2b197e32945c97", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f59ac1f8e6639c7da2b197e32945c97");
        }
        if (list == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (GoodsSpu goodsSpu : list) {
            if (goodsSpu != null) {
                long id = goodsSpu.getId();
                if (hashMap.get(Long.valueOf(id)) == null) {
                    hashMap.put(Long.valueOf(id), goodsSpu);
                }
            }
        }
        return hashMap;
    }

    public final ArrayList<OrderedFood> h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac9535af67ca818614eb242a7c564fee", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac9535af67ca818614eb242a7c564fee");
        }
        final ArrayList<OrderedFood> arrayList = new ArrayList<>();
        h.a.b(this, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.b.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
            public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "685014f138968b711128e8333f2c7210", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "685014f138968b711128e8333f2c7210")).booleanValue();
                }
                if (shopCartItem.food != null) {
                    OrderedFood orderedFood = shopCartItem.food;
                    if (i4 == 0) {
                        if (arrayList.contains(orderedFood)) {
                            ((OrderedFood) arrayList.get(arrayList.indexOf(orderedFood))).addCount(orderedFood.getCount());
                        } else {
                            arrayList.add(orderedFood.m19clone());
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
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35896753374a96321c9db28dabc5b8c3", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35896753374a96321c9db28dabc5b8c3");
        }
        ArrayList<OrderedFood> h = h();
        ArrayList<OrderedFood> arrayList = new ArrayList<>();
        if (h != null) {
            Iterator<OrderedFood> it = h.iterator();
            while (it.hasNext()) {
                OrderedFood next = it.next();
                if (next.getSpuId() == j) {
                    arrayList.add(next.m19clone());
                }
            }
        }
        return arrayList;
    }

    private void a(GoodsSpu goodsSpu) {
        Object[] objArr = {goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbc28af366dbde383866f019e88d3255", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbc28af366dbde383866f019e88d3255");
        } else if (goodsSpu != null) {
            Iterator<d> a = a();
            while (a.hasNext()) {
                d next = a.next();
                if (next != null) {
                    Object[] objArr2 = {goodsSpu};
                    ChangeQuickRedirect changeQuickRedirect2 = d.a;
                    if (PatchProxy.isSupport(objArr2, next, changeQuickRedirect2, false, "61970306d47d1c4a7439b8d1fe7b1ddc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, next, changeQuickRedirect2, false, "61970306d47d1c4a7439b8d1fe7b1ddc");
                    } else if (next.c != null) {
                        for (int i = 0; i < next.c.size(); i++) {
                            ShopCartItem shopCartItem = next.c.get(i);
                            if (shopCartItem.food != null && shopCartItem.food.spu != null && shopCartItem.food.spu.getId() == goodsSpu.getId()) {
                                shopCartItem.food.updateGoodSpu(goodsSpu);
                            }
                        }
                    }
                }
            }
        }
    }

    public final int a(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b203045358985e18dfbeeb8f6be02c81", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b203045358985e18dfbeeb8f6be02c81")).intValue();
        }
        Iterator<d> a = a();
        while (a.hasNext()) {
            d next = a.next();
            RequiredTagInfo requiredTagInfo = k.a().n(str).n;
            if (next != null && this.n != null) {
                for (ShopCartItem shopCartItem : next.c) {
                    if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.getPhysicalTag() != null && !shopCartItem.food.getPhysicalTag().equals(requiredTagInfo.requiredTagId)) {
                        i += shopCartItem.food.getCount();
                    }
                }
            }
        }
        return i;
    }

    public final List<OrderedFood> b(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6a5b79af78ea64b7c9757f1e35c7b1a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6a5b79af78ea64b7c9757f1e35c7b1a");
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
        c(arrayList2);
        return this.h.a(arrayList);
    }

    private void c(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9587f32d46fead2b2b52057b5ea1d32c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9587f32d46fead2b2b52057b5ea1d32c");
        } else {
            this.h.b(list);
        }
    }

    public final com.sankuai.waimai.business.restaurant.base.shopcart.tip.c i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d55a0e86387d89943f9b4bf854dca0b8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.base.shopcart.tip.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d55a0e86387d89943f9b4bf854dca0b8");
        }
        if (this.f == null) {
            this.f = new com.sankuai.waimai.business.restaurant.base.shopcart.tip.c();
        }
        return this.f;
    }

    public final boolean j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "627a8b419a379f4e891cd71622b8c63c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "627a8b419a379f4e891cd71622b8c63c")).booleanValue();
        }
        Iterator<d> a = a();
        while (a.hasNext()) {
            d next = a.next();
            if (next != null && next.c != null) {
                for (ShopCartItem shopCartItem : next.c) {
                    if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.spu != null && shopCartItem.food.sku != null) {
                        return false;
                    }
                }
                continue;
            }
        }
        return true;
    }

    public final boolean k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "64d5fabe2273a57e0246801fe3b26076", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "64d5fabe2273a57e0246801fe3b26076")).booleanValue() : this.C && l();
    }

    public final void a(int i, int i2) {
        this.B = i;
        this.A = i2;
    }

    public final void n() {
        this.B = 0;
        this.A = 0;
    }

    public final boolean l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "408d1509cfc4de7802f9d531061f614a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "408d1509cfc4de7802f9d531061f614a")).booleanValue();
        }
        ShopCartMemberInfo shopCartMemberInfo = this.v;
        return (com.sankuai.waimai.business.restaurant.composeorder.a.b || shopCartMemberInfo == null || shopCartMemberInfo.getTipText() == null || TextUtils.isEmpty(shopCartMemberInfo.getTipText().bizTTitle)) ? false : true;
    }

    public final boolean m() {
        ShopCartMemberInfo.MemberFloatLayerInfo memberFloatLayerInfo;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7aac8e2a0fd3419833b6876ed2ac58e7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7aac8e2a0fd3419833b6876ed2ac58e7")).booleanValue();
        }
        ShopCartMemberInfo shopCartMemberInfo = this.v;
        if (shopCartMemberInfo == null) {
            return false;
        }
        try {
            memberFloatLayerInfo = shopCartMemberInfo.getMemberFloatLayerInfo();
        } catch (Exception unused) {
            memberFloatLayerInfo = null;
        }
        return (memberFloatLayerInfo == null || memberFloatLayerInfo.productList.size() == 0 || memberFloatLayerInfo.productList.get(0).type != 13) ? false : true;
    }
}
