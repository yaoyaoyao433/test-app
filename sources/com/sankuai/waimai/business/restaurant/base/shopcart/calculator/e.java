package com.sankuai.waimai.business.restaurant.base.shopcart.calculator;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends g {
    public static ChangeQuickRedirect a;

    /* JADX WARN: Removed duplicated region for block: B:138:0x066b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x06a7  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x06b0  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x08b2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x08f0  */
    @Override // com.sankuai.waimai.business.restaurant.base.shopcart.calculator.g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.sankuai.waimai.business.restaurant.base.manager.order.g r68, com.sankuai.waimai.business.restaurant.base.shopcart.b r69, java.util.List<com.sankuai.waimai.business.restaurant.base.manager.order.c.a> r70, com.sankuai.waimai.business.restaurant.base.shopcart.e r71) {
        /*
            Method dump skipped, instructions count: 2314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.business.restaurant.base.shopcart.calculator.e.a(com.sankuai.waimai.business.restaurant.base.manager.order.g, com.sankuai.waimai.business.restaurant.base.shopcart.b, java.util.List, com.sankuai.waimai.business.restaurant.base.shopcart.e):void");
    }

    private int a(@NonNull Map<String, Integer> map, @NonNull String str) {
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4653ce3c0e9367498a9dd22e2d8f133", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4653ce3c0e9367498a9dd22e2d8f133")).intValue();
        }
        Integer num = map.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}
