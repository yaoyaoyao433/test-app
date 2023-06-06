package com.meituan.msi.util;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class e {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static final ConcurrentHashMap<Integer, WindowInsets> c = new ConcurrentHashMap<>(4);

    public static /* synthetic */ boolean a(boolean z) {
        b = true;
        return true;
    }

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1f99dfba7691b604daf0a4d839c189c5", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1f99dfba7691b604daf0a4d839c189c5")).booleanValue();
        }
        try {
            Class<?> cls = Class.forName("android.util.FtFeature");
            return ((Boolean) cls.getDeclaredMethod("isFeatureSupport", Integer.TYPE).invoke(cls, 32)).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ce9fdb0a54146fb9d83bf66bc0db8cd6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ce9fdb0a54146fb9d83bf66bc0db8cd6")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(Context context, boolean z) {
        boolean hasSystemFeature;
        boolean z2;
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        Object[] objArr = {context, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "64a2523984e54244d4f4a802ffd6e17a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "64a2523984e54244d4f4a802ffd6e17a")).booleanValue();
        }
        if (!c()) {
            Object[] objArr2 = {context};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "408bb1777c49f86329d948086e4ea6ad", RobustBitConfig.DEFAULT_VALUE)) {
                hasSystemFeature = ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "408bb1777c49f86329d948086e4ea6ad")).booleanValue();
            } else {
                hasSystemFeature = context == null ? false : context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
            }
            if (!hasSystemFeature && !a(context)) {
                Object[] objArr3 = {context, (byte) 1};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "fe806119d0e6912f2bce482c61961a98", RobustBitConfig.DEFAULT_VALUE)) {
                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "fe806119d0e6912f2bce482c61961a98")).booleanValue();
                } else if (context == null) {
                    z2 = false;
                } else {
                    if (Build.VERSION.SDK_INT >= 28) {
                        Activity activity = (Activity) context;
                        final View decorView = activity.getWindow().getDecorView();
                        final Integer valueOf = Integer.valueOf(activity.getWindowManager().getDefaultDisplay().getRotation());
                        WindowInsets windowInsets = c.get(valueOf);
                        boolean z3 = Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
                        if (windowInsets == null) {
                            if (z3 && decorView.isAttachedToWindow()) {
                                windowInsets = decorView.getRootWindowInsets();
                                c.put(valueOf, windowInsets);
                            } else {
                                if (!z3 && decorView.isAttachedToWindow() && (windowInsets = new n<WindowInsets>() { // from class: com.meituan.msi.util.e.1
                                    public static ChangeQuickRedirect a;

                                    @Override // com.meituan.msi.util.n
                                    public final /* synthetic */ WindowInsets a() {
                                        Object[] objArr4 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a30129ca3b6c4ae5dec15fa7ab749ef2", RobustBitConfig.DEFAULT_VALUE) ? (WindowInsets) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a30129ca3b6c4ae5dec15fa7ab749ef2") : decorView.getRootWindowInsets();
                                    }
                                }.a(new Handler(Looper.getMainLooper()))) != null) {
                                    c.put(valueOf, windowInsets);
                                }
                                decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.meituan.msi.util.e.2
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.View.OnApplyWindowInsetsListener
                                    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) {
                                        DisplayCutout displayCutout2;
                                        List<Rect> boundingRects2;
                                        Object[] objArr4 = {view, windowInsets2};
                                        ChangeQuickRedirect changeQuickRedirect4 = a;
                                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fb1600c99e882a4922e8aa651f69f7f7", RobustBitConfig.DEFAULT_VALUE)) {
                                            return (WindowInsets) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fb1600c99e882a4922e8aa651f69f7f7");
                                        }
                                        e.c.put(valueOf, decorView.getRootWindowInsets());
                                        if (decorView.getRootWindowInsets() != null && (displayCutout2 = decorView.getRootWindowInsets().getDisplayCutout()) != null && (boundingRects2 = displayCutout2.getBoundingRects()) != null && boundingRects2.size() > 0) {
                                            e.a(true);
                                        }
                                        decorView.setOnApplyWindowInsetsListener(null);
                                        return view.onApplyWindowInsets(windowInsets2);
                                    }
                                });
                            }
                        }
                        if (windowInsets != null && (displayCutout = windowInsets.getDisplayCutout()) != null && (boundingRects = displayCutout.getBoundingRects()) != null && boundingRects.size() > 0) {
                            b = true;
                        }
                    } else {
                        b = context.getPackageManager().hasSystemFeature("android.hardware.notch_support");
                    }
                    z2 = b;
                }
                if (!z2) {
                    return false;
                }
            }
        }
        return true;
    }

    public static ConcurrentHashMap<Integer, WindowInsets> a() {
        return c;
    }
}
