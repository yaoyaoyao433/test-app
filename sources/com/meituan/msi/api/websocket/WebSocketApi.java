package com.meituan.msi.api.websocket;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.metrics.common.Constants;
import com.meituan.msi.annotations.MsiApiGray;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.api.IMsiApi;
import com.meituan.msi.bean.EmptyResponse;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.msi.util.network.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.model.utils.Strings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Headers;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.WebSocket;
import okhttp3.WebSocketListener;
import okio.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
@MsiApiGray(graySwitchName = "api_web_socket")
/* loaded from: classes3.dex */
public class WebSocketApi implements IMsiApi {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<String, WebSocket> b;
    private ConcurrentHashMap<String, String> c;
    private List<String> d;
    private volatile boolean e;
    private String f;
    private String g;

    @MsiApiMethod(isCallback = true, name = "SocketTask.onClose", response = OnCloseEvent.class)
    public void onClose(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "SocketTask.onError", response = OnErrorEvent.class)
    public void onError(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "SocketTask.onMessage", response = OnMessageEvent.class)
    public void onMessage(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "SocketTask.onOpen", response = OnOpenEvent.class)
    public void onOpen(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onSocketClose", response = OnCloseEvent.class)
    public void onSocketClose(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onSocketError", response = OnErrorEvent.class)
    public void onSocketError(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onSocketMessage", response = OnMessageEvent.class)
    public void onSocketMessage(MsiContext msiContext) {
    }

    @MsiApiMethod(isCallback = true, name = "onSocketOpen", response = OnSocketOpenEvent.class)
    public void onSocketOpen(MsiContext msiContext) {
    }

    public WebSocketApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c70b5de7763ba3436997a5dc027483a4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c70b5de7763ba3436997a5dc027483a4");
            return;
        }
        this.b = new ConcurrentHashMap<>();
        this.c = new ConcurrentHashMap<>();
        this.d = Collections.synchronizedList(new ArrayList());
    }

    public static /* synthetic */ int b(WebSocketApi webSocketApi, Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, webSocketApi, changeQuickRedirect, false, "b952cabc358e94e5dcbfe4c15f2050b6", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, webSocketApi, changeQuickRedirect, false, "b952cabc358e94e5dcbfe4c15f2050b6")).intValue();
        }
        if (webSocketApi.a(th).contains("Failed to connect") || webSocketApi.a(th).contains("failed to connect") || webSocketApi.a(th).contains("Expected HTTP 101 response but was '200 OK'")) {
            return 1004;
        }
        return (webSocketApi.a(th).contains("Connection reset") || th.toString().contains("java.io.EOFException")) ? 1006 : 0;
    }

    @MsiApiMethod(name = "SocketTask")
    public EmptyResponse socketTask(MsiContext msiContext) {
        return EmptyResponse.INSTANCE;
    }

    @MsiApiMethod(name = "sendSocketMessage", request = SendParam.class)
    public void sendSocketMessage(SendParam sendParam, MsiContext msiContext) {
        Object[] objArr = {sendParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cd68371263796408f78bf360ae8ea2b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cd68371263796408f78bf360ae8ea2b");
        } else {
            send(sendParam, msiContext);
        }
    }

    @MsiApiMethod(name = "connectSocket", request = ConnectSocketParam.class)
    public void connectSocket(ConnectSocketParam connectSocketParam, final MsiContext msiContext) {
        final Request build;
        Object[] objArr = {connectSocketParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a1f2c09a8ceec90840c7656f532bed4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a1f2c09a8ceec90840c7656f532bed4");
            return;
        }
        String str = connectSocketParam.url;
        if (Strings.isEmpty(str)) {
            msiContext.onError(500, "url is null or empty");
            return;
        }
        Object[] objArr2 = {connectSocketParam, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3dbf512b0abd8bb212126deb66fe4906", RobustBitConfig.DEFAULT_VALUE)) {
            build = (Request) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3dbf512b0abd8bb212126deb66fe4906");
        } else {
            Map hashMap = new HashMap();
            if (connectSocketParam.header != null) {
                hashMap = connectSocketParam.header;
            }
            List arrayList = new ArrayList();
            if (connectSocketParam.protocols != null) {
                arrayList = connectSocketParam.protocols;
            }
            if (arrayList != null && arrayList.size() > 0) {
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < arrayList.size(); i++) {
                    sb.append(',');
                    sb.append((String) arrayList.get(i));
                }
                if (sb.length() > 0) {
                    hashMap.put("Sec-WebSocket-Protocol", sb.substring(1));
                    hashMap.put("Sec-WebSocket-Version", "13");
                }
            }
            if (!TextUtils.isEmpty(this.g)) {
                hashMap.put(Constants.TRAFFIC_REFERER, this.g);
            }
            if (!TextUtils.isEmpty(this.f)) {
                hashMap.put("User-Agent", this.f);
            }
            build = new Request.Builder().url(str).headers(Headers.of(hashMap)).build();
        }
        WebSocket newWebSocket = a.a().b().newWebSocket(build, new WebSocketListener() { // from class: com.meituan.msi.api.websocket.WebSocketApi.1
            public static ChangeQuickRedirect a;

            @Override // okhttp3.WebSocketListener
            public final void onOpen(WebSocket webSocket, Response response) {
                Object[] objArr3 = {webSocket, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4d862773addaebeced055c0a59c7e18f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4d862773addaebeced055c0a59c7e18f");
                    return;
                }
                super.onOpen(webSocket, response);
                OnOpenEvent onOpenEvent = new OnOpenEvent();
                JSONObject jSONObject = new JSONObject();
                Headers headers = build.headers();
                try {
                    if (response.headers() != null) {
                        for (String str2 : headers.names()) {
                            jSONObject.put(str2, headers.get(str2));
                        }
                    }
                } catch (JSONException e) {
                    com.meituan.msi.log.a.a("webSocket#onOpen " + WebSocketApi.this.a(e));
                }
                onOpenEvent.header = jSONObject;
                msiContext.dispatchEvent("SocketTask.onOpen", onOpenEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                OnSocketOpenEvent onSocketOpenEvent = new OnSocketOpenEvent();
                onSocketOpenEvent.header = jSONObject;
                msiContext.dispatchEvent("onSocketOpen", onSocketOpenEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // okhttp3.WebSocketListener
            public final void onFailure(WebSocket webSocket, Throwable th, Response response) {
                Object[] objArr3 = {webSocket, th, response};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e5c8d4cf4b13b95de6426c296bd5752b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e5c8d4cf4b13b95de6426c296bd5752b");
                    return;
                }
                super.onFailure(webSocket, th, response);
                String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
                if (!TextUtils.isEmpty(asString)) {
                    ConcurrentHashMap concurrentHashMap = WebSocketApi.this.c;
                    concurrentHashMap.put(asString, "code = " + WebSocketApi.b(WebSocketApi.this, th) + ",errorMsg=" + WebSocketApi.this.a(th));
                    WebSocketApi.this.d.add(asString);
                }
                com.meituan.msi.log.a.a("webSocket#onFailure taskID " + asString + "throwable message" + WebSocketApi.this.a(th));
                OnErrorEvent onErrorEvent = new OnErrorEvent();
                onErrorEvent.errMsg = WebSocketApi.this.a(th);
                onErrorEvent.errCode = WebSocketApi.b(WebSocketApi.this, th);
                msiContext.dispatchEvent("SocketTask.onError", onErrorEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketError", onErrorEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, String str2) {
                Object[] objArr3 = {webSocket, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "4bb94ce99f6a9fc9acbeaca1fcafb8c7", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "4bb94ce99f6a9fc9acbeaca1fcafb8c7");
                    return;
                }
                super.onMessage(webSocket, str2);
                OnMessageEvent onMessageEvent = new OnMessageEvent();
                onMessageEvent.data = str2;
                msiContext.dispatchEvent("SocketTask.onMessage", onMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketMessage", onMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // okhttp3.WebSocketListener
            public final void onMessage(WebSocket webSocket, f fVar) {
                Object[] objArr3 = {webSocket, fVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "7f93986997eb116976c3e05a9dbbfc7c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "7f93986997eb116976c3e05a9dbbfc7c");
                    return;
                }
                super.onMessage(webSocket, fVar);
                OnMessageEvent onMessageEvent = new OnMessageEvent();
                onMessageEvent.data = fVar.b();
                onMessageEvent.type = "base64";
                msiContext.dispatchEvent("SocketTask.onMessage", onMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketMessage", onMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosed(WebSocket webSocket, int i2, String str2) {
                Object[] objArr3 = {webSocket, Integer.valueOf(i2), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "cdca34902801b20978f57ed8a1016076", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "cdca34902801b20978f57ed8a1016076");
                    return;
                }
                super.onClosed(webSocket, i2, str2);
                OnCloseEvent onCloseEvent = new OnCloseEvent();
                onCloseEvent.code = Integer.valueOf(i2);
                onCloseEvent.reason = str2;
                msiContext.dispatchEvent("SocketTask.onClose", onCloseEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketClose", onCloseEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // okhttp3.WebSocketListener
            public final void onClosing(WebSocket webSocket, int i2, String str2) {
                Object[] objArr3 = {webSocket, Integer.valueOf(i2), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "49d7f6986281cd62ef7ebf6479a3f796", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "49d7f6986281cd62ef7ebf6479a3f796");
                } else {
                    super.onClosing(webSocket, i2, str2);
                }
            }
        });
        this.b.put(msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString(), newWebSocket);
        newWebSocket.request();
        msiContext.onSuccess("");
    }

    @MsiApiMethod(name = "closeSocket", request = CloseSocketParam.class)
    public void closeSocket(CloseSocketParam closeSocketParam, MsiContext msiContext) {
        Object[] objArr = {closeSocketParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa91e1cc2b47affa8655954bcb4ea7a4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa91e1cc2b47affa8655954bcb4ea7a4");
        } else {
            close(closeSocketParam, msiContext);
        }
    }

    public final boolean a() {
        return this.e;
    }

    @Deprecated
    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "152efb5ebfb42fdbd8f26996814c12bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "152efb5ebfb42fdbd8f26996814c12bb");
        } else if (this.e) {
        } else {
            synchronized (this) {
                if (this.e) {
                    return;
                }
                this.f = str;
                this.g = str2;
                this.e = true;
            }
        }
    }

    @MsiApiMethod(name = "SocketTask.close", request = CloseSocketParam.class)
    public void close(CloseSocketParam closeSocketParam, MsiContext msiContext) {
        Object[] objArr = {closeSocketParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a61cd88feb3cb7dfcf63596212b2b0b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a61cd88feb3cb7dfcf63596212b2b0b9");
            return;
        }
        String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        WebSocket webSocket = this.b.get(asString);
        if (webSocket != null) {
            try {
                if (TextUtils.isEmpty(closeSocketParam.reason)) {
                    closeSocketParam.reason = "";
                }
                webSocket.close(closeSocketParam.code, closeSocketParam.reason);
                this.b.remove(asString);
                this.c.remove(asString);
                this.d.remove(asString);
                msiContext.onSuccess("");
            } catch (Exception e) {
                com.meituan.msi.log.a.a("websocket#close taskId " + asString + " Exception " + e.getMessage());
                msiContext.onError(500, e.getMessage());
            }
        } else {
            com.meituan.msi.log.a.a("SocketTask.close error,no taskId according WebSocket,taskId is " + asString);
            String str = this.c.get(asString);
            this.d.remove(asString);
            if (TextUtils.isEmpty(str)) {
                msiContext.onError(500, "SocketTask.close error,no taskId according WebSocket,taskId is " + asString);
            } else {
                msiContext.onError(500, "SocketTask.close error,no taskId according WebSocket,taskId is " + asString + " error:" + str);
            }
        }
        if (this.d.size() > 100) {
            while (this.d.size() > 100) {
                String remove = this.d.remove(0);
                if (remove != null) {
                    this.c.remove(remove);
                }
            }
        }
    }

    @MsiApiMethod(name = "SocketTask.send", request = SendParam.class)
    public void send(SendParam sendParam, MsiContext msiContext) {
        Object[] objArr = {sendParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a0c87e25a6ede70293b280046fea97b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a0c87e25a6ede70293b280046fea97b");
        } else if (Strings.isEmpty(sendParam.data)) {
        } else {
            String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
            WebSocket webSocket = this.b.get(asString);
            if (webSocket != null) {
                if (Strings.isEmpty(sendParam.type) || "string".equals(sendParam.type)) {
                    webSocket.send(sendParam.data);
                } else if ("base64".equals(sendParam.type)) {
                    webSocket.send(f.a(Base64.decode(sendParam.data, 0)));
                }
                msiContext.onSuccess("");
                return;
            }
            msiContext.onError(500, "no taskId according WebSocket,taskId is " + asString);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5c2b7e96f6cb34f79196df3c64c19d", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5c2b7e96f6cb34f79196df3c64c19d") : (th == null || th.getMessage() == null) ? "defaultErrorMsg" : th.getMessage();
    }
}
