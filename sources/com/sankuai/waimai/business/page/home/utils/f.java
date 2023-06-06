package com.sankuai.waimai.business.page.home.utils;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f {
    public static ChangeQuickRedirect a;

    public f() {
    }

    public static f a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "145958567f231700624c7b22a91c2093", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "145958567f231700624c7b22a91c2093") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final f a = new f();
    }
}
