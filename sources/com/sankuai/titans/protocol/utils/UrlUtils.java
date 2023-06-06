package com.sankuai.titans.protocol.utils;

import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import java.util.Locale;
import java.util.Set;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UrlUtils {
    public static final Pattern DOMAIN_PATTERN = Pattern.compile("^(\\.)?[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+$");
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String clearQueryAndFragment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba6b328e7dd28acf0810ce62512ae7c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba6b328e7dd28acf0810ce62512ae7c2") : str == null ? "" : clearQueryAndFragment(Uri.parse(str));
    }

    public static String clearQueryAndFragment(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6d124d7e7b4aace1f11836d3f65d5532", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6d124d7e7b4aace1f11836d3f65d5532");
        }
        if (uri == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        if (scheme != null) {
            sb.append(scheme);
            sb.append(CommonConstant.Symbol.COLON);
        }
        if (uri.isOpaque()) {
            sb.append(uri.getEncodedSchemeSpecificPart());
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            if (encodedAuthority != null) {
                sb.append("//");
                sb.append(encodedAuthority);
            }
            String encodedPath = uri.getEncodedPath();
            if (encodedPath != null) {
                sb.append(encodedPath);
            }
        }
        return sb.toString();
    }

    public static boolean hostEndWith(String str, Set<String> set) {
        Object[] objArr = {str, set};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e327363c5ac60431ac64a2a799a4c800", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e327363c5ac60431ac64a2a799a4c800")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || set == null || set.size() == 0 || str.startsWith(TitansConstants.JS_SCHEMA) || str.toLowerCase().startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
            return false;
        }
        String host = Uri.parse(str).getHost();
        if (TextUtils.isEmpty(host)) {
            return false;
        }
        int indexOf = host.indexOf(47);
        if (indexOf < 0) {
            indexOf = host.indexOf(92);
        }
        if (indexOf > 0) {
            host = host.substring(0, indexOf);
        }
        String lowerCase = host.toLowerCase(Locale.getDefault());
        for (String str2 : set) {
            if (isHostBelongToDomain(lowerCase, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHostBelongToDomain(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c635e0a32ea30c46ab7f2b3a8461a9d6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c635e0a32ea30c46ab7f2b3a8461a9d6")).booleanValue();
        }
        String lowerCase = str.toLowerCase(Locale.getDefault());
        String lowerCase2 = str2.toLowerCase(Locale.getDefault());
        if (DOMAIN_PATTERN.matcher(lowerCase2).find()) {
            if (lowerCase2.startsWith(CommonConstant.Symbol.DOT)) {
                return lowerCase.endsWith(lowerCase2);
            }
            if (!lowerCase.equals(lowerCase2)) {
                if (!lowerCase.endsWith(CommonConstant.Symbol.DOT + lowerCase2)) {
                    return false;
                }
            }
            return true;
        }
        return lowerCase.equals(lowerCase2);
    }
}
