package com.sankuai.waimai.business.restaurant.composeorder.rn;

import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ao;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WMRNShareChannelViewManager extends SimpleViewManager<b> {
    private static final String MANAGER_NAME = "ShareChannelView";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return MANAGER_NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public b createViewInstance(ao aoVar) {
        Object[] objArr = {aoVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "90631cacf85579358da82d2670771ba9", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "90631cacf85579358da82d2670771ba9");
        }
        if (aoVar == null || !aoVar.hasCurrentActivity()) {
            return null;
        }
        return new b(aoVar, MANAGER_NAME);
    }
}
