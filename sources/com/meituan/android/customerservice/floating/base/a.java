package com.meituan.android.customerservice.floating.base;

import android.content.Context;
import android.os.Build;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    View b;
    public final WindowManager.LayoutParams c;
    private Context d;
    private final WindowManager e;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b74aba6bd2e48cf5538b65c01946e35", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b74aba6bd2e48cf5538b65c01946e35");
            return;
        }
        this.d = context;
        this.e = (WindowManager) this.d.getSystemService("window");
        this.c = new WindowManager.LayoutParams();
    }

    public final synchronized boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31f50c052b1f54f4329adc0bd7698464", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31f50c052b1f54f4329adc0bd7698464")).booleanValue();
        }
        WindowManager windowManager = this.e;
        View view = this.b;
        WindowManager.LayoutParams layoutParams = this.c;
        Object[] objArr2 = {windowManager, view, layoutParams};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "b08f92e86a0e95d03430ea8c5861137f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "b08f92e86a0e95d03430ea8c5861137f")).booleanValue();
        }
        return a(windowManager, view, layoutParams, false);
    }

    public static void a(WindowManager.LayoutParams layoutParams) {
        Object[] objArr = {layoutParams};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d95db2c03d1a1e0df997466f8f27bad8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d95db2c03d1a1e0df997466f8f27bad8");
        } else if (Build.VERSION.SDK_INT < 26) {
            layoutParams.type = 2002;
        } else {
            layoutParams.type = 2038;
        }
    }

    public static boolean a(WindowManager windowManager, View view) {
        Object[] objArr = {windowManager, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "4bd19e76f281885242b0f58253b30d8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "4bd19e76f281885242b0f58253b30d8e")).booleanValue();
        }
        if (windowManager != null) {
            return ViewCompat.isAttachedToWindow(view);
        }
        return false;
    }

    public static boolean a(WindowManager windowManager, View view, WindowManager.LayoutParams layoutParams, boolean z) {
        Object[] objArr = {windowManager, view, layoutParams, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "d917c644cd932ec278227c40118d6661", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "d917c644cd932ec278227c40118d6661")).booleanValue();
        }
        if (windowManager == null || view == null) {
            return false;
        }
        if (!ViewCompat.isAttachedToWindow(view)) {
            windowManager.addView(view, layoutParams);
            return true;
        }
        if (z) {
            windowManager.updateViewLayout(view, layoutParams);
        }
        return false;
    }

    public static boolean b(WindowManager windowManager, View view) {
        Object[] objArr = {windowManager, view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "fefbbaa4bd9737a9aaf8ebeeef28bc1a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "fefbbaa4bd9737a9aaf8ebeeef28bc1a")).booleanValue();
        }
        if (windowManager == null || view == null || !ViewCompat.isAttachedToWindow(view)) {
            return false;
        }
        windowManager.removeViewImmediate(view);
        return true;
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "96f3d88dc4695e06e766b1ca2bba2138", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "96f3d88dc4695e06e766b1ca2bba2138");
        } else {
            b(this.e, this.b);
        }
    }
}
