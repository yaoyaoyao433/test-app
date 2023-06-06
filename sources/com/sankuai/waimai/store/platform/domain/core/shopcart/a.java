package com.sankuai.waimai.store.platform.domain.core.shopcart;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.waimai.platform.domain.core.order.WmOrderedFood;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class a implements Serializable {
    public static ChangeQuickRedirect a;
    public List<c> b;
    public List<c> c;
    public List<c> d;
    public com.sankuai.waimai.store.shopping.cart.cache.a e;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c053c2118c9d6eb15362a8ff1be7b38", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c053c2118c9d6eb15362a8ff1be7b38");
        } else {
            this.e = new com.sankuai.waimai.store.shopping.cart.cache.a();
        }
    }

    public static /* synthetic */ WmOrderedFood a(a aVar, ShopCartItem shopCartItem, int i) {
        Object[] objArr = {shopCartItem, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "e34068b6021f65e82838ad819c39c531", RobustBitConfig.DEFAULT_VALUE)) {
            return (WmOrderedFood) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "e34068b6021f65e82838ad819c39c531");
        }
        OrderedFood orderedFood = shopCartItem.food;
        if (orderedFood == null) {
            return new WmOrderedFood();
        }
        Map map = (Map) p.a(aVar.e.a("product_mark_info"), Map.class);
        return new WmOrderedFood(orderedFood.getSpuId(), orderedFood.getSkuId(), orderedFood.getAttrIds(), orderedFood.getCount(), i, 0, orderedFood.getActivityTag(), map != null ? (String) p.a(map.get(Long.toString(orderedFood.getSkuId())), String.class) : "");
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.store.platform.domain.core.shopcart.a$a  reason: collision with other inner class name */
    /* loaded from: classes5.dex */
    public class C1263a implements Iterator<c> {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;

        public C1263a() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92ee94a1d657e38da1b15785e6c6e29e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92ee94a1d657e38da1b15785e6c6e29e");
                return;
            }
            this.c = 0;
            this.d = a.this.b.size() + a.this.c.size();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ c next() {
            c cVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9835b15148d698891e31d08771f4f17a", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9835b15148d698891e31d08771f4f17a");
            }
            if (this.c < a.this.b.size()) {
                cVar = a.this.b.get(this.c);
            } else {
                cVar = a.this.c.get(this.c - a.this.b.size());
            }
            this.c++;
            return cVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.d;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b implements Iterator<c> {
        public static ChangeQuickRedirect a;
        private int c;
        private int d;

        public b() {
            Object[] objArr = {a.this};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d8408436cd08c829869b7c0bde68d40b", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d8408436cd08c829869b7c0bde68d40b");
                return;
            }
            this.c = 0;
            this.d = a.this.b.size() + a.this.c.size() + a.this.d.size();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ c next() {
            c cVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "107b0182675350bc74c38efc8ef38776", RobustBitConfig.DEFAULT_VALUE)) {
                return (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "107b0182675350bc74c38efc8ef38776");
            }
            if (this.c < a.this.b.size()) {
                cVar = a.this.b.get(this.c);
            } else if (this.c < a.this.b.size() + a.this.c.size()) {
                cVar = a.this.c.get(this.c - a.this.b.size());
            } else {
                cVar = a.this.d.get((this.c - a.this.b.size()) - a.this.c.size());
            }
            this.c++;
            return cVar;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.c < this.d;
        }
    }

    public final Iterator<c> a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93d593f03b7e0236740d8a88f410e1af", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93d593f03b7e0236740d8a88f410e1af") : new C1263a();
    }

    public final Iterator<c> b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b170c21be638be5a602d127794536c4", RobustBitConfig.DEFAULT_VALUE) ? (Iterator) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b170c21be638be5a602d127794536c4") : new b();
    }

    public String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7da6a0a0be307a579673d21d37209028", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7da6a0a0be307a579673d21d37209028");
        }
        return "hashCode:" + hashCode() + " shop_list: " + this.b + " plus_list: " + this.c + " error_list:" + this.d;
    }
}
