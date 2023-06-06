package com.sankuai.waimai.business.restaurant.poicontainer.pga.logic;

import android.app.Activity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.business.restaurant.base.manager.order.k;
import com.sankuai.waimai.business.restaurant.base.skuchoose.b;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.meituan.android.cube.pga.block.b<com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect f;
    public String g;
    private g h;

    public d(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce0c6922acee703657dd011ec1a46ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce0c6922acee703657dd011ec1a46ea");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "315bdb5fb6c10b0421dd735e8bdd978d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "315bdb5fb6c10b0421dd735e8bdd978d");
            return;
        }
        super.s();
        this.h = F().u.a().b;
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        List<GoodsSpu> list;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4094ff578225ca163bf0902afa87aacf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4094ff578225ca163bf0902afa87aacf");
            return;
        }
        super.I();
        if (this.h == null || !this.h.H) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = f;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8acd042d1a3ae8a64c98993fd1867c00", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8acd042d1a3ae8a64c98993fd1867c00");
            } else {
                String f2 = this.h.f();
                if (!this.h.a() && this.h.u() && com.sankuai.waimai.business.restaurant.poicontainer.utils.g.a(l().getIntent(), "goods_coupon_type", "goods_coupon_type", 0) == 1 && (list = F().K.n.a().b) != null && !list.isEmpty()) {
                    GoodsSpu goodsSpu = null;
                    for (int i = 0; i < list.size(); i++) {
                        if (F().I.h.a().b.longValue() == list.get(i).id) {
                            goodsSpu = list.get(i);
                        }
                    }
                    if (goodsSpu != null) {
                        if (goodsSpu.isManySku()) {
                            com.sankuai.waimai.business.restaurant.base.skuchoose.b.a((Activity) l(), this.h.s(), goodsSpu, new b.InterfaceC0826b() { // from class: com.sankuai.waimai.business.restaurant.poicontainer.pga.logic.d.1
                                public static ChangeQuickRedirect a;

                                @Override // com.sankuai.waimai.business.restaurant.base.skuchoose.b.InterfaceC0826b
                                public final View a() {
                                    Object[] objArr3 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect3 = a;
                                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a71f2a452231adb0046c74ee4e01d546", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a71f2a452231adb0046c74ee4e01d546") : d.this.F().F.u.a().b;
                                }
                            }, this.h.g, com.sankuai.waimai.business.restaurant.composeorder.a.b, -1, this.h.B(), true);
                        } else if (goodsSpu.getSkuList() != null && !goodsSpu.getSkuList().isEmpty()) {
                            F().I.d.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                            ArrayList arrayList = new ArrayList();
                            OrderedFood orderedFood = new OrderedFood();
                            orderedFood.spu = goodsSpu;
                            GoodsSku goodsSku = goodsSpu.getSkuList().get(0);
                            orderedFood.sku = goodsSku;
                            if (goodsSku != null && goodsSku.getMinOrderCount() != 0) {
                                orderedFood.count = goodsSku.getMinOrderCount();
                            } else {
                                orderedFood.count = 1;
                            }
                            orderedFood.setName(goodsSpu.name);
                            arrayList.add(orderedFood);
                            this.h.a(false);
                            k.a().f(f2, arrayList);
                            k.a().e(f2);
                        }
                    }
                }
            }
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "382b21d6fb3d1d7a3c214c4605fce802", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "382b21d6fb3d1d7a3c214c4605fce802");
                return;
            }
            String f3 = this.h.f();
            int templateType = this.h.g.getTemplateType();
            if (templateType == 0 || templateType == 10) {
                String str = F().D.a().b.multiSpuAdd;
                if (TextUtils.isEmpty(str)) {
                    return;
                }
                if (this.h.o() == 3 || this.h.a()) {
                    F().I.d.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                }
                try {
                    List<OrderedFood> fromOrderAgain = OrderedFood.fromOrderAgain(new JSONArray(str));
                    if (this.h.m) {
                        b(fromOrderAgain);
                        fromOrderAgain = a(fromOrderAgain);
                    }
                    k.a().f(f3, fromOrderAgain);
                    k.a().e(f3);
                } catch (JSONException unused) {
                }
            }
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30c6655f419d699a52ebaa9c7442ffd8", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30c6655f419d699a52ebaa9c7442ffd8") : new com.meituan.android.cube.pga.viewmodel.a();
    }

    private List<OrderedFood> a(List<OrderedFood> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "65c9f27943eefa5a408076e4146df8e8", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "65c9f27943eefa5a408076e4146df8e8");
        }
        ArrayList<OrderedFood> h = k.a().n(this.h.f()).h();
        if (com.sankuai.waimai.foundation.utils.b.b(list)) {
            return h;
        }
        if (com.sankuai.waimai.foundation.utils.b.b(h)) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        for (int i = 0; i < h.size(); i++) {
            OrderedFood orderedFood = h.get(i);
            int a = a(orderedFood, list);
            if (a < 0) {
                arrayList.add(orderedFood);
            } else if (list.get(a).count < orderedFood.count) {
                arrayList.set(a, orderedFood);
            }
        }
        return arrayList;
    }

    private int a(OrderedFood orderedFood, List<OrderedFood> list) {
        Object[] objArr = {orderedFood, list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d27edf52c9b3c2b20895524aab0bd2d8", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d27edf52c9b3c2b20895524aab0bd2d8")).intValue();
        }
        if (orderedFood == null || com.sankuai.waimai.foundation.utils.b.b(list)) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            OrderedFood orderedFood2 = list.get(i);
            if (orderedFood2 != null && orderedFood2.getSkuId() == orderedFood.getSkuId() && orderedFood2.isSameAttrs(orderedFood.getAttrIds())) {
                return i;
            }
        }
        return -1;
    }

    private void b(List<OrderedFood> list) {
        Map hashMap;
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef7db1f678b5eb6507c68300ea03cd63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef7db1f678b5eb6507c68300ea03cd63");
            return;
        }
        List<GoodsSpu> list2 = F().K.n.a().b;
        Object[] objArr2 = {list2};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9cc9c447ca7ffbd9f553129573f43cd2", RobustBitConfig.DEFAULT_VALUE)) {
            hashMap = (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9cc9c447ca7ffbd9f553129573f43cd2");
        } else if (list2 == null) {
            hashMap = null;
        } else {
            hashMap = new HashMap();
            for (GoodsSpu goodsSpu : list2) {
                if (goodsSpu != null) {
                    long id = goodsSpu.getId();
                    if (hashMap.get(Long.valueOf(id)) == null) {
                        hashMap.put(Long.valueOf(id), goodsSpu);
                    }
                }
            }
        }
        if (hashMap == null || list == null) {
            return;
        }
        for (OrderedFood orderedFood : list) {
            com.sankuai.waimai.business.restaurant.base.manager.order.b.a(orderedFood, (GoodsSpu) hashMap.get(Long.valueOf(orderedFood.getSpuId())));
        }
    }
}
