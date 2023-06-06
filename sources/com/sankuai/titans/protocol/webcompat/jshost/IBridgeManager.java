package com.sankuai.titans.protocol.webcompat.jshost;

import com.sankuai.titans.protocol.jsbridge.AbsJsHandler;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public interface IBridgeManager {
    AbsJsHandler getJsHandler(String str);

    void putJsHandler(AbsJsHandler absJsHandler);

    void removeAllJsHandler();
}
