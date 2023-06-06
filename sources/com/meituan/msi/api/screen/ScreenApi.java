package com.meituan.msi.api.screen;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.res.Resources;
import android.provider.Settings;
import android.view.Window;
import android.view.WindowManager;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.msi.a;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.util.m;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class ScreenApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    public ContentResolver b;
    public Resources c;
    private int d;

    @MsiApiMethod(isCallback = true, name = "offUserCaptureScreen")
    public void offUserCaptureScreen(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onUserCaptureScreen")
    public void onUserCaptureScreen(MsiContext msiContext) {
    }

    public ScreenApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95e73a946ad4f74a4c4f1658a7f42730", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95e73a946ad4f74a4c4f1658a7f42730");
            return;
        }
        this.b = a.f().getContentResolver();
        this.c = a.f().getResources();
    }

    @MsiApiMethod(isForeground = true, name = "getScreenBrightness", response = ScreenBrightnessValue.class)
    public void getScreenBrightness(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2289dd0aa926b2d618cc60d97c16e98c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2289dd0aa926b2d618cc60d97c16e98c");
            return;
        }
        Activity activity = msiContext.getActivity();
        if (activity == null) {
            msiContext.onError("activity is null");
            return;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        ScreenBrightnessValue screenBrightnessValue = new ScreenBrightnessValue();
        if (attributes != null && attributes.screenBrightness == -1.0f) {
            float a2 = a();
            if (a2 == -1.0f) {
                msiContext.onError("fail to getScreenBrightness");
                return;
            }
            screenBrightnessValue.value = a2;
        } else if (attributes != null) {
            screenBrightnessValue.value = attributes.screenBrightness;
        } else {
            msiContext.onError("LayoutParams is null");
            return;
        }
        msiContext.onSuccess(screenBrightnessValue);
    }

    @MsiApiMethod(isForeground = true, name = "setKeepScreenOn", onUiThread = true, request = KeepScreenOnParam.class)
    public void setKeepScreenOn(KeepScreenOnParam keepScreenOnParam, MsiContext msiContext) {
        Object[] objArr = {keepScreenOnParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "588a81953ebeb51dc0f53daa81370538", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "588a81953ebeb51dc0f53daa81370538");
            return;
        }
        Activity activity = msiContext.getActivity();
        if (activity == null) {
            msiContext.onError("activity is null");
            return;
        }
        if (keepScreenOnParam.keepScreenOn) {
            activity.getWindow().addFlags(128);
        } else {
            activity.getWindow().clearFlags(128);
        }
        msiContext.onSuccess("");
    }

    @MsiApiMethod(isForeground = true, name = "setScreenBrightness", onUiThread = true, request = ScreenBrightnessValue.class)
    public synchronized void setScreenBrightness(ScreenBrightnessValue screenBrightnessValue, final MsiContext msiContext) {
        Object[] objArr = {screenBrightnessValue, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e97e81f39e3740643eb9fc1861a5a45c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e97e81f39e3740643eb9fc1861a5a45c");
            return;
        }
        float f = screenBrightnessValue.value;
        Activity activity = msiContext.getActivity();
        if (activity == null) {
            m.b(new Runnable() { // from class: com.meituan.msi.api.screen.ScreenApi.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b1f32883c07b01a20829214cc7806fd8", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b1f32883c07b01a20829214cc7806fd8");
                    } else {
                        msiContext.onError("activity is null");
                    }
                }
            });
            return;
        }
        Window window = activity.getWindow();
        WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
        if (attributes != null) {
            attributes.screenBrightness = f;
            window.setAttributes(attributes);
            m.b(new Runnable() { // from class: com.meituan.msi.api.screen.ScreenApi.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95425c92c1b2ff5df16b6bce66dda4f3", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95425c92c1b2ff5df16b6bce66dda4f3");
                    } else {
                        msiContext.onSuccess("");
                    }
                }
            });
            return;
        }
        m.b(new Runnable() { // from class: com.meituan.msi.api.screen.ScreenApi.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7521b37364c126dbc1d2d67193d53992", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7521b37364c126dbc1d2d67193d53992");
                } else {
                    msiContext.onError("LayoutParams is null");
                }
            }
        });
    }

    private float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95c528c1579eeeb6826f42c48ce4de15", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95c528c1579eeeb6826f42c48ce4de15")).floatValue();
        }
        try {
            float f = Settings.System.getInt(this.b, "screen_brightness");
            if (f < 0.0f) {
                com.meituan.msi.log.a.a("screenBrightness is less than 0");
                return f;
            }
            this.d = b();
            if (this.d <= 0) {
                com.meituan.msi.log.a.a("maxSettingBrightness is 0");
                return f;
            }
            return ((f / this.d) * 100.0f) / 100.0f;
        } catch (Settings.SettingNotFoundException unused) {
            com.meituan.msi.log.a.a("setting not found");
            return -1.0f;
        }
    }

    private int b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c67f3386f436779ee7ab11eaf83e5cac", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c67f3386f436779ee7ab11eaf83e5cac")).intValue();
        }
        if (this.c == null) {
            return 255;
        }
        try {
            this.d = this.c.getInteger(this.c.getIdentifier("config_screenBrightnessSettingMaximum", DataConstants.TYPE.INTEGER, "android"));
            return this.d;
        } catch (Resources.NotFoundException unused) {
            return 255;
        }
    }
}
