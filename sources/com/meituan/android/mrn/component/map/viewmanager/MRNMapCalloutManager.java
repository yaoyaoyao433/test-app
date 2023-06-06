package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.c;
import com.meituan.android.mrn.component.map.view.childview.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNMapCalloutManager extends ViewGroupManager<c> {
    public static final String EVENT_ON_CALLOUT_PRESS = "onCalloutPress";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9f3ee1c9961157e8a7600e6a312e9e58", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9f3ee1c9961157e8a7600e6a312e9e58") : new SizeReportingShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public c createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "30a65891a442550b35359e51816e5823", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "30a65891a442550b35359e51816e5823") : new c(aoVar);
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0bc6b2b5cba7ad2d092853f512616322", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0bc6b2b5cba7ad2d092853f512616322") : com.facebook.react.common.c.b().a(EVENT_ON_CALLOUT_PRESS, com.facebook.react.common.c.a("registrationName", EVENT_ON_CALLOUT_PRESS)).a();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMapCallout";
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(c cVar, Object obj) {
        Object[] objArr = {cVar, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b786dd5c6c32e91da5952c890414d5e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b786dd5c6c32e91da5952c890414d5e5");
            return;
        }
        Map map = (Map) obj;
        float floatValue = ((Float) map.get("width")).floatValue();
        float floatValue2 = ((Float) map.get("height")).floatValue();
        cVar.b = (int) floatValue;
        cVar.c = (int) floatValue2;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c.a;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect3, false, "5ec184b8757f1ae76d7e6e2ce90ad3bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect3, false, "5ec184b8757f1ae76d7e6e2ce90ad3bc");
        } else if (cVar.d != null) {
            f fVar = cVar.d;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = f.a;
            if (PatchProxy.isSupport(objArr3, fVar, changeQuickRedirect4, false, "d840e5f405edb604590a903931907b2e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, fVar, changeQuickRedirect4, false, "d840e5f405edb604590a903931907b2e");
            } else if (fVar.b) {
                fVar.f();
            }
        }
    }
}
