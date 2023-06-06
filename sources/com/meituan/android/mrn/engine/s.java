package com.meituan.android.mrn.engine;

import android.content.Intent;
import android.text.TextUtils;
import com.facebook.react.ReactRootView;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes2.dex */
public final class s {
    public static ChangeQuickRedirect a;
    private ReactContext b;
    private String c;
    private ReactRootView d;

    public s(ReactContext reactContext, String str, ReactRootView reactRootView) {
        Object[] objArr = {reactContext, str, reactRootView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e40d18dc24052ce1b6db8834166d9ba6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e40d18dc24052ce1b6db8834166d9ba6");
            return;
        }
        this.b = reactContext;
        this.c = str;
        this.d = reactRootView;
    }

    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e48b74ece2f93b6dc5a74d50a0331d4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e48b74ece2f93b6dc5a74d50a0331d4f");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        if (intent != null && !TextUtils.isEmpty(intent.getAction())) {
            createMap.putString("action", intent.getAction());
        }
        if (intent != null && intent.getData() != null) {
            createMap.putString(Constants.TRAFFIC_URI, intent.getData().buildUpon().toString());
        }
        if (intent != null && intent.getExtras() != null) {
            for (String str : intent.getExtras().keySet()) {
                if (!TextUtils.isEmpty(str)) {
                    Object obj = intent.getExtras().get(str);
                    if (obj instanceof Integer) {
                        createMap.putInt(str, ((Integer) obj).intValue());
                    } else if (obj instanceof Double) {
                        createMap.putDouble(str, ((Double) obj).doubleValue());
                    } else if (obj instanceof Float) {
                        createMap.putDouble(str, ((Float) obj).floatValue());
                    } else if (obj instanceof Long) {
                        createMap.putDouble(str, ((Long) obj).longValue());
                    } else if (obj instanceof String) {
                        createMap.putString(str, (String) obj);
                    } else if (obj instanceof Short) {
                        createMap.putInt(str, ((Short) obj).shortValue());
                    } else if (obj instanceof Boolean) {
                        createMap.putBoolean(str, ((Boolean) obj).booleanValue());
                    }
                }
            }
        }
        createMap.putString("lifecycle", "ON_HOST_RESULT");
        createMap.putInt(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, i);
        createMap.putInt(Constant.KEY_RESULT_CODE, i2);
        a(createMap);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2294e2d13298eb5444e3bceeef472677", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2294e2d13298eb5444e3bceeef472677");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("lifecycle", "ON_HOST_STOP");
        a(createMap);
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d947b860238e431c5d8b4ccceed53f22", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d947b860238e431c5d8b4ccceed53f22");
            return;
        }
        WritableMap createMap = Arguments.createMap();
        createMap.putString("page", this.c);
        if (this.b == null || !this.b.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("backPressed", createMap);
    }

    public void a(WritableMap writableMap) {
        Object[] objArr = {writableMap};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f45d6553db99644d75a0e5fff784c3c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f45d6553db99644d75a0e5fff784c3c6");
            return;
        }
        if (writableMap == null) {
            writableMap = Arguments.createMap();
        }
        writableMap.putString("page", this.c);
        if (this.d != null) {
            writableMap.putInt("rootTag", this.d.getRootViewTag());
        }
        if (this.b == null || !this.b.hasActiveCatalystInstance()) {
            return;
        }
        ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.b.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("LifecycleChanged", writableMap);
    }
}
