package com.meituan.android.neohybrid.v2.neo.http.interceptor;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.q;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d extends a {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.android.neohybrid.v2.neo.http.interceptor.a, com.sankuai.meituan.retrofit2.Interceptor
    public final /* bridge */ /* synthetic */ com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        return super.intercept(aVar);
    }

    @Override // com.meituan.android.neohybrid.v2.neo.http.interceptor.a
    public final com.sankuai.meituan.retrofit2.raw.b a(Interceptor.a aVar) throws IOException, com.meituan.android.neohybrid.exception.a {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "272496cd3bdf06e3171147b5e60bb043", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "272496cd3bdf06e3171147b5e60bb043");
        }
        aj request = aVar.request();
        aj.a a = request.a();
        Object[] objArr2 = {request, a};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "518f63d9d8ad818768ee0823ebc2ea6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "518f63d9d8ad818768ee0823ebc2ea6c");
        } else if (request != null && a != null) {
            String a2 = request.a("neo_header_request_method");
            if (!TextUtils.isEmpty(a2)) {
                try {
                    com.meituan.android.neohybrid.v2.neo.http.d.valueOf(a2);
                    a.a(a2);
                } catch (Exception e) {
                    com.meituan.android.neohybrid.exception.a.a(e, "NeoRequestInterceptor_replaceRequestMethod");
                }
            }
        }
        Object[] objArr3 = {request, a};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1cf546b68eaebaff765c48f80dd1b43d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1cf546b68eaebaff765c48f80dd1b43d");
        } else if (request != null && a != null) {
            for (q qVar : request.d()) {
                if (qVar != null) {
                    String a3 = qVar.a();
                    if (a3.startsWith("neo_header_")) {
                        a.c(a3);
                    }
                }
            }
            a.c(null);
        }
        return aVar.a(a.a());
    }
}
