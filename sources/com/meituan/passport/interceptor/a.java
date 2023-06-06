package com.meituan.passport.interceptor;

import android.net.Uri;
import android.text.TextUtils;
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
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;
    private static a b;

    public static synchronized a a() {
        synchronized (a.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "aa2ad8d93fc80b845e64a6cec74839dc", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "aa2ad8d93fc80b845e64a6cec74839dc");
            }
            if (b == null) {
                b = new a();
            }
            return b;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        Throwable th;
        aj ajVar;
        String builder;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "45d0ead5bef786d5a5bba8a10f71fb37", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "45d0ead5bef786d5a5bba8a10f71fb37");
        }
        try {
            aj request = aVar.request();
            String aSCIIString = t.e(request.b()).a().toASCIIString();
            Object[] objArr2 = {aSCIIString};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a399468884c3dbfb06024614d4f58e2f", RobustBitConfig.DEFAULT_VALUE)) {
                builder = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a399468884c3dbfb06024614d4f58e2f");
            } else if (aSCIIString == null) {
                n.a("CommonInfoInterceptor.appendAnalyzeParams", "uri is null", "");
                builder = null;
            } else {
                Uri parse = Uri.parse(aSCIIString);
                n.a("CommonInfoInterceptor.appendAnalyzeParams", "originalUri is : ", parse != null ? parse.toString() : "originalUri is null");
                Uri.Builder buildUpon = parse.buildUpon();
                if (TextUtils.isEmpty(parse.getQueryParameter("utm_medium"))) {
                    buildUpon.appendQueryParameter("utm_medium", "android");
                }
                com.meituan.passport.service.e a2 = com.meituan.passport.service.e.a();
                a2.a(com.meituan.android.singleton.b.a());
                if (TextUtils.isEmpty(parse.getQueryParameter("utm_term")) && a2.e && a2.b != -1) {
                    buildUpon.appendQueryParameter("utm_term", String.valueOf(a2.b));
                }
                if (TextUtils.isEmpty(parse.getQueryParameter("version_name")) && a2.e && !TextUtils.isEmpty(a2.c)) {
                    buildUpon.appendQueryParameter("version_name", a2.c);
                }
                builder = buildUpon.toString();
            }
            ajVar = request.a().b(builder).a();
            th = null;
        } catch (Exception e) {
            n.a("CommonInfoInterceptor.intercept", "exception is : ", e.getMessage());
            th = new Throwable(e.getMessage());
            ajVar = null;
        }
        if (ajVar != null) {
            return aVar.a(ajVar);
        }
        throw new com.meituan.passport.exception.b(th);
    }
}
