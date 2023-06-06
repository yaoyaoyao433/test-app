package android.support.constraint.solver;

import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class h {
    private static int j = 1;
    private static int k = 1;
    private static int l = 1;
    private static int m = 1;
    private static int n = 1;
    public float d;
    int f;
    private String o;
    public int a = -1;
    int b = -1;
    public int c = 0;
    float[] e = new float[7];
    b[] g = new b[8];
    int h = 0;
    public int i = 0;

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static final class a {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        private static final /* synthetic */ int[] f = {a, b, c, d, e};
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a() {
        k++;
    }

    public h(int i, String str) {
        this.f = i;
    }

    public final void a(b bVar) {
        for (int i = 0; i < this.h; i++) {
            if (this.g[i] == bVar) {
                return;
            }
        }
        if (this.h >= this.g.length) {
            this.g = (b[]) Arrays.copyOf(this.g, this.g.length * 2);
        }
        this.g[this.h] = bVar;
        this.h++;
    }

    public final void b(b bVar) {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.g[i2] == bVar) {
                for (int i3 = 0; i3 < (i - i2) - 1; i3++) {
                    int i4 = i2 + i3;
                    this.g[i4] = this.g[i4 + 1];
                }
                this.h--;
                return;
            }
        }
    }

    public final void c(b bVar) {
        int i = this.h;
        for (int i2 = 0; i2 < i; i2++) {
            this.g[i2].d.a(this.g[i2], bVar, false);
        }
        this.h = 0;
    }

    public final void b() {
        this.o = null;
        this.f = a.e;
        this.c = 0;
        this.a = -1;
        this.b = -1;
        this.d = 0.0f;
        this.h = 0;
        this.i = 0;
    }

    public final String toString() {
        return "" + this.o;
    }
}
