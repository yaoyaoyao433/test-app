package com.sankuai.waimai.business.restaurant.base.manager.order;

import android.annotation.SuppressLint;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.base.manager.order.h;
import com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem;
import com.sankuai.waimai.platform.globalcart.biz.GlobalCartManager;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;
    @SuppressLint({"UseSparseArrays", "UseSparseArrays_JDK7"})
    public com.sankuai.waimai.platform.globalcart.poimix.c<String, HashMap<String, Integer>> b;
    @SuppressLint({"UseSparseArrays", "UseSparseArrays_JDK7"})
    com.sankuai.waimai.platform.globalcart.poimix.c<String, HashMap<String, Integer>> c;

    public static /* synthetic */ void a(f fVar, String str, String str2, ShopCartItem shopCartItem) {
        Object[] objArr = {str, str2, shopCartItem};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "921089e2ded846cbf0182adb0a363cc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "921089e2ded846cbf0182adb0a363cc5");
            return;
        }
        HashMap<String, Integer> b = fVar.c.b(str);
        if (b == null) {
            HashMap<String, Integer> hashMap = new HashMap<>();
            hashMap.put(str2, Integer.valueOf(shopCartItem.getFoodCount()));
            fVar.c.a(str, hashMap);
        } else if (b.get(str2) == null) {
            b.put(str2, Integer.valueOf(shopCartItem.getFoodCount()));
        } else {
            b.put(str2, Integer.valueOf(b.get(str2).intValue() + shopCartItem.getFoodCount()));
        }
    }

    public f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21977a5dcfd6f9eb13f6344aeb62619c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21977a5dcfd6f9eb13f6344aeb62619c");
            return;
        }
        this.b = new com.sankuai.waimai.platform.globalcart.poimix.c<>(GlobalCartManager.getInstance().getPoiIdTab());
        this.c = new com.sankuai.waimai.platform.globalcart.poimix.c<>(GlobalCartManager.getInstance().getPoiIdTab());
    }

    public final void a(final String str, com.sankuai.waimai.business.restaurant.base.shopcart.a aVar) {
        Object[] objArr = {str, aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cfdf72063960c2bdadb9141d0315a206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cfdf72063960c2bdadb9141d0315a206");
        } else if (aVar == null) {
        } else {
            HashMap<String, Integer> b = this.b.b(str);
            if (b != null) {
                b.clear();
            }
            HashMap<String, Integer> b2 = this.c.b(str);
            if (b2 != null) {
                b2.clear();
            }
            h.a.b(aVar, new h.a.InterfaceC0819a() { // from class: com.sankuai.waimai.business.restaurant.base.manager.order.f.1
                public static ChangeQuickRedirect a;

                /* JADX WARN: Code restructure failed: missing block: B:22:0x0096, code lost:
                    if (android.text.TextUtils.isEmpty(r13) == false) goto L20;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:25:0x009d, code lost:
                    if (android.text.TextUtils.isEmpty(r13) == false) goto L20;
                 */
                /* JADX WARN: Removed duplicated region for block: B:29:0x00a3  */
                /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
                @Override // com.sankuai.waimai.business.restaurant.base.manager.order.h.a.InterfaceC0819a
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final boolean a(com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem r11, int r12, int r13, int r14, int r15) {
                    /*
                        Method dump skipped, instructions count: 238
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.manager.order.f.AnonymousClass1.a(com.sankuai.waimai.business.restaurant.base.shopcart.ShopCartItem, int, int, int, int):boolean");
                }
            });
        }
    }

    public final void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "096a146e314d9f1821dfd5af57d6de73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "096a146e314d9f1821dfd5af57d6de73");
            return;
        }
        this.b.c(str);
        this.c.c(str);
    }
}
