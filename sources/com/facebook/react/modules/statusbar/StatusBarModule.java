package com.facebook.react.modules.statusbar;

import android.animation.ArgbEvaluator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewCompat;
import android.view.View;
import android.view.WindowInsets;
import com.facebook.common.logging.a;
import com.facebook.react.bridge.GuardedRunnable;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.common.c;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.w;
import com.meituan.android.mrn.utils.ak;
import java.util.Map;
/* compiled from: ProGuard */
@ReactModule(name = StatusBarModule.NAME)
/* loaded from: classes.dex */
public class StatusBarModule extends ReactContextBaseJavaModule {
    private static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    private static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public StatusBarModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Nullable
    public Map<String, Object> getTypedExportedConstants() {
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        Activity currentActivity = getCurrentActivity();
        float a = ak.a((Context) reactApplicationContext);
        String str = "black";
        if (currentActivity != null && Build.VERSION.SDK_INT >= 21) {
            str = String.format("#%06X", Integer.valueOf(currentActivity.getWindow().getStatusBarColor() & ViewCompat.MEASURED_SIZE_MASK));
        }
        return c.a(HEIGHT_KEY, Float.valueOf(w.c(a)), DEFAULT_BACKGROUND_COLOR_KEY, str);
    }

    @ReactMethod
    public void setColor(double d, final boolean z) {
        final int i = (int) d;
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.1
                @Override // com.facebook.react.bridge.GuardedRunnable
                @TargetApi(21)
                public final void runGuarded() {
                    currentActivity.getWindow().addFlags(Integer.MIN_VALUE);
                    if (z) {
                        ValueAnimator ofObject = ValueAnimator.ofObject(new ArgbEvaluator(), Integer.valueOf(currentActivity.getWindow().getStatusBarColor()), Integer.valueOf(i));
                        ofObject.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.1.1
                            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                                currentActivity.getWindow().setStatusBarColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                            }
                        });
                        ofObject.setDuration(300L).setStartDelay(0L);
                        ofObject.start();
                        return;
                    }
                    currentActivity.getWindow().setStatusBarColor(i);
                }
            });
        }
    }

    @ReactMethod
    public void setTranslucent(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 21) {
            UiThreadUtil.runOnUiThread(new GuardedRunnable(getReactApplicationContext()) { // from class: com.facebook.react.modules.statusbar.StatusBarModule.2
                @Override // com.facebook.react.bridge.GuardedRunnable
                @TargetApi(21)
                public final void runGuarded() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    if (z) {
                        decorView.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.2.1
                            @Override // android.view.View.OnApplyWindowInsetsListener
                            public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
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

    @ReactMethod
    public void setHidden(final boolean z) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.3
                @Override // java.lang.Runnable
                public final void run() {
                    if (z) {
                        currentActivity.getWindow().addFlags(1024);
                        currentActivity.getWindow().clearFlags(2048);
                        return;
                    }
                    currentActivity.getWindow().addFlags(2048);
                    currentActivity.getWindow().clearFlags(1024);
                }
            });
        }
    }

    @ReactMethod
    public void setStyle(@Nullable final String str) {
        final Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            a.c("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else if (Build.VERSION.SDK_INT >= 23) {
            UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.statusbar.StatusBarModule.4
                @Override // java.lang.Runnable
                @TargetApi(23)
                public final void run() {
                    View decorView = currentActivity.getWindow().getDecorView();
                    int systemUiVisibility = decorView.getSystemUiVisibility();
                    decorView.setSystemUiVisibility("dark-content".equals(str) ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
                }
            });
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @javax.annotation.Nullable
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }
}
