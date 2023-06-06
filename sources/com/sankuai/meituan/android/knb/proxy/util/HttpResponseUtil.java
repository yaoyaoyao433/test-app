package com.sankuai.meituan.android.knb.proxy.util;

import android.text.TextUtils;
import android.webkit.CookieManager;
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
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class HttpResponseUtil {
    private static final String KEY_CONTENT_TYPE_HTML = "html";
    private static final String KEY_HEAD = "<head>";
    private static final String KEY_RESPONSE_CONTENT_TYPE = "Content-Type";
    private static final String KEY_SET_COOKIE = "Set-Cookie";
    private static final String METHOD_POST = "POST";
    private static final String REPLACE_HEAD = "<head><script src=\"//portal-portm.meituan.com/knb/inject/test.js\"></script>\n";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static volatile v sOkHttpClient;

    public static z executeHttp(Map<String, String> map, String str, String str2, y yVar, t tVar) throws Exception {
        Object[] objArr = {map, str, str2, yVar, tVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bc5cab64196f50c05174da125e60c233", RobustBitConfig.DEFAULT_VALUE)) {
            return (z) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bc5cab64196f50c05174da125e60c233");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cb1001afa7e3d6fe1889aed43d9ced42", RobustBitConfig.DEFAULT_VALUE)) {
            return (v) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cb1001afa7e3d6fe1889aed43d9ced42");
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

    public static Map<String, String> getHeaderMapAndSetCookies(z zVar, String str) {
        Object[] objArr = {zVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e38b1e9f352d85d7e0a527404eeb6f9a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e38b1e9f352d85d7e0a527404eeb6f9a");
        }
        HashMap hashMap = new HashMap();
        r rVar = zVar.f;
        if (rVar != null) {
            for (Map.Entry<String, List<String>> entry : rVar.d().entrySet()) {
                String key = entry.getKey();
                List<String> value = entry.getValue();
                if ("Set-Cookie".equals(key)) {
                    CookieManager cookieManager = CookieManager.getInstance();
                    for (String str2 : value) {
                        cookieManager.setCookie(str, str2);
                    }
                } else if (value != null && value.size() > 0) {
                    hashMap.put(key, value.get(0));
                }
            }
        }
        return hashMap;
    }

    public static boolean canReplaceHtmlHead(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a542fcfe67448a2ca829cfc7a677a3d7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a542fcfe67448a2ca829cfc7a677a3d7")).booleanValue();
        }
        if (zVar == null) {
            return false;
        }
        String a = zVar.a("Content-Type", null);
        return !TextUtils.isEmpty(a) && a.contains("html");
    }

    public static InputStream replaceHtmlHead(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fcfb1c3a1d5ab9c0fcf3306600f0d336", RobustBitConfig.DEFAULT_VALUE)) {
            return (InputStream) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fcfb1c3a1d5ab9c0fcf3306600f0d336");
        }
        try {
            String f = zVar.g.f();
            int indexOf = f.indexOf("<head>");
            if (indexOf < 0) {
                return new ByteArrayInputStream(f.getBytes());
            }
            int i = indexOf + 6;
            String substring = f.substring(0, indexOf);
            String substring2 = f.substring(i);
            return new ByteArrayInputStream((substring + "<head><script src=\"//portal-portm.meituan.com/knb/inject/test.js\"></script>\n" + substring2).getBytes());
        } catch (IOException unused) {
            return null;
        }
    }

    public static WebResponseMimeAndHeader buildWebResponseMimeAndHeader(z zVar) {
        Object[] objArr = {zVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7ab0ed36b8ab15f0a1e2841cabf8ff8", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResponseMimeAndHeader) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7ab0ed36b8ab15f0a1e2841cabf8ff8");
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
