package com.sankuai.waimai.platform.net.interceptor.nvnetwork;

import android.net.Uri;
import android.text.TextUtils;
import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.platform.widget.emptylayout.WeakNetReport;
import java.util.Map;
import rx.functions.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f implements r {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.r
    public final rx.d<q> intercept(r.a aVar) {
        int i = 0;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d060657e3858d6333c596983409e416a", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d060657e3858d6333c596983409e416a");
        }
        Request a2 = aVar.a();
        final String path = Uri.parse(a2.d).getPath();
        final ABStrategy a3 = WeakNetReport.a();
        if (a3 == null || !a2.d.startsWith(com.sankuai.waimai.platform.net.c.a().e())) {
            return aVar.a(a2);
        }
        Map<String, String> params = a3.getParams();
        if (params == null || !params.containsKey(path)) {
            return aVar.a(a2);
        }
        try {
            String str = params.get(path);
            if (!TextUtils.isEmpty(str)) {
                i = Integer.parseInt(str);
            }
        } catch (Exception unused) {
        }
        if (i >= 500) {
            Request.Builder a4 = a2.a();
            a4.timeout(i);
            final long currentTimeMillis = System.currentTimeMillis();
            return aVar.a(a4.build()).d(new g<q, q>() { // from class: com.sankuai.waimai.platform.net.interceptor.nvnetwork.f.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ q call(q qVar) {
                    q qVar2 = qVar;
                    Object[] objArr2 = {qVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8f74752e9713b2663eb07e80174c156e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (q) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8f74752e9713b2663eb07e80174c156e");
                    }
                    int i2 = 1000;
                    WeakNetReport.a(path, (qVar2 == null || qVar2.error() != null) ? 2000 : 2000, System.currentTimeMillis() - currentTimeMillis, a3.expName);
                    return qVar2;
                }
            });
        }
        return aVar.a(a2);
    }
}
