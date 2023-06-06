package com.meituan.android.mrn.component.blurview;

import android.view.View;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class BlurViewManager extends SimpleViewManager<a> {
    public static final int DEFAULT_RADIUS = 10;
    public static final int DEFAULT_SAMPLING = 10;
    public static final String REACT_CLASS = "BlurView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public a createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa570623d1eb9c9b0b9d030f3b4714b1", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa570623d1eb9c9b0b9d030f3b4714b1");
        }
        a aVar = new a(aoVar);
        aVar.setBlurRadius(10);
        aVar.setDownsampleFactor(10);
        return aVar;
    }

    @ReactProp(defaultInt = 10, name = "blurRadius")
    public void setRadius(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "61096a3aafe4a70aa45a5ea0313e03d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "61096a3aafe4a70aa45a5ea0313e03d7");
            return;
        }
        aVar.setBlurRadius(i);
        aVar.invalidate();
    }

    @ReactProp(customType = "Color", name = "overlayColor")
    public void setColor(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d3d9757f318d83aea4c9e8c40dee209c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d3d9757f318d83aea4c9e8c40dee209c");
            return;
        }
        aVar.setOverlayColor(i);
        aVar.invalidate();
    }

    @ReactProp(defaultInt = 10, name = "downsampleFactor")
    public void setDownsampleFactor(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "229f1e27916ea2da8902a9f220ed527a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "229f1e27916ea2da8902a9f220ed527a");
        } else {
            aVar.setDownsampleFactor(i);
        }
    }

    @ReactProp(name = "viewRef")
    public void setViewRef(a aVar, int i) {
        Object[] objArr = {aVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c21114d77f204c8fac9a850878e0fe3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c21114d77f204c8fac9a850878e0fe3");
            return;
        }
        View rootView = aVar.getRootView();
        if (rootView != null) {
            aVar.setBlurredView(rootView.findViewById(i));
        }
    }
}
