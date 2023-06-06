package com.sankuai.meituan.kernel.net.msi;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.metrics.common.Constants;
import com.meituan.msi.annotations.MsiNewApi;
import com.meituan.msi.bean.MsiContext;
import com.meituan.msi.bean.ResponseWithInnerData;
import com.meituan.network.websocket.IWebSocketApi;
import com.meituan.network.websocket.SocketCloseEvent;
import com.meituan.network.websocket.SocketCloseParam;
import com.meituan.network.websocket.SocketConnectParam;
import com.meituan.network.websocket.SocketErrorEvent;
import com.meituan.network.websocket.SocketMessageEvent;
import com.meituan.network.websocket.SocketOpenEvent;
import com.meituan.network.websocket.SocketSendParam;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.e;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.av;
import com.sankuai.meituan.retrofit2.q;
import com.sankuai.meituan.retrofit2.r;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
/* compiled from: ProGuard */
@MsiNewApi
/* loaded from: classes4.dex */
public class WebSocketApi extends IWebSocketApi {
    public static ChangeQuickRedirect b;
    private ConcurrentHashMap<String, com.sankuai.meituan.retrofit2.raw.c> c;
    private ConcurrentHashMap<String, String> d;
    private List<String> e;
    private volatile ar f;
    private volatile boolean g;
    private String h;
    private String i;

    public WebSocketApi() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce6e2eb1cb198a25c09b196fee788589", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce6e2eb1cb198a25c09b196fee788589");
            return;
        }
        this.c = new ConcurrentHashMap<>();
        this.d = new ConcurrentHashMap<>();
        this.e = Collections.synchronizedList(new ArrayList());
    }

    public static /* synthetic */ int b(WebSocketApi webSocketApi, Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, webSocketApi, changeQuickRedirect, false, "3104f7b33f4923065403ab3534f98190", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, webSocketApi, changeQuickRedirect, false, "3104f7b33f4923065403ab3534f98190")).intValue();
        }
        if (webSocketApi.a(th).contains("Failed to connect") || webSocketApi.a(th).contains("failed to connect") || webSocketApi.a(th).contains("Expected HTTP 101 response but was '200 OK'")) {
            return 1004;
        }
        return (webSocketApi.a(th).contains("Connection reset") || th.toString().contains("java.io.EOFException")) ? 1006 : 0;
    }

    public final boolean a() {
        return this.g;
    }

    public final void a(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262b653fa7f313fc8ee3f53872b9a81d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262b653fa7f313fc8ee3f53872b9a81d");
        } else if (this.g) {
        } else {
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.h = str;
                this.i = str2;
                this.g = true;
            }
        }
    }

    @Override // com.meituan.network.websocket.IWebSocketApi
    public final void a(MsiContext msiContext, SocketSendParam socketSendParam, String str) {
        Object[] objArr = {msiContext, socketSendParam, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1088354692bae0cc9a71487b30f16387", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1088354692bae0cc9a71487b30f16387");
        } else if (TextUtils.isEmpty(socketSendParam.data)) {
        } else {
            com.sankuai.meituan.retrofit2.raw.c cVar = this.c.get(str);
            if (cVar != null) {
                if (TextUtils.isEmpty(socketSendParam.type) || "string".equals(socketSendParam.type)) {
                    cVar.a(socketSendParam.data);
                } else if ("base64".equals(socketSendParam.type)) {
                    cVar.a(Base64.decode(socketSendParam.data, 0));
                }
                msiContext.onSuccess("");
                return;
            }
            msiContext.onError(500, "no taskId according WebSocket,taskId is " + str);
        }
    }

    @Override // com.meituan.network.websocket.IWebSocketApi
    public final void a(final MsiContext msiContext, SocketConnectParam socketConnectParam) {
        com.sankuai.meituan.retrofit2.raw.c a;
        Object[] objArr = {msiContext, socketConnectParam};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf19b06c42453285ea318128bec4ecb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf19b06c42453285ea318128bec4ecb7");
            return;
        }
        String str = socketConnectParam.url;
        if (TextUtils.isEmpty(str)) {
            msiContext.onError(500, "url is null or empty");
            return;
        }
        if (this.f == null) {
            ar.a a2 = new ar.a(true).a(b.b);
            e a3 = com.sankuai.meituan.kernel.net.msi.callfactory.a.a();
            Object[] objArr2 = {a3};
            ChangeQuickRedirect changeQuickRedirect2 = ar.a.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "5181e3f707552888f05d18f08b66c04e", 6917529027641081856L)) {
                a2 = (ar.a) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "5181e3f707552888f05d18f08b66c04e");
            } else if (!a2.c) {
                throw new IllegalArgumentException("forWebSocket must be true.");
            } else {
                a2.b = (e) av.a(a3, "webSocketParam == null");
            }
            this.f = a2.a();
        }
        aj a4 = a(socketConnectParam, str, msiContext);
        ar arVar = this.f;
        com.sankuai.meituan.retrofit2.raw.d dVar = new com.sankuai.meituan.retrofit2.raw.d() { // from class: com.sankuai.meituan.kernel.net.msi.WebSocketApi.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.meituan.retrofit2.raw.d
            public final void a(com.sankuai.meituan.retrofit2.raw.c cVar, com.sankuai.meituan.retrofit2.raw.b bVar) {
                Object[] objArr3 = {cVar, bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "3e54100a49ecdb93b626225591cbebf3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "3e54100a49ecdb93b626225591cbebf3");
                    return;
                }
                SocketOpenEvent socketOpenEvent = new SocketOpenEvent();
                HashMap hashMap = new HashMap();
                try {
                    List<q> headers = bVar.headers();
                    if (headers != null && !headers.isEmpty()) {
                        for (q qVar : headers) {
                            if (qVar != null) {
                                hashMap.put(qVar.b, qVar.c);
                            }
                        }
                    }
                } catch (RuntimeException e) {
                    com.sankuai.meituan.kernel.net.msi.log.a.a("webSocket#onOpen " + WebSocketApi.this.a(e));
                }
                socketOpenEvent.header = hashMap;
                msiContext.dispatchEvent("SocketTask.onOpen", socketOpenEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketOpen", socketOpenEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // com.sankuai.meituan.retrofit2.raw.d
            public final void a(com.sankuai.meituan.retrofit2.raw.c cVar, Throwable th, com.sankuai.meituan.retrofit2.raw.b bVar) {
                Object[] objArr3 = {cVar, th, bVar};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf5648d4df9701c672af1dc5724be2df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf5648d4df9701c672af1dc5724be2df");
                    return;
                }
                super.a(cVar, th, bVar);
                String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
                if (!TextUtils.isEmpty(asString)) {
                    ConcurrentHashMap concurrentHashMap = WebSocketApi.this.d;
                    concurrentHashMap.put(asString, "code = " + WebSocketApi.b(WebSocketApi.this, th) + ",errorMsg=" + WebSocketApi.this.a(th));
                    WebSocketApi.this.e.add(asString);
                }
                com.sankuai.meituan.kernel.net.msi.log.a.a("webSocket#onFailure taskID " + asString + "throwable message" + WebSocketApi.this.a(th));
                SocketErrorEvent socketErrorEvent = new SocketErrorEvent();
                socketErrorEvent.errMsg = WebSocketApi.this.a(th);
                socketErrorEvent.errCode = WebSocketApi.b(WebSocketApi.this, th);
                msiContext.dispatchEvent("SocketTask.onError", socketErrorEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketError", socketErrorEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // com.sankuai.meituan.retrofit2.raw.d
            public final void a(com.sankuai.meituan.retrofit2.raw.c cVar, String str2) {
                Object[] objArr3 = {cVar, str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9bf5a20210df41ec41eaaa952563410b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9bf5a20210df41ec41eaaa952563410b");
                    return;
                }
                super.a(cVar, str2);
                SocketMessageEvent socketMessageEvent = new SocketMessageEvent();
                socketMessageEvent.data = str2;
                msiContext.dispatchEvent("SocketTask.onMessage", socketMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketMessage", socketMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // com.sankuai.meituan.retrofit2.raw.d
            public final void a(com.sankuai.meituan.retrofit2.raw.c cVar, byte[] bArr) {
                Object[] objArr3 = {cVar, bArr};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "e1feddfbbea96ca041b653ac3b514f15", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "e1feddfbbea96ca041b653ac3b514f15");
                    return;
                }
                super.a(cVar, bArr);
                SocketMessageEvent socketMessageEvent = new SocketMessageEvent();
                socketMessageEvent.data = Base64.encodeToString(bArr, 2);
                socketMessageEvent.type = "base64";
                msiContext.dispatchEvent("SocketTask.onMessage", socketMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketMessage", socketMessageEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // com.sankuai.meituan.retrofit2.raw.d
            public final void a(com.sankuai.meituan.retrofit2.raw.c cVar, int i, String str2) {
                Object[] objArr3 = {cVar, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "95e2f2d72abe171f51f5bc2d0bc374ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "95e2f2d72abe171f51f5bc2d0bc374ff");
                    return;
                }
                super.a(cVar, i, str2);
                SocketCloseEvent socketCloseEvent = new SocketCloseEvent();
                socketCloseEvent.code = Integer.valueOf(i);
                socketCloseEvent.reason = str2;
                msiContext.dispatchEvent("SocketTask.onClose", socketCloseEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
                msiContext.dispatchEvent("onSocketClose", socketCloseEvent, msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString());
            }

            @Override // com.sankuai.meituan.retrofit2.raw.d
            public final void b(com.sankuai.meituan.retrofit2.raw.c cVar, int i, String str2) {
                Object[] objArr3 = {cVar, Integer.valueOf(i), str2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ed6f1cf468a55de8c7decd626d6d7f92", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ed6f1cf468a55de8c7decd626d6d7f92");
                } else {
                    super.b(cVar, i, str2);
                }
            }
        };
        Object[] objArr3 = {a4, dVar};
        ChangeQuickRedirect changeQuickRedirect3 = ar.a;
        if (PatchProxy.isSupport(objArr3, arVar, changeQuickRedirect3, false, "2636bdb2eb959cdb42252fdb95a81514", 6917529027641081856L)) {
            a = (com.sankuai.meituan.retrofit2.raw.c) PatchProxy.accessDispatch(objArr3, arVar, changeQuickRedirect3, false, "2636bdb2eb959cdb42252fdb95a81514");
        } else {
            av.a(arVar.f, "webSocketFactory == null");
            a = arVar.f.a(a4, dVar);
        }
        this.c.put(msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString(), a);
        msiContext.onSuccess("");
    }

    @Override // com.meituan.network.websocket.IWebSocketApi
    public final void a(MsiContext msiContext, SocketCloseParam socketCloseParam, String str) {
        Object[] objArr = {msiContext, socketCloseParam, str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47fc52bc02d60ccfd6796055cc79e475", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47fc52bc02d60ccfd6796055cc79e475");
            return;
        }
        String asString = msiContext.getInnerArgs().get(ResponseWithInnerData.TASK_ID).getAsString();
        com.sankuai.meituan.retrofit2.raw.c cVar = this.c.get(asString);
        if (cVar != null) {
            try {
                if (TextUtils.isEmpty(socketCloseParam.reason)) {
                    socketCloseParam.reason = "";
                }
                cVar.a(socketCloseParam.code, socketCloseParam.reason);
                this.c.remove(asString);
                this.d.remove(asString);
                this.e.remove(asString);
                msiContext.onSuccess("");
            } catch (Exception e) {
                com.sankuai.meituan.kernel.net.msi.log.a.a("websocket#close taskId " + asString + " Exception " + e.getMessage());
                msiContext.onError(500, e.getMessage());
            }
        } else {
            com.sankuai.meituan.kernel.net.msi.log.a.a("SocketTask.close error,no taskId according WebSocket,taskId is " + asString);
            String str2 = this.d.get(asString);
            this.e.remove(asString);
            if (TextUtils.isEmpty(str2)) {
                msiContext.onError(500, "SocketTask.close error,no taskId according WebSocket,taskId is " + asString);
            } else {
                msiContext.onError(500, "SocketTask.close error,no taskId according WebSocket,taskId is " + asString + " error:" + str2);
            }
        }
        if (this.e.size() > 100) {
            while (this.e.size() > 100) {
                String remove = this.e.remove(0);
                if (remove != null) {
                    this.d.remove(remove);
                }
            }
        }
    }

    private aj a(SocketConnectParam socketConnectParam, String str, MsiContext msiContext) {
        Object[] objArr = {socketConnectParam, str, msiContext};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f1411f41b2ff623986e57bef1a17fe9e", RobustBitConfig.DEFAULT_VALUE)) {
            return (aj) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f1411f41b2ff623986e57bef1a17fe9e");
        }
        Map hashMap = new HashMap();
        if (socketConnectParam.header != null) {
            hashMap = socketConnectParam.header;
        }
        List arrayList = new ArrayList();
        if (socketConnectParam.protocols != null) {
            arrayList = socketConnectParam.protocols;
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
        if (!TextUtils.isEmpty(this.i)) {
            hashMap.put(Constants.TRAFFIC_REFERER, this.i);
        }
        if (!TextUtils.isEmpty(this.h)) {
            hashMap.put("User-Agent", this.h);
        }
        r a = r.a(hashMap);
        aj.a aVar = new aj.a();
        aVar.b = str;
        return aVar.a(a.b).a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30571c3098f2995d06321694ae825239", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30571c3098f2995d06321694ae825239") : (th == null || th.getMessage() == null) ? "defaultErrorMsg" : th.getMessage();
    }
}
