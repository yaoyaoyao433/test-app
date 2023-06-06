package com.dianping.gcmrnmodule.components.horizontalScrollBarrier;

import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@ReactModule(name = MRNModuleScrollBarrierManager.REACT_TEXT_CLASS)
/* loaded from: classes.dex */
public class MRNModuleScrollBarrierManager extends ReactViewManager {
    public static final String REACT_TEXT_CLASS = "GCMRNNativeScrollBarrier";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_TEXT_CLASS;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a68780062604b250b5dc7d0d2560668e", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a68780062604b250b5dc7d0d2560668e") : new a(aoVar);
    }

    @ReactProp(name = "scrollBarrierScale")
    public void setScrollBarrierScale(a aVar, double d) {
        Object[] objArr = {aVar, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cbea21073683d3fb5aaa29b9ff0d3be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cbea21073683d3fb5aaa29b9ff0d3be");
        } else {
            aVar.setScrollBarrierScale(d);
        }
    }

    @ReactProp(name = "scrolBarrierDirection")
    public void setScrolBarrierDirection(a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a8db173756538ae231708441f1a5d13a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a8db173756538ae231708441f1a5d13a");
        } else {
            aVar.setScrolBarrierDirection(str);
        }
    }
}
