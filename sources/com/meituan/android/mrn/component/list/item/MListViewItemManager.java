package com.meituan.android.mrn.component.list.item;

import com.facebook.react.uimanager.ao;
import com.facebook.react.views.view.ReactViewManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import javax.annotation.Nonnull;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class MListViewItemManager extends ReactViewManager {
    public static final String COMPONENT_NAME = "MRNListViewCell";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    @Nonnull
    public String getName() {
        return COMPONENT_NAME;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public e createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2847f261d36e6cbba436a16e9b9be23", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2847f261d36e6cbba436a16e9b9be23") : new e(aoVar);
    }
}
