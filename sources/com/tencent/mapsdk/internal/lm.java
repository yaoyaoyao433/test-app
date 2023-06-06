package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.NetManager;
import com.tencent.map.tools.net.NetRequest;
import com.tencent.map.tools.net.NetResponse;
import java.io.Closeable;
import java.io.InputStream;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class lm extends le {
    private NetResponse a;

    private static InputStream a(InputStream inputStream) {
        return inputStream;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(NetRequest.NetRequestBuilder netRequestBuilder) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(NetResponse netResponse) {
    }

    @Override // com.tencent.mapsdk.internal.le
    public InputStream e(String str) {
        NetRequest.NetRequestBuilder url = NetManager.getInstance().builder().url(str);
        a(url);
        this.a = url.doStream();
        if (this.a != null) {
            InputStream inputStream = this.a.getInputStream();
            a(this.a);
            return inputStream;
        }
        a(new NetResponse(url.getNetRequest()));
        return null;
    }

    @Override // com.tencent.mapsdk.internal.le
    public final void b() {
        super.b();
        if (this.a != null) {
            kd.a((Closeable) this.a.getInputStream());
        }
    }
}
