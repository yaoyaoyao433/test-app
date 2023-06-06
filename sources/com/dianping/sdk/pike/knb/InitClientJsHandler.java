package com.dianping.sdk.pike.knb;

import android.content.Context;
import android.text.TextUtils;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.e;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.common.unionid.oneid.monitor.MonitorManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.nio.charset.Charset;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InitClientJsHandler extends BaseJsHandler {
    private static final String TAG = "InitClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "D4nzvSWHG/A2Jls7UhdZ8Wbu4AD5r75JNARw29Qm0u+V/qXtnjrzKoA5ufLwYG3kH1ZObV+E7ZrdSggK6x7Z7A==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf768cd287c9bb1e42f76df63f909c40", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf768cd287c9bb1e42f76df63f909c40");
            return;
        }
        try {
            i.a(TAG, "knb init client exec");
            String optString = jsBean().argsJson.optString("bzId");
            String optString2 = jsBean().argsJson.optString("alias");
            JSONObject optJSONObject = jsBean().argsJson.optJSONObject("extra");
            final a a = a.a();
            Context context = jsHost().getContext();
            Object[] objArr2 = {context, optString, optString2, optJSONObject, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "5aee0507d3b747ff8ed7ad0a6dd5dee9", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "5aee0507d3b747ff8ed7ad0a6dd5dee9");
            } else if (context == null) {
                jsCallbackErrorMsg(MonitorManager.CONTEXT_IS_NULL_MSG);
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar != null) {
                    dVar.e();
                    a.b.remove(dVar);
                }
                d a2 = d.a(context, new e.a().a(optString).b(optString2).a(b.a(optJSONObject)).a());
                a.b.put(optString, a2);
                a2.r = new com.dianping.sdk.pike.message.b() { // from class: com.dianping.sdk.pike.knb.a.1
                    public static ChangeQuickRedirect a;

                    @Override // com.dianping.sdk.pike.message.b
                    public final void a(List<com.dianping.sdk.pike.message.e> list) {
                        Object[] objArr3 = {list};
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "0f5f3eb6b938691c3b2f8f1401682b31", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "0f5f3eb6b938691c3b2f8f1401682b31");
                            return;
                        }
                        if (list != null) {
                            try {
                                if (!list.isEmpty()) {
                                    JSONArray jSONArray = new JSONArray();
                                    for (com.dianping.sdk.pike.message.e eVar : list) {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("bzId", eVar.g);
                                        jSONObject.put("messageId", eVar.h);
                                        jSONObject.put("content", new String(eVar.d, Charset.defaultCharset()));
                                        jSONArray.put(jSONObject);
                                    }
                                    JSONObject jSONObject2 = new JSONObject();
                                    jSONObject2.put("status", "action");
                                    jSONObject2.put("messageList", jSONArray);
                                    this.jsCallback(jSONObject2);
                                    return;
                                }
                            } catch (Exception e) {
                                i.a("KnbPikeAdapter", "message recv error!", e);
                                return;
                            }
                        }
                        i.a("KnbPikeAdapter", "recv message list is empty");
                    }
                };
                jsCallback();
            }
        } catch (Throwable th) {
            i.a(TAG, "knb init client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
