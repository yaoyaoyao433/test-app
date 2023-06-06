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
public class SetLLButtonJsHandler extends SetTitleButtonJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.SetTitleButtonJsHandler
    public void setTitleButton() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10d70f3a021ab1de326acea8aa3fc0a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10d70f3a021ab1de326acea8aa3fc0a4");
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
                baseTitleBar.mButtonLL.fallbackUi();
                return;
            }
        } else if (titleBarHost == null) {
            return;
        }
        if (this.mBitmap != null) {
            titleBarHost.setLLButton(this.mBitmap, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetLLButtonJsHandler.1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    Object[] objArr2 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d4d5ea4201b4a6168d8b560cea179d17", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d4d5ea4201b4a6168d8b560cea179d17");
                        return;
                    }
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put("status", "action");
                    } catch (JSONException unused) {
                    }
                    SetLLButtonJsHandler.this.jsCallback(jSONObject);
                }
            });
            this.mBitmap = null;
            return;
        }
        titleBarHost.setLLButton(this.mText, this.mIcon, this.mDisable, "0".equals(jsBean().callbackId) ? this.mDefaultClickListener : new View.OnClickListener() { // from class: com.dianping.titans.js.jshandler.SetLLButtonJsHandler.2
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                Object[] objArr2 = {view};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0d643c90ecd36643f6cc098012cb13c9", 4611686018427387906L)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0d643c90ecd36643f6cc098012cb13c9");
                    return;
                }
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("status", "action");
                } catch (JSONException unused) {
                }
                SetLLButtonJsHandler.this.jsCallback(jSONObject);
            }
        });
    }
}
