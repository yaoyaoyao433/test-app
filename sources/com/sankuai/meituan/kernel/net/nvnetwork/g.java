package com.sankuai.meituan.kernel.net.nvnetwork;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g implements r {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdb678073cfaf1309c56d185e8d480a2", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdb678073cfaf1309c56d185e8d480a2");
        }
        Request a2 = aVar.a();
        if (a2.g != null && a2.g.containsKey("retrofit_exec_time")) {
            final long currentTimeMillis = System.currentTimeMillis();
            final String str = a2.d;
            return aVar.a(a2).d(new rx.functions.g<q, q>() { // from class: com.sankuai.meituan.kernel.net.nvnetwork.g.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ q call(q qVar) {
                    q qVar2 = qVar;
                    Object[] objArr2 = {qVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1448dd33a6a7cbb551af89d7bec8c2b0", RobustBitConfig.DEFAULT_VALUE)) {
                        return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1448dd33a6a7cbb551af89d7bec8c2b0");
                    }
                    g gVar = g.this;
                    long j = currentTimeMillis;
                    String str2 = str;
                    Object[] objArr3 = {qVar2, new Long(j), str2};
                    ChangeQuickRedirect changeQuickRedirect3 = g.a;
                    if (PatchProxy.isSupport(objArr3, gVar, changeQuickRedirect3, false, "cb251b643a0b24593cd05e06a2453200", RobustBitConfig.DEFAULT_VALUE)) {
                        return (q) PatchProxy.accessDispatch(objArr3, gVar, changeQuickRedirect3, false, "cb251b643a0b24593cd05e06a2453200");
                    }
                    byte[] result = qVar2.result();
                    long length = result != null ? result.length : 0L;
                    long currentTimeMillis2 = System.currentTimeMillis() - j;
                    HashMap<String, String> headers = qVar2.headers();
                    if (headers == null) {
                        headers = new HashMap<>();
                        q.a a3 = qVar2.a();
                        a3.e = headers;
                        qVar2 = a3.build();
                    }
                    headers.put("nt_repsonse_elapsetime", String.valueOf(currentTimeMillis2));
                    headers.put("nt_responsebody_size", String.valueOf(length));
                    headers.put("nt_request_time", String.valueOf(j));
                    headers.put("nt_type", "3");
                    headers.put("nt_url", str2);
                    return qVar2;
                }
            });
        }
        return aVar.a(a2);
    }
}
