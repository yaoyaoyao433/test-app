package com.github.chrisbanes.xdphotoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.tencent.rtmp.TXLiveConstants;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class k implements View.OnLayoutChangeListener, View.OnTouchListener {
    private static float u = 3.0f;
    private static float v = 1.75f;
    private static float w = 1.0f;
    private static int x = 200;
    private static int y = 1;
    private com.github.chrisbanes.xdphotoview.b B;
    private b F;
    private float H;
    ImageView f;
    GestureDetector g;
    d j;
    f k;
    e l;
    j m;
    View.OnClickListener n;
    View.OnLongClickListener o;
    g p;
    h q;
    i r;
    private Interpolator z = new AccelerateDecelerateInterpolator();
    int a = x;
    float b = w;
    float c = v;
    float d = u;
    boolean e = true;
    private boolean A = false;
    private final Matrix C = new Matrix();
    final Matrix h = new Matrix();
    final Matrix i = new Matrix();
    private final RectF D = new RectF();
    private final float[] E = new float[9];
    private int G = 2;
    boolean s = true;
    ImageView.ScaleType t = ImageView.ScaleType.FIT_CENTER;
    private c I = new c() { // from class: com.github.chrisbanes.xdphotoview.k.1
        @Override // com.github.chrisbanes.xdphotoview.c
        public final void a(float f, float f2) {
            if (k.this.B.a.isInProgress()) {
                return;
            }
            if (k.this.r != null) {
                i unused = k.this.r;
            }
            k.this.i.postTranslate(f, f2);
            k.this.d();
            ViewParent parent = k.this.f.getParent();
            if (!k.this.e || k.this.B.a.isInProgress() || k.this.A) {
                if (parent != null) {
                    parent.requestDisallowInterceptTouchEvent(true);
                }
            } else if ((k.this.G == 2 || ((k.this.G == 0 && f >= 1.0f) || (k.this.G == 1 && f <= -1.0f))) && parent != null) {
                parent.requestDisallowInterceptTouchEvent(false);
            }
        }

        @Override // com.github.chrisbanes.xdphotoview.c
        public final void a(float f, float f2, float f3, float f4) {
            int i;
            int i2;
            int i3;
            int i4;
            k.this.F = new b(k.this.f.getContext());
            b bVar = k.this.F;
            int a2 = k.a(k.this, k.this.f);
            int b2 = k.b(k.this, k.this.f);
            int i5 = (int) f3;
            int i6 = (int) f4;
            RectF a3 = k.this.a();
            if (a3 != null) {
                int round = Math.round(-a3.left);
                float f5 = a2;
                if (f5 < a3.width()) {
                    i2 = Math.round(a3.width() - f5);
                    i = 0;
                } else {
                    i = round;
                    i2 = i;
                }
                int round2 = Math.round(-a3.top);
                float f6 = b2;
                if (f6 < a3.height()) {
                    i4 = Math.round(a3.height() - f6);
                    i3 = 0;
                } else {
                    i3 = round2;
                    i4 = i3;
                }
                bVar.b = round;
                bVar.c = round2;
                if (round != i2 || round2 != i4) {
                    bVar.a.fling(round, round2, i5, i6, i, i2, i3, i4, 0, 0);
                }
            }
            k.this.f.post(k.this.F);
        }

        @Override // com.github.chrisbanes.xdphotoview.c
        public final void a(float f, float f2, float f3) {
            if (k.this.b() < k.this.d || f < 1.0f) {
                if (k.this.b() > k.this.b || f > 1.0f) {
                    if (k.this.p != null) {
                        g unused = k.this.p;
                    }
                    k.this.i.postScale(f, f, f2, f3);
                    k.this.d();
                }
            }
        }
    };

    static /* synthetic */ int a(k kVar, ImageView imageView) {
        return a(imageView);
    }

    static /* synthetic */ int b(k kVar, ImageView imageView) {
        return b(imageView);
    }

    public k(ImageView imageView) {
        this.f = imageView;
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.H = 0.0f;
        this.B = new com.github.chrisbanes.xdphotoview.b(imageView.getContext(), this.I);
        this.g = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.github.chrisbanes.xdphotoview.k.2
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (k.this.o != null) {
                    k.this.o.onLongClick(k.this.f);
                }
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                if (k.this.q == null || k.this.b() > k.w || motionEvent.getPointerCount() > k.y || motionEvent2.getPointerCount() > k.y) {
                    return false;
                }
                return k.this.q.a(motionEvent, motionEvent2, f, f2);
            }
        });
        this.g.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.github.chrisbanes.xdphotoview.k.3
            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                if (k.this.n != null) {
                    k.this.n.onClick(k.this.f);
                }
                RectF a2 = k.this.a();
                float x2 = motionEvent.getX();
                float y2 = motionEvent.getY();
                if (k.this.m != null) {
                    j unused = k.this.m;
                    ImageView unused2 = k.this.f;
                }
                if (a2 != null) {
                    if (!a2.contains(x2, y2)) {
                        if (k.this.l != null) {
                            e unused3 = k.this.l;
                            ImageView unused4 = k.this.f;
                            return false;
                        }
                        return false;
                    }
                    float f = a2.left;
                    a2.width();
                    float f2 = a2.top;
                    a2.height();
                    if (k.this.k != null) {
                        f unused5 = k.this.k;
                        ImageView unused6 = k.this.f;
                        return true;
                    }
                    return true;
                }
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                try {
                    float b2 = k.this.b();
                    float x2 = motionEvent.getX();
                    float y2 = motionEvent.getY();
                    if (b2 < k.this.c) {
                        k.this.a(k.this.c, x2, y2, true);
                    } else if (b2 >= k.this.c && b2 < k.this.d) {
                        k.this.a(k.this.d, x2, y2, true);
                    } else {
                        k.this.a(k.this.b, x2, y2, true);
                    }
                } catch (ArrayIndexOutOfBoundsException unused) {
                }
                return true;
            }
        });
    }

    public final RectF a() {
        i();
        return b(g());
    }

    public final void a(float f) {
        this.i.postRotate(f % 360.0f);
        d();
    }

    public final float b() {
        return (float) Math.sqrt(((float) Math.pow(a(this.i, 0), 2.0d)) + ((float) Math.pow(a(this.i, 3), 2.0d)));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
            return;
        }
        a(this.f.getDrawable());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    @Override // android.view.View.OnTouchListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.s
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Ld3
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L11
            r0 = 1
            goto L12
        L11:
            r0 = 0
        L12:
            if (r0 == 0) goto Ld3
            int r0 = r12.getAction()
            r3 = 3
            if (r0 == r3) goto L38
            switch(r0) {
                case 0: goto L20;
                case 1: goto L38;
                default: goto L1e;
            }
        L1e:
            goto L8b
        L20:
            android.view.ViewParent r11 = r11.getParent()
            if (r11 == 0) goto L29
            r11.requestDisallowInterceptTouchEvent(r2)
        L29:
            com.github.chrisbanes.xdphotoview.k$b r11 = r10.F
            if (r11 == 0) goto L8b
            com.github.chrisbanes.xdphotoview.k$b r11 = r10.F
            android.widget.OverScroller r11 = r11.a
            r11.forceFinished(r2)
            r11 = 0
            r10.F = r11
            goto L8b
        L38:
            float r0 = r10.b()
            float r3 = r10.b
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L61
            android.graphics.RectF r0 = r10.a()
            if (r0 == 0) goto L8b
            com.github.chrisbanes.xdphotoview.k$a r9 = new com.github.chrisbanes.xdphotoview.k$a
            float r5 = r10.b()
            float r6 = r10.b
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            goto L89
        L61:
            float r0 = r10.b()
            float r3 = r10.d
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L8b
            android.graphics.RectF r0 = r10.a()
            if (r0 == 0) goto L8b
            com.github.chrisbanes.xdphotoview.k$a r9 = new com.github.chrisbanes.xdphotoview.k$a
            float r5 = r10.b()
            float r6 = r10.d
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
        L89:
            r11 = 1
            goto L8c
        L8b:
            r11 = 0
        L8c:
            com.github.chrisbanes.xdphotoview.b r0 = r10.B
            if (r0 == 0) goto Lc5
            com.github.chrisbanes.xdphotoview.b r11 = r10.B
            android.view.ScaleGestureDetector r11 = r11.a
            boolean r11 = r11.isInProgress()
            com.github.chrisbanes.xdphotoview.b r0 = r10.B
            boolean r0 = r0.b
            com.github.chrisbanes.xdphotoview.b r3 = r10.B
            boolean r3 = r3.a(r12)
            if (r11 != 0) goto Lb0
            com.github.chrisbanes.xdphotoview.b r11 = r10.B
            android.view.ScaleGestureDetector r11 = r11.a
            boolean r11 = r11.isInProgress()
            if (r11 != 0) goto Lb0
            r11 = 1
            goto Lb1
        Lb0:
            r11 = 0
        Lb1:
            if (r0 != 0) goto Lbb
            com.github.chrisbanes.xdphotoview.b r0 = r10.B
            boolean r0 = r0.b
            if (r0 != 0) goto Lbb
            r0 = 1
            goto Lbc
        Lbb:
            r0 = 0
        Lbc:
            if (r11 == 0) goto Lc1
            if (r0 == 0) goto Lc1
            r1 = 1
        Lc1:
            r10.A = r1
            r1 = r3
            goto Lc6
        Lc5:
            r1 = r11
        Lc6:
            android.view.GestureDetector r11 = r10.g
            if (r11 == 0) goto Ld3
            android.view.GestureDetector r11 = r10.g
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto Ld3
            r1 = 1
        Ld3:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.chrisbanes.xdphotoview.k.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a(float f, float f2, float f3, boolean z) {
        if (f < this.b || f > this.d) {
            throw new IllegalArgumentException("Scale must be within the range of minScale and maxScale");
        }
        if (z) {
            this.f.post(new a(b(), f, f2, f3));
            return;
        }
        this.i.setScale(f, f, f2, f3);
        d();
    }

    public final void c() {
        if (this.s) {
            a(this.f.getDrawable());
        } else {
            h();
        }
    }

    private Matrix g() {
        this.h.set(this.C);
        this.h.postConcat(this.i);
        return this.h;
    }

    private float a(Matrix matrix, int i) {
        matrix.getValues(this.E);
        return this.E[i];
    }

    private void h() {
        this.i.reset();
        a(this.H);
        a(g());
        i();
    }

    private void a(Matrix matrix) {
        this.f.setImageMatrix(matrix);
        if (this.j != null) {
            b(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        if (i()) {
            a(g());
        }
    }

    private RectF b(Matrix matrix) {
        Drawable drawable = this.f.getDrawable();
        if (drawable != null) {
            this.D.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            matrix.mapRect(this.D);
            return this.D;
        }
        return null;
    }

    private void a(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        float a2 = a(this.f);
        float b2 = b(this.f);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.C.reset();
        float f = intrinsicWidth;
        float f2 = a2 / f;
        float f3 = intrinsicHeight;
        float f4 = b2 / f3;
        if (this.t == ImageView.ScaleType.CENTER) {
            this.C.postTranslate((a2 - f) / 2.0f, (b2 - f3) / 2.0f);
        } else if (this.t == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f2, f4);
            this.C.postScale(max, max);
            this.C.postTranslate((a2 - (f * max)) / 2.0f, (b2 - (f3 * max)) / 2.0f);
        } else if (this.t == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f2, f4));
            this.C.postScale(min, min);
            this.C.postTranslate((a2 - (f * min)) / 2.0f, (b2 - (f3 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f, f3);
            RectF rectF2 = new RectF(0.0f, 0.0f, a2, b2);
            if (((int) this.H) % TXLiveConstants.RENDER_ROTATION_180 != 0) {
                rectF = new RectF(0.0f, 0.0f, f3, f);
            }
            switch (AnonymousClass4.a[this.t.ordinal()]) {
                case 1:
                    this.C.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                    break;
                case 2:
                    this.C.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                    break;
                case 3:
                    this.C.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                    break;
                case 4:
                    this.C.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                    break;
            }
        }
        h();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.github.chrisbanes.xdphotoview.k$4  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[ImageView.ScaleType.FIT_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[ImageView.ScaleType.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private boolean i() {
        float f;
        float f2;
        RectF b2 = b(g());
        if (b2 == null) {
            return false;
        }
        float height = b2.height();
        float width = b2.width();
        float b3 = b(this.f);
        float f3 = 0.0f;
        if (height <= b3) {
            switch (AnonymousClass4.a[this.t.ordinal()]) {
                case 2:
                    f = -b2.top;
                    break;
                case 3:
                    f = (b3 - height) - b2.top;
                    break;
                default:
                    f = ((b3 - height) / 2.0f) - b2.top;
                    break;
            }
        } else if (b2.top > 0.0f) {
            f = -b2.top;
        } else {
            f = b2.bottom < b3 ? b3 - b2.bottom : 0.0f;
        }
        float a2 = a(this.f);
        if (width <= a2) {
            switch (AnonymousClass4.a[this.t.ordinal()]) {
                case 2:
                    f3 = -b2.left;
                    break;
                case 3:
                    f2 = (a2 - width) - b2.left;
                    f3 = f2;
                    break;
                default:
                    f2 = ((a2 - width) / 2.0f) - b2.left;
                    f3 = f2;
                    break;
            }
            this.G = 2;
        } else if (b2.left > 0.0f) {
            this.G = 0;
            f3 = -b2.left;
        } else if (b2.right < a2) {
            f3 = a2 - b2.right;
            this.G = 1;
        } else {
            this.G = -1;
        }
        this.i.postTranslate(f3, f);
        return true;
    }

    private static int a(ImageView imageView) {
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private static int b(ImageView imageView) {
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public class a implements Runnable {
        private final float b;
        private final float c;
        private final long d = System.currentTimeMillis();
        private final float e;
        private final float f;

        public a(float f, float f2, float f3, float f4) {
            this.b = f3;
            this.c = f4;
            this.e = f;
            this.f = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float interpolation = k.this.z.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.d)) * 1.0f) / k.this.a));
            k.this.I.a((this.e + ((this.f - this.e) * interpolation)) / k.this.b(), this.b, this.c);
            if (interpolation < 1.0f) {
                com.github.chrisbanes.xdphotoview.a.a(k.this.f, this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        final OverScroller a;
        int b;
        int c;

        public b(Context context) {
            this.a = new OverScroller(context);
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (!this.a.isFinished() && this.a.computeScrollOffset()) {
                int currX = this.a.getCurrX();
                int currY = this.a.getCurrY();
                k.this.i.postTranslate(this.b - currX, this.c - currY);
                k.this.d();
                this.b = currX;
                this.c = currY;
                com.github.chrisbanes.xdphotoview.a.a(k.this.f, this);
            }
        }
    }
}
