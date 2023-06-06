package com.sankuai.titans.jsbridges.base.uiextensions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton;
import com.sankuai.titans.protocol.webcompat.jshost.IUIManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetRLButtonJsHandler<TitleButtonParam> extends BaseTitleButtonJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.jsbridges.base.uiextensions.BaseTitleButtonJsHandler
    public ITitleBarButton getTitleBarButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b441d0bc51bb4d4fbcab7a8858076c5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ITitleBarButton) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b441d0bc51bb4d4fbcab7a8858076c5e");
        }
        IUIManager uiManager = jsHost().getUiManager();
        if (uiManager == null || uiManager.getTitleBar() == null) {
            return null;
        }
        return uiManager.getTitleBar().getTitleRLBtn();
    }
}
