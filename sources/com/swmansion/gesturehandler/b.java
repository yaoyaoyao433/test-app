package com.swmansion.gesturehandler;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.bridge.UiThreadUtil;
import com.swmansion.gesturehandler.b;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class b<T extends b> {
    private static int a = 12;
    private static MotionEvent.PointerProperties[] b;
    private static MotionEvent.PointerCoords[] u;
    private static short y;
    private float A;
    public int e;
    public View f;
    public boolean h;
    public short j;
    public float k;
    public float l;
    public boolean m;
    d o;
    public i<T> p;
    public c q;
    int r;
    boolean s;
    boolean t;
    private float v;
    private float w;
    private float[] x;
    private float z;
    final int[] c = new int[a];
    int d = 0;
    public int g = 0;
    public boolean i = true;
    public int n = 0;

    protected void a() {
    }

    protected void b() {
    }

    protected void b(int i, int i2) {
    }

    private static boolean a(float f) {
        return !Float.isNaN(f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(int i, int i2) {
        if (this.p != null) {
            this.p.a(this, i, i2);
        }
    }

    public final boolean a(b bVar) {
        for (int i = 0; i < this.c.length; i++) {
            if (this.c[i] != -1 && bVar.c[i] != -1) {
                return true;
            }
        }
        return false;
    }

    public final T a(float f, float f2, float f3, float f4, float f5, float f6) {
        if (this.x == null) {
            this.x = new float[6];
        }
        this.x[0] = f;
        this.x[1] = f2;
        this.x[2] = f3;
        this.x[3] = f4;
        this.x[4] = f5;
        this.x[5] = f6;
        if (a(f5) && a(f) && a(f3)) {
            throw new IllegalArgumentException("Cannot have all of left, right and width defined");
        }
        if (a(f5) && !a(f) && !a(f3)) {
            throw new IllegalArgumentException("When width is set one of left or right pads need to be defined");
        }
        if (a(f6) && a(f4) && a(f2)) {
            throw new IllegalArgumentException("Cannot have all of top, bottom and height defined");
        }
        if (!a(f6) || a(f4) || a(f2)) {
            return this;
        }
        throw new IllegalArgumentException("When height is set one of top or bottom pads need to be defined");
    }

    public final void a(int i) {
        if (this.c[i] == -1) {
            int[] iArr = this.c;
            int i2 = 0;
            while (i2 < this.d) {
                int i3 = 0;
                while (i3 < this.c.length && this.c[i3] != i2) {
                    i3++;
                }
                if (i3 == this.c.length) {
                    break;
                }
                i2++;
            }
            iArr[i] = i2;
            this.d++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(android.view.MotionEvent r28) {
        /*
            Method dump skipped, instructions count: 403
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.b.b(android.view.MotionEvent):void");
    }

    private void b(int i) {
        UiThreadUtil.assertOnUiThread();
        if (this.g == i) {
            return;
        }
        int i2 = this.g;
        this.g = i;
        if (this.g == 4) {
            short s = y;
            y = (short) (s + 1);
            this.j = s;
        }
        d dVar = this.o;
        dVar.d++;
        if (d.a(i)) {
            for (int i3 = 0; i3 < dVar.b; i3++) {
                b bVar = dVar.a[i3];
                if (d.a(bVar, this)) {
                    if (i == 5) {
                        bVar.cancel();
                        bVar.t = false;
                    } else {
                        dVar.a(bVar);
                    }
                }
            }
            dVar.b();
        }
        if (i == 4) {
            dVar.a(this);
        } else if ((i2 != 4 && i2 != 5) || this.s) {
            a(i, i2);
        }
        dVar.d--;
        if (dVar.c || dVar.d != 0) {
            dVar.e = true;
        } else {
            dVar.a();
        }
        b(i, i2);
    }

    public boolean b(b bVar) {
        return (bVar == this || this.q != null) ? false : false;
    }

    public final boolean c(b bVar) {
        if (bVar == this || this.q == null) {
            return false;
        }
        return this.q.a(this, bVar);
    }

    public boolean d(b bVar) {
        if (bVar == this) {
            return true;
        }
        if (this.q != null) {
            return this.q.b(this, bVar);
        }
        return false;
    }

    public boolean e(b bVar) {
        return (bVar == this || this.q == null) ? false : false;
    }

    public final boolean a(View view, float f, float f2) {
        float f3;
        float width = view.getWidth();
        float height = view.getHeight();
        if (this.x != null) {
            float f4 = this.x[0];
            float f5 = this.x[1];
            float f6 = this.x[2];
            float f7 = this.x[3];
            f3 = a(f4) ? 0.0f - f4 : 0.0f;
            r4 = a(f5) ? 0.0f - f5 : 0.0f;
            if (a(f6)) {
                width += f6;
            }
            if (a(f7)) {
                height += f7;
            }
            float f8 = this.x[4];
            float f9 = this.x[5];
            if (a(f8)) {
                if (!a(f4)) {
                    f3 = width - f8;
                } else if (!a(f6)) {
                    width = f8 + f3;
                }
            }
            if (a(f9)) {
                if (!a(f5)) {
                    r4 = height - f9;
                } else if (!a(f7)) {
                    height = r4 + f9;
                }
            }
        } else {
            f3 = 0.0f;
        }
        return f >= f3 && f <= width && f2 >= r4 && f2 <= height;
    }

    public final void cancel() {
        if (this.g == 4 || this.g == 0 || this.g == 2) {
            a();
            b(3);
        }
    }

    public final void c() {
        if (this.g == 4 || this.g == 0 || this.g == 2) {
            b(1);
        }
    }

    public final void d() {
        if (this.g == 0 || this.g == 2) {
            b(4);
        }
    }

    public final void e() {
        if (this.g == 0) {
            b(2);
        }
    }

    public final void f() {
        if (this.g == 2 || this.g == 4) {
            b(5);
        }
    }

    protected void a(MotionEvent motionEvent) {
        b(1);
    }

    public final void g() {
        this.f = null;
        this.o = null;
        Arrays.fill(this.c, -1);
        this.d = 0;
        b();
    }

    public String toString() {
        String simpleName = this.f == null ? null : this.f.getClass().getSimpleName();
        return getClass().getSimpleName() + "@[" + this.e + "]:" + simpleName;
    }

    public final float h() {
        return this.k - this.z;
    }

    public final float i() {
        return this.l - this.A;
    }
}
