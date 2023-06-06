package com.meituan.android.mrn.component.list.item;

import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MListViewFooterManager extends ViewGroupManager<c> {
    public static final String COMPONENT_NAME = "MRNListViewFooter";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return COMPONENT_NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public c createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6bbc5cc7dab9808c4de22b4e52cb0965", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6bbc5cc7dab9808c4de22b4e52cb0965") : new c(aoVar);
    }
}
