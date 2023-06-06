package com.meituan.android.legwork.mrn.reactPackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.legwork.mrn.view.ReactHorizontalNestedScrollContainerViewManager;
import com.meituan.android.legwork.mrn.view.ReactHorizontalNestedScrollViewManager;
import com.meituan.android.legwork.mrn.view.ReactInnerScrollViewManager;
import com.meituan.android.legwork.mrn.view.ReactNestedScrollViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class c implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e63a38ffeebed94704f5f5ba03326ce", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e63a38ffeebed94704f5f5ba03326ce") : Collections.emptyList();
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9cd84ddaab65e5bbc79eed47feb5ac84", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9cd84ddaab65e5bbc79eed47feb5ac84") : Arrays.asList(new ReactNestedScrollViewManager(), new ReactHorizontalNestedScrollViewManager(), new ReactHorizontalNestedScrollContainerViewManager(), new ReactInnerScrollViewManager());
    }
}
