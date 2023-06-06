package com.meituan.msc.modules.api.msi.hook;

import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.IMsiApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.msi.WebSocketApi;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class c extends com.meituan.msc.modules.api.msi.c<Object> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msi.interceptor.a
    public final Object a(ApiRequest apiRequest, Object obj) {
        return obj;
    }

    @Override // com.meituan.msc.modules.api.msi.c
    public final String a() {
        return "connectSocket";
    }

    @Override // com.meituan.msi.interceptor.a
    public final void a(ApiRequest apiRequest) {
        WebSocketApi webSocketApi;
        com.meituan.msi.api.websocket.WebSocketApi webSocketApi2;
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "befad61db85d6f5ab5964d910e195a62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "befad61db85d6f5ab5964d910e195a62");
            return;
        }
        IMsiApi apiImpl = apiRequest.getApiImpl();
        WebSocketApi webSocketApi3 = null;
        if (apiImpl instanceof com.meituan.msi.api.websocket.WebSocketApi) {
            webSocketApi2 = (com.meituan.msi.api.websocket.WebSocketApi) apiImpl;
            if (webSocketApi2 == null || webSocketApi2.a()) {
                return;
            }
        } else if (!(apiImpl instanceof WebSocketApi) || (webSocketApi = (WebSocketApi) apiImpl) == null || webSocketApi.a()) {
            return;
        } else {
            webSocketApi3 = webSocketApi;
            webSocketApi2 = null;
        }
        if (webSocketApi2 != null) {
            webSocketApi2.a(b.b(), b.a(this.b.r));
        } else if (webSocketApi3 != null) {
            webSocketApi3.a(b.b(), b.a(this.b.r));
        }
    }
}
