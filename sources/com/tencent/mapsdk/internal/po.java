package com.tencent.mapsdk.internal;

import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.common.CommonConstant;
import com.tencent.mapsdk.internal.kn;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class po implements View.OnTouchListener {
    private static final int I = 50;
    private static final int b = 255;
    private static final int c = 5;
    private static final int d = 6;
    private static final double e = 2.5d;
    private static final double f = 0.5d;
    private static final double g = 0.003d;
    private static final double h = 0.001d;
    private static final double i = 0.1d;
    private static final double j = 0.5d;
    private static final int k = 0;
    private static final int l = 1;
    private static final int m = 2;
    private static final int n = 4;
    private static final int o = 8;
    private static final float p = (float) Math.cos(0.0017453292780017621d);
    private static final int q = 10;
    private static final int u = 120;
    private final GestureDetector E;
    private final be F;
    private final WeakReference<sw> G;
    private Method J;
    private Method K;
    private boolean r;
    private boolean s;
    private long t;
    private int v = 0;
    private final PointF w = new PointF();
    private final PointF x = new PointF();
    private final PointF y = new PointF();
    private final PointF z = new PointF();
    private final PointF A = new PointF();
    private final PointF B = new PointF();
    private final PointF C = new PointF();
    private long D = 0;
    private final a H = new a(this, (byte) 0);
    public final pp a = new pp();

    public po(sw swVar) {
        this.G = new WeakReference<>(swVar);
        this.E = new GestureDetector(swVar.G(), this.H);
        this.F = (be) swVar.d_;
        this.E.setOnDoubleTapListener(this.H);
    }

    public final void a(et etVar) {
        synchronized (this.a) {
            this.a.a(etVar);
        }
    }

    private void b(et etVar) {
        synchronized (this.a) {
            this.a.b(etVar);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        double max;
        boolean z;
        double max2;
        double d2;
        int i2;
        int width;
        switch (motionEvent.getAction() & 255) {
            case 0:
                this.D = 0L;
                this.r = false;
                this.a.i(motionEvent.getX(), motionEvent.getY());
                break;
            case 1:
            case 3:
                long currentTimeMillis = System.currentTimeMillis() - this.D;
                if (this.v == 0 && currentTimeMillis > 0 && currentTimeMillis < 200) {
                    double d3 = this.y.x - this.z.x;
                    double d4 = this.y.y - this.z.y;
                    if ((d3 * d3) + (d4 * d4) > 2500.0d) {
                        this.a.b();
                    }
                }
                this.a.j(motionEvent.getX(), motionEvent.getY());
                break;
            case 2:
                if (this.r && !this.s) {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (currentTimeMillis2 - this.t < 8) {
                        return true;
                    }
                    this.t = currentTimeMillis2;
                    a(this.w, this.x, motionEvent);
                    float f2 = this.w.x - this.y.x;
                    float f3 = this.w.y - this.y.y;
                    float f4 = this.x.x - this.z.x;
                    float f5 = this.x.y - this.z.y;
                    boolean z2 = ((double) Math.abs(f3)) > ((double) Math.abs(f2)) * 1.5d && ((double) Math.abs(f5)) > ((double) Math.abs(f4)) * 1.5d;
                    boolean z3 = ((double) Math.abs(f3)) > ((double) Math.abs(f2)) * 1.5d && ((double) Math.abs(f5)) > ((double) Math.abs(f4)) * 1.5d;
                    boolean z4 = ((double) Math.abs(f2)) > ((double) Math.abs(f3)) * 1.5d && ((double) Math.abs(f4)) > ((double) Math.abs(f5)) * 1.5d;
                    boolean z5 = z2;
                    boolean z6 = ((double) Math.abs(f2)) > ((double) Math.abs(f3)) * 1.5d && ((double) Math.abs(f4)) > ((double) Math.abs(f5)) * 1.5d;
                    int i3 = ((f2 * f4) > 0.0f ? 1 : ((f2 * f4) == 0.0f ? 0 : -1));
                    boolean z7 = i3 > 0;
                    int i4 = ((f3 * f5) > 0.0f ? 1 : ((f3 * f5) == 0.0f ? 0 : -1));
                    boolean z8 = i4 > 0;
                    boolean z9 = ((this.v & 8) == 0 && (this.v & 1) == 0 && (this.v & 4) == 0) ? false : true;
                    double d5 = z9 ? i : 0.5d;
                    if (i3 > 0) {
                        max = Math.abs(f2 + f4);
                    } else {
                        max = Math.max(Math.abs(f2), Math.abs(f4));
                    }
                    if (i4 > 0) {
                        z = z6;
                        max2 = Math.abs(f3 + f5);
                    } else {
                        z = z6;
                        max2 = Math.max(Math.abs(f3), Math.abs(f5));
                    }
                    double max3 = Math.max(max, max2);
                    boolean z10 = max3 > d5;
                    boolean z11 = z10 && z7 && (z4 || z) && this.G.get().g();
                    boolean z12 = z10 && z8 && (z5 || z3) && this.G.get().i();
                    double d6 = this.z.x - this.y.x;
                    boolean z13 = z11;
                    double d7 = this.z.y - this.y.y;
                    double d8 = this.x.x - this.w.x;
                    double d9 = this.x.y - this.w.y;
                    double sqrt = Math.sqrt((d6 * d6) + (d7 * d7));
                    double sqrt2 = Math.sqrt((d8 * d8) + (d9 * d9));
                    double d10 = sqrt * sqrt2;
                    double d11 = ((d6 * d8) + (d7 * d9)) / d10;
                    boolean z14 = z7;
                    boolean z15 = z8;
                    double acos = (Math.acos(d11) * 180.0d) / 3.141592653589793d;
                    if ((d6 * d9) - (d7 * d8) < 0.0d) {
                        acos = -acos;
                    }
                    boolean z16 = Math.abs(d11) < ((double) p);
                    double d12 = (this.v & 2) == 0 ? e : 0.5d;
                    double abs = Math.abs(acos);
                    boolean z17 = d10 > 0.0d && z16 && Math.abs(acos) > d12 && this.G.get().j();
                    double d13 = sqrt2 / sqrt;
                    double d14 = z9 ? h : g;
                    double abs2 = Math.abs(d13 - 1.0d);
                    boolean z18 = sqrt > 0.0d && abs2 > d14 && this.G.get().h();
                    kn.f("GD").a("trace-gesture", "began:" + z10 + CommonConstant.Symbol.COLON + z18 + CommonConstant.Symbol.COLON + z17, "value:" + max3 + CommonConstant.Symbol.COLON + abs2 + CommonConstant.Symbol.COLON + abs);
                    if (z17) {
                        z10 = false;
                    }
                    if (z12) {
                        z18 = false;
                        z17 = false;
                        z13 = false;
                    }
                    kn.f("GD").a("beganMove:".concat(String.valueOf(z10)), "vertical:".concat(String.valueOf(z15)), "horizontal:".concat(String.valueOf(z14)), "verticalMove:".concat(String.valueOf(z12)), "horizontalMove:".concat(String.valueOf(z13)));
                    kn.f("GD").a("beganRotate:".concat(String.valueOf(z17)), "cosValue : ".concat(String.valueOf(d11)), "cosAngle : ".concat(String.valueOf(z16)), "angle:".concat(String.valueOf(acos)), "rotateJudge : ".concat(String.valueOf(d12)));
                    kn.f("GD").a("beganScale:".concat(String.valueOf(z18)), "d1:".concat(String.valueOf(sqrt)), "scale - 1 = " + Math.abs(d2), "scaleJudge : ".concat(String.valueOf(d14)));
                    if (z10) {
                        if (z13) {
                            this.v |= 8;
                            kn.f("GD").a("MT_INTENT_MOVE");
                            this.a.d((f2 + f4) / 2.0f, (f3 + f5) / 2.0f);
                        }
                        if (z12) {
                            this.v |= 1;
                            kn.f("GD").a("MT_INTENT_MOVE_VERTICAL");
                            this.y.set(this.w.x, this.w.y);
                            this.z.set(this.x.x, this.x.y);
                            this.a.a(Math.abs(f3) > Math.abs(f5) ? f3 : f5);
                        }
                    }
                    if (z17) {
                        this.v |= 2;
                        kn.f("GD").a("MT_INTENT_ROTATE");
                        PointF pointF = this.z;
                        PointF pointF2 = this.y;
                        PointF pointF3 = this.x;
                        PointF pointF4 = this.w;
                        PointF pointF5 = null;
                        if (pointF2.x != pointF.x && pointF4.x != pointF3.x) {
                            float f6 = (pointF2.y - pointF.y) / (pointF2.x - pointF.x);
                            float f7 = (pointF4.y - pointF3.y) / (pointF4.x - pointF3.x);
                            if (f6 != f7) {
                                float f8 = ((pointF.y * pointF2.x) - (pointF2.y * pointF.x)) / (pointF2.x - pointF.x);
                                float f9 = ((pointF3.y * pointF4.x) - (pointF4.y * pointF3.x)) / (pointF4.x - pointF3.x);
                                float f10 = (f9 - f8) / (f6 - f7);
                                pointF5 = new PointF(f10, (f7 * f10) + f9);
                            }
                        }
                        if (pointF5 == null ? false : a(pointF5.x, pointF5.y)) {
                            if (this.F == null) {
                                i2 = 2;
                                width = 0;
                            } else {
                                i2 = 2;
                                width = this.F.g().width() / 2;
                            }
                            this.C.set(width, this.F == null ? 0 : this.F.g().height() / i2);
                            this.a.a(this.C, this.C, (float) acos);
                        } else {
                            this.A.set((this.y.x + this.z.x) / 2.0f, (this.y.y + this.z.y) / 2.0f);
                            this.B.set((this.w.x + this.x.x) / 2.0f, (this.w.y + this.x.y) / 2.0f);
                            this.a.a(this.A, this.B, (float) acos);
                        }
                    }
                    if (z18) {
                        this.v |= 4;
                        kn.f("GD").a("MT_INTENT_SCALE");
                        this.A.set((this.y.x + this.z.x) / 2.0f, (this.y.y + this.z.y) / 2.0f);
                        this.B.set((this.w.x + this.x.x) / 2.0f, (this.w.y + this.x.y) / 2.0f);
                        this.a.a(this.A, this.B, sqrt, sqrt2);
                    }
                    this.y.set(this.w.x, this.w.y);
                    this.z.set(this.x.x, this.x.y);
                    return true;
                }
                this.a.k(motionEvent.getX(), motionEvent.getY());
                break;
                break;
            case 5:
                this.D = System.currentTimeMillis();
                this.v = 0;
                this.r = true;
                this.t = System.currentTimeMillis();
                this.s = false;
                a(this.y, this.z, motionEvent);
                this.a.c();
                return true;
            case 6:
                if (!this.s) {
                    this.s = true;
                    this.a.d();
                    return true;
                }
                break;
        }
        if (this.r) {
            return true;
        }
        this.E.onTouchEvent(motionEvent);
        return true;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public final class a extends GestureDetector.SimpleOnGestureListener {
        private PointF b;
        private boolean c;

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            return false;
        }

        private a() {
            this.b = new PointF();
            this.c = true;
        }

        /* synthetic */ a(po poVar, byte b) {
            this();
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            po.this.a.b(motionEvent.getX(), motionEvent.getY());
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            po.this.a.c(f, f2);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if (po.this.G != null && po.this.G.get() != null && ((sw) po.this.G.get()).Z()) {
                double sqrt = Math.sqrt((f * f) + (f2 * f2));
                if ((motionEvent != null && (motionEvent.getX() < 0.0f || motionEvent.getY() < 0.0f)) || ((motionEvent2 != null && (motionEvent2.getX() < 0.0f || motionEvent2.getY() < 0.0f)) || sqrt > 50.0d)) {
                    return true;
                }
            }
            po.this.a.d(-f, -f2);
            return true;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final void onLongPress(MotionEvent motionEvent) {
            if (po.this.r) {
                return;
            }
            po.this.a.e(motionEvent.getX(), motionEvent.getY());
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.c = true;
                    po.this.E.setIsLongpressEnabled(false);
                    this.b.set(motionEvent.getX(), motionEvent.getY());
                    po.this.a.f(x, y);
                    break;
                case 1:
                    if (this.c) {
                        po.this.a.a(x, y);
                    }
                    this.b.set(0.0f, 0.0f);
                    po.this.E.setIsLongpressEnabled(true);
                    po.this.a.h(x, y);
                    break;
                case 2:
                    float f = y - this.b.y;
                    if (Math.abs(x - this.b.x) > 10.0f || Math.abs(f) > 10.0f) {
                        this.c = false;
                        po.this.a.g(x, y);
                    }
                    po.this.E.setIsLongpressEnabled(true);
                    break;
            }
            return true;
        }
    }

    private void a() {
        double max;
        double max2;
        double d2;
        int i2;
        int width;
        float f2 = this.w.x - this.y.x;
        float f3 = this.w.y - this.y.y;
        float f4 = this.x.x - this.z.x;
        float f5 = this.x.y - this.z.y;
        boolean z = ((double) Math.abs(f3)) > ((double) Math.abs(f2)) * 1.5d && ((double) Math.abs(f5)) > ((double) Math.abs(f4)) * 1.5d;
        boolean z2 = ((double) Math.abs(f3)) > ((double) Math.abs(f2)) * 1.5d && ((double) Math.abs(f5)) > ((double) Math.abs(f4)) * 1.5d;
        boolean z3 = ((double) Math.abs(f2)) > ((double) Math.abs(f3)) * 1.5d && ((double) Math.abs(f4)) > ((double) Math.abs(f5)) * 1.5d;
        boolean z4 = ((double) Math.abs(f2)) > ((double) Math.abs(f3)) * 1.5d && ((double) Math.abs(f4)) > ((double) Math.abs(f5)) * 1.5d;
        int i3 = ((f2 * f4) > 0.0f ? 1 : ((f2 * f4) == 0.0f ? 0 : -1));
        boolean z5 = i3 > 0;
        int i4 = ((f3 * f5) > 0.0f ? 1 : ((f3 * f5) == 0.0f ? 0 : -1));
        boolean z6 = i4 > 0;
        boolean z7 = ((this.v & 8) == 0 && (this.v & 1) == 0 && (this.v & 4) == 0) ? false : true;
        double d3 = z7 ? i : 0.5d;
        if (i3 > 0) {
            max = Math.abs(f2 + f4);
        } else {
            max = Math.max(Math.abs(f2), Math.abs(f4));
        }
        if (i4 > 0) {
            max2 = Math.abs(f3 + f5);
        } else {
            max2 = Math.max(Math.abs(f3), Math.abs(f5));
        }
        double max3 = Math.max(max, max2);
        boolean z8 = max3 > d3;
        boolean z9 = z8 && z5 && (z3 || z4) && this.G.get().g();
        boolean z10 = z8 && z6 && (z || z2) && this.G.get().i();
        boolean z11 = z9;
        double d4 = this.z.x - this.y.x;
        double d5 = this.z.y - this.y.y;
        double d6 = this.x.x - this.w.x;
        boolean z12 = z5;
        boolean z13 = z6;
        double d7 = this.x.y - this.w.y;
        double sqrt = Math.sqrt((d4 * d4) + (d5 * d5));
        double sqrt2 = Math.sqrt((d6 * d6) + (d7 * d7));
        double d8 = sqrt * sqrt2;
        double d9 = ((d4 * d6) + (d5 * d7)) / d8;
        double acos = (Math.acos(d9) * 180.0d) / 3.141592653589793d;
        if ((d4 * d7) - (d5 * d6) < 0.0d) {
            acos = -acos;
        }
        boolean z14 = Math.abs(d9) < ((double) p);
        double d10 = (this.v & 2) == 0 ? e : 0.5d;
        double abs = Math.abs(acos);
        boolean z15 = d8 > 0.0d && z14 && Math.abs(acos) > d10 && this.G.get().j();
        double d11 = sqrt2 / sqrt;
        double d12 = z7 ? h : g;
        double abs2 = Math.abs(d11 - 1.0d);
        boolean z16 = sqrt > 0.0d && abs2 > d12 && this.G.get().h();
        kn.a f6 = kn.f("GD");
        StringBuilder sb = new StringBuilder("value:");
        boolean z17 = z8;
        sb.append(max3);
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(abs2);
        sb.append(CommonConstant.Symbol.COLON);
        sb.append(abs);
        f6.a("trace-gesture", "began:" + z8 + CommonConstant.Symbol.COLON + z16 + CommonConstant.Symbol.COLON + z15, sb.toString());
        if (z15) {
            z17 = false;
        }
        if (z10) {
            z16 = false;
            z15 = false;
            z11 = false;
        }
        kn.f("GD").a("beganMove:".concat(String.valueOf(z17)), "vertical:".concat(String.valueOf(z13)), "horizontal:".concat(String.valueOf(z12)), "verticalMove:".concat(String.valueOf(z10)), "horizontalMove:".concat(String.valueOf(z11)));
        kn.f("GD").a("beganRotate:".concat(String.valueOf(z15)), "cosValue : ".concat(String.valueOf(d9)), "cosAngle : ".concat(String.valueOf(z14)), "angle:".concat(String.valueOf(acos)), "rotateJudge : ".concat(String.valueOf(d10)));
        kn.f("GD").a("beganScale:".concat(String.valueOf(z16)), "d1:".concat(String.valueOf(sqrt)), "scale - 1 = " + Math.abs(d2), "scaleJudge : ".concat(String.valueOf(d12)));
        if (z17) {
            if (z11) {
                this.v |= 8;
                kn.f("GD").a("MT_INTENT_MOVE");
                this.a.d((f2 + f4) / 2.0f, (f3 + f5) / 2.0f);
            }
            if (z10) {
                this.v |= 1;
                kn.f("GD").a("MT_INTENT_MOVE_VERTICAL");
                this.y.set(this.w.x, this.w.y);
                this.z.set(this.x.x, this.x.y);
                this.a.a(Math.abs(f3) > Math.abs(f5) ? f3 : f5);
            }
        }
        if (z15) {
            this.v |= 2;
            kn.f("GD").a("MT_INTENT_ROTATE");
            PointF pointF = this.z;
            PointF pointF2 = this.y;
            PointF pointF3 = this.x;
            PointF pointF4 = this.w;
            PointF pointF5 = null;
            if (pointF2.x != pointF.x && pointF4.x != pointF3.x) {
                float f7 = (pointF2.y - pointF.y) / (pointF2.x - pointF.x);
                float f8 = (pointF4.y - pointF3.y) / (pointF4.x - pointF3.x);
                if (f7 != f8) {
                    float f9 = ((pointF.y * pointF2.x) - (pointF2.y * pointF.x)) / (pointF2.x - pointF.x);
                    float f10 = ((pointF3.y * pointF4.x) - (pointF4.y * pointF3.x)) / (pointF4.x - pointF3.x);
                    float f11 = (f10 - f9) / (f7 - f8);
                    pointF5 = new PointF(f11, (f8 * f11) + f10);
                }
            }
            if (pointF5 == null ? false : a(pointF5.x, pointF5.y)) {
                if (this.F == null) {
                    i2 = 2;
                    width = 0;
                } else {
                    i2 = 2;
                    width = this.F.g().width() / 2;
                }
                this.C.set(width, this.F == null ? 0 : this.F.g().height() / i2);
                this.a.a(this.C, this.C, (float) acos);
            } else {
                this.A.set((this.y.x + this.z.x) / 2.0f, (this.y.y + this.z.y) / 2.0f);
                this.B.set((this.w.x + this.x.x) / 2.0f, (this.w.y + this.x.y) / 2.0f);
                this.a.a(this.A, this.B, (float) acos);
            }
        }
        if (z16) {
            this.v |= 4;
            kn.f("GD").a("MT_INTENT_SCALE");
            this.A.set((this.y.x + this.z.x) / 2.0f, (this.y.y + this.z.y) / 2.0f);
            this.B.set((this.w.x + this.x.x) / 2.0f, (this.w.y + this.x.y) / 2.0f);
            this.a.a(this.A, this.B, sqrt, sqrt2);
        }
        this.y.set(this.w.x, this.w.y);
        this.z.set(this.x.x, this.x.y);
    }

    private boolean b() {
        PointF pointF = this.z;
        PointF pointF2 = this.y;
        PointF pointF3 = this.x;
        PointF pointF4 = this.w;
        PointF pointF5 = null;
        if (pointF2.x != pointF.x && pointF4.x != pointF3.x) {
            float f2 = (pointF2.y - pointF.y) / (pointF2.x - pointF.x);
            float f3 = (pointF4.y - pointF3.y) / (pointF4.x - pointF3.x);
            if (f2 != f3) {
                float f4 = ((pointF.y * pointF2.x) - (pointF2.y * pointF.x)) / (pointF2.x - pointF.x);
                float f5 = ((pointF3.y * pointF4.x) - (pointF4.y * pointF3.x)) / (pointF4.x - pointF3.x);
                float f6 = (f5 - f4) / (f2 - f3);
                pointF5 = new PointF(f6, (f3 * f6) + f5);
            }
        }
        if (pointF5 == null) {
            return false;
        }
        return a(pointF5.x, pointF5.y);
    }

    private boolean a(float f2, float f3) {
        return Math.abs(f2 - ((float) (this.F == null ? 0 : this.F.g().width() / 2))) < (this.F == null ? 0.0f : ((float) this.F.g().width()) / 3.0f) && Math.abs(f3 - ((float) (this.F == null ? 0 : this.F.g().height() / 2))) < (this.F != null ? ((float) this.F.g().height()) / 3.0f : 0.0f);
    }

    private boolean b(float f2, float f3) {
        return a(f2, f3);
    }

    private boolean c() {
        double d2 = this.y.x - this.z.x;
        double d3 = this.y.y - this.z.y;
        return (d2 * d2) + (d3 * d3) > 2500.0d;
    }

    private static void a(PointF pointF, PointF pointF2, MotionEvent motionEvent) {
        try {
            float x = motionEvent.getX(0);
            float x2 = motionEvent.getX(1);
            float y = motionEvent.getY(0);
            float y2 = motionEvent.getY(1);
            pointF.set(x, y);
            pointF2.set(x2, y2);
        } catch (Exception unused) {
        }
    }
}
