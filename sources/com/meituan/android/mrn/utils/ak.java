package com.meituan.android.mrn.utils;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.provider.Settings;
import com.facebook.react.bridge.NativeModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class ak {
    public static ChangeQuickRedirect a;

    public static boolean a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3fdbdf3f73dad480e77dfd123525b962", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3fdbdf3f73dad480e77dfd123525b962")).booleanValue() : i3 > 0 && i - i2 >= i3;
    }

    public static int a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f03accd11e50d6e8469e07139a79cb18", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f03accd11e50d6e8469e07139a79cb18")).intValue();
        }
        Resources system = Resources.getSystem();
        int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return system.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static int b(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4e54487ef3ddbc70609965e080474525", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4e54487ef3ddbc70609965e080474525")).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            int identifier = context.getResources().getIdentifier("navigation_bar_height", "dimen", "android");
            if (identifier > 0) {
                return context.getResources().getDimensionPixelSize(identifier);
            }
            return 0;
        } catch (Throwable th) {
            th.printStackTrace();
            return 0;
        }
    }

    public static int a(Context context, int i, int i2, int i3) {
        int i4;
        Object[] objArr = {context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1268f676db263039e571711a4b0446c2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1268f676db263039e571711a4b0446c2")).intValue();
        }
        if (Build.VERSION.SDK_INT >= 17) {
            try {
                if (Settings.Global.getInt(context.getContentResolver(), "force_fsg_nav_bar", 0) != 0 && i3 >= 0 && (i4 = i3 + i2) <= i) {
                    return i4;
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i2;
    }

    public static Class a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1bace7a637436322c1800bfa1b1cd5ca", RobustBitConfig.DEFAULT_VALUE)) {
            return (Class) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1bace7a637436322c1800bfa1b1cd5ca");
        }
        Class<?> cls = obj != null ? obj.getClass() : null;
        while (cls != null && !"android.widget.Editor".equals(cls.getName())) {
            cls = cls.getSuperclass();
        }
        return cls == null ? Object.class : cls;
    }

    public static <T extends NativeModule> String a(T t, String str) {
        Object[] objArr = {t, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "139b510b020a47f9d2568c5a6f5a6f0a", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "139b510b020a47f9d2568c5a6f5a6f0a");
        }
        return t.getName() + CommonConstant.Symbol.MINUS + str;
    }
}
