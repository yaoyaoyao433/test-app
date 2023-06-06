package com.sankuai.meituan.kernel.net.nvnetwork;

import android.text.TextUtils;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class m implements r {
    public static ChangeQuickRedirect a;
    String b;

    public m(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c88e2de1ffe785e13f86d6a5ba54cc5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c88e2de1ffe785e13f86d6a5ba54cc5");
        } else {
            this.b = str;
        }
    }

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d41e3f966e3d04a07062e530496e2b", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d41e3f966e3d04a07062e530496e2b") : aVar.a(aVar.a()).d(new rx.functions.g<q, q>() { // from class: com.sankuai.meituan.kernel.net.nvnetwork.m.1
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ q call(q qVar) {
                q qVar2 = qVar;
                Object[] objArr2 = {qVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3ef3b61e56211dafb39736f8e0c0f9c5", RobustBitConfig.DEFAULT_VALUE)) {
                    return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3ef3b61e56211dafb39736f8e0c0f9c5");
                }
                HashMap<String, String> headers = qVar2.headers();
                if (headers == null) {
                    headers = new HashMap<>();
                    q.a a2 = qVar2.a();
                    a2.e = headers;
                    qVar2 = a2.build();
                }
                headers.put("network_lib", "mt-common-net/1.0");
                if (!TextUtils.isEmpty(m.this.b)) {
                    headers.put(NetLogConstants.Tags.TUNNEL_SOURCE, m.this.b);
                }
                return qVar2;
            }
        });
    }
}
