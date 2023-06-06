package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNMapCircleViewManager extends ViewGroupManager<b> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public b createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76a49497e54d42b254c7f0ebfeabdfb5", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76a49497e54d42b254c7f0ebfeabdfb5") : new b(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMapCircle";
    }

    @ReactProp(name = "center")
    public void setCenter(b bVar, ReadableMap readableMap) {
        Object[] objArr = {bVar, readableMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b46097a3f27c52512adc5d854222dcb5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b46097a3f27c52512adc5d854222dcb5");
        } else {
            bVar.setCenter(readableMap);
        }
    }

    @ReactProp(name = "displayLevel")
    public void setDisplayLevel(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "614be398fc4be157c6b6514e0f19f5d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "614be398fc4be157c6b6514e0f19f5d7");
        } else {
            bVar.setDisplayLevel(i);
        }
    }

    @ReactProp(customType = "Color", name = "fillColor")
    public void setFillColor(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4be0449cb7c3751810ae523e36449bc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4be0449cb7c3751810ae523e36449bc6");
        } else {
            bVar.setFillColor(i);
        }
    }

    @ReactProp(defaultFloat = 0.0f, name = "radius")
    public void setRadius(b bVar, float f) {
        Object[] objArr = {bVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "53c13310addad21c33fa843585b305a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "53c13310addad21c33fa843585b305a3");
        } else {
            bVar.setRadius(f);
        }
    }

    @ReactProp(customType = "Color", name = "strokeColor")
    public void setStrokeColor(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "01e3b044323d6a2ce43aafdd50749d44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "01e3b044323d6a2ce43aafdd50749d44");
        } else {
            bVar.setStrokeColor(i);
        }
    }

    @ReactProp(name = "strokeWidth")
    public void setStrokeWidth(b bVar, float f) {
        Object[] objArr = {bVar, Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5dc8824b2e3de5de7e2658bfba5b9c9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5dc8824b2e3de5de7e2658bfba5b9c9b");
        } else {
            bVar.setStrokeWidth(f);
        }
    }

    @ReactProp(defaultBoolean = true, name = "visible")
    public void setVisible(b bVar, boolean z) {
        Object[] objArr = {bVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eedf71f7ee54e76ea02ac75ce8b095bf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eedf71f7ee54e76ea02ac75ce8b095bf");
        } else {
            bVar.setVisible(z);
        }
    }

    @ReactProp(defaultInt = 0, name = "zIndex")
    public void setZIndex(b bVar, int i) {
        Object[] objArr = {bVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "289e678e391d0d1f05113af0583adec2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "289e678e391d0d1f05113af0583adec2");
        } else {
            bVar.setZIndex(i);
        }
    }
}
