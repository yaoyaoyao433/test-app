package com.sankuai.waimai.store.shopping.cart;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.domain.core.shopcart.ShopCartItem;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Code restructure failed: missing block: B:56:0x01c9, code lost:
        if (com.sankuai.shangou.stone.util.i.a(java.lang.Double.valueOf(r18), java.lang.Double.valueOf(0.0d)) != false) goto L58;
     */
    /* JADX WARN: Type inference failed for: r11v0 */
    /* JADX WARN: Type inference failed for: r11v7, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v2, types: [boolean, byte] */
    /* JADX WARN: Type inference failed for: r15v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<com.sankuai.waimai.store.platform.domain.core.order.a> a(com.sankuai.waimai.store.platform.domain.core.shopcart.b r36) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.shopping.cart.e.a(com.sankuai.waimai.store.platform.domain.core.shopcart.b):java.util.List");
    }

    private void a(int i, com.sankuai.waimai.store.platform.domain.core.shopcart.c cVar, List<com.sankuai.waimai.store.platform.domain.core.order.a> list, int i2) {
        Object[] objArr = {Integer.valueOf(i), cVar, list, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39b9039e8fa695c6c8517dd7a85b88b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39b9039e8fa695c6c8517dd7a85b88b7");
            return;
        }
        List<ShopCartItem> list2 = cVar.j;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) list2)) {
            for (int i3 = 0; i3 < list2.size(); i3++) {
                com.sankuai.waimai.store.platform.domain.core.order.a aVar = new com.sankuai.waimai.store.platform.domain.core.order.a();
                aVar.h = list2.get(i3);
                aVar.f = i3;
                if (cVar.k != 0.0d && i == i2 - 1 && i3 == list2.size() - 1) {
                    aVar.g = true;
                }
                if (i == com.sankuai.waimai.store.platform.domain.core.order.a.b) {
                    aVar.c = com.sankuai.waimai.store.platform.domain.core.order.a.b;
                    aVar.e = 0;
                    aVar.p = 1;
                } else {
                    aVar.c = i;
                    aVar.e = i;
                    aVar.p = 0;
                }
                aVar.d = 1;
                aVar.o = cVar.g;
                list.add(aVar);
            }
        }
    }

    @NonNull
    private com.sankuai.waimai.store.platform.domain.core.order.a a(int i, String str, String str2, List<com.sankuai.waimai.store.platform.domain.core.order.a> list) {
        Object[] objArr = {Integer.valueOf(i), str, str2, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9edd2c818153d357b69b93d91d20482", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.store.platform.domain.core.order.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9edd2c818153d357b69b93d91d20482");
        }
        com.sankuai.waimai.store.platform.domain.core.order.a aVar = new com.sankuai.waimai.store.platform.domain.core.order.a();
        aVar.e = i;
        aVar.j = true;
        aVar.i = str2;
        aVar.k = str;
        aVar.d = 0;
        list.add(aVar);
        return aVar;
    }
}
