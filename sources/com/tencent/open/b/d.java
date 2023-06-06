package com.tencent.open.b;

import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.meituan.android.common.statistics.Constants;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class d {
    private static String a;
    private static String b;

    public static String a() {
        return "";
    }

    public static String b(Context context) {
        return "";
    }

    public static String c(Context context) {
        return "";
    }

    public static String d(Context context) {
        return "";
    }

    public static String a(Context context) {
        if (TextUtils.isEmpty(a)) {
            if (context == null) {
                return "";
            }
            a = "";
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            if (windowManager != null) {
                int width = windowManager.getDefaultDisplay().getWidth();
                int height = windowManager.getDefaultDisplay().getHeight();
                a = width + Constants.GestureMoveEvent.KEY_X + height;
            }
            return a;
        }
        return a;
    }

    public static String b() {
        return Locale.getDefault().getLanguage();
    }

    public static String e(Context context) {
        try {
            if (b == null) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
                StringBuilder sb = new StringBuilder();
                sb.append("imei=");
                sb.append(b(context));
                sb.append('&');
                sb.append("model=");
                sb.append(Build.MODEL);
                sb.append('&');
                sb.append("os=");
                sb.append(Build.VERSION.RELEASE);
                sb.append('&');
                sb.append("apilevel=");
                sb.append(Build.VERSION.SDK_INT);
                sb.append('&');
                String b2 = a.b(context);
                if (b2 == null) {
                    b2 = "";
                }
                sb.append("network=");
                sb.append(b2);
                sb.append('&');
                sb.append("sdcard=");
                sb.append(Environment.getExternalStorageState().equals("mounted") ? 1 : 0);
                sb.append('&');
                sb.append("display=");
                sb.append(displayMetrics.widthPixels);
                sb.append('*');
                sb.append(displayMetrics.heightPixels);
                sb.append('&');
                sb.append("manu=");
                sb.append(Build.MANUFACTURER);
                sb.append("&");
                sb.append("wifi=");
                sb.append(a.e(context));
                b = sb.toString();
            }
            return b;
        } catch (Exception unused) {
            return null;
        }
    }
}
