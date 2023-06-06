package com.sankuai.waimai.business.knb.bridge;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.mmp.lib.engine.o;
import com.meituan.mmp.main.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MSCPreload extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "pCQce+PMSUhBqY+FM34iZ/uojUIBrkED7Uw+feBPwEp1zBjubOqMxsMcuWlHlvZyMYjzjFNj03X7jLWnqmj4vQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3ca835deb62a8aa0e4f50395a6d50977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3ca835deb62a8aa0e4f50395a6d50977");
        } else if (validateArgs()) {
            String optString = jsBean().argsJson.optString("appId");
            String optString2 = jsBean().argsJson.optString("source");
            String optString3 = jsBean().argsJson.optString("mmpPreLoadType");
            o.a(optString, TextUtils.isEmpty(optString3) ? 3 : Integer.parseInt(optString3), optString2, false, new a<Void>() { // from class: com.sankuai.waimai.business.knb.bridge.MSCPreload.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.mmp.main.a
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr2 = {null};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "7aa850ca65d6fd0c598ff78f0627c82f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "7aa850ca65d6fd0c598ff78f0627c82f");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "success");
                        MSCPreload.this.jsCallback(jSONObject);
                    } catch (Exception unused) {
                    }
                }

                @Override // com.meituan.mmp.main.a
                public final void a(String str, Exception exc) {
                    Object[] objArr2 = {str, exc};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0a9b7609215284a48582da6a8ba90a54", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0a9b7609215284a48582da6a8ba90a54");
                        return;
                    }
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("status", "fail");
                        MSCPreload.this.jsCallback(jSONObject);
                    } catch (Exception unused) {
                    }
                }
            });
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8af0f3dcba399313165902405436f4de", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8af0f3dcba399313165902405436f4de")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
