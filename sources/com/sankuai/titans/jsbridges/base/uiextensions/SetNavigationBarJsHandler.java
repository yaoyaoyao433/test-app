package com.sankuai.titans.jsbridges.base.uiextensions;

import android.text.TextUtils;
import com.dianping.shield.dynamic.utils.DMKeys;
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
public class SetNavigationBarJsHandler extends DeprecatedJsBridge<NavigationBarParam> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(NavigationBarParam navigationBarParam) {
        Object[] objArr = {navigationBarParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cdffed999e8452bf7c4fdd9cc62a0da6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cdffed999e8452bf7c4fdd9cc62a0da6");
        } else {
            jsHost().getUiManager().setNavigationBar(navigationBarParam.getFgColor(), navigationBarParam.getBackgroundColor(), navigationBarParam.animated, new ITitleBarActionCallback() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.SetNavigationBarJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onSuccess() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2bac89db9a992bf86e636e9b32e6b25f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2bac89db9a992bf86e636e9b32e6b25f");
                    } else {
                        SetNavigationBarJsHandler.this.jsCallback(new RespResult.Builder().create());
                    }
                }

                @Override // com.sankuai.titans.protocol.webcompat.elements.ITitleBarActionCallback
                public void onFail(int i, String str) {
                    Object[] objArr2 = {Integer.valueOf(i), str};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "52a11137f39867ab7dc1488c4c8ec89a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "52a11137f39867ab7dc1488c4c8ec89a");
                    } else {
                        SetNavigationBarJsHandler.this.jsCallback(new RespResult.Builder().setResultInfo(i, str).create());
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class NavigationBarParam {
        public static ChangeQuickRedirect changeQuickRedirect;
        @SerializedName(DMKeys.KEY_SHARE_INFO_ANIMATED)
        @Expose
        public boolean animated;
        @SerializedName("backgroundColor")
        @Expose
        private String backgroundColor;
        @SerializedName("color")
        @Expose
        private String color;

        public String getBackgroundColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69a6d52a266447426d46e9b31a7bd32c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69a6d52a266447426d46e9b31a7bd32c") : TextUtils.isEmpty(this.backgroundColor) ? "#FFFFFF" : this.backgroundColor;
        }

        public String getFgColor() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0341559d211b9347dd9ee7210bf2e37", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0341559d211b9347dd9ee7210bf2e37") : TextUtils.isEmpty(this.color) ? "#222222" : this.color;
        }
    }
}
