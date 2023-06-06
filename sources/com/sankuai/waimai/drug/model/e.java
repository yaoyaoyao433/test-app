package com.sankuai.waimai.drug.model;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.i;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.waimai.business.order.api.store.model.ShopCartTotalBoxPriceInfo;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.vo.CartHandPriceInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;

    public final List<f> a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        boolean z;
        int i;
        com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar;
        int i2;
        com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar2;
        String str;
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc66e6ca19aeef23f2d5d7dec5ebcc91", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc66e6ca19aeef23f2d5d7dec5ebcc91");
        }
        ArrayList arrayList = new ArrayList();
        if (bVar != null) {
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list = bVar.c;
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list)) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar3 = list.get(i3);
                    if (cVar3 != null && !com.sankuai.shangou.stone.util.a.b(cVar3.j)) {
                        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.a b = bVar.k().b();
                        if (t.a(b.c)) {
                            str = com.sankuai.waimai.store.util.b.a((int) R.string.wm_st_shopcart_plus_area);
                        } else {
                            str = b.c;
                        }
                        a(f.b, b(bVar), com.sankuai.waimai.store.util.b.a((int) R.string.wm_sc_common_repurchase), str, "", arrayList);
                        a(f.b, cVar3, arrayList, -1);
                        a(0, "", "", arrayList);
                    }
                }
            }
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list2 = bVar.b;
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
                int size = list2.size();
                double d = 0.0d;
                int i4 = 0;
                while (i4 < size) {
                    com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar4 = list2.get(i4);
                    if (cVar4 != null) {
                        double d2 = d + cVar4.k;
                        if (TextUtils.isEmpty(cVar4.d)) {
                            cVar2 = cVar4;
                            i2 = i4;
                        } else {
                            cVar2 = cVar4;
                            i2 = i4;
                            a(i4, cVar4.c, cVar4.d, cVar4.h, cVar4.i, cVar4.f, arrayList);
                        }
                        a(i2, cVar2, arrayList, size);
                        int i5 = size - 1;
                        if (i2 < i5 || (i2 == i5 && !i.a(Double.valueOf(d2), Double.valueOf(0.0d)))) {
                            a(0, "", "", arrayList);
                        }
                        d = d2;
                    } else {
                        i2 = i4;
                    }
                    i4 = i2 + 1;
                }
            }
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) bVar.w) && com.sankuai.shangou.stone.util.a.a((Collection<?>) arrayList)) {
                int a2 = com.sankuai.shangou.stone.util.a.a((List) bVar.w);
                int i6 = 0;
                while (i6 < a2) {
                    a(arrayList, (CartHandPriceInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) bVar.w, i6), bVar.v, bVar.h, i6 == 0);
                    i6++;
                }
                z = true;
            } else {
                z = false;
            }
            if (bVar.v == null || com.sankuai.shangou.stone.util.a.b(arrayList) || z) {
                i = 0;
            } else {
                i = 0;
                a(0, "", "", arrayList);
                a(bVar.v, bVar.h, arrayList);
            }
            List<com.sankuai.waimai.store.platform.domain.core.shopcart.c> list3 = bVar.d;
            if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list3) && (cVar = list3.get(i)) != null) {
                List<ShopCartItem> list4 = cVar.j;
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list4)) {
                    if (!z) {
                        a(i, "", "", arrayList);
                    }
                    a(arrayList);
                    while (i < list4.size()) {
                        ShopCartItem shopCartItem = list4.get(i);
                        if (shopCartItem != null) {
                            f fVar = new f();
                            fVar.d = 4;
                            fVar.h = shopCartItem;
                            fVar.f = i;
                            arrayList.add(fVar);
                        }
                        i++;
                    }
                }
            }
        }
        return arrayList;
    }

    private void a(ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo, String str, List<f> list) {
        Object[] objArr = {shopCartTotalBoxPriceInfo, str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c4233f136090fa312f8e251270543e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c4233f136090fa312f8e251270543e5");
        } else if (shopCartTotalBoxPriceInfo != null) {
            f fVar = new f();
            fVar.r = shopCartTotalBoxPriceInfo;
            fVar.l = str;
            fVar.d = 2;
            list.add(fVar);
        }
    }

    private void a(int i, com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, List<f> list, int i2) {
        Object[] objArr = {Integer.valueOf(i), cVar, list, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a93940830dc7f64ffdf17d57fe313ba7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a93940830dc7f64ffdf17d57fe313ba7");
            return;
        }
        List<ShopCartItem> list2 = cVar.j;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
            for (int i3 = 0; i3 < list2.size(); i3++) {
                f fVar = new f();
                fVar.h = list2.get(i3);
                fVar.f = i3;
                if (cVar.k != 0.0d && i == i2 - 1 && i3 == list2.size() - 1) {
                    fVar.g = true;
                }
                if (i == f.b) {
                    fVar.c = f.b;
                    fVar.e = 0;
                    fVar.p = 1;
                } else {
                    fVar.c = i;
                    fVar.e = i;
                    fVar.p = 0;
                }
                fVar.d = 1;
                fVar.o = cVar.g;
                list.add(fVar);
            }
        }
    }

    @NonNull
    private f a(int i, String str, String str2, List<f> list) {
        Object[] objArr = {Integer.valueOf(i), str, str2, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5b6f0024bbf20cdad9ac6f4c32354fff", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5b6f0024bbf20cdad9ac6f4c32354fff");
        }
        f fVar = new f();
        fVar.e = i;
        fVar.j = true;
        fVar.i = str2;
        fVar.k = str;
        fVar.d = 0;
        list.add(fVar);
        return fVar;
    }

    private void a(int i, String str, String str2, String str3, String str4, List<f> list) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "443e57e44240d7d9b5dc3b4626ed5c9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "443e57e44240d7d9b5dc3b4626ed5c9a");
            return;
        }
        f a2 = a(i, str, str2, list);
        a2.m = str3;
        a2.n = str4;
    }

    private void a(int i, String str, String str2, String str3, String str4, String str5, List<f> list) {
        Object[] objArr = {Integer.valueOf(i), str, str2, str3, str4, str5, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae7a99852f13a0095d76072745de3db1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae7a99852f13a0095d76072745de3db1");
            return;
        }
        f a2 = a(i, str, str2, list);
        a2.m = str3;
        a2.n = str4;
        a2.q = str5;
    }

    private void a(List<f> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "154d2c66421ad46555ad2b8a7d8cab46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "154d2c66421ad46555ad2b8a7d8cab46");
            return;
        }
        f fVar = new f();
        fVar.d = 3;
        list.add(fVar);
    }

    private String b(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "119d8a164411d3a13eedeb852ebb93b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "119d8a164411d3a13eedeb852ebb93b3");
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.tip.a b = bVar.k().b();
        return (b == null || t.a(b.b)) ? "" : b.b;
    }

    private void a(List<f> list, CartHandPriceInfo cartHandPriceInfo, ShopCartTotalBoxPriceInfo shopCartTotalBoxPriceInfo, String str, boolean z) {
        Object[] objArr = {list, cartHandPriceInfo, shopCartTotalBoxPriceInfo, str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1cede7b06c65accc4a2c34b86ab5bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1cede7b06c65accc4a2c34b86ab5bae");
            return;
        }
        f fVar = new f();
        fVar.d = 5;
        fVar.t = z;
        fVar.s = cartHandPriceInfo;
        fVar.r = shopCartTotalBoxPriceInfo;
        fVar.l = str;
        list.add(fVar);
    }
}
