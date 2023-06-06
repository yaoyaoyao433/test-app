package com.meituan.android.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.NinePatchDrawable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class UserGrowthView extends View {
    public static ChangeQuickRedirect a;
    public Rect b;
    private a c;
    private int[] d;
    private Drawable[] e;
    private Drawable f;
    private Drawable g;
    private int h;
    private NinePatchDrawable i;
    private NinePatchDrawable j;
    private int k;
    private Drawable l;
    private float m;
    private int n;
    private Paint o;

    public UserGrowthView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35688bd492054c76fc746265b75c3d83", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35688bd492054c76fc746265b75c3d83");
        }
    }

    private UserGrowthView(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.mtUserGrowthViewStyle);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b74b559b270d8883d3e8bd818651888f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b74b559b270d8883d3e8bd818651888f");
        }
    }

    public UserGrowthView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cffb3f81e836003b16440b9a6ffeee8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cffb3f81e836003b16440b9a6ffeee8");
            return;
        }
        this.b = new Rect();
        Resources resources = getResources();
        float dimension = resources.getDimension(R.dimen.commonui_user_growth_view_drawable_padding);
        float dimension2 = resources.getDimension(R.dimen.commonui_user_growth_view_progress_drawable_padding);
        float dimension3 = resources.getDimension(R.dimen.commonui_user_growth_view_indicator_padding);
        int integer = resources.getInteger(R.integer.commonui_user_growth_view_indicator_count);
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.commonui_user_growth_view_text_size);
        int color = resources.getColor(R.color.commonui_user_growth_view_text_color);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842904, 16843121, R.attr.indicatorCount, R.attr.indicatorPadding, R.attr.drawable0, R.attr.drawable1, R.attr.drawable2, R.attr.drawable3, R.attr.drawable4, R.attr.drawable5, R.attr.drawable6, R.attr.progressDrawable, R.attr.secondaryProgressDrawable, R.attr.progressDrawablePadding, R.attr.indicatorDrawable}, i, 0);
        this.e = new Drawable[7];
        this.e[0] = obtainStyledAttributes.getDrawable(5);
        this.e[1] = obtainStyledAttributes.getDrawable(6);
        this.e[2] = obtainStyledAttributes.getDrawable(7);
        this.e[3] = obtainStyledAttributes.getDrawable(8);
        this.e[4] = obtainStyledAttributes.getDrawable(9);
        this.e[5] = obtainStyledAttributes.getDrawable(10);
        this.e[6] = obtainStyledAttributes.getDrawable(11);
        Drawable drawable = obtainStyledAttributes.getDrawable(12);
        this.i = (NinePatchDrawable) (drawable == null ? resources.getDrawable(R.drawable.commonui_user_growth_progress) : drawable);
        this.h = (int) obtainStyledAttributes.getDimension(2, dimension);
        Drawable drawable2 = obtainStyledAttributes.getDrawable(13);
        this.j = (NinePatchDrawable) (drawable2 == null ? resources.getDrawable(R.drawable.commonui_user_growth_secondary_progress) : drawable2);
        this.k = (int) obtainStyledAttributes.getDimension(14, dimension2);
        Drawable drawable3 = obtainStyledAttributes.getDrawable(15);
        this.l = drawable3 == null ? resources.getDrawable(R.drawable.commonui_user_growth_indicator) : drawable3;
        this.m = obtainStyledAttributes.getDimension(4, dimension3);
        this.n = obtainStyledAttributes.getInt(3, integer);
        this.o = new Paint();
        this.o.setAntiAlias(true);
        this.o.setTextSize(obtainStyledAttributes.getDimension(0, dimensionPixelSize));
        this.o.setColor(obtainStyledAttributes.getColor(1, color));
        obtainStyledAttributes.recycle();
    }

    public void setAdapter(a aVar) {
        int i;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1d847515984e5e4f56682a836f3a1f24", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1d847515984e5e4f56682a836f3a1f24");
        } else if (aVar == null) {
        } else {
            int a2 = aVar.a();
            if (a2 < 0 || a2 > 6) {
                throw new IllegalStateException(String.format("current growth %d not accepted", Integer.valueOf(a2)));
            }
            int c = aVar.c();
            int b = aVar.b();
            int d = aVar.d();
            if (c < b || c > d || b == d) {
                throw new IllegalStateException(String.format("curGrowthValue:%d,preGrowthValue:%s,nextGrowthValue:%d,not accepted", Integer.valueOf(c), Integer.valueOf(b), Integer.valueOf(d)));
            }
            this.c = aVar;
            a();
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e4e7f277970254685cafcc2414fbb4ef", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e4e7f277970254685cafcc2414fbb4ef");
            } else {
                int a3 = this.c.a();
                if (a3 < 6) {
                    i = a3 + 1;
                } else {
                    i = a3;
                    a3--;
                }
                this.f = a(a3);
                this.g = a(i);
            }
            requestLayout();
            invalidate();
        }
    }

    private void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69340861fc16f5738aa9db714b998172", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69340861fc16f5738aa9db714b998172");
            return;
        }
        this.d = new int[this.n + 2];
        int b = this.c.b();
        int d = this.c.d();
        this.d[0] = b;
        this.d[this.n + 1] = d;
        int i = (d - b) / (this.n + 1);
        for (int i2 = 1; i2 <= this.n; i2++) {
            this.d[i2] = (i2 * i) + b;
        }
    }

    private Drawable a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f534e780086965cacbeb80a9c47426d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (Drawable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f534e780086965cacbeb80a9c47426d6");
        }
        Drawable drawable = this.e[i];
        if (drawable == null) {
            Resources resources = getResources();
            switch (i) {
                case 0:
                    return resources.getDrawable(R.drawable.commonui_ic_user_growth_0);
                case 1:
                    return resources.getDrawable(R.drawable.commonui_ic_user_growth_1);
                case 2:
                    return resources.getDrawable(R.drawable.commonui_ic_user_growth_2);
                case 3:
                    return resources.getDrawable(R.drawable.commonui_ic_user_growth_3);
                case 4:
                    return resources.getDrawable(R.drawable.commonui_ic_user_growth_4);
                case 5:
                    return resources.getDrawable(R.drawable.commonui_ic_user_growth_5);
                case 6:
                    return resources.getDrawable(R.drawable.commonui_ic_user_growth_6);
                default:
                    return drawable;
            }
        }
        return drawable;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        float paddingBottom;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "21131d1bb95f4d986b01441e8bc128a7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "21131d1bb95f4d986b01441e8bc128a7");
        } else if (this.c == null) {
            setMeasuredDimension(0, 0);
        } else {
            int size = View.MeasureSpec.getSize(i);
            if (View.MeasureSpec.getMode(i2) == 1073741824) {
                paddingBottom = View.MeasureSpec.getSize(i2);
            } else {
                float paddingTop = getPaddingTop() + 0.0f + getGrowthDrawableHeight();
                int intrinsicHeight = this.l.getIntrinsicHeight() - this.k;
                if (intrinsicHeight > 0) {
                    paddingTop += intrinsicHeight;
                }
                float f = paddingTop + this.m;
                Paint.FontMetrics fontMetrics = this.o.getFontMetrics();
                paddingBottom = getPaddingBottom() + f + (fontMetrics.descent - fontMetrics.ascent);
            }
            setMeasuredDimension(size, (int) paddingBottom);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9af4a59ee66c6bc732aec0ee35507148", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9af4a59ee66c6bc732aec0ee35507148");
            return;
        }
        super.onDraw(canvas);
        if (this.c == null) {
            return;
        }
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int measuredWidth = getMeasuredWidth();
        Bitmap bitmap = ((BitmapDrawable) this.f).getBitmap();
        Bitmap bitmap2 = ((BitmapDrawable) this.g).getBitmap();
        float f = paddingLeft;
        float f2 = paddingTop;
        canvas.drawBitmap(bitmap, f, f2, (Paint) null);
        int i = measuredWidth - paddingRight;
        canvas.drawBitmap(bitmap2, i - this.g.getIntrinsicWidth(), f2, (Paint) null);
        int intrinsicWidth = paddingLeft + this.f.getIntrinsicWidth() + this.h;
        int intrinsicWidth2 = (i - this.g.getIntrinsicWidth()) - this.h;
        int growthDrawableHeight = (getGrowthDrawableHeight() + paddingTop) - this.k;
        int progressDrawableHeight = growthDrawableHeight - getProgressDrawableHeight();
        this.i.setBounds(intrinsicWidth, progressDrawableHeight, intrinsicWidth2, growthDrawableHeight);
        this.i.draw(canvas);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        float f3 = intrinsicWidth2 - intrinsicWidth;
        this.j.setBounds(intrinsicWidth, progressDrawableHeight, ((int) ((PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "54b200f5105f0d6d4a1def89b1898b62", RobustBitConfig.DEFAULT_VALUE) ? ((Float) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "54b200f5105f0d6d4a1def89b1898b62")).floatValue() : ((this.c.c() - this.c.b()) * 1.0f) / (this.c.d() - this.c.b())) * f3)) + intrinsicWidth, growthDrawableHeight);
        this.j.draw(canvas);
        float f4 = f3 / ((this.n + 1) * 1.0f);
        int intrinsicWidth3 = this.l.getIntrinsicWidth();
        int intrinsicHeight = this.l.getIntrinsicHeight();
        for (int i2 = 1; i2 <= this.n; i2++) {
            int i3 = (int) (intrinsicWidth + (i2 * f4));
            this.b.set(i3, growthDrawableHeight, i3 + intrinsicWidth3, growthDrawableHeight + intrinsicHeight);
            this.l.setBounds(this.b);
            this.l.draw(canvas);
        }
        float ascent = this.o.ascent();
        int intrinsicHeight2 = this.l.getIntrinsicHeight() - this.k;
        float growthDrawableHeight2 = paddingTop + getGrowthDrawableHeight();
        if (intrinsicHeight2 > 0) {
            growthDrawableHeight2 += intrinsicHeight2;
        }
        float f5 = (growthDrawableHeight2 + this.m) - ascent;
        canvas.drawText(String.valueOf(this.d[0]), f, f5, this.o);
        String valueOf = String.valueOf(this.d[this.n + 1]);
        canvas.drawText(valueOf, i - this.o.measureText(valueOf), f5, this.o);
        for (int i4 = 1; i4 <= this.n; i4++) {
            String valueOf2 = String.valueOf(this.d[i4]);
            canvas.drawText(valueOf2, (intrinsicWidth + (i4 * f4)) - (this.o.measureText(valueOf2) / 2.0f), f5, this.o);
        }
    }

    private int getProgressDrawableHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1e4b625ecece5dc27d9fa236c106b5a", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1e4b625ecece5dc27d9fa236c106b5a")).intValue() : Math.max(this.i.getIntrinsicHeight(), this.j.getIntrinsicHeight());
    }

    private int getGrowthDrawableHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "732422a2efa40e6b0cbefae6a8886af7", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "732422a2efa40e6b0cbefae6a8886af7")).intValue() : Math.max(this.f.getIntrinsicHeight(), this.g.getIntrinsicHeight());
    }
}
