package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.bridge.WritableNativeMap;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNLogin extends ReactContextBaseJavaModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "SMMRNLogin";
    }

    public SGMRNLogin(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "539742f72b9b2b8ecc3b724a386ecce1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "539742f72b9b2b8ecc3b724a386ecce1");
        }
    }

    @ReactMethod
    public void loginUserInfo(Promise promise) {
        Object[] objArr = {promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "79db2135017f0518b8bba8fb7d477b3b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "79db2135017f0518b8bba8fb7d477b3b");
            return;
        }
        try {
            WritableNativeMap writableNativeMap = new WritableNativeMap();
            WritableNativeMap writableNativeMap2 = new WritableNativeMap();
            WritableNativeMap writableNativeMap3 = new WritableNativeMap();
            String str = "";
            String str2 = "";
            if (com.sankuai.waimai.platform.domain.manager.user.a.i().b() != null) {
                str = t.a(com.sankuai.waimai.platform.domain.manager.user.a.i().b().username) ? "" : com.sankuai.waimai.platform.domain.manager.user.a.i().b().username;
                str2 = t.a(com.sankuai.waimai.platform.domain.manager.user.a.i().b().avatarurl) ? "" : com.sankuai.waimai.platform.domain.manager.user.a.i().b().avatarurl;
            }
            writableNativeMap3.putString("username", str);
            writableNativeMap3.putString("avatarurl", str2);
            writableNativeMap2.putBoolean("isLogin", com.sankuai.waimai.platform.domain.manager.user.a.i().a());
            writableNativeMap2.putMap("userinfo", (WritableMap) writableNativeMap3);
            writableNativeMap.putInt("code", 0);
            writableNativeMap.putString("message", "success");
            writableNativeMap.putMap("data", (WritableMap) writableNativeMap2);
            promise.resolve(writableNativeMap);
        } catch (Exception e) {
            d.a(promise, e);
        }
    }
}
