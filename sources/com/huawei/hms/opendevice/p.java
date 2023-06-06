package com.huawei.hms.opendevice;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.support.log.HMSLog;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class p {
    public static boolean a() {
        int i = HwBuildEx.VERSION.EMUI_SDK_INT;
        HMSLog.d("CommFun", "Emui Api Level:" + i);
        return i > 0;
    }

    public static long b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.huawei.android.pushagent", 0).versionCode;
        } catch (Exception unused) {
            HMSLog.e("CommFun", "get nc versionCode error");
            return -1L;
        }
    }

    public static boolean c(Context context) {
        return a() && HwBuildEx.VERSION.EMUI_SDK_INT < 21 && b(context) < 110001400;
    }

    public static String a(Context context) {
        String parent;
        if (Build.VERSION.SDK_INT >= 24) {
            StringBuilder sb = new StringBuilder();
            sb.append(context.createDeviceProtectedStorageContext().getDataDir());
            parent = sb.toString();
        } else {
            parent = context.getFilesDir().getParent();
        }
        if (TextUtils.isEmpty(parent)) {
            HMSLog.e("CommFun", "get storage root path of the current user failed.");
        }
        return parent;
    }
}
