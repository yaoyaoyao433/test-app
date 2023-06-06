package com.sankuai.meituan.mtliveqos.utils;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meizu.cloud.pushsdk.constants.PushConstants;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e {
    public static ChangeQuickRedirect a;
    public static String b;
    public static String c;

    public static synchronized String a(Context context) {
        synchronized (e.class) {
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4577bae87c2bc999be80ef79647cd641", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4577bae87c2bc999be80ef79647cd641");
            }
            if (TextUtils.isEmpty(b)) {
                try {
                    b = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
                } catch (Exception e) {
                    Log.e("UtilTools", "getVersionName: ", e);
                }
            }
            if (b == null) {
                b = "";
            }
            return b;
        }
    }

    public static String b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c40e72955990a69ea949a2d833a46e99", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c40e72955990a69ea949a2d833a46e99");
        }
        if (TextUtils.isEmpty(c)) {
            try {
                c = context.getPackageName();
            } catch (Exception e) {
                Log.e("UtilTools", "getPackageName: ", e);
            }
        }
        if (c == null) {
            c = "";
        }
        return c;
    }

    public static float c(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "169b22658306a0ac74039a2231b5a84c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "169b22658306a0ac74039a2231b5a84c")).floatValue();
        }
        if (Build.VERSION.SDK_INT >= 16) {
            try {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getMemoryInfo(memoryInfo);
                return (1.0f - (((float) memoryInfo.availMem) / ((float) memoryInfo.totalMem))) * 100.0f;
            } catch (Exception e) {
                Log.e("UtilTools", "getSystemMemUsage: ", e);
                return 0.0f;
            }
        }
        return 0.0f;
    }
}
