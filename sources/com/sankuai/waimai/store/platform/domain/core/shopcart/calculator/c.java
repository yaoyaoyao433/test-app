package com.sankuai.waimai.store.platform.domain.core.shopcart.calculator;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c {
    public static ChangeQuickRedirect a;
    public boolean b;
    public Map<String, com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b> c;

    public c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "960c8414442a49643420cfcc987f1e60", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "960c8414442a49643420cfcc987f1e60");
        } else {
            this.b = false;
        }
    }

    public static c a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f448855454f2e493f4b3baffb2964b1d", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f448855454f2e493f4b3baffb2964b1d") : a.a;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        private static final c a = new c();
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e530c30afc8ab8bbb3af902a9da12ba5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e530c30afc8ab8bbb3af902a9da12ba5");
            return;
        }
        com.sankuai.waimai.store.repository.net.a.a("NetPriceCalculator");
        this.b = false;
        if (this.c != null) {
            this.c.clear();
        }
    }
}
