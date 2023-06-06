package com.meituan.roodesign.widgets.carousel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.annotation.AttrRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.annotation.StyleRes;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RooIndicatorView extends View {
    public static ChangeQuickRedirect a = null;
    @StyleRes
    private static final int b = 2131559114;
    @AttrRes
    private static final int c = 2130772172;
    private float d;
    private float e;
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private int k;
    private int l;
    private int m;
    private Drawable n;
    private Drawable o;
    private Paint p;
    private Paint q;

    /* compiled from: ProGuard */
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes3.dex */
    public @interface IndicatorOrientation {
    }

    public RooIndicatorView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "214deefb0ff06704fd3586727925e6f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "214deefb0ff06704fd3586727925e6f6");
        }
    }

    public RooIndicatorView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb754ef0fd6a5dabc2a71ae8cbb9de29", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb754ef0fd6a5dabc2a71ae8cbb9de29");
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.indicatorBackground, R.attr.indicatorCount, R.attr.indicatorHeight, R.attr.indicatorOrientation, R.attr.indicatorSelected, R.attr.indicatorSelectedBackground, R.attr.indicatorSelectedHeight, R.attr.indicatorSelectedWidth, R.attr.indicatorSpace, R.attr.indicatorWidth}, i, b);
        Object[] objArr2 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "655362e4360628bbbe0fe2386dbcd591", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "655362e4360628bbbe0fe2386dbcd591");
        } else {
            this.f = obtainStyledAttributes.getDimension(9, 4.0f);
            this.g = obtainStyledAttributes.getDimension(2, 4.0f);
            this.h = obtainStyledAttributes.getDimension(7, this.f);
            this.i = obtainStyledAttributes.getDimension(6, this.g);
            this.j = obtainStyledAttributes.getDimension(8, 4.0f);
            this.k = obtainStyledAttributes.getInt(3, 0);
            this.l = obtainStyledAttributes.getInt(1, 1);
            this.m = obtainStyledAttributes.getInt(4, 0);
            this.n = obtainStyledAttributes.getDrawable(0);
            this.o = obtainStyledAttributes.getDrawable(5);
        }
        obtainStyledAttributes.recycle();
        a();
        b();
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "94c684e77c73a38fc093afa237bb13b7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "94c684e77c73a38fc093afa237bb13b7");
        } else if (this.n instanceof ColorDrawable) {
            this.p = new Paint();
            this.p.setAntiAlias(true);
            this.p.setColor(((ColorDrawable) this.n).getColor());
            this.p.setAntiAlias(true);
        } else {
            this.p = null;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b31e64bc2d8942cc9b5176fa3404cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b31e64bc2d8942cc9b5176fa3404cbc");
        } else if (this.o instanceof ColorDrawable) {
            this.q = new Paint();
            this.q.setColor(((ColorDrawable) this.o).getColor());
            this.q.setAntiAlias(true);
        } else {
            this.q = null;
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa6617857fabf3cf8b183a2558189ab1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa6617857fabf3cf8b183a2558189ab1");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.d = getDefaultSize(getSuggestedMinimumWidth(), i);
        if (mode == Integer.MIN_VALUE) {
            this.d = ((this.f + this.j) * (this.l - 1)) + this.h;
        }
        this.e = getDefaultSize(getSuggestedMinimumHeight(), i2);
        if (mode2 == Integer.MIN_VALUE) {
            this.e = Math.max(this.g, this.i);
        }
        setMeasuredDimension((int) this.d, (int) this.e);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e408a8f8f4211058b95b09f5daaa6195", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e408a8f8f4211058b95b09f5daaa6195");
            return;
        }
        super.onDraw(canvas);
        int i = this.k;
        a(canvas);
    }

    private void a(Canvas canvas) {
        int i = 0;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0aa1fb6d9072676d0da546b7d2df87f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0aa1fb6d9072676d0da546b7d2df87f");
        } else if (this.l <= 0) {
        } else {
            while (i < this.l) {
                Paint paint = i == this.m ? this.q : this.p;
                if (paint != null) {
                    float f = this.f / 2.0f;
                    float f2 = (this.f / 2.0f) + ((this.j + this.f) * i);
                    float f3 = this.e / 2.0f;
                    if (i == this.m) {
                        f = this.h / 2.0f;
                        f2 += (this.h - this.f) / 2.0f;
                    } else if (i > this.m) {
                        f2 += this.h - this.f;
                    }
                    canvas.drawCircle(f2, f3, f, paint);
                } else {
                    Drawable drawable = i == this.m ? this.o : this.n;
                    float f4 = (this.f + this.j) * i;
                    float f5 = (this.e - this.g) / 2.0f;
                    float f6 = this.f + f4;
                    float f7 = this.g + f5;
                    if (i == this.m) {
                        f5 = (this.e - this.i) / 2.0f;
                        f6 = f4 + this.h;
                        f7 = f5 + this.i;
                    } else if (i > this.m) {
                        f4 += this.h - this.f;
                        f6 = f4 + this.f;
                    }
                    canvas.drawBitmap(((BitmapDrawable) drawable).getBitmap(), (Rect) null, new RectF(f4, f5, f6, f7), (Paint) null);
                }
                i++;
            }
        }
    }

    public void setIndicatorWidth(float f) {
        this.f = f;
    }

    public void setIndicatorHeight(float f) {
        this.g = f;
    }

    public void setIndicatorSelectedWidth(float f) {
        this.h = f;
    }

    public void setIndicatorSelectedHeight(float f) {
        this.i = f;
    }

    public void setIndicatorSpace(float f) {
        this.j = f;
    }

    public void setIndicatorOrientation(int i) {
        this.k = i;
    }

    public void setIndicatorCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ff56c8bef3ef3bc1e8aca0b73e6dbb0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ff56c8bef3ef3bc1e8aca0b73e6dbb0");
        } else {
            a(i, true);
        }
    }

    public void setIndicatorSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5387c6f5a6f130a3cb6356a26e71bf8e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5387c6f5a6f130a3cb6356a26e71bf8e");
        } else {
            b(i, true);
        }
    }

    public final void a(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a7706d59bc7695520ce1095955c6736", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a7706d59bc7695520ce1095955c6736");
        } else if (i < 0) {
        } else {
            this.l = i;
            if (z) {
                invalidate();
            }
        }
    }

    public final void b(int i, boolean z) {
        Object[] objArr = {Integer.valueOf(i), Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66e013bbfb30ba5ba560987fa88018c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66e013bbfb30ba5ba560987fa88018c0");
        } else if (i < 0 || i > this.l) {
        } else {
            this.m = i;
            if (z) {
                invalidate();
            }
        }
    }

    public void setIndicatorBg(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08fa7ebdf6312e63923ef0bd01f5758c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08fa7ebdf6312e63923ef0bd01f5758c");
            return;
        }
        this.n = drawable;
        a();
    }

    public void setIndicatorSelectedBg(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7f9ebf02c9be866d9af67eb43ed00d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7f9ebf02c9be866d9af67eb43ed00d8");
            return;
        }
        this.o = drawable;
        b();
    }
}
