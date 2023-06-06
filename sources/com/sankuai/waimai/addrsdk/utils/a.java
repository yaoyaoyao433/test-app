package com.sankuai.waimai.addrsdk.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    public static boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bd0da3611f2bf00abf5298cddb72089", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bd0da3611f2bf00abf5298cddb72089")).booleanValue() : com.sankuai.waimai.addrsdk.retrofit.b.a() && com.sankuai.waimai.addrsdk.a.a();
    }
}
