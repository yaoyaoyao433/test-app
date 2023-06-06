package com.meituan.android.mrn.component.list.item;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MListViewHeaderManager extends ViewGroupManager<d> {
    public static final String COMPONENT_NAME = "MRNListViewHeader";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return COMPONENT_NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public d createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6efcbbdc6d99355664bf05742c5433c2", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6efcbbdc6d99355664bf05742c5433c2") : new d(aoVar);
    }
}
