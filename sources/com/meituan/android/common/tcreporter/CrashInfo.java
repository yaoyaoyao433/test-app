package com.meituan.android.common.tcreporter;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class CrashInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    public Map<String, Object> mCrashOption;
    public String mCrashVersion;
    public String mSource;
    public String mToken;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class AppCrashInfo extends CrashInfo {
        public static ChangeQuickRedirect changeQuickRedirect;

        public AppCrashInfo(String str) {
            this.mSource = str;
            this.mCrashVersion = Utils.obtainAppVersion();
            this.mCrashOption = new HashMap();
        }

        public AppCrashInfo(String str, Map<String, Object> map) {
            this.mSource = str;
            this.mCrashVersion = Utils.obtainAppVersion();
            this.mCrashOption = map == null ? new HashMap<>() : map;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class SDKCrashInfo extends CrashInfo {
        public static ChangeQuickRedirect changeQuickRedirect;

        public SDKCrashInfo(String str, String str2) {
            this.mToken = str;
            this.mCrashVersion = str2;
            this.mCrashOption = new HashMap();
        }

        public SDKCrashInfo(String str, String str2, Map<String, Object> map) {
            this.mToken = str;
            this.mCrashVersion = str2;
            this.mCrashOption = map == null ? new HashMap<>() : map;
        }
    }

    @Deprecated
    public static CrashInfo newCrashInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3b782360ac370951cfac73e6782adbee", RobustBitConfig.DEFAULT_VALUE) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3b782360ac370951cfac73e6782adbee") : new SDKCrashInfo(str, str2);
    }

    @Deprecated
    public static CrashInfo newCrashInfo(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9d65ae32a3a4e53e3fbb4a2900529e0d", RobustBitConfig.DEFAULT_VALUE) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9d65ae32a3a4e53e3fbb4a2900529e0d") : new SDKCrashInfo(str, str2, map);
    }

    public static CrashInfo newAppCrashInfo(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e81cc43ee901540854c1c2e9cd59ebeb", RobustBitConfig.DEFAULT_VALUE) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e81cc43ee901540854c1c2e9cd59ebeb") : new AppCrashInfo(str);
    }

    public static CrashInfo newAppCrashInfo(String str, Map<String, Object> map) {
        Object[] objArr = {str, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "126acb550970bccb9f23cfdc12e5da7d", RobustBitConfig.DEFAULT_VALUE) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "126acb550970bccb9f23cfdc12e5da7d") : new AppCrashInfo(str, map);
    }

    public static CrashInfo newSDKCrashInfo(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3457c32f8245a3b8e5bd66950b187faf", RobustBitConfig.DEFAULT_VALUE) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3457c32f8245a3b8e5bd66950b187faf") : new SDKCrashInfo(str, str2);
    }

    public static CrashInfo newSDKCrashInfo(String str, String str2, Map<String, Object> map) {
        Object[] objArr = {str, str2, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a56b2654ea263c464b017c0341f14331", RobustBitConfig.DEFAULT_VALUE) ? (CrashInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a56b2654ea263c464b017c0341f14331") : new SDKCrashInfo(str, str2, map);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class Utils {
        private static String APP_VERSION;
        public static ChangeQuickRedirect changeQuickRedirect;

        private static Context getApplicationContext() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "6e7e43e3d352ccb8b62874f99d03ed82", RobustBitConfig.DEFAULT_VALUE)) {
                return (Context) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "6e7e43e3d352ccb8b62874f99d03ed82");
            }
            try {
                return ((Application) Class.forName("android.app.ActivityThread").getDeclaredMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }

        public static String obtainAppVersion() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f819f0ad07785df3aeda702e30f45403", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f819f0ad07785df3aeda702e30f45403");
            }
            Context applicationContext = getApplicationContext();
            if (applicationContext == null) {
                return "";
            }
            if (TextUtils.isEmpty(APP_VERSION)) {
                APP_VERSION = obtainAppVersionInner(applicationContext);
            }
            return APP_VERSION;
        }

        private static String obtainAppVersionInner(Context context) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "636a52ad25fb990798f3a0109f77a3f4", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "636a52ad25fb990798f3a0109f77a3f4");
            }
            if (context == null) {
                return "";
            }
            try {
                return context.getPackageManager().getPackageInfo(context.getPackageName(), 16384).versionName;
            } catch (Exception unused) {
                return "";
            }
        }
    }
}
