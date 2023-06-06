package com.sankuai.waimai.business.page.mine.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public Set<b> b;

    public c() {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a {
        private static final c a = new c();
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa970493a2a4800ee1e2203bf8f86f24", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa970493a2a4800ee1e2203bf8f86f24") : a.a;
    }
}
