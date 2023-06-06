package com.sankuai.titans.jsbridges.base.uiextensions;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import com.dianping.picasso.PicassoUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.titans.protocol.jsbridge.DeprecatedJsBridge;
import com.sankuai.titans.protocol.jsbridge.JsHandlerResultInfo;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarButton;
import com.sankuai.titans.protocol.webcompat.elements.ITitleBarUISettings;
import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import com.sankuai.titans.protocol.webcompat.jshost.IUIManager;
import com.sankuai.waimai.launcher.util.image.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public abstract class BaseTitleButtonJsHandler extends DeprecatedJsBridge<TitleButtonParam> {
    public static final String ACTION_TYPE_BACK = "H5_Back";
    public static final String ACTION_TYPE_CUSTOM_BACK = "H5_Custom_Back";
    public static final String ACTION_TYPE_SEARCH = "H5_Search";
    public static final String ACTION_TYPE_SHARE = "H5_Share";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected Bitmap mBitmap;
    protected View.OnClickListener mDefaultClickListener;
    protected String mIcon;
    protected String mText;
    protected String mType;

    public abstract ITitleBarButton getTitleBarButton();

    @Override // com.sankuai.titans.protocol.jsbridge.AbsJsHandler
    public void doExecAsync(TitleButtonParam titleButtonParam) {
        int identifier;
        String substring;
        Object[] objArr = {titleButtonParam};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38cea12df3cf2279f0826ac5cd80ca6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38cea12df3cf2279f0826ac5cd80ca6c");
            return;
        }
        this.mText = titleButtonParam.text != null ? titleButtonParam.text : "";
        this.mIcon = titleButtonParam.icon != null ? titleButtonParam.icon : "";
        this.mType = titleButtonParam.type != null ? titleButtonParam.type : "";
        this.mBitmap = null;
        AbsJsHost jsHost = jsHost();
        IUIManager uiManager = jsHost.getUiManager();
        Context context = jsHost.getContext();
        this.mDefaultClickListener = null;
        ITitleBarButton titleBarButton = getTitleBarButton();
        if (titleBarButton != null) {
            if (titleButtonParam.disable == 1) {
                titleBarButton.fallbackUi();
            } else {
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
                        byte[] decode = Base64.decode(substring, 0);
                        if (decode == null) {
                            jsCallback(new RespResult.Builder().setResultInfo(JsHandlerResultInfo.Error_UNKNOWN.code(), "base64 image resource failed.").create());
                            return;
                        }
                        try {
                            this.mBitmap = a.a(decode, 0, decode.length);
                        } catch (Exception unused) {
                        }
                    } catch (Exception e) {
                        RespResult.Builder builder = new RespResult.Builder();
                        int code = JsHandlerResultInfo.Error_UNKNOWN.code();
                        jsCallback(builder.setResultInfo(code, "exception e = " + e.getMessage()).create());
                        return;
                    }
                } else if (("native".equals(this.mType) || "url".equals(this.mType)) && uiManager.getTitleBar() != null) {
                    String packageName = context.getPackageName();
                    ITitleBarUISettings titleBarUISettings = uiManager.getTitleBarUISettings();
                    if (ACTION_TYPE_SHARE.equals(this.mIcon)) {
                        this.mIcon = "android.resource://" + packageName + "/" + titleBarUISettings.getTitleBarShareIconId();
                    } else if (ACTION_TYPE_BACK.equals(this.mIcon)) {
                        this.mIcon = "android.resource://" + packageName + "/" + titleBarUISettings.getTitleBarBackIconId();
                    } else if (ACTION_TYPE_SEARCH.equals(this.mIcon)) {
                        this.mIcon = "android.resource://" + packageName + "/" + titleBarUISettings.getTitleBarSearchIconId();
                    } else if (ACTION_TYPE_CUSTOM_BACK.equals(this.mIcon)) {
                        this.mIcon = "android.resource://" + packageName + "/" + titleBarUISettings.getTitleBarCustomBackIconId();
                    } else if (!TextUtils.isEmpty(this.mIcon) && (identifier = jsHost().getContext().getResources().getIdentifier(this.mIcon.toLowerCase(), PicassoUtils.DEF_TYPE, packageName)) > 0) {
                        this.mIcon = "android.resource://" + packageName + "/" + identifier;
                    }
                }
                if (this.mBitmap == null) {
                    titleBarButton.initBtnResources(this.mText, this.mIcon);
                } else {
                    titleBarButton.setIcon(this.mBitmap);
                    this.mBitmap = null;
                }
                titleBarButton.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.titans.jsbridges.base.uiextensions.BaseTitleButtonJsHandler.1
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        Object[] objArr2 = {view};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "849f63a8fbeeb4d3899f100d558908ef", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "849f63a8fbeeb4d3899f100d558908ef");
                        } else {
                            BaseTitleButtonJsHandler.this.jsCallback(new RespResult.Builder().setStatus("action").create());
                        }
                    }
                });
            }
        }
        jsCallback(new RespResult.Builder().create());
    }
}
