package com.meituan.android.common.metricx.utils;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class ApkUtil {
    private static String APP_VERSION;
    private static String PACKAGE_NAME;
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String obtainPackageName(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "37acc6a3c74081beadb03cbdbb641502", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "37acc6a3c74081beadb03cbdbb641502");
        }
        if (TextUtils.isEmpty(PACKAGE_NAME)) {
            PACKAGE_NAME = obtainPackageNameInner(context);
        }
        return PACKAGE_NAME;
    }

    private static String obtainPackageNameInner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3bd3f65cc5377f8db0253f8438e1b6ef", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3bd3f65cc5377f8db0253f8438e1b6ef");
        }
        if (context == null) {
            return "";
        }
        try {
            return context.getApplicationContext().getPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    public static String obtainAppVersion(@Nullable Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "80fab2171b8c0a78757f7c820e9153cd", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "80fab2171b8c0a78757f7c820e9153cd");
        }
        if (TextUtils.isEmpty(APP_VERSION)) {
            APP_VERSION = obtainAppVersionInner(context);
        }
        return APP_VERSION;
    }

    public static long obtainVersionCode(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "19ce848f750a04811a4d8e803684d154", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "19ce848f750a04811a4d8e803684d154")).longValue();
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 16384);
            if (Build.VERSION.SDK_INT >= 28) {
                return packageInfo.getLongVersionCode();
            }
            return packageInfo.versionCode;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    private static String obtainAppVersionInner(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8eddd47c8bcdc8b699d82522572c9d4e", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8eddd47c8bcdc8b699d82522572c9d4e");
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
