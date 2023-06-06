package com.meituan.android.legwork.ui.component.pickerview.lib;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Handler;
import android.support.constraint.R;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.android.legwork.utils.h;
import com.meituan.android.legwork.utils.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Locale;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class WheelView extends View {
    public static ChangeQuickRedirect a;
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public long G;
    public int H;
    private b I;
    private GestureDetector J;
    private boolean K;
    private boolean L;
    private String M;
    private int N;
    private int O;
    private float P;
    private int Q;
    private int R;
    private int S;
    private float T;
    private Object[] U;
    public Context b;
    public Handler c;
    public com.meituan.android.legwork.ui.component.pickerview.listener.c d;
    public ScheduledExecutorService e;
    ScheduledFuture<?> f;
    public Paint g;
    public Paint h;
    public Paint i;
    public com.meituan.android.legwork.ui.component.pickerview.adapter.b j;
    public int k;
    public int l;
    public int m;
    public float n;
    public Typeface o;
    public int p;
    public int q;
    public int r;
    public float s;
    public boolean t;
    public float u;
    public float v;
    public float w;
    public float x;
    public int y;
    public int z;

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum a {
        CLICK,
        FLING,
        DAGGLE;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "626ae5d042556f649e820e8a3440079e", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "626ae5d042556f649e820e8a3440079e");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "63f59605407c1bba31f66ad7b03f11f3", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "63f59605407c1bba31f66ad7b03f11f3") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6cea928300e4151450cb25e90101e5dd", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6cea928300e4151450cb25e90101e5dd") : (a[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public enum b {
        FILL,
        WRAP;
        
        public static ChangeQuickRedirect a;

        b() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f786ea36e2c4ce68912d2ff66270298", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f786ea36e2c4ce68912d2ff66270298");
            }
        }

        public static b valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c634539b5dcd8bed0e18ec9d531ac333", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c634539b5dcd8bed0e18ec9d531ac333") : (b) Enum.valueOf(b.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static b[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "382fb06053a02a175cdf2c7ae60dd1de", RobustBitConfig.DEFAULT_VALUE) ? (b[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "382fb06053a02a175cdf2c7ae60dd1de") : (b[]) values().clone();
        }
    }

    public WheelView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a68a53931d620de3f098c631220d94b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a68a53931d620de3f098c631220d94b8");
        }
    }

    public WheelView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41d04960df444064425cade80f8f93b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41d04960df444064425cade80f8f93b6");
            return;
        }
        this.K = false;
        this.L = true;
        this.e = com.sankuai.android.jarvis.c.c("legwork-wheelView-thread");
        this.o = Typeface.MONOSPACE;
        this.p = -5723992;
        this.q = -14013910;
        this.r = -2763307;
        this.s = 1.6f;
        this.B = 7;
        this.O = 0;
        this.P = 0.0f;
        this.G = 0L;
        this.Q = 17;
        this.R = 0;
        this.S = 0;
        this.U = new Object[this.B];
        this.k = 20;
        float f = getResources().getDisplayMetrics().density;
        if (f < 1.0f) {
            this.T = 2.4f;
        } else {
            int i = (1.0f > f ? 1 : (1.0f == f ? 0 : -1));
            if (i <= 0 && f < 2.0f) {
                this.T = 3.6f;
            } else if (i <= 0 && f < 2.0f) {
                this.T = 4.5f;
            } else if (2.0f <= f && f < 3.0f) {
                this.T = 6.0f;
            } else if (f >= 3.0f) {
                this.T = f * 2.5f;
            }
        }
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.legwork_pickerview_gravity, R.attr.legwork_pickerview_textSize, R.attr.legwork_pickerview_textColorOut, R.attr.legwork_pickerview_textColorCenter, R.attr.legwork_pickerview_dividerColor, R.attr.legwork_pickerview_lineSpacingMultiplier}, 0, 0);
            this.Q = obtainStyledAttributes.getInt(0, 17);
            this.p = obtainStyledAttributes.getColor(2, this.p);
            this.q = obtainStyledAttributes.getColor(3, this.q);
            this.r = obtainStyledAttributes.getColor(4, this.r);
            this.k = obtainStyledAttributes.getDimensionPixelOffset(1, this.k);
            this.s = obtainStyledAttributes.getFloat(5, this.s);
            obtainStyledAttributes.recycle();
        }
        b();
        Object[] objArr2 = {context};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe8efffe3be1f37c329df6c6cc0bcd90", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe8efffe3be1f37c329df6c6cc0bcd90");
            return;
        }
        this.b = context;
        this.c = new c(this);
        this.J = new GestureDetector(context, new com.meituan.android.legwork.ui.component.pickerview.lib.b(this));
        this.J.setIsLongpressEnabled(false);
        this.t = true;
        this.x = 0.0f;
        this.y = -1;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "9e7a47a5775c19fb31289a624068e444", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "9e7a47a5775c19fb31289a624068e444");
            return;
        }
        this.g = new Paint();
        this.g.setColor(this.p);
        this.g.setAntiAlias(true);
        this.g.setTypeface(this.o);
        this.g.setTextSize(this.k);
        this.h = new Paint();
        this.h.setColor(this.q);
        this.h.setAntiAlias(true);
        this.h.setTextScaleX(1.1f);
        this.h.setTypeface(this.o);
        this.h.setTextSize(this.k);
        this.i = new Paint();
        this.i.setColor(this.r);
        this.i.setAntiAlias(true);
        this.i.setStrokeWidth(1.0f);
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8e1eedc8f4505ea214f71545c50e0e57", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8e1eedc8f4505ea214f71545c50e0e57");
        } else if (this.s < 1.2f) {
            this.s = 1.2f;
        } else if (this.s > 2.0f) {
            this.s = 2.0f;
        }
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e26ca12984934647d0e0b87b7f9935dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e26ca12984934647d0e0b87b7f9935dd");
        } else if (this.j != null) {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eabc763e2f56876af78227a8b452b176", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eabc763e2f56876af78227a8b452b176");
            } else {
                Rect rect = new Rect();
                for (int i = 0; i < this.j.a(); i++) {
                    String a2 = a(this.j.a(i));
                    this.h.getTextBounds(a2, 0, a2.length(), rect);
                    int width = rect.width();
                    if (width > this.l) {
                        this.l = width;
                    }
                    this.h.getTextBounds("星期", 0, 2, rect);
                    this.m = rect.height() + 2;
                }
                this.n = this.m + h.a(20);
            }
            this.E = (int) (this.n * (this.B - 1));
            this.C = (int) ((this.E * 2) / 3.141592653589793d);
            this.F = (int) (this.E / 3.141592653589793d);
            this.D = View.MeasureSpec.getSize(this.H);
            this.u = (this.C - this.n) / 2.0f;
            this.v = (this.C + this.n) / 2.0f;
            this.w = (this.v - ((this.n - this.m) / 2.0f)) - this.T;
            if (this.y == -1) {
                if (this.t) {
                    this.y = (this.j.a() + 1) / 2;
                } else {
                    this.y = 0;
                }
            }
            this.z = this.y;
        }
    }

    public final void a(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99cf15c1ef6c97432a70ec94ad837949", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99cf15c1ef6c97432a70ec94ad837949");
            return;
        }
        a();
        if (aVar == a.FLING || aVar == a.DAGGLE) {
            this.O = (int) (((this.x % this.n) + this.n) % this.n);
            if (this.O > this.n / 2.0f) {
                this.O = (int) (this.n - this.O);
            } else {
                this.O = -this.O;
            }
        }
        this.f = this.e.scheduleWithFixedDelay(new e(this, this.O), 0L, 1L, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cf0e936819b1c15217eab467e672407", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cf0e936819b1c15217eab467e672407");
        } else if (this.f == null || this.f.isCancelled()) {
        } else {
            this.f.cancel(true);
            this.f = null;
        }
    }

    public final void setCyclic(boolean z) {
        this.t = z;
    }

    public final void setTypeface(Typeface typeface) {
        Object[] objArr = {typeface};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4154469acaa6c52605c6246761ac4995", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4154469acaa6c52605c6246761ac4995");
            return;
        }
        this.o = typeface;
        this.g.setTypeface(this.o);
        this.h.setTypeface(this.o);
    }

    public final void setTextSize(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a133f7fd8061547f2c3213ea80e96e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a133f7fd8061547f2c3213ea80e96e0");
        } else if (i > 0.0f) {
            this.k = h.a(i);
            this.g.setTextSize(this.k);
            this.h.setTextSize(this.k);
        }
    }

    public final void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27f74f109b4d279652c615c7b9731ffa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27f74f109b4d279652c615c7b9731ffa");
            return;
        }
        this.N = i;
        this.y = i;
        this.x = 0.0f;
        invalidate();
    }

    public final void setOnItemSelectedListener(com.meituan.android.legwork.ui.component.pickerview.listener.c cVar) {
        this.d = cVar;
    }

    public final void setAdapter(com.meituan.android.legwork.ui.component.pickerview.adapter.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2252bf59f19b3e4551f5205cf9abbdf9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2252bf59f19b3e4551f5205cf9abbdf9");
            return;
        }
        this.j = bVar;
        c();
        invalidate();
    }

    public final com.meituan.android.legwork.ui.component.pickerview.adapter.b getAdapter() {
        return this.j;
    }

    public final int getCurrentItem() {
        return this.N;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        float f;
        char c;
        int i;
        float[] fArr;
        char c2 = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba6e3f6071a9b7ecd56b919270ee6264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba6e3f6071a9b7ecd56b919270ee6264");
        } else if (this.j != null) {
            if (this.y < 0) {
                this.y = 0;
            }
            if (this.y >= this.j.a()) {
                this.y = this.j.a() - 1;
            }
            this.A = (int) (this.x / this.n);
            try {
                this.z = this.y + (this.A % this.j.a());
            } catch (ArithmeticException e) {
                x.e("WheelView.onDraw()", "出错了！adapter.getItemsCount() == 0，联动数据不匹配,exception msg:", e);
                x.a(e);
            }
            if (!this.t) {
                if (this.z < 0) {
                    this.z = 0;
                }
                if (this.z > this.j.a() - 1) {
                    this.z = this.j.a() - 1;
                }
            } else {
                if (this.z < 0) {
                    this.z = this.j.a() + this.z;
                }
                if (this.z > this.j.a() - 1) {
                    this.z -= this.j.a();
                }
            }
            float f2 = this.x % this.n;
            for (int i2 = 0; i2 < this.B; i2++) {
                int i3 = this.z - ((this.B / 2) - i2);
                if (this.t) {
                    i3 = a(i3);
                } else {
                    if (i3 < 0) {
                        this.U[i2] = "";
                    } else if (i3 > this.j.a() - 1) {
                        this.U[i2] = "";
                    }
                }
                this.U[i2] = this.j.a(i3);
            }
            if (this.I == b.WRAP) {
                float f3 = TextUtils.isEmpty(this.M) ? ((this.D - this.l) / 2) - 12 : ((this.D - this.l) / 4) - 12;
                float f4 = f3 <= 0.0f ? 10.0f : f3;
                float f5 = this.D - f4;
                float f6 = f4;
                canvas.drawLine(f6, this.u, f5, this.u, this.i);
                canvas.drawLine(f6, this.v, f5, this.v, this.i);
            } else {
                canvas.drawLine(0.0f, this.u, this.D, this.u, this.i);
                canvas.drawLine(0.0f, this.v, this.D, this.v, this.i);
            }
            if (!TextUtils.isEmpty(this.M) && this.L) {
                int i4 = this.D;
                Paint paint = this.h;
                String str = this.M;
                Object[] objArr2 = {paint, str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d55c40d42c99963efd5bee860c7361a2", RobustBitConfig.DEFAULT_VALUE)) {
                    i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d55c40d42c99963efd5bee860c7361a2")).intValue();
                } else if (str == null || str.length() <= 0) {
                    i = 0;
                } else {
                    int length = str.length();
                    paint.getTextWidths(str, new float[length]);
                    int i5 = 0;
                    for (int i6 = 0; i6 < length; i6++) {
                        i5 += (int) Math.ceil(fArr[i6]);
                    }
                    i = i5;
                }
                canvas.drawText(this.M, (i4 - i) - this.T, this.w, this.h);
            }
            int i7 = 0;
            while (i7 < this.B) {
                canvas.save();
                double d = ((this.n * i7) - f2) / this.F;
                float f7 = (float) (90.0d - ((d / 3.141592653589793d) * 180.0d));
                if (f7 >= 90.0f || f7 <= -90.0f) {
                    f = f2;
                    canvas.restore();
                } else {
                    String a2 = (!this.L && !TextUtils.isEmpty(this.M) && !TextUtils.isEmpty(a(this.U[i7]))) ? a(this.U[i7]) + this.M : a(this.U[i7]);
                    a(a2);
                    Object[] objArr3 = new Object[1];
                    objArr3[c2] = a2;
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    f = f2;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "938d79debec42b9043e0879165499c9e", RobustBitConfig.DEFAULT_VALUE)) {
                        c = 0;
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "938d79debec42b9043e0879165499c9e");
                    } else {
                        Rect rect = new Rect();
                        this.h.getTextBounds(a2, 0, a2.length(), rect);
                        int i8 = this.Q;
                        if (i8 != 3) {
                            if (i8 == 5) {
                                this.R = (this.D - rect.width()) - ((int) this.T);
                            } else if (i8 == 17) {
                                if (this.K || this.M == null || this.M.equals("") || !this.L) {
                                    this.R = (int) ((this.D - rect.width()) * 0.5d);
                                } else {
                                    this.R = (int) ((this.D - rect.width()) * 0.25d);
                                }
                            }
                            c = 0;
                        } else {
                            c = 0;
                            this.R = 0;
                        }
                    }
                    Object[] objArr4 = new Object[1];
                    objArr4[c] = a2;
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "0a4c6a8eb6ed45631d4e52776bf31905", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "0a4c6a8eb6ed45631d4e52776bf31905");
                    } else {
                        Rect rect2 = new Rect();
                        this.g.getTextBounds(a2, 0, a2.length(), rect2);
                        int i9 = this.Q;
                        if (i9 == 3) {
                            this.S = 0;
                        } else if (i9 == 5) {
                            this.S = (this.D - rect2.width()) - ((int) this.T);
                        } else if (i9 == 17) {
                            if (this.K || this.M == null || this.M.equals("") || !this.L) {
                                this.S = (int) ((this.D - rect2.width()) * 0.5d);
                            } else {
                                this.S = (int) ((this.D - rect2.width()) * 0.25d);
                            }
                        }
                    }
                    float cos = (float) ((this.F - (Math.cos(d) * this.F)) - ((Math.sin(d) * this.m) / 2.0d));
                    canvas.translate(0.0f, cos);
                    canvas.scale(1.0f, (float) Math.sin(d));
                    if (cos <= this.u && this.m + cos >= this.u) {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.D, this.u - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(a2, this.S, this.m, this.g);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.u - cos, this.D, (int) this.n);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(a2, this.R, this.m - this.T, this.h);
                        canvas.restore();
                    } else if (cos <= this.v && this.m + cos >= this.v) {
                        canvas.save();
                        canvas.clipRect(0.0f, 0.0f, this.D, this.v - cos);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(a2, this.R, this.m - this.T, this.h);
                        canvas.restore();
                        canvas.save();
                        canvas.clipRect(0.0f, this.v - cos, this.D, (int) this.n);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(a2, this.S, this.m, this.g);
                        canvas.restore();
                    } else if (cos >= this.u && this.m + cos <= this.v) {
                        canvas.drawText(a2, this.R, this.m - this.T, this.h);
                        this.N = this.j.a((com.meituan.android.legwork.ui.component.pickerview.adapter.b) this.U[i7]);
                    } else {
                        canvas.save();
                        canvas.clipRect(0, 0, this.D, (int) this.n);
                        canvas.scale(1.0f, ((float) Math.sin(d)) * 1.0f);
                        canvas.drawText(a2, this.S, this.m, this.g);
                        canvas.restore();
                    }
                    canvas.restore();
                    this.h.setTextSize(this.k);
                }
                i7++;
                f2 = f;
                c2 = 0;
            }
        }
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "536705a4c9e69963652c9b164ecc858f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "536705a4c9e69963652c9b164ecc858f");
            return;
        }
        Rect rect = new Rect();
        this.h.getTextBounds(str, 0, str.length(), rect);
        int i = this.k;
        for (int width = rect.width(); width > this.D; width = rect.width()) {
            i--;
            this.h.setTextSize(i);
            this.h.getTextBounds(str, 0, str.length(), rect);
        }
        this.g.setTextSize(i);
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "450b7d78bbc550c2f6438a6eefced479", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "450b7d78bbc550c2f6438a6eefced479")).intValue();
        }
        if (i < 0) {
            return a(i + this.j.a());
        }
        return i > this.j.a() - 1 ? a(i - this.j.a()) : i;
    }

    private String a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d2907f6255a48006cd3a76bb349d370", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d2907f6255a48006cd3a76bb349d370");
        }
        if (obj == null) {
            return "";
        }
        if (obj instanceof com.meituan.android.legwork.ui.component.pickerview.model.a) {
            return ((com.meituan.android.legwork.ui.component.pickerview.model.a) obj).a();
        }
        return obj instanceof Integer ? String.format(Locale.getDefault(), "%02d", Integer.valueOf(((Integer) obj).intValue())) : obj.toString();
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a7b6adff7a57b28aef0d6e123cc737c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a7b6adff7a57b28aef0d6e123cc737c7");
            return;
        }
        this.H = i;
        c();
        setMeasuredDimension(this.D, this.C);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90fde532c0da8b0197e893d49387a66a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90fde532c0da8b0197e893d49387a66a")).booleanValue();
        }
        boolean onTouchEvent = this.J.onTouchEvent(motionEvent);
        int action = motionEvent.getAction();
        if (action == 0) {
            this.G = System.currentTimeMillis();
            a();
            this.P = motionEvent.getRawY();
        } else if (action == 2) {
            float rawY = this.P - motionEvent.getRawY();
            this.P = motionEvent.getRawY();
            this.x += rawY;
            if (!this.t) {
                float f = (-this.y) * this.n;
                float a2 = ((this.j.a() - 1) - this.y) * this.n;
                if (this.x - (this.n * 0.25d) < f) {
                    f = this.x - rawY;
                } else if (this.x + (this.n * 0.25d) > a2) {
                    a2 = this.x - rawY;
                }
                if (this.x < f) {
                    this.x = (int) f;
                } else if (this.x > a2) {
                    this.x = (int) a2;
                }
            }
        } else if (!onTouchEvent) {
            this.O = (int) (((((int) (((Math.acos((this.F - motionEvent.getY()) / this.F) * this.F) + (this.n / 2.0f)) / this.n)) - (this.B / 2)) * this.n) - (((this.x % this.n) + this.n) % this.n));
            if (System.currentTimeMillis() - this.G > 120) {
                a(a.DAGGLE);
            }
        }
        invalidate();
        return true;
    }

    public int getItemsCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11a3797192404ffb5c2cb4bb5a2a7d84", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11a3797192404ffb5c2cb4bb5a2a7d84")).intValue();
        }
        if (this.j != null) {
            return this.j.a();
        }
        return 0;
    }

    public void setLabel(String str) {
        this.M = str;
    }

    public final void a(Boolean bool) {
        Object[] objArr = {bool};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9285b83f12a3591db5df7b357ae0670", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9285b83f12a3591db5df7b357ae0670");
        } else {
            this.L = bool.booleanValue();
        }
    }

    public void setGravity(int i) {
        this.Q = i;
    }

    public void setIsOptions(boolean z) {
        this.K = z;
    }

    public void setTextColorOut(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74bd18ec018341624576e9a0ae6aef74", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74bd18ec018341624576e9a0ae6aef74");
        } else if (i != 0) {
            this.p = i;
            this.g.setColor(this.p);
        }
    }

    public void setTextColorCenter(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7016438522dd5f02c90bc614cba848ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7016438522dd5f02c90bc614cba848ee");
        } else if (i != 0) {
            this.q = i;
            this.h.setColor(this.q);
        }
    }

    public void setDividerColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa77aef0db8743d2ef8191e515ea3a56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa77aef0db8743d2ef8191e515ea3a56");
        } else if (i != 0) {
            this.r = i;
            this.i.setColor(this.r);
        }
    }

    public void setDividerType(b bVar) {
        this.I = bVar;
    }

    public void setLineSpacingMultiplier(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b75cda05ebf86ab311dbe29ef83cdd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b75cda05ebf86ab311dbe29ef83cdd3");
        } else if (f != 0.0f) {
            this.s = f;
            b();
        }
    }
}
