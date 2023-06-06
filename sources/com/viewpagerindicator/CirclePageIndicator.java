package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.constraint.R;
import android.support.v4.view.MotionEventCompat;
import android.support.v4.view.ViewConfigurationCompat;
import android.support.v4.view.ViewPager;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CirclePageIndicator extends View implements PageIndicator {
    private float a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private ViewPager e;
    private ViewPager.OnPageChangeListener f;
    private int g;
    private int h;
    private float i;
    private int j;
    private int k;
    private boolean l;
    private boolean m;
    private int n;
    private float o;
    private int p;
    private boolean q;

    public CirclePageIndicator(Context context) {
        this(context, null);
    }

    private CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.vpiCirclePageIndicatorStyle);
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.o = -1.0f;
        this.p = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_circle_indicator_page_color);
        int color2 = resources.getColor(R.color.default_circle_indicator_fill_color);
        int integer = resources.getInteger(R.integer.default_circle_indicator_orientation);
        int color3 = resources.getColor(R.color.default_circle_indicator_stroke_color);
        float dimension = resources.getDimension(R.dimen.default_circle_indicator_stroke_width);
        float dimension2 = resources.getDimension(R.dimen.default_circle_indicator_radius);
        boolean z = resources.getBoolean(R.bool.default_circle_indicator_centered);
        boolean z2 = resources.getBoolean(R.bool.default_circle_indicator_snap);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842948, 16842964, R.attr.centered, R.attr.strokeColor, R.attr.strokeWidth, R.attr.fillColor, R.attr.pageColor, R.attr.radius, R.attr.snap}, i, 0);
        this.l = obtainStyledAttributes.getBoolean(2, z);
        this.k = obtainStyledAttributes.getInt(0, integer);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setColor(obtainStyledAttributes.getColor(5, color));
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setColor(obtainStyledAttributes.getColor(8, color3));
        this.c.setStrokeWidth(obtainStyledAttributes.getDimension(3, dimension));
        this.d.setStyle(Paint.Style.FILL);
        this.d.setColor(obtainStyledAttributes.getColor(4, color2));
        this.a = obtainStyledAttributes.getDimension(6, dimension2);
        this.m = obtainStyledAttributes.getBoolean(7, z2);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.n = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    public void setCentered(boolean z) {
        this.l = z;
        invalidate();
    }

    public void setPageColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public int getPageColor() {
        return this.b.getColor();
    }

    public void setFillColor(int i) {
        this.d.setColor(i);
        invalidate();
    }

    public int getFillColor() {
        return this.d.getColor();
    }

    public void setOrientation(int i) {
        switch (i) {
            case 0:
            case 1:
                this.k = i;
                requestLayout();
                return;
            default:
                throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
    }

    public int getOrientation() {
        return this.k;
    }

    public void setStrokeColor(int i) {
        this.c.setColor(i);
        invalidate();
    }

    public int getStrokeColor() {
        return this.c.getColor();
    }

    public void setStrokeWidth(float f) {
        this.c.setStrokeWidth(f);
        invalidate();
    }

    public float getStrokeWidth() {
        return this.c.getStrokeWidth();
    }

    public void setRadius(float f) {
        this.a = f;
        invalidate();
    }

    public float getRadius() {
        return this.a;
    }

    public void setSnap(boolean z) {
        this.m = z;
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        float f2;
        super.onDraw(canvas);
        if (this.e == null || (count = this.e.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.g >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.k == 0) {
            height = getWidth();
            paddingTop = getPaddingLeft();
            paddingBottom = getPaddingRight();
            paddingLeft = getPaddingTop();
        } else {
            height = getHeight();
            paddingTop = getPaddingTop();
            paddingBottom = getPaddingBottom();
            paddingLeft = getPaddingLeft();
        }
        float f3 = this.a * 3.0f;
        float f4 = paddingLeft + this.a;
        float f5 = paddingTop + this.a;
        if (this.l) {
            f5 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f3) / 2.0f);
        }
        float f6 = this.a;
        if (this.c.getStrokeWidth() > 0.0f) {
            f6 -= this.c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f7 = (i * f3) + f5;
            if (this.k == 0) {
                f2 = f4;
            } else {
                f2 = f7;
                f7 = f4;
            }
            if (this.b.getAlpha() > 0) {
                canvas.drawCircle(f7, f2, f6, this.b);
            }
            if (f6 != this.a) {
                canvas.drawCircle(f7, f2, this.a, this.c);
            }
        }
        float f8 = (this.m ? this.h : this.g) * f3;
        if (!this.m) {
            f8 += this.i * f3;
        }
        if (this.k == 0) {
            f = f8 + f5;
        } else {
            f4 = f8 + f5;
            f = f4;
        }
        canvas.drawCircle(f, f4, this.a, this.d);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.e == null || this.e.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.p = MotionEventCompat.getPointerId(motionEvent, 0);
                this.o = motionEvent.getX();
                break;
            case 1:
            case 3:
                if (!this.q) {
                    int count = this.e.getAdapter().getCount();
                    float width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    if (this.g > 0 && motionEvent.getX() < f - f2) {
                        if (action != 3) {
                            this.e.setCurrentItem(this.g - 1);
                        }
                        return true;
                    } else if (this.g < count - 1 && motionEvent.getX() > f + f2) {
                        if (action != 3) {
                            this.e.setCurrentItem(this.g + 1);
                        }
                        return true;
                    }
                }
                this.q = false;
                this.p = -1;
                if (this.e.isFakeDragging()) {
                    this.e.endFakeDrag();
                    break;
                }
                break;
            case 2:
                float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.p));
                float f3 = x - this.o;
                if (!this.q && Math.abs(f3) > this.n) {
                    this.q = true;
                }
                if (this.q) {
                    this.o = x;
                    if (this.e.isFakeDragging() || this.e.beginFakeDrag()) {
                        this.e.fakeDragBy(f3);
                        break;
                    }
                }
                break;
            case 5:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.o = MotionEventCompat.getX(motionEvent, actionIndex);
                this.p = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                break;
            case 6:
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.p) {
                    this.p = MotionEventCompat.getPointerId(motionEvent, actionIndex2 == 0 ? 1 : 0);
                }
                this.o = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.p));
                break;
        }
        return true;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.e == viewPager) {
            return;
        }
        if (this.e != null) {
            this.e.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.e = viewPager;
        this.e.setOnPageChangeListener(this);
        invalidate();
    }

    public void setCurrentItem(int i) {
        if (this.e == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.e.setCurrentItem(i);
        this.g = i;
        invalidate();
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.j = i;
        if (this.f != null) {
            this.f.onPageScrollStateChanged(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        this.g = i;
        this.i = f;
        invalidate();
        if (this.f != null) {
            this.f.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.m || this.j == 0) {
            this.g = i;
            this.h = i;
            invalidate();
        }
        if (this.f != null) {
            this.f.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.f = onPageChangeListener;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        if (this.k == 0) {
            setMeasuredDimension(a(i), b(i2));
        } else {
            setMeasuredDimension(b(i), a(i2));
        }
    }

    private int a(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.e == null) {
            return size;
        }
        int count = this.e.getAdapter().getCount();
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * this.a) + ((count - 1) * this.a) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private int b(int i) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.a * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.g = savedState.a;
        this.h = savedState.a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.g;
        return savedState;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.CirclePageIndicator.SavedState.1
            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }
        };
        int a;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            this.a = parcel.readInt();
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.a);
        }
    }
}
