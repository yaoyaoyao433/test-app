package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.h;
import com.dianping.sdk.pike.i;
import com.dianping.sdk.pike.j;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AddTunnelStateListenerJsHandler extends BaseJsHandler {
    private static final String TAG = "AddTunnelStateListenerJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "RbSPMTBMsO/QGGwr1V8CZL2cYchdwLp0hh4z7Bxi7Hi6fb2NShO1BJp+3ePcDVDo8b88EyJefJ7RjWAeGdwLnA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "381cfa6a507a6ab8109c2964d9a2170a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "381cfa6a507a6ab8109c2964d9a2170a");
            return;
        }
        try {
            i.a(TAG, "knb add tunnel state listener exec");
            String optString = jsBean().argsJson.optString("bzId");
            final a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "73e456ddb4805f385ef126a14066f9dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "73e456ddb4805f385ef126a14066f9dc");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                j jVar = new j() { // from class: com.dianping.sdk.pike.knb.a.5
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.j
                    public final void a() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7ad7caf4813846f63bd99b842ca71690", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7ad7caf4813846f63bd99b842ca71690");
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", "action");
                            jSONObject.put("isReady", true);
                            this.jsCallback(jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }

                    @Override // com.dianping.sdk.pike.j
                    public final void b() {
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "5a913d5e6b0ce8243f031fad41f84aa3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "5a913d5e6b0ce8243f031fad41f84aa3");
                            return;
                        }
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("status", "action");
                            jSONObject.put("isReady", false);
                            this.jsCallback(jSONObject);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                };
                j jVar2 = a.d.get(optString);
                if (jVar2 != null) {
                    h.b(optString, jVar2);
                    a.d.remove(optString);
                }
                a.d.put(optString, jVar);
                h.a(optString, jVar);
                jsCallback();
            }
        } catch (Throwable th) {
            i.a(TAG, "knb add tunnel state listener state ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
