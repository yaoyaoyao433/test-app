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
public class SetRRButtonJsHandler extends SetTitleButtonJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.SetTitleButtonJsHandler
    public void setTitleButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ceffc52f2f36034c5938adc78a4bc5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ceffc52f2f36034c5938adc78a4bc5ad");
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
                baseTitleBar.mButtonRR.fallbackUi();
                return;
            }
        } else if (titleBarHost == null) {
            return;
        }
        if (this.mBitmap != null) {
            titleBarHost.setRRButton(this.mBitmap, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetRRButtonJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7b30badcdb399afabb6328ef68f4c8cc", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7b30badcdb399afabb6328ef68f4c8cc");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("status", "action");
                    } catch (JSONException unused) {
                    }
                    SetRRButtonJsHandler.this.jsCallback(jSONObject);
                }
            });
            this.mBitmap = null;
            return;
        }
        titleBarHost.setRRButton(this.mText, this.mIcon, this.mDisable, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetRRButtonJsHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "184b53b8f401d0458e3893b22ffb7cf4", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "184b53b8f401d0458e3893b22ffb7cf4");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "action");
                } catch (JSONException unused) {
                }
                SetRRButtonJsHandler.this.jsCallback(jSONObject);
            }
        });
    }
}
