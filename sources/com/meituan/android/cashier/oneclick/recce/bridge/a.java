package com.meituan.android.cashier.oneclick.recce.bridge;

import android.app.Activity;
import android.text.TextUtils;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.meituan.android.neohybrid.util.gson.b;
import com.meituan.android.recce.bridge.RecceCustomApi;
import com.meituan.android.recce.bridge.RecceInterface;
import com.meituan.android.recce.bridge.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a extends RecceCustomApi {
    public static ChangeQuickRedirect a;

    @RecceInterface
    public final void openOneClickPay(String str, String str2, JsonObject jsonObject, final c cVar) {
        Object[] objArr = {str, str2, jsonObject, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00737bce7a0fd0a190d2dd8501022f42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00737bce7a0fd0a190d2dd8501022f42");
            return;
        }
        Activity a2 = a();
        if (a2 == null) {
            if (cVar != null) {
                JsonObject jsonObject2 = new JsonObject();
                jsonObject2.addProperty("code", (Number) (-1));
                jsonObject2.addProperty("message", "");
                jsonObject2.addProperty("data", "");
                cVar.onFail(400, "20000", jsonObject2.toString());
                return;
            }
            return;
        }
        String asString = jsonObject.get("action").getAsString();
        try {
            JSONObject jSONObject = new JSONObject(b.a().toJson((JsonElement) jsonObject.get("data").getAsJsonObject()));
            com.meituan.android.cashier.oneclick.presenter.a.a().a(a2).a(new com.meituan.android.cashier.oneclick.callback.a() { // from class: com.meituan.android.cashier.oneclick.recce.bridge.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cashier.oneclick.callback.a
                public final void executeSuccess(String str3) {
                    Object[] objArr2 = {str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "44965b8a6dd92b16ef8564edf6c41ada", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "44965b8a6dd92b16ef8564edf6c41ada");
                    } else if (cVar != null) {
                        JsonObject jsonObject3 = new JsonObject();
                        jsonObject3.addProperty("code", (Number) 0);
                        jsonObject3.addProperty("message", "");
                        if (TextUtils.isEmpty(str3)) {
                            str3 = "{}";
                        }
                        jsonObject3.add("data", new JsonParser().parse(str3).getAsJsonObject());
                        cVar.onSuccess(jsonObject3.toString());
                    }
                }

                @Override // com.meituan.android.cashier.oneclick.callback.a
                public final void executeFail(int i, String str3) {
                    Object[] objArr2 = {Integer.valueOf(i), str3};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5877419fbd2f1de9ae31e9266b7375a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5877419fbd2f1de9ae31e9266b7375a");
                    } else if (cVar != null) {
                        JsonObject jsonObject3 = new JsonObject();
                        jsonObject3.addProperty("code", (Number) (-1));
                        jsonObject3.addProperty("message", str3);
                        jsonObject3.addProperty("data", "");
                        cVar.onFail(i, str3, jsonObject3.toString());
                    }
                }
            }).e(jSONObject);
            if ("openOneClickPay".equals(asString)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().a(jSONObject);
            } else if ("abandonOpenClickPay".equals(asString)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().c(jSONObject);
            } else if ("startOneClickPay".equals(asString)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().d(jSONObject);
            } else if ("adjustPayTypeList".equals(asString)) {
                com.meituan.android.cashier.oneclick.presenter.a.a().b(jSONObject);
            } else {
                com.meituan.android.cashier.oneclick.presenter.a.a().c(jSONObject);
            }
        } catch (JSONException e) {
            if (cVar != null) {
                JsonObject jsonObject3 = new JsonObject();
                jsonObject3.addProperty("code", (Number) (-1));
                jsonObject3.addProperty("message", "");
                jsonObject3.addProperty("data", "");
                cVar.onFail(400, "10000", jsonObject3.toString());
            }
            com.meituan.android.paybase.common.analyse.a.a(e, "OpenOneClickPayJsHandler_onExecute", (Map<String, Object>) null);
        }
    }
}
