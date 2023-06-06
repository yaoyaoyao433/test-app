package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.NetUtil;
import com.tencent.map.tools.net.processor.ResponseProcessor;
import java.io.Closeable;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class lo implements ResponseProcessor {
    @Override // com.tencent.map.tools.net.processor.ResponseProcessor
    public void onResponse(NetResponse netResponse) {
        try {
            try {
                if (netResponse.available()) {
                    netResponse.data = NetUtil.toBytesThrow(netResponse.dataStream);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        } finally {
            kd.a((Closeable) netResponse.dataStream);
            netResponse.dataStream = null;
        }
    }
}
