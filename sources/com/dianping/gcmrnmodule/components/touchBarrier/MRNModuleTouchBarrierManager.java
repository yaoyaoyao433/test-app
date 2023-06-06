package com.dianping.gcmrnmodule.components.touchBarrier;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleTouchBarrierManager.REACT_TEXT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleTouchBarrierManager extends ReactViewManager {
    public static final String REACT_TEXT_CLASS = "GCMRNNativeTouchBarrier";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_TEXT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9657027d1ce4e1ace8c6ae8920f6cb48", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9657027d1ce4e1ace8c6ae8920f6cb48") : new a(aoVar);
    }

    @ReactProp(name = "enabled")
    public void setBarrierEnabled(a aVar, boolean z) {
        Object[] objArr = {aVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f485d7edeab02e52101cdbb70d028a32", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f485d7edeab02e52101cdbb70d028a32");
        } else {
            aVar.setBarrierEnabled(z);
        }
    }
}
