package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gv extends gt {
    @Json(name = "customLayerTimes")
    public int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gv(long j) {
        super(j);
    }

    private int a() {
        this.a++;
        return this.a;
    }
}
