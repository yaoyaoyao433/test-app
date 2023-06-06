package com.sankuai.waimai.reactnative.modules;

import android.app.Activity;
import android.content.Intent;
import com.facebook.react.bridge.ActivityEventListener;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMRNMTPayJumpModule extends ReactContextBaseJavaModule implements ActivityEventListener {
    public static final String REACT_CLASS = "WMRNMTPayJumpModule";
    public static ChangeQuickRedirect changeQuickRedirect;
    private boolean isDiffCancel;
    private Callback onActivityResultCallback;
    private int requestCode;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onNewIntent(Intent intent) {
    }

    public WMRNMTPayJumpModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6578ac7b07d92b1b81ddb31fe0af08db", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6578ac7b07d92b1b81ddb31fe0af08db");
        } else {
            reactApplicationContext.addActivityEventListener(this);
        }
    }

    @ReactMethod
    public void startPay(int i, String str, String str2, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), str, str2, callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "abcafc0b5659f931f0e3c4f9b48afc08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "abcafc0b5659f931f0e3c4f9b48afc08");
            return;
        }
        this.requestCode = i;
        this.onActivityResultCallback = callback;
        com.sankuai.waimai.platform.capacity.pay.a.a(getCurrentActivity(), i, str, str2);
    }

    @ReactMethod
    public void startPayNew(int i, String str, String str2, boolean z, Callback callback) {
        Object[] objArr = {Integer.valueOf(i), str, str2, Byte.valueOf(z ? (byte) 1 : (byte) 0), callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35469b8eb9d9a74ece15b3b9e8751bf3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35469b8eb9d9a74ece15b3b9e8751bf3");
            return;
        }
        this.isDiffCancel = z;
        this.requestCode = i;
        this.onActivityResultCallback = callback;
        com.sankuai.waimai.platform.capacity.pay.a.a(getCurrentActivity(), i, str, str2);
    }

    @Override // com.facebook.react.bridge.ActivityEventListener
    public void onActivityResult(Activity activity, int i, int i2, Intent intent) {
        Object valueOf;
        Object[] objArr = {activity, Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c10ec3cee00d90cb18ba71957fc83ddf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c10ec3cee00d90cb18ba71957fc83ddf");
        } else if (i != this.requestCode || this.onActivityResultCallback == null) {
        } else {
            Callback callback = this.onActivityResultCallback;
            Object[] objArr2 = new Object[1];
            if (this.isDiffCancel) {
                valueOf = Integer.valueOf(i2);
            } else {
                valueOf = Boolean.valueOf(i2 == -1);
            }
            objArr2[0] = valueOf;
            callback.invoke(objArr2);
            this.onActivityResultCallback = null;
            this.requestCode = 0;
        }
    }
}
