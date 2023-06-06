package com.sankuai.waimai.business.ugc.modules;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.support.annotation.Nullable;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMVolumeModule extends ReactContextBaseJavaModule implements ActivityEventListener, LifecycleEventListener {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String TAG;
    private AudioManager am;
    private float max_volume;
    private ReactApplicationContext rContext;
    private VolumeBroadcastReceiver volumeBR;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "WMVolumeControl";
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public WMVolumeModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "efbd8af3434f58211ddf7deb75b34cfc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "efbd8af3434f58211ddf7deb75b34cfc");
            return;
        }
        this.TAG = WMVolumeModule.class.getSimpleName();
        this.max_volume = 0.0f;
        this.rContext = reactApplicationContext;
        try {
            this.am = (AudioManager) this.rContext.getSystemService("audio");
            this.max_volume = this.am.getStreamMaxVolume(3);
            this.volumeBR = new VolumeBroadcastReceiver();
            registerVolumeReceiver();
        } catch (Exception unused) {
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0502ec13fd1762b3a7a90400c2fdcf17", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0502ec13fd1762b3a7a90400c2fdcf17");
        } else {
            registerVolumeReceiver();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ab2e12bd01dea22aac19c09b1baafb39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ab2e12bd01dea22aac19c09b1baafb39");
        } else {
            unregisterVolumeReceiver();
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81394c4758b5b5ff0c7599ae55f859e2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81394c4758b5b5ff0c7599ae55f859e2");
            return;
        }
        super.initialize();
        try {
            this.am = (AudioManager) this.rContext.getSystemService("audio");
            this.max_volume = this.am.getStreamMaxVolume(3);
            this.volumeBR = new VolumeBroadcastReceiver();
            registerVolumeReceiver();
        } catch (Exception unused) {
        }
    }

    private void registerVolumeReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "278017a3c1f5e7ffaa2dedb7330392ef", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "278017a3c1f5e7ffaa2dedb7330392ef");
        } else if (this.volumeBR.b) {
        } else {
            this.rContext.registerReceiver(this.volumeBR, new IntentFilter("android.media.VOLUME_CHANGED_ACTION"));
            this.volumeBR.b = true;
        }
    }

    private void unregisterVolumeReceiver() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6719a549df984331466df876303ee391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6719a549df984331466df876303ee391");
        } else if (this.volumeBR.b) {
            this.rContext.unregisterReceiver(this.volumeBR);
            this.volumeBR.b = false;
        }
    }

    public void sendEvent(ReactContext reactContext, String str, @Nullable WritableMap writableMap) {
        Object[] objArr = {reactContext, str, writableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "141f3cd0d40373d8212a3ad4bc3ad44c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "141f3cd0d40373d8212a3ad4bc3ad44c");
        } else {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.rContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    @ReactMethod
    public void getVolume(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "48e0068932e2307b93b0e0568f7ccae8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "48e0068932e2307b93b0e0568f7ccae8");
        } else {
            promise.resolve(Float.valueOf(getNormalizedVolume()));
        }
    }

    @ReactMethod
    public void change(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "24965d6dc2a519c4499b6e99ef5a607f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "24965d6dc2a519c4499b6e99ef5a607f");
            return;
        }
        try {
            this.am.setStreamVolume(3, (int) (f * this.max_volume), 0);
        } catch (Exception unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getNormalizedVolume() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c53bc30cd1ab39d91660301f04f61609", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c53bc30cd1ab39d91660301f04f61609")).floatValue();
        }
        try {
            return (this.am.getStreamVolume(3) * 1.0f) / this.max_volume;
        } catch (Exception e) {
            a.b(e);
            return 0.0f;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public class VolumeBroadcastReceiver extends BroadcastReceiver {
        public static ChangeQuickRedirect a;
        boolean b = false;

        public VolumeBroadcastReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Object[] objArr = {context, intent};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ae38a76c6d7117968ccccb1d4ac1a78", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ae38a76c6d7117968ccccb1d4ac1a78");
            } else if (intent.getAction().equals("android.media.VOLUME_CHANGED_ACTION")) {
                float normalizedVolume = WMVolumeModule.this.getNormalizedVolume();
                WritableMap createMap = Arguments.createMap();
                createMap.putDouble("volume", normalizedVolume);
                try {
                    WMVolumeModule.this.sendEvent(WMVolumeModule.this.rContext, "VolumeChanged", createMap);
                } catch (RuntimeException unused) {
                }
            }
        }
    }
}
