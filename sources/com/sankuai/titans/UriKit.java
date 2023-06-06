package com.sankuai.titans;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class UriKit {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean isScheme(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fe6690192b65c318c1c42928ee95991d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fe6690192b65c318c1c42928ee95991d")).booleanValue();
        }
        if (uri == null) {
            return false;
        }
        String scheme = uri.getScheme();
        if (str == null || scheme == null) {
            return false;
        }
        return str.toLowerCase().equals(scheme.toLowerCase());
    }

    public static boolean isSchemeHTTPOrHTTPS(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8dbf5893e03c3b2b1bc57edfedf92f3e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8dbf5893e03c3b2b1bc57edfedf92f3e")).booleanValue() : isScheme(uri, "http") || isScheme(uri, "https");
    }

    public static boolean isSchemeBridge(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "769c2844b87d50f8b048077ac057f3b3", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "769c2844b87d50f8b048077ac057f3b3")).booleanValue() : isScheme(uri, "js");
    }

    public static boolean isSchemeMedia(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "13c22d4968ab7b4e86844ba46b29990e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "13c22d4968ab7b4e86844ba46b29990e")).booleanValue() : isScheme(uri, "knb-media");
    }

    public static boolean isAboutBlank(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "d7d06850ba9177c6912b8368b519f540", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "d7d06850ba9177c6912b8368b519f540")).booleanValue() : uri.toString().equals("about:blank");
    }

    public static boolean isLocalHost(Uri uri) {
        String host;
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "fae2cc9bcbaa0e1d273982cc6fb8d406", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "fae2cc9bcbaa0e1d273982cc6fb8d406")).booleanValue();
        }
        if (uri == null || (host = uri.getHost()) == null) {
            return false;
        }
        return "localhost".equals(host.toLowerCase());
    }

    public static boolean matchHost(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "113769da5c2b1eb76a464cae9db01295", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "113769da5c2b1eb76a464cae9db01295")).booleanValue();
        }
        if (uri == null || str == null || str.length() == 0) {
            return false;
        }
        String host = uri.getHost();
        if (str.equals(host)) {
            return true;
        }
        if (str.charAt(0) != '.') {
            str = CommonConstant.Symbol.DOT + str;
        }
        return host.endsWith(str);
    }

    public static Uri setScheme(Uri uri, String str) {
        Object[] objArr = {uri, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "96dc80bab71b128f239c08863e26a908", RobustBitConfig.DEFAULT_VALUE)) {
            return (Uri) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "96dc80bab71b128f239c08863e26a908");
        }
        if (uri == null) {
            return null;
        }
        return uri.buildUpon().scheme(str).build();
    }

    public static String basicURLString(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5c07debdfd4824ac94107f9ded4faf1b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5c07debdfd4824ac94107f9ded4faf1b");
        }
        if (uri == null) {
            return "";
        }
        List<String> queryWhiteList = EventReporter.getInstance().getQueryWhiteList();
        StringBuilder sb = new StringBuilder();
        sb.append(pureBasicURLString(uri));
        String str = "";
        if (uri.isHierarchical() && queryWhiteList.size() > 0) {
            StringBuilder sb2 = new StringBuilder();
            for (int i = 0; i < queryWhiteList.size(); i++) {
                String str2 = queryWhiteList.get(i);
                String queryParameter = uri.getQueryParameter(str2);
                if (!TextUtils.isEmpty(queryParameter)) {
                    sb2.append(str2);
                    sb2.append("=");
                    sb2.append(queryParameter);
                    sb2.append("&");
                }
            }
            if (sb2.length() > 0) {
                sb2.deleteCharAt(sb2.length() - 1);
            }
            str = sb2.toString();
        }
        if (str.length() > 0) {
            sb.append(CommonConstant.Symbol.QUESTION_MARK);
            sb.append(str);
        }
        return sb.toString();
    }

    public static String pureBasicURLString(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9bc2ce1520e59aa0d1b5038699226605", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9bc2ce1520e59aa0d1b5038699226605");
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

    public static String onlyHostPathString(Uri uri) {
        Object[] objArr = {uri};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dc9ce85aec6fc60cec0351cf76690b29", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dc9ce85aec6fc60cec0351cf76690b29");
        }
        if (uri == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        if (uri.isOpaque()) {
            sb.append(uri.getEncodedSchemeSpecificPart());
        } else {
            String encodedAuthority = uri.getEncodedAuthority();
            if (encodedAuthority != null) {
                sb.append(encodedAuthority);
            }
        }
        return sb.toString();
    }
}
