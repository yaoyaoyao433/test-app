package com.sankuai.titans.jsbridges.base.uiextensions;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
import com.sankuai.titans.protocol.webcompat.jshost.IUIManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetSearchBarJsHandler extends DeprecatedJsBridge {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "46e0d4b039236dcb2bde73298af60ec1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "46e0d4b039236dcb2bde73298af60ec1");
            return;
        }
        IUIManager uiManager = jsHost().getUiManager();
        SearchTitleContent searchTitleContent = new SearchTitleContent(jsHost().getActivity());
        searchTitleContent.setTitleContentParams(this.argsJson);
        uiManager.setTitleContent(searchTitleContent, new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetSearchBarJsHandler.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
            public void onSuccess() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2f55a22ebce6c76439184b67665af45f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2f55a22ebce6c76439184b67665af45f");
                } else {
                    SetSearchBarJsHandler.this.jsCallback(new RespResult.Builder().create());
                }
            }

            @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
            public void onFail(int i, String str) {
                Object[] objArr2 = {Integer.valueOf(i), str};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "aa901503f82af1b2f49c705d2e204f45", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "aa901503f82af1b2f49c705d2e204f45");
                } else {
                    SetSearchBarJsHandler.this.jsCallback(new RespResult.Builder().setCode(i).setMsg(str).create());
                }
            }
        });
    }
}
