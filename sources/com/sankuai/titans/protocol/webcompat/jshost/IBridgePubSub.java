package com.sankuai.titans.protocol.webcompat.jshost;

import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
import com.sankuai.titans.protocol.jsbridge.RespResult;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IBridgePubSub {
    void publish(String str);

    void publish(String str, RespResult respResult);

    void publish(String str, JSONObject jSONObject);

    void subscribe(String str, AbsJsHandler absJsHandler);

    void unsubscribe(String str);

    void unsubscribeAll();
}
