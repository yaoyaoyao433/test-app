package com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.g;
import com.sankuai.waimai.platform.domain.core.goods.FoodMultiSpuResponse;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttrList;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.restaurant.shopcart.utils.b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public GoodsSpu b;
    public FoodMultiSpuResponse c;
    public g d;
    public HashMap<String, GoodsAttr> e;
    public HashSet<Long> f;
    private boolean g;

    public a(GoodsSpu goodsSpu, g gVar) {
        Object[] objArr = {goodsSpu, gVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67310b60652b7be5bdbfc776229f40e3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67310b60652b7be5bdbfc776229f40e3");
            return;
        }
        this.e = new HashMap<>();
        this.f = new HashSet<>();
        this.g = false;
        this.b = goodsSpu;
        this.c = goodsSpu.getFoodMultiSpuResponse();
        this.d = gVar;
        d();
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4a88c28c03d25c094e3e1799aa275e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4a88c28c03d25c094e3e1799aa275e4");
        } else if (this.c != null && !b.a(this.c.multiAttrsList)) {
            for (GoodsAttrList goodsAttrList : this.c.multiAttrsList) {
                if (!b.a(goodsAttrList.values)) {
                    for (GoodsAttr goodsAttr : goodsAttrList.values) {
                        goodsAttr.setName(goodsAttrList.name);
                    }
                }
            }
        }
    }

    public void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5733ab832ac54dc9dee4dbbe22e16c7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5733ab832ac54dc9dee4dbbe22e16c7b");
        } else if (b.a(this.b.skus)) {
        } else {
            Collections.sort(this.b.skus, new Comparator<GoodsSku>() { // from class: com.sankuai.waimai.business.restaurant.base.skuchoose.multiattr.a.1
                public static ChangeQuickRedirect a;

                @Override // java.util.Comparator
                public final /* synthetic */ int compare(GoodsSku goodsSku, GoodsSku goodsSku2) {
                    GoodsSku goodsSku3 = goodsSku;
                    GoodsSku goodsSku4 = goodsSku2;
                    Object[] objArr2 = {goodsSku3, goodsSku4};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "92d4e7b8094721246c479d823ab2f47c", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "92d4e7b8094721246c479d823ab2f47c")).intValue();
                    }
                    if (goodsSku3.price < goodsSku4.price) {
                        return -1;
                    }
                    return goodsSku3.price > goodsSku4.price ? 1 : 0;
                }
            });
            this.g = true;
        }
    }

    public void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "639a5325e0a35ffacba01d09417940c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "639a5325e0a35ffacba01d09417940c1");
        } else if (!b.a(this.c.multiAttrsList) && this.c.skuAttrsMap != null && this.c.skuAttrsMap.size() != 0) {
            this.f.clear();
            for (GoodsAttr goodsAttr : this.e.values()) {
                this.f.add(Long.valueOf(goodsAttr.id));
            }
            HashSet hashSet = new HashSet();
            for (GoodsAttrList goodsAttrList : this.c.multiAttrsList) {
                if (goodsAttrList.mode == 2) {
                    a(goodsAttrList, this.f);
                } else {
                    HashMap<String, GoodsAttr> hashMap = new HashMap<>(this.e);
                    hashMap.remove(goodsAttrList.getName());
                    Set<Long> b = b(hashMap);
                    for (int i = 0; i < goodsAttrList.values.size(); i++) {
                        GoodsAttr goodsAttr2 = goodsAttrList.values.get(i);
                        if (goodsAttr2.status != 1) {
                            if (b.contains(Long.valueOf(goodsAttr2.id))) {
                                goodsAttr2.status = 3;
                            } else if (this.e.containsKey(goodsAttrList.name)) {
                                if (this.e.get(goodsAttr2.getName()).id == goodsAttr2.id) {
                                    goodsAttr2.status = 2;
                                } else {
                                    goodsAttr2.status = 0;
                                }
                            } else if (z) {
                                goodsAttr2.status = 2;
                                this.e.put(goodsAttrList.name, goodsAttr2);
                                this.f.add(Long.valueOf(goodsAttr2.id));
                                if (!b.a(goodsAttr2.mutexAttrs)) {
                                    hashSet.addAll(goodsAttr2.mutexAttrs);
                                }
                            } else {
                                goodsAttr2.status = 0;
                            }
                        }
                    }
                }
            }
            if (z) {
                for (GoodsAttrList goodsAttrList2 : this.c.multiAttrsList) {
                    for (GoodsAttr goodsAttr3 : goodsAttrList2.values) {
                        if (hashSet.contains(Long.valueOf(goodsAttr3.id))) {
                            goodsAttr3.status = 3;
                        }
                    }
                }
            }
        }
    }

    private void a(GoodsAttrList goodsAttrList, Set<Long> set) {
        Object[] objArr = {goodsAttrList, set};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5885d4bc06ec7b1156f1821700a5a034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5885d4bc06ec7b1156f1821700a5a034");
            return;
        }
        HashSet hashSet = new HashSet();
        HashMap<String, GoodsAttr> hashMap = new HashMap<>(this.e);
        hashMap.remove(goodsAttrList.getName());
        Set<Long> a2 = a(hashMap);
        if (!b.a(a2)) {
            for (Long l : a2) {
                for (com.sankuai.waimai.platform.domain.core.goods.g gVar : this.c.skuAttrsMap.get(Long.valueOf(l.longValue()))) {
                    if (TextUtils.equals(gVar.a, goodsAttrList.getName())) {
                        hashSet.add(Long.valueOf(gVar.c));
                    }
                }
            }
        }
        Set<Long> b = b(hashMap);
        for (GoodsAttr goodsAttr : goodsAttrList.values) {
            if (goodsAttr.status != 1) {
                if (b.contains(Long.valueOf(goodsAttr.id))) {
                    goodsAttr.status = 3;
                } else if (hashSet.contains(Long.valueOf(goodsAttr.id))) {
                    if (set.contains(Long.valueOf(goodsAttr.id))) {
                        goodsAttr.status = 2;
                    } else {
                        goodsAttr.status = 0;
                    }
                } else {
                    goodsAttr.status = 3;
                }
            }
        }
    }

    private Set<Long> a(HashMap<String, GoodsAttr> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb18c09f2fd8c52718e95d86310d69c1", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb18c09f2fd8c52718e95d86310d69c1");
        }
        if (this.c == null || this.c.skuAttrsMap == null) {
            return null;
        }
        HashSet hashSet = new HashSet(this.c.skuAttrsMap.keySet());
        if (hashMap == null || hashMap.size() == 0) {
            return hashSet;
        }
        for (GoodsAttr goodsAttr : hashMap.values()) {
            if (!b.a(goodsAttr.skuIds) && goodsAttr.status != 1) {
                hashSet.retainAll(goodsAttr.skuIds);
            }
        }
        return hashSet;
    }

    private Set<Long> b(HashMap<String, GoodsAttr> hashMap) {
        Object[] objArr = {hashMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cc62fe0530e3cbc5e7955f50a7bd9ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (Set) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cc62fe0530e3cbc5e7955f50a7bd9ef");
        }
        HashSet hashSet = new HashSet();
        if (hashMap.size() == 0) {
            return hashSet;
        }
        for (GoodsAttr goodsAttr : hashMap.values()) {
            if (goodsAttr != null && !b.a(goodsAttr.mutexAttrs)) {
                hashSet.addAll(goodsAttr.mutexAttrs);
            }
        }
        return hashSet;
    }

    public final GoodsSku b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "644e86f994f2f2a5a90af121dc0a831e", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsSku) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "644e86f994f2f2a5a90af121dc0a831e");
        }
        Set<Long> a2 = a(this.e);
        if (this.b == null || b.a(this.b.skus) || b.a(a2)) {
            return null;
        }
        if (!this.g) {
            a();
        }
        for (GoodsSku goodsSku : this.b.skus) {
            if (a2.contains(Long.valueOf(goodsSku.id))) {
                return goodsSku;
            }
        }
        return null;
    }

    public final GoodsAttr[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca95beb5ce661b17675a1b8f4a909b74", RobustBitConfig.DEFAULT_VALUE)) {
            return (GoodsAttr[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca95beb5ce661b17675a1b8f4a909b74");
        }
        if (this.c == null || b.a(this.c.multiAttrsList)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (GoodsAttrList goodsAttrList : this.c.multiAttrsList) {
            for (GoodsAttr goodsAttr : goodsAttrList.values) {
                if (this.f.contains(Long.valueOf(goodsAttr.id))) {
                    arrayList.add(goodsAttr);
                }
            }
        }
        return (GoodsAttr[]) arrayList.toArray(new GoodsAttr[arrayList.size()]);
    }
}
