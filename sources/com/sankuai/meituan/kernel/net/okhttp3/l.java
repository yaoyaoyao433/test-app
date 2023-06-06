package com.sankuai.meituan.kernel.net.okhttp3;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.utils.b;
import java.io.IOException;
import java.util.Map;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class l implements Interceptor {
    public static ChangeQuickRedirect a;
    private com.sankuai.meituan.kernel.net.report.a b;

    /* JADX WARN: Removed duplicated region for block: B:25:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x013f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01bd A[LOOP:0: B:81:0x01b7->B:83:0x01bd, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01f6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.meituan.kernel.net.okhttp3.l r34, okhttp3.Request r35, okhttp3.Response r36, byte[] r37, java.lang.String r38, int r39, int r40) throws java.lang.Exception {
        /*
            Method dump skipped, instructions count: 605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.kernel.net.okhttp3.l.a(com.sankuai.meituan.kernel.net.okhttp3.l, okhttp3.Request, okhttp3.Response, byte[], java.lang.String, int, int):void");
    }

    @Override // okhttp3.Interceptor
    public final Response intercept(Interceptor.Chain chain) throws IOException {
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "028650dc46a88e619386965f266da2d5", RobustBitConfig.DEFAULT_VALUE) ? (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "028650dc46a88e619386965f266da2d5") : a(chain);
    }

    private Response a(Interceptor.Chain chain) throws IOException {
        String str;
        byte[] bArr;
        Object[] objArr = {chain};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09eded495628814b0438806cf57e967a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Response) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09eded495628814b0438806cf57e967a");
        }
        long currentTimeMillis = System.currentTimeMillis();
        Request request = chain.request();
        if (this.b == null) {
            this.b = com.sankuai.meituan.kernel.net.report.a.a();
        }
        Request.Builder newBuilder = request.newBuilder();
        String header = request.header("catCmd");
        if (TextUtils.isEmpty(header)) {
            str = request.url().url().getHost() + request.url().url().getPath();
        } else {
            newBuilder.removeHeader("catCmd");
            str = header;
        }
        newBuilder.removeHeader("Cat_Extra").removeHeader("Crawler-Filter");
        final Request build = newBuilder.build();
        final Response proceed = chain.proceed(build);
        try {
            final byte[] bytes = proceed.body().bytes();
            Object[] objArr2 = {build, proceed, bytes, str, new Long(currentTimeMillis)};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            final String str2 = str;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "665aa3ad5ea04e5926cbe1e90dfc8680", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "665aa3ad5ea04e5926cbe1e90dfc8680");
                bArr = bytes;
            } else {
                final long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
                bArr = bytes;
                com.sankuai.meituan.kernel.net.utils.b.c().submit(new Runnable() { // from class: com.sankuai.meituan.kernel.net.okhttp3.l.1
                    public static ChangeQuickRedirect a;

                    @Override // java.lang.Runnable
                    public final void run() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "11857a9b63ae0f1ac2eed7e233f15a0a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "11857a9b63ae0f1ac2eed7e233f15a0a");
                            return;
                        }
                        int i = -1;
                        if (build != null && build.url() != null && build.url().url().getProtocol() != null) {
                            i = com.sankuai.meituan.kernel.net.utils.b.a(build.url().url().getProtocol());
                        }
                        try {
                            l.a(l.this, build, proceed, bytes, str2, (int) currentTimeMillis2, i);
                        } catch (Exception e) {
                            l.this.b.pv4(0L, str2, 0, i, d.a(e), 0, 0, 0, null, "report_error");
                        }
                    }
                });
            }
            return proceed.newBuilder().body(ResponseBody.create(proceed.body().contentType(), bArr)).build();
        } catch (OutOfMemoryError unused) {
            throw new b.C0596b();
        }
    }

    public static void a(JSONObject jSONObject) {
        Map<String, Object> e;
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "07453ff500d7b8f1fb8f2060a15fb1dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "07453ff500d7b8f1fb8f2060a15fb1dc");
            return;
        }
        com.meituan.android.httpdns.d a2 = com.meituan.android.httpdns.d.a();
        if (a2 == null || (e = a2.e()) == null) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry<String, Object> entry : e.entrySet()) {
            try {
                jSONObject2.put(entry.getKey(), entry.getValue());
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        try {
            jSONObject.put("dns_event", jSONObject2);
        } catch (JSONException e3) {
            e3.printStackTrace();
        }
        com.meituan.android.httpdns.d.b();
    }

    public static void a(JSONObject jSONObject, int i, String str, Request request, Response response) {
        String str2;
        Object[] objArr = {jSONObject, Integer.valueOf(i), str, request, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        String str3 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2a920ca472a41ec9bd32bb6cd2e65165", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2a920ca472a41ec9bd32bb6cd2e65165");
        } else if (request != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(request.url());
            Map<String, String> a2 = com.sankuai.meituan.kernel.net.utils.b.a("okhttp", i, str, sb.toString());
            if (a2 != null) {
                try {
                    for (Map.Entry<String, String> entry : a2.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            Object[] objArr2 = {request, response};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "aaa7446f14de1137d36cbeed9db4d154", RobustBitConfig.DEFAULT_VALUE)) {
                str2 = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "aaa7446f14de1137d36cbeed9db4d154");
            } else {
                if (request != null) {
                    str3 = request.header("M-TraceId");
                    if (TextUtils.isEmpty(str3) && response != null) {
                        str3 = response.header("M-TraceId");
                    }
                }
                str2 = str3;
            }
            jSONObject.put("M-TraceId", str2);
        }
    }

    public static boolean a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e9beca1fb0caa6c19fb5474b164a7c18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e9beca1fb0caa6c19fb5474b164a7c18")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.contains("grocery-mtapp.meituan.com") && (str.contains(Constants.PRIVACY.KEY_LATITUDE) || str.contains(Constants.PRIVACY.KEY_LONGITUDE))) {
            return true;
        }
        return str.contains("apimobile.meituan.com") && str.contains("latlng");
    }
}
