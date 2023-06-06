package com.dianping.titansadapter;

import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.JsHandlerFactory;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.KNBConfig;
import com.sankuai.meituan.android.knb.KNBWebManager;
import com.sankuai.meituan.android.knb.util.UriUtil;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class TitansWebManager {
    public static final String PREF_JSBRIDGE_STORAGE = "jsbridge_storage";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static String sDebugAgent = "";
    private static String sUserAgent = "";
    private static boolean useUserAgent = true;

    public static void initWebViewPerformance(Application application, String str, String str2) {
    }

    public static String ua() {
        return useUserAgent ? sUserAgent : sDebugAgent;
    }

    public static void changeDebugUA() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "92b1e4e831c2915910363cffe5e9bd12", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "92b1e4e831c2915910363cffe5e9bd12");
            return;
        }
        useUserAgent = !useUserAgent;
        if (TextUtils.isEmpty(sDebugAgent)) {
            String str = sUserAgent;
            if (str.contains("TitansX")) {
                str = str.replaceAll("TitansX", "TitansNoX");
            } else if (str.contains("TitansNoX")) {
                str = str.replaceAll("TitansNoX", "TitansX");
            }
            sDebugAgent = str;
        }
    }

    public static void setJsLocalStorage(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a2414ecd3cc8e0fdad8a4bf5c91b2749", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a2414ecd3cc8e0fdad8a4bf5c91b2749");
        } else {
            context.getSharedPreferences(PREF_JSBRIDGE_STORAGE, 0).edit().putString(str, str2).apply();
        }
    }

    public static String getJsLocalStorage(Context context, String str, String str2) {
        Object[] objArr = {context, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2fd62494d2cd6ab7df6cf3395757445e", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2fd62494d2cd6ab7df6cf3395757445e") : context.getSharedPreferences(PREF_JSBRIDGE_STORAGE, 0).getString(str, str2);
    }

    public static void initialTitans(@NonNull Context context, @NonNull String str, @NonNull IJSBPerformer iJSBPerformer) {
        String str2;
        Object[] objArr = {context, str, iJSBPerformer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5339bb418834b99b30a64bc9cf1fa30a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5339bb418834b99b30a64bc9cf1fa30a");
            return;
        }
        String packageName = context.getPackageName();
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str2 = "unknown";
        }
        initialTitans(str, packageName, str2, iJSBPerformer);
    }

    public static void initialTitansx(@NonNull Context context, @NonNull String str, @NonNull IJSBPerformer iJSBPerformer) {
        String str2;
        Object[] objArr = {context, str, iJSBPerformer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b07177096fc89cb83306c016e2234296", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b07177096fc89cb83306c016e2234296");
            return;
        }
        String packageName = context.getPackageName();
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str2 = "unknown";
        }
        initialTitansx(str, packageName, str2, iJSBPerformer);
    }

    @Deprecated
    public static void initialTitans(@NonNull String str, @NonNull IJSBPerformer iJSBPerformer) {
        Object[] objArr = {str, iJSBPerformer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a88775ebf3dad84cba1afab75ba8741e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a88775ebf3dad84cba1afab75ba8741e");
            return;
        }
        sUserAgent = str;
        BridgeManager.init(iJSBPerformer);
        JsHandlerFactory.registerJsHandlerForKNB();
    }

    public static void initialTitans(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull IJSBPerformer iJSBPerformer) {
        Object[] objArr = {str, str2, str3, iJSBPerformer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "50a07afd30699d1441eea084e4ea4ef4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "50a07afd30699d1441eea084e4ea4ef4");
            return;
        }
        String str4 = "KNB/1.0.0 android/" + Build.VERSION.RELEASE + StringUtil.SPACE + str + "/" + str2 + "/" + str3 + " TitansX/11.52.1";
        KNBWebManager.IEnvironment environment = KNBWebManager.getEnvironment();
        String kNBAppId = environment == null ? "unknown" : environment.getKNBAppId();
        if (TextUtils.isEmpty(kNBAppId)) {
            kNBAppId = "unknown";
        }
        initialTitans(str4 + " App/" + kNBAppId + "/" + str3, iJSBPerformer);
    }

    public static void initialTitansx(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull IJSBPerformer iJSBPerformer) {
        Object[] objArr = {str, str2, str3, iJSBPerformer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3ffc20efa6d1e330e489b1b157850705", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3ffc20efa6d1e330e489b1b157850705");
            return;
        }
        String str4 = "TitansX/11.52.1 KNB/1.2.0 android/" + Build.VERSION.RELEASE + StringUtil.SPACE + str + "/" + str2 + "/" + str3;
        KNBWebManager.IEnvironment environment = KNBWebManager.getEnvironment();
        String kNBAppId = environment == null ? "unknown" : environment.getKNBAppId();
        if (TextUtils.isEmpty(kNBAppId)) {
            kNBAppId = "unknown";
        }
        initialTitans(str4 + " App/" + kNBAppId + "/" + str3, iJSBPerformer);
    }

    @Deprecated
    public static void initialTitansNoX(@NonNull Context context, @NonNull String str, @NonNull IJSBPerformer iJSBPerformer) {
        String str2;
        Object[] objArr = {context, str, iJSBPerformer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "94951af6ac83c185b97ce7219ff1a920", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "94951af6ac83c185b97ce7219ff1a920");
            return;
        }
        String packageName = context.getPackageName();
        try {
            str2 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str2 = "unknown";
        }
        initialTitansNoX(str, packageName, str2, iJSBPerformer);
    }

    @Deprecated
    public static void initialTitansNoX(@NonNull String str, @NonNull String str2, @NonNull String str3, @NonNull IJSBPerformer iJSBPerformer) {
        Object[] objArr = {str, str2, str3, iJSBPerformer};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e93c0fd4c6fe0ab416cd3c6309ff6d60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e93c0fd4c6fe0ab416cd3c6309ff6d60");
            return;
        }
        String str4 = "TitansNoX/11.52.1 KNB/1.2.0 android/" + Build.VERSION.RELEASE + StringUtil.SPACE + str + "/" + str2 + "/" + str3;
        KNBWebManager.IEnvironment environment = KNBWebManager.getEnvironment();
        String kNBAppId = environment == null ? "unknown" : environment.getKNBAppId();
        if (TextUtils.isEmpty(kNBAppId)) {
            kNBAppId = "unknown";
        }
        initialTitans(str4 + " App/" + kNBAppId + "/" + str3, iJSBPerformer);
    }

    public static IJSBPerformer getJSBPerformer() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "84373b67fcb2d6c48c2fb92d6fc73ad4", RobustBitConfig.DEFAULT_VALUE) ? (IJSBPerformer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "84373b67fcb2d6c48c2fb92d6fc73ad4") : BridgeManager.getJSBPerformer();
    }

    public static boolean isInWhiteList(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca02f2ceb7dc778b6141a76edfb19002", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca02f2ceb7dc778b6141a76edfb19002")).booleanValue() : UriUtil.hostEndWith(str, KNBConfig.getStringListConfig(KNBConfig.CONFIG_ACCESS_WHITE, KNBConfig.DEFAULT_WHITE_LIST));
    }
}
