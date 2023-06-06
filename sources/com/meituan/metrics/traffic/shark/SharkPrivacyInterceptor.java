package com.meituan.metrics.traffic.shark;

import android.net.Uri;
import android.support.annotation.Keep;
import android.text.TextUtils;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.metrics.traffic.reflection.ReflectWrapper;
import com.meituan.privacy.PrivacyUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import rx.d;
/* compiled from: ProGuard */
@Keep
/* loaded from: classes3.dex */
public class SharkPrivacyInterceptor implements r, ReflectWrapper {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.nvnetwork.r
    public d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b331d92631dbb8a8dadcba2f272c1ef6", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b331d92631dbb8a8dadcba2f272c1ef6");
        }
        Request a = aVar.a();
        if (!PrivacyUtil.a()) {
            return aVar.a(a);
        }
        Uri.parse(a.d);
        if (PrivacyUtil.a(a.d)) {
            PrivacyUtil.b a2 = PrivacyUtil.a(2, a.d);
            if (a2.a == 2) {
                q.a aVar2 = new q.a();
                aVar2.c = 403;
                aVar2.i = false;
                aVar2.j = "CIPPrivacy forbid request";
                return d.a(aVar2.build());
            } else if (a2.a == 1) {
                if (!TextUtils.isEmpty(a2.b)) {
                    a.d = a2.b;
                }
                return aVar.a(a);
            }
        }
        return aVar.a(a);
    }

    @Override // com.meituan.metrics.traffic.reflection.ReflectWrapper
    public void onWrapper(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2302d7c70ea933a06e0bc3648c62aaee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2302d7c70ea933a06e0bc3648c62aaee");
        } else if (obj instanceof NVDefaultNetworkService.a) {
            NVDefaultNetworkService.a aVar = (NVDefaultNetworkService.a) obj;
            aVar.a(this);
            aVar.a(new SharkCandyInterceptor());
        }
    }
}
