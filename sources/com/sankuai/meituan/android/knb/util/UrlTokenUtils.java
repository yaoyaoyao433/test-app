package com.sankuai.meituan.android.knb.util;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UrlTokenUtils {
    private static final String TOKEN_KEY = "token";
    public static ChangeQuickRedirect changeQuickRedirect;

    private static Uri removeUriParameter(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ecaa42940c32237a649a277be299e298", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ecaa42940c32237a649a277be299e298");
        }
        Set<String> queryParameterNames = uri.getQueryParameterNames();
        if (queryParameterNames == null || queryParameterNames.isEmpty() || !queryParameterNames.contains(str)) {
            return uri;
        }
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : queryParameterNames) {
            if (!str.equals(str2)) {
                clearQuery.appendQueryParameter(str2, uri.getQueryParameter(str2));
            }
        }
        return clearQuery.build();
    }

    public static String removeTokenInUrl(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "790c4ba1a8e0f05b1e4be394c39bed0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "790c4ba1a8e0f05b1e4be394c39bed0a");
        }
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return removeUriParameter(Uri.parse(str), "token").toString();
        } catch (Exception unused) {
            return str;
        }
    }

    public static boolean containTokenInUrlQuery(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5902ec7d40af254b87faf88a3bc68b6b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5902ec7d40af254b87faf88a3bc68b6b")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("token"));
    }
}
