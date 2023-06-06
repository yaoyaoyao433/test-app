package com.sankuai.titans.protocol.jsbridge;

import com.sankuai.titans.protocol.webcompat.jshost.AbsJsHost;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IKnbWebBridgeDelegate {
    AbsJsHandler createJsHandler(AbsJsHost absJsHost, String str, String str2, String str3, String str4);

    String getApiVersion(String str);

    void removeDelegateJsHost(AbsJsHost absJsHost);
}
