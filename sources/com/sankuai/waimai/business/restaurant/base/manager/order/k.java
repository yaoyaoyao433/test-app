package com.sankuai.waimai.business.restaurant.base.manager.order;

import android.app.Activity;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.SparseArray;
import com.dianping.shield.dynamic.utils.DMKeys;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.h;
import com.sankuai.waimai.business.restaurant.base.manager.order.i;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.business.restaurant.base.shopcart.a;
import com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.ShopCartMemberInfo;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.globalcart.model.CartProduct;
import com.sankuai.waimai.globalcart.model.GlobalCart;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.ComboProduct;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.platform.domain.manager.observers.OrderGoodObserver;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class k implements com.sankuai.waimai.foundation.core.service.globalcart.b {
    public static ChangeQuickRedirect a;
    private static k f;
    public i b;
    public f c;
    public CopyOnWriteArraySet<d> d;
    public CopyOnWriteArraySet<e> e;
    private ArrayList<OrderGoodObserver> g;

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final int c() {
        return 15;
    }

    public static k a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dab7d41f82d3b1edcf0f6e1fa156183d", RobustBitConfig.DEFAULT_VALUE)) {
            return (k) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dab7d41f82d3b1edcf0f6e1fa156183d");
        }
        if (f == null) {
            synchronized (k.class) {
                if (f == null) {
                    f = new k();
                }
            }
        }
        return f;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.sankuai.waimai.business.restaurant.base.shopcart.e {
        public static ChangeQuickRedirect a;
        private String c;
        private com.sankuai.waimai.business.restaurant.base.shopcart.e d;
        private boolean e;

        public a(String str, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
            Object[] objArr = {k.this, str, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb32708d6189e5c96d7cf40c31e5bd8e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb32708d6189e5c96d7cf40c31e5bd8e");
                return;
            }
            this.e = false;
            this.d = eVar;
            this.c = str;
        }

        public a(String str, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar, boolean z) {
            Object[] objArr = {k.this, str, eVar, (byte) 1};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a709fc4c80c76cf9baecf64f2dc8a084", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a709fc4c80c76cf9baecf64f2dc8a084");
                return;
            }
            this.e = false;
            this.d = eVar;
            this.c = str;
            this.e = true;
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0459eb33b501d2fb3a4ef8e54fc88e26", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0459eb33b501d2fb3a4ef8e54fc88e26");
            } else if (this.d != null) {
                this.d.a();
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "694e6bd0bebd9c37200309faecc99b5f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "694e6bd0bebd9c37200309faecc99b5f");
                return;
            }
            k.this.a(this.c, bVar);
            k.this.b(this.c);
            k.this.e(this.c);
            if (this.e) {
                k.this.f();
            }
            if (this.d != null) {
                this.d.a(bVar);
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e56daa9d5c71cd8d7e48e949b5ac670", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e56daa9d5c71cd8d7e48e949b5ac670");
            } else if (this.d != null) {
                this.d.a(aVar);
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc11a9e4e5fb69c8420b5c4261d0f6ed", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc11a9e4e5fb69c8420b5c4261d0f6ed");
            } else if (this.d != null) {
                this.d.b();
            }
        }
    }

    public final void a(final String str, @Nullable final com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24142fac1a8268301299ed042e693f3e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24142fac1a8268301299ed042e693f3e");
            return;
        }
        try {
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a().c();
            i iVar = this.b;
            com.sankuai.waimai.business.restaurant.base.shopcart.e eVar2 = new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.k.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c3ed58cc159afe66213941a396bf84e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c3ed58cc159afe66213941a396bf84e5");
                    } else if (eVar != null) {
                        eVar.a();
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d7ee15255fcc77661330069c27c3ed4e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d7ee15255fcc77661330069c27c3ed4e");
                        return;
                    }
                    k.this.c.a(str);
                    k.this.b(str);
                    k.this.e(str);
                    if (eVar != null) {
                        eVar.a(bVar);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "952a8ba157bfd840547600981dcec159", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "952a8ba157bfd840547600981dcec159");
                    } else if (eVar != null) {
                        eVar.a(aVar);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void b() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38b8d33d67813fb52c6b8412d60a95b1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38b8d33d67813fb52c6b8412d60a95b1");
                    } else if (eVar != null) {
                        eVar.b();
                    }
                }
            };
            Object[] objArr2 = {str, eVar2};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "d75839b78d39a3b8e62e02e06c6d414e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "d75839b78d39a3b8e62e02e06c6d414e");
                return;
            }
            com.sankuai.waimai.business.restaurant.base.shopcart.b f2 = iVar.f(str);
            f2.n();
            g a2 = iVar.a(str);
            i.a aVar = new i.a(str, eVar2);
            Object[] objArr3 = {a2, aVar};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
            if (PatchProxy.isSupport(objArr3, f2, changeQuickRedirect3, false, "43afe476d60f98ec2ca07c885ca418e4", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, f2, changeQuickRedirect3, false, "43afe476d60f98ec2ca07c885ca418e4");
                return;
            }
            f2.c();
            c cVar = new c();
            cVar.a = f2;
            cVar.b = null;
            f2.a(a2, cVar, aVar);
        } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
            eVar.a(e);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a36294ddc22094555e36f5d47188766e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a36294ddc22094555e36f5d47188766e");
            return;
        }
        i iVar = this.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "f26b60ec91227e2f95935daafe901427", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "f26b60ec91227e2f95935daafe901427");
        } else {
            com.sankuai.waimai.business.restaurant.base.shopcart.b g = iVar.g(str);
            g.n();
            g.c();
        }
        this.c.a(str);
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cedaaf5004fcce0cc3884367ce180e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cedaaf5004fcce0cc3884367ce180e5");
        } else if (dVar != null) {
            this.d.remove(dVar);
        }
    }

    private void a(String str, boolean z, int i, Activity activity) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), activity};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "243aab5b375c3be5e5510dd749c8d3a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "243aab5b375c3be5e5510dd749c8d3a7");
            return;
        }
        Iterator<d> it = this.d.iterator();
        while (it.hasNext()) {
            it.next().a(str, z, i, activity);
        }
    }

    public final void a(e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d544c7f77bbfc9125dd2f6e531563e42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d544c7f77bbfc9125dd2f6e531563e42");
        } else if (eVar != null) {
            this.e.remove(eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4907e571d054c0ef91873a442a54dee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4907e571d054c0ef91873a442a54dee3");
            return;
        }
        Iterator<e> it = this.e.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void a(OrderGoodObserver orderGoodObserver) {
        Object[] objArr = {orderGoodObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68494a3594c562369214a4ac1addf8f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68494a3594c562369214a4ac1addf8f7");
        } else if (orderGoodObserver == null) {
            throw new NullPointerException();
        } else {
            if (this.g == null) {
                this.g = new ArrayList<>();
            }
            if (this.g.contains(orderGoodObserver)) {
                return;
            }
            this.g.add(orderGoodObserver);
        }
    }

    public final void b(OrderGoodObserver orderGoodObserver) {
        Object[] objArr = {orderGoodObserver};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2acbfd35c9f647bdaa9f41550ee94ee3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2acbfd35c9f647bdaa9f41550ee94ee3");
            return;
        }
        if (this.g == null) {
            this.g = new ArrayList<>();
        }
        this.g.remove(orderGoodObserver);
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef799ece0dffa53f544b77300ae43c84", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef799ece0dffa53f544b77300ae43c84");
        } else if (this.g != null) {
            Object[] array = this.g.toArray();
            for (int length = array.length - 1; length >= 0; length--) {
                ((OrderGoodObserver) array[length]).aF_();
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final List<WmOrderedFood> c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "101e0e2194a355472109f9efb48f5f43", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "101e0e2194a355472109f9efb48f5f43");
        }
        final com.sankuai.waimai.business.restaurant.base.shopcart.b n = n(str);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.a.a;
        if (PatchProxy.isSupport(objArr2, n, changeQuickRedirect2, false, "f2fe181f2db68fbfa68e5ac0ef11cc5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, n, changeQuickRedirect2, false, "f2fe181f2db68fbfa68e5ac0ef11cc5b");
        }
        final ArrayList arrayList = new ArrayList();
        final SparseArray sparseArray = new SparseArray();
        h.a.a(n, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
            public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                Object[] objArr3 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "34c9fdbacbb34daecc16fe2e52664ffc", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "34c9fdbacbb34daecc16fe2e52664ffc")).booleanValue();
                }
                OrderedFood orderedFood = shopCartItem.food;
                WmOrderedFood wmOrderedFood = new WmOrderedFood(orderedFood.getSpuId(), orderedFood.getSkuId(), orderedFood.getAttrIds(), orderedFood.getCount(), i, 0, orderedFood.getActivityTag());
                wmOrderedFood.groupChatShare = orderedFood.sku.getGroupChatShare();
                wmOrderedFood.seckill = orderedFood.sku.getSeckill();
                wmOrderedFood.comboProducts = ComboProduct.a(orderedFood.getComboItems());
                if (sparseArray.get(i) != null) {
                    ((List) sparseArray.get(i)).add(wmOrderedFood);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(wmOrderedFood);
                    sparseArray.put(i, arrayList2);
                }
                if (arrayList.contains(wmOrderedFood) && ((WmOrderedFood) arrayList.get(arrayList.indexOf(wmOrderedFood))).getCartId() == i) {
                    ((WmOrderedFood) arrayList.get(arrayList.indexOf(wmOrderedFood))).count += wmOrderedFood.count;
                } else {
                    arrayList.add(wmOrderedFood);
                }
                return true;
            }
        });
        return arrayList;
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final List<OrderedFood> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5d133cd588b2d4846e30beafa9741bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5d133cd588b2d4846e30beafa9741bf");
        }
        final com.sankuai.waimai.business.restaurant.base.shopcart.b n = n(str);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.a.a;
        if (PatchProxy.isSupport(objArr2, n, changeQuickRedirect2, false, "5e606c447dc4733c574085bdf46c3ee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, n, changeQuickRedirect2, false, "5e606c447dc4733c574085bdf46c3ee6");
        }
        final ArrayList arrayList = new ArrayList();
        final SparseArray sparseArray = new SparseArray();
        h.a.a(n, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
            public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                Object[] objArr3 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1cda39088ae7d3673386434653735602", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1cda39088ae7d3673386434653735602")).booleanValue();
                }
                OrderedFood orderedFood = shopCartItem.food;
                orderedFood.setCartId(i);
                if (sparseArray.get(i) != null) {
                    ((List) sparseArray.get(i)).add(orderedFood);
                } else {
                    ArrayList arrayList2 = new ArrayList();
                    arrayList2.add(orderedFood);
                    sparseArray.put(i, arrayList2);
                }
                if (arrayList.contains(orderedFood) && ((OrderedFood) arrayList.get(arrayList.indexOf(orderedFood))).getCartId() == i) {
                    ((OrderedFood) arrayList.get(arrayList.indexOf(orderedFood))).count += orderedFood.count;
                } else {
                    arrayList.add(orderedFood);
                }
                return true;
            }
        });
        return arrayList;
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void a(final String str, List<OrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "941822e8f060da8d5ff2f97656f918a6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "941822e8f060da8d5ff2f97656f918a6");
            return;
        }
        Object[] objArr2 = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6f371bf5817f02016fa1feb5931b00dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6f371bf5817f02016fa1feb5931b00dc");
            return;
        }
        f(str, list);
        e(str);
        c(str, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.k.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4f81badc76f8431728997490e883cd99", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4f81badc76f8431728997490e883cd99");
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr3 = {bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "090776538389daed77c30ab03dde3ee1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "090776538389daed77c30ab03dde3ee1");
                    return;
                }
                k.this.p(str);
                k.this.b(str);
            }
        });
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void b(String str, List<Map<String, Object>> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8fe08f73d1cd70485edcc30856665cd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8fe08f73d1cd70485edcc30856665cd6");
        } else if (n(str) != null && n(str).v != null && n(str).v.getMemberFloatLayerInfo() != null && n(str).v.getMemberFloatLayerInfo().productList != null) {
            List<ShopCartMemberInfo.MemberProduct> list2 = n(str).v.getMemberFloatLayerInfo().productList;
            ShopCartMemberInfo.MemberVpParam memberVpParam = new ShopCartMemberInfo.MemberVpParam();
            ArrayList arrayList = new ArrayList();
            for (ShopCartMemberInfo.MemberProduct memberProduct : list2) {
                if (memberProduct != null) {
                    ShopCartMemberInfo.ProductParam productParam = new ShopCartMemberInfo.ProductParam();
                    productParam.productId = String.valueOf(memberProduct.productId);
                    productParam.selected = 0;
                    productParam.type = memberProduct.type;
                    if (list != null) {
                        Iterator<Map<String, Object>> it = list.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            Map<String, Object> next = it.next();
                            if (next != null && (next.get("product_id") instanceof String) && next.get("product_id").equals(String.valueOf(memberProduct.productId))) {
                                if (next.get(DMKeys.KEY_SELECTED) instanceof Boolean) {
                                    productParam.selected = ((Boolean) next.get(DMKeys.KEY_SELECTED)).booleanValue() ? 1 : 0;
                                }
                            }
                        }
                    }
                    arrayList.add(productParam);
                }
            }
            memberVpParam.productParams = arrayList;
            n(str).v.setMemberVpParam(memberVpParam);
            b(str, (com.sankuai.waimai.business.restaurant.base.shopcart.e) null);
        }
    }

    public final void e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68edec2f84714a23fc82d77746d32b0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68edec2f84714a23fc82d77746d32b0e");
            return;
        }
        GlobalCartManager.getInstance().setDataChange();
        this.b.c(str);
    }

    public final void a(Activity activity, String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {activity, str, goodsSpu, goodsSku, goodsAttrArr, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fc0103e6adb1d8dc13ed6b2bcabd056", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fc0103e6adb1d8dc13ed6b2bcabd056");
        } else {
            a(activity, str, -1, new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, 0), 0, eVar);
        }
    }

    public final void a(Activity activity, String str, int i, OrderedFood orderedFood, int i2, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {activity, str, Integer.valueOf(i), orderedFood, 0, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b4ecc34cfd126386fa30d39d6936132", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b4ecc34cfd126386fa30d39d6936132");
            return;
        }
        try {
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a().c();
            GoodsSpu goodsSpu = orderedFood.spu;
            GoodsSku goodsSku = orderedFood.sku;
            if (goodsSpu == null || com.sankuai.waimai.foundation.utils.b.b(goodsSpu.getSkuList())) {
                if (eVar != null) {
                    eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.sankuai.waimai.platform.domain.manager.exceptions.a.c, ""));
                }
            } else if (goodsSku == null && (goodsSku = goodsSpu.getSkuList().get(0)) == null) {
                if (eVar != null) {
                    eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.sankuai.waimai.platform.domain.manager.exceptions.a.c, ""));
                }
            } else {
                GoodsSku goodsSku2 = goodsSku;
                int a2 = this.b.a(str, goodsSpu.getId(), goodsSku2.getSkuId());
                int a3 = b.a(goodsSku2, a2, 1);
                StringBuilder sb = new StringBuilder("hasOrderNum: ");
                sb.append(a2);
                sb.append(" ,minAddGoodNum: ");
                sb.append(a3);
                boolean z = true;
                this.b.a(activity, str, i, orderedFood, a3, 0, new a(str, eVar, true));
                a(str, (goodsSpu.getPhysicalTag() == null || n(str).n == null || !goodsSpu.getPhysicalTag().equals(n(str).n.requiredTagId)) ? false : false, a3, activity);
            }
        } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
            if (eVar != null) {
                eVar.a(e);
            }
        }
    }

    public final void a(Activity activity, String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = {activity, str, goodsSpu, goodsSku, goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc64f964d56ce213463dcf399b7ab3ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc64f964d56ce213463dcf399b7ab3ba");
        } else {
            a(activity, str, goodsSpu, goodsSku, goodsAttrArr, 1);
        }
    }

    public final void a(Activity activity, String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, int i) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = {activity, str, goodsSpu, goodsSku, goodsAttrArr, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2c4d91c986131e8d34daf8a75149939", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2c4d91c986131e8d34daf8a75149939");
        } else {
            a(activity, str, -1, new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, i), 0);
        }
    }

    private void a(Activity activity, String str, int i, OrderedFood orderedFood, int i2) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        boolean z = false;
        Object[] objArr = {activity, str, -1, orderedFood, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9fd494c518743901061d1f103cc64f50", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9fd494c518743901061d1f103cc64f50");
            return;
        }
        GoodsSpu goodsSpu = orderedFood.spu;
        GoodsSku goodsSku = orderedFood.sku;
        if (goodsSpu == null || com.sankuai.waimai.foundation.utils.b.b(goodsSpu.getSkuList())) {
            return;
        }
        if (goodsSku == null && (goodsSku = goodsSpu.getSkuList().get(0)) == null) {
            return;
        }
        int a2 = b.a(goodsSku, a().n(str).a(goodsSpu.getId(), goodsSku.getSkuId()), orderedFood.getCount());
        this.b.a(activity, str, -1, orderedFood, a2, 0);
        p(str);
        if (goodsSpu.getPhysicalTag() != null && n(str).n != null && goodsSpu.getPhysicalTag().equals(n(str).n.requiredTagId)) {
            z = true;
        }
        a(str, z, a2, activity);
        f();
    }

    public final void a(String str, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsAttr[] goodsAttrArr, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {str, goodsSpu, goodsSku, goodsAttrArr, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c7ce6c1c8b60e86d502e6da9fbcfb49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c7ce6c1c8b60e86d502e6da9fbcfb49");
        } else {
            a(str, -1, new OrderedFood(goodsSpu, goodsSku, goodsAttrArr, 0), 0, eVar);
        }
    }

    public final void a(String str, int i, OrderedFood orderedFood, int i2, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {str, Integer.valueOf(i), orderedFood, 0, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dcfde0df93e6f9df89959e05cd69205a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dcfde0df93e6f9df89959e05cd69205a");
            return;
        }
        try {
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a().c();
            if (orderedFood != null && orderedFood.spu != null && orderedFood.sku != null) {
                this.b.a(str, i, orderedFood, 0, new a(str, eVar));
            } else if (eVar != null) {
                eVar.a(new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.sankuai.waimai.platform.domain.manager.exceptions.a.c, ""));
            }
        } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
            if (eVar != null) {
                eVar.a(e);
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void a(String str, CartProduct cartProduct) {
        Object[] objArr = {str, cartProduct};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ab2efc9899b28445a8bad052f380c79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ab2efc9899b28445a8bad052f380c79");
        } else if (cartProduct == null) {
        } else {
            i iVar = this.b;
            OrderedFood orderedFood = cartProduct.toOrderedFood();
            Object[] objArr2 = {str, orderedFood};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "c28ec6b24eafe27968604504aa16743f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "c28ec6b24eafe27968604504aa16743f");
            } else {
                com.sankuai.waimai.business.restaurant.base.shopcart.b g = iVar.g(str);
                g.a(0, 1);
                g.b(orderedFood);
            }
            p(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void b(String str, CartProduct cartProduct) {
        Object[] objArr = {str, cartProduct};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fc88a74282610bf003cddde33426542", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fc88a74282610bf003cddde33426542");
        } else {
            a(str, cartProduct);
        }
    }

    public final void a(String str, OrderedFood orderedFood) {
        Object[] objArr = {str, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "929882799369e622a47e91359a95cda3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "929882799369e622a47e91359a95cda3");
            return;
        }
        this.b.a(str, orderedFood);
        p(str);
    }

    public final void b(String str, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8ade8877b2d7a250c73b86b8be4f56e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8ade8877b2d7a250c73b86b8be4f56e5");
        } else {
            a(str, eVar, false);
        }
    }

    public final void f(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c0416ba62b29a6d0962bac4836c27a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c0416ba62b29a6d0962bac4836c27a4");
        } else {
            a(str, (com.sankuai.waimai.business.restaurant.base.shopcart.e) null, true);
        }
    }

    public final void c(final String str, final com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a01d4c496b3a625921a275b8338e5eb8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a01d4c496b3a625921a275b8338e5eb8");
        } else {
            this.b.a(str, new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.k.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6d10c955829668b59a327d6069f0e82", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6d10c955829668b59a327d6069f0e82");
                    } else if (eVar != null) {
                        eVar.a();
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f9950ac0e6db95f51ee669faebb9ac1b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f9950ac0e6db95f51ee669faebb9ac1b");
                    } else if (eVar != null) {
                        eVar.a(bVar);
                    }
                }

                @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
                public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ba4225281675ac12f21595b328061e80", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ba4225281675ac12f21595b328061e80");
                    } else {
                        k.this.b.b(str, eVar);
                    }
                }
            });
        }
    }

    private void a(final String str, @Nullable final com.sankuai.waimai.business.restaurant.base.shopcart.e eVar, boolean z) {
        Object[] objArr = {str, eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61d81936a36e2c6600fe07a58716d7d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61d81936a36e2c6600fe07a58716d7d7");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.e eVar2 = new com.sankuai.waimai.business.restaurant.base.shopcart.e() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.k.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "137a0a8264461560404fc740ae93e391", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "137a0a8264461560404fc740ae93e391");
                } else if (eVar != null) {
                    eVar.a();
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fc2560a80b80e88bca87b0515b52ab35", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fc2560a80b80e88bca87b0515b52ab35");
                    return;
                }
                k.this.b(str);
                if (eVar != null) {
                    eVar.a(bVar);
                }
            }

            @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
            public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ab519fc2c89e34a2a15d7f6d961cd533", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ab519fc2c89e34a2a15d7f6d961cd533");
                } else if (eVar != null) {
                    eVar.a(aVar);
                }
            }
        };
        if (z) {
            this.b.b(str, eVar2);
        } else {
            this.b.a(str, eVar2);
        }
    }

    public final boolean g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a99c1bd7ad160c0d730df7c14452c244", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a99c1bd7ad160c0d730df7c14452c244")).booleanValue() : this.b.b(str) > 0;
    }

    public k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "72904479da7bf0f5885dca70bbde3499", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "72904479da7bf0f5885dca70bbde3499");
            return;
        }
        this.b = new i();
        this.c = new f();
        this.g = new ArrayList<>();
        this.d = new CopyOnWriteArraySet<>();
        this.e = new CopyOnWriteArraySet<>();
    }

    public final void a(String str, g gVar) {
        Object[] objArr = {str, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8be29efa90e82e82952a345e017f247b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8be29efa90e82e82952a345e017f247b");
        } else if (gVar.f() == str) {
            i iVar = this.b;
            Object[] objArr2 = {str, gVar};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "856339764099c3a66426d0cafdaff774", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "856339764099c3a66426d0cafdaff774");
            } else {
                iVar.c.a(str, gVar);
            }
        }
    }

    public final g h(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "605510b46d57b014ebab8eef70677297", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "605510b46d57b014ebab8eef70677297") : this.b.a(str);
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void c(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "109a392f564354a682b3441ec49bb889", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "109a392f564354a682b3441ec49bb889");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(list)) {
            for (com.sankuai.waimai.platform.domain.core.order.a aVar : list) {
                OrderedFood fromGlobalCart = new OrderedFood().fromGlobalCart(aVar);
                if (fromGlobalCart.getStock() == 0) {
                    this.b.a(str, fromGlobalCart);
                } else {
                    this.b.b(str, fromGlobalCart);
                }
            }
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void d(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3dc7302e0f1ef0b2505e205f3f10bd2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3dc7302e0f1ef0b2505e205f3f10bd2");
        } else if (!com.sankuai.waimai.foundation.utils.d.a(list) && g(str)) {
            for (com.sankuai.waimai.platform.domain.core.order.a aVar : list) {
                this.b.c(str, new OrderedFood().fromGlobalCart(aVar));
                p(str);
            }
            i iVar = this.b;
            Object[] objArr2 = {str};
            ChangeQuickRedirect changeQuickRedirect2 = i.a;
            if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "ae3ac59f7584d2e169d535664549499d", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "ae3ac59f7584d2e169d535664549499d");
            } else {
                com.sankuai.waimai.business.restaurant.base.shopcart.b f2 = iVar.f(str);
                f2.a(0, 0);
                f2.a(iVar.c.b(str), new i.a(str, null));
            }
            b(str);
            e(str);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86073fd68ab6293e5b220caa7451b4f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86073fd68ab6293e5b220caa7451b4f3");
            return;
        }
        i iVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "0d3f9dc14f3a190a70002fbe33d3c4e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "0d3f9dc14f3a190a70002fbe33d3c4e2");
        } else {
            iVar.b.b();
        }
        f fVar = this.c;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = f.a;
        if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect3, false, "f91c1783dbeb73ef86d5c679a4e99f2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect3, false, "f91c1783dbeb73ef86d5c679a4e99f2d");
            return;
        }
        fVar.b.b();
        fVar.c.b();
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void a(final GlobalCart globalCart) {
        Object[] objArr = {globalCart};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "065f369b64b69b881fb6c989dc8ee1b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "065f369b64b69b881fb6c989dc8ee1b7");
            return;
        }
        i iVar = this.b;
        Object[] objArr2 = {globalCart};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "431de84c7e7cf596bde742fe5a9f1a76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "431de84c7e7cf596bde742fe5a9f1a76");
            return;
        }
        final com.sankuai.waimai.business.restaurant.base.shopcart.b g = iVar.g(globalCart.poiIdStr);
        Object[] objArr3 = {globalCart};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr3, g, changeQuickRedirect3, false, "f6823d9231dc908a281f2c23e149f440", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, g, changeQuickRedirect3, false, "f6823d9231dc908a281f2c23e149f440");
        } else {
            h.a.b(g, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.b.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                    Object[] objArr4 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d917dd675dc34b3ebea81a6e329e2885", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d917dd675dc34b3ebea81a6e329e2885")).booleanValue();
                    }
                    if (shopCartItem != null && shopCartItem.food != null) {
                        OrderedFood orderedFood = shopCartItem.food;
                        for (GlobalCart.g gVar : globalCart.productList) {
                            if (gVar.c == orderedFood.getSpuId() && gVar.d == orderedFood.getSkuId()) {
                                orderedFood.setCheckStatus(gVar.a());
                            }
                        }
                    }
                    return true;
                }
            });
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final List<com.sankuai.waimai.globalcart.model.a> d() {
        Serializable serializable;
        boolean z;
        List<CartProduct> list;
        char c = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee2b518ff0b0a0ac87bce71229c890a", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee2b518ff0b0a0ac87bce71229c890a");
        }
        i iVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "4978b721f142b0aa47583a747a146075", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "4978b721f142b0aa47583a747a146075");
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, com.sankuai.waimai.business.restaurant.base.shopcart.b> entry : iVar.b.a()) {
            if (entry != null) {
                com.sankuai.waimai.platform.globalcart.poimix.c<String, com.sankuai.waimai.business.restaurant.base.shopcart.b> cVar = iVar.b;
                String key = entry.getKey();
                Object[] objArr3 = new Object[1];
                objArr3[c] = key;
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.globalcart.poimix.c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "c016c849f82aeb6168e68c4fd30d476c", RobustBitConfig.DEFAULT_VALUE)) {
                    serializable = (Serializable) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "c016c849f82aeb6168e68c4fd30d476c");
                } else if (cVar.b == null || (serializable = cVar.b.c(key)) == null) {
                    serializable = key;
                }
                String str = (String) serializable;
                final com.sankuai.waimai.business.restaurant.base.shopcart.b value = entry.getValue();
                if (!TextUtils.isEmpty(str) && value != null) {
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
                    if (PatchProxy.isSupport(objArr4, value, changeQuickRedirect4, false, "6fedcffbaf8ca673e4c3b57876f872ec", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr4, value, changeQuickRedirect4, false, "6fedcffbaf8ca673e4c3b57876f872ec")).booleanValue();
                    } else {
                        z = com.sankuai.waimai.foundation.utils.d.a(value.b) && com.sankuai.waimai.foundation.utils.d.a(value.c);
                    }
                    if (!z || value.q) {
                        com.sankuai.waimai.globalcart.model.a aVar = new com.sankuai.waimai.globalcart.model.a();
                        aVar.b = com.sankuai.waimai.platform.domain.core.poi.b.a(str);
                        if (!aa.a(str)) {
                            aVar.c = str;
                        }
                        aVar.f = value.p;
                        aVar.g = value.q;
                        Object[] objArr5 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.base.shopcart.a.a;
                        if (PatchProxy.isSupport(objArr5, value, changeQuickRedirect5, false, "19c154e17d7b296b251c3fe4b667c8ae", RobustBitConfig.DEFAULT_VALUE)) {
                            list = (List) PatchProxy.accessDispatch(objArr5, value, changeQuickRedirect5, false, "19c154e17d7b296b251c3fe4b667c8ae");
                        } else {
                            final ArrayList arrayList2 = new ArrayList();
                            final h.a.InterfaceC0819a interfaceC0819a = new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.shopcart.a.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                                public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                                    Object[] objArr6 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                                    ChangeQuickRedirect changeQuickRedirect6 = a;
                                    if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "a45682d34bf92409549ed55cf82b2e17", RobustBitConfig.DEFAULT_VALUE)) {
                                        return ((Boolean) PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "a45682d34bf92409549ed55cf82b2e17")).booleanValue();
                                    }
                                    if (shopCartItem.food != null) {
                                        CartProduct cartProduct = new CartProduct();
                                        OrderedFood orderedFood = shopCartItem.food;
                                        if (orderedFood != null) {
                                            cartProduct = cartProduct.fromOrderedFood(orderedFood, i);
                                        }
                                        if (i4 == 0) {
                                            if (!arrayList2.contains(cartProduct)) {
                                                arrayList2.add(cartProduct);
                                            } else {
                                                ((CartProduct) arrayList2.get(arrayList2.indexOf(cartProduct))).count += orderedFood.getCount();
                                            }
                                        }
                                    }
                                    return true;
                                }
                            };
                            Object[] objArr6 = {value, interfaceC0819a};
                            ChangeQuickRedirect changeQuickRedirect6 = h.a.a;
                            if (PatchProxy.isSupport(objArr6, null, changeQuickRedirect6, true, "7b9690ec70819d0487c163f638d4a11d", RobustBitConfig.DEFAULT_VALUE)) {
                                ((Integer) PatchProxy.accessDispatch(objArr6, null, changeQuickRedirect6, true, "7b9690ec70819d0487c163f638d4a11d")).intValue();
                            } else {
                                h.a.a(value, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.h.a.4
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                                        Object[] objArr7 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "c49a26c603ad91c0ab86b9268a86e056", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "c49a26c603ad91c0ab86b9268a86e056")).booleanValue() : InterfaceC0819a.this.a(shopCartItem, i, i2, i3, i4);
                                    }
                                });
                                final h.a.InterfaceC0819a interfaceC0819a2 = new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.h.a.5
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                                    public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                                        Object[] objArr7 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        return PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "b54d992d1215f0ac7f5ee9358c0b0642", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "b54d992d1215f0ac7f5ee9358c0b0642")).booleanValue() : InterfaceC0819a.this.a(shopCartItem, i, i2, i3, i4);
                                    }
                                };
                                Object[] objArr7 = {value, interfaceC0819a2};
                                ChangeQuickRedirect changeQuickRedirect7 = h.a.a;
                                if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "6c39c20aee99af173bc234958548fd72", RobustBitConfig.DEFAULT_VALUE)) {
                                    ((Integer) PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "6c39c20aee99af173bc234958548fd72")).intValue();
                                } else if (value != null) {
                                    h.a.a(value.c, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.h.a.2
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                                        public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                                            Object[] objArr8 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                                            ChangeQuickRedirect changeQuickRedirect8 = a;
                                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "7e18852738f2f8fba76ba70814b0ef82", RobustBitConfig.DEFAULT_VALUE)) {
                                                return ((Boolean) PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "7e18852738f2f8fba76ba70814b0ef82")).booleanValue();
                                            }
                                            if (InterfaceC0819a.this == null || shopCartItem.food == null) {
                                                return true;
                                            }
                                            return InterfaceC0819a.this.a(shopCartItem, i, i2, i3, shopCartItem.food.getBuyType());
                                        }
                                    });
                                }
                            }
                            list = arrayList2;
                        }
                        aVar.e = list;
                        if (com.sankuai.waimai.foundation.utils.d.a(aVar.e)) {
                            aVar.d = true;
                        }
                        arrayList.add(aVar);
                    }
                }
                c = 0;
            }
        }
        return arrayList;
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void e(String str, List<GlobalCart.g> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7f9085470830b3ed2fac96e2580f7e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7f9085470830b3ed2fac96e2580f7e0");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (GlobalCart.g gVar : list) {
            if (gVar != null) {
                OrderedFood a2 = GlobalCart.g.a(gVar);
                if (TextUtils.isEmpty(a2.getName()) || a2.getCount() >= 0) {
                    arrayList.add(a2);
                }
            }
        }
        a(str, (List<OrderedFood>) arrayList, false);
    }

    public final void f(String str, List<OrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fac3e2dcce0f79ae02c2d183ec0e0221", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fac3e2dcce0f79ae02c2d183ec0e0221");
        } else {
            a(str, list, true);
        }
    }

    private void a(String str, List<OrderedFood> list, boolean z) {
        Object[] objArr = {str, list, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a2eb47dc9331cebfa963db470db67dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a2eb47dc9331cebfa963db470db67dd");
            return;
        }
        a(str);
        ArrayList arrayList = new ArrayList();
        for (OrderedFood orderedFood : list) {
            if (z) {
                orderedFood.setCheckStatus(1);
            }
            arrayList.add(orderedFood);
        }
        this.b.a(str, arrayList);
        new StringBuilder("setCartData").append(list.size());
    }

    public final void a(String str, int i) {
        Object[] objArr = {str, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f3372e87c0b24748e5574cd81160c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f3372e87c0b24748e5574cd81160c7");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = this.b.g(str);
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, g, changeQuickRedirect2, false, "f6f4445c3e5a32c254db20d24592affc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, g, changeQuickRedirect2, false, "f6f4445c3e5a32c254db20d24592affc");
        } else {
            h hVar = g.h;
            Object[] objArr3 = {Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "dbe451e6feb1c844ff22fffb6d7d8eb0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "dbe451e6feb1c844ff22fffb6d7d8eb0");
            } else {
                com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = hVar.b;
                if (bVar != null) {
                    h.a.a(bVar, i);
                }
            }
        }
        b(str);
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final int i(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e009b795de769b86282a0dfffbbeafc1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e009b795de769b86282a0dfffbbeafc1")).intValue() : this.b.b(str);
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final int j(String str) {
        int i = 0;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f61101826fa800405cb5b8c0387dab4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f61101826fa800405cb5b8c0387dab4")).intValue();
        }
        i iVar = this.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "8e5f4528a0a825849d77fbf5dbad8dc2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "8e5f4528a0a825849d77fbf5dbad8dc2")).intValue();
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b e = iVar.e(str);
        if (e == null) {
            return 0;
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr3, e, changeQuickRedirect3, false, "b5cc54d1defef47645937907060bb3ab", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr3, e, changeQuickRedirect3, false, "b5cc54d1defef47645937907060bb3ab")).intValue();
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.shopcart.a.a;
        Iterator bVar = PatchProxy.isSupport(objArr4, e, changeQuickRedirect4, false, "f1cbaa9e905fc46ee044d3f453902f38", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr4, e, changeQuickRedirect4, false, "f1cbaa9e905fc46ee044d3f453902f38") : new a.b();
        while (bVar.hasNext()) {
            com.sankuai.waimai.business.restaurant.base.shopcart.d dVar = (com.sankuai.waimai.business.restaurant.base.shopcart.d) bVar.next();
            if (dVar != null) {
                i += dVar.a();
            }
        }
        return i;
    }

    public final int a(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9bad9371c72841fd3384c28ab6b23e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9bad9371c72841fd3384c28ab6b23e0")).intValue();
        }
        i iVar = this.b;
        Object[] objArr2 = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        return PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "0236af2229735dd52b08a6872097611d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "0236af2229735dd52b08a6872097611d")).intValue() : iVar.g(str).a(j);
    }

    public final int a(String str, long j, long j2, GoodsAttr[] goodsAttrArr) {
        Object[] objArr = {str, new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1c38ee684de2c97eefd9919affa512d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1c38ee684de2c97eefd9919affa512d")).intValue();
        }
        i iVar = this.b;
        Object[] objArr2 = {str, new Long(j), new Long(j2), goodsAttrArr};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        return PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "cfc320d7907c0fa862838c908defdab4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "cfc320d7907c0fa862838c908defdab4")).intValue() : iVar.g(str).a(j, j2, goodsAttrArr);
    }

    public final double k(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "832735db739578aec1287095345149ba", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "832735db739578aec1287095345149ba")).doubleValue();
        }
        i iVar = this.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        return PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "771fd59f337b210aad066195b55127e7", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "771fd59f337b210aad066195b55127e7")).doubleValue() : iVar.g(str).e.mTotalAndBoxPrice;
    }

    public final com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.h l(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba3e1ffad5d686ff2fd42a0f7dd90325", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.vo.h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba3e1ffad5d686ff2fd42a0f7dd90325") : this.b.g(str).z;
    }

    public final double m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a7e1f2e464b6d429ecd26b7415c4c5c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a7e1f2e464b6d429ecd26b7415c4c5c")).doubleValue();
        }
        i iVar = this.b;
        Object[] objArr2 = {str};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        return PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "fbea9e49c5332b288439d5188cc345a8", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "fbea9e49c5332b288439d5188cc345a8")).doubleValue() : iVar.g(str).f();
    }

    public final com.sankuai.waimai.business.restaurant.base.shopcart.b n(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a18e7afc3c43f10e120037ed0bbbb3ae", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.business.restaurant.base.shopcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a18e7afc3c43f10e120037ed0bbbb3ae") : this.b.g(str);
    }

    public final List<OrderedFood> o(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74a8619b5908ef4585f5dcf4965f1ff5", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74a8619b5908ef4585f5dcf4965f1ff5") : this.b.d(str);
    }

    public final List<OrderedFood> b(String str, long j) {
        Object[] objArr = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a6dce13388f59a6c7f485aea561cff", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a6dce13388f59a6c7f485aea561cff");
        }
        i iVar = this.b;
        Object[] objArr2 = {str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        return PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "c6d8a8acda8dfeca446aa67fe09d8871", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "c6d8a8acda8dfeca446aa67fe09d8871") : iVar.g(str).b(j);
    }

    public final void p(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27bac1991356a9ba6681c197aeced6cb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27bac1991356a9ba6681c197aeced6cb");
        } else {
            a(str, this.b.g(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
        Object[] objArr = {str, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d989c8085f20315eb882b3b17616c21c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d989c8085f20315eb882b3b17616c21c");
        } else if (bVar != null) {
            this.c.a(str, bVar);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.globalcart.b
    public final void e() {
        com.sankuai.waimai.business.restaurant.base.shopcart.b value;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe186bd8b2f9f2388e076c21aa9b409", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe186bd8b2f9f2388e076c21aa9b409");
            return;
        }
        i iVar = this.b;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = i.a;
        if (PatchProxy.isSupport(objArr2, iVar, changeQuickRedirect2, false, "bd41b110c68fab6f77e1d081f066596b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, iVar, changeQuickRedirect2, false, "bd41b110c68fab6f77e1d081f066596b");
        } else if (iVar.b != null) {
            com.sankuai.waimai.platform.globalcart.poimix.c<String, com.sankuai.waimai.business.restaurant.base.shopcart.b> cVar = iVar.b;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.globalcart.poimix.c.a;
            if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "15a0a59982bafba9ef4999efacb564e3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "15a0a59982bafba9ef4999efacb564e3")).booleanValue() : cVar.c.isEmpty()) {
                return;
            }
            for (Map.Entry<String, com.sankuai.waimai.business.restaurant.base.shopcart.b> entry : iVar.b.a()) {
                if (entry != null && (value = entry.getValue()) != null) {
                    value.q = false;
                }
            }
        }
    }

    public final String q(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f27ffcf0498febc8be0e6c6ee9ee396", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f27ffcf0498febc8be0e6c6ee9ee396");
        }
        try {
            g h = h(str);
            return h != null ? h.c() : "";
        } catch (Exception unused) {
            return "";
        }
    }
}
