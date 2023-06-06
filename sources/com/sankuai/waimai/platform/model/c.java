package com.sankuai.waimai.platform.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fa478496d2610c628171b79426c8bca", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fa478496d2610c628171b79426c8bca");
        }
        com.sankuai.waimai.log.judas.a.a = com.sankuai.waimai.platform.utils.sharedpreference.a.s();
        return a.a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final c a = new c();
    }

    public final int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0659cb447c75ba7c825e71020359f4f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0659cb447c75ba7c825e71020359f4f")).intValue() : com.sankuai.waimai.platform.utils.sharedpreference.a.s();
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee3898299a4a69497defb2271b35c7a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee3898299a4a69497defb2271b35c7a5");
            return;
        }
        com.sankuai.waimai.platform.utils.sharedpreference.a.e(i);
        com.sankuai.waimai.log.judas.a.a = i;
        com.sankuai.waimai.platform.model.a.a().a(i);
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cd955f2ea405fd9bee054241fb134f", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cd955f2ea405fd9bee054241fb134f")).booleanValue() : b() == 3;
    }
}
