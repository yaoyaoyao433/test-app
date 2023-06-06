package com.tencent.mapsdk.internal;

import com.tencent.map.tools.net.http.HttpProxyRule;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class cn implements cm {
    public boolean a;
    public List<HttpProxyRule> b;

    private void a(boolean z) {
        this.a = z;
    }

    private void a(List<HttpProxyRule> list) {
        this.b = list;
    }

    private void a(cl clVar) {
        this.a = clVar.a;
        this.b = clVar.b;
    }

    @Override // com.tencent.mapsdk.internal.cm
    public final boolean a() {
        return this.a;
    }

    @Override // com.tencent.mapsdk.internal.cm
    public final List<HttpProxyRule> b() {
        return this.b;
    }
}
