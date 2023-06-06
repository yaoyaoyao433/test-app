package com.tencent.mapsdk.internal;

import android.os.Build;
import com.tencent.map.tools.net.NetMethod;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import com.tencent.map.tools.net.processor.Processor;
import com.tencent.map.tools.net.processor.RequestProcessor;
import com.tencent.map.tools.net.processor.ResponseProcessor;
import java.net.HttpURLConnection;
import java.util.Collections;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class lb extends la {
    private static final String b = "URLNetImpl";
    private static final boolean c = false;
    private HttpURLConnection d;

    static /* synthetic */ HttpURLConnection a(lb lbVar) {
        lbVar.d = null;
        return null;
    }

    private static void b() {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    private static void d(NetRequest netRequest) throws Exception {
        for (Processor processor : netRequest.processors) {
            if (processor instanceof RequestProcessor) {
                ((RequestProcessor) processor).onRequest(netRequest);
            }
        }
    }

    private static void a(NetResponse netResponse) throws Exception {
        List<Processor> processors = netResponse.getProcessors();
        Collections.reverse(processors);
        for (Processor processor : processors) {
            if (processor instanceof ResponseProcessor) {
                ((ResponseProcessor) processor).onResponse(netResponse);
            }
        }
    }

    @Override // com.tencent.mapsdk.internal.la
    protected final NetResponse a(NetRequest netRequest) {
        netRequest.setNetMethod(NetMethod.GET);
        return doRequest(netRequest);
    }

    @Override // com.tencent.mapsdk.internal.la
    protected final NetResponse b(NetRequest netRequest) {
        netRequest.setNetMethod(NetMethod.POST);
        return doRequest(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public final NetResponse doRequest(NetRequest netRequest) {
        netRequest.addProcessor(new lo());
        return c(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public final NetResponse openStream(NetRequest netRequest) {
        netRequest.addProcessor(new lu());
        return c(netRequest);
    }

    @Override // com.tencent.map.tools.net.NetAdapter
    public final boolean cancel() {
        if (this.d != null) {
            this.d.disconnect();
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static final class a {
        private static final int c = 3;
        int a;
        boolean b = true;

        a(int i) {
            this.a = i;
            if (this.a > 3) {
                this.a = 3;
            }
            if (this.a <= 0) {
                this.a = 1;
            }
        }

        private boolean b() {
            return this.b && this.a > 0;
        }

        final void a() {
            this.a--;
        }

        private void c() {
            this.b = false;
        }
    }

    @Override // com.tencent.mapsdk.internal.la
    protected final void a() {
        if (Integer.parseInt(Build.VERSION.SDK) < 8) {
            System.setProperty("http.keepAlive", "false");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x004d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private com.tencent.map.tools.net.NetResponse c(com.tencent.map.tools.net.NetRequest r19) {
        /*
            Method dump skipped, instructions count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mapsdk.internal.lb.c(com.tencent.map.tools.net.NetRequest):com.tencent.map.tools.net.NetResponse");
    }
}
