package com.sankuai.waimai.store.mrn;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.module.annotations.ReactModule;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.t;
/* compiled from: ProGuard */
@ReactModule(name = SGMRNContainerStatistics.NAME)
/* loaded from: classes5.dex */
public class SGMRNContainerStatistics extends ReactContextBaseJavaModule {
    public static final String NAME = "SMMRNContainerStatistics";
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mCid;

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    public SGMRNContainerStatistics(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ccb37228f0eb0aa99c55ade1ff27a81e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ccb37228f0eb0aa99c55ade1ff27a81e");
        }
    }

    @ReactMethod
    public void updateMRNContainerCid(String str, Promise promise) {
        Object[] objArr = {str, promise};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0e1f3e30572cc07948484e902ce8eb71", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0e1f3e30572cc07948484e902ce8eb71");
            return;
        }
        if (t.a(str)) {
            str = "";
        }
        this.mCid = str;
        d.a(promise);
    }

    public String getPageCid() {
        return this.mCid;
    }
}
