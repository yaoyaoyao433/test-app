package com.sankuai.titans.protocol.jsbridge;

import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IJsHostCenter {
    void publish(String str, JSONObject jSONObject);

    void subscribe(String str, AbsJsHost absJsHost, AbsJsHandler absJsHandler);

    void unSubscribe(String str, AbsJsHost absJsHost);

    void unSubscribeAll(AbsJsHost absJsHost);
}
