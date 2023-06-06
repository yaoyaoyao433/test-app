package com.facebook.react.packagerconnection;

import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import java.util.Map;
import okio.f;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class JSPackagerClient implements ReconnectingWebSocket.a {
    private static final String a = "JSPackagerClient";
    private ReconnectingWebSocket b;
    private Map<String, com.facebook.react.packagerconnection.a> c;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public class a {
        private Object b;

        public a(Object obj) {
            this.b = obj;
        }

        public final void a(Object obj) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("version", 2);
                jSONObject.put("id", this.b);
                jSONObject.put("error", obj);
                JSPackagerClient.this.b.a(jSONObject.toString());
            } catch (Exception e) {
                com.facebook.common.logging.a.d(JSPackagerClient.a, "Responding with error failed", e);
            }
        }
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.a
    public final void a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("version");
            String optString = jSONObject.optString("method");
            Object opt = jSONObject.opt("id");
            jSONObject.opt("params");
            if (optInt != 2) {
                String str2 = a;
                com.facebook.common.logging.a.d(str2, "Message with incompatible or missing version of protocol received: " + optInt);
            } else if (optString == null) {
                a(opt, "No method provided");
            } else if (this.c.get(optString) == null) {
                a(opt, "No request handler for method: " + optString);
            } else if (opt != null) {
                new a(opt);
            }
        } catch (Exception e) {
            com.facebook.common.logging.a.d(a, "Handling the message failed", e);
        }
    }

    @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.a
    public final void a(f fVar) {
        com.facebook.common.logging.a.c(a, "Websocket received message with payload of unexpected type binary");
    }

    private void a(Object obj, String str) {
        if (obj != null) {
            new a(obj).a(str);
        }
        String str2 = a;
        com.facebook.common.logging.a.d(str2, "Handling the message failed with reason: " + str);
    }
}
