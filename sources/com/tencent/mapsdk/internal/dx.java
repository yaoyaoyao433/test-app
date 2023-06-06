package com.tencent.mapsdk.internal;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public enum dx {
    None("", 0),
    Gradient("heat", 2),
    Aggregation("honey", 3),
    ArcLine("arcline", 4);
    
    private final int e;
    private final String f;

    dx(String str, int i) {
        this.f = str;
        this.e = i;
    }

    private static dx b(String str) {
        dx[] values;
        for (dx dxVar : values()) {
            if (dxVar.a(str)) {
                return dxVar;
            }
        }
        return None;
    }

    public static dx a(int i) {
        dx[] values;
        for (dx dxVar : values()) {
            if (dxVar.e == i) {
                return dxVar;
            }
        }
        return None;
    }

    public final boolean a(String str) {
        return this.f.equals(str);
    }

    private boolean b(int i) {
        return this.e == i;
    }
}
