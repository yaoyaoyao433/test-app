package com.sankuai.waimai.store.util;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class an {
    public static ChangeQuickRedirect a;

    public static String a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8dc123e2e27c46c251747f9d51a5a51d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8dc123e2e27c46c251747f9d51a5a51d") : a(str, str2, "");
    }

    private static String a(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect = a;
        Uri uri = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0bcbf4a7440bc3b786f002f541a6c166", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0bcbf4a7440bc3b786f002f541a6c166");
        }
        Object[] objArr2 = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "1b1cd26f3946df45a1f4da200fb2d5a2", RobustBitConfig.DEFAULT_VALUE)) {
            uri = (Uri) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "1b1cd26f3946df45a1f4da200fb2d5a2");
        } else if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            uri = Uri.parse(str);
        }
        if (uri == null) {
            return str3;
        }
        try {
            return uri.getQueryParameter(str2);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
            return str3;
        }
    }

    @NonNull
    public static Map<String, String> a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dfe0f515cf942ddbeb72d36e7e59fee6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dfe0f515cf942ddbeb72d36e7e59fee6");
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 2);
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    @NonNull
    public static Map<String, Object> b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "dafa9f9b5e64144cbe51e7a698b321fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "dafa9f9b5e64144cbe51e7a698b321fc");
        }
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        for (String str2 : str.split("&")) {
            String[] split = str2.split("=", 2);
            if (split.length == 2) {
                hashMap.put(split[0], split[1]);
            }
        }
        return hashMap;
    }

    public static String c(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "0ba079352da56375fc5967d5ba49283a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "0ba079352da56375fc5967d5ba49283a");
        }
        if (!TextUtils.isEmpty(str)) {
            try {
                return URLDecoder.decode(str, "utf-8");
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        return null;
    }

    public static String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "5b16c5b1958119259fcb4b1b8d8bd97f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "5b16c5b1958119259fcb4b1b8d8bd97f");
        }
        try {
            return URLEncoder.encode(String.valueOf(obj), "utf-8");
        } catch (UnsupportedEncodingException unused) {
            return String.valueOf(obj);
        }
    }
}
