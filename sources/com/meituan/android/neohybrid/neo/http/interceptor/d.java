package com.meituan.android.neohybrid.neo.http.interceptor;

import android.text.TextUtils;
import com.meituan.android.neohybrid.neo.http.e;
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

    @Override // com.meituan.android.neohybrid.neo.http.interceptor.a, com.sankuai.meituan.retrofit2.Interceptor
    public final /* bridge */ /* synthetic */ com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        return super.intercept(aVar);
    }

    @Override // com.meituan.android.neohybrid.neo.http.interceptor.a
    public final com.sankuai.meituan.retrofit2.raw.b a(Interceptor.a aVar) throws IOException, com.meituan.android.neohybrid.exception.a {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b1f0ef08ef961d4bf21d0b7d87304d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b1f0ef08ef961d4bf21d0b7d87304d8");
        }
        aj request = aVar.request();
        aj.a a = request.a();
        Object[] objArr2 = {request, a};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ce4518b10cd66e88afb3886d5e9ba46", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ce4518b10cd66e88afb3886d5e9ba46");
        } else if (request != null && a != null) {
            String a2 = request.a("neo_header_request_method");
            if (!TextUtils.isEmpty(a2)) {
                try {
                    e.valueOf(a2);
                    a.a(a2);
                } catch (Exception e) {
                    com.meituan.android.neohybrid.exception.a.a(e, "NeoRequestInterceptor_replaceRequestMethod");
                }
            }
        }
        Object[] objArr3 = {request, a};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7d5ea2f709256faaf8f8ca9d7f6acc7e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7d5ea2f709256faaf8f8ca9d7f6acc7e");
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
