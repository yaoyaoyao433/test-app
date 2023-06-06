package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.map.tools.net.processor.ResponseProcessor;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lr implements RequestProcessor, ResponseProcessor {
    private final boolean a;

    public lr(boolean z) {
        this.a = z;
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(NetRequest netRequest) {
        if (this.a) {
            kj.c(ki.k, "REQ[" + netRequest.mRequestId + "][" + netRequest.mNetMethod.name() + "]: " + netRequest.toString());
        }
    }

    @Override // com.tencent.map.tools.net.processor.ResponseProcessor
    public final void onResponse(NetResponse netResponse) {
        if (this.a) {
            kj.c(ki.k, "RESP[" + netResponse.mRequestId + "]: " + netResponse.toHumanString());
        }
    }
}
