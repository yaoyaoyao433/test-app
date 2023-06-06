package com.tencent.mapsdk.internal;

import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class co implements Serializable {
    public static final int a = 29;
    public static final int b = 1;
    public static final int c = 8;
    private int g = 29;
    private String h;
    static final /* synthetic */ boolean e = !co.class.desiredAssertionStatus();
    private static co[] f = new co[28];
    public static final co d = new co("REQ_CONFIG");

    private static co a(int i) {
        for (int i2 = 0; i2 < f.length; i2++) {
            if (f[i2].g == i) {
                return f[i2];
            }
        }
        if (e) {
            return null;
        }
        throw new AssertionError();
    }

    private static co a(String str) {
        for (int i = 0; i < f.length; i++) {
            if (f[i].toString().equals(str)) {
                return f[i];
            }
        }
        if (e) {
            return null;
        }
        throw new AssertionError();
    }

    private int a() {
        return this.g;
    }

    public final String toString() {
        return this.h;
    }

    private co(String str) {
        this.h = new String();
        this.h = str;
        f[26] = this;
    }
}
