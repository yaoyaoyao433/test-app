package com.dianping.titans.js.jshandler;

import android.view.View;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.ui.ITitleBar;
import com.dianping.titans.widget.BaseTitleBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetRLButtonJsHandler extends SetTitleButtonJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.SetTitleButtonJsHandler
    public void setTitleButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8a4bcdc49572b1afe1b2e37ca38b7b3f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8a4bcdc49572b1afe1b2e37ca38b7b3f");
            return;
        }
        JsHost jsHost = jsHost();
        if (jsHost == null) {
            return;
        }
        ITitleBar titleBarHost = jsHost.getTitleBarHost();
        if (titleBarHost instanceof BaseTitleBar) {
            BaseTitleBar baseTitleBar = (BaseTitleBar) titleBarHost;
            if (this.mDisable) {
                baseTitleBar.mButtonRL.fallbackUi();
                return;
            }
        } else if (titleBarHost == null) {
            return;
        }
        if (this.mBitmap != null) {
            titleBarHost.setRLButton(this.mBitmap, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetRLButtonJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "1ea09f0c7a7452531c40bd1315f401ed", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "1ea09f0c7a7452531c40bd1315f401ed");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("status", "action");
                    } catch (JSONException unused) {
                    }
                    SetRLButtonJsHandler.this.jsCallback(jSONObject);
                }
            });
            this.mBitmap = null;
            return;
        }
        titleBarHost.setRLButton(this.mText, this.mIcon, this.mDisable, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetRLButtonJsHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7d31b2b0f66d648409ccf509a1b718b3", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7d31b2b0f66d648409ccf509a1b718b3");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "action");
                } catch (JSONException unused) {
                }
                SetRLButtonJsHandler.this.jsCallback(jSONObject);
            }
        });
    }
}
