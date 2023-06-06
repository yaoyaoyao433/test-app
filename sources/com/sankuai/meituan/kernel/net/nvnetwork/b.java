package com.sankuai.meituan.kernel.net.nvnetwork;

import android.content.Context;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.NVCandyInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b implements r {
    public static ChangeQuickRedirect a;
    private NVCandyInterceptor b;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6727b0072e5c0161962d22108059645a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6727b0072e5c0161962d22108059645a");
        } else {
            this.b = new NVCandyInterceptor(context);
        }
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6e86699e6e1e66a7e3540fb61be6258", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6e86699e6e1e66a7e3540fb61be6258");
        }
        try {
            return this.b.intercept(aVar);
        } catch (Exception e) {
            q.a aVar2 = new q.a();
            aVar2.c = -1;
            aVar2.j = e;
            return rx.d.a(aVar2.build());
        }
    }
}
