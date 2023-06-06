package com.sankuai.waimai.business.page.kingkong.future.network.preload;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.android.jarvis.c;
import com.sankuai.android.jarvis.n;
import com.sankuai.waimai.business.page.home.preload.machpreload.PreLoadTemplate;
import java.util.Set;
import java.util.concurrent.ExecutorService;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    final ExecutorService b;
    public com.sankuai.waimai.mach.recycler.b c;
    public Set<PreLoadTemplate> d;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "001ee72ab4550a3ddad48bf7d24b8a5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "001ee72ab4550a3ddad48bf7d24b8a5e");
            return;
        }
        this.b = c.a("wm-pre-load-mach-bundle", n.PRIORITY_HIGH);
        this.c = new com.sankuai.waimai.mach.recycler.b("waimai");
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static final class a {
        private static final b a = new b();
    }

    public static b a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "592873e0fd5476e18f60a63615e8fe05", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "592873e0fd5476e18f60a63615e8fe05") : a.a;
    }
}
