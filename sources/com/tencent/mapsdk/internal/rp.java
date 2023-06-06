package com.tencent.mapsdk.internal;

import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class rp extends JsonComposer {
    @Json(name = "level")
    public int[] a;
    @Json(name = "districts")
    public List<rq> b;

    private void a(int[] iArr) {
        this.a = iArr;
    }

    private void a(List<rq> list) {
        this.b = list;
    }

    private int[] a() {
        return this.a;
    }

    private List<rq> b() {
        return this.b;
    }
}
