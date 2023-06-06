package com.meituan.android.paybase.net.cat;

import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.v;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements t {
    public static ChangeQuickRedirect a;

    @Override // com.squareup.okhttp.t
    public final z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb6b5b640ec900975261d7ead2b0b4ea", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb6b5b640ec900975261d7ead2b0b4ea");
        }
        x a2 = aVar.a();
        String path = a2.a().getPath();
        int a3 = b.a(a2.a().getProtocol());
        int a4 = b.a(a2);
        long currentTimeMillis = System.currentTimeMillis();
        try {
            return aVar.a(a2);
        } catch (Exception e) {
            v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "NetExceptionCatMonitorInterceptor_intercept").a("message", e.getMessage()).b);
            com.meituan.android.paybase.config.a.d().a(currentTimeMillis, path, 0, a3, d.a(e), a4, 0, 0, "");
            throw e;
        }
    }
}
