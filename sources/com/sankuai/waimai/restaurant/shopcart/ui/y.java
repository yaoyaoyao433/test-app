package com.sankuai.waimai.restaurant.shopcart.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class y {
    public static ChangeQuickRedirect a;

    public static float a(com.sankuai.waimai.business.restaurant.poicontainer.pga.baseblock.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a7684689995bc0702db8ae99fd00c532", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a7684689995bc0702db8ae99fd00c532")).floatValue() : a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e);
    }

    private static float a(int i, int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "41cde032561495f0701df87ee908ff41", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "41cde032561495f0701df87ee908ff41")).floatValue();
        }
        int i6 = (i3 + i4) / 2;
        return 1.0f - com.sankuai.waimai.foundation.utils.o.a(i, i6 - com.sankuai.waimai.foundation.utils.g.a(com.meituan.android.singleton.b.a, 50.0f), i6);
    }
}
