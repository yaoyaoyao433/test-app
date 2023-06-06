package com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements com.sankuai.waimai.business.page.home.interfacer.b {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    public static final int c = g.a(com.meituan.android.singleton.b.a, 40.0f);
    public static final int d;
    public static final int e;
    private com.sankuai.waimai.rocks.expose.a f;

    @Override // com.sankuai.waimai.business.page.home.interfacer.b
    public final void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5cd7600c93e0c4fab1c1d3e470ee611", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5cd7600c93e0c4fab1c1d3e470ee611");
        } else if (i == 0) {
            this.f.b();
        }
    }

    static {
        int a2 = g.a(com.meituan.android.singleton.b.a, 84.0f);
        d = a2;
        e = a2 - c;
    }
}
