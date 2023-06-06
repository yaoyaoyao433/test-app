package com.sankuai.waimai.store.mrn;

import android.support.annotation.NonNull;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.mrn.config.IMRNReactPackage;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SGMRNExportPackage implements IMRNReactPackage {
    public static ChangeQuickRedirect a;

    @Override // com.meituan.android.mrn.config.IMRNReactPackage
    public final String a() {
        return "SGMRNExportPackage";
    }

    @Override // com.facebook.react.i
    @NonNull
    public List<NativeModule> createNativeModules(@NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0deddef7b1c9ce9bf5921eae429f905", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0deddef7b1c9ce9bf5921eae429f905") : Collections.singletonList(new SGLocationModule(reactApplicationContext));
    }

    @Override // com.facebook.react.i
    @NonNull
    public List<ViewManager> createViewManagers(@NonNull ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bc5923555c17f1e0a81c2d2f5d65e47", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bc5923555c17f1e0a81c2d2f5d65e47") : new ArrayList();
    }
}
