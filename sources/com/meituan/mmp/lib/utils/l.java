package com.meituan.mmp.lib.utils;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
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
public final class l {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static ConcurrentHashMap<Integer, WindowInsets> c = new ConcurrentHashMap<>(4);

    public static /* synthetic */ boolean a(boolean z) {
        b = true;
        return true;
    }

    private static boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f2b299e7fa0f22e42d395291cdfb1dea", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f2b299e7fa0f22e42d395291cdfb1dea")).booleanValue();
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
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6ccb29fa57c0b4e93d94358231ccf702", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6ccb29fa57c0b4e93d94358231ccf702")).booleanValue();
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

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0071, code lost:
        if (b(r18, true) != false) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean a(android.content.Context r18, boolean r19) {
        /*
            r0 = r18
            r1 = 2
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r9 = 0
            r1[r9] = r0
            r10 = 1
            java.lang.Byte r2 = java.lang.Byte.valueOf(r10)
            r1[r10] = r2
            com.meituan.robust.ChangeQuickRedirect r11 = com.meituan.mmp.lib.utils.l.a
            java.lang.String r12 = "a4053f32750b6f5ee1ed6b22a964ef3b"
            r3 = 0
            r5 = 1
            r7 = 4611686018427387904(0x4000000000000000, double:2.0)
            r2 = r1
            r4 = r11
            r6 = r12
            boolean r2 = com.meituan.robust.PatchProxy.isSupport(r2, r3, r4, r5, r6, r7)
            if (r2 == 0) goto L2b
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r1, r3, r11, r10, r12)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            return r0
        L2b:
            java.lang.String r1 = "hasCutOut"
            android.os.Trace.beginSection(r1)
            boolean r1 = c()     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L73
            java.lang.Object[] r1 = new java.lang.Object[r10]     // Catch: java.lang.Throwable -> L78
            r1[r9] = r0     // Catch: java.lang.Throwable -> L78
            com.meituan.robust.ChangeQuickRedirect r2 = com.meituan.mmp.lib.utils.l.a     // Catch: java.lang.Throwable -> L78
            java.lang.String r4 = "8845788291ab363a40dcc877a7e1133d"
            r12 = 0
            r14 = 1
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r11 = r1
            r13 = r2
            r15 = r4
            boolean r5 = com.meituan.robust.PatchProxy.isSupport(r11, r12, r13, r14, r15, r16)     // Catch: java.lang.Throwable -> L78
            if (r5 == 0) goto L57
            java.lang.Object r1 = com.meituan.robust.PatchProxy.accessDispatch(r1, r3, r2, r10, r4)     // Catch: java.lang.Throwable -> L78
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L78
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L78
            goto L65
        L57:
            if (r0 != 0) goto L5b
            r1 = 0
            goto L65
        L5b:
            android.content.pm.PackageManager r1 = r18.getPackageManager()     // Catch: java.lang.Throwable -> L78
            java.lang.String r2 = "com.oppo.feature.screen.heteromorphism"
            boolean r1 = r1.hasSystemFeature(r2)     // Catch: java.lang.Throwable -> L78
        L65:
            if (r1 != 0) goto L73
            boolean r1 = a(r18)     // Catch: java.lang.Throwable -> L78
            if (r1 != 0) goto L73
            boolean r0 = b(r0, r10)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L74
        L73:
            r9 = 1
        L74:
            android.os.Trace.endSection()
            return r9
        L78:
            r0 = move-exception
            android.os.Trace.endSection()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.utils.l.a(android.content.Context, boolean):boolean");
    }

    public static boolean b(Context context, boolean z) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        Object[] objArr = {context, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7da70a2e819fe71ab66cd3234718d090", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7da70a2e819fe71ab66cd3234718d090")).booleanValue();
        }
        if (context == null) {
            return false;
        }
        Trace.beginSection("notchSupport");
        if (Build.VERSION.SDK_INT >= 28) {
            Activity activity = (Activity) context;
            final View decorView = activity.getWindow().getDecorView();
            final Integer valueOf = Integer.valueOf(activity.getWindowManager().getDefaultDisplay().getRotation());
            WindowInsets windowInsets = c.get(valueOf);
            boolean z2 = Thread.currentThread().getId() == Looper.getMainLooper().getThread().getId();
            if (windowInsets == null) {
                if (z2 && decorView.isAttachedToWindow()) {
                    windowInsets = decorView.getRootWindowInsets();
                    c.put(valueOf, windowInsets);
                } else {
                    if (z && !z2 && decorView.isAttachedToWindow()) {
                        WindowInsets a2 = new ag<WindowInsets>() { // from class: com.meituan.mmp.lib.utils.l.1
                            public static ChangeQuickRedirect a;

                            @Override // com.meituan.mmp.lib.utils.ag
                            public final /* synthetic */ WindowInsets a() {
                                Object[] objArr2 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect2 = a;
                                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ddbd39b53319f0ebf40df6b555d7b395", RobustBitConfig.DEFAULT_VALUE) ? (WindowInsets) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ddbd39b53319f0ebf40df6b555d7b395") : decorView.getRootWindowInsets();
                            }
                        }.a(new Handler(Looper.getMainLooper()));
                        if (a2 != null) {
                            c.put(valueOf, a2);
                        }
                        windowInsets = a2;
                    }
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.meituan.mmp.lib.utils.l.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) {
                            DisplayCutout displayCutout2;
                            List<Rect> boundingRects2;
                            Object[] objArr2 = {view, windowInsets2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9efafdbe96ce74316e9ce994de2a88e8", RobustBitConfig.DEFAULT_VALUE)) {
                                return (WindowInsets) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9efafdbe96ce74316e9ce994de2a88e8");
                            }
                            l.c.put(valueOf, decorView.getRootWindowInsets());
                            if (decorView.getRootWindowInsets() != null && (displayCutout2 = decorView.getRootWindowInsets().getDisplayCutout()) != null && (boundingRects2 = displayCutout2.getBoundingRects()) != null && boundingRects2.size() > 0) {
                                l.a(true);
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
        Trace.endSection();
        return b;
    }

    public static ConcurrentHashMap<Integer, WindowInsets> a() {
        return c;
    }
}
