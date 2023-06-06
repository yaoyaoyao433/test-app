package com.meituan.mmp.lib.api.network;

import com.meituan.mmp.lib.api.ServiceApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.smtt.sdk.TbsVideoCacheTask;
import java.util.concurrent.ConcurrentHashMap;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.WebSocket;
import okio.f;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WebSocketModule extends ServiceApi {
    public static ChangeQuickRedirect a;
    private ConcurrentHashMap<String, WebSocket> h;

    public WebSocketModule() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e14ead7cfd97971c3b287a213fa975c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e14ead7cfd97971c3b287a213fa975c");
        } else {
            this.h = new ConcurrentHashMap<>();
        }
    }

    public static /* synthetic */ void a(WebSocketModule webSocketModule, WebSocket webSocket, int i, String str) {
        Object[] objArr = {webSocket, Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, webSocketModule, changeQuickRedirect, false, "416884b6a44ca4100fbde7af9120febb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, webSocketModule, changeQuickRedirect, false, "416884b6a44ca4100fbde7af9120febb");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            StringBuilder sb = new StringBuilder();
            sb.append(webSocket.hashCode());
            jSONObject.put("WebSocketID", sb.toString());
            jSONObject.put("code", i);
            jSONObject.put("reason", str);
            webSocketModule.a("onSocketClose", jSONObject.toString(), 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void a(WebSocketModule webSocketModule, WebSocket webSocket, String str) {
        Object[] objArr = {webSocket, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, webSocketModule, changeQuickRedirect, false, "1d3191cc83296f912db48687fb204b35", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, webSocketModule, changeQuickRedirect, false, "1d3191cc83296f912db48687fb204b35");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", str);
            jSONObject.put("type", "string");
            StringBuilder sb = new StringBuilder();
            sb.append(webSocket.hashCode());
            jSONObject.put("WebSocketID", sb.toString());
            webSocketModule.a("onSocketMessage", jSONObject.toString(), 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void a(WebSocketModule webSocketModule, WebSocket webSocket, Throwable th) {
        Object[] objArr = {webSocket, th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, webSocketModule, changeQuickRedirect, false, "5f01d0e15ebb5c2be2bc0fd0ee717073", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, webSocketModule, changeQuickRedirect, false, "5f01d0e15ebb5c2be2bc0fd0ee717073");
            return;
        }
        try {
            int a2 = webSocketModule.a(th);
            String b = webSocketModule.b(th);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("errCode", a2);
            jSONObject.put("errMsg", b);
            StringBuilder sb = new StringBuilder();
            sb.append(webSocket.hashCode());
            jSONObject.put("WebSocketID", sb.toString());
            webSocketModule.a("onSocketError", jSONObject.toString(), 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void a(WebSocketModule webSocketModule, WebSocket webSocket, Response response) {
        Object[] objArr = {webSocket, response};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, webSocketModule, changeQuickRedirect, false, "1ed78d5d2024f95e3d5aafc1d339ef2d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, webSocketModule, changeQuickRedirect, false, "1ed78d5d2024f95e3d5aafc1d339ef2d");
            return;
        }
        try {
            Headers headers = response.headers();
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            for (int i = 0; i < headers.size(); i++) {
                jSONObject2.put(headers.name(i), headers.value(i));
            }
            jSONObject.put(TbsVideoCacheTask.KEY_VIDEO_CACHE_PARAM_HEADER, jSONObject2);
            StringBuilder sb = new StringBuilder();
            sb.append(webSocket.hashCode());
            jSONObject.put("WebSocketID", sb.toString());
            webSocketModule.a("onSocketOpen", jSONObject.toString(), 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static /* synthetic */ void a(WebSocketModule webSocketModule, WebSocket webSocket, f fVar) {
        Object[] objArr = {webSocket, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, webSocketModule, changeQuickRedirect, false, "5884d754289ade80b3ed1c2ff4c6982c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, webSocketModule, changeQuickRedirect, false, "5884d754289ade80b3ed1c2ff4c6982c");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("data", fVar.b());
            jSONObject.put("type", "base64");
            StringBuilder sb = new StringBuilder();
            sb.append(webSocket.hashCode());
            jSONObject.put("WebSocketID", sb.toString());
            webSocketModule.a("onSocketMessage", jSONObject.toString(), 0);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f0ea6674f6cbaa2c620bfabdab24d61", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f0ea6674f6cbaa2c620bfabdab24d61") : new String[]{"connectSocketSync", "sendSocketMessage", "closeSocket"};
    }

    @Override // com.meituan.mmp.lib.api.InternalApi
    public final String[] c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02ccecc3fdf5b54637d536e2cca1310d", RobustBitConfig.DEFAULT_VALUE) ? (String[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02ccecc3fdf5b54637d536e2cca1310d") : new String[]{"connectSocketSync", "sendSocketMessage.send", "closeSocket.close", "onSocketOpen.onOpen", "onSocketClose,onClose", "onSocketError.onError", "onSocketMessage.onMessage"};
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0069 A[Catch: Exception -> 0x0304, TryCatch #1 {Exception -> 0x0304, blocks: (B:6:0x002e, B:24:0x0064, B:26:0x0069, B:28:0x0082, B:29:0x0087, B:31:0x0099, B:35:0x00b8, B:36:0x00d7, B:37:0x00dc, B:39:0x00f5, B:40:0x00fa, B:42:0x010c, B:44:0x0121, B:46:0x0130, B:45:0x012d, B:47:0x0135, B:48:0x013a, B:50:0x0153, B:51:0x0158, B:53:0x0161, B:55:0x016e, B:58:0x017d, B:60:0x0199, B:95:0x02c9, B:61:0x01a1, B:63:0x01c0, B:64:0x01c6, B:66:0x01cc, B:67:0x01db, B:70:0x01e3, B:71:0x01e8, B:72:0x01f9, B:74:0x0209, B:87:0x0263, B:89:0x02a0, B:94:0x02c5, B:90:0x02a9, B:93:0x02bb, B:75:0x0213, B:77:0x0221, B:78:0x0232, B:80:0x0238, B:81:0x024e, B:82:0x0253, B:86:0x025f, B:85:0x025b, B:96:0x0300, B:13:0x0043, B:16:0x004d, B:19:0x0057, B:32:0x00aa), top: B:102:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc A[Catch: Exception -> 0x0304, TryCatch #1 {Exception -> 0x0304, blocks: (B:6:0x002e, B:24:0x0064, B:26:0x0069, B:28:0x0082, B:29:0x0087, B:31:0x0099, B:35:0x00b8, B:36:0x00d7, B:37:0x00dc, B:39:0x00f5, B:40:0x00fa, B:42:0x010c, B:44:0x0121, B:46:0x0130, B:45:0x012d, B:47:0x0135, B:48:0x013a, B:50:0x0153, B:51:0x0158, B:53:0x0161, B:55:0x016e, B:58:0x017d, B:60:0x0199, B:95:0x02c9, B:61:0x01a1, B:63:0x01c0, B:64:0x01c6, B:66:0x01cc, B:67:0x01db, B:70:0x01e3, B:71:0x01e8, B:72:0x01f9, B:74:0x0209, B:87:0x0263, B:89:0x02a0, B:94:0x02c5, B:90:0x02a9, B:93:0x02bb, B:75:0x0213, B:77:0x0221, B:78:0x0232, B:80:0x0238, B:81:0x024e, B:82:0x0253, B:86:0x025f, B:85:0x025b, B:96:0x0300, B:13:0x0043, B:16:0x004d, B:19:0x0057, B:32:0x00aa), top: B:102:0x002e, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x013a A[Catch: Exception -> 0x0304, TryCatch #1 {Exception -> 0x0304, blocks: (B:6:0x002e, B:24:0x0064, B:26:0x0069, B:28:0x0082, B:29:0x0087, B:31:0x0099, B:35:0x00b8, B:36:0x00d7, B:37:0x00dc, B:39:0x00f5, B:40:0x00fa, B:42:0x010c, B:44:0x0121, B:46:0x0130, B:45:0x012d, B:47:0x0135, B:48:0x013a, B:50:0x0153, B:51:0x0158, B:53:0x0161, B:55:0x016e, B:58:0x017d, B:60:0x0199, B:95:0x02c9, B:61:0x01a1, B:63:0x01c0, B:64:0x01c6, B:66:0x01cc, B:67:0x01db, B:70:0x01e3, B:71:0x01e8, B:72:0x01f9, B:74:0x0209, B:87:0x0263, B:89:0x02a0, B:94:0x02c5, B:90:0x02a9, B:93:0x02bb, B:75:0x0213, B:77:0x0221, B:78:0x0232, B:80:0x0238, B:81:0x024e, B:82:0x0253, B:86:0x025f, B:85:0x025b, B:96:0x0300, B:13:0x0043, B:16:0x004d, B:19:0x0057, B:32:0x00aa), top: B:102:0x002e, inners: #0 }] */
    @Override // com.meituan.mmp.lib.api.AbsApi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void invoke(java.lang.String r26, org.json.JSONObject r27, com.meituan.mmp.main.IApiCallback r28) {
        /*
            Method dump skipped, instructions count: 786
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meituan.mmp.lib.api.network.WebSocketModule.invoke(java.lang.String, org.json.JSONObject, com.meituan.mmp.main.IApiCallback):void");
    }

    @Override // com.meituan.mmp.lib.api.ServiceApi
    public final void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7255ef34877574cca290a561bc7dc98a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7255ef34877574cca290a561bc7dc98a");
            return;
        }
        for (WebSocket webSocket : this.h.values()) {
            webSocket.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3cd7c00888ea39c2acfa0f5c28aea2e0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3cd7c00888ea39c2acfa0f5c28aea2e0")).intValue();
        }
        if (b(th) == null || !(b(th).contains("Failed to connect") || b(th).contains("failed to connect") || b(th).contains("Expected HTTP 101 response but was '200 OK'"))) {
            if (b(th) == null || !b(th).contains("Connection reset")) {
                return (th == null || !th.toString().contains("java.io.EOFException")) ? 0 : 1006;
            }
            return 1006;
        }
        return 1004;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String b(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb4410884246707c282e07e1ed06ec3b", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb4410884246707c282e07e1ed06ec3b");
        }
        if (th == null || th.getMessage() == null) {
            return null;
        }
        return th.getMessage();
    }
}
