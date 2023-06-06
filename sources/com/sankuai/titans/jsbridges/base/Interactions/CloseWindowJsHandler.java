package com.sankuai.titans.jsbridges.base.Interactions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class CloseWindowJsHandler extends DeprecatedJsBridge<CloseWindow> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class CloseWindow {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("isCloseViewOnly")
        @Expose
        public int isCloseViewOnly;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(CloseWindow closeWindow) {
        Object[] objArr = {closeWindow};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3522bb625834e5d37ee050612bc7287f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3522bb625834e5d37ee050612bc7287f");
        } else if (closeWindow.isCloseViewOnly == 1) {
            jsHost().getUiManager().onWindowHidden();
        } else {
            jsHost().getUiManager().onActivityFinish();
        }
    }
}
