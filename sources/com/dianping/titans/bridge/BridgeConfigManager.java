package com.dianping.titans.bridge;

import android.content.Context;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.util.UriUtil;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class BridgeConfigManager {
    private static final String DEVICE_LEVEL_DEFAULT = "UN_KNOW";
    private static IBridgeConfig bridgeConfig;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final List<String> URI_PREFIX = Arrays.asList("tel", "geo", "mailto", "imeituan", "meituanpayment", UserCenter.OAUTH_TYPE_WEIXIN, "mqqapi", "alipay", "alipays", "mttower", "wtloginmqq", "qqmap", "bizmeituan", "baidumap", "iosamap", "comgooglemaps", "paesuperbank", "meituanwaimai", "market", "dianping", "mobike", "yoda");
    private static final List<String> DEFAULT_WHITE_LIST = Arrays.asList(".dianping.com", ".dpfile.com", ".alpha.dp", ".dper.com", ".kuxun.cn", ".meituan.com", ".meituan.net", ".sankuai.com", ".maoyan.com", ".zhenguo.com", ".mobike.io", ".mobike.com", ".51ping.com", ".neixin.cn");

    public static void setBridgeConfig(IBridgeConfig iBridgeConfig) {
        bridgeConfig = iBridgeConfig;
    }

    public static boolean isSchemeInWhite(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7e093f20bba1bfffa35dfee77d13895d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7e093f20bba1bfffa35dfee77d13895d")).booleanValue();
        }
        if (bridgeConfig == null) {
            return URI_PREFIX.contains(str);
        }
        return bridgeConfig.isSchemeInWhite(str);
    }

    public static String getIMEI(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ea778897397681b5ca95f985db241797", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ea778897397681b5ca95f985db241797") : bridgeConfig == null ? "" : bridgeConfig.imei(context);
    }

    public static String getMac(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2eb62ad132dbc30d108e0f0406e55a22", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2eb62ad132dbc30d108e0f0406e55a22") : bridgeConfig == null ? "" : bridgeConfig.mac(context);
    }

    public static String getKNBAppId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "35fd4920c329afcc4a52dadaa9d120c2", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "35fd4920c329afcc4a52dadaa9d120c2") : bridgeConfig == null ? "" : bridgeConfig.knbAppid();
    }

    public static String getScheme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4ccf4202a853b34f6bc2b405d702ea02", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4ccf4202a853b34f6bc2b405d702ea02") : bridgeConfig == null ? "" : bridgeConfig.scheme();
    }

    public static String getInnerUrlKey() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "27359f1942fa990102efb021daedd495", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "27359f1942fa990102efb021daedd495") : bridgeConfig == null ? "" : bridgeConfig.innerUrlKey();
    }

    public static Map<String, String> getAppInfoExtra() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3981d3100701aeaf39793291bf804015", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3981d3100701aeaf39793291bf804015");
        }
        if (bridgeConfig == null) {
            return null;
        }
        return bridgeConfig.appInfoExtra();
    }

    public static String getWxId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "86f06c77af5e8bb98f8091bf33fce927", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "86f06c77af5e8bb98f8091bf33fce927") : bridgeConfig == null ? "" : bridgeConfig.wxId();
    }

    public static int getCatId() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "76f74e39befd061d3f5f87aabd491055", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "76f74e39befd061d3f5f87aabd491055")).intValue();
        }
        if (bridgeConfig == null) {
            return 0;
        }
        return bridgeConfig.catId();
    }

    public static boolean isDebug() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "98746be80e6dd5c38219f064458d54c1", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "98746be80e6dd5c38219f064458d54c1")).booleanValue();
        }
        if (bridgeConfig == null) {
            return false;
        }
        return bridgeConfig.isDebug();
    }

    public static boolean isAccessWhite(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2df5599b50339c7497e9edeadfc9cbae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2df5599b50339c7497e9edeadfc9cbae")).booleanValue();
        }
        if (bridgeConfig == null) {
            return UriUtil.hostEndWith(str, DEFAULT_WHITE_LIST);
        }
        return bridgeConfig.isAccessWhite(str);
    }

    public static String getUserToken() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4cfd85e307ba275d93d84ca7fb2eace8", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4cfd85e307ba275d93d84ca7fb2eace8") : bridgeConfig == null ? "" : bridgeConfig.userToken();
    }

    public static String getDeviceLevel(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "db23af20a23898a05032ebef41df6006", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "db23af20a23898a05032ebef41df6006") : bridgeConfig == null ? DEVICE_LEVEL_DEFAULT : bridgeConfig.getDeviceLevel(context);
    }
}
