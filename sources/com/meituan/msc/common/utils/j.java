package com.meituan.msc.common.utils;

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
public final class j {
    public static ChangeQuickRedirect a = null;
    private static boolean b = false;
    private static ConcurrentHashMap<Integer, WindowInsets> c = new ConcurrentHashMap<>(4);

    public static /* synthetic */ boolean a(boolean z) {
        b = true;
        return true;
    }

    public static boolean a(Context context, boolean z) {
        DisplayCutout displayCutout;
        List<Rect> boundingRects;
        Object[] objArr = {context, (byte) 1};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a8f50eced7928435c063d96d3e6d2eec", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a8f50eced7928435c063d96d3e6d2eec")).booleanValue();
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
                    if (!z2 && decorView.isAttachedToWindow() && (windowInsets = new ah<WindowInsets>() { // from class: com.meituan.msc.common.utils.j.1
                        public static ChangeQuickRedirect a;

                        @Override // com.meituan.msc.common.utils.ah
                        public final /* synthetic */ WindowInsets a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26027775f1a99f1dffddcab2b9f959a1", RobustBitConfig.DEFAULT_VALUE) ? (WindowInsets) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26027775f1a99f1dffddcab2b9f959a1") : decorView.getRootWindowInsets();
                        }
                    }.a(new Handler(Looper.getMainLooper()))) != null) {
                        c.put(valueOf, windowInsets);
                    }
                    decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.meituan.msc.common.utils.j.2
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnApplyWindowInsetsListener
                        public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets2) {
                            DisplayCutout displayCutout2;
                            List<Rect> boundingRects2;
                            Object[] objArr2 = {view, windowInsets2};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d6121ccbb1a3981bd075f9da2efbc57", RobustBitConfig.DEFAULT_VALUE)) {
                                return (WindowInsets) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d6121ccbb1a3981bd075f9da2efbc57");
                            }
                            j.c.put(valueOf, decorView.getRootWindowInsets());
                            if (decorView.getRootWindowInsets() != null && (displayCutout2 = decorView.getRootWindowInsets().getDisplayCutout()) != null && (boundingRects2 = displayCutout2.getBoundingRects()) != null && boundingRects2.size() > 0) {
                                j.a(true);
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
}
