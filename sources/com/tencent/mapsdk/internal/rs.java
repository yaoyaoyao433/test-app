package com.tencent.mapsdk.internal;

import com.meituan.android.common.locate.locator.GearsLocator;
import com.tencent.map.tools.json.JsonComposer;
import com.tencent.map.tools.json.annotation.Json;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class rs extends JsonComposer {
    public static int a = 0;
    public static final int b = 1000;
    public static int c = 100;
    public static final int d = 0;
    public static final int e = 0;
    public static final int f = 7;
    @Json(name = "version")
    public int g;
    @Json(name = "frontier")
    public rr h;
    @Json(name = "ver_data")
    public List<ro> i;
    @Json(name = GearsLocator.DETAIL)
    public List<rp> j;

    private int a() {
        return this.g;
    }

    private rr b() {
        return this.h;
    }

    private List<ro> c() {
        return this.i;
    }

    private void a(int i) {
        this.g = i;
    }

    private void a(rr rrVar) {
        this.h = rrVar;
    }

    private void a(List<ro> list) {
        this.i = list;
    }

    private void b(List<rp> list) {
        this.j = list;
    }

    private List<rp> d() {
        return this.j;
    }
}
