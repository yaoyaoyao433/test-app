package com.sankuai.titans.proxy.util;

import android.net.Uri;
import android.support.annotation.RequiresApi;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class WebResourceRequestUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    @RequiresApi(api = 21)
    public static WebResourceRequestAnalysisHeaderData analysisHeader(WebResourceRequest webResourceRequest) {
        String replaceAll;
        int indexOf;
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ed4c44c04fadc53507245989930eafb1", RobustBitConfig.DEFAULT_VALUE)) {
            return (WebResourceRequestAnalysisHeaderData) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ed4c44c04fadc53507245989930eafb1");
        }
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        Iterator<Map.Entry<String, String>> it = requestHeaders.entrySet().iterator();
        String str = "";
        String str2 = "text/plain";
        boolean z = true;
        boolean z2 = false;
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            String key = next.getKey();
            if ("Cookie".equalsIgnoreCase(key)) {
                z = false;
            } else if ("X-TitansX-Body".equalsIgnoreCase(key)) {
                str = Uri.decode(next.getValue());
                it.remove();
            } else if ("Access-Control-Request-Headers".equalsIgnoreCase(key)) {
                String value = next.getValue();
                if (!TextUtils.isEmpty(value) && (indexOf = (replaceAll = value.toLowerCase().replaceAll("\\s*", "")).indexOf("X-TitansX-Body".toLowerCase(Locale.ROOT))) != -1) {
                    int length = replaceAll.length();
                    if (length == 14) {
                        it.remove();
                    } else if (indexOf == 0) {
                        next.setValue(replaceAll.substring(15));
                    } else {
                        int i = indexOf + 14;
                        if (i == length) {
                            next.setValue(replaceAll.substring(0, indexOf));
                        } else {
                            next.setValue(replaceAll.substring(0, indexOf - 1) + replaceAll.substring(i, length));
                        }
                    }
                    z2 = true;
                }
            } else if ("Content-Type".equalsIgnoreCase(key)) {
                str2 = next.getValue();
            }
        }
        if (z) {
            String cookie = CookieManager.getInstance().getCookie(webResourceRequest.getUrl().toString());
            if (!TextUtils.isEmpty(cookie)) {
                requestHeaders.put("Cookie", cookie);
            }
        }
        WebResourceRequestAnalysisHeaderData webResourceRequestAnalysisHeaderData = new WebResourceRequestAnalysisHeaderData();
        webResourceRequestAnalysisHeaderData.addAccessControlHeaderToResponse = z2;
        webResourceRequestAnalysisHeaderData.body = str;
        webResourceRequestAnalysisHeaderData.contentType = str2;
        webResourceRequestAnalysisHeaderData.requestHeaders = requestHeaders;
        return webResourceRequestAnalysisHeaderData;
    }

    @RequiresApi(api = 21)
    public static Map<String, String> buildOptionResponseHeader(WebResourceRequest webResourceRequest) {
        Object[] objArr = {webResourceRequest};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ebbe100e83edaa0d74db420bb9fa54cc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ebbe100e83edaa0d74db420bb9fa54cc");
        }
        if (Constants.KEY_METHOD_OPTIONS.equalsIgnoreCase(webResourceRequest.getMethod())) {
            Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
            HashMap hashMap = new HashMap();
            hashMap.put("Access-Control-Allow-Origin", requestHeaders.get(Constants.KEY_ORIGIN));
            hashMap.put("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE, PUT");
            hashMap.put("Access-Control-Allow-Headers", requestHeaders.get("Access-Control-Request-Headers"));
            hashMap.put("Access-Control-Allow-Credentials", "true");
            return hashMap;
        }
        return null;
    }
}
