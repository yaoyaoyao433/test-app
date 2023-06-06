package com.sankuai.waimai.business.restaurant.base.manager.order;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.h;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: ProGuard */
@SuppressLint({"UseSparseArrays"})
/* loaded from: classes4.dex */
public final class i implements Serializable {
    public static ChangeQuickRedirect a;
    final com.sankuai.waimai.platform.globalcart.poimix.c<String, com.sankuai.waimai.business.restaurant.base.shopcart.b> b;
    final com.sankuai.waimai.platform.globalcart.poimix.c<String, g> c;

    public i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76b61e50f7c516d0e4847e1e030d47f1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76b61e50f7c516d0e4847e1e030d47f1");
            return;
        }
        this.b = new com.sankuai.waimai.platform.globalcart.poimix.c<>(GlobalCartManager.getInstance().getPoiIdTab());
        this.c = new com.sankuai.waimai.platform.globalcart.poimix.c<>(GlobalCartManager.getInstance().getPoiIdTab());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class a extends com.sankuai.waimai.business.restaurant.base.shopcart.e {
        public static ChangeQuickRedirect a;
        private final String c;
        @Nullable
        private final com.sankuai.waimai.business.restaurant.base.shopcart.e d;

        public a(String str, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
            Object[] objArr = {i.this, str, eVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9edbd6b723532148f0be103755b871", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9edbd6b723532148f0be103755b871");
                return;
            }
            this.c = str;
            this.d = eVar;
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71edb0c8b9e84d90fbdc78ed8606cb21", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71edb0c8b9e84d90fbdc78ed8606cb21");
            } else if (this.d != null) {
                this.d.a();
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void a(com.sankuai.waimai.business.restaurant.base.shopcart.b bVar) {
            Object[] objArr = {bVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d9eb3e048d64f7cc655c65721d796a3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d9eb3e048d64f7cc655c65721d796a3");
                return;
            }
            i.this.b.a(this.c, bVar);
            if (this.d != null) {
                this.d.a(bVar);
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void a(com.sankuai.waimai.platform.domain.manager.exceptions.a aVar) {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6dda5b38686293a32224700e6c37d2a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6dda5b38686293a32224700e6c37d2a");
            } else if (this.d != null) {
                this.d.a(aVar);
            }
        }

        @Override // com.sankuai.waimai.business.restaurant.base.shopcart.e
        public final void b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a124f0d040ca31bbe975197cb0fe3f8e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a124f0d040ca31bbe975197cb0fe3f8e");
            } else if (this.d != null) {
                this.d.b();
            }
        }
    }

    public final g a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46685e7970982b55fc24016117f3aec3", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46685e7970982b55fc24016117f3aec3") : this.c.b(str);
    }

    public final int a(String str, long j, long j2) {
        Object[] objArr = {str, new Long(j), new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58a3aef97ef8384af6fdf87611e577f4", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58a3aef97ef8384af6fdf87611e577f4")).intValue() : g(str).a(j, j2);
    }

    public final int b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ff6b532a344141cf7ed6312d488cb9b9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ff6b532a344141cf7ed6312d488cb9b9")).intValue();
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b e = e(str);
        if (e == null) {
            return 0;
        }
        return e.e();
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70de873278da95c374e79d9b136b033e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70de873278da95c374e79d9b136b033e");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = g(str);
        g.q = true;
        g.p = System.currentTimeMillis();
    }

    public final void a(Activity activity, String str, int i, OrderedFood orderedFood, int i2, int i3, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {activity, str, Integer.valueOf(i), orderedFood, Integer.valueOf(i2), Integer.valueOf(i3), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbb2704ff9c9fd771633c98674e4b06b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbb2704ff9c9fd771633c98674e4b06b");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b f = f(str);
        f.a(1, 0);
        g a2 = a(str);
        a aVar = new a(str, eVar);
        Object[] objArr2 = {activity, Integer.valueOf(i), orderedFood, Integer.valueOf(i2), Integer.valueOf(i3), a2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, f, changeQuickRedirect2, false, "b7ed48b874c074070db571abd34943e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, f, changeQuickRedirect2, false, "b7ed48b874c074070db571abd34943e5");
            return;
        }
        ArrayList arrayList = new ArrayList();
        try {
            f.a(activity, i, i2, orderedFood, i3, arrayList, a2);
            c cVar = new c();
            cVar.a = f;
            cVar.b = arrayList;
            f.a(a2, cVar, aVar);
        } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
            aVar.a(e);
        }
    }

    public final void a(Activity activity, String str, int i, OrderedFood orderedFood, int i2, int i3) throws com.sankuai.waimai.platform.domain.manager.exceptions.a {
        Object[] objArr = {activity, str, Integer.valueOf(i), orderedFood, Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3dd4a49c87d514c9941d010e262ca487", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3dd4a49c87d514c9941d010e262ca487");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = g(str);
        g.a(0, 0);
        g.a(activity, i, i2, orderedFood, i3, null, a(str));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(String str, int i, OrderedFood orderedFood, int i2, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        int i3;
        int[] iArr;
        boolean z;
        Object[] objArr = {str, Integer.valueOf(i), orderedFood, Integer.valueOf(i2), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d842b546e2b0ed8a551ffa72ce831461", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d842b546e2b0ed8a551ffa72ce831461");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b f = f(str);
        f.a(1, 1);
        g a2 = a(str);
        a aVar = new a(str, eVar);
        Object[] objArr2 = {Integer.valueOf(i), orderedFood, Integer.valueOf(i2), a2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, f, changeQuickRedirect2, false, "5d352a263956456b64cb584f0d190622", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, f, changeQuickRedirect2, false, "5d352a263956456b64cb584f0d190622");
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Object[] objArr3 = {Integer.valueOf(i), orderedFood, Integer.valueOf(i2), arrayList, a2};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
            if (PatchProxy.isSupport(objArr3, f, changeQuickRedirect3, false, "0772abc3fb38211b5de2dac3e134c7a7", RobustBitConfig.DEFAULT_VALUE)) {
                OrderedFood orderedFood2 = (OrderedFood) PatchProxy.accessDispatch(objArr3, f, changeQuickRedirect3, false, "0772abc3fb38211b5de2dac3e134c7a7");
            } else {
                Object[] objArr4 = {orderedFood, a2};
                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
                if (PatchProxy.isSupport(objArr4, f, changeQuickRedirect4, false, "d4edf946300a344e0ce09e8f0ca060aa", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, f, changeQuickRedirect4, false, "d4edf946300a344e0ce09e8f0ca060aa");
                } else if (!b.a(orderedFood.spu)) {
                    throw new com.sankuai.waimai.platform.domain.manager.exceptions.a(com.meituan.android.singleton.b.a.getString(R.string.wm_restaurant_good_sold_out));
                } else {
                    Object[] objArr5 = {a2};
                    ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
                    if (PatchProxy.isSupport(objArr5, f, changeQuickRedirect5, false, "76fccd288b3e694358f6422bce98ebf8", RobustBitConfig.DEFAULT_VALUE)) {
                        i3 = ((Integer) PatchProxy.accessDispatch(objArr5, f, changeQuickRedirect5, false, "76fccd288b3e694358f6422bce98ebf8")).intValue();
                    } else {
                        if (a2 != null && a2.e()) {
                            i3 = a2.g.getNumDiscountRestrict();
                        }
                        i3 = Integer.MAX_VALUE;
                    }
                    if (f.e.hasTipsOrderNumLimit && f.g() <= i3) {
                        f.e.hasTipsOrderNumLimit = false;
                    }
                }
                orderedFood.setCheckStatus(1);
                Object[] objArr6 = {orderedFood};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
                int intValue = PatchProxy.isSupport(objArr6, f, changeQuickRedirect6, false, "a1e054386da1dae45103f09094c5d9b1", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr6, f, changeQuickRedirect6, false, "a1e054386da1dae45103f09094c5d9b1")).intValue() : f.a(orderedFood.getSpuId(), orderedFood.getSkuId(), orderedFood.getAttrIds(), orderedFood.getComboItems());
                byte b = f.a(orderedFood.getSpuId(), orderedFood.getSkuId()) <= orderedFood.getMinCount() ? (byte) 1 : (byte) 0;
                int[] iArr2 = new int[1];
                h hVar = f.h;
                Object[] objArr7 = {Integer.valueOf(i), orderedFood, Integer.valueOf(i2), Byte.valueOf(b), arrayList, iArr2};
                ChangeQuickRedirect changeQuickRedirect7 = h.a;
                if (PatchProxy.isSupport(objArr7, hVar, changeQuickRedirect7, false, "6cb610f2344b028d55c777199ef5b511", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, hVar, changeQuickRedirect7, false, "6cb610f2344b028d55c777199ef5b511");
                    iArr = iArr2;
                    z = b;
                } else {
                    iArr = iArr2;
                    z = b;
                    h.a.a(hVar.b, orderedFood, i, i2, b, arrayList, iArr);
                }
                if (z != 0 && orderedFood.getMinCount() != 0) {
                    f.h.a(orderedFood.spu, orderedFood.getSkuId());
                }
                orderedFood.isRemoveAll = z;
                if (z != 0) {
                    orderedFood.setCount(intValue);
                } else {
                    orderedFood.setCount(iArr[0]);
                }
            }
            c cVar = new c();
            cVar.a = f;
            cVar.b = arrayList;
            f.a(a2, cVar, aVar);
        } catch (com.sankuai.waimai.platform.domain.manager.exceptions.a e) {
            aVar.a(e);
        }
    }

    public final void a(String str, OrderedFood orderedFood) {
        Object[] objArr = {str, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eccdb2e346bedfc5c8f021ddee5a383", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eccdb2e346bedfc5c8f021ddee5a383");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = g(str);
        g.a(0, 1);
        g.a(orderedFood);
    }

    public final void a(String str, GoodsSpu goodsSpu, long j) {
        Object[] objArr = {str, goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "12acad1926fe6ba6a3af6868afcd6e5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "12acad1926fe6ba6a3af6868afcd6e5d");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = g(str);
        g.a(0, 1);
        Object[] objArr2 = {goodsSpu, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, g, changeQuickRedirect2, false, "53182709690eb0de3731267f1a5d0555", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, g, changeQuickRedirect2, false, "53182709690eb0de3731267f1a5d0555");
        } else {
            g.h.a(goodsSpu, j);
        }
    }

    public final void a(String str, @Nullable com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533f93e6fd088efe85e6ca2fc21a7da1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533f93e6fd088efe85e6ca2fc21a7da1");
        } else {
            f(str).a(a(str), new a(str, eVar));
        }
    }

    public final void b(String str, com.sankuai.waimai.business.restaurant.base.shopcart.e eVar) {
        Object[] objArr = {str, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29e5b9aae51b925e3fdd4644d8a3ee4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29e5b9aae51b925e3fdd4644d8a3ee4");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b f = f(str);
        g a2 = a(str);
        a aVar = new a(str, eVar);
        Object[] objArr2 = {a2, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, f, changeQuickRedirect2, false, "334cff9e5c3c003d15400ac6ea069321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, f, changeQuickRedirect2, false, "334cff9e5c3c003d15400ac6ea069321");
        } else {
            com.sankuai.waimai.business.restaurant.base.shopcart.calculator.b.a().a(a2, f, null, aVar);
        }
    }

    public final void b(String str, OrderedFood orderedFood) {
        int stock;
        int a2;
        Object[] objArr = {str, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f02906cf43270792ee27d9fba5b4e953", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f02906cf43270792ee27d9fba5b4e953");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = g(str);
        Object[] objArr2 = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, g, changeQuickRedirect2, false, "f6ef315ac5b02e44612d06eb528c2863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, g, changeQuickRedirect2, false, "f6ef315ac5b02e44612d06eb528c2863");
            return;
        }
        h hVar = g.h;
        Object[] objArr3 = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "7762c3001119aaa18726e3046fa45b44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "7762c3001119aaa18726e3046fa45b44");
        } else if (orderedFood == null || (a2 = hVar.b.a(orderedFood.getSpuId(), orderedFood.getSkuId())) <= (stock = orderedFood.getStock())) {
        } else {
            int i = a2 - stock;
            List<com.sankuai.waimai.business.restaurant.base.shopcart.d> list = hVar.b.b;
            Object[] objArr4 = {list, orderedFood, Integer.valueOf(stock), Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect4 = h.a.a;
            if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9fbdfeca0fe7afe982cf477b23dbdc74", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9fbdfeca0fe7afe982cf477b23dbdc74");
            } else if (orderedFood == null || orderedFood.sku == null || orderedFood.spu == null || list == null) {
            } else {
                Iterator<com.sankuai.waimai.business.restaurant.base.shopcart.d> it = list.iterator();
                while (it.hasNext()) {
                    com.sankuai.waimai.business.restaurant.base.shopcart.d next = it.next();
                    if (next == null || next.c == null) {
                        it.remove();
                    } else {
                        Iterator<ShopCartItem> it2 = next.c.iterator();
                        while (it2.hasNext()) {
                            ShopCartItem next2 = it2.next();
                            if (next2 == null || next2.food == null) {
                                it2.remove();
                            } else if (next2.food.getSpuId() == orderedFood.getSpuId() && next2.food.getSkuId() == orderedFood.getSkuId()) {
                                next2.food.setStock(stock);
                                if (i > 0) {
                                    if (next2.food.count > i) {
                                        next2.food.count -= i;
                                        i = 0;
                                    } else {
                                        i -= next2.food.count;
                                        it2.remove();
                                    }
                                }
                            }
                        }
                        if (next.c.isEmpty()) {
                            it.remove();
                        }
                    }
                }
            }
        }
    }

    public final void c(String str, final OrderedFood orderedFood) {
        Object[] objArr = {str, orderedFood};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cca25c7077fb8ebfb6036cdd4d98303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cca25c7077fb8ebfb6036cdd4d98303");
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = g(str);
        Object[] objArr2 = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.restaurant.base.shopcart.b.d;
        if (PatchProxy.isSupport(objArr2, g, changeQuickRedirect2, false, "31aa66e15cbdc7748397093a8986a299", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, g, changeQuickRedirect2, false, "31aa66e15cbdc7748397093a8986a299");
            return;
        }
        final h hVar = g.h;
        Object[] objArr3 = {orderedFood};
        ChangeQuickRedirect changeQuickRedirect3 = h.a;
        if (PatchProxy.isSupport(objArr3, hVar, changeQuickRedirect3, false, "fdd734ef8162e6ee374531b1abede232", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, hVar, changeQuickRedirect3, false, "fdd734ef8162e6ee374531b1abede232");
            return;
        }
        h.a.InterfaceC0819a interfaceC0819a = new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.h.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
            public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                Object[] objArr4 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "4894f31af1362723e744e1be437ecf0f", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "4894f31af1362723e744e1be437ecf0f")).booleanValue();
                }
                if (shopCartItem != null && shopCartItem.food != null && shopCartItem.food.sku != null && shopCartItem.food.getSpuId() == orderedFood.getSpuId() && shopCartItem.food.getSkuId() == orderedFood.getSkuId() && shopCartItem.food.sku.getActivityStock() > orderedFood.getStock()) {
                    shopCartItem.food.sku.setActivityStock(orderedFood.getStock());
                }
                return true;
            }
        };
        Object[] objArr4 = {interfaceC0819a};
        ChangeQuickRedirect changeQuickRedirect4 = h.a;
        if (PatchProxy.isSupport(objArr4, hVar, changeQuickRedirect4, false, "16cf0f540634fa7ea2faa20aa738e9bc", RobustBitConfig.DEFAULT_VALUE)) {
            ((Integer) PatchProxy.accessDispatch(objArr4, hVar, changeQuickRedirect4, false, "16cf0f540634fa7ea2faa20aa738e9bc")).intValue();
            return;
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b bVar = hVar.b;
        if (bVar != null) {
            h.a.b(bVar, interfaceC0819a);
        }
    }

    public final ArrayList<OrderedFood> d(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6adf447521842157b510c2c30d71418d", RobustBitConfig.DEFAULT_VALUE) ? (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6adf447521842157b510c2c30d71418d") : g(str).h();
    }

    public final List<OrderedFood> a(String str, List<OrderedFood> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6236f8d856ca956a0bd85b5611ccd639", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6236f8d856ca956a0bd85b5611ccd639");
        }
        return com.sankuai.waimai.foundation.utils.d.a(list) ? new ArrayList() : g(str).b(list);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public com.sankuai.waimai.business.restaurant.base.shopcart.b e(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ed552ae32b7755c9272efc562bb9604", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.base.shopcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ed552ae32b7755c9272efc562bb9604");
        }
        if (this.b != null) {
            return this.b.b(str);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.sankuai.waimai.business.restaurant.base.shopcart.b f(String str) {
        com.sankuai.waimai.business.restaurant.base.shopcart.b d;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0e0a94554639dd654d39456c0f45807e", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.base.shopcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0e0a94554639dd654d39456c0f45807e");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b g = g(str);
        return (com.sankuai.waimai.business.restaurant.base.shopcart.calculator.h.a().f && (d = g.d()) != null) ? d : g;
    }

    @NonNull
    public final com.sankuai.waimai.business.restaurant.base.shopcart.b g(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b25baa26aa190c14625340da45e67489", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.restaurant.base.shopcart.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b25baa26aa190c14625340da45e67489");
        }
        com.sankuai.waimai.business.restaurant.base.shopcart.b b = this.b.b(str);
        if (b == null) {
            synchronized (this.b) {
                b = this.b.b(str);
                if (b == null) {
                    b = new com.sankuai.waimai.business.restaurant.base.shopcart.b();
                    this.b.a(str, b);
                }
            }
        }
        return b;
    }
}
