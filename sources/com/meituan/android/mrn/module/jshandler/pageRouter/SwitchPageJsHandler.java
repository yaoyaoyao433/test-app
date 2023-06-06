package com.meituan.android.mrn.module.jshandler.pageRouter;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.meituan.android.mrn.container.MRNBaseActivity;
import com.meituan.android.mrn.engine.n;
import com.meituan.android.mrn.router.a;
import com.meituan.android.mrn.utils.ai;
import com.meituan.android.mrn.utils.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SwitchPageJsHandler extends PageRouterBaseJsHandler {
    public static final String KEY = "MRN.switchPage";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.meituan.android.mrn.module.jshandler.pageRouter.PageRouterBaseJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c257e28f94dc1b482415d71f682daaac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c257e28f94dc1b482415d71f682daaac");
            return;
        }
        super.exec();
        ai.a(new Runnable() { // from class: com.meituan.android.mrn.module.jshandler.pageRouter.SwitchPageJsHandler.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cb54a462cf838f0de159b12aba20b4dc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cb54a462cf838f0de159b12aba20b4dc");
                } else {
                    SwitchPageJsHandler.this.execOnUiThread();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void execOnUiThread() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05b4b52975006031b38c73b43cf709ae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05b4b52975006031b38c73b43cf709ae");
            return;
        }
        JSONObject jSONObject = this.mJsBean.argsJson;
        String optString = jSONObject.optString("id");
        String optString2 = jSONObject.optString("url");
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("options");
        try {
            a a = this.mPageRouter.a(optString, optString2, g.b(optJSONObject), convertOpenPageOption(optJSONObject2));
            if (a != null && a.b) {
                MRNBaseActivity mRNBaseActivity = (MRNBaseActivity) a.a();
                WritableMap createMap = Arguments.createMap();
                createMap.putString("id", optString);
                createMap.putString("url", optString2);
                createMap.putMap("params", g.a(optJSONObject));
                if (optJSONObject2 != null) {
                    createMap.putMap("options", (ReadableMap) g.a(optJSONObject2));
                }
                if (mRNBaseActivity.e != null) {
                    createMap.putInt("rootTag", mRNBaseActivity.e.e());
                }
                n.a(mRNBaseActivity.l(), "containerDidSwitched", createMap);
            }
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("action", "startActivity");
                jsCallback(jSONObject2);
            } catch (Exception e) {
                jsCallbackErrorMsg(e.getMessage());
                com.facebook.common.logging.a.d("MRNInfoJsHandler", e.getMessage(), e);
            }
        } catch (Throwable th) {
            jsCallbackError(th);
        }
    }
}
