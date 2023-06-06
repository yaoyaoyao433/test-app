package com.tencent.mapsdk.internal;

import java.io.Serializable;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class cp implements Serializable {
    public static final int a = 0;
    public static final int c = 1;
    public static final int e = 2;
    public static final int g = 3;
    public static final int i = 4;
    public static final int k = 5;
    public static final int m = 6;
    public static final int o = 7;
    private int s;
    private String t;
    static final /* synthetic */ boolean q = !cp.class.desiredAssertionStatus();
    private static cp[] r = new cp[8];
    public static final cp b = new cp(0, 0, "RST_SUCC");
    public static final cp d = new cp(1, 1, "RST_DECODE_FAIL");
    public static final cp f = new cp(2, 2, "RST_SYS_ERR");
    public static final cp h = new cp(3, 3, "RST_INVALID_USER");
    public static final cp j = new cp(4, 4, "RST_USE_INVALID_KEY");
    public static final cp l = new cp(5, 5, "RST_INVALID_UIN");
    public static final cp n = new cp(6, 6, "RST_INVALID_CMD");
    public static final cp p = new cp(7, 7, "RST_PACKAGE_ERR");

    private static cp a(int i2) {
        for (int i3 = 0; i3 < r.length; i3++) {
            if (r[i3].s == i2) {
                return r[i3];
            }
        }
        if (q) {
            return null;
        }
        throw new AssertionError();
    }

    private static cp a(String str) {
        for (int i2 = 0; i2 < r.length; i2++) {
            if (r[i2].toString().equals(str)) {
                return r[i2];
            }
        }
        if (q) {
            return null;
        }
        throw new AssertionError();
    }

    private int a() {
        return this.s;
    }

    public final String toString() {
        return this.t;
    }

    private cp(int i2, int i3, String str) {
        this.t = new String();
        this.t = str;
        this.s = i3;
        r[i2] = this;
    }
}
