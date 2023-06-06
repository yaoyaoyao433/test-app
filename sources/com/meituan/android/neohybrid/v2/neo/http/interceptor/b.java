package com.meituan.android.neohybrid.v2.neo.http.interceptor;

import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.meituan.android.neohybrid.v2.neo.http.encrypt.b;
import com.meituan.android.paybase.utils.y;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.raw.b;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b extends a {
    public static ChangeQuickRedirect b;

    @Override // com.meituan.android.neohybrid.v2.neo.http.interceptor.a, com.sankuai.meituan.retrofit2.Interceptor
    public final /* bridge */ /* synthetic */ com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        return super.intercept(aVar);
    }

    @Override // com.meituan.android.neohybrid.v2.neo.http.interceptor.a
    public final com.sankuai.meituan.retrofit2.raw.b a(Interceptor.a aVar) throws IOException, com.meituan.android.neohybrid.exception.a {
        b.a aVar2;
        ap body;
        String b2;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8702f0542371425ab69bb87373d0fd5b", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8702f0542371425ab69bb87373d0fd5b");
        }
        aj request = aVar.request();
        if (com.meituan.android.neohybrid.v2.neo.http.c.a(request)) {
            return aVar.a(request);
        }
        String str = "";
        try {
            str = Uri.parse(request.b()).getPath();
        } catch (Exception e) {
            com.meituan.android.paybase.common.analyse.a.a(e, "NeoEncryptInterceptor_neoIntercept", (Map<String, Object>) null);
        }
        long currentTimeMillis = System.currentTimeMillis();
        try {
            aVar2 = com.meituan.android.neohybrid.v2.neo.http.encrypt.b.a(request.i());
        } catch (Exception unused) {
            aVar2 = null;
        }
        if (!TextUtils.isEmpty(str)) {
            y.e(str, System.currentTimeMillis() - currentTimeMillis);
        }
        if (aVar2 == null || !aVar2.a() || aVar2.f == null) {
            return aVar.a(request);
        }
        com.sankuai.meituan.retrofit2.raw.b a = aVar.a(request.a().a(aVar2.f).a());
        long currentTimeMillis2 = System.currentTimeMillis();
        try {
            try {
                String str2 = aVar2.b;
                ap body2 = a.body();
                Object[] objArr2 = {str2, body2};
                ChangeQuickRedirect changeQuickRedirect2 = com.meituan.android.neohybrid.v2.neo.http.encrypt.a.a;
                if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "38700590cd6aba4d334534133c4b1b0d", RobustBitConfig.DEFAULT_VALUE)) {
                    body = (ap) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "38700590cd6aba4d334534133c4b1b0d");
                } else if (TextUtils.isEmpty(str2) || body2 == null) {
                    throw new IOException("input params error: " + str2 + HiAnalyticsConstant.REPORT_VAL_SEPARATOR + body2);
                } else {
                    body = body2.newBuilder().a("application/json;charset=UTF-8").a(b2.getBytes().length).a(new ByteArrayInputStream(com.meituan.android.neohybrid.v2.neo.http.encrypt.a.b(str2, body2.string()).getBytes())).a();
                }
            } catch (Exception unused2) {
                body = a.body();
            }
            return new b.a().a(a.url()).a(a.code()).b(a.reason()).a(body).a();
        } finally {
            if (!TextUtils.isEmpty(str)) {
                y.f(str, System.currentTimeMillis() - currentTimeMillis2);
            }
        }
    }
}
