package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class rt extends JsonComposer {
    @Json(name = "error")
    public int a = Integer.MIN_VALUE;
    @Json(name = "info")
    public rs b;

    private int a() {
        return this.a;
    }

    private void a(int i) {
        this.a = i;
    }

    private rs b() {
        return this.b;
    }

    private void a(rs rsVar) {
        this.b = rsVar;
    }
}
