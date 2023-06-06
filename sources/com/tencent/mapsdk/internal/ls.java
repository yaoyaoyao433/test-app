package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.exception.FileUploadResetException;
import com.tencent.map.tools.net.processor.RequestProcessor;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ls extends lo implements RequestProcessor {
    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(NetRequest netRequest) {
        netRequest.setRespHeaders("User-ReturnCode");
    }

    @Override // com.tencent.mapsdk.internal.lo, com.tencent.map.tools.net.processor.ResponseProcessor
    public final void onResponse(NetResponse netResponse) {
        String headerField = netResponse.getHeaderField("User-ReturnCode");
        int parseInt = Integer.parseInt(headerField);
        if (parseInt != 0) {
            if (parseInt == -2) {
                netResponse.exception(new FileUploadResetException());
            }
            netResponse.exception(new Exception("FileUploader user error:".concat(String.valueOf(headerField))));
        }
    }
}
