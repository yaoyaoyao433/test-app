package com.facebook.react.uimanager;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class am {
    private static final int[] b = {1, 2, 4, 8, 16, 32, 64, 128, 256};
    public final float[] a;
    private int c;
    private final float d;
    private boolean e;

    public am() {
        this(0.0f);
    }

    public am(float f) {
        this.c = 0;
        this.d = f;
        this.a = new float[]{Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN};
    }

    public final boolean a(int i, float f) {
        boolean z = false;
        if (e.a(this.a[i], f)) {
            return false;
        }
        this.a[i] = f;
        if (com.facebook.yoga.b.a(f)) {
            this.c = (~b[i]) & this.c;
        } else {
            this.c = b[i] | this.c;
        }
        this.e = ((this.c & b[8]) == 0 && (this.c & b[7]) == 0 && (this.c & b[6]) == 0) ? true : true;
        return true;
    }

    public final float a(int i) {
        float f = (i == 4 || i == 5) ? Float.NaN : this.d;
        if (this.c == 0) {
            return f;
        }
        if ((this.c & b[i]) != 0) {
            return this.a[i];
        }
        if (this.e) {
            char c = (i == 1 || i == 3) ? (char) 7 : (char) 6;
            if ((this.c & b[c]) != 0) {
                return this.a[c];
            }
            if ((this.c & b[8]) != 0) {
                return this.a[8];
            }
        }
        return f;
    }
}
