package com.facebook.react.modules.websocket;

import android.support.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.facebook.react.modules.network.c;
import com.meituan.metrics.traffic.reflection.OkHttp3Wrapper;
import com.meituan.metrics.traffic.report.NetLogConstants;
import com.meituan.robust.common.CommonConstant;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.f;
/* compiled from: ProGuard */
@ReactModule(hasConstants = false, name = "WebSocketModule")
/* loaded from: classes.dex */
public final class WebSocketModule extends ReactContextBaseJavaModule {
    public static final String NAME = "WebSocketModule";
    public static final String TAG = "WebSocketModule";
    private final Map<Integer, a> mContentHandlers;
    private c mCookieHandler;
    private final Map<Integer, WebSocket> mWebSocketConnections;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public interface a {
        void a(String str, WritableMap writableMap);

        void a(f fVar, WritableMap writableMap);
    }

    @ReactMethod
    public final void addListener(String str) {
    }

    @Override // com.facebook.react.bridge.NativeModule
    public final String getName() {
        return "WebSocketModule";
    }

    @ReactMethod
    public final void removeListeners(double d) {
    }

    public WebSocketModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.mWebSocketConnections = new ConcurrentHashMap();
        this.mContentHandlers = new ConcurrentHashMap();
        this.mCookieHandler = new c(reactApplicationContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendEvent(String str, WritableMap writableMap) {
        ReactApplicationContext reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactApplicationContextIfActiveOrWarn.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(str, writableMap);
        }
    }

    public final void setContentHandler(int i, a aVar) {
        if (aVar != null) {
            this.mContentHandlers.put(Integer.valueOf(i), aVar);
        } else {
            this.mContentHandlers.remove(Integer.valueOf(i));
        }
    }

    @ReactMethod
    public final void connect(String str, @Nullable ReadableArray readableArray, @Nullable ReadableMap readableMap, double d) {
        boolean z;
        final int i = (int) d;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        OkHttp3Wrapper.addInterceptorToBuilder(builder);
        OkHttpClient build = builder.connectTimeout(10L, TimeUnit.SECONDS).writeTimeout(10L, TimeUnit.SECONDS).readTimeout(0L, TimeUnit.MINUTES).build();
        Request.Builder url = new Request.Builder().tag(Integer.valueOf(i)).url(str);
        String cookie = getCookie(str);
        if (cookie != null) {
            url.addHeader("Cookie", cookie);
        }
        if (readableMap != null && readableMap.hasKey("headers") && readableMap.getType("headers").equals(ReadableType.Map)) {
            ReadableMap map = readableMap.getMap("headers");
            ReadableMapKeySetIterator keySetIterator = map.keySetIterator();
            z = false;
            while (keySetIterator.hasNextKey()) {
                String nextKey = keySetIterator.nextKey();
                if (ReadableType.String.equals(map.getType(nextKey))) {
                    if (nextKey.equalsIgnoreCase("origin")) {
                        z = true;
                    }
                    url.addHeader(nextKey, map.getString(nextKey));
                } else {
                    com.facebook.common.logging.a.c("ReactNative", "Ignoring: requested " + nextKey + ", value not a string");
                }
            }
        } else {
            z = false;
        }
        if (!z) {
            url.addHeader("origin", getDefaultOrigin(str));
        }
        if (readableArray != null && readableArray.size() > 0) {
            StringBuilder sb = new StringBuilder("");
            for (int i2 = 0; i2 < readableArray.size(); i2++) {
                String trim = readableArray.getString(i2).trim();
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
        build.newWebSocket(url.build(), new WebSocketListener() { // from class: com.facebook.react.modules.websocket.WebSocketModule.1
            @Override // okhttp3.WebSocketListener
            public final void onOpen(WebSocket webSocket, Response response) {
                WebSocketModule.this.mWebSocketConnections.put(Integer.valueOf(i), webSocket);
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString(NetLogConstants.Details.PROTOCOL, response.header("Sec-WebSocket-Protocol", ""));
                WebSocketModule.this.sendEvent("websocketOpen", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosing(WebSocket webSocket, int i3, String str2) {
                webSocket.close(i3, str2);
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosed(WebSocket webSocket, int i3, String str2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putInt("code", i3);
                createMap.putString("reason", str2);
                WebSocketModule.this.sendEvent("websocketClosed", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
                WebSocketModule.this.notifyWebSocketFailed(i, th.getMessage());
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, String str2) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("type", "text");
                a aVar = (a) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (aVar != null) {
                    aVar.a(str2, createMap);
                } else {
                    createMap.putString("data", str2);
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, f fVar) {
                WritableMap createMap = Arguments.createMap();
                createMap.putInt("id", i);
                createMap.putString("type", "binary");
                a aVar = (a) WebSocketModule.this.mContentHandlers.get(Integer.valueOf(i));
                if (aVar != null) {
                    aVar.a(fVar, createMap);
                } else {
                    createMap.putString("data", fVar.b());
                }
                WebSocketModule.this.sendEvent("websocketMessage", createMap);
            }
        });
        build.dispatcher().executorService().shutdown();
    }

    @ReactMethod
    public final void close(double d, String str, double d2) {
        int i = (int) d2;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            return;
        }
        try {
            webSocket.close((int) d, str);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
        } catch (Exception e) {
            com.facebook.common.logging.a.d("ReactNative", "Could not close WebSocket connection for id " + i, e);
        }
    }

    @ReactMethod
    public final void send(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(str);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public final void sendBinary(String str, double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(f.b(str));
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    public final void sendBinary(f fVar, int i) {
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(fVar);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    @ReactMethod
    public final void ping(double d) {
        int i = (int) d;
        WebSocket webSocket = this.mWebSocketConnections.get(Integer.valueOf(i));
        if (webSocket == null) {
            WritableMap createMap = Arguments.createMap();
            createMap.putInt("id", i);
            createMap.putString("message", "client is null");
            sendEvent("websocketFailed", createMap);
            WritableMap createMap2 = Arguments.createMap();
            createMap2.putInt("id", i);
            createMap2.putInt("code", 0);
            createMap2.putString("reason", "client is null");
            sendEvent("websocketClosed", createMap2);
            this.mWebSocketConnections.remove(Integer.valueOf(i));
            this.mContentHandlers.remove(Integer.valueOf(i));
            return;
        }
        try {
            webSocket.send(f.b);
        } catch (Exception e) {
            notifyWebSocketFailed(i, e.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void notifyWebSocketFailed(int i, String str) {
        WritableMap createMap = Arguments.createMap();
        createMap.putInt("id", i);
        createMap.putString("message", str);
        sendEvent("websocketFailed", createMap);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057 A[Catch: URISyntaxException -> 0x00c0, TryCatch #0 {URISyntaxException -> 0x00c0, blocks: (B:2:0x0000, B:24:0x0053, B:29:0x008e, B:31:0x0094, B:32:0x00af, B:26:0x0057, B:27:0x006b, B:28:0x007d, B:11:0x0028, B:14:0x0032, B:17:0x003c, B:20:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006b A[Catch: URISyntaxException -> 0x00c0, TryCatch #0 {URISyntaxException -> 0x00c0, blocks: (B:2:0x0000, B:24:0x0053, B:29:0x008e, B:31:0x0094, B:32:0x00af, B:26:0x0057, B:27:0x006b, B:28:0x007d, B:11:0x0028, B:14:0x0032, B:17:0x003c, B:20:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007d A[Catch: URISyntaxException -> 0x00c0, TryCatch #0 {URISyntaxException -> 0x00c0, blocks: (B:2:0x0000, B:24:0x0053, B:29:0x008e, B:31:0x0094, B:32:0x00af, B:26:0x0057, B:27:0x006b, B:28:0x007d, B:11:0x0028, B:14:0x0032, B:17:0x003c, B:20:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0094 A[Catch: URISyntaxException -> 0x00c0, TryCatch #0 {URISyntaxException -> 0x00c0, blocks: (B:2:0x0000, B:24:0x0053, B:29:0x008e, B:31:0x0094, B:32:0x00af, B:26:0x0057, B:27:0x006b, B:28:0x007d, B:11:0x0028, B:14:0x0032, B:17:0x003c, B:20:0x0047), top: B:36:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00af A[Catch: URISyntaxException -> 0x00c0, TRY_LEAVE, TryCatch #0 {URISyntaxException -> 0x00c0, blocks: (B:2:0x0000, B:24:0x0053, B:29:0x008e, B:31:0x0094, B:32:0x00af, B:26:0x0057, B:27:0x006b, B:28:0x007d, B:11:0x0028, B:14:0x0032, B:17:0x003c, B:20:0x0047), top: B:36:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String getDefaultOrigin(java.lang.String r10) {
        /*
            java.lang.String r0 = ""
            java.net.URI r1 = new java.net.URI     // Catch: java.net.URISyntaxException -> Lc0
            r1.<init>(r10)     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r2 = r1.getScheme()     // Catch: java.net.URISyntaxException -> Lc0
            int r3 = r2.hashCode()     // Catch: java.net.URISyntaxException -> Lc0
            r4 = 3804(0xedc, float:5.33E-42)
            r5 = 3
            r6 = -1
            r7 = 2
            r8 = 0
            r9 = 1
            if (r3 == r4) goto L47
            r4 = 118039(0x1cd17, float:1.65408E-40)
            if (r3 == r4) goto L3c
            r4 = 3213448(0x310888, float:4.503E-39)
            if (r3 == r4) goto L32
            r4 = 99617003(0x5f008eb, float:2.2572767E-35)
            if (r3 == r4) goto L28
            goto L52
        L28:
            java.lang.String r3 = "https"
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> Lc0
            if (r2 == 0) goto L52
            r2 = 3
            goto L53
        L32:
            java.lang.String r3 = "http"
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> Lc0
            if (r2 == 0) goto L52
            r2 = 2
            goto L53
        L3c:
            java.lang.String r3 = "wss"
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> Lc0
            if (r2 == 0) goto L52
            r2 = 0
            goto L53
        L47:
            java.lang.String r3 = "ws"
            boolean r2 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> Lc0
            if (r2 == 0) goto L52
            r2 = 1
            goto L53
        L52:
            r2 = -1
        L53:
            switch(r2) {
                case 0: goto L7d;
                case 1: goto L6b;
                case 2: goto L57;
                case 3: goto L57;
                default: goto L56;
            }     // Catch: java.net.URISyntaxException -> Lc0
        L56:
            goto L8e
        L57:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lc0
            r2.<init>()     // Catch: java.net.URISyntaxException -> Lc0
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = r1.getScheme()     // Catch: java.net.URISyntaxException -> Lc0
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = r2.toString()     // Catch: java.net.URISyntaxException -> Lc0
            goto L8e
        L6b:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lc0
            r2.<init>()     // Catch: java.net.URISyntaxException -> Lc0
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = "http"
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = r2.toString()     // Catch: java.net.URISyntaxException -> Lc0
            goto L8e
        L7d:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.net.URISyntaxException -> Lc0
            r2.<init>()     // Catch: java.net.URISyntaxException -> Lc0
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = "https"
            r2.append(r0)     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = r2.toString()     // Catch: java.net.URISyntaxException -> Lc0
        L8e:
            int r2 = r1.getPort()     // Catch: java.net.URISyntaxException -> Lc0
            if (r2 == r6) goto Laf
            java.lang.String r2 = "%s://%s:%s"
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: java.net.URISyntaxException -> Lc0
            r3[r8] = r0     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = r1.getHost()     // Catch: java.net.URISyntaxException -> Lc0
            r3[r9] = r0     // Catch: java.net.URISyntaxException -> Lc0
            int r0 = r1.getPort()     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch: java.net.URISyntaxException -> Lc0
            r3[r7] = r0     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = java.lang.String.format(r2, r3)     // Catch: java.net.URISyntaxException -> Lc0
            goto Lbf
        Laf:
            java.lang.String r2 = "%s://%s"
            java.lang.Object[] r3 = new java.lang.Object[r7]     // Catch: java.net.URISyntaxException -> Lc0
            r3[r8] = r0     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = r1.getHost()     // Catch: java.net.URISyntaxException -> Lc0
            r3[r9] = r0     // Catch: java.net.URISyntaxException -> Lc0
            java.lang.String r0 = java.lang.String.format(r2, r3)     // Catch: java.net.URISyntaxException -> Lc0
        Lbf:
            return r0
        Lc0:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unable to set "
            r1.<init>(r2)
            r1.append(r10)
            java.lang.String r10 = " as default origin header"
            r1.append(r10)
            java.lang.String r10 = r1.toString()
            r0.<init>(r10)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.react.modules.websocket.WebSocketModule.getDefaultOrigin(java.lang.String):java.lang.String");
    }

    private String getCookie(String str) {
        try {
            List<String> list = this.mCookieHandler.get(new URI(getDefaultOrigin(str)), new HashMap()).get("Cookie");
            if (list != null && !list.isEmpty()) {
                return list.get(0);
            }
            return null;
        } catch (IOException | URISyntaxException unused) {
            throw new IllegalArgumentException("Unable to get cookie from " + str);
        }
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public final void onCatalystInstanceDestroy() {
        if (this.mWebSocketConnections.size() > 0) {
            for (WebSocket webSocket : this.mWebSocketConnections.values()) {
                if (webSocket != null) {
                    try {
                        webSocket.cancel();
                    } catch (Throwable unused) {
                    }
                }
            }
            this.mWebSocketConnections.clear();
            this.mContentHandlers.clear();
        }
    }
}
