package com.sankuai.titans.proxy.util;

import android.text.TextUtils;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.launcher.util.aop.b;
import com.squareup.okhttp.r;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.y;
import com.squareup.okhttp.z;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class HttpResponseUtil {
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile v sOkHttpClient;

    public static z executeHttp(Map<String, String> map, String str, String str2, y yVar, t tVar) throws Exception {
        Object[] objArr = {map, str, str2, yVar, tVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "afa8bb9b2a255b9cd19e4b98e582e5bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "afa8bb9b2a255b9cd19e4b98e582e5bf");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        r.a aVar = new r.a();
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                aVar.a(entry.getKey(), entry.getValue());
            }
        }
        x.a a = new x.a().a(aVar.a()).a(str);
        if ("POST".equalsIgnoreCase(str2)) {
            a.a(str2, yVar);
        } else {
            a.a(str2, (y) null);
        }
        if (tVar != null) {
            getsOkHttpClient().g.add(tVar);
        }
        z a2 = getsOkHttpClient().a(a.a()).a();
        if (tVar != null) {
            getsOkHttpClient().g.remove(tVar);
        }
        return a2;
    }

    private static v getsOkHttpClient() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "338ea5d518e740565161e3f492b728d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "338ea5d518e740565161e3f492b728d2");
        }
        if (sOkHttpClient == null) {
            synchronized (HttpResponseUtil.class) {
                if (sOkHttpClient == null) {
                    v vVar = new v();
                    OkHttp2Wrapper.addInterceptorToClient(vVar);
                    sOkHttpClient = b.a(vVar);
                }
            }
        }
        return sOkHttpClient;
    }

    public static WebResponseMimeAndHeader buildWebResponseMimeAndHeader(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "21441ebd2d1ffb989be4474fa6f0fad1", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResponseMimeAndHeader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "21441ebd2d1ffb989be4474fa6f0fad1");
        }
        r rVar = zVar.f;
        HashMap hashMap = new HashMap();
        String str = "text/plain";
        for (int i = 0; i < rVar.a.length / 2; i++) {
            String a = rVar.a(i);
            String b = rVar.b(i);
            if ("Access-Control-Allow-Origin".toLowerCase().equals(a)) {
                hashMap.put("Access-Control-Allow-Origin", b);
            } else if ("Access-Control-Allow-Methods".toLowerCase().equals(a)) {
                hashMap.put("Access-Control-Allow-Methods", b);
            } else if ("Access-Control-Allow-Headers".toLowerCase().equals(a)) {
                hashMap.put("Access-Control-Allow-Headers", b);
            } else if ("Access-Control-Allow-Credentials".toLowerCase().equals(a)) {
                hashMap.put("Access-Control-Allow-Credentials", b);
            } else {
                hashMap.put(a, b);
            }
            if ("Content-Type".equalsIgnoreCase(a) && !TextUtils.isEmpty(b)) {
                int indexOf = b.indexOf(";");
                str = indexOf > 0 ? b.substring(0, indexOf) : b;
            }
        }
        WebResponseMimeAndHeader webResponseMimeAndHeader = new WebResponseMimeAndHeader();
        webResponseMimeAndHeader.setMime(str);
        webResponseMimeAndHeader.setHeadersMap(hashMap);
        return webResponseMimeAndHeader;
    }
}
