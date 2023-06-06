package com.sankuai.waimai.ugc.creator.widgets.imageview;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import android.widget.OverScroller;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import com.sankuai.waimai.ugc.creator.entity.inner.ImageData;
import com.sankuai.waimai.ugc.creator.utils.f;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public final class a implements View.OnLayoutChangeListener, View.OnTouchListener {
    public static ChangeQuickRedirect a;
    private GestureDetector A;
    private com.sankuai.waimai.ugc.creator.widgets.imageview.b B;
    private final float[] C;
    private final RectF D;
    private int E;
    private c F;
    private int G;
    private int H;
    private final d I;
    public final ImageView b;
    final Matrix c;
    public final Matrix d;
    final Matrix e;
    final RectF f;
    public RectF g;
    public float h;
    int i;
    int j;
    int k;
    int l;
    Path m;
    Paint n;
    View.OnClickListener o;
    View.OnLongClickListener p;
    final ImageView.ScaleType q;
    public boolean r;
    public boolean s;
    Bitmap t;
    private final Interpolator u;
    private int v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    /* JADX WARN: Removed duplicated region for block: B:44:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00df  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.waimai.ugc.creator.widgets.imageview.a r16, float r17, float r18) {
        /*
            Method dump skipped, instructions count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ugc.creator.widgets.imageview.a.a(com.sankuai.waimai.ugc.creator.widgets.imageview.a, float, float):void");
    }

    public static /* synthetic */ void j(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "23856440c758c1130c8c6079208f7744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "23856440c758c1130c8c6079208f7744");
            return;
        }
        aVar.m();
        aVar.e();
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public a(ImageView imageView) {
        Object[] objArr = {imageView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afb024652be584074a00b944a47469c5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afb024652be584074a00b944a47469c5");
            return;
        }
        this.u = new AccelerateDecelerateInterpolator();
        this.v = 200;
        this.w = 1.0f;
        this.x = 3.0f;
        this.y = false;
        this.z = false;
        this.c = new Matrix();
        this.d = new Matrix();
        this.e = new Matrix();
        this.C = new float[9];
        this.D = new RectF();
        this.f = new RectF();
        this.G = -1;
        this.H = -1;
        this.q = ImageView.ScaleType.FIT_CENTER;
        this.r = true;
        this.s = true;
        this.I = new d() { // from class: com.sankuai.waimai.ugc.creator.widgets.imageview.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.widgets.imageview.d
            public final void a(float f, float f2) {
                boolean z = false;
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60ca316da3d66d2ad48db0d1895ba0ea", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60ca316da3d66d2ad48db0d1895ba0ea");
                } else if (a.this.B.a()) {
                } else {
                    a.a(a.this, f, f2);
                    ViewParent parent = a.this.b.getParent();
                    if (parent != null) {
                        if (a.this.y && !a.this.B.a() && !a.this.z && ((a.this.G == 0 && f >= 1.0f) || ((a.this.G == 1 && f <= -1.0f) || ((a.this.H == 0 && f2 >= 1.0f) || (a.this.H == 1 && f2 <= -1.0f))))) {
                            z = true;
                        }
                        parent.requestDisallowInterceptTouchEvent(!z);
                    }
                }
            }

            @Override // com.sankuai.waimai.ugc.creator.widgets.imageview.d
            public final void a(float f, float f2, float f3, float f4) {
                float g;
                float h;
                float f5;
                float f6;
                float f7;
                float height;
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9b24ffca8c46f388456f2d43a0fe955f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9b24ffca8c46f388456f2d43a0fe955f");
                    return;
                }
                a.this.F = new c(a.this.b.getContext());
                c cVar = a.this.F;
                Object[] objArr3 = {Float.valueOf(f3), Float.valueOf(f4)};
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "601d52232ed7f6e7839d21eac6e7f196", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "601d52232ed7f6e7839d21eac6e7f196");
                } else {
                    RectF f8 = a.this.f();
                    if (f8 != null) {
                        float f9 = f8.left;
                        float f10 = f8.top;
                        if (a.this.g != null) {
                            f5 = a.this.g.left;
                            f6 = a.this.g.top;
                            g = a.this.g.right;
                            h = a.this.g.bottom;
                        } else {
                            g = a.this.g();
                            h = a.this.h();
                            f5 = 0.0f;
                            f6 = 0.0f;
                        }
                        float f11 = f5 - f8.left;
                        float f12 = g - f8.right;
                        int i = (f11 > 0.0f ? 1 : (f11 == 0.0f ? 0 : -1));
                        if (i > 0 && f12 > 0.0f) {
                            f5 = g - f8.width();
                            f7 = f9;
                        } else if (i >= 0 && f12 <= 0.0f) {
                            f7 = g - f8.width();
                        } else if (f11 > 0.0f || f12 < 0.0f) {
                            f7 = f5;
                            f5 = f9;
                        } else {
                            float width = g - f8.width();
                            f7 = f5;
                            f5 = width;
                        }
                        float f13 = f6 - f8.top;
                        float f14 = h - f8.bottom;
                        int i2 = (f13 > 0.0f ? 1 : (f13 == 0.0f ? 0 : -1));
                        if (i2 > 0 && f14 > 0.0f) {
                            height = h - f8.height();
                            f6 = f10;
                        } else if (i2 >= 0 && f14 <= 0.0f) {
                            float f15 = f6;
                            f6 = h - f8.height();
                            height = f15;
                        } else {
                            height = (f13 > 0.0f || f14 < 0.0f) ? f10 : h - f8.height();
                        }
                        cVar.c = f9;
                        cVar.d = f10;
                        if (f9 != f5 || f10 != height) {
                            cVar.b.fling((int) f9, (int) f10, -((int) f3), -((int) f4), (int) f7, (int) f5, (int) f6, (int) height, 0, 0);
                        }
                    }
                }
                a.this.b.post(a.this.F);
            }

            @Override // com.sankuai.waimai.ugc.creator.widgets.imageview.d
            public final void a(float f, float f2, float f3) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "60a58dfce3e3bc02abaa62731ecada1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "60a58dfce3e3bc02abaa62731ecada1f");
                } else {
                    a(f, f2, f3, 0.0f, 0.0f);
                }
            }

            @Override // com.sankuai.waimai.ugc.creator.widgets.imageview.d
            public final void a(float f, float f2, float f3, float f4, float f5) {
                Object[] objArr2 = {Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Float.valueOf(f5)};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3bf01a5c1039660f4333344130db2380", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3bf01a5c1039660f4333344130db2380");
                } else if (a.this.a() < a.this.x || f < 1.0f) {
                    a.this.d.postScale(f, f, f2, f3);
                    a.a(a.this, f4, f5);
                    a.j(a.this);
                }
            }
        };
        this.b = imageView;
        this.b.setPadding(0, 0, 0, 0);
        imageView.setOnTouchListener(this);
        imageView.addOnLayoutChangeListener(this);
        if (imageView.isInEditMode()) {
            return;
        }
        this.m = new Path();
        this.n = new Paint();
        this.E = g.a(imageView.getContext(), 12.0f);
        this.i = Color.parseColor("#80000000");
        this.j = Color.parseColor("#ffffffff");
        this.k = 2;
        this.l = 1;
        this.B = new com.sankuai.waimai.ugc.creator.widgets.imageview.b(imageView.getContext(), this.I);
        this.A = new GestureDetector(imageView.getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.imageview.a.2
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                return false;
            }

            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
            public final void onLongPress(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71c71da2feb7a052d2ec9c72d8ed43d8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71c71da2feb7a052d2ec9c72d8ed43d8");
                } else if (a.this.p != null) {
                    a.this.p.onLongClick(a.this.b);
                }
            }
        });
        this.A.setOnDoubleTapListener(new GestureDetector.OnDoubleTapListener() { // from class: com.sankuai.waimai.ugc.creator.widgets.imageview.a.3
            public static ChangeQuickRedirect a;

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTap(MotionEvent motionEvent) {
                return true;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
                return false;
            }

            @Override // android.view.GestureDetector.OnDoubleTapListener
            public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
                Object[] objArr2 = {motionEvent};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "103922d0ab6a52ff9cc031ca8cf73608", RobustBitConfig.DEFAULT_VALUE)) {
                    return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "103922d0ab6a52ff9cc031ca8cf73608")).booleanValue();
                }
                if (a.this.o != null) {
                    a.this.o.onClick(a.this.b);
                }
                RectF f = a.this.f();
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                if (f != null) {
                    return f.contains(x, y);
                }
                return false;
            }
        });
    }

    public void a(float f, boolean z, boolean z2) {
        float max;
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60cf0d0a0a6d998004901463278cd0bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60cf0d0a0a6d998004901463278cd0bc");
            return;
        }
        RectF f2 = f();
        if (this.g == null || f2 == null) {
            return;
        }
        float width = this.g.width();
        a(f);
        if (z) {
            max = this.g.height() / width;
        } else {
            max = z2 ? Math.max(this.g.width() / f2.width(), this.g.height() / f2.height()) : 1.0f;
        }
        if (max != 1.0f) {
            this.d.postScale(max, max, this.g.centerX(), this.g.centerY());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9efef2b9fb07dd48b8c321a66e3f1004", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9efef2b9fb07dd48b8c321a66e3f1004");
            return;
        }
        this.h = f;
        int g = g();
        int h = h();
        float f2 = g * 0.5f;
        float f3 = h * 0.5f;
        float f4 = g - (this.E * 2);
        float f5 = f4 / f;
        float f6 = h - (this.E * 2);
        if (f5 <= f6) {
            f6 = f5;
        } else {
            f4 = f6 * f;
        }
        float f7 = f2 - (f4 / 2.0f);
        float f8 = f3 - (f6 / 2.0f);
        this.g = new RectF();
        this.g.set(f7, f8, f7 + f4, f8 + f6);
        RectF f9 = f();
        if (f9 != null) {
            this.w = a() * Math.max(f4 / f9.width(), f6 / f9.height());
            this.x = this.w * 3.0f;
        }
        this.b.invalidate();
    }

    public final float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40345183d31ccdf7863f83c8715850eb", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40345183d31ccdf7863f83c8715850eb")).floatValue() : (float) Math.sqrt(((float) Math.pow(a(this.d, 0), 2.0d)) + ((float) Math.pow(a(this.d, 3), 2.0d)));
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fa231f3d77f188c83a2471b3e193567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fa231f3d77f188c83a2471b3e193567");
        } else if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
        } else {
            k();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0141  */
    @Override // android.view.View.OnTouchListener
    @android.annotation.SuppressLint({"ClickableViewAccessibility"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onTouch(android.view.View r21, android.view.MotionEvent r22) {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.ugc.creator.widgets.imageview.a.onTouch(android.view.View, android.view.MotionEvent):boolean");
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c314a0326756257552fa662d28de880", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c314a0326756257552fa662d28de880");
        } else {
            k();
        }
    }

    public final Matrix c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed97483230821a73d82bb7769a867a2c", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed97483230821a73d82bb7769a867a2c");
        }
        Matrix matrix = new Matrix();
        Object[] objArr2 = {matrix};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4bb92b5af4bb217080d9749e3bdf5a2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4bb92b5af4bb217080d9749e3bdf5a2a");
        } else {
            matrix.set(j());
        }
        return matrix;
    }

    private Matrix j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "09a41ec032c26b0a78d126c2f574ac90", RobustBitConfig.DEFAULT_VALUE)) {
            return (Matrix) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "09a41ec032c26b0a78d126c2f574ac90");
        }
        this.e.set(this.c);
        this.e.postConcat(this.d);
        return this.e;
    }

    private float a(Matrix matrix, int i) {
        Object[] objArr = {matrix, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f220fac33a40700c12910826f50ef35", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f220fac33a40700c12910826f50ef35")).floatValue();
        }
        matrix.getValues(this.C);
        return this.C[i];
    }

    private void a(Matrix matrix) {
        Object[] objArr = {matrix};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79230127011ebc3b1e543fbf3b8e54d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79230127011ebc3b1e543fbf3b8e54d1");
        } else {
            this.b.setImageMatrix(matrix);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87d01b01237eeadf07cde709faa9aa73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87d01b01237eeadf07cde709faa9aa73");
            return;
        }
        l();
        m();
        e();
    }

    public void e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1b563e0c625562b065f8df589a2b211", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1b563e0c625562b065f8df589a2b211");
        } else {
            a(j());
        }
    }

    public final RectF f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52628453cd101a7c6faa26fe0195d803", RobustBitConfig.DEFAULT_VALUE)) {
            return (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52628453cd101a7c6faa26fe0195d803");
        }
        Drawable drawable = this.b.getDrawable();
        if (drawable != null) {
            this.D.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
            j().mapRect(this.D);
            return this.D;
        }
        return null;
    }

    private void k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1360c8133366206c51bede1ee37aeca5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1360c8133366206c51bede1ee37aeca5");
            return;
        }
        Drawable drawable = this.b.getDrawable();
        if (drawable == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        this.c.reset();
        RectF rectF = new RectF(0.0f, 0.0f, g(), h());
        this.c.setRectToRect(new RectF(0.0f, 0.0f, intrinsicWidth, intrinsicHeight), rectF, Matrix.ScaleToFit.CENTER);
        this.d.reset();
        d();
    }

    private void l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec65aa5a0c4c440bc602d1c3b19a2229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec65aa5a0c4c440bc602d1c3b19a2229");
            return;
        }
        RectF f = f();
        if (f == null || this.g == null) {
            return;
        }
        float f2 = this.g.left;
        float f3 = this.g.top;
        float f4 = this.g.right;
        float f5 = this.g.bottom;
        float width = this.g.width();
        float height = this.g.height();
        float max = Math.max(width / f.width(), height / f.height());
        if (max > 1.0f) {
            this.d.postScale(max, max, (f2 + f4) * 0.5f, (f3 + f5) * 0.5f);
        }
    }

    private void m() {
        float max;
        float max2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3c9477d262fd8ee08f116e4e6c48843", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3c9477d262fd8ee08f116e4e6c48843");
            return;
        }
        RectF f = f();
        if (f == null || this.g == null) {
            return;
        }
        float f2 = this.g.left;
        float f3 = this.g.top;
        float f4 = this.g.right;
        float f5 = this.g.bottom;
        float f6 = f3 - f.top;
        float f7 = f5 - f.bottom;
        if (f6 > 0.0f && f7 > 0.0f) {
            max = Math.min(f6, f7);
        } else {
            max = (f6 >= 0.0f || f7 >= 0.0f) ? 0.0f : Math.max(f6, f7);
        }
        if (max == 0.0f) {
            this.H = -1;
        } else if (max == f6) {
            this.H = 0;
        } else if (max == f7) {
            this.H = 1;
        }
        float f8 = f2 - f.left;
        float f9 = f4 - f.right;
        if (f8 > 0.0f && f9 > 0.0f) {
            max2 = Math.min(f8, f9);
        } else {
            max2 = (f8 >= 0.0f || f9 >= 0.0f) ? 0.0f : Math.max(f8, f9);
        }
        if (max2 == 0.0f) {
            this.G = -1;
        } else if (max2 == f8) {
            this.G = 0;
        } else if (max2 == f9) {
            this.G = 1;
        }
        this.d.postTranslate(max2, max);
    }

    public int g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "777f8f203d36fdb53a1e26e5102f77c0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "777f8f203d36fdb53a1e26e5102f77c0")).intValue() : this.b.getWidth();
    }

    public int h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0902e2f39dfc953090ce4b5c59316c7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0902e2f39dfc953090ce4b5c59316c7")).intValue() : this.b.getHeight();
    }

    @Nullable
    public final float[] i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c27e5fae4aba7348b5ce8cbe310e7fac", RobustBitConfig.DEFAULT_VALUE)) {
            return (float[]) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c27e5fae4aba7348b5ce8cbe310e7fac");
        }
        RectF f = f();
        if (this.g == null || f == null || !RectF.intersects(this.g, f)) {
            return null;
        }
        float max = Math.max(this.g.left, f.left);
        float max2 = Math.max(this.g.top, f.top);
        return new float[]{max - f.left, max2 - f.top, Math.min(this.g.right, f.right) - max, Math.min(this.g.bottom, f.bottom) - max2};
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.ugc.creator.widgets.imageview.a$a  reason: collision with other inner class name */
    /* loaded from: classes6.dex */
    public class RunnableC1368a implements Runnable {
        public static ChangeQuickRedirect a;
        private final float c;
        private final float d;
        private final long e;
        private final float f;
        private final float g;

        public RunnableC1368a(float f, float f2, float f3, float f4) {
            Object[] objArr = {a.this, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac8536b64c7d81c4f39e1b03994e7e85", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac8536b64c7d81c4f39e1b03994e7e85");
                return;
            }
            this.c = f3;
            this.d = f4;
            this.e = System.currentTimeMillis();
            this.f = f;
            this.g = f2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            float interpolation;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77803adfe33a9f4535faa1a4ede14a6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77803adfe33a9f4535faa1a4ede14a6f");
                return;
            }
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "980c4998ef5d387cfee91caf796c6550", RobustBitConfig.DEFAULT_VALUE)) {
                interpolation = ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "980c4998ef5d387cfee91caf796c6550")).floatValue();
            } else {
                interpolation = a.this.u.getInterpolation(Math.min(1.0f, (((float) (System.currentTimeMillis() - this.e)) * 1.0f) / a.this.v));
            }
            a.this.I.a((this.f + ((this.g - this.f) * interpolation)) / a.this.a(), this.c, this.d);
            if (interpolation < 1.0f) {
                a.this.b.postOnAnimation(this);
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public class c implements Runnable {
        public static ChangeQuickRedirect a;
        final OverScroller b;
        float c;
        float d;

        public c(Context context) {
            Object[] objArr = {a.this, context};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee20aa229a1f7ee1dcf4709de0dbf0a6", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee20aa229a1f7ee1dcf4709de0dbf0a6");
            } else {
                this.b = new OverScroller(context);
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eeecb45e201c47aae95ba639288441c8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eeecb45e201c47aae95ba639288441c8");
            } else if (!this.b.isFinished() && this.b.computeScrollOffset()) {
                float currX = this.b.getCurrX();
                float currY = this.b.getCurrY();
                a.a(a.this, currX - this.c, currY - this.d);
                this.c = currX;
                this.d = currY;
                a.this.b.postOnAnimation(this);
            }
        }
    }

    public final void a(final com.sankuai.waimai.ugc.creator.widgets.imageview.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "391b34da5943bbdc701182995f7d64b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "391b34da5943bbdc701182995f7d64b9");
            return;
        }
        float[] i = i();
        if (this.t == null || i == null || cVar == null) {
            return;
        }
        com.sankuai.waimai.ugc.creator.utils.task.b.a((com.sankuai.waimai.ugc.creator.utils.task.a) new b(this.t, i, c()) { // from class: com.sankuai.waimai.ugc.creator.widgets.imageview.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.ugc.creator.utils.task.a
            public final /* synthetic */ void a(ImageData imageData) {
                ImageData imageData2 = imageData;
                Object[] objArr2 = {imageData2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3f6b38952dd48c0ab67e8db115bd4544", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3f6b38952dd48c0ab67e8db115bd4544");
                } else {
                    cVar.a(imageData2);
                }
            }
        });
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static abstract class b extends com.sankuai.waimai.ugc.creator.utils.task.a<ImageData> {
        public static ChangeQuickRedirect d;
        private final Matrix a;
        private final Bitmap b;
        private final float[] c;

        @Override // com.sankuai.waimai.ugc.creator.utils.task.a
        public final /* synthetic */ ImageData b() throws Exception {
            String a;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ae5a6f9214adf04d8fd681b3a3ec5272", RobustBitConfig.DEFAULT_VALUE)) {
                return (ImageData) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ae5a6f9214adf04d8fd681b3a3ec5272");
            }
            Bitmap createBitmap = Bitmap.createBitmap(Bitmap.createBitmap(this.b, 0, 0, this.b.getWidth(), this.b.getHeight(), this.a, false), (int) this.c[0], (int) this.c[1], (int) this.c[2], (int) this.c[3]);
            Object[] objArr2 = {createBitmap, 100};
            ChangeQuickRedirect changeQuickRedirect2 = f.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a48bdcd2d150a086d2b7309d8a0ae975", RobustBitConfig.DEFAULT_VALUE)) {
                a = (String) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a48bdcd2d150a086d2b7309d8a0ae975");
            } else {
                String format = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.CHINA).format(new Date());
                a = f.a("wm_ugc_photo_" + format + ".png", createBitmap, 100);
            }
            ImageData imageData = new ImageData();
            imageData.h = a;
            imageData.r = f.a(a);
            return imageData;
        }

        public b(Bitmap bitmap, float[] fArr, Matrix matrix) {
            Object[] objArr = {bitmap, fArr, matrix};
            ChangeQuickRedirect changeQuickRedirect = d;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a190328a2cf9be23cfbc3ca4661009d9", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a190328a2cf9be23cfbc3ca4661009d9");
                return;
            }
            this.b = bitmap;
            this.a = matrix;
            this.c = fArr;
        }
    }
}
