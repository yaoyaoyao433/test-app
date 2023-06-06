package com.sankuai.titans.jsbridges.base.uiextensions;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class SetImageTitleJsHandler extends DeprecatedJsBridge<SetImageTitle> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class SetImageTitle {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName("imageUrl")
        @Expose
        public String imageUrl;
    }

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(SetImageTitle setImageTitle) {
        Object[] objArr = {setImageTitle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "503fab86aee35defbde64dbd22262e1d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "503fab86aee35defbde64dbd22262e1d");
        } else if (jsHost() == null || jsHost().getUiManager() == null) {
            jsCallback(new RespResult.Builder().setResultInfo(1, "no host").create());
        } else {
            jsHost().getUiManager().setImgTitle(setImageTitle.imageUrl, new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetImageTitleJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "19fac1a91be4f58afc4195f9fba06e68", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "19fac1a91be4f58afc4195f9fba06e68");
                    } else {
                        SetImageTitleJsHandler.this.jsCallback(new RespResult.Builder().create());
                    }
                }

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onFail(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e82fd6dfa218adbe2d97fa5347c5be22", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e82fd6dfa218adbe2d97fa5347c5be22");
                    } else {
                        SetImageTitleJsHandler.this.jsCallback(new RespResult.Builder().setResultInfo(i, str).create());
                    }
                }
            });
        }
    }
}
