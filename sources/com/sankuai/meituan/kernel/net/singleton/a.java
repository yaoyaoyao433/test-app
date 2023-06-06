package com.sankuai.meituan.kernel.net.singleton;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.kernel.net.singleton.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0593a {
        public static ChangeQuickRedirect a;
        private static b b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5c7a41aa6e7729a58b5f3ad6eaf34cd4", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5c7a41aa6e7729a58b5f3ad6eaf34cd4") : new com.sankuai.meituan.kernel.net.impl.a(com.sankuai.meituan.kernel.net.base.c.b, com.sankuai.meituan.kernel.net.base.c.a());
        }
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2ffb5890a17472130ab890892e5e74a6", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2ffb5890a17472130ab890892e5e74a6") : C0593a.b;
    }
}
