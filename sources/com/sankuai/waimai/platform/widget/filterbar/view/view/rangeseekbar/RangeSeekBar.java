package com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.annotation.ColorRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.view.MotionEventCompat;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.h;
import com.tencent.smtt.sdk.TbsListener;
import java.lang.Number;
import java.math.BigDecimal;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class RangeSeekBar<T extends Number> extends AppCompatImageView {
    public static ChangeQuickRedirect a;
    public static final int b = Color.argb(255, 51, 181, (int) TbsListener.ErrorCode.INSTALL_FROM_UNZIP);
    public static final Integer c = 0;
    public static final Integer d = 100;
    public static final Integer e = 1;
    private double A;
    private c B;
    private boolean C;
    private b<T> D;
    private float E;
    private int F;
    private int G;
    private boolean H;
    private int I;
    private int J;
    private int K;
    private int L;
    private RectF M;
    private boolean N;
    private boolean O;
    private boolean P;
    private boolean Q;
    private float R;
    private int S;
    private int T;
    private int U;
    private String V;
    private String W;
    private String aa;
    private String ab;
    private boolean ac;
    private String ad;
    private boolean ae;
    private int af;
    private int ag;
    private int ah;
    private Path ai;
    private Path aj;
    private Matrix ak;
    private boolean al;
    protected T f;
    protected T g;
    protected T h;
    protected a i;
    protected double j;
    protected double k;
    protected double l;
    protected double m;
    protected double n;
    protected double o;
    private final Paint p;
    private final Paint q;
    private Bitmap r;
    private Bitmap s;
    private Bitmap t;
    private int u;
    private int v;
    private float w;
    private float x;
    private float y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface b<T extends Number> {
        void a(RangeSeekBar<T> rangeSeekBar, T t, T t2, double d, double d2);
    }

    public RangeSeekBar(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "541e0436d6a8960da15df5de63015242", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "541e0436d6a8960da15df5de63015242");
            return;
        }
        this.p = new Paint(1);
        this.q = new Paint();
        this.m = 0.0d;
        this.n = 1.0d;
        this.o = 0.0d;
        this.z = false;
        this.A = 0.0d;
        this.B = null;
        this.C = false;
        this.F = 255;
        this.aj = new Path();
        this.ak = new Matrix();
        a(context, (AttributeSet) null);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "24ac74a661bce6b655b2930cbb4ea07d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "24ac74a661bce6b655b2930cbb4ea07d");
            return;
        }
        this.p = new Paint(1);
        this.q = new Paint();
        this.m = 0.0d;
        this.n = 1.0d;
        this.o = 0.0d;
        this.z = false;
        this.A = 0.0d;
        this.B = null;
        this.C = false;
        this.F = 255;
        this.aj = new Path();
        this.ak = new Matrix();
        a(context, attributeSet);
    }

    public RangeSeekBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66949a5eb376ea085bb567123c8bc661", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66949a5eb376ea085bb567123c8bc661");
            return;
        }
        this.p = new Paint(1);
        this.q = new Paint();
        this.m = 0.0d;
        this.n = 1.0d;
        this.o = 0.0d;
        this.z = false;
        this.A = 0.0d;
        this.B = null;
        this.C = false;
        this.F = 255;
        this.aj = new Path();
        this.ak = new Matrix();
        a(context, attributeSet);
    }

    private T a(TypedArray typedArray, int i, int i2) {
        Object[] objArr = {typedArray, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d04467d73ae136fda896fbda64646b1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d04467d73ae136fda896fbda64646b1c");
        }
        TypedValue peekValue = typedArray.peekValue(i);
        if (peekValue == null) {
            return Integer.valueOf(i2);
        }
        if (peekValue.type == 4) {
            return Float.valueOf(typedArray.getFloat(i, i2));
        }
        return Integer.valueOf(typedArray.getInteger(i, i2));
    }

    private void a(Context context, AttributeSet attributeSet) {
        float dimensionPixelSize;
        BitmapFactory.Options options;
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "39010bb6c10b61929315a599815866a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "39010bb6c10b61929315a599815866a7");
            return;
        }
        int argb = Color.argb(75, 0, 0, 0);
        int a2 = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 2);
        int a3 = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 0);
        int a4 = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 2);
        if (attributeSet == null) {
            b();
            this.R = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 8);
            this.S = b;
            this.T = -7829368;
            this.O = false;
            this.z = false;
            this.A = 0.0d;
            this.Q = true;
            this.ac = false;
            this.ad = "";
            this.U = -1;
            this.J = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 14);
            this.K = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 8);
            this.L = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 8);
            this.V = "";
            this.W = "";
            this.u = -1;
            this.v = -1;
            this.af = a3;
            this.ag = a2;
            this.ah = a4;
            this.al = false;
            dimensionPixelSize = com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(context, 1);
        } else {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.absoluteMinValue, R.attr.absoluteMaxValue, R.attr.step, R.attr.isSmoothSlide, R.attr.smoothStep, R.attr.singleThumb, R.attr.showLabels, R.attr.minLabel, R.attr.maxLabel, R.attr.showMaxLabelExtraSuffix, R.attr.maxLabelExtraSuffix, R.attr.alwaysActive, R.attr.valuesAboveThumbs, R.attr.textAboveThumbsSize, R.attr.textAboveThumbsDistanceToTop, R.attr.textAboveThumbsDistanceToButton, R.attr.prefixAboveThumbs, R.attr.suffixAboveThumbs, R.attr.internalPadding, R.attr.barHeight, R.attr.defaultColor, R.attr.activeColor, R.attr.textAboveThumbsColor, R.attr.thumbNormal, R.attr.thumbPressed, R.attr.thumbDisabled, R.attr.thumbsWidth, R.attr.thumbsHeight, R.attr.thumbShadow, R.attr.thumbShadowColor, R.attr.thumbShadowXOffset, R.attr.thumbShadowYOffset, R.attr.thumbShadowBlur, R.attr.activateOnDefaultValues}, 0, 0);
            try {
                a(a(obtainStyledAttributes, 0, c.intValue()), a(obtainStyledAttributes, 1, d.intValue()), a(obtainStyledAttributes, 2, e.intValue()));
                this.z = obtainStyledAttributes.getBoolean(3, false);
                this.A = obtainStyledAttributes.getFloat(4, 0.0f);
                this.Q = obtainStyledAttributes.getBoolean(12, true);
                this.U = obtainStyledAttributes.getColor(22, -1);
                this.J = obtainStyledAttributes.getDimensionPixelSize(13, 14);
                this.K = obtainStyledAttributes.getDimensionPixelSize(14, 8);
                this.L = obtainStyledAttributes.getDimensionPixelSize(15, 8);
                this.V = obtainStyledAttributes.getString(16);
                this.W = obtainStyledAttributes.getString(17);
                this.ac = obtainStyledAttributes.getBoolean(9, false);
                this.ad = obtainStyledAttributes.getString(10);
                this.N = obtainStyledAttributes.getBoolean(5, false);
                this.P = obtainStyledAttributes.getBoolean(6, true);
                this.R = obtainStyledAttributes.getDimensionPixelSize(18, 8);
                dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(19, 1);
                this.S = obtainStyledAttributes.getColor(21, b);
                this.T = obtainStyledAttributes.getColor(20, -7829368);
                this.O = obtainStyledAttributes.getBoolean(11, false);
                this.aa = obtainStyledAttributes.getString(7);
                if (this.aa == null) {
                    this.aa = "";
                }
                this.ab = obtainStyledAttributes.getString(8);
                if (this.ab == null) {
                    this.ab = "";
                }
                this.u = obtainStyledAttributes.getDimensionPixelSize(26, -1);
                this.v = obtainStyledAttributes.getDimensionPixelSize(27, -1);
                Drawable drawable = obtainStyledAttributes.getDrawable(23);
                if (drawable != null) {
                    this.r = com.sankuai.waimai.foundation.utils.c.a(drawable, this.u, this.v);
                }
                Drawable drawable2 = obtainStyledAttributes.getDrawable(25);
                if (drawable2 != null) {
                    this.t = com.sankuai.waimai.foundation.utils.c.a(drawable2, this.u, this.v);
                }
                Drawable drawable3 = obtainStyledAttributes.getDrawable(24);
                if (drawable3 != null) {
                    this.s = com.sankuai.waimai.foundation.utils.c.a(drawable3, this.u, this.v);
                }
                this.ae = obtainStyledAttributes.getBoolean(28, false);
                argb = obtainStyledAttributes.getColor(29, argb);
                this.af = obtainStyledAttributes.getDimensionPixelSize(30, a3);
                this.ag = obtainStyledAttributes.getDimensionPixelSize(31, a2);
                this.ah = obtainStyledAttributes.getDimensionPixelSize(32, a4);
                this.al = obtainStyledAttributes.getBoolean(33, false);
            } finally {
                obtainStyledAttributes.recycle();
            }
        }
        if (this.u <= 0 || this.v <= 0) {
            options = null;
        } else {
            options = new BitmapFactory.Options();
            options.outWidth = this.u;
            options.outHeight = this.v;
        }
        if (this.r == null) {
            this.r = com.sankuai.waimai.launcher.util.image.a.a(getResources(), (int) R.drawable.wm_widget_rangeseekbar_ic_seek_thumb_normal, options);
        }
        if (this.s == null) {
            this.s = com.sankuai.waimai.launcher.util.image.a.a(getResources(), (int) R.drawable.wm_widget_rangeseekbar_ic_seek_thumb_pressed, options);
        }
        if (this.t == null) {
            this.t = com.sankuai.waimai.launcher.util.image.a.a(getResources(), (int) R.drawable.wm_widget_rangeseekbar_ic_seek_thumb_disabled, options);
        }
        this.w = this.r.getWidth() * 0.5f;
        this.x = this.r.getHeight() * 0.5f;
        c();
        this.I = this.Q ? this.J + this.L + this.K : 0;
        float f = dimensionPixelSize / 2.0f;
        this.M = new RectF(this.y, (this.I + this.x) - f, getWidth() - this.y, this.I + this.x + f);
        setFocusable(true);
        setFocusableInTouchMode(true);
        this.G = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.ae) {
            setLayerType(1, null);
            this.q.setColor(argb);
            this.q.setMaskFilter(new BlurMaskFilter(this.ah, BlurMaskFilter.Blur.NORMAL));
            this.ai = new Path();
            this.ai.addCircle(0.0f, 0.0f, this.x, Path.Direction.CW);
        }
    }

    public void setTextAboveThumbsSize(int i) {
        this.J = i;
    }

    public void setTextAboveThumbsDistanceToTop(int i) {
        this.K = i;
    }

    public void setTextAboveThumbsDistanceToButton(int i) {
        this.L = i;
    }

    public void setPrefixAboveThumbs(String str) {
        this.V = str;
    }

    public void setSuffixAboveThumbs(String str) {
        this.W = str;
    }

    private void b(T t, T t2) {
        Object[] objArr = {t, t2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542b55e11de6d8d7be5e732635bc270d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542b55e11de6d8d7be5e732635bc270d");
            return;
        }
        this.f = t;
        this.g = t2;
        c();
    }

    public final void a(T t, T t2, T t3) {
        Object[] objArr = {t, t2, t3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3ba848478f385154b799768671a079f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3ba848478f385154b799768671a079f");
            return;
        }
        this.h = t3;
        b(t, t2);
    }

    public void setIsSmoothSlide(boolean z) {
        this.z = z;
    }

    public void setSmoothStep(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b0d076fe4701b9271eed3c268107bafb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b0d076fe4701b9271eed3c268107bafb");
        } else {
            this.A = d2;
        }
    }

    public void setTextAboveThumbsColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67e85915e77eaac341095ebf9c9216f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67e85915e77eaac341095ebf9c9216f0");
            return;
        }
        this.U = i;
        invalidate();
    }

    public void setTextAboveThumbsColorResource(@ColorRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b2801f467c0b4531d1b771b1e1bd24f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b2801f467c0b4531d1b771b1e1bd24f");
        } else {
            setTextAboveThumbsColor(getResources().getColor(i));
        }
    }

    public final boolean a(T t, T t2) {
        Object[] objArr = {t, t2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "61e707f8ff06180b418434886252ae70", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "61e707f8ff06180b418434886252ae70")).booleanValue() : (h.d(Double.valueOf(t.doubleValue()), Double.valueOf(this.f.doubleValue())) || h.b(Double.valueOf(t2.doubleValue()), Double.valueOf(this.g.doubleValue()))) && h.c(Double.valueOf(t.doubleValue()), Double.valueOf(t2.doubleValue()));
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2a19efa3326ae0367f1c3482297c77b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2a19efa3326ae0367f1c3482297c77b");
            return;
        }
        this.f = c;
        this.g = d;
        this.h = e;
        c();
    }

    private void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76da185b834ea273cc0b496faaee14de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76da185b834ea273cc0b496faaee14de");
            return;
        }
        this.j = this.f.doubleValue();
        this.k = this.g.doubleValue();
        this.l = this.h.doubleValue();
        this.i = a.a(this.f);
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8f9932ef2069dccb475331c2eb93fe9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8f9932ef2069dccb475331c2eb93fe9d");
            return;
        }
        setSelectedMinValue(this.f);
        setSelectedMaxValue(this.g);
    }

    public void setNotifyWhileDragging(boolean z) {
        this.C = z;
    }

    public T getAbsoluteMinValue() {
        return this.f;
    }

    public T getAbsoluteMaxValue() {
        return this.g;
    }

    private T a(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19e465c3b2a571b4cbed61b3f9b03494", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19e465c3b2a571b4cbed61b3f9b03494") : (T) this.i.a(Math.max(this.j, Math.min(this.k, Math.round(t.doubleValue() / this.l) * this.l)));
    }

    private double a(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76f97e6f4da00b45969db10603f97b4c", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76f97e6f4da00b45969db10603f97b4c")).doubleValue();
        }
        if (h.d(Double.valueOf(this.A), Double.valueOf(0.0d))) {
            d2 = Math.round(d2 / this.A) * this.A;
        }
        return Math.max(this.j, Math.min(this.k, d2));
    }

    public T getSelectedMinValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30e702a83139d25bd54704eabd9e095a", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30e702a83139d25bd54704eabd9e095a") : a((RangeSeekBar<T>) b(this.m));
    }

    public void setSelectedMinValue(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8743fab38aa8e5bd42355d12b3f34440", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8743fab38aa8e5bd42355d12b3f34440");
        } else if (0.0d == this.k - this.j) {
            setNormalizedMinValue(0.0d);
        } else {
            setNormalizedMinValue(c((RangeSeekBar<T>) t));
        }
    }

    public T getSelectedMaxValue() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd2c1cb2c83626cb1b565e066a95ae43", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd2c1cb2c83626cb1b565e066a95ae43") : a((RangeSeekBar<T>) b(this.n));
    }

    public void setSelectedMaxValue(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7ce119f6dde10f6372a5122c2033db27", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7ce119f6dde10f6372a5122c2033db27");
        } else if (0.0d == this.k - this.j) {
            setNormalizedMaxValue(1.0d);
        } else {
            setNormalizedMaxValue(c((RangeSeekBar<T>) t));
        }
    }

    public void setOnRangeSeekBarChangeListener(b<T> bVar) {
        this.D = bVar;
    }

    public void setThumbShadowPath(Path path) {
        this.ai = path;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        c cVar;
        double d2;
        double d3;
        double d4;
        double d5;
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6bcb73c08d3dc690c3d45b347b55ab4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6bcb73c08d3dc690c3d45b347b55ab4")).booleanValue();
        }
        if (isEnabled()) {
            c cVar2 = null;
            switch (motionEvent.getAction() & 255) {
                case 0:
                    this.F = motionEvent.getPointerId(motionEvent.getPointerCount() - 1);
                    this.E = motionEvent.getX(motionEvent.findPointerIndex(this.F));
                    float f = this.E;
                    Object[] objArr2 = {Float.valueOf(f)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f10d04e59a2d400540a6d0a07d3fcbb", RobustBitConfig.DEFAULT_VALUE)) {
                        cVar = (c) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f10d04e59a2d400540a6d0a07d3fcbb");
                    } else {
                        boolean a2 = a(f, this.m);
                        boolean a3 = a(f, this.n);
                        if (a2 && a3) {
                            cVar2 = f / ((float) getWidth()) > 0.5f ? c.MIN : c.MAX;
                        } else if (a2) {
                            cVar2 = c.MIN;
                        } else if (a3) {
                            cVar2 = c.MAX;
                        }
                        cVar = cVar2;
                    }
                    this.B = cVar;
                    if (this.B == null) {
                        return super.onTouchEvent(motionEvent);
                    }
                    setPressed(true);
                    invalidate();
                    this.H = true;
                    a(motionEvent);
                    d();
                    break;
                case 1:
                    if (this.H) {
                        a(motionEvent);
                        this.H = false;
                        setPressed(false);
                    } else {
                        this.H = true;
                        a(motionEvent);
                        this.H = false;
                    }
                    this.B = null;
                    invalidate();
                    if (this.D != null) {
                        if (this.z) {
                            d2 = a(c(this.m));
                            d3 = a(c(this.n));
                        } else {
                            d2 = 0.0d;
                            d3 = 0.0d;
                        }
                        this.D.a(this, getSelectedMinValue(), getSelectedMaxValue(), d2, d3);
                        break;
                    }
                    break;
                case 2:
                    if (this.B != null) {
                        if (this.H) {
                            a(motionEvent);
                        } else if (Math.abs(motionEvent.getX(motionEvent.findPointerIndex(this.F)) - this.E) > this.G) {
                            setPressed(true);
                            invalidate();
                            this.H = true;
                            a(motionEvent);
                            d();
                        }
                        if (this.C && this.D != null) {
                            if (this.z) {
                                d4 = a(c(this.m));
                                d5 = a(c(this.n));
                            } else {
                                d4 = 0.0d;
                                d5 = 0.0d;
                            }
                            this.D.a(this, getSelectedMinValue(), getSelectedMaxValue(), d4, d5);
                            break;
                        }
                    }
                    break;
                case 3:
                    if (this.H) {
                        this.H = false;
                        setPressed(false);
                    }
                    invalidate();
                    break;
                case 5:
                    int pointerCount = motionEvent.getPointerCount() - 1;
                    this.E = motionEvent.getX(pointerCount);
                    this.F = motionEvent.getPointerId(pointerCount);
                    invalidate();
                    break;
                case 6:
                    Object[] objArr3 = {motionEvent};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "557927dff05e5781597e3c92efb49a36", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "557927dff05e5781597e3c92efb49a36");
                    } else {
                        int action = (motionEvent.getAction() & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8;
                        if (motionEvent.getPointerId(action) == this.F) {
                            int i = action == 0 ? 1 : 0;
                            this.E = motionEvent.getX(i);
                            this.F = motionEvent.getPointerId(i);
                        }
                    }
                    invalidate();
                    break;
            }
            return true;
        }
        return false;
    }

    private void a(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "477e7bb209b97b7e2750a2b10f21395d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "477e7bb209b97b7e2750a2b10f21395d");
            return;
        }
        float x = motionEvent.getX(motionEvent.findPointerIndex(this.F));
        if (c.MIN.equals(this.B) && !this.N) {
            setNormalizedMinValue(a(x));
        } else if (c.MAX.equals(this.B)) {
            setNormalizedMaxValue(a(x));
        }
    }

    private void d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98236ebf93b18dc9280b1c5a1e330748", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98236ebf93b18dc9280b1c5a1e330748");
        } else if (getParent() != null) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "316e3c2f6877ec4a857980ba72c6ced2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "316e3c2f6877ec4a857980ba72c6ced2");
            return;
        }
        int size = View.MeasureSpec.getMode(i) != 0 ? View.MeasureSpec.getSize(i) : 200;
        int height = this.r.getHeight() + (!this.Q ? 0 : this.J + this.L + this.K) + (this.ae ? this.ag + this.ah : 0);
        if (View.MeasureSpec.getMode(i2) != 0) {
            height = Math.min(height, View.MeasureSpec.getSize(i2));
        }
        setMeasuredDimension(size, height);
    }

    @Override // android.widget.ImageView, android.view.View
    public synchronized void onDraw(@NonNull Canvas canvas) {
        float f;
        String str;
        boolean z = true;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "151ba1253010cf46d5850235ca175bf6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "151ba1253010cf46d5850235ca175bf6");
            return;
        }
        super.onDraw(canvas);
        this.p.setTextSize(this.J);
        this.p.setStyle(Paint.Style.FILL);
        this.p.setColor(this.T);
        this.p.setAntiAlias(true);
        if (this.P) {
            f = Math.max(this.p.measureText(this.aa), this.p.measureText(this.ab));
            float f2 = this.I + this.x + (this.J / 3);
            canvas.drawText(this.aa, 0.0f, f2, this.p);
            canvas.drawText(this.ab, getWidth() - f, f2, this.p);
        } else {
            f = 0.0f;
        }
        this.y = this.R + f + this.w;
        this.M.left = this.y;
        this.M.right = getWidth() - this.y;
        canvas.drawRect(this.M, this.p);
        if (this.m > this.o || this.n < 1.0d - this.o) {
            z = false;
        }
        int i = (this.O || this.al || !z) ? this.S : this.T;
        this.M.left = d(this.m);
        this.M.right = d(this.n);
        this.p.setColor(i);
        canvas.drawRect(this.M, this.p);
        if (!this.N) {
            if (this.ae) {
                a(d(this.m), canvas);
            }
            a(d(this.m), c.MIN.equals(this.B), canvas, z);
        }
        if (this.ae) {
            a(d(this.n), canvas);
        }
        a(d(this.n), c.MAX.equals(this.B), canvas, z);
        if (this.Q && (this.al || !z)) {
            this.p.setTextSize(this.J);
            this.p.setColor(this.U);
            String b2 = b((RangeSeekBar<T>) getSelectedMinValue());
            T selectedMaxValue = getSelectedMaxValue();
            String b3 = b((RangeSeekBar<T>) selectedMaxValue);
            if (this.ac && h.e(Double.valueOf(selectedMaxValue.doubleValue()), Double.valueOf(this.g.doubleValue()))) {
                b3 = b3 + this.ad;
            }
            float measureText = this.p.measureText(b2);
            float measureText2 = this.p.measureText(b3);
            float max = Math.max(0.0f, d(this.m) - (measureText * 0.5f));
            float min = Math.min(getWidth() - measureText2, d(this.n) - (measureText2 * 0.5f));
            if (this.N) {
                str = b3;
            } else {
                float a2 = ((measureText + max) - min) + com.sankuai.waimai.platform.widget.filterbar.view.view.rangeseekbar.a.a(getContext(), 3);
                if (a2 > 0.0f) {
                    double d2 = a2;
                    str = b3;
                    max = (float) (max - ((this.m * d2) / ((this.m + 1.0d) - this.n)));
                    min = (float) (min + ((d2 * (1.0d - this.n)) / ((this.m + 1.0d) - this.n)));
                } else {
                    str = b3;
                }
                canvas.drawText(b2, max, this.K + this.J, this.p);
            }
            canvas.drawText(str, min, this.K + this.J, this.p);
        }
    }

    private String b(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "234b420f204dde24d407ca218160c5ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "234b420f204dde24d407ca218160c5ec");
        }
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.V)) {
            sb.append(this.V);
        }
        sb.append(String.valueOf(t));
        if (!TextUtils.isEmpty(this.W)) {
            sb.append(this.W);
        }
        return sb.toString();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "34fbb648840bb27555565ca4bbd0fbc8", RobustBitConfig.DEFAULT_VALUE)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "34fbb648840bb27555565ca4bbd0fbc8");
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("SUPER", super.onSaveInstanceState());
        bundle.putDouble("MIN", this.m);
        bundle.putDouble("MAX", this.n);
        bundle.putString("mMinLabel", this.aa);
        bundle.putString("mMaxLabel", this.ab);
        return bundle;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13a76ca7a350d1c7f56a6d9da370f58f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13a76ca7a350d1c7f56a6d9da370f58f");
            return;
        }
        Bundle bundle = (Bundle) parcelable;
        super.onRestoreInstanceState(bundle.getParcelable("SUPER"));
        this.m = bundle.getDouble("MIN");
        this.n = bundle.getDouble("MAX");
        this.aa = bundle.getString("mMinLabel");
        this.ab = bundle.getString("mMaxLabel");
    }

    private void a(float f, boolean z, Canvas canvas, boolean z2) {
        Bitmap bitmap;
        Object[] objArr = {Float.valueOf(f), Byte.valueOf(z ? (byte) 1 : (byte) 0), canvas, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cdfae9930b67f9a38627e026473ca30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cdfae9930b67f9a38627e026473ca30");
            return;
        }
        if (!this.al && z2) {
            bitmap = this.t;
        } else {
            bitmap = z ? this.s : this.r;
        }
        canvas.drawBitmap(bitmap, f - this.w, this.I, this.p);
    }

    private void a(float f, Canvas canvas) {
        Object[] objArr = {Float.valueOf(f), canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d73d9f651ac103f6adff6d9231e7609", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d73d9f651ac103f6adff6d9231e7609");
            return;
        }
        this.ak.setTranslate(f + this.af, this.I + this.x + this.ag);
        this.aj.set(this.ai);
        this.aj.transform(this.ak);
        canvas.drawPath(this.aj, this.q);
    }

    private boolean a(float f, double d2) {
        Object[] objArr = {Float.valueOf(f), Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1768f35c02ba46bdf3e954b56df81ac", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1768f35c02ba46bdf3e954b56df81ac")).booleanValue() : Math.abs(f - d(d2)) <= this.w;
    }

    private void setNormalizedMinValue(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f8f8446f66c219916cc0544dcfaab7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f8f8446f66c219916cc0544dcfaab7");
            return;
        }
        this.m = Math.max(0.0d, Math.min(1.0d, Math.min(d2, this.n)));
        invalidate();
    }

    private void setNormalizedMaxValue(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd024f700557aed9762e943e9c48d111", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd024f700557aed9762e943e9c48d111");
            return;
        }
        this.n = Math.max(0.0d, Math.min(1.0d, Math.max(d2, this.m)));
        invalidate();
    }

    private T b(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbfb08f054cbf10c88d207d4ecf31a4c", RobustBitConfig.DEFAULT_VALUE) ? (T) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbfb08f054cbf10c88d207d4ecf31a4c") : (T) this.i.a(Math.round((this.j + (d2 * (this.k - this.j))) * 100.0d) / 100.0d);
    }

    private double c(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6514d74fc92d07ac4ea025106e5c183", RobustBitConfig.DEFAULT_VALUE) ? ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6514d74fc92d07ac4ea025106e5c183")).doubleValue() : Math.round((this.j + (d2 * (this.k - this.j))) * 100.0d) / 100.0d;
    }

    private double c(T t) {
        Object[] objArr = {t};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08053f427d67bbc24b0f68d5bfa31c34", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08053f427d67bbc24b0f68d5bfa31c34")).doubleValue();
        }
        if (0.0d == this.k - this.j) {
            return 0.0d;
        }
        return (t.doubleValue() - this.j) / (this.k - this.j);
    }

    private float d(double d2) {
        Object[] objArr = {Double.valueOf(d2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632e11332324706b15e266372de05d30", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632e11332324706b15e266372de05d30")).floatValue() : (float) (this.y + (d2 * (getWidth() - (this.y * 2.0f))));
    }

    private double a(float f) {
        float width;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60ffffa40af9c6d2d333ab2dbe910bfe", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Double) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60ffffa40af9c6d2d333ab2dbe910bfe")).doubleValue();
        }
        if (getWidth() <= this.y * 2.0f) {
            return 0.0d;
        }
        return Math.min(1.0d, Math.max(0.0d, (f - this.y) / (width - (this.y * 2.0f))));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum c {
        MIN,
        MAX;
        
        public static ChangeQuickRedirect a;

        c() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc90c295b175aeabb8525ac71f22c431", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc90c295b175aeabb8525ac71f22c431");
            }
        }

        public static c valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "72b9d5d9421083ef0b970fc7b9339cbf", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "72b9d5d9421083ef0b970fc7b9339cbf") : (c) Enum.valueOf(c.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static c[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "549d8dd7a1bb72c1102f1b0a575f9b1b", RobustBitConfig.DEFAULT_VALUE) ? (c[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "549d8dd7a1bb72c1102f1b0a575f9b1b") : (c[]) values().clone();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public enum a {
        LONG,
        DOUBLE,
        INTEGER,
        FLOAT,
        SHORT,
        BYTE,
        BIG_DECIMAL;
        
        public static ChangeQuickRedirect a;

        a() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eec65d2af4f0f7a4c366357a8e11b102", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eec65d2af4f0f7a4c366357a8e11b102");
            }
        }

        public static a valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b21706c28a8a9bd5d60e379d2df07830", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b21706c28a8a9bd5d60e379d2df07830") : (a) Enum.valueOf(a.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static a[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "462193dff2f196cdd73cf88be7ff7979", RobustBitConfig.DEFAULT_VALUE) ? (a[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "462193dff2f196cdd73cf88be7ff7979") : (a[]) values().clone();
        }

        public static <E extends Number> a a(E e) throws IllegalArgumentException {
            Object[] objArr = {e};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9bbe1e6b815e75cb972f18cf73ee291e", RobustBitConfig.DEFAULT_VALUE)) {
                return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9bbe1e6b815e75cb972f18cf73ee291e");
            }
            if (e instanceof Long) {
                return LONG;
            }
            if (e instanceof Double) {
                return DOUBLE;
            }
            if (e instanceof Integer) {
                return INTEGER;
            }
            if (e instanceof Float) {
                return FLOAT;
            }
            if (e instanceof Short) {
                return SHORT;
            }
            if (e instanceof Byte) {
                return BYTE;
            }
            if (e instanceof BigDecimal) {
                return BIG_DECIMAL;
            }
            throw new IllegalArgumentException("Number class '" + e.getClass().getName() + "' is not supported");
        }

        public final Number a(double d) {
            Object[] objArr = {Double.valueOf(d)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fdd70746f7bdb45b00331ad6db953324", RobustBitConfig.DEFAULT_VALUE)) {
                return (Number) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fdd70746f7bdb45b00331ad6db953324");
            }
            switch (this) {
                case LONG:
                    return Long.valueOf((long) d);
                case DOUBLE:
                    return Double.valueOf(d);
                case INTEGER:
                    return Integer.valueOf((int) d);
                case FLOAT:
                    return Float.valueOf((float) d);
                case SHORT:
                    return Short.valueOf((short) d);
                case BYTE:
                    return Byte.valueOf((byte) d);
                case BIG_DECIMAL:
                    return BigDecimal.valueOf(d);
                default:
                    throw new InstantiationError("can't convert " + this + " to a Number object");
            }
        }
    }
}
