package com.meituan.msc.modules.websocket;

import android.support.annotation.Nullable;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.msc.jse.modules.core.JSDeviceEventEmitter;
import com.meituan.msc.modules.engine.h;
import com.meituan.msc.modules.manager.MSCMethod;
import com.meituan.msc.modules.manager.ModuleName;
import com.meituan.msc.modules.manager.f;
import com.meituan.msc.modules.manager.k;
import com.meituan.msc.modules.manager.q;
import com.meituan.msc.modules.reporter.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@ModuleName(name = "WebSocketModule")
/* loaded from: classes3.dex */
public final class a extends k {
    public static ChangeQuickRedirect a = null;
    public static final String b = "a";
    final Map<Integer, WebSocket> c;
    final Map<Integer, InterfaceC0480a> d;
    private final q e;
    private com.meituan.msc.modules.network.a f;

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.msc.modules.websocket.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0480a {
    }

    @MSCMethod
    public final void addListener(String str) {
    }

    @MSCMethod
    public final void removeListeners(double d) {
    }

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36f5f5cd671fdef45fd0700646a6f49a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36f5f5cd671fdef45fd0700646a6f49a");
            return;
        }
        this.e = new q<com.meituan.msc.modules.service.a>() { // from class: com.meituan.msc.modules.websocket.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.msc.modules.manager.q
            public final void a(f<com.meituan.msc.modules.service.a> fVar) {
                Object[] objArr2 = {fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "203b485045c74694513a05dab0c154ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "203b485045c74694513a05dab0c154ed");
                } else if (fVar.c == com.meituan.msc.modules.service.a.Released) {
                    a aVar = a.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a.a;
                    if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "75de2c6c22aa1cdac8fa19d2b029a8a4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "75de2c6c22aa1cdac8fa19d2b029a8a4");
                    } else if (aVar.c.size() > 0) {
                        for (WebSocket webSocket : aVar.c.values()) {
                            if (webSocket != null) {
                                try {
                                    webSocket.cancel();
                                } catch (Throwable unused) {
                                }
                            }
                        }
                        aVar.c.clear();
                        aVar.d.clear();
                    }
                }
            }
        };
        this.c = new ConcurrentHashMap();
        this.d = new ConcurrentHashMap();
        this.f = new com.meituan.msc.modules.network.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str, JSONObject jSONObject) {
        Object[] objArr = {str, jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f901387e79784970093307c7ab901c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f901387e79784970093307c7ab901c");
        } else {
            ((JSDeviceEventEmitter) ((com.meituan.msc.modules.engine.a) U_().c(com.meituan.msc.modules.engine.a.class)).f().a(JSDeviceEventEmitter.class)).emit(str, jSONObject);
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void a(h hVar) {
        Object[] objArr = {hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b1fac59252e96b85deb3864c10f9f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b1fac59252e96b85deb3864c10f9f24");
            return;
        }
        super.a(hVar);
        U_().a("msc_event_engine_status_changed", this.e);
    }

    @MSCMethod
    public final void connect(String str, @Nullable JSONArray jSONArray, @Nullable JSONObject jSONObject, double d) {
        boolean z;
        Object[] objArr = {str, jSONArray, jSONObject, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a332e7c747c756a9d6e054b695c85743", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a332e7c747c756a9d6e054b695c85743");
            return;
        }
        final int i = (int) d;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        OkHttpClient build = builder.connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String b2 = b(str);
        if (b2 != null) {
            url.addHeader("Cookie", b2);
        }
        if (jSONObject != null && jSONObject.has("headers") && (jSONObject.opt("headers") instanceof JSONObject)) {
            JSONObject optJSONObject = jSONObject.optJSONObject("headers");
            Iterator<String> keys = optJSONObject.keys();
            z = false;
            while (keys.hasNext()) {
                String next = keys.next();
                if (optJSONObject.opt(next) instanceof String) {
                    if (next.equalsIgnoreCase("origin")) {
                        z = true;
                    }
                    url.addHeader(next, optJSONObject.optString(next));
                } else {
                    g.e("ReactNative", "Ignoring: requested " + next + ", value not a string");
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            url.addHeader("origin", a(str));
        }
        if (jSONArray != null && jSONArray.length() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                String trim = jSONArray.optString(i2).trim();
                if (!trim.isEmpty() && !trim.contains(CommonConstant.Symbol.COMMA)) {
                    sb.append(trim);
                    sb.append(CommonConstant.Symbol.COMMA);
                }
            }
            if (sb.length() > 0) {
                sb.replace(sb.length() - 1, sb.length(), "");
                url.addHeader("Sec-WebSocket-Protocol", sb.toString());
            }
        }
        build.newWebSocket(url.build(), new WebSocketListener() { // from class: com.meituan.msc.modules.websocket.a.2
            public static ChangeQuickRedirect a;

            @Override // okhttp3.WebSocketListener
            public final void onOpen(WebSocket webSocket, Response response) {
                Object[] objArr2 = {webSocket, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "591174bcf50d68acdab11cf1de7d7a0f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "591174bcf50d68acdab11cf1de7d7a0f");
                    return;
                }
                a.this.c.put(Integer.valueOf(i), webSocket);
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", i);
                    jSONObject2.put(NetLogConstants.Details.PROTOCOL, response.header("Sec-WebSocket-Protocol", ""));
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                a.this.a("websocketOpen", jSONObject2);
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosing(WebSocket webSocket, int i3, String str2) {
                Object[] objArr2 = {webSocket, Integer.valueOf(i3), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2d2a803a80b52f5a642821c778594f3a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2d2a803a80b52f5a642821c778594f3a");
                } else {
                    webSocket.close(i3, str2);
                }
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosed(WebSocket webSocket, int i3, String str2) {
                Object[] objArr2 = {webSocket, Integer.valueOf(i3), str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "317bc536c6ec24d078717301e859245c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "317bc536c6ec24d078717301e859245c");
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", i);
                    jSONObject2.put("code", i3);
                    jSONObject2.put("reason", str2);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                a.this.a("websocketClosed", jSONObject2);
            }

            @Override // okhttp3.WebSocketListener
            public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
                Object[] objArr2 = {webSocket, th, response};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "433d6cca298538c4274897d51f754a51", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "433d6cca298538c4274897d51f754a51");
                } else {
                    a.this.a(i, th.getMessage());
                }
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, String str2) {
                Object[] objArr2 = {webSocket, str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "480c07b37cf645ef83bdddb0b656c2e6", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "480c07b37cf645ef83bdddb0b656c2e6");
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", i);
                    jSONObject2.put("type", "text");
                    if (((InterfaceC0480a) a.this.d.get(Integer.valueOf(i))) == null) {
                        jSONObject2.put("data", str2);
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                a.this.a("websocketMessage", jSONObject2);
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, okio.f fVar) {
                Object[] objArr2 = {webSocket, fVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "86fc962d93931ea2fd48c6a5620168fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "86fc962d93931ea2fd48c6a5620168fc");
                    return;
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("id", i);
                    jSONObject2.put("type", "binary");
                    if (((InterfaceC0480a) a.this.d.get(Integer.valueOf(i))) == null) {
                        jSONObject2.put("data", fVar.b());
                    }
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                a.this.a("websocketMessage", jSONObject2);
            }
        });
        build.dispatcher().executorService().shutdown();
    }

    @MSCMethod
    public final void close(double d, String str, double d2) {
        Object[] objArr = {Double.valueOf(d), str, Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7dacc4a8cf50f5770f38c8ed3f48626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7dacc4a8cf50f5770f38c8ed3f48626");
            return;
        }
        int i = (int) d2;
        WebSocket webSocket = this.c.get(Integer.valueOf(i));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) d, str);
            this.c.remove(Integer.valueOf(i));
            this.d.remove(Integer.valueOf(i));
        } catch (Exception e) {
            g.b("ReactNative", e, "Could not close WebSocket connection for id " + i);
        }
    }

    @MSCMethod
    public final void send(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2f6afc78a745cd6cba0d71497b9a0b6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2f6afc78a745cd6cba0d71497b9a0b6");
            return;
        }
        int i = (int) d;
        WebSocket webSocket = this.c.get(Integer.valueOf(i));
        if (webSocket == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", i);
                jSONObject.put("message", "client is null");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            a("websocketFailed", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", i);
                jSONObject2.put("code", 0);
                jSONObject2.put("reason", "client is null");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a("websocketClosed", jSONObject2);
            this.c.remove(Integer.valueOf(i));
            this.d.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e3) {
            a(i, e3.getMessage());
        }
    }

    @MSCMethod
    public final void sendBinary(String str, double d) {
        Object[] objArr = {str, Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a65d2386041f5484938ef6cbbebb08a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a65d2386041f5484938ef6cbbebb08a7");
            return;
        }
        int i = (int) d;
        WebSocket webSocket = this.c.get(Integer.valueOf(i));
        if (webSocket == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", i);
                jSONObject.put("message", "client is null");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            a("websocketFailed", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", i);
                jSONObject2.put("code", 0);
                jSONObject2.put("reason", "client is null");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a("websocketClosed", jSONObject2);
            this.c.remove(Integer.valueOf(i));
            this.d.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(okio.f.b(str));
        } catch (Exception e3) {
            a(i, e3.getMessage());
        }
    }

    @MSCMethod
    public final void ping(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03c1b7fe59a493e30e0569d0bf88f03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03c1b7fe59a493e30e0569d0bf88f03");
            return;
        }
        int i = (int) d;
        WebSocket webSocket = this.c.get(Integer.valueOf(i));
        if (webSocket == null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("id", i);
                jSONObject.put("message", "client is null");
            } catch (JSONException e) {
                e.printStackTrace();
            }
            a("websocketFailed", jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("id", i);
                jSONObject2.put("code", 0);
                jSONObject2.put("reason", "client is null");
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            a("websocketClosed", jSONObject2);
            this.c.remove(Integer.valueOf(i));
            this.d.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(okio.f.b);
        } catch (Exception e3) {
            a(i, e3.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c13a86eea8c58a5a894055a242cf3d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c13a86eea8c58a5a894055a242cf3d1");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", i);
            jSONObject.put("message", str);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        a("websocketFailed", jSONObject);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0076 A[Catch: URISyntaxException -> 0x00e1, TryCatch #0 {URISyntaxException -> 0x00e1, blocks: (B:6:0x001f, B:28:0x0072, B:33:0x00af, B:35:0x00b5, B:36:0x00d0, B:30:0x0076, B:31:0x008a, B:32:0x009d, B:15:0x0045, B:18:0x0050, B:21:0x005b, B:24:0x0066), top: B:40:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008a A[Catch: URISyntaxException -> 0x00e1, TryCatch #0 {URISyntaxException -> 0x00e1, blocks: (B:6:0x001f, B:28:0x0072, B:33:0x00af, B:35:0x00b5, B:36:0x00d0, B:30:0x0076, B:31:0x008a, B:32:0x009d, B:15:0x0045, B:18:0x0050, B:21:0x005b, B:24:0x0066), top: B:40:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009d A[Catch: URISyntaxException -> 0x00e1, TryCatch #0 {URISyntaxException -> 0x00e1, blocks: (B:6:0x001f, B:28:0x0072, B:33:0x00af, B:35:0x00b5, B:36:0x00d0, B:30:0x0076, B:31:0x008a, B:32:0x009d, B:15:0x0045, B:18:0x0050, B:21:0x005b, B:24:0x0066), top: B:40:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: URISyntaxException -> 0x00e1, TryCatch #0 {URISyntaxException -> 0x00e1, blocks: (B:6:0x001f, B:28:0x0072, B:33:0x00af, B:35:0x00b5, B:36:0x00d0, B:30:0x0076, B:31:0x008a, B:32:0x009d, B:15:0x0045, B:18:0x0050, B:21:0x005b, B:24:0x0066), top: B:40:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0 A[Catch: URISyntaxException -> 0x00e1, TRY_LEAVE, TryCatch #0 {URISyntaxException -> 0x00e1, blocks: (B:6:0x001f, B:28:0x0072, B:33:0x00af, B:35:0x00b5, B:36:0x00d0, B:30:0x0076, B:31:0x008a, B:32:0x009d, B:15:0x0045, B:18:0x0050, B:21:0x005b, B:24:0x0066), top: B:40:0x001f }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.msc.modules.websocket.a.a(java.lang.String):java.lang.String");
    }

    private String b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6311903008c8be2261f263090745deab", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6311903008c8be2261f263090745deab");
        }
        try {
            List<String> list = this.f.get(new URI(a(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    @Override // com.meituan.msc.modules.manager.k
    public final void L_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d2b3518d10043bda58290b5b20b80be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d2b3518d10043bda58290b5b20b80be");
            return;
        }
        super.L_();
        U_().a(this.e);
    }
}
