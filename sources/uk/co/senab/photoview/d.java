package uk.co.senab.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.Log;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
/* compiled from: ProGuard */
/* loaded from: classes7.dex */
public final class d implements View.OnTouchListener, ViewTreeObserver.OnGlobalLayoutListener, uk.co.senab.photoview.c, uk.co.senab.photoview.gestures.e {
    private b A;
    private int B;
    private boolean C;
    int b;
    float c;
    float d;
    float e;
    boolean f;
    GestureDetector g;
    final Matrix h;
    c i;
    InterfaceC1559d j;
    f k;
    View.OnLongClickListener l;
    e m;
    ImageView.ScaleType n;
    private boolean p;
    private WeakReference<ImageView> q;
    private uk.co.senab.photoview.gestures.d r;
    private final Matrix s;
    private final Matrix t;
    private final RectF u;
    private final float[] v;
    private int w;
    private int x;
    private int y;
    private int z;
    private static final boolean o = Log.isLoggable("PhotoViewAttacher", 3);
    static final Interpolator a = new AccelerateDecelerateInterpolator();

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface c {
    }

    /* compiled from: ProGuard */
    /* renamed from: uk.co.senab.photoview.d$d  reason: collision with other inner class name */
    /* loaded from: classes7.dex */
    public interface InterfaceC1559d {
        void a(View view, float f, float f2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface e {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public interface f {
        void a(View view, float f, float f2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(float f2, float f3, float f4) {
        if (f2 >= f3) {
            throw new IllegalArgumentException("MinZoom has to be less than MidZoom");
        }
        if (f3 >= f4) {
            throw new IllegalArgumentException("MidZoom has to be less than MaxZoom");
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: uk.co.senab.photoview.d$2  reason: invalid class name */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a = new int[ImageView.ScaleType.values().length];

        static {
            try {
                a[ImageView.ScaleType.MATRIX.ordinal()] = 1;
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
                a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[ImageView.ScaleType.FIT_XY.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean a(ImageView.ScaleType scaleType) {
        if (scaleType == null) {
            return false;
        }
        if (AnonymousClass2.a[scaleType.ordinal()] != 1) {
            return true;
        }
        throw new IllegalArgumentException(scaleType.name() + " is not supported in PhotoView");
    }

    private static void a(ImageView imageView) {
        if (imageView == null || (imageView instanceof uk.co.senab.photoview.c) || ImageView.ScaleType.MATRIX.equals(imageView.getScaleType())) {
            return;
        }
        imageView.setScaleType(ImageView.ScaleType.MATRIX);
    }

    public d(ImageView imageView) {
        this(imageView, true);
    }

    private d(ImageView imageView, boolean z) {
        uk.co.senab.photoview.gestures.d cVar;
        this.b = 200;
        this.c = 1.0f;
        this.d = 1.75f;
        this.e = 3.0f;
        this.f = true;
        this.p = false;
        this.s = new Matrix();
        this.t = new Matrix();
        this.h = new Matrix();
        this.u = new RectF();
        this.v = new float[9];
        this.B = 2;
        this.n = ImageView.ScaleType.FIT_CENTER;
        this.q = new WeakReference<>(imageView);
        imageView.setDrawingCacheEnabled(true);
        imageView.setOnTouchListener(this);
        ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
        if (viewTreeObserver != null) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        a(imageView);
        if (imageView.isInEditMode()) {
            return;
        }
        Context context = imageView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i < 5) {
            cVar = new uk.co.senab.photoview.gestures.a(context);
        } else if (i < 8) {
            cVar = new uk.co.senab.photoview.gestures.b(context);
        } else {
            cVar = new uk.co.senab.photoview.gestures.c(context);
        }
        cVar.a(this);
        this.r = cVar;
        this.g = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: uk.co.senab.photoview.d.1
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                if (d.this.l != null) {
                    d.this.l.onLongClick(d.this.c());
                }
            }
        });
        this.g.setOnDoubleTapListener(new uk.co.senab.photoview.b(this));
        a(true);
    }

    public final void a() {
        if (this.q == null) {
            return;
        }
        ImageView imageView = this.q.get();
        if (imageView != null) {
            ViewTreeObserver viewTreeObserver = imageView.getViewTreeObserver();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeGlobalOnLayoutListener(this);
            }
            imageView.setOnTouchListener(null);
            i();
        }
        if (this.g != null) {
            this.g.setOnDoubleTapListener(null);
        }
        this.i = null;
        this.j = null;
        this.k = null;
        this.q = null;
    }

    public final RectF b() {
        k();
        return a(f());
    }

    public final void a(float f2) {
        this.h.setRotate(f2 % 360.0f);
        g();
    }

    public final ImageView c() {
        ImageView imageView = this.q != null ? this.q.get() : null;
        if (imageView == null) {
            a();
            uk.co.senab.photoview.log.a.a();
        }
        return imageView;
    }

    public final float d() {
        return (float) Math.sqrt(((float) Math.pow(a(this.h, 0), 2.0d)) + ((float) Math.pow(a(this.h, 3), 2.0d)));
    }

    @Override // uk.co.senab.photoview.gestures.e
    public final void a(float f2, float f3) {
        if (this.r.a()) {
            return;
        }
        if (o) {
            uk.co.senab.photoview.log.a.a();
            String.format("onDrag: dx: %.2f. dy: %.2f", Float.valueOf(f2), Float.valueOf(f3));
        }
        ImageView c2 = c();
        this.h.postTranslate(f2, f3);
        g();
        ViewParent parent = c2.getParent();
        if (!this.f || this.r.a() || this.p) {
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        } else if ((this.B == 2 || ((this.B == 0 && f2 >= 1.0f) || (this.B == 1 && f2 <= -1.0f))) && parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
    }

    @Override // uk.co.senab.photoview.gestures.e
    public final void a(float f2, float f3, float f4, float f5) {
        int i;
        int i2;
        int i3;
        int i4;
        if (o) {
            uk.co.senab.photoview.log.a.a();
            StringBuilder sb = new StringBuilder("onFling. sX: ");
            sb.append(f2);
            sb.append(" sY: ");
            sb.append(f3);
            sb.append(" Vx: ");
            sb.append(f4);
            sb.append(" Vy: ");
            sb.append(f5);
        }
        ImageView c2 = c();
        this.A = new b(c2.getContext());
        b bVar = this.A;
        int b2 = b(c2);
        int c3 = c(c2);
        int i5 = (int) f4;
        int i6 = (int) f5;
        RectF b3 = d.this.b();
        if (b3 != null) {
            int round = Math.round(-b3.left);
            float f6 = b2;
            if (f6 < b3.width()) {
                i2 = Math.round(b3.width() - f6);
                i = 0;
            } else {
                i = round;
                i2 = i;
            }
            int round2 = Math.round(-b3.top);
            float f7 = c3;
            if (f7 < b3.height()) {
                i4 = Math.round(b3.height() - f7);
                i3 = 0;
            } else {
                i3 = round2;
                i4 = i3;
            }
            bVar.b = round;
            bVar.c = round2;
            if (o) {
                uk.co.senab.photoview.log.a.a();
                StringBuilder sb2 = new StringBuilder("fling. StartX:");
                sb2.append(round);
                sb2.append(" StartY:");
                sb2.append(round2);
                sb2.append(" MaxX:");
                sb2.append(i2);
                sb2.append(" MaxY:");
                sb2.append(i4);
            }
            if (round != i2 || round2 != i4) {
                bVar.a.a(round, round2, i5, i6, i, i2, i3, i4, 0, 0);
            }
        }
        c2.post(this.A);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        ImageView c2 = c();
        if (c2 != null) {
            if (this.C) {
                int top = c2.getTop();
                int right = c2.getRight();
                int bottom = c2.getBottom();
                int left = c2.getLeft();
                if (top == this.w && bottom == this.y && left == this.z && right == this.x) {
                    return;
                }
                a(c2.getDrawable());
                this.w = top;
                this.x = right;
                this.y = bottom;
                this.z = left;
                return;
            }
            a(c2.getDrawable());
        }
    }

    @Override // uk.co.senab.photoview.gestures.e
    public final void b(float f2, float f3, float f4) {
        if (o) {
            uk.co.senab.photoview.log.a.a();
            String.format("onScale: scale: %.2f. fX: %.2f. fY: %.2f", Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4));
        }
        if (d() < this.e || f2 < 1.0f) {
            this.h.postScale(f2, f2, f3, f4);
            g();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r11, android.view.MotionEvent r12) {
        /*
            r10 = this;
            boolean r0 = r10.C
            r1 = 0
            r2 = 1
            if (r0 == 0) goto La4
            r0 = r11
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            if (r0 == 0) goto L13
            android.graphics.drawable.Drawable r0 = r0.getDrawable()
            if (r0 == 0) goto L13
            r0 = 1
            goto L14
        L13:
            r0 = 0
        L14:
            if (r0 == 0) goto La4
            android.view.ViewParent r0 = r11.getParent()
            int r3 = r12.getAction()
            r4 = 3
            if (r3 == r4) goto L32
            switch(r3) {
                case 0: goto L25;
                case 1: goto L32;
                default: goto L24;
            }
        L24:
            goto L5c
        L25:
            if (r0 == 0) goto L2b
            r0.requestDisallowInterceptTouchEvent(r2)
            goto L2e
        L2b:
            uk.co.senab.photoview.log.a.a()
        L2e:
            r10.i()
            goto L5c
        L32:
            float r0 = r10.d()
            float r3 = r10.c
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 >= 0) goto L5c
            android.graphics.RectF r0 = r10.b()
            if (r0 == 0) goto L5c
            uk.co.senab.photoview.d$a r9 = new uk.co.senab.photoview.d$a
            float r5 = r10.d()
            float r6 = r10.c
            float r7 = r0.centerX()
            float r8 = r0.centerY()
            r3 = r9
            r4 = r10
            r3.<init>(r5, r6, r7, r8)
            r11.post(r9)
            r11 = 1
            goto L5d
        L5c:
            r11 = 0
        L5d:
            uk.co.senab.photoview.gestures.d r0 = r10.r
            if (r0 == 0) goto L96
            uk.co.senab.photoview.gestures.d r11 = r10.r
            boolean r11 = r11.a()
            uk.co.senab.photoview.gestures.d r0 = r10.r
            boolean r0 = r0.b()
            uk.co.senab.photoview.gestures.d r3 = r10.r
            boolean r3 = r3.c(r12)
            if (r11 != 0) goto L7f
            uk.co.senab.photoview.gestures.d r11 = r10.r
            boolean r11 = r11.a()
            if (r11 != 0) goto L7f
            r11 = 1
            goto L80
        L7f:
            r11 = 0
        L80:
            if (r0 != 0) goto L8c
            uk.co.senab.photoview.gestures.d r0 = r10.r
            boolean r0 = r0.b()
            if (r0 != 0) goto L8c
            r0 = 1
            goto L8d
        L8c:
            r0 = 0
        L8d:
            if (r11 == 0) goto L92
            if (r0 == 0) goto L92
            r1 = 1
        L92:
            r10.p = r1
            r1 = r3
            goto L97
        L96:
            r1 = r11
        L97:
            android.view.GestureDetector r11 = r10.g
            if (r11 == 0) goto La4
            android.view.GestureDetector r11 = r10.g
            boolean r11 = r11.onTouchEvent(r12)
            if (r11 == 0) goto La4
            r1 = 1
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: uk.co.senab.photoview.d.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void a(float f2, float f3, float f4, boolean z) {
        ImageView c2 = c();
        if (c2 != null) {
            if (f2 < this.c || f2 > this.e) {
                uk.co.senab.photoview.log.a.a();
            } else if (z) {
                c2.post(new a(d(), f2, f3, f4));
            } else {
                this.h.setScale(f2, f2, f3, f4);
                g();
            }
        }
    }

    public final void a(boolean z) {
        this.C = z;
        e();
    }

    public final void e() {
        ImageView c2 = c();
        if (c2 != null) {
            if (this.C) {
                a(c2);
                a(c2.getDrawable());
                return;
            }
            l();
        }
    }

    public final Matrix f() {
        this.t.set(this.s);
        this.t.postConcat(this.h);
        return this.t;
    }

    private void i() {
        if (this.A != null) {
            this.A.a();
            this.A = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g() {
        if (k()) {
            b(f());
        }
    }

    private void j() {
        ImageView c2 = c();
        if (c2 != null && !(c2 instanceof uk.co.senab.photoview.c) && !ImageView.ScaleType.MATRIX.equals(c2.getScaleType())) {
            throw new IllegalStateException("The ImageView's ScaleType has been changed since attaching a PhotoViewAttacher");
        }
    }

    private boolean k() {
        RectF a2;
        float f2;
        float f3;
        ImageView c2 = c();
        if (c2 == null || (a2 = a(f())) == null) {
            return false;
        }
        float height = a2.height();
        float width = a2.width();
        float c3 = c(c2);
        float f4 = 0.0f;
        if (height <= c3) {
            switch (AnonymousClass2.a[this.n.ordinal()]) {
                case 2:
                    f2 = -a2.top;
                    break;
                case 3:
                    f2 = (c3 - height) - a2.top;
                    break;
                default:
                    f2 = ((c3 - height) / 2.0f) - a2.top;
                    break;
            }
        } else if (a2.top > 0.0f) {
            f2 = -a2.top;
        } else {
            f2 = a2.bottom < c3 ? c3 - a2.bottom : 0.0f;
        }
        float b2 = b(c2);
        if (width <= b2) {
            switch (AnonymousClass2.a[this.n.ordinal()]) {
                case 2:
                    f3 = -a2.left;
                    break;
                case 3:
                    f3 = (b2 - width) - a2.left;
                    break;
                default:
                    f3 = ((b2 - width) / 2.0f) - a2.left;
                    break;
            }
            f4 = f3;
            this.B = 2;
        } else if (a2.left > 0.0f) {
            this.B = 0;
            f4 = -a2.left;
        } else if (a2.right < b2) {
            f4 = b2 - a2.right;
            this.B = 1;
        } else {
            this.B = -1;
        }
        this.h.postTranslate(f4, f2);
        return true;
    }

    private RectF a(Matrix matrix) {
        Drawable drawable;
        ImageView c2 = c();
        if (c2 == null || (drawable = c2.getDrawable()) == null) {
            return null;
        }
        this.u.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrix.mapRect(this.u);
        return this.u;
    }

    private float a(Matrix matrix, int i) {
        matrix.getValues(this.v);
        return this.v[i];
    }

    private void l() {
        this.h.reset();
        b(f());
        k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Matrix matrix) {
        ImageView c2 = c();
        if (c2 != null) {
            j();
            c2.setImageMatrix(matrix);
            if (this.i != null) {
                a(matrix);
            }
        }
    }

    private void a(Drawable drawable) {
        ImageView c2 = c();
        if (c2 == null || drawable == null) {
            return;
        }
        float b2 = b(c2);
        float c3 = c(c2);
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.s.reset();
        float f2 = intrinsicWidth;
        float f3 = b2 / f2;
        float f4 = intrinsicHeight;
        float f5 = c3 / f4;
        if (this.n == ImageView.ScaleType.CENTER) {
            this.s.postTranslate((b2 - f2) / 2.0f, (c3 - f4) / 2.0f);
        } else if (this.n == ImageView.ScaleType.CENTER_CROP) {
            float max = Math.max(f3, f5);
            this.s.postScale(max, max);
            this.s.postTranslate((b2 - (f2 * max)) / 2.0f, (c3 - (f4 * max)) / 2.0f);
        } else if (this.n == ImageView.ScaleType.CENTER_INSIDE) {
            float min = Math.min(1.0f, Math.min(f3, f5));
            this.s.postScale(min, min);
            this.s.postTranslate((b2 - (f2 * min)) / 2.0f, (c3 - (f4 * min)) / 2.0f);
        } else {
            RectF rectF = new RectF(0.0f, 0.0f, f2, f4);
            RectF rectF2 = new RectF(0.0f, 0.0f, b2, c3);
            switch (AnonymousClass2.a[this.n.ordinal()]) {
                case 2:
                    this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.START);
                    break;
                case 3:
                    this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.END);
                    break;
                case 4:
                    this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.CENTER);
                    break;
                case 5:
                    this.s.setRectToRect(rectF, rectF2, Matrix.ScaleToFit.FILL);
                    break;
            }
        }
        l();
    }

    private static int b(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight();
    }

    private static int c(ImageView imageView) {
        if (imageView == null) {
            return 0;
        }
        return (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
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
            ImageView c = d.this.c();
            if (c == null) {
                return;
            }
            float interpolation = d.a.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.d)) * 1.0f) / d.this.b));
            d.this.b((this.e + ((this.f - this.e) * interpolation)) / d.this.d(), this.b, this.c);
            if (interpolation < 1.0f) {
                uk.co.senab.photoview.a.a(c, this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes7.dex */
    public class b implements Runnable {
        final uk.co.senab.photoview.scrollerproxy.d a;
        int b;
        int c;

        public b(Context context) {
            uk.co.senab.photoview.scrollerproxy.d bVar;
            if (Build.VERSION.SDK_INT < 9) {
                bVar = new uk.co.senab.photoview.scrollerproxy.c(context);
            } else if (Build.VERSION.SDK_INT < 14) {
                bVar = new uk.co.senab.photoview.scrollerproxy.a(context);
            } else {
                bVar = new uk.co.senab.photoview.scrollerproxy.b(context);
            }
            this.a = bVar;
        }

        public final void a() {
            if (d.o) {
                uk.co.senab.photoview.log.a.a();
            }
            this.a.a(true);
        }

        @Override // java.lang.Runnable
        public final void run() {
            ImageView c;
            if (this.a.b() || (c = d.this.c()) == null || !this.a.a()) {
                return;
            }
            int c2 = this.a.c();
            int d = this.a.d();
            if (d.o) {
                uk.co.senab.photoview.log.a.a();
                StringBuilder sb = new StringBuilder("fling run(). CurrentX:");
                sb.append(this.b);
                sb.append(" CurrentY:");
                sb.append(this.c);
                sb.append(" NewX:");
                sb.append(c2);
                sb.append(" NewY:");
                sb.append(d);
            }
            d.this.h.postTranslate(this.b - c2, this.c - d);
            d.this.b(d.this.f());
            this.b = c2;
            this.c = d;
            uk.co.senab.photoview.a.a(c, this);
        }
    }
}
