package com.swmansion.gesturehandler;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class d {
    private static final PointF g = new PointF();
    private static final float[] h = new float[2];
    private static final Matrix i = new Matrix();
    private static final float[] j = new float[2];
    private static final Comparator<b> k = new Comparator<b>() { // from class: com.swmansion.gesturehandler.d.1
        @Override // java.util.Comparator
        public final /* synthetic */ int compare(b bVar, b bVar2) {
            b bVar3 = bVar;
            b bVar4 = bVar2;
            if ((bVar3.s && bVar4.s) || (bVar3.t && bVar4.t)) {
                return Integer.signum(bVar4.r - bVar3.r);
            }
            if (bVar3.s) {
                return -1;
            }
            if (bVar4.s) {
                return 1;
            }
            if (bVar3.t) {
                return -1;
            }
            return bVar4.t ? 1 : 0;
        }
    };
    private final ViewGroup l;
    private final e m;
    private final p n;
    private final b[] o = new b[20];
    final b[] a = new b[20];
    private final b[] p = new b[20];
    private final b[] q = new b[20];
    private int r = 0;
    int b = 0;
    boolean c = false;
    int d = 0;
    boolean e = false;
    private int s = 0;
    public float f = 0.0f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(int i2) {
        return i2 == 3 || i2 == 1 || i2 == 5;
    }

    public d(ViewGroup viewGroup, e eVar, p pVar) {
        this.l = viewGroup;
        this.m = eVar;
        this.n = pVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0095, code lost:
        if (r7 == r12.l) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(android.view.MotionEvent r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.gesturehandler.d.a(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        boolean z = false;
        for (int i2 = this.r - 1; i2 >= 0; i2--) {
            b bVar = this.o[i2];
            if (a(bVar.g) && !bVar.t) {
                this.o[i2] = null;
                bVar.g();
                bVar.s = false;
                bVar.t = false;
                bVar.r = Integer.MAX_VALUE;
                z = true;
            }
        }
        if (z) {
            int i3 = 0;
            for (int i4 = 0; i4 < this.r; i4++) {
                if (this.o[i4] != null) {
                    this.o[i3] = this.o[i4];
                    i3++;
                }
            }
            this.r = i3;
        }
        this.e = false;
    }

    private boolean b(b bVar) {
        for (int i2 = 0; i2 < this.r; i2++) {
            b bVar2 = this.o[i2];
            if (!a(bVar2.g) && a(bVar, bVar2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(b bVar) {
        if (b(bVar)) {
            d(bVar);
            return;
        }
        c(bVar);
        bVar.t = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b() {
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (this.a[i3].t) {
                this.a[i2] = this.a[i3];
                i2++;
            }
        }
        this.b = i2;
    }

    private void a(View view, MotionEvent motionEvent, float[] fArr) {
        if (view == this.l) {
            fArr[0] = motionEvent.getX();
            fArr[1] = motionEvent.getY();
        } else if (view == null || !(view.getParent() instanceof ViewGroup)) {
            throw new IllegalArgumentException("Parent is null? View is no longer in the tree");
        } else {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            a(viewGroup, motionEvent, fArr);
            PointF pointF = g;
            a(fArr[0], fArr[1], viewGroup, view, pointF);
            fArr[0] = pointF.x;
            fArr[1] = pointF.y;
        }
    }

    private void d(b bVar) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.a[i2] == bVar) {
                return;
            }
        }
        if (this.b >= this.a.length) {
            throw new IllegalStateException("Too many recognizers");
        }
        b[] bVarArr = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        bVarArr[i3] = bVar;
        bVar.t = true;
        int i4 = this.s;
        this.s = i4 + 1;
        bVar.r = i4;
    }

    private boolean a(View view, float[] fArr, int i2) {
        ArrayList<b> a = this.m.a(view);
        if (a != null) {
            int size = a.size();
            boolean z = false;
            for (int i3 = 0; i3 < size; i3++) {
                b bVar = a.get(i3);
                if (bVar.i && bVar.a(view, fArr[0], fArr[1])) {
                    int i4 = 0;
                    while (true) {
                        if (i4 < this.r) {
                            if (this.o[i4] == bVar) {
                                break;
                            }
                            i4++;
                        } else if (this.r >= this.o.length) {
                            throw new IllegalStateException("Too many recognizers");
                        } else {
                            b[] bVarArr = this.o;
                            int i5 = this.r;
                            this.r = i5 + 1;
                            bVarArr[i5] = bVar;
                            bVar.s = false;
                            bVar.t = false;
                            bVar.r = Integer.MAX_VALUE;
                            if (bVar.f != null || bVar.o != null) {
                                throw new IllegalStateException("Already prepared or hasn't been reset");
                            }
                            Arrays.fill(bVar.c, -1);
                            bVar.d = 0;
                            bVar.g = 0;
                            bVar.f = view;
                            bVar.o = this;
                        }
                    }
                    bVar.a(i2);
                    z = true;
                }
            }
            return z;
        }
        return false;
    }

    private boolean a(ViewGroup viewGroup, float[] fArr, int i2) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View a = this.n.a(viewGroup, childCount);
            if (a(a)) {
                PointF pointF = g;
                a(fArr[0], fArr[1], viewGroup, a, pointF);
                float f = fArr[0];
                float f2 = fArr[1];
                fArr[0] = pointF.x;
                fArr[1] = pointF.y;
                boolean b = (!b(a) || a(fArr[0], fArr[1], a)) ? b(a, fArr, i2) : false;
                fArr[0] = f;
                fArr[1] = f2;
                if (b) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean a(View view, float[] fArr) {
        return (!(view instanceof ViewGroup) || view.getBackground() != null) && a(fArr[0], fArr[1], view);
    }

    private boolean b(View view, float[] fArr, int i2) {
        l a = this.n.a(view);
        if (a == l.NONE) {
            return false;
        }
        if (a == l.BOX_ONLY) {
            return a(view, fArr, i2) || a(view, fArr);
        } else if (a == l.BOX_NONE) {
            if (view instanceof ViewGroup) {
                return a((ViewGroup) view, fArr, i2);
            }
            return false;
        } else if (a == l.AUTO) {
            return a(view, fArr, i2) || (view instanceof ViewGroup ? a((ViewGroup) view, fArr, i2) : false) || a(view, fArr);
        } else {
            throw new IllegalArgumentException("Unknown pointer event type: " + a.toString());
        }
    }

    private boolean a(View view) {
        return view.getVisibility() == 0 && view.getAlpha() >= this.f;
    }

    private static void a(float f, float f2, ViewGroup viewGroup, View view, PointF pointF) {
        float scrollX = (f + viewGroup.getScrollX()) - view.getLeft();
        float scrollY = (f2 + viewGroup.getScrollY()) - view.getTop();
        Matrix matrix = view.getMatrix();
        if (!matrix.isIdentity()) {
            float[] fArr = h;
            fArr[0] = scrollX;
            fArr[1] = scrollY;
            Matrix matrix2 = i;
            matrix.invert(matrix2);
            matrix2.mapPoints(fArr);
            float f3 = fArr[0];
            scrollY = fArr[1];
            scrollX = f3;
        }
        pointF.set(scrollX, scrollY);
    }

    private boolean b(View view) {
        return !(view instanceof ViewGroup) || this.n.a((ViewGroup) view);
    }

    private static boolean a(float f, float f2, View view) {
        return f >= 0.0f && f <= ((float) view.getWidth()) && f2 >= 0.0f && f2 < ((float) view.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(b bVar, b bVar2) {
        if (bVar != bVar2) {
            return bVar.c(bVar2) || bVar2.b(bVar);
        }
        return false;
    }

    private static boolean b(b bVar, b bVar2) {
        return bVar == bVar2 || bVar.d(bVar2) || bVar2.d(bVar);
    }

    private static boolean c(b bVar, b bVar2) {
        if (bVar.a(bVar2) && !b(bVar, bVar2)) {
            if (bVar != bVar2) {
                if (bVar.t || bVar.g == 4) {
                    return bVar.e(bVar2);
                }
                return true;
            }
            return true;
        }
        return false;
    }

    private void c(b bVar) {
        int i2 = bVar.g;
        bVar.t = false;
        bVar.s = true;
        int i3 = this.s;
        this.s = i3 + 1;
        bVar.r = i3;
        int i4 = 0;
        for (int i5 = 0; i5 < this.r; i5++) {
            b bVar2 = this.o[i5];
            if (c(bVar2, bVar)) {
                this.q[i4] = bVar2;
                i4++;
            }
        }
        for (int i6 = i4 - 1; i6 >= 0; i6--) {
            this.q[i6].cancel();
        }
        for (int i7 = this.b - 1; i7 >= 0; i7--) {
            b bVar3 = this.a[i7];
            if (c(bVar3, bVar)) {
                bVar3.cancel();
                bVar3.t = false;
            }
        }
        b();
        bVar.a(4, 2);
        if (i2 != 4) {
            bVar.a(5, 4);
            if (i2 != 5) {
                bVar.a(0, 5);
            }
        }
    }
}
