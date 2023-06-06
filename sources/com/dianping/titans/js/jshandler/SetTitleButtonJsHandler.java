package com.dianping.titans.js.jshandler;

import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.dianping.picasso.PicassoUtils;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.ui.TitansUIManager;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.jsbridges.base.uiextensions.BaseTitleButtonJsHandler;
import com.sankuai.waimai.launcher.util.image.a;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class SetTitleButtonJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Bitmap mBitmap;
    protected View.OnClickListener mDefaultClickListener;
    protected boolean mDisable;
    protected String mIcon;
    protected String mText;
    protected String mType;

    public abstract void setTitleButton();

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        int identifier;
        String substring;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bad4ac8501768241a5196a1af5e9363d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bad4ac8501768241a5196a1af5e9363d");
            return;
        }
        this.mText = jsBean().argsJson.optString("text");
        this.mIcon = jsBean().argsJson.optString(RemoteMessageConst.Notification.ICON);
        this.mType = jsBean().argsJson.optString("type");
        byte[] bArr = null;
        this.mBitmap = null;
        this.mDefaultClickListener = null;
        if (TextUtils.isEmpty(this.mType)) {
            this.mType = "native";
        }
        if ("base64".equals(this.mType)) {
            int indexOf = this.mIcon.indexOf("base64,");
            if (indexOf < 0) {
                substring = this.mIcon;
            } else {
                substring = this.mIcon.substring(indexOf + 7);
            }
            try {
                bArr = Base64.decode(substring, 0);
            } catch (Exception e) {
                jsCallbackErrorMsg("exception e = " + e.getMessage());
            }
            if (bArr == null) {
                jsCallbackErrorMsg("base64 image resource failed.");
                return;
            }
            try {
                this.mBitmap = a.a(bArr, 0, bArr.length);
            } catch (Exception unused) {
            }
        } else if ("native".equals(this.mType) || "url".equals(this.mType)) {
            if (BaseTitleButtonJsHandler.ACTION_TYPE_SHARE.equals(this.mIcon)) {
                this.mIcon = "android.resource://" + jsHost().getContext().getApplicationContext().getPackageName() + "/" + uiManager().getShareIconId();
                if ("0".equals(jsBean().callbackId)) {
                    this.mDefaultClickListener = new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetTitleButtonJsHandler.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "ce3b73f2b2dd9d5d28a058b3a0169bf3", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "ce3b73f2b2dd9d5d28a058b3a0169bf3");
                            } else {
                                SetTitleButtonJsHandler.this.jsHost().share();
                            }
                        }
                    };
                }
            } else if (BaseTitleButtonJsHandler.ACTION_TYPE_BACK.equals(this.mIcon)) {
                this.mIcon = "android.resource://" + jsHost().getContext().getApplicationContext().getPackageName() + "/" + uiManager().getBackIconId();
                if ("0".equals(jsBean().callbackId)) {
                    this.mDefaultClickListener = new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetTitleButtonJsHandler.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "3b3122190c8e954811d23e93decaad56", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "3b3122190c8e954811d23e93decaad56");
                            } else {
                                SetTitleButtonJsHandler.this.jsHost().goBack();
                            }
                        }
                    };
                }
            } else if (BaseTitleButtonJsHandler.ACTION_TYPE_SEARCH.equals(this.mIcon)) {
                this.mIcon = "android.resource://" + jsHost().getContext().getApplicationContext().getPackageName() + "/" + uiManager().getSearchIconId();
            } else if (BaseTitleButtonJsHandler.ACTION_TYPE_CUSTOM_BACK.equals(this.mIcon)) {
                this.mIcon = "android.resource://" + jsHost().getContext().getApplicationContext().getPackageName() + "/" + uiManager().getCustomBackIconId();
                if ("0".equals(jsBean().callbackId)) {
                    this.mDefaultClickListener = new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetTitleButtonJsHandler.3
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // android.view.View.OnClickListener
                        public void onClick(View view) {
                            Object[] objArr2 = {view};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "25335b1a389763cdb89c1e600b455619", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "25335b1a389763cdb89c1e600b455619");
                            } else {
                                SetTitleButtonJsHandler.this.jsHost().goBack();
                            }
                        }
                    };
                }
            } else if (!TextUtils.isEmpty(this.mIcon) && (identifier = jsHost().getContext().getResources().getIdentifier(this.mIcon.toLowerCase(), PicassoUtils.DEF_TYPE, jsHost().getContext().getApplicationContext().getPackageName())) > 0) {
                this.mIcon = "android.resource://" + jsHost().getContext().getApplicationContext().getPackageName() + "/" + identifier;
            }
        }
        this.mDisable = jsBean().argsJson.optInt("disable") == 1;
        setTitleButton();
        jsCallback();
    }

    private TitansUIManager uiManager() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "203e0b62d229bd16d3e9ff341db19128", RobustBitConfig.DEFAULT_VALUE) ? (TitansUIManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "203e0b62d229bd16d3e9ff341db19128") : ((KNBJsHost) jsHost()).getUIManager();
    }
}
