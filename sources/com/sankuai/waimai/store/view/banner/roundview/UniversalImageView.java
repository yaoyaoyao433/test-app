package com.sankuai.waimai.store.view.banner.roundview;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.FloatRange;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatImageView;
import android.util.AttributeSet;
import android.util.StateSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.log.a;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.g;
import com.squareup.picasso.PicassoGifDrawable;
import java.util.Arrays;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class UniversalImageView extends AppCompatImageView {
    public static ChangeQuickRedirect b;
    private final RectF a;
    private final Path c;
    private final float[] d;
    private final Paint e;
    private int f;
    private final Paint g;
    private float h;
    private final Paint i;
    private int j;
    private boolean k;
    private float l;
    private final ArgbEvaluator m;
    private int n;
    private int o;
    private boolean p;

    public UniversalImageView(Context context, @ColorInt int i, float f, float f2) {
        this(context);
        Object[] objArr = {context, Integer.valueOf(i), Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6f015d1746fdeb3589b8a8a60cb56f3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6f015d1746fdeb3589b8a8a60cb56f3");
            return;
        }
        this.f = i;
        this.h = f;
        Arrays.fill(this.d, f2);
    }

    public UniversalImageView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "52212e6b29089b27f84cf0ec929fe385", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "52212e6b29089b27f84cf0ec929fe385");
        }
    }

    public UniversalImageView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5da439a27e4099547e33d145807ea318", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5da439a27e4099547e33d145807ea318");
        }
    }

    public UniversalImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray obtainStyledAttributes;
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e80ac443f704d101f1ffb9f9a0cb6cb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e80ac443f704d101f1ffb9f9a0cb6cb");
            return;
        }
        this.a = new RectF();
        this.c = new Path();
        this.d = new float[8];
        this.f = 0;
        this.m = new ArgbEvaluator();
        this.p = true;
        this.e = d();
        this.g = d();
        this.g.setStyle(Paint.Style.STROKE);
        this.i = d();
        this.i.setStyle(Paint.Style.FILL_AND_STROKE);
        if (attributeSet == null || (obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{R.attr.riv_corner_radius, R.attr.riv_corner_radius_top_left, R.attr.riv_corner_radius_top_right, R.attr.riv_corner_radius_bottom_left, R.attr.riv_corner_radius_bottom_right, R.attr.riv_border_width, R.attr.riv_border_color, R.attr.riv_oval, R.attr.riv_background_color, R.attr.riv_aspect_ratio, R.attr.riv_start_color, R.attr.riv_end_color}, i, 0)) == null) {
            return;
        }
        this.l = obtainStyledAttributes.getFloat(9, -1.0f);
        this.n = obtainStyledAttributes.getColor(10, Integer.MIN_VALUE);
        this.o = obtainStyledAttributes.getColor(11, Integer.MIN_VALUE);
        a(obtainStyledAttributes);
        Object[] objArr2 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04ecc77c9238a1d70b7bd27008b8a566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04ecc77c9238a1d70b7bd27008b8a566");
        } else if (obtainStyledAttributes != null) {
            ColorStateList colorStateList = obtainStyledAttributes.getColorStateList(6);
            this.f = (colorStateList == null ? ColorStateList.valueOf(0) : colorStateList).getColorForState(StateSet.WILD_CARD, 0);
        }
        Object[] objArr3 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "60404194d7b9dca0b680c66206eb95ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "60404194d7b9dca0b680c66206eb95ba");
        } else if (obtainStyledAttributes != null) {
            this.h = obtainStyledAttributes.getDimension(5, 0.0f);
            this.k = obtainStyledAttributes.getBoolean(7, false);
        }
        Object[] objArr4 = {obtainStyledAttributes};
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "fee737809441ae10118de17a34196951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "fee737809441ae10118de17a34196951");
        } else if (obtainStyledAttributes != null) {
            ColorStateList colorStateList2 = obtainStyledAttributes.getColorStateList(8);
            this.j = (colorStateList2 == null ? ColorStateList.valueOf(0) : colorStateList2).getColorForState(StateSet.WILD_CARD, 0);
        }
        obtainStyledAttributes.recycle();
    }

    public void setCornerRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b2b75590b7065da6da5fe0d7a8e8d372", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b2b75590b7065da6da5fe0d7a8e8d372");
            return;
        }
        int length = this.d.length;
        for (int i = 0; i < length; i++) {
            this.d[i] = f;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "81b5784615420745a482e83330083c0d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "81b5784615420745a482e83330083c0d");
            return;
        }
        super.onMeasure(i, i2);
        if (this.l > 0.0f) {
            int measuredWidth = getMeasuredWidth();
            super.setMeasuredDimension(measuredWidth, (int) (measuredWidth / this.l));
        }
    }

    private void a(TypedArray typedArray) {
        float f;
        Object[] objArr = {typedArray};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1c975c91ec6ff81d5be9d6da5f4f94a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1c975c91ec6ff81d5be9d6da5f4f94a3");
            return;
        }
        float[] fArr = new float[4];
        if (typedArray != null) {
            f = typedArray.getDimensionPixelSize(0, -1);
            fArr[0] = typedArray.getDimensionPixelSize(1, -1);
            fArr[1] = typedArray.getDimensionPixelSize(2, -1);
            fArr[2] = typedArray.getDimensionPixelSize(4, -1);
            fArr[3] = typedArray.getDimensionPixelSize(3, -1);
        } else {
            f = 0.0f;
        }
        boolean z = false;
        for (int i = 0; i < 4; i++) {
            if (fArr[i] < 0.0f) {
                fArr[i] = 0.0f;
            } else {
                z = true;
            }
        }
        if (!z) {
            float f2 = f >= 0.0f ? f : 0.0f;
            for (int i2 = 0; i2 < 4; i2++) {
                fArr[i2] = f2;
            }
        }
        float[] fArr2 = this.d;
        float[] fArr3 = this.d;
        float f3 = fArr[0];
        fArr3[1] = f3;
        fArr2[0] = f3;
        float[] fArr4 = this.d;
        float[] fArr5 = this.d;
        float f4 = fArr[1];
        fArr5[3] = f4;
        fArr4[2] = f4;
        float[] fArr6 = this.d;
        float[] fArr7 = this.d;
        float f5 = fArr[2];
        fArr7[5] = f5;
        fArr6[4] = f5;
        float[] fArr8 = this.d;
        float[] fArr9 = this.d;
        float f6 = fArr[3];
        fArr9[7] = f6;
        fArr8[6] = f6;
    }

    private Paint d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ec3bf32d311ad07ca211948769acb31a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Paint) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ec3bf32d311ad07ca211948769acb31a");
        }
        Paint paint = new Paint(3);
        paint.setColor(0);
        paint.setAntiAlias(true);
        return paint;
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        boolean z;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fd3cf4407990d0cf7f78badb526c1357", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fd3cf4407990d0cf7f78badb526c1357");
            return;
        }
        try {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = b;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "660a63575ce69d9adabc0d6432cb7ae2", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "660a63575ce69d9adabc0d6432cb7ae2");
            } else if (this.k) {
                float min = Math.min(getMeasuredHeight(), getMeasuredWidth()) * 0.5f;
                Object[] objArr3 = {Float.valueOf(min), Float.valueOf(min), Float.valueOf(min), Float.valueOf(min)};
                ChangeQuickRedirect changeQuickRedirect3 = b;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "c05a397daab6695cb58d0eb24ef762a7", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "c05a397daab6695cb58d0eb24ef762a7")).booleanValue();
                } else {
                    if (g.a(min, this.d[0]) && g.a(min, this.d[6]) && g.a(min, this.d[2]) && g.a(min, this.d[4])) {
                        z = false;
                    }
                    z = true;
                }
                if (z) {
                    float[] fArr = this.d;
                    this.d[1] = min;
                    fArr[0] = min;
                    float[] fArr2 = this.d;
                    this.d[3] = min;
                    fArr2[2] = min;
                    float[] fArr3 = this.d;
                    this.d[5] = min;
                    fArr3[4] = min;
                    float[] fArr4 = this.d;
                    this.d[7] = min;
                    fArr4[6] = min;
                }
            }
            Path path = this.c;
            RectF rectF = this.a;
            float[] fArr5 = this.d;
            Object[] objArr4 = {path, rectF, fArr5};
            ChangeQuickRedirect changeQuickRedirect4 = b;
            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "99aa93565658fb55c14c72d93096956f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "99aa93565658fb55c14c72d93096956f");
            } else {
                path.reset();
                path.addRoundRect(rectF, fArr5, Path.Direction.CW);
                path.close();
            }
            Object[] objArr5 = {canvas};
            ChangeQuickRedirect changeQuickRedirect5 = b;
            if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "df65b136661a528be307d8c8dbd1d994", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "df65b136661a528be307d8c8dbd1d994");
            } else {
                this.i.setColor(this.j);
                canvas.drawPath(this.c, this.i);
            }
            Object[] objArr6 = {canvas};
            ChangeQuickRedirect changeQuickRedirect6 = b;
            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "7fdc2a6825ae778a2c445772f83dabf0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "7fdc2a6825ae778a2c445772f83dabf0");
            } else {
                canvas.clipPath(this.c);
                canvas.drawRect(this.a, this.e);
            }
            super.onDraw(canvas);
            Object[] objArr7 = {canvas};
            ChangeQuickRedirect changeQuickRedirect7 = b;
            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "094e05457e97e73009b1a225a604b632", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "094e05457e97e73009b1a225a604b632");
            } else if (this.h > 0.0f) {
                this.g.setColor(this.f);
                this.g.setStrokeWidth(this.h);
                canvas.drawPath(this.c, this.g);
            }
        } catch (Exception e) {
            a.a(e);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80351576ef6a76556dc108d3db984d00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80351576ef6a76556dc108d3db984d00");
            return;
        }
        super.onSizeChanged(i, i2, i3, i4);
        this.a.set(0.0f, 0.0f, i, i2);
    }

    public void setBorderColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e831905dc47ff9233166dd75e959c7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e831905dc47ff9233166dd75e959c7a");
            return;
        }
        this.f = i;
        invalidate();
    }

    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc2d97054ed7bdbb43b7d2c3b4dee848", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc2d97054ed7bdbb43b7d2c3b4dee848");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable instanceof PicassoGifDrawable) {
            ((PicassoGifDrawable) drawable).start();
        }
    }

    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b8d941f46cf99d91454cf29a2585986", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b8d941f46cf99d91454cf29a2585986");
            return;
        }
        Drawable drawable = getDrawable();
        if (drawable instanceof PicassoGifDrawable) {
            ((PicassoGifDrawable) drawable).stop();
        }
    }

    public final boolean c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a87f87fabb00aa691f06db3c91828c8", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a87f87fabb00aa691f06db3c91828c8")).booleanValue() : getDrawable() instanceof PicassoGifDrawable;
    }

    public void setColorFraction(@FloatRange(from = 0.0d, to = 1.0d) float f) {
        Drawable drawable;
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a272948f85e09bee80b5a2e59bd602cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a272948f85e09bee80b5a2e59bd602cd");
        } else if (!this.p || this.n == Integer.MIN_VALUE || this.o == Integer.MIN_VALUE || (drawable = getDrawable()) == null) {
        } else {
            setImageDrawable(e.a(drawable, ((Integer) this.m.evaluate(f, Integer.valueOf(this.n), Integer.valueOf(this.o))).intValue()));
        }
    }

    public void setNeedChangeColor(boolean z) {
        this.p = z;
    }
}
