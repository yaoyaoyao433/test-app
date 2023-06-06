package com.meituan.metrics.traffic.okhttp;

import android.support.annotation.Keep;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.OkCandyInterceptor;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.squareup.okhttp.t;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class OkHttp2CandyInterceptor implements t {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.squareup.okhttp.t
    public z intercept(t.a aVar) throws IOException {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "09687ecb37cd5237b915c284d5e7e052", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "09687ecb37cd5237b915c284d5e7e052");
        }
        x a = aVar.a();
        if (!PrivacyUtil.a()) {
            return aVar.a(a);
        }
        if (a.a(MTGConfigs.c) != null) {
            return new OkCandyInterceptor().intercept(aVar);
        }
        return aVar.a(a);
    }
}
