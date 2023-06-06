package com.meituan.android.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.hotel.android.hplus.diagnoseTool.DiagnoseLog;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class RatingLinearGradientBar extends View {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private Drawable d;
    private int e;
    private int f;
    private int g;
    private Bitmap h;
    private float i;
    private int j;
    private float k;
    private float l;
    private float m;

    public RatingLinearGradientBar(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1d56c545956eb2a4bdeddedc118e4a6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1d56c545956eb2a4bdeddedc118e4a6");
        }
    }

    private RatingLinearGradientBar(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f9bd9ceb21e9551f793457f86d97fe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f9bd9ceb21e9551f793457f86d97fe3");
        }
    }

    public RatingLinearGradientBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArray;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6826e1604de88cadb7e25dff23835fa9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6826e1604de88cadb7e25dff23835fa9");
            return;
        }
        this.b = Color.parseColor("#FFD161");
        this.c = Color.parseColor("#FFB216");
        this.m = 0.0f;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1deae4d6714a67465998c0ecd022cbff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1deae4d6714a67465998c0ecd022cbff");
        } else {
            try {
                typedArray = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.startColor, R.attr.elementBackgroundColor, R.attr.elementDrawable, R.attr.endColor, R.attr.maxStarsCount, R.attr.numStarsCount, R.attr.elementWidth, R.attr.elementHeight, R.attr.elementPadding});
                try {
                    this.e = typedArray.getColor(0, -1);
                    this.f = typedArray.getColor(3, -1);
                    this.g = typedArray.getColor(1, Color.parseColor(DiagnoseLog.GRAY));
                    this.d = typedArray.getDrawable(2);
                    this.i = typedArray.getFloat(5, 0.0f);
                    this.j = typedArray.getInteger(4, 5);
                    this.k = typedArray.getDimension(6, 0.0f);
                    this.l = typedArray.getDimension(7, 0.0f);
                    this.m = typedArray.getDimension(8, 0.0f);
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                } catch (Throwable th) {
                    th = th;
                    if (typedArray != null) {
                        typedArray.recycle();
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                typedArray = null;
            }
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ec21039ab11f0bf1bc786702d5fd68b5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ec21039ab11f0bf1bc786702d5fd68b5");
            return;
        }
        if (this.d != null) {
            this.h = ((BitmapDrawable) this.d).getBitmap();
        }
        if (this.h != null) {
            if (this.k == 0.0f) {
                this.k = this.h.getWidth();
            }
            if (this.l == 0.0f) {
                this.l = this.h.getHeight();
            }
        }
        if (this.e == -1) {
            this.e = this.b;
        }
        if (this.f == -1) {
            this.f = this.c;
        }
    }

    public void setStartColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9820cecfb4185fbe950a005912415c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9820cecfb4185fbe950a005912415c1c");
            return;
        }
        this.e = i;
        postInvalidate();
    }

    public void setEndColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f58c662272b78142e2ab745409c38c3a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f58c662272b78142e2ab745409c38c3a");
            return;
        }
        this.f = i;
        postInvalidate();
    }

    public void setNumStars(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85a5550b86998cd1eb70090dc6db6286", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85a5550b86998cd1eb70090dc6db6286");
            return;
        }
        this.i = f;
        postInvalidate();
    }

    public void setMaxStarsCount(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "185cd76fec4fb8d7631b2ca17f89d3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "185cd76fec4fb8d7631b2ca17f89d3c4");
        } else if (i <= 0) {
            throw new IllegalArgumentException("unsupport maxStarsCount <=0");
        } else {
            this.j = i;
            postInvalidate();
        }
    }

    public void setElementDrawable(Drawable drawable) {
        Object[] objArr = {drawable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c86ed9ed5844a2aa65446cebfafbf9e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c86ed9ed5844a2aa65446cebfafbf9e6");
            return;
        }
        this.d = drawable;
        postInvalidate();
    }

    public void setElementWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c4ed719399fd0c5de7e0ec049c6e4a31", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c4ed719399fd0c5de7e0ec049c6e4a31");
            return;
        }
        this.k = f;
        postInvalidate();
    }

    public void setElementHeight(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaec3383ee34be830de784078d7e67ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaec3383ee34be830de784078d7e67ca");
            return;
        }
        this.l = f;
        postInvalidate();
    }

    public void setElementBackgroundColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60467cfa736720155a321fd932be0db3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60467cfa736720155a321fd932be0db3");
            return;
        }
        this.g = i;
        postInvalidate();
    }

    public void setElementPadding(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700006d72bdb2bb3590903f550e35d73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700006d72bdb2bb3590903f550e35d73");
            return;
        }
        this.m = f;
        postInvalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Bitmap createBitmap;
        Bitmap createBitmap2;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c6fd95d6c9f5d154ec721203af4f398", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c6fd95d6c9f5d154ec721203af4f398");
            return;
        }
        super.onDraw(canvas);
        if (this.h == null) {
            return;
        }
        canvas.save();
        canvas.translate(getPaddingLeft(), ((int) ((((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - this.l) / 2.0f)) + getPaddingTop());
        Object[] objArr2 = {canvas};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "020772954641e292ec7189208863172f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "020772954641e292ec7189208863172f");
        } else {
            canvas.save();
            canvas.clipRect(getSelectedClipRect());
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = a;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c595de90fec876a26f3623781f5b06b", RobustBitConfig.DEFAULT_VALUE)) {
                createBitmap = (Bitmap) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c595de90fec876a26f3623781f5b06b");
            } else {
                createBitmap = Bitmap.createBitmap((int) b(), (int) this.l, Bitmap.Config.ARGB_8888);
                Canvas canvas2 = new Canvas(createBitmap);
                LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, b(), this.l, this.e, this.f, Shader.TileMode.REPEAT);
                Paint paint = new Paint();
                paint.setAntiAlias(true);
                paint.setShader(linearGradient);
                canvas2.drawRect(new RectF(0.0f, 0.0f, b(), this.l), paint);
            }
            Paint paint2 = new Paint();
            paint2.setAntiAlias(true);
            a(canvas, paint2);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createBitmap, new Matrix(), paint2);
            canvas.restore();
        }
        Object[] objArr4 = {canvas};
        ChangeQuickRedirect changeQuickRedirect4 = a;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "83ba3c2fdac6b0780f47f7d337ff259c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "83ba3c2fdac6b0780f47f7d337ff259c");
        } else {
            canvas.save();
            canvas.clipRect(getUnSelectedClipRect());
            Object[] objArr5 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect5 = a;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "df1b0a7d7e5695528b54e37212466caf", RobustBitConfig.DEFAULT_VALUE)) {
                createBitmap2 = (Bitmap) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "df1b0a7d7e5695528b54e37212466caf");
            } else {
                createBitmap2 = Bitmap.createBitmap((int) b(), (int) this.l, Bitmap.Config.ARGB_8888);
                Canvas canvas3 = new Canvas(createBitmap2);
                Paint paint3 = new Paint();
                paint3.setAntiAlias(true);
                paint3.setColor(this.g);
                canvas3.drawRect(new RectF(0.0f, 0.0f, b(), this.l), paint3);
            }
            Paint paint4 = new Paint();
            paint4.setAntiAlias(true);
            a(canvas, paint4);
            paint4.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
            canvas.drawBitmap(createBitmap2, new Matrix(), paint4);
            canvas.restore();
        }
        canvas.restore();
        setLayerType(1, null);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingBottom;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82c5cf8beb15553eb1cb462b570d6e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82c5cf8beb15553eb1cb462b570d6e91");
            return;
        }
        Object[] objArr2 = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56e787528775a259f71dfa38f6b884da", RobustBitConfig.DEFAULT_VALUE)) {
            paddingLeft = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56e787528775a259f71dfa38f6b884da")).intValue();
        } else {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode == 1073741824) {
                paddingLeft = size;
            } else {
                paddingLeft = (mode == Integer.MIN_VALUE || mode == 0) ? (int) (getPaddingLeft() + getPaddingRight() + b()) : 0;
            }
        }
        int i3 = paddingLeft;
        Object[] objArr3 = {Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect3 = a;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "fb6bae655700e3b943a0b1216d4bbda4", RobustBitConfig.DEFAULT_VALUE)) {
            paddingBottom = ((Integer) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "fb6bae655700e3b943a0b1216d4bbda4")).intValue();
        } else {
            int mode2 = View.MeasureSpec.getMode(i2);
            int size2 = View.MeasureSpec.getSize(i2);
            if (mode2 == 1073741824) {
                paddingBottom = size2;
            } else {
                paddingBottom = (mode2 == Integer.MIN_VALUE || mode2 == 0) ? (int) (getPaddingBottom() + getPaddingTop() + this.l) : 0;
            }
        }
        setMeasuredDimension(i3, paddingBottom);
    }

    private void a(Canvas canvas, Paint paint) {
        Object[] objArr = {canvas, paint};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7def0823f5fbde986bfe58e1a386ec8b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7def0823f5fbde986bfe58e1a386ec8b");
            return;
        }
        Rect rect = new Rect(0, 0, this.h.getWidth(), this.h.getHeight());
        RectF rectF = new RectF();
        for (int i = 0; i < this.j; i++) {
            float f = i * (this.k + this.m);
            rectF.set(f, 0.0f, this.k + f, this.l);
            canvas.drawBitmap(this.h, rect, rectF, paint);
        }
    }

    private float a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d7a545f8285aef4ff420ccadd0b8f3fc", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d7a545f8285aef4ff420ccadd0b8f3fc")).floatValue() : (float) ((this.k * this.i) + (this.m * Math.floor(this.i)));
    }

    private RectF getSelectedClipRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c628e0526ebf8f399adb93f93bba174", RobustBitConfig.DEFAULT_VALUE) ? (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c628e0526ebf8f399adb93f93bba174") : new RectF(0.0f, 0.0f, a(), this.l);
    }

    private RectF getUnSelectedClipRect() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "07ef6c6cfd958a640d7235931d959805", RobustBitConfig.DEFAULT_VALUE) ? (RectF) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "07ef6c6cfd958a640d7235931d959805") : new RectF(a(), 0.0f, b(), this.l);
    }

    private float b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62e1c2705b3a65a4bbf79c12cb6eecf2", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62e1c2705b3a65a4bbf79c12cb6eecf2")).floatValue() : (this.k * this.j) + (this.m * (this.j - 1));
    }
}
