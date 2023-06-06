package com.sankuai.titans.adapter.base.observers;

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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b956b27bb66070c988e09425f6156122", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b956b27bb66070c988e09425f6156122");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e3319e02030a6e0094029b7c42896090", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e3319e02030a6e0094029b7c42896090");
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3f242bacd0eafca003a0751bdf389ab6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3f242bacd0eafca003a0751bdf389ab6")).booleanValue();
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return !TextUtils.isEmpty(Uri.parse(str).getQueryParameter("token"));
    }
}
