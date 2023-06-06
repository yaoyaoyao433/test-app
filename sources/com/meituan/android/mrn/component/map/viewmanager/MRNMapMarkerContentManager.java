package com.meituan.android.mrn.component.map.viewmanager;

import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.ao;
import com.meituan.android.mrn.component.map.view.childview.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import javax.annotation.Nonnull;
/* loaded from: classes2.dex */
public class MRNMapMarkerContentManager extends ViewGroupManager<e> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "802d6c4061f03a126b89355ce6a8ecdb", RobustBitConfig.DEFAULT_VALUE) ? (LayoutShadowNode) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "802d6c4061f03a126b89355ce6a8ecdb") : new SizeReportingShadowNode();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    @Nonnull
    public e createViewInstance(@Nonnull ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a31e7976c4dfd2eb98d074eba420284b", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a31e7976c4dfd2eb98d074eba420284b") : new e(aoVar);
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return "MRNMapMarkerContent";
    }

    @ReactProp(name = "useChild")
    public void setUseChild(e eVar, boolean z) {
        Object[] objArr = {eVar, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e37d90168bbe0cb159f97447ff3034a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e37d90168bbe0cb159f97447ff3034a");
        } else {
            eVar.setUseChild(z);
        }
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager
    public void updateExtraData(e eVar, Object obj) {
        boolean z = false;
        Object[] objArr = {eVar, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "06ad0fb93e3229ab2d86411417d849ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "06ad0fb93e3229ab2d86411417d849ae");
            return;
        }
        HashMap hashMap = (HashMap) obj;
        int floatValue = (int) ((Float) hashMap.get("width")).floatValue();
        int floatValue2 = (int) ((Float) hashMap.get("height")).floatValue();
        Object[] objArr2 = {Integer.valueOf(floatValue), Integer.valueOf(floatValue2)};
        ChangeQuickRedirect changeQuickRedirect3 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect3, false, "0cc7d829a913893519aefb9c19a3603a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect3, false, "0cc7d829a913893519aefb9c19a3603a");
            return;
        }
        eVar.d = floatValue;
        eVar.e = floatValue2;
        if (eVar.e > 0 && eVar.d > 0) {
            z = true;
        }
        eVar.b = z;
        if (eVar.c != null) {
            eVar.c.a();
        }
    }
}
