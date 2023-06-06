package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNMapArcViewManager extends ViewGroupManager<i> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public i createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "41dbe45d15653adcf6d6a662f0fdf1e4", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "41dbe45d15653adcf6d6a662f0fdf1e4") : new i(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMapArc";
    }

    @ReactProp(name = "displayLevel")
    public void setLevel(i iVar, int i) {
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f2cd89e7a11418b9008658db3e020dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f2cd89e7a11418b9008658db3e020dde");
        } else {
            iVar.setLevel(i);
        }
    }

    @ReactProp(name = "points")
    public void setPoints(i iVar, ReadableMap readableMap) {
        Object[] objArr = {iVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8ecd29df7cc0147c1eb7e7fbf4f5b21e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8ecd29df7cc0147c1eb7e7fbf4f5b21e");
        } else {
            iVar.setPoints(readableMap);
        }
    }

    @ReactProp(customType = "Color", name = "strokeColor")
    public void setStrokeColor(i iVar, int i) {
        Object[] objArr = {iVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "98a2387299dd79e04d10b65644048ef3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "98a2387299dd79e04d10b65644048ef3");
        } else {
            iVar.setStrokeColor(i);
        }
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c1b6df3ac7e3aaf7741eb2a6ee807806", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c1b6df3ac7e3aaf7741eb2a6ee807806");
        } else {
            iVar.setStrokeWidth(f);
        }
    }

    @ReactProp(name = "visible")
    public void setVisible(i iVar, boolean z) {
        Object[] objArr = {iVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "85a1ae13454fef763f666aa5066d2d5b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "85a1ae13454fef763f666aa5066d2d5b");
        } else {
            iVar.setVisible(z);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.b
    @ReactProp(name = "zIndex")
    public void setZIndex(i iVar, float f) {
        Object[] objArr = {iVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2329fb1e0a519d2a15cd2266395d44bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2329fb1e0a519d2a15cd2266395d44bb");
        } else {
            iVar.setZIndex(f);
        }
    }
}
