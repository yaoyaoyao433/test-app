package com.sankuai.meituan.kernel.net.nvnetwork;

import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.t;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j implements r {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7dcb1ffb6bfe1a793ece3dd18714c8e6", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7dcb1ffb6bfe1a793ece3dd18714c8e6");
        }
        Request a2 = aVar.a();
        t e = t.e(a2.d);
        if (!e.l().contains("uuid") && TextUtils.isEmpty(e.c("uuid"))) {
            String g = com.sankuai.meituan.kernel.net.base.c.a() != null ? com.sankuai.meituan.kernel.net.base.c.a().g() : null;
            if (g == null) {
                g = "";
            }
            a2 = a2.a().url(e.m().a("uuid", g).b().toString()).build();
        }
        return aVar.a(a2);
    }
}
