package com.sankuai.meituan.kernel.net.nvnetwork;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d implements r {
    public static ChangeQuickRedirect a;

    public d() {
        com.sankuai.meituan.kernel.net.base.c.b();
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1db4cb7f238da0e06ab9e8101648892f", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1db4cb7f238da0e06ab9e8101648892f");
        }
        Request a2 = aVar.a();
        if (com.sankuai.meituan.kernel.net.base.c.b()) {
            String a3 = com.sankuai.meituan.switchtestenv.a.a(com.sankuai.meituan.kernel.net.base.c.b, a2.d);
            if (!TextUtils.isEmpty(a3)) {
                a2 = a2.a().url(a3).build();
            }
        }
        return aVar.a(a2);
    }
}
