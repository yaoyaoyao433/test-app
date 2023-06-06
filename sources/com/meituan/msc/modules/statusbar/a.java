package com.meituan.msc.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.react.modules.statusbar.StatusBarModule;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.jse.bridge.UiThreadUtil;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.k;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = StatusBarModule.NAME)
/* loaded from: classes3.dex */
public class a extends k {
    public static ChangeQuickRedirect a;

    @Nullable
    private JSONObject d() {
        int dimensionPixelSize;
        Object[] objArr;
        ChangeQuickRedirect changeQuickRedirect;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1b969a65ac5181e7bd9adb42ac6e70f", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1b969a65ac5181e7bd9adb42ac6e70f");
        }
        Context context = MSCEnvHelper.getContext();
        Activity e = e();
        Object[] objArr3 = {context};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "b7a8bc0b8358e9f1a1fd8de034abe802", RobustBitConfig.DEFAULT_VALUE)) {
            dimensionPixelSize = ((Integer) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "b7a8bc0b8358e9f1a1fd8de034abe802")).intValue();
        } else {
            Resources system = Resources.getSystem();
            int identifier = system.getIdentifier("status_bar_height", "dimen", "android");
            dimensionPixelSize = identifier > 0 ? system.getDimensionPixelSize(identifier) : 0;
        }
        float f = dimensionPixelSize;
        String str = "black";
        if (e != null && Build.VERSION.SDK_INT >= 21) {
            str = String.format("#%06X", Integer.valueOf(e.getWindow().getStatusBarColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("HEIGHT", PatchProxy.isSupport(new Object[]{context, Float.valueOf(f)}, null, a, true, "62b57f1a98a0c94b5288fddcc3f56602", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "62b57f1a98a0c94b5288fddcc3f56602")).floatValue() : f / Resources.getSystem().getDisplayMetrics().density);
            jSONObject.put("DEFAULT_BACKGROUND_COLOR", str);
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
        return jSONObject;
    }

    @MSCMethod
    public void setColor(double d, final boolean z) {
        Object[] objArr = {Double.valueOf(d), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eef2be8ed793a2fd8b3c4f1df1366960", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eef2be8ed793a2fd8b3c4f1df1366960");
            return;
        }
        final int i = (int) d;
        final Activity e = e();
        if (e != null && Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.statusbar.a.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                @TargetApi(21)
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "76b73163d2c4f377d72e7c3f49fba81a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "76b73163d2c4f377d72e7c3f49fba81a");
                        return;
                    }
                    e.getWindow().addFlags(Integer.MIN_VALUE);
                    if (z) {
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(e.getWindow().getStatusBarColor()), Integer.valueOf(i));
                        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.meituan.msc.modules.statusbar.a.1.1
                            public static ChangeQuickRedirect a;

                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                Object[] objArr3 = {valueAnimator};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "52567c4c39c4482a7b2bd065c1e72186", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "52567c4c39c4482a7b2bd065c1e72186");
                                } else {
                                    e.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                                }
                            }
                        });
                        ofObject.setDuration(300L).setStartDelay(0L);
                        ofObject.start();
                        return;
                    }
                    e.getWindow().setStatusBarColor(i);
                }
            });
        }
    }

    @MSCMethod
    public void setTranslucent(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2d2d8daa929f5a1534103766bda69db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2d2d8daa929f5a1534103766bda69db");
            return;
        }
        final Activity e = e();
        if (e != null && Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.statusbar.a.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                @TargetApi(21)
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c093acd14d519e30c27ac67f0049c9e3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c093acd14d519e30c27ac67f0049c9e3");
                        return;
                    }
                    View decorView = e.getWindow().getDecorView();
                    if (z) {
                        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.meituan.msc.modules.statusbar.a.2.1
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                                Object[] objArr3 = {view, windowInsets};
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f8f444a3cacd058f054d0c90bc373eab", RobustBitConfig.DEFAULT_VALUE)) {
                                    return (WindowInsets) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f8f444a3cacd058f054d0c90bc373eab");
                                }
                                WindowInsets onApplyWindowInsets = view.onApplyWindowInsets(windowInsets);
                                return onApplyWindowInsets.replaceSystemWindowInsets(onApplyWindowInsets.getSystemWindowInsetLeft(), 0, onApplyWindowInsets.getSystemWindowInsetRight(), onApplyWindowInsets.getSystemWindowInsetBottom());
                            }
                        });
                    } else {
                        decorView.setOnApplyWindowInsetsListener(null);
                    }
                    ViewCompat.requestApplyInsets(decorView);
                }
            });
        }
    }

    @MSCMethod
    public void setHidden(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc783867fac9f4fb4b69e2d64424979e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc783867fac9f4fb4b69e2d64424979e");
            return;
        }
        final Activity e = e();
        if (e == null) {
            return;
        }
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.statusbar.a.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44ba53461497f3622efbd4b100a51022", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44ba53461497f3622efbd4b100a51022");
                } else if (z) {
                    e.getWindow().addFlags(1024);
                    e.getWindow().clearFlags(2048);
                } else {
                    e.getWindow().addFlags(2048);
                    e.getWindow().clearFlags(1024);
                }
            }
        });
    }

    @MSCMethod
    public void setStyle(@Nullable final String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4067ac5e6cbf3a32fb4554cdaae1b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4067ac5e6cbf3a32fb4554cdaae1b4");
            return;
        }
        final Activity e = e();
        if (e != null && Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.meituan.msc.modules.statusbar.a.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                @TargetApi(23)
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ac4c574f936cc47e41d0c39ddc3711ab", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ac4c574f936cc47e41d0c39ddc3711ab");
                        return;
                    }
                    View decorView = e.getWindow().getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    decorView.setSystemUiVisibility("dark-content".equals(str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                }
            });
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    @javax.annotation.Nullable
    public final JSONObject N_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "446db9f070f619c6809cf20e910a7ce0", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "446db9f070f619c6809cf20e910a7ce0") : d();
    }

    private Activity e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "832cd3073568d5d07970ea22e6b81c5c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "832cd3073568d5d07970ea22e6b81c5c");
        }
        try {
            return U_().b().c();
        } catch (Throwable unused) {
            return null;
        }
    }
}
