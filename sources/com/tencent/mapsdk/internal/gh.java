package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class gh extends gt {
    @Json(name = "showCount")
    public int a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public gh(long j) {
        super(j);
        this.a = 0;
    }

    private int a() {
        int i = this.a + 1;
        this.a = i;
        return i;
    }
}
