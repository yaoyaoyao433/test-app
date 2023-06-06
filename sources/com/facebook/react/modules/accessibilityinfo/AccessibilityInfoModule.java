package com.facebook.react.modules.accessibilityinfo;

import android.annotation.TargetApi;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.android.privacy.interfaces.t;
/* compiled from: ProGuard */
@ReactModule(name = AccessibilityInfoModule.NAME)
/* loaded from: classes.dex */
public class AccessibilityInfoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String NAME = "AccessibilityInfo";
    private static final String REDUCE_MOTION_EVENT_NAME = "reduceMotionDidChange";
    private static final String TOUCH_EXPLORATION_EVENT_NAME = "touchExplorationDidChange";
    private final ContentObserver animationScaleObserver;
    @Nullable
    private AccessibilityManager mAccessibilityManager;
    private t mContentResolver;
    private boolean mReduceMotionEnabled;
    private boolean mTouchExplorationEnabled;
    @Nullable
    private a mTouchExplorationStateChangeListener;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @ReactMethod
    public void setAccessibilityFocus(double d) {
    }

    /* compiled from: ProGuard */
    @TargetApi(19)
    /* loaded from: classes.dex */
    class a implements AccessibilityManager.TouchExplorationStateChangeListener {
        private a() {
        }

        @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
        public final void onTouchExplorationStateChanged(boolean z) {
            AccessibilityInfoModule.this.updateAndSendTouchExplorationChangeEvent(z);
        }
    }

    public AccessibilityInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.animationScaleObserver = new ContentObserver(new Handler(Looper.getMainLooper())) { // from class: com.facebook.react.modules.accessibilityinfo.AccessibilityInfoModule.1
            @Override // android.database.ContentObserver
            public final void onChange(boolean z) {
                onChange(z, null);
            }

            @Override // android.database.ContentObserver
            public final void onChange(boolean z, Uri uri) {
                if (AccessibilityInfoModule.this.getReactApplicationContext().hasActiveCatalystInstance()) {
                    AccessibilityInfoModule.this.updateAndSendReduceMotionChangeEvent();
                }
            }
        };
        this.mReduceMotionEnabled = false;
        this.mTouchExplorationEnabled = false;
        this.mAccessibilityManager = (AccessibilityManager) reactApplicationContext.getApplicationContext().getSystemService("accessibility");
        this.mTouchExplorationEnabled = this.mAccessibilityManager.isTouchExplorationEnabled();
        this.mReduceMotionEnabled = getIsReduceMotionEnabledValue();
        if (Build.VERSION.SDK_INT >= 19) {
            this.mTouchExplorationStateChangeListener = new a();
        }
    }

    private boolean getIsReduceMotionEnabledValue() {
        String string = Build.VERSION.SDK_INT < 17 ? null : Settings.Global.getString(getReactApplicationContext().getContentResolver(), "transition_animation_scale");
        return string != null && string.equals("0.0");
    }

    @ReactMethod
    public void isReduceMotionEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mReduceMotionEnabled));
    }

    @ReactMethod
    public void isTouchExplorationEnabled(Callback callback) {
        callback.invoke(Boolean.valueOf(this.mTouchExplorationEnabled));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAndSendReduceMotionChangeEvent() {
        boolean isReduceMotionEnabledValue = getIsReduceMotionEnabledValue();
        if (this.mReduceMotionEnabled != isReduceMotionEnabledValue) {
            this.mReduceMotionEnabled = isReduceMotionEnabledValue;
            ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
            if (reactApplicationContextIfActiveOrWarn != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(REDUCE_MOTION_EVENT_NAME, Boolean.valueOf(this.mReduceMotionEnabled));
            }
        }
    }

    @ReactMethod
    public void setBusinessId(String str) {
        if (!TextUtils.isEmpty(str) && this.mContentResolver == null && Build.VERSION.SDK_INT >= 17) {
            this.mContentResolver = Privacy.createContentResolver(getReactApplicationContext(), str);
            this.mContentResolver.a(Settings.Global.getUriFor("transition_animation_scale"), false, this.animationScaleObserver);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAndSendTouchExplorationChangeEvent(boolean z) {
        if (this.mTouchExplorationEnabled != z) {
            this.mTouchExplorationEnabled = z;
            if (getReactApplicationContextIfActiveOrWarn() != null) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(TOUCH_EXPLORATION_EVENT_NAME, Boolean.valueOf(this.mTouchExplorationEnabled));
            }
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.addTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        if (Build.VERSION.SDK_INT >= 19) {
            this.mAccessibilityManager.removeTouchExplorationStateChangeListener(this.mTouchExplorationStateChangeListener);
        }
        if (this.mContentResolver == null || Build.VERSION.SDK_INT < 17) {
            return;
        }
        this.mContentResolver.a(this.animationScaleObserver);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        getReactApplicationContext().addLifecycleEventListener(this);
        updateAndSendTouchExplorationChangeEvent(this.mAccessibilityManager.isTouchExplorationEnabled());
        updateAndSendReduceMotionChangeEvent();
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        super.onCatalystInstanceDestroy();
        getReactApplicationContext().removeLifecycleEventListener(this);
    }

    @ReactMethod
    public void announceForAccessibility(String str) {
        if (this.mAccessibilityManager == null || !this.mAccessibilityManager.isEnabled()) {
            return;
        }
        AccessibilityEvent obtain = AccessibilityEvent.obtain(16384);
        obtain.getText().add(str);
        obtain.setClassName(AccessibilityInfoModule.class.getName());
        obtain.setPackageName(getReactApplicationContext().getPackageName());
        this.mAccessibilityManager.sendAccessibilityEvent(obtain);
    }
}
