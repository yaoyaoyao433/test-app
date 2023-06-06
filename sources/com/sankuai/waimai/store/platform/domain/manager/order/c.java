package com.sankuai.waimai.store.platform.domain.manager.order;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.manager.order.d;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @SuppressLint({"UseSparseArrays", "UseSparseArrays_JDK7"})
    public HashMap<String, HashMap<String, Integer>> b;
    @SuppressLint({"UseSparseArrays", "UseSparseArrays_JDK7"})
    public HashMap<String, HashMap<String, Integer>> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ef697c38c50be43d185c5da9e050220e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ef697c38c50be43d185c5da9e050220e");
            return;
        }
        this.b = new HashMap<>();
        this.c = new HashMap<>();
    }

    public final HashMap<String, Integer> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b14d69f97b83effb71ef754fdc6c8cac", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b14d69f97b83effb71ef754fdc6c8cac") : this.b.get(str);
    }

    public final HashMap<String, Integer> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ca639c4025602d5ec4f98fb42b0a4d9", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ca639c4025602d5ec4f98fb42b0a4d9") : this.c.get(str);
    }

    public final void c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43a753c8373810b0d4bfa6a2dd12dbd7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43a753c8373810b0d4bfa6a2dd12dbd7");
            return;
        }
        this.b.remove(str);
        this.c.remove(str);
    }

    public final void a(final String str, com.sankuai.waimai.store.platform.domain.core.shopcart.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0b944de9e677232eeb79c038b75f0c00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0b944de9e677232eeb79c038b75f0c00");
        } else if (aVar == null) {
        } else {
            HashMap<String, Integer> hashMap = this.b.get(str);
            HashMap<String, Integer> hashMap2 = this.c.get(str);
            if (hashMap != null) {
                hashMap.clear();
            }
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            d.a.c(aVar, new d.a.InterfaceC1265a() { // from class: com.sankuai.waimai.store.platform.domain.manager.order.c.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.manager.order.d.a.InterfaceC1265a
                public final boolean a(ShopCartItem shopCartItem, int i, int i2, int i3, int i4) {
                    Object[] objArr2 = {shopCartItem, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8d50a17ef73cb9a9752d42d19c215fc0", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8d50a17ef73cb9a9752d42d19c215fc0")).booleanValue();
                    }
                    if (shopCartItem == null || shopCartItem.food == null || shopCartItem.food.spu == null) {
                        return false;
                    }
                    HashMap<String, Integer> hashMap3 = c.this.b.get(str);
                    HashMap<String, Integer> hashMap4 = c.this.c.get(str);
                    String activityTag = shopCartItem.food.spu.getActivityTag();
                    String physicalTag = shopCartItem.food.spu.getPhysicalTag();
                    if (shopCartItem.food.spu.activityType == 6 || TextUtils.isEmpty(activityTag)) {
                        activityTag = physicalTag;
                    }
                    if (!TextUtils.isEmpty(physicalTag)) {
                        if (hashMap4 == null) {
                            HashMap<String, Integer> hashMap5 = new HashMap<>();
                            hashMap5.put(physicalTag, Integer.valueOf(shopCartItem.getFoodCount()));
                            c.this.c.put(str, hashMap5);
                        } else if (hashMap4.get(physicalTag) == null) {
                            hashMap4.put(physicalTag, Integer.valueOf(shopCartItem.getFoodCount()));
                        } else {
                            hashMap4.put(physicalTag, Integer.valueOf(hashMap4.get(physicalTag).intValue() + shopCartItem.getFoodCount()));
                        }
                    }
                    if (hashMap3 == null) {
                        HashMap<String, Integer> hashMap6 = new HashMap<>();
                        hashMap6.put(activityTag, Integer.valueOf(shopCartItem.getFoodCount()));
                        c.this.b.put(str, hashMap6);
                    } else if (hashMap3.get(activityTag) == null) {
                        hashMap3.put(activityTag, Integer.valueOf(shopCartItem.getFoodCount()));
                    } else {
                        hashMap3.put(activityTag, Integer.valueOf(hashMap3.get(activityTag).intValue() + shopCartItem.getFoodCount()));
                    }
                    return true;
                }
            });
        }
    }
}
