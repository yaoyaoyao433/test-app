package com.meituan.passport.interceptor;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.passport.plugins.r;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.t;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Throwable th;
        aj ajVar;
        String builder;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bde4d127e29796465483c2022cf043b3", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bde4d127e29796465483c2022cf043b3");
        }
        try {
            aj request = aVar.request();
            String aSCIIString = t.e(request.b()).a().toASCIIString();
            Object[] objArr2 = {aSCIIString};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "40ed9e90465413c53e7a3e8c91cbbc55", RobustBitConfig.DEFAULT_VALUE)) {
                builder = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "40ed9e90465413c53e7a3e8c91cbbc55");
            } else if (aSCIIString == null) {
                n.a("UserAnalyzerInterceptor.appendAnalyzeParams", "uri is null", "");
                builder = null;
            } else {
                Uri parse = Uri.parse(aSCIIString);
                n.a("UserAnalyzerInterceptor.appendAnalyzeParams", "originalUri is : ", parse != null ? parse.toString() : "originalUri is null");
                Uri.Builder buildUpon = parse.buildUpon();
                String b = r.a().b();
                if (!TextUtils.isEmpty(b) && TextUtils.isEmpty(parse.getQueryParameter("LOGIN_IDEN_STRING"))) {
                    buildUpon.appendQueryParameter("LOGIN_IDEN_STRING", b);
                }
                if (!TextUtils.isEmpty(b) && TextUtils.isEmpty(parse.getQueryParameter("uuid"))) {
                    buildUpon.appendQueryParameter("uuid", b);
                }
                builder = buildUpon.toString();
            }
            ajVar = request.a().b(builder).a();
            th = null;
        } catch (Exception e) {
            n.a("UserAnalyzerInterceptor.intercept", "exception is : ", e.getMessage());
            th = new Throwable(e.getMessage());
            ajVar = null;
        }
        if (ajVar != null) {
            return aVar.a(ajVar);
        }
        throw new com.meituan.passport.exception.b(th);
    }
}
