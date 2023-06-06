package com.sankuai.meituan.android.knb.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.bean.TitansConstants;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.net.URLDecoder;
import java.util.List;
import java.util.Locale;
import java.util.StringTokenizer;
import java.util.regex.Pattern;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class UriUtil {
    public static final Pattern DOMAIN_PATTERN = Pattern.compile("^(\\.)?[a-zA-Z0-9][-a-zA-Z0-9]{0,62}(\\.[a-zA-Z0-9][-a-zA-Z0-9]{0,62})+$");
    public static final String KEY_ORIGINAL_URI = "_k_k_o_u_";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void fillQueryParameterInBundle(Uri uri, Bundle bundle) {
        int i = 0;
        Object[] objArr = {uri, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "1d7a69bce2e5e004b6c5e0c16b5f3750", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "1d7a69bce2e5e004b6c5e0c16b5f3750");
        } else if (uri == null || uri.isOpaque() || bundle == null) {
        } else {
            bundle.putString("_k_k_o_u_", uri.toString());
            String encodedQuery = uri.getEncodedQuery();
            if (TextUtils.isEmpty(encodedQuery)) {
                return;
            }
            int length = encodedQuery.length();
            while (true) {
                int indexOf = encodedQuery.indexOf(38, i);
                int i2 = indexOf != -1 ? indexOf : length;
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > i2 || indexOf2 == -1) {
                    indexOf2 = i2;
                }
                if (indexOf2 > i) {
                    String substring = encodedQuery.substring(i, indexOf2);
                    String substring2 = indexOf2 == i2 ? "" : encodedQuery.substring(indexOf2 + 1, i2);
                    String decode = Uri.decode(substring);
                    if (!bundle.containsKey(decode)) {
                        bundle.putString(decode, Uri.decode(substring2));
                    }
                }
                if (indexOf == -1) {
                    return;
                }
                i = indexOf + 1;
            }
        }
    }

    public static String clearQueryAndFragment(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e933a27d2c5e07a08f8e59842e9431db", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e933a27d2c5e07a08f8e59842e9431db") : str == null ? "" : clearQueryAndFragment(Uri.parse(str));
    }

    public static String clearQueryAndFragment(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bcc6e7290e0543bf420df03060431b9c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bcc6e7290e0543bf420df03060431b9c");
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

    public static String clearScheme(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "85c8c8b3ab3aaa6221247b6819a3e71c", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "85c8c8b3ab3aaa6221247b6819a3e71c");
        }
        if (str == null) {
            return "";
        }
        int indexOf = str.indexOf("://");
        return indexOf != -1 ? str.substring(indexOf + 3) : str;
    }

    public static boolean hostEndWith(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "cde5492d284e76ef65a7982331ddb5cc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "cde5492d284e76ef65a7982331ddb5cc")).booleanValue();
        }
        if (TextUtils.isEmpty(str) || list == null || list.size() == 0 || str.startsWith(TitansConstants.JS_SCHEMA) || str.toLowerCase().startsWith(TitansConstants.JAVASCRIPT_PREFIX)) {
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
        for (String str2 : list) {
            if (isHostBelongToDomain(lowerCase, str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isHostBelongToDomain(@NonNull String str, @NonNull String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a8749933d6f2584def4a36016dc3bbaa", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a8749933d6f2584def4a36016dc3bbaa")).booleanValue();
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

    public static boolean equalsWithHostAndPath(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2a5965c8804f6e9a13d8f4224ef7f504", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2a5965c8804f6e9a13d8f4224ef7f504")).booleanValue();
        }
        try {
            if (!TextUtils.isEmpty(str) && list != null && list.size() != 0) {
                Uri parse = Uri.parse(str);
                String host = parse.getHost();
                if (TextUtils.isEmpty(host)) {
                    return false;
                }
                StringBuilder sb = new StringBuilder(host);
                String path = parse.getPath();
                if (!TextUtils.isEmpty(path)) {
                    sb.append(path);
                }
                return list.contains(sb.toString());
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static String[] stringSplit(String str, String str2) {
        int i = 0;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "023018fd7ecfc9729d00094ad9278bd1", RobustBitConfig.DEFAULT_VALUE)) {
            return (String[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "023018fd7ecfc9729d00094ad9278bd1");
        }
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        StringTokenizer stringTokenizer = new StringTokenizer(str, str2, false);
        String[] strArr = new String[stringTokenizer.countTokens()];
        while (stringTokenizer.hasMoreElements()) {
            strArr[i] = stringTokenizer.nextToken();
            i++;
        }
        return strArr;
    }

    public static String guessFileName(String str, String str2, String str3) {
        String valueOf;
        String valueOf2;
        String[] stringSplit;
        String[] stringSplit2;
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        String str4 = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e2daa4496c23bceff6172c5dfca189d3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e2daa4496c23bceff6172c5dfca189d3");
        }
        try {
            if (!TextUtils.isEmpty(str2) && (stringSplit = stringSplit(str2, ";")) != null) {
                int i = 0;
                while (true) {
                    if (i >= stringSplit.length) {
                        break;
                    }
                    if (stringSplit[i] != null && stringSplit[i].contains(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME) && (stringSplit2 = stringSplit(stringSplit[i].trim(), "=")) != null) {
                        String replace = stringSplit2[0].replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
                        String replace2 = stringSplit2[1].replace(CommonConstant.Symbol.DOUBLE_QUOTES, "");
                        if (!TextUtils.isEmpty(stringSplit2[1]) && TextUtils.equals(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_FILENAME, replace) && !TextUtils.isEmpty(replace2)) {
                            str4 = replace2;
                            break;
                        }
                    }
                    i++;
                }
            }
            if (TextUtils.isEmpty(str4)) {
                String decode = URLDecoder.decode(str, "utf-8");
                int lastIndexOf = decode.lastIndexOf(47);
                if (lastIndexOf > 0 && lastIndexOf < decode.length() - 1) {
                    valueOf = decode.substring(lastIndexOf + 1);
                    try {
                        int indexOf = valueOf.indexOf(CommonConstant.Symbol.QUESTION_MARK);
                        if (indexOf > 0) {
                            if (indexOf < valueOf.length() - 1) {
                                valueOf2 = valueOf.substring(0, indexOf);
                            } else {
                                valueOf2 = String.valueOf(System.currentTimeMillis());
                            }
                            str4 = valueOf2;
                        }
                    } catch (Exception unused) {
                        return valueOf;
                    }
                } else {
                    valueOf = String.valueOf(System.currentTimeMillis());
                }
                str4 = valueOf;
            }
            if (str4.indexOf(CommonConstant.Symbol.DOT) < 0) {
                String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str3);
                if (!TextUtils.isEmpty(extensionFromMimeType)) {
                    str4 = str4 + CommonConstant.Symbol.DOT + extensionFromMimeType;
                }
            }
            return URLDecoder.decode(str4, "UTF-8");
        } catch (Exception unused2) {
            return str4;
        }
    }

    public static final String filterQueryParams(String str, List<String> list) {
        Object[] objArr = {str, list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "993608945c3d3f3532e9dd304d9f8d3e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "993608945c3d3f3532e9dd304d9f8d3e");
        }
        if (str == null) {
            return "";
        }
        if (list == null || list.size() == 0) {
            return str;
        }
        try {
            Uri parse = Uri.parse(str);
            if (parse.isOpaque()) {
                return str;
            }
            Uri.Builder buildUpon = Uri.parse(clearQueryAndFragment(parse)).buildUpon();
            for (int i = 0; i < list.size(); i++) {
                String str2 = list.get(i);
                String queryParameter = parse.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    buildUpon.appendQueryParameter(str2, queryParameter);
                }
            }
            return buildUpon.toString();
        } catch (Throwable unused) {
            return str;
        }
    }

    public static boolean isUriParamEquals(Uri uri, String str, String str2) {
        Object[] objArr = {uri, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bbc39a755095efff4b397a5b5685b3e9", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bbc39a755095efff4b397a5b5685b3e9")).booleanValue();
        }
        if (uri == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !uri.isHierarchical()) {
            return false;
        }
        return str2.equals(uri.getQueryParameter(str));
    }

    public static boolean useStartActivity(Context context, Uri uri) {
        Object[] objArr = {context, uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "87d908b9b8275fae89302ceb66d85078", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "87d908b9b8275fae89302ceb66d85078")).booleanValue();
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", uri);
            intent.setPackage(context.getPackageName());
            ResolveInfo resolveActivity = context.getPackageManager().resolveActivity(intent, 1);
            if (resolveActivity != null) {
                if (resolveActivity.activityInfo.launchMode == 2) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
