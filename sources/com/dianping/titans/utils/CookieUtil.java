package com.dianping.titans.utils;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.dianping.titans.adapters.TitansCookie;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.net.HttpCookie;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class CookieUtil {
    public static final List<String> ALL_HOST = Arrays.asList(".meituan.com", ".maoyan.com", ".sankuai.com", ".dianping.com", ".51ping.com", ".sankuai.info", ".alpha.com", ".mobike.com", ".ipeen.com.tw", ".dper.com", ".jchunuo.com");
    private static final String COOKIE_FROM_SHARK = "shark";
    private static final String COOKIE_FROM_TITANS = "titans";
    public static ChangeQuickRedirect changeQuickRedirect;
    private static String tokenCookieKey;
    private static String uuidCookieKey;

    public static String getUuidCookieKey() {
        return uuidCookieKey;
    }

    public static void setUuidCookieKey(String str) {
        uuidCookieKey = str;
    }

    public static String getTokenCookieKey() {
        return tokenCookieKey;
    }

    public static void setTokenCookieKey(String str) {
        tokenCookieKey = str;
    }

    @Deprecated
    public static void setCookie(HttpCookie httpCookie) {
        Object[] objArr = {httpCookie};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "713daeccd60e1bd8a8d0b53cc70dee5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "713daeccd60e1bd8a8d0b53cc70dee5c");
        } else {
            setCookie(TitansCookie.getCookieFromHttpCookie("titans", httpCookie));
        }
    }

    public static void setCookie(TitansCookie titansCookie) {
        CookieManager cookieManager;
        String str;
        Object[] objArr = {titansCookie};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6f179ef61e5fb976bea38710b934dab2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6f179ef61e5fb976bea38710b934dab2");
        } else if (titansCookie != null) {
            try {
                cookieManager = CookieManager.getInstance();
            } catch (Throwable unused) {
                cookieManager = null;
            }
            if (cookieManager == null) {
                return;
            }
            List<String> domainList = titansCookie.getDomainList();
            if (domainList == null || domainList.size() == 0) {
                domainList = ALL_HOST;
            }
            String str2 = null;
            for (String str3 : domainList) {
                String formatCookieString = titansCookie.getFormatCookieString(str3);
                if (!TextUtils.isEmpty(formatCookieString)) {
                    try {
                        cookieManager.setCookie(str3, formatCookieString);
                    } catch (Throwable unused2) {
                    }
                }
                str2 = formatCookieString;
            }
            if ("shark".equals(titansCookie.getSource())) {
                return;
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", titansCookie.getSource());
                jSONObject.put("domainList", domainList);
                jSONObject.put("name", titansCookie.getName());
                jSONObject.put("value", str2);
                str = jSONObject.toString();
            } catch (Throwable th) {
                th.printStackTrace();
                str = null;
            }
            if (TextUtils.isEmpty(str)) {
                return;
            }
            TitansReporter.titansCookieActionLog(str);
        }
    }

    public static void setCookieForShark(HttpCookie httpCookie) {
        Object[] objArr = {httpCookie};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "dcd780916bd73b7beec48f606b1a1589", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "dcd780916bd73b7beec48f606b1a1589");
        } else {
            setCookie(TitansCookie.getCookieFromHttpCookie("shark", httpCookie));
        }
    }

    public static void setWebViewCookies(List<HttpCookie> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b030df3d74951811e1fe9327f014c0ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b030df3d74951811e1fe9327f014c0ca");
        } else if (list != null && list.size() > 0) {
            for (HttpCookie httpCookie : list) {
                setCookie(httpCookie);
            }
        }
    }

    public static void setWebViewCookiesForShark(List<HttpCookie> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3a8e00e4c7dcc6604e785433a6311449", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3a8e00e4c7dcc6604e785433a6311449");
        } else if (list != null && list.size() > 0) {
            for (HttpCookie httpCookie : list) {
                setCookieForShark(httpCookie);
            }
        }
    }
}
