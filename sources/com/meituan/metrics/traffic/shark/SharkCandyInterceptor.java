package com.meituan.metrics.traffic.shark;

import android.support.annotation.Keep;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.android.common.mtguard.MTGConfigs;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.NVCandyInterceptor;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class SharkCandyInterceptor implements r {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.nvnetwork.r
    public d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6ed684bb12b8a0a7a3ac9e26a441c3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6ed684bb12b8a0a7a3ac9e26a441c3b");
        }
        Request a = aVar.a();
        if (!PrivacyUtil.a()) {
            return aVar.a(a);
        }
        if (a.g != null && a.g.containsKey(MTGConfigs.c)) {
            return new NVCandyInterceptor().intercept(aVar);
        }
        return aVar.a(a);
    }
}
