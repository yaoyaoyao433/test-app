package com.sankuai.meituan.shortvideocore.mrn;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0122b5499ca4d60d88c3adb49a9fda2f", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0122b5499ca4d60d88c3adb49a9fda2f");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new MRNPlayerModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f62a1e6587bb2f62ff23f420b23400f", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f62a1e6587bb2f62ff23f420b23400f") : Arrays.asList(new MRNShortVideoPlayerViewManager());
    }
}
