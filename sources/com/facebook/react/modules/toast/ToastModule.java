package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: ProGuard */
@ReactModule(name = ToastModule.NAME)
/* loaded from: classes.dex */
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void show(final String str, double d) {
        final int i = (int) d;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.1
            @Override // java.lang.Runnable
            public final void run() {
                Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i).show();
            }
        });
    }

    @ReactMethod
    public void showWithGravity(final String str, double d, double d2) {
        final int i = (int) d;
        final int i2 = (int) d2;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.2
            @Override // java.lang.Runnable
            public final void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, 0, 0);
                makeText.show();
            }
        });
    }

    @ReactMethod
    public void showWithGravityAndOffset(final String str, double d, double d2, double d3, double d4) {
        final int i = (int) d;
        final int i2 = (int) d2;
        final int i3 = (int) d3;
        final int i4 = (int) d4;
        UiThreadUtil.runOnUiThread(new Runnable() { // from class: com.facebook.react.modules.toast.ToastModule.3
            @Override // java.lang.Runnable
            public final void run() {
                Toast makeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), str, i);
                makeText.setGravity(i2, i3, i4);
                makeText.show();
            }
        });
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @Nullable
    public final Map<String, Object> getConstants() {
        return getTypedExportedConstants();
    }

    public Map<String, Object> getTypedExportedConstants() {
        HashMap hashMap = new HashMap();
        hashMap.put(DURATION_SHORT_KEY, 0);
        hashMap.put(DURATION_LONG_KEY, 1);
        hashMap.put(GRAVITY_TOP_KEY, 49);
        hashMap.put(GRAVITY_BOTTOM_KEY, 81);
        hashMap.put(GRAVITY_CENTER, 17);
        return hashMap;
    }
}
