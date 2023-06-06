package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class ec extends JsonComposer {
    @Json(name = "layers")
    public List<eb> a;
    @Json(name = "enable")
    private int b;

    public final boolean a() {
        return this.b == 1;
    }

    private List<eb> b() {
        return this.a;
    }

    public String toString() {
        return "DataLayerInfo{enable=" + this.b + ", layers=" + this.a + '}';
    }
}
