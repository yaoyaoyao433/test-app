package com.meituan.passport.interceptor;

import android.text.TextUtils;
import com.dianping.titans.utils.Constants;
import com.meituan.android.common.mtguard.MTGuard;
import com.meituan.passport.utils.m;
import com.meituan.passport.utils.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ak;
import com.sankuai.meituan.retrofit2.al;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class d implements Interceptor {
    public static ChangeQuickRedirect a;
    private static d b;

    public static synchronized d a() {
        synchronized (d.class) {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "003f8010ea14ebfaafb10c3a0f160efc", RobustBitConfig.DEFAULT_VALUE)) {
                return (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "003f8010ea14ebfaafb10c3a0f160efc");
            }
            if (b == null) {
                b = new d();
            }
            return b;
        }
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        String str;
        String str2;
        String str3;
        aj ajVar;
        byte[] bArr;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4338307fec17d80a635c513c7c0f27de", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4338307fec17d80a635c513c7c0f27de");
        }
        aj request = aVar.request();
        try {
            Object[] objArr2 = {request};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5cad5b86d54901112b5a513367f76589", RobustBitConfig.DEFAULT_VALUE)) {
                ajVar = (aj) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5cad5b86d54901112b5a513367f76589");
            } else {
                if (request.d() != null) {
                    String a2 = request.a("User-Agent");
                    str = request.a("Content-Encoding");
                    str2 = request.a("Content-Type");
                    str3 = a2;
                } else {
                    str = null;
                    str2 = null;
                    str3 = null;
                }
                if (TextUtils.isEmpty(str)) {
                    str = "";
                }
                String str4 = str;
                if (TextUtils.isEmpty(str2)) {
                    str2 = Constants.MIME_TYPE_HTML;
                }
                String str5 = str2;
                ak i = request.i();
                if (i != null) {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    i.writeTo(byteArrayOutputStream);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    byteArrayOutputStream.close();
                    aj.a a3 = request.a();
                    a3.a(al.a(byteArray, i.contentType()));
                    ajVar = a3.a();
                    bArr = byteArray;
                } else {
                    ajVar = request;
                    bArr = null;
                }
                Map<String, String> requestSignatureForBabelV4 = MTGuard.requestSignatureForBabelV4(ajVar.c(), ajVar.b(), str3, str4, str5, bArr);
                if (requestSignatureForBabelV4 != null && requestSignatureForBabelV4.size() != 0) {
                    aj.a a4 = ajVar.a();
                    for (Map.Entry<String, String> entry : requestSignatureForBabelV4.entrySet()) {
                        String key = entry.getKey();
                        String value = entry.getValue();
                        a4.b(key, value);
                        n.a("SignatureInterceptor.processRequest", "mtgsig key=" + key + ",mtgsig value=" + value, "");
                    }
                    ajVar = a4.a();
                }
                n.a("SignatureInterceptor.processRequest", "mtgsig is null", "");
            }
            request = ajVar;
        } catch (Exception e) {
            n.a("SignatureInterceptor.intercept", "exception is : ", e.getMessage());
            m.a(e);
        }
        return aVar.a(request);
    }
}
