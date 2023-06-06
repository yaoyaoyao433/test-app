package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.jshandler.JsHandler;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface JsHandlerReportStrategy {
    void report(BaseJsHandler baseJsHandler, JSONObject jSONObject);

    void reportBridgeArrival(String str, JsHandler.Source source, String str2);
}
