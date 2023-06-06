package com.sankuai.waimai.business.search.ui;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static a h;
    public long b;
    public long c;
    public double d;
    public double e;
    public double f;
    public double g;

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e758fb914917c4b24ab082101f98cabf", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e758fb914917c4b24ab082101f98cabf");
        }
        if (h == null) {
            h = new a();
        }
        return h;
    }
}
