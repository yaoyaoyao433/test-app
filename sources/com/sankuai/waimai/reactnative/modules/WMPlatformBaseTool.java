package com.sankuai.waimai.reactnative.modules;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.android.mrn.engine.n;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.utils.f;
import com.sankuai.waimai.platform.domain.core.location.AddressItem;
import com.sankuai.waimai.platform.utils.l;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMPlatformBaseTool extends ReactContextBaseJavaModule implements com.sankuai.waimai.foundation.core.service.user.b {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "WMPlatformBaseTool";
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
    }

    public WMPlatformBaseTool(@Nonnull ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4807eb3e36692564151b42becc04199b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4807eb3e36692564151b42becc04199b");
        }
    }

    @ReactMethod
    public void getAppModel(final Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f23eeb25c0938904ae99083378c635fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f23eeb25c0938904ae99083378c635fe");
        } else {
            l.b(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMPlatformBaseTool.1
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7568d3c966c8fef0a35788d9b042587a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7568d3c966c8fef0a35788d9b042587a");
                        return;
                    }
                    try {
                        promise.resolve(Integer.valueOf(com.sankuai.waimai.platform.model.c.a().b()));
                    } catch (Exception e) {
                        promise.reject(e);
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void saveAppModel(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "20f1da0c1987427063d70d655f950c13", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "20f1da0c1987427063d70d655f950c13");
        } else {
            l.b(new Runnable() { // from class: com.sankuai.waimai.reactnative.modules.WMPlatformBaseTool.2
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0ad60df58f250016db3eb31a9cc71214", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0ad60df58f250016db3eb31a9cc71214");
                        return;
                    }
                    try {
                        com.sankuai.waimai.platform.model.c.a().a(i);
                    } catch (Exception unused) {
                    }
                }
            }, "");
        }
    }

    @ReactMethod
    public void getUserNumberAndAddress(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b334374f4b3fcf5a73bca5222b2fe512", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b334374f4b3fcf5a73bca5222b2fe512");
            return;
        }
        AddressItem a = com.sankuai.waimai.platform.domain.manager.location.a.a(getCurrentActivity());
        if (a == null) {
            a = com.sankuai.waimai.platform.domain.manager.location.a.b();
        }
        if (a != null && a.addressType == 1) {
            a = null;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        if (a == null) {
            promise.resolve(writableNativeMap);
            return;
        }
        try {
            writableNativeMap.putString("address_id", String.valueOf(a.id));
            writableNativeMap.putInt("recipient_address_longitude", a.lng);
            writableNativeMap.putInt("recipient_address_latitude", a.lat);
            if (!TextUtils.isEmpty(a.addrBrief)) {
                writableNativeMap.putString("recipient_address", a.addrBrief);
            }
            writableNativeMap.putInt("location_accuracy", g.l());
            writableNativeMap.putInt("location_way", 0);
            promise.resolve(writableNativeMap);
        } catch (Exception unused) {
            promise.resolve(writableNativeMap);
        }
    }

    @ReactMethod
    public void getLoginStatus(Callback callback) {
        Object[] objArr = {callback};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1970a3b7e85c64f6f82efd500a7da88", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1970a3b7e85c64f6f82efd500a7da88");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        try {
            writableNativeMap.putInt("status", !com.sankuai.waimai.platform.domain.manager.user.a.i().a());
            callback.invoke(null, writableNativeMap);
        } catch (Exception unused) {
            callback.invoke("status empty");
        }
    }

    @ReactMethod
    public void registerLoginStatusCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0d40c513a736b9c69ce91e895cb44295", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0d40c513a736b9c69ce91e895cb44295");
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        }
    }

    @ReactMethod
    public void unregisterLoginStatusCallback() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a7c6bd15cc3f415cf427b1ea3570e6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a7c6bd15cc3f415cf427b1ea3570e6a");
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        }
    }

    @ReactMethod
    public void presentLoginPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3b2bd1ebe75e95869c00047b6d48ee26", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3b2bd1ebe75e95869c00047b6d48ee26");
        } else if (f.a(getCurrentActivity())) {
        } else {
            com.sankuai.waimai.platform.domain.manager.user.a.a((Context) getCurrentActivity());
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5551ffe38983071151c7b0dc7317e06d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5551ffe38983071151c7b0dc7317e06d");
        } else {
            emitLoginStatusInfo2RN(aVar == b.a.LOGIN ? 0 : 1);
        }
    }

    private void emitLoginStatusInfo2RN(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "288fd42d120c1c4fa8f8295deb6bc6cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "288fd42d120c1c4fa8f8295deb6bc6cc");
            return;
        }
        WritableNativeMap writableNativeMap = new WritableNativeMap();
        writableNativeMap.putInt("status", i);
        n.a(getReactApplicationContext(), "onLoginStatusChanged", writableNativeMap);
    }
}
