package com.meituan.android.neohybrid.v2.neo.http.shark;

import com.dianping.nvnetwork.Request;
import com.dianping.nvnetwork.q;
import com.dianping.nvnetwork.r;
import com.meituan.android.paybase.utils.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import rx.d;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements r {
    public static ChangeQuickRedirect a;

    @Override // com.dianping.nvnetwork.r
    public final d<q> intercept(r.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a237cf8f386d474c8ffd67fc03f9084d", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a237cf8f386d474c8ffd67fc03f9084d");
        }
        try {
            Request a2 = aVar.a();
            return aVar.a(a2.a().timeout(a(a2.f())).build());
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "NvTimeoutInterceptor_intercept");
            return d.a(new q.a().a(-1).a(e).build());
        }
    }

    private int a(Map<String, String> map) {
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6aa432fba5fd4736cfa3c41b73177cd", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6aa432fba5fd4736cfa3c41b73177cd")).intValue();
        }
        if (i.a(map)) {
            return 10000;
        }
        try {
            String str = map.get("neo_header_shark_limit_time");
            if (str == null) {
                return 10000;
            }
            int parseInt = Integer.parseInt(str);
            if (parseInt > 0) {
                return parseInt;
            }
            return 10000;
        } catch (Exception e) {
            com.meituan.android.neohybrid.exception.a.a(e, "NvTimeoutInterceptor_getRequestLimitTime");
            return 10000;
        }
    }
}
