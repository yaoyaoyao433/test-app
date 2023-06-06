package com.meituan.android.common.mrn.analytics.library;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.module.MRNStatistics;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RNStasticsPackage implements i {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.i
    public List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f4b307f0544011104a900b19cf212fe4", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f4b307f0544011104a900b19cf212fe4") : Arrays.asList(new RNStasticsModule(reactApplicationContext), new MRNStatistics(reactApplicationContext));
    }

    public List<Class<? extends JavaScriptModule>> createJSModules() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d99d88b9786de5b666e02e8ca0c8dd22", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d99d88b9786de5b666e02e8ca0c8dd22") : Collections.emptyList();
    }

    @Override // com.facebook.react.i
    public List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3caceda7beb820eb8ef9e4530c51f192", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3caceda7beb820eb8ef9e4530c51f192") : Collections.emptyList();
    }
}
