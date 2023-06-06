package com.meituan.android.paybase.retrofit.interceptor;

import android.content.Context;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.NVCandyInterceptor;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements r {
    public static ChangeQuickRedirect a;
    private final Context b;
    private NVCandyInterceptor c;

    public b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6fa02ebd3637e3f9da51357b34000f37", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6fa02ebd3637e3f9da51357b34000f37");
            return;
        }
        this.b = context;
        this.c = new NVCandyInterceptor(this.b);
    }

    @Override // com.dianping.nvnetwork.r
    public final d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8722df937326adf4ef09c8ef4f7d71b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8722df937326adf4ef09c8ef4f7d71b");
        }
        try {
            return this.c.intercept(aVar);
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "NVCandyInterceptor_intercept").a("message", e.getMessage()).b);
            return d.a(new q.a().a(-1).a(e).build());
        }
    }
}
