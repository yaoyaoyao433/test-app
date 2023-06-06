package com.meituan.passport.interceptor;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.passport.PassportConfig;
import com.meituan.passport.utils.Utils;
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
public final class b implements Interceptor {
    public static ChangeQuickRedirect a;
    private static b b;
    private Context c;

    private b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4974b7804c6509506e0c725f14962558", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4974b7804c6509506e0c725f14962558");
        } else {
            this.c = context;
        }
    }

    public static synchronized b a(Context context) {
        synchronized (b.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b67e94f70d940c626f5d95c2ea8ec843", RobustBitConfig.DEFAULT_VALUE)) {
                return (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b67e94f70d940c626f5d95c2ea8ec843");
            }
            if (b == null) {
                b = new b(context);
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0bb0c0c312fa2c98ae15aea1586fb3c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0bb0c0c312fa2c98ae15aea1586fb3c");
        }
        try {
            aj request = aVar.request();
            String aSCIIString = t.e(request.b()).a().toASCIIString();
            Object[] objArr2 = {aSCIIString};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "61a5d2278dc64eb5e9877b0a83f35405", RobustBitConfig.DEFAULT_VALUE)) {
                builder = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "61a5d2278dc64eb5e9877b0a83f35405");
            } else if (aSCIIString == null) {
                n.a("NewCommonInfoInterceptor.appendAnalyzeParams", "uri is null", "");
                builder = null;
            } else {
                Uri parse = Uri.parse(aSCIIString);
                n.a("NewCommonInfoInterceptor.appendAnalyzeParams", "originalUri is : ", parse != null ? parse.toString() : "originalUri is null");
                Uri.Builder buildUpon = parse.buildUpon();
                if (TextUtils.isEmpty(parse.getQueryParameter("sdkVersion"))) {
                    buildUpon.appendQueryParameter("sdkVersion", "5.52.9.1-beta");
                }
                if (TextUtils.isEmpty(parse.getQueryParameter("joinkey"))) {
                    buildUpon.appendQueryParameter("joinkey", PassportConfig.m());
                }
                if (TextUtils.isEmpty(parse.getQueryParameter("packageName"))) {
                    buildUpon.appendQueryParameter("packageName", this.c != null ? this.c.getPackageName() : "");
                }
                if (TextUtils.isEmpty(parse.getQueryParameter("supportReopen"))) {
                    buildUpon.appendQueryParameter("supportReopen", "true");
                }
                if (TextUtils.isEmpty(parse.getQueryParameter("accessibility_enabled"))) {
                    buildUpon.appendQueryParameter("accessibility_enabled", String.valueOf(Utils.c()));
                }
                builder = buildUpon.toString();
            }
            ajVar = request.a().b(builder).a();
            th = null;
        } catch (Exception e) {
            n.a("NewCommonInfoInterceptor.intercept", "exception is : ", e.getMessage());
            th = new Throwable(e.getMessage());
            ajVar = null;
        }
        if (ajVar != null) {
            return aVar.a(ajVar);
        }
        throw new com.meituan.passport.exception.b(th);
    }
}
