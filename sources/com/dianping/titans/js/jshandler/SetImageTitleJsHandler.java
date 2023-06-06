package com.dianping.titans.js.jshandler;

import com.dianping.titans.client.ImageTitleHelper;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.ui.ITitleContentV2;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetImageTitleJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "befb9dc2dfb4cc6e6a4c9f7b83d5a859", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "befb9dc2dfb4cc6e6a4c9f7b83d5a859");
            return;
        }
        String optString = jsBean().argsJson.optString("imageUrl");
        JsHost jsHost = jsHost();
        if (jsHost == null) {
            jsCallbackError(1, ImageTitleHelper.getErrMsg(1));
            return;
        }
        ITitleBar titleBarHost = jsHost.getTitleBarHost();
        if (titleBarHost == null) {
            jsCallbackError(1, ImageTitleHelper.getErrMsg(3));
            return;
        }
        ITitleContentV2 titleContentV2 = titleBarHost instanceof BaseTitleBar ? ((BaseTitleBar) titleBarHost).getTitleContentV2() : null;
        if (titleContentV2 == null || titleContentV2.isDetachedFromWindow()) {
            jsCallbackError(1, ImageTitleHelper.getErrMsg(3));
        } else {
            ImageTitleHelper.setImgTitle(jsHost().getContext(), titleContentV2, optString, new ImageTitleHelper.ISetTitleListener() { // from class: com.dianping.titans.js.jshandler.SetImageTitleJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.titans.client.ImageTitleHelper.ISetTitleListener
                public void onErr(ITitleContentV2 iTitleContentV2, String str, int i) {
                    Object[] objArr2 = {iTitleContentV2, str, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "f704b3bddb1fe1d877da021b18d95c38", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "f704b3bddb1fe1d877da021b18d95c38");
                    } else if (i == 0) {
                        SetImageTitleJsHandler.this.jsCallback();
                    } else {
                        SetImageTitleJsHandler.this.jsCallbackError(i, ImageTitleHelper.getErrMsg(i));
                    }
                }
            });
        }
    }
}
