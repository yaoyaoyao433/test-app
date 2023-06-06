package com.dianping.live.im.mrn;

import com.dianping.util.h;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LiveIMModule extends ReactContextBaseJavaModule implements b {
    public static final String MODULE_NAME = "LiveIMModule";
    private static final String TAG = "TAG_LiveIMModule";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return MODULE_NAME;
    }

    public LiveIMModule(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "890fa1fd359f4ecec1bd906ad3f346c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "890fa1fd359f4ecec1bd906ad3f346c7");
        }
    }

    @ReactMethod
    public void create() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1685eb53632ae3de23b0afe08d8724a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1685eb53632ae3de23b0afe08d8724a8");
            return;
        }
        a a = a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "e14a64e3d743a6bd66721ff6d307dec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "e14a64e3d743a6bd66721ff6d307dec2");
        } else {
            a.b.add(this);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb311b80f7b2d5a29caaebde904267db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb311b80f7b2d5a29caaebde904267db");
            return;
        }
        super.onCatalystInstanceDestroy();
        a a = a.a();
        Object[] objArr2 = {this};
        ChangeQuickRedirect changeQuickRedirect3 = a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "c397504abf6ff31fece8c2cd226d255d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "c397504abf6ff31fece8c2cd226d255d");
        } else {
            a.b.remove(this);
        }
    }

    @Override // com.dianping.live.im.mrn.b
    public void onReceive(String str, byte[] bArr) {
        Object[] objArr = {str, bArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2dfa4e1fd604daa4bab69703f17b89d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2dfa4e1fd604daa4bab69703f17b89d4");
            return;
        }
        String str2 = new String(bArr);
        HashMap hashMap = new HashMap();
        hashMap.put("data", str2);
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        if (reactApplicationContext != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("im.pushMessage", Arguments.makeNativeMap(hashMap));
        }
    }

    @Override // com.dianping.live.im.mrn.b
    public void onError(String str, int i, String str2) {
        Object[] objArr = {str, Integer.valueOf(i), str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7ab15a93077a98bb812505a5721350c8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7ab15a93077a98bb812505a5721350c8");
            return;
        }
        h.d(TAG, "shark push command:" + str + " throws error code:" + i + "  errorMsg:" + str2);
    }
}
