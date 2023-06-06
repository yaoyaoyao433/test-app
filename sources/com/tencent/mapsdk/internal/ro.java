package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class ro extends JsonComposer {
    public static final int a = 1;
    public static final int b = 2;
    public static final int c = 3;
    @Json(name = "scenetype")
    public int d;
    @Json(name = "tilesrc")
    public ru e;

    private int a() {
        return this.d;
    }

    private ru b() {
        return this.e;
    }

    private void c() {
        this.d = 1;
    }

    private void a(ru ruVar) {
        this.e = ruVar;
    }
}
