package com.sankuai.wme.react.x;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.wme.react.x.api.ReactXParameterModule;
import com.sankuai.wme.react.x.view.video.RTXMRNVideoPlayViewManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class b implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2cc0eb67ca3f732b7e9830a19fb0dc85", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2cc0eb67ca3f732b7e9830a19fb0dc85");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new ReactXParameterModule(reactApplicationContext));
        return arrayList;
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35d99b7b16e86314abb0ede1f2655172", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35d99b7b16e86314abb0ede1f2655172") : Arrays.asList(new RTXMRNVideoPlayViewManager("RTXMRNVideoPlayView"));
    }
}
