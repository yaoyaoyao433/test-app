package com.meituan.android.legwork.mrn.reactPackage;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.i;
import com.facebook.react.uimanager.ViewManager;
import com.meituan.android.legwork.mrn.view.ReactTopHorizontalScrollContainerViewManager;
import com.meituan.android.legwork.mrn.view.ReactTopHorizontalScrollViewManager;
import com.meituan.android.legwork.mrn.view.ReactTopScrollViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class d implements i {
    public static ChangeQuickRedirect a;

    @Override // com.facebook.react.i
    public final List<NativeModule> createNativeModules(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06f1fa373c926a54b2cf4e2ac033ce7e", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06f1fa373c926a54b2cf4e2ac033ce7e") : Collections.emptyList();
    }

    @Override // com.facebook.react.i
    public final List<ViewManager> createViewManagers(ReactApplicationContext reactApplicationContext) {
        Object[] objArr = {reactApplicationContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba02c4198502800adb29f52b20cb24dc", RobustBitConfig.DEFAULT_VALUE) ? (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba02c4198502800adb29f52b20cb24dc") : Arrays.asList(new ReactTopScrollViewManager(), new ReactTopHorizontalScrollViewManager(), new ReactTopHorizontalScrollContainerViewManager());
    }
}
