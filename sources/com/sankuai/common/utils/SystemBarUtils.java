package com.sankuai.common.utils;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.os.Environment;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Properties;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class SystemBarUtils {
    private static final String KEY_MIUI_INTERNAL_STORAGE = "ro.miui.internal.storage";
    private static final String KEY_MIUI_VERSION_CODE = "ro.miui.ui.version.code";
    private static final String KEY_MIUI_VERSION_NAME = "ro.miui.ui.version.name";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static int mIsMIUI = -1;

    public static int getStatusBarHeight(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f1dd8b540e25af9d1c292920277a92ae", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f1dd8b540e25af9d1c292920277a92ae")).intValue();
        }
        try {
            Resources resources = context.getResources();
            return resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"));
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static void setStatusBar(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5ec92c17cede717b730d8559eb6ab605", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5ec92c17cede717b730d8559eb6ab605");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 23) {
                activity.getWindow().getDecorView().setSystemUiVisibility(1280);
                activity.getWindow().addFlags(Integer.MIN_VALUE);
                activity.getWindow().setStatusBarColor(0);
            } else if (Build.VERSION.SDK_INT >= 19) {
                activity.getWindow().addFlags(67108864);
            }
        } catch (Throwable unused) {
        }
    }

    public static void setStatusBarColor(Activity activity, int i) {
        Object[] objArr = {activity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ba6ba7acd88799ca63d1fd959be7739d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ba6ba7acd88799ca63d1fd959be7739d");
            return;
        }
        try {
            if (Build.VERSION.SDK_INT >= 21) {
                activity.getWindow().setStatusBarColor(activity.getResources().getColor(i));
            }
        } catch (Throwable unused) {
        }
    }

    private static void processFlyMe(boolean z, Activity activity) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "378189c52a684350ade82aacb95a8a5d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "378189c52a684350ade82aacb95a8a5d");
            return;
        }
        WindowManager.LayoutParams attributes = activity.getWindow().getAttributes();
        try {
            Class<?> cls = Class.forName("android.view.WindowManager$LayoutParams");
            int i = cls.getDeclaredField("MEIZU_FLAG_DARK_STATUS_BAR_ICON").getInt(attributes);
            Field declaredField = cls.getDeclaredField("meizuFlags");
            declaredField.setAccessible(true);
            int i2 = declaredField.getInt(attributes);
            if (z) {
                declaredField.set(attributes, Integer.valueOf(i2 | i));
            } else {
                declaredField.set(attributes, Integer.valueOf((~i) & i2));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void processMIUI(boolean z, Activity activity) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4a1051d54e37e358c8a333450487c09e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4a1051d54e37e358c8a333450487c09e");
            return;
        }
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Method method = cls.getMethod("setExtraFlags", Integer.TYPE, Integer.TYPE);
            Window window = activity.getWindow();
            Object[] objArr2 = new Object[2];
            objArr2[0] = Integer.valueOf(z ? i : 0);
            objArr2[1] = Integer.valueOf(i);
            method.invoke(window, objArr2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean isMIUI() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a399d58d004b80e5bb45d86f62c4b337", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a399d58d004b80e5bb45d86f62c4b337")).booleanValue();
        }
        if (mIsMIUI == -1) {
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(Environment.getRootDirectory(), "build.prop"));
                Properties properties = new Properties();
                properties.load(fileInputStream);
                if (properties.getProperty(KEY_MIUI_VERSION_CODE, null) == null && properties.getProperty(KEY_MIUI_VERSION_NAME, null) == null && properties.getProperty(KEY_MIUI_INTERNAL_STORAGE, null) == null) {
                    i = 0;
                    mIsMIUI = i;
                    fileInputStream.close();
                }
                i = 1;
                mIsMIUI = i;
                fileInputStream.close();
            } catch (Exception unused) {
                mIsMIUI = 0;
            }
        }
        return mIsMIUI == 1;
    }

    public static boolean isFlyme() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4e0d4ef44e019dda94a460a375522ed2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4e0d4ef44e019dda94a460a375522ed2")).booleanValue();
        }
        try {
            return Build.class.getMethod("hasSmartBar", new Class[0]) != null;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setStatusTextColor(boolean z, Activity activity) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "2e59152d5c81faefe41beebd973d96f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "2e59152d5c81faefe41beebd973d96f2");
            return;
        }
        try {
            if (isFlyme()) {
                processFlyMe(z, activity);
            } else if (isMIUI()) {
                processMIUI(z, activity);
            } else {
                if (z) {
                    if (Build.VERSION.SDK_INT >= 23) {
                        activity.getWindow().getDecorView().setSystemUiVisibility(9216);
                    }
                } else {
                    activity.getWindow().getDecorView().setSystemUiVisibility(1280);
                }
                activity.getWindow().getDecorView().findViewById(16908290).setPadding(0, 0, 0, 0);
            }
        } catch (Throwable unused) {
        }
    }
}
