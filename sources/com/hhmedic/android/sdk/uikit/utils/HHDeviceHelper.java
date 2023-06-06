package com.hhmedic.android.sdk.uikit.utils;

import android.os.Build;
import android.os.Environment;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import com.hhmedic.android.sdk.base.utils.Logger;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class HHDeviceHelper {
    private static final String FLYME = "flyme";
    private static final String KEY_FLYME_VERSION_NAME = "ro.build.display.id";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    private static final String[] MEIZUBOARD = {"m9", "M9", "mx", "MX"};
    private static final String ZTEC2016 = "zte c2016";
    private static final String ZUKZ1 = "zuk z1";
    private static String sFlymeVersionName;
    private static String sMiuiVersionName;

    static {
        FileInputStream fileInputStream;
        Properties properties = new Properties();
        if (Build.VERSION.SDK_INT < 26) {
            FileInputStream fileInputStream2 = null;
            try {
                try {
                    fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                } catch (Exception e) {
                    e = e;
                }
            } catch (Throwable th) {
                th = th;
            }
            try {
                properties.load(fileInputStream);
                close(fileInputStream);
            } catch (Exception e2) {
                e = e2;
                fileInputStream2 = fileInputStream;
                Logger.e(e.toString());
                close(fileInputStream2);
                Method declaredMethod = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
                sMiuiVersionName = getLowerCaseName(properties, declaredMethod, KEY_MIUI_VERSION_NAME);
                sFlymeVersionName = getLowerCaseName(properties, declaredMethod, KEY_FLYME_VERSION_NAME);
            } catch (Throwable th2) {
                th = th2;
                fileInputStream2 = fileInputStream;
                close(fileInputStream2);
                throw th;
            }
        }
        try {
            Method declaredMethod2 = Class.forName("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            sMiuiVersionName = getLowerCaseName(properties, declaredMethod2, KEY_MIUI_VERSION_NAME);
            sFlymeVersionName = getLowerCaseName(properties, declaredMethod2, KEY_FLYME_VERSION_NAME);
        } catch (Exception e3) {
            Logger.e(e3.toString());
        }
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean isFlyme() {
        return !TextUtils.isEmpty(sFlymeVersionName) && sFlymeVersionName.contains(FLYME);
    }

    public static boolean isMIUI() {
        return !TextUtils.isEmpty(sMiuiVersionName);
    }

    public static boolean isMeizu() {
        return isPhone(MEIZUBOARD) || isFlyme();
    }

    public static boolean isZUKZ1() {
        String str = Build.MODEL;
        return str != null && str.toLowerCase().contains(ZUKZ1);
    }

    public static boolean isZTKC2016() {
        String str = Build.MODEL;
        return str != null && str.toLowerCase().contains(ZTEC2016);
    }

    private static boolean isPhone(String[] strArr) {
        String str = Build.BOARD;
        if (str == null) {
            return false;
        }
        for (String str2 : strArr) {
            if (str.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    private static String getLowerCaseName(Properties properties, Method method, String str) {
        String property = properties.getProperty(str);
        if (property == null) {
            try {
                property = (String) method.invoke(null, str);
            } catch (Exception unused) {
            }
        }
        return property != null ? property.toLowerCase() : property;
    }
}
