package com.meituan.msc.uimanager;

import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c {
    public static ChangeQuickRedirect a;
    @Nullable
    public static DisplayMetrics b;
    @Nullable
    public static DisplayMetrics c;

    public static void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "65f3a613eb664b6457f563a3bf946318", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "65f3a613eb664b6457f563a3bf946318");
        } else if (c != null) {
        } else {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "20b237ee7a9d04c4861913b4b2437257", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "20b237ee7a9d04c4861913b4b2437257");
                return;
            }
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            b = displayMetrics;
            DisplayMetrics displayMetrics2 = new DisplayMetrics();
            displayMetrics2.setTo(displayMetrics);
            WindowManager windowManager = (WindowManager) context.getSystemService("window");
            com.facebook.infer.annotation.a.a(windowManager, "WindowManager is null!");
            Display defaultDisplay = windowManager.getDefaultDisplay();
            if (Build.VERSION.SDK_INT >= 17) {
                defaultDisplay.getRealMetrics(displayMetrics2);
            } else {
                try {
                    Method method = Display.class.getMethod("getRawHeight", new Class[0]);
                    displayMetrics2.widthPixels = ((Integer) Display.class.getMethod("getRawWidth", new Class[0]).invoke(defaultDisplay, new Object[0])).intValue();
                    displayMetrics2.heightPixels = ((Integer) method.invoke(defaultDisplay, new Object[0])).intValue();
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException("Error getting real dimensions for API level < 17", e);
                }
            }
            c = displayMetrics2;
        }
    }
}
