package com.tencent.mapsdk.internal;

import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ConfigurationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.meituan.android.common.statistics.Constants;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.tencent.map.tools.Util;
import java.net.URLEncoder;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class hc {
    public static final int a = 400;
    public static final String b = "TencentMapSDK";
    private static final int c = 65537;
    private static String d;

    public static float a(Context context) {
        if (context == null) {
            return 1.0f;
        }
        return context.getResources().getDisplayMetrics().density;
    }

    public static int b(Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public static int c(Context context) {
        return context.getResources().getDisplayMetrics().heightPixels;
    }

    public static int[] d(Context context) {
        Point point = new Point();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getSize(point);
        return new int[]{point.x, point.y};
    }

    private static int j(Context context) {
        ConfigurationInfo deviceConfigurationInfo = ((ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME)).getDeviceConfigurationInfo();
        return deviceConfigurationInfo != null ? deviceConfigurationInfo.reqGlEsVersion : c;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            String str = packageInfo.versionName;
            int i = packageInfo.versionCode;
            return str + i;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static String a(Context context, String str) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return "";
        }
        try {
            applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            applicationInfo = null;
        }
        return (applicationInfo == null || applicationInfo.metaData == null) ? "" : applicationInfo.metaData.getString(str);
    }

    public static String f(Context context) {
        return Util.getMD5String(Util.getIMei(context));
    }

    public static String g(Context context) {
        return Util.getMD5String(Util.getDuid(context));
    }

    public static String a() {
        if (d == null) {
            d = Build.MODEL;
            d = Constants.UNDEFINED;
        }
        return d;
    }

    public static String h(Context context) {
        ApplicationInfo applicationInfo;
        if (context == null) {
            return "";
        }
        PackageManager packageManager = context.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            applicationInfo = null;
        }
        try {
            return URLEncoder.encode((applicationInfo != null ? applicationInfo.loadLabel(packageManager) : "can't find app name").toString(), "utf-8");
        } catch (Exception unused) {
            return "";
        }
    }

    public static String i(Context context) {
        if (context == null) {
            return "";
        }
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return displayMetrics.widthPixels + "*" + displayMetrics.heightPixels;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    private static boolean a(View view, float f, float f2) {
        if (view == null) {
            return false;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return f2 >= ((float) i2) && f2 <= ((float) (view.getMeasuredHeight() + i2)) && f >= ((float) i) && f <= ((float) (view.getMeasuredWidth() + i));
    }

    public static Rect a(View view) {
        if (view == null) {
            return new Rect();
        }
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        return new Rect(i, i2, view.getMeasuredWidth() + i, view.getMeasuredHeight() + i2);
    }
}
