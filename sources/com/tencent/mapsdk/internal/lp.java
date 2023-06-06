package com.tencent.mapsdk.internal;

import com.meituan.passport.api.AbsApiFactory;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.processor.RequestProcessor;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lp implements RequestProcessor {
    private final boolean a;

    private lp(boolean z) {
        this.a = z;
    }

    public static lp a(boolean z) {
        return new lp(z);
    }

    @Override // com.tencent.map.tools.net.processor.RequestProcessor
    public final void onRequest(NetRequest netRequest) {
        if (this.a) {
            String str = netRequest.url;
            if (str.startsWith(AbsApiFactory.HTTP)) {
                str = str.replaceFirst(AbsApiFactory.HTTP, AbsApiFactory.HTTPS);
            }
            netRequest.url = str;
        }
    }
}
