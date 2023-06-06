package com.dianping.sdk.pike.knb;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.sdk.pike.agg.c;
import com.dianping.sdk.pike.agg.e;
import com.dianping.sdk.pike.agg.f;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InitAggClientJsHandler extends BaseJsHandler {
    private static final String TAG = "InitAggClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "G4txOOjUsbHNbU1QkAdEaWQ562BZbf9vXKf1JpkKKwBBQw310mH5tKJU9fpdJG0f54MixSxxAjcKctG0vCgnIA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1b68a375223c76483c75ab43d58c8738", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1b68a375223c76483c75ab43d58c8738");
            return;
        }
        try {
            i.a(TAG, "knb init agg client exec");
            String optString = jsBean().argsJson.optString("bzId");
            String optString2 = jsBean().argsJson.optString("alias");
            JSONObject optJSONObject = jsBean().argsJson.optJSONObject("extra");
            final a a = a.a();
            Context context = jsHost().getContext();
            Object[] objArr2 = {context, optString, optString2, optJSONObject, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "97591443b55c72c3ef03597f4ba4d383", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "97591443b55c72c3ef03597f4ba4d383");
            } else if (context == null) {
                jsCallbackErrorMsg(MonitorManager.CONTEXT_IS_NULL_MSG);
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                com.dianping.sdk.pike.agg.a aVar = a.c.get(optString);
                if (aVar != null) {
                    aVar.e();
                    a.c.remove(aVar);
                }
                c.a b = new c.a().a(optString).b(optString2);
                Map<String, String> a2 = b.a(optJSONObject);
                if (a2 != null) {
                    b.b = a2;
                }
                com.dianping.sdk.pike.agg.a a3 = com.dianping.sdk.pike.agg.a.a(context, b.a());
                a.c.put(optString, a3);
                a3.s = new e() { // from class: com.dianping.sdk.pike.knb.a.12
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.agg.e
                    public final void a(List<f> list) {
                        Object[] objArr3 = {list};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "6f62b9fbdc097409f83d67c12a2bfd10", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "6f62b9fbdc097409f83d67c12a2bfd10");
                            return;
                        }
                        if (list != null) {
                            try {
                                if (!list.isEmpty()) {
                                    JSONArray jSONArray = new JSONArray();
                                    for (f fVar : list) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("bzId", fVar.a());
                                        jSONObject.put("messageId", fVar.h);
                                        jSONObject.put("content", fVar.c);
                                        jSONArray.put(jSONObject);
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("status", "action");
                                    jSONObject2.put("messageList", jSONArray);
                                    this.jsCallback(jSONObject2);
                                    return;
                                }
                            } catch (Exception e) {
                                i.a("KnbPikeAdapter", "agg message recv error!", e);
                                return;
                            }
                        }
                        i.a("KnbPikeAdapter", "recv agg message list is empty");
                    }
                };
                jsCallback();
            }
        } catch (Throwable th) {
            i.a(TAG, "knb init agg client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
