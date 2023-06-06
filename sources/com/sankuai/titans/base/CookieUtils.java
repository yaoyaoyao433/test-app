package com.sankuai.titans.base;

import android.text.TextUtils;
import android.webkit.CookieManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.services.ICookieService;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CookieUtils {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static boolean setCookie(TitansCookie titansCookie) {
        CookieManager cookieManager;
        Set<String> domainSet;
        Object[] objArr = {titansCookie};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "bed953c13576bda5187bdeca902abf80", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "bed953c13576bda5187bdeca902abf80")).booleanValue();
        }
        if (titansCookie == null) {
            return false;
        }
        try {
            cookieManager = CookieManager.getInstance();
        } catch (Throwable th) {
            Titans.serviceManager().getStatisticsService().reportClassError("CookieUtils", "setCookie", th);
            cookieManager = null;
        }
        if (cookieManager == null || (domainSet = titansCookie.getDomainSet()) == null || domainSet.size() == 0) {
            return false;
        }
        for (String str : domainSet) {
            String formatCookieString = titansCookie.getFormatCookieString(str);
            if (!TextUtils.isEmpty(formatCookieString)) {
                try {
                    cookieManager.setCookie(str, formatCookieString);
                } catch (Throwable th2) {
                    HashMap hashMap = new HashMap();
                    hashMap.put("host", str);
                    hashMap.put("result", formatCookieString);
                    Titans.serviceManager().getStatisticsService().reportClassError("CookieUtils", "setCookie", th2, hashMap);
                }
            }
        }
        return true;
    }

    public static void writeCookie(ICookieService iCookieService, String str) {
        Set<String> supportKeys;
        Object[] objArr = {iCookieService, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e7ed2d76730d4f43c70033aee80c1dd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e7ed2d76730d4f43c70033aee80c1dd0");
        } else if (iCookieService != null && (supportKeys = iCookieService.getSupportKeys()) != null) {
            for (String str2 : supportKeys) {
                if (!TextUtils.isEmpty(str2)) {
                    String cookieValue = iCookieService.getCookieValue(str2);
                    if (!TextUtils.isEmpty(cookieValue)) {
                        if (ICookieService.EMPTY_COOKIE_TAG.equals(cookieValue)) {
                            cookieValue = "";
                        }
                        Set<String> supportDomains = iCookieService.getSupportDomains(str2);
                        if (supportDomains != null && supportDomains.size() != 0) {
                            TitansCookie titansCookie = new TitansCookie(str2, cookieValue, str);
                            titansCookie.setDomainSet(supportDomains);
                            titansCookie.setMaxAge(13848280);
                            if (!setCookie(titansCookie)) {
                                HashMap hashMap = new HashMap();
                                hashMap.put("domains", supportDomains);
                                hashMap.put("name", titansCookie.getName());
                                hashMap.put("value", titansCookie.getValue());
                                Titans.serviceManager().getStatisticsService().reportClassError("CookieUtils", "writeCookie", new Exception("Cookie值写入失败"), hashMap);
                            }
                        }
                    }
                }
            }
        }
    }

    public static void modifyCookie(ICookieService iCookieService, String str, Map<String, String> map) {
        Set<String> supportKeys;
        String str2;
        Set<String> supportDomains;
        Object[] objArr = {iCookieService, str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f0632d14d8cc26d733133b04d550cef0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f0632d14d8cc26d733133b04d550cef0");
        } else if (iCookieService != null && map != null && (supportKeys = iCookieService.getSupportKeys()) != null) {
            for (String str3 : map.keySet()) {
                if (!TextUtils.isEmpty(str3) && supportKeys.contains(str3) && (str2 = map.get(str3)) != null && (supportDomains = iCookieService.getSupportDomains(str3)) != null && supportDomains.size() != 0) {
                    TitansCookie titansCookie = new TitansCookie(str3, str2, str);
                    titansCookie.setDomainSet(supportDomains);
                    titansCookie.setMaxAge(13848280);
                    if (!setCookie(titansCookie)) {
                        System.out.print("Cookie值写入失败");
                    }
                }
            }
        }
    }
}
