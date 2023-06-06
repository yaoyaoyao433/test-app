package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gw extends gt {
    @Json(name = "showCount")
    private int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gw(long j) {
        super(j);
        this.a = 0;
    }

    public final int a() {
        int i = this.a + 1;
        this.a = i;
        return i;
    }
}
