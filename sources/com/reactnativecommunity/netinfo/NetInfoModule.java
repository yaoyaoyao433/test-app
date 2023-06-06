package com.reactnativecommunity.netinfo;

import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.android.mrn.horn.f;
import com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller;
/* compiled from: ProGuard */
@ReactModule(name = NetInfoModule.NAME)
/* loaded from: classes3.dex */
public class NetInfoModule extends ReactContextBaseJavaModule implements AmazonFireDeviceConnectivityPoller.a {
    public static final String NAME = "RNCNetInfo";
    private final AmazonFireDeviceConnectivityPoller mAmazonConnectivityChecker;
    private final b mConnectivityReceiver;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public NetInfoModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        if (Build.VERSION.SDK_INT >= 24) {
            this.mConnectivityReceiver = new e(reactApplicationContext);
        } else {
            this.mConnectivityReceiver = new a(reactApplicationContext);
        }
        this.mAmazonConnectivityChecker = new AmazonFireDeviceConnectivityPoller(reactApplicationContext, this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        this.mConnectivityReceiver.a();
        AmazonFireDeviceConnectivityPoller amazonFireDeviceConnectivityPoller = this.mAmazonConnectivityChecker;
        if (AmazonFireDeviceConnectivityPoller.a()) {
            if (!amazonFireDeviceConnectivityPoller.a.a) {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_DOWN");
                intentFilter.addAction("com.amazon.tv.networkmonitor.INTERNET_UP");
                amazonFireDeviceConnectivityPoller.b.registerReceiver(amazonFireDeviceConnectivityPoller.a, intentFilter);
                amazonFireDeviceConnectivityPoller.a.a = true;
            }
            if (amazonFireDeviceConnectivityPoller.f) {
                return;
            }
            amazonFireDeviceConnectivityPoller.e = new Handler();
            amazonFireDeviceConnectivityPoller.f = true;
            amazonFireDeviceConnectivityPoller.e.post(amazonFireDeviceConnectivityPoller.d);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        AmazonFireDeviceConnectivityPoller amazonFireDeviceConnectivityPoller = this.mAmazonConnectivityChecker;
        if (AmazonFireDeviceConnectivityPoller.a()) {
            if (amazonFireDeviceConnectivityPoller.f) {
                amazonFireDeviceConnectivityPoller.f = false;
                amazonFireDeviceConnectivityPoller.e.removeCallbacksAndMessages(null);
                amazonFireDeviceConnectivityPoller.e = null;
            }
            if (amazonFireDeviceConnectivityPoller.a.a) {
                amazonFireDeviceConnectivityPoller.b.unregisterReceiver(amazonFireDeviceConnectivityPoller.a);
                amazonFireDeviceConnectivityPoller.a.a = false;
            }
        }
        this.mConnectivityReceiver.b();
    }

    @ReactMethod
    public void getCurrentState(String str, Promise promise) {
        getCurrentStateForPrivacy(str, f.a().a(getReactApplicationContext()), promise);
    }

    @ReactMethod
    public void getCurrentStateForPrivacy(String str, String str2, Promise promise) {
        this.mConnectivityReceiver.a(str, str2, promise);
    }

    @Override // com.reactnativecommunity.netinfo.AmazonFireDeviceConnectivityPoller.a
    public void onAmazonFireDeviceConnectivityChanged(boolean z) {
        this.mConnectivityReceiver.a(z);
    }
}
