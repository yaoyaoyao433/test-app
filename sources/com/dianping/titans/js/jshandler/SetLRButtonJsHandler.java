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
public class SetLRButtonJsHandler extends SetTitleButtonJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.SetTitleButtonJsHandler
    public void setTitleButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "945d80e135a824c5eedab04260ab98f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "945d80e135a824c5eedab04260ab98f3");
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
                baseTitleBar.mButtonLR.fallbackUi();
                return;
            }
        } else if (titleBarHost == null) {
            return;
        }
        if (this.mBitmap != null) {
            titleBarHost.setLRButton(this.mBitmap, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetLRButtonJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "8c4a152ec1a198c03eb6a5521630959e", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "8c4a152ec1a198c03eb6a5521630959e");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("status", "action");
                    } catch (JSONException unused) {
                    }
                    SetLRButtonJsHandler.this.jsCallback(jSONObject);
                }
            });
            this.mBitmap = null;
            return;
        }
        titleBarHost.setLRButton(this.mText, this.mIcon, this.mDisable, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetLRButtonJsHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e005a79a61719466562499af614595a5", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e005a79a61719466562499af614595a5");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "action");
                } catch (JSONException unused) {
                }
                SetLRButtonJsHandler.this.jsCallback(jSONObject);
            }
        });
    }
}
