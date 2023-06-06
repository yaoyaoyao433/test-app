package com.sankuai.eh.component.web.bridge;

import android.text.TextUtils;
import com.dianping.titans.js.JsBridgeResult;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.reflect.TypeToken;
import com.meituan.android.common.statistics.ipc.RequestIDMap;
import com.meituan.android.neohybrid.core.config.UIConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.database.b;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.b;
import com.sankuai.eh.component.service.utils.f;
import com.sankuai.eh.component.web.module.h;
import com.sankuai.eh.component.web.plugins.e;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.ap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class EHReportJsHandler extends EHBaseJsHandler {
    private static final int CAN_I_USE_BINGO = 100;
    private static final int CAN_I_USE_ILLEGAL = 102;
    private static final int CAN_I_USE_NO = 101;
    public static ChangeQuickRedirect changeQuickRedirect;
    private static final String[] supportsOnly = {UIConfig.MODAL};
    private static final String[] supportsAll = {"ocr_idcard", "finParams"};

    @Override // com.sankuai.eh.component.web.bridge.EHBaseJsHandler
    public void innerExec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97533abe24110690b55e4fd53ed6a5ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97533abe24110690b55e4fd53ed6a5ad");
            return;
        }
        d.b("eh_report 调起");
        String optString = jsBean().argsJson.optString("method");
        if ("debug".equals(optString)) {
            handleDebugIntent();
        } else if ("caniuse".equals(optString)) {
            handleCanIUse();
        } else if (this.cContext != null) {
            if ("recorder_h5".equals(optString)) {
                handleRecorderIntent();
                return;
            }
            String optString2 = jsBean().argsJson.optString("event");
            if (TextUtils.isEmpty(optString2)) {
                return;
            }
            handleReportIntent(optString2);
        } else {
            com.sankuai.ehcore.module.core.a a = com.sankuai.ehcore.bridge.knb.a.a(this);
            if (a != null) {
                com.sankuai.ehcore.bridge.a.a(this, a, new com.sankuai.ehcore.bridge.b() { // from class: com.sankuai.eh.component.web.bridge.EHReportJsHandler.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.ehcore.bridge.b
                    public final void a(JSONObject jSONObject) {
                        Object[] objArr2 = {jSONObject};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0380d48d6e0ba34c18d6a88d7b5b1a73", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0380d48d6e0ba34c18d6a88d7b5b1a73");
                        } else {
                            EHReportJsHandler.this.jsCallback(jSONObject);
                        }
                    }

                    @Override // com.sankuai.ehcore.bridge.b
                    public final void a(int i, String str) {
                        Object[] objArr2 = {Integer.valueOf(i), str};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2163ea8721ffb7cfeb4a72b00de80e7a", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2163ea8721ffb7cfeb4a72b00de80e7a");
                        } else {
                            EHReportJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, str);
                        }
                    }
                });
            } else {
                jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "no eh environment!");
            }
        }
    }

    private void handleDebugIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7e7f424035e0cc2a10d53faed16d123d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7e7f424035e0cc2a10d53faed16d123d");
        } else if ("test".equals(jsBean().argsJson.optString("ehcEnv"))) {
            com.sankuai.eh.component.service.tools.c.b = true;
            com.sankuai.eh.component.service.database.d.a();
            jsCallback();
        } else if ("rq".equals(jsBean().argsJson.optString("cmd"))) {
            mock(jsBean().argsJson);
        } else {
            if ("tab".equals(jsBean().argsJson.optString("cmd"))) {
                com.sankuai.eh.component.service.tools.c.d = jsBean().argsJson.optString("bottomTabUrl");
            }
            jsCallback();
        }
    }

    private void handleCanIUse() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4a757fe330b78397fd95f5a1fb30396d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4a757fe330b78397fd95f5a1fb30396d");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            JsonElement a = com.sankuai.eh.component.web.a.a(jsHost().getUrl());
            JSONArray optJSONArray = jsBean().argsJson.optJSONArray("use");
            for (int i = 0; optJSONArray != null && i < optJSONArray.length(); i++) {
                JSONObject jSONObject3 = new JSONObject();
                String optString = optJSONArray.optString(i);
                if (!f.a(supportsAll, optString) && !f.a(supportsOnly, optString)) {
                    jSONObject3.put("code", 102);
                    jSONObject2.put(optString, jSONObject3);
                }
                if (f.a(supportsOnly, optString) && this.cContext == null) {
                    jSONObject3.put("code", 101);
                } else {
                    JsonElement a2 = com.sankuai.eh.component.service.utils.b.a(a, "feature", optString);
                    if (com.sankuai.eh.component.service.utils.b.a(com.sankuai.eh.component.service.utils.b.c(a2, "enabled"), true).booleanValue() && f.b(a2)) {
                        jSONObject3.put("code", 100);
                    } else {
                        jSONObject3.put("code", 101);
                    }
                }
                jSONObject2.put(optString, jSONObject3);
            }
            jSONObject.put("result_feature", jSONObject2);
        } catch (Exception e) {
            d.a(e);
        }
        jsCallback(jSONObject);
    }

    private void handleRecorderIntent() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "dc793e64661484f0523d3dc76c2f3f9a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "dc793e64661484f0523d3dc76c2f3f9a");
            return;
        }
        if (this.cContext.f != null && jsBean().argsJson.has("data")) {
            JsonObject jsonObject = new b.a().a("t", com.sankuai.eh.component.service.utils.d.c()).a("type", "jsBridge").a("msg", com.sankuai.eh.component.service.utils.b.a(jsBean().argsJson.optJSONObject("data").toString())).b;
            h hVar = this.cContext.f;
            Object[] objArr2 = {jsonObject};
            ChangeQuickRedirect changeQuickRedirect3 = h.a;
            if (PatchProxy.isSupport(objArr2, hVar, changeQuickRedirect3, false, "1cf05a78c35ccc068f51509da7abad02", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, hVar, changeQuickRedirect3, false, "1cf05a78c35ccc068f51509da7abad02");
            } else {
                e a = hVar.a("page_recorder");
                if (a instanceof com.sankuai.eh.component.web.chain.b) {
                    com.sankuai.eh.component.web.chain.b bVar = (com.sankuai.eh.component.web.chain.b) a;
                    Object[] objArr3 = {jsonObject};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.eh.component.web.chain.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect4, false, "498ef663f63f020b04ee2be904a75adc", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect4, false, "498ef663f63f020b04ee2be904a75adc");
                    } else {
                        bVar.b.add(jsonObject);
                    }
                }
            }
        }
        jsCallback();
    }

    private void handleReportIntent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec34872298c9915b283b8df7bbf52e54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec34872298c9915b283b8df7bbf52e54");
            return;
        }
        d.b(str, new d.b().a("mark", "jsBridge").a((Map) com.sankuai.eh.component.service.utils.b.a(jsBean().args, new TypeToken<Map<String, Object>>() { // from class: com.sankuai.eh.component.web.bridge.EHReportJsHandler.2
        }.getType())).b, null);
        jsCallback();
    }

    private void mock(final JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a22b9cdfcc2db34ef246a798d621a97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a22b9cdfcc2db34ef246a798d621a97b");
        } else {
            com.sankuai.eh.component.service.network.a.a(false).callDynamic(jSONObject.optString("url"), f.h()).a(new b.a() { // from class: com.sankuai.eh.component.web.bridge.EHReportJsHandler.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.eh.component.service.database.b.a
                public final void a(String str) {
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e08b9d419421c9ea48355135d897a5b7", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e08b9d419421c9ea48355135d897a5b7");
                        return;
                    }
                    com.sankuai.eh.component.service.database.d.b(str, jSONObject.optString(JsBridgeResult.ARG_KEY_LOCATION_MODE));
                    EHReportJsHandler.this.jsCallback();
                }

                @Override // com.sankuai.eh.component.service.database.b.a, com.sankuai.meituan.retrofit2.f
                public final void onFailure(Call<ap> call, Throwable th) {
                    Object[] objArr2 = {call, th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "729dd18b82d9e805aa2d78b2c2ab777e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "729dd18b82d9e805aa2d78b2c2ab777e");
                        return;
                    }
                    super.onFailure(call, th);
                    EHReportJsHandler.this.jsCallbackError(RequestIDMap.OP_TYPE_STATISTICS.OP_TYPE_ACTIVITY_ON_DESTROY, "debug请求错误");
                }
            });
        }
    }
}
