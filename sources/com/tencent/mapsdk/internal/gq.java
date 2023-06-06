package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gq extends gt {
    @Json(name = "wtc")
    public int a;
    @Json(name = "bwtc")
    public int b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gq(long j) {
        super(j);
    }

    private void a() {
        this.a++;
    }

    private void b() {
        this.b++;
    }
}
