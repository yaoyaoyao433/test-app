package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rr extends JsonComposer {
    @Json(name = "version")
    public int a = 0;
    @Json(name = "path")
    public String b;

    private String a() {
        return this.b;
    }

    private void a(String str) {
        this.b = str;
    }

    private int b() {
        return this.a;
    }

    private void a(int i) {
        this.a = i;
    }
}
