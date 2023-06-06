package android.support.v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.ColorInt;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CardView extends FrameLayout {
    private static final int[] e = {16842801};
    private static final r f;
    int a;
    int b;
    final Rect c;
    final Rect d;
    private boolean g;
    private boolean h;
    private final q i;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        if (Build.VERSION.SDK_INT >= 21) {
            f = new o();
        } else if (Build.VERSION.SDK_INT >= 17) {
            f = new n();
        } else {
            f = new p();
        }
        f.a();
    }

    public CardView(Context context) {
        super(context);
        this.c = new Rect();
        this.d = new Rect();
        this.i = new q() { // from class: android.support.v7.widget.CardView.1
            private Drawable b;

            @Override // android.support.v7.widget.q
            public final void a(Drawable drawable) {
                this.b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // android.support.v7.widget.q
            public final boolean a() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // android.support.v7.widget.q
            public final boolean b() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // android.support.v7.widget.q
            public final void a(int i, int i2, int i3, int i4) {
                CardView.this.d.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.c.left, i2 + CardView.this.c.top, i3 + CardView.this.c.right, i4 + CardView.this.c.bottom);
            }

            @Override // android.support.v7.widget.q
            public final void a(int i, int i2) {
                if (i > CardView.this.a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            @Override // android.support.v7.widget.q
            public final Drawable c() {
                return this.b;
            }

            @Override // android.support.v7.widget.q
            public final View d() {
                return CardView.this;
            }
        };
        a(context, null, 0);
    }

    public CardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new Rect();
        this.i = new q() { // from class: android.support.v7.widget.CardView.1
            private Drawable b;

            @Override // android.support.v7.widget.q
            public final void a(Drawable drawable) {
                this.b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // android.support.v7.widget.q
            public final boolean a() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // android.support.v7.widget.q
            public final boolean b() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // android.support.v7.widget.q
            public final void a(int i, int i2, int i3, int i4) {
                CardView.this.d.set(i, i2, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i + cardView.c.left, i2 + CardView.this.c.top, i3 + CardView.this.c.right, i4 + CardView.this.c.bottom);
            }

            @Override // android.support.v7.widget.q
            public final void a(int i, int i2) {
                if (i > CardView.this.a) {
                    CardView.super.setMinimumWidth(i);
                }
                if (i2 > CardView.this.b) {
                    CardView.super.setMinimumHeight(i2);
                }
            }

            @Override // android.support.v7.widget.q
            public final Drawable c() {
                return this.b;
            }

            @Override // android.support.v7.widget.q
            public final View d() {
                return CardView.this;
            }
        };
        a(context, attributeSet, 0);
    }

    public CardView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = new Rect();
        this.d = new Rect();
        this.i = new q() { // from class: android.support.v7.widget.CardView.1
            private Drawable b;

            @Override // android.support.v7.widget.q
            public final void a(Drawable drawable) {
                this.b = drawable;
                CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // android.support.v7.widget.q
            public final boolean a() {
                return CardView.this.getUseCompatPadding();
            }

            @Override // android.support.v7.widget.q
            public final boolean b() {
                return CardView.this.getPreventCornerOverlap();
            }

            @Override // android.support.v7.widget.q
            public final void a(int i2, int i22, int i3, int i4) {
                CardView.this.d.set(i2, i22, i3, i4);
                CardView cardView = CardView.this;
                CardView.super.setPadding(i2 + cardView.c.left, i22 + CardView.this.c.top, i3 + CardView.this.c.right, i4 + CardView.this.c.bottom);
            }

            @Override // android.support.v7.widget.q
            public final void a(int i2, int i22) {
                if (i2 > CardView.this.a) {
                    CardView.super.setMinimumWidth(i2);
                }
                if (i22 > CardView.this.b) {
                    CardView.super.setMinimumHeight(i22);
                }
            }

            @Override // android.support.v7.widget.q
            public final Drawable c() {
                return this.b;
            }

            @Override // android.support.v7.widget.q
            public final View d() {
                return CardView.this;
            }
        };
        a(context, attributeSet, i);
    }

    public boolean getUseCompatPadding() {
        return this.g;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.g != z) {
            this.g = z;
            f.g(this.i);
        }
    }

    public final void a(int i, int i2, int i3, int i4) {
        this.c.set(20, 10, 20, 10);
        f.f(this.i);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        if (!(f instanceof o)) {
            int mode = View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f.b(this.i)), View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = View.MeasureSpec.makeMeasureSpec(Math.max((int) Math.ceil(f.c(this.i)), View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    private void a(Context context, AttributeSet attributeSet, int i) {
        int color;
        ColorStateList valueOf;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16843071, 16843072, R.attr.cardBackgroundColor, R.attr.cardCornerRadius, R.attr.cardElevation, R.attr.cardMaxElevation, R.attr.cardUseCompatPadding, R.attr.cardPreventCornerOverlap, R.attr.contentPadding, R.attr.contentPaddingLeft, R.attr.contentPaddingRight, R.attr.contentPaddingTop, R.attr.contentPaddingBottom}, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(2)) {
            valueOf = obtainStyledAttributes.getColorStateList(2);
        } else {
            TypedArray obtainStyledAttributes2 = getContext().obtainStyledAttributes(e);
            int color2 = obtainStyledAttributes2.getColor(0, 0);
            obtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(R.color.cardview_light_background);
            } else {
                color = getResources().getColor(R.color.cardview_dark_background);
            }
            valueOf = ColorStateList.valueOf(color);
        }
        ColorStateList colorStateList = valueOf;
        float dimension = obtainStyledAttributes.getDimension(3, 0.0f);
        float dimension2 = obtainStyledAttributes.getDimension(4, 0.0f);
        float dimension3 = obtainStyledAttributes.getDimension(5, 0.0f);
        this.g = obtainStyledAttributes.getBoolean(6, false);
        this.h = obtainStyledAttributes.getBoolean(7, true);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        this.c.left = obtainStyledAttributes.getDimensionPixelSize(9, dimensionPixelSize);
        this.c.top = obtainStyledAttributes.getDimensionPixelSize(11, dimensionPixelSize);
        this.c.right = obtainStyledAttributes.getDimensionPixelSize(10, dimensionPixelSize);
        this.c.bottom = obtainStyledAttributes.getDimensionPixelSize(12, dimensionPixelSize);
        float f2 = dimension2 > dimension3 ? dimension2 : dimension3;
        this.a = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        f.a(this.i, context, colorStateList, dimension, dimension2, f2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.a = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.b = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(@ColorInt int i) {
        f.a(this.i, ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(@Nullable ColorStateList colorStateList) {
        f.a(this.i, colorStateList);
    }

    public ColorStateList getCardBackgroundColor() {
        return f.i(this.i);
    }

    public int getContentPaddingLeft() {
        return this.c.left;
    }

    public int getContentPaddingRight() {
        return this.c.right;
    }

    public int getContentPaddingTop() {
        return this.c.top;
    }

    public int getContentPaddingBottom() {
        return this.c.bottom;
    }

    public void setRadius(float f2) {
        f.a(this.i, f2);
    }

    public float getRadius() {
        return f.d(this.i);
    }

    public void setCardElevation(float f2) {
        f.c(this.i, f2);
    }

    public float getCardElevation() {
        return f.e(this.i);
    }

    public void setMaxCardElevation(float f2) {
        f.b(this.i, f2);
    }

    public float getMaxCardElevation() {
        return f.a(this.i);
    }

    public boolean getPreventCornerOverlap() {
        return this.h;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.h) {
            this.h = z;
            f.h(this.i);
        }
    }
}
