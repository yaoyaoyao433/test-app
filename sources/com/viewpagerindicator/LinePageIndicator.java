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
import android.util.FloatMath;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class LinePageIndicator extends View implements PageIndicator {
    private final Paint a;
    private final Paint b;
    private ViewPager c;
    private ViewPager.OnPageChangeListener d;
    private int e;
    private boolean f;
    private float g;
    private float h;
    private int i;
    private float j;
    private int k;
    private boolean l;

    public LinePageIndicator(Context context) {
        this(context, null);
    }

    private LinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.vpiLinePageIndicatorStyle);
    }

    public LinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
        this.b = new Paint(1);
        this.j = -1.0f;
        this.k = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_line_indicator_selected_color);
        int color2 = resources.getColor(R.color.default_line_indicator_unselected_color);
        float dimension = resources.getDimension(R.dimen.default_line_indicator_line_width);
        float dimension2 = resources.getDimension(R.dimen.default_line_indicator_gap_width);
        float dimension3 = resources.getDimension(R.dimen.default_line_indicator_stroke_width);
        boolean z = resources.getBoolean(R.bool.default_line_indicator_centered);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842964, R.attr.centered, R.attr.selectedColor, R.attr.strokeWidth, R.attr.unselectedColor, R.attr.lineWidth, R.attr.gapWidth}, i, 0);
        this.f = obtainStyledAttributes.getBoolean(1, z);
        this.g = obtainStyledAttributes.getDimension(5, dimension);
        this.h = obtainStyledAttributes.getDimension(6, dimension2);
        setStrokeWidth(obtainStyledAttributes.getDimension(3, dimension3));
        this.a.setColor(obtainStyledAttributes.getColor(4, color2));
        this.b.setColor(obtainStyledAttributes.getColor(2, color));
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.i = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    public void setCentered(boolean z) {
        this.f = z;
        invalidate();
    }

    public void setUnselectedColor(int i) {
        this.a.setColor(i);
        invalidate();
    }

    public int getUnselectedColor() {
        return this.a.getColor();
    }

    public void setSelectedColor(int i) {
        this.b.setColor(i);
        invalidate();
    }

    public int getSelectedColor() {
        return this.b.getColor();
    }

    public void setLineWidth(float f) {
        this.g = f;
        invalidate();
    }

    public float getLineWidth() {
        return this.g;
    }

    public void setStrokeWidth(float f) {
        this.b.setStrokeWidth(f);
        this.a.setStrokeWidth(f);
        invalidate();
    }

    public float getStrokeWidth() {
        return this.b.getStrokeWidth();
    }

    public void setGapWidth(float f) {
        this.h = f;
        invalidate();
    }

    public float getGapWidth() {
        return this.h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int count;
        super.onDraw(canvas);
        if (this.c == null || (count = this.c.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.e >= count) {
            setCurrentItem(count - 1);
            return;
        }
        float f = this.g + this.h;
        float f2 = (count * f) - this.h;
        float paddingTop = getPaddingTop();
        float paddingLeft = getPaddingLeft();
        float paddingRight = getPaddingRight();
        float height = paddingTop + (((getHeight() - paddingTop) - getPaddingBottom()) / 2.0f);
        if (this.f) {
            paddingLeft += (((getWidth() - paddingLeft) - paddingRight) / 2.0f) - (f2 / 2.0f);
        }
        int i = 0;
        while (i < count) {
            float f3 = paddingLeft + (i * f);
            canvas.drawLine(f3, height, f3 + this.g, height, i == this.e ? this.b : this.a);
            i++;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.c == null || this.c.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.k = MotionEventCompat.getPointerId(motionEvent, 0);
                this.j = motionEvent.getX();
                break;
            case 1:
            case 3:
                if (!this.l) {
                    int count = this.c.getAdapter().getCount();
                    float width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    if (this.e > 0 && motionEvent.getX() < f - f2) {
                        if (action != 3) {
                            this.c.setCurrentItem(this.e - 1);
                        }
                        return true;
                    } else if (this.e < count - 1 && motionEvent.getX() > f + f2) {
                        if (action != 3) {
                            this.c.setCurrentItem(this.e + 1);
                        }
                        return true;
                    }
                }
                this.l = false;
                this.k = -1;
                if (this.c.isFakeDragging()) {
                    this.c.endFakeDrag();
                    break;
                }
                break;
            case 2:
                float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.k));
                float f3 = x - this.j;
                if (!this.l && Math.abs(f3) > this.i) {
                    this.l = true;
                }
                if (this.l) {
                    this.j = x;
                    if (this.c.isFakeDragging() || this.c.beginFakeDrag()) {
                        this.c.fakeDragBy(f3);
                        break;
                    }
                }
                break;
            case 5:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.j = MotionEventCompat.getX(motionEvent, actionIndex);
                this.k = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                break;
            case 6:
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.k) {
                    this.k = MotionEventCompat.getPointerId(motionEvent, actionIndex2 == 0 ? 1 : 0);
                }
                this.j = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.k));
                break;
        }
        return true;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.c == viewPager) {
            return;
        }
        if (this.c != null) {
            this.c.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.c = viewPager;
        this.c.setOnPageChangeListener(this);
        invalidate();
    }

    public void setCurrentItem(int i) {
        if (this.c == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.c.setCurrentItem(i);
        this.e = i;
        invalidate();
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        if (this.d != null) {
            this.d.onPageScrollStateChanged(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        if (this.d != null) {
            this.d.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        this.e = i;
        invalidate();
        if (this.d != null) {
            this.d.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.d = onPageChangeListener;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.e = savedState.a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.e;
        return savedState;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.LinePageIndicator.SavedState.1
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

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        float min;
        int count;
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.c == null) {
            f = size;
        } else {
            f = getPaddingLeft() + getPaddingRight() + (this.c.getAdapter().getCount() * this.g) + ((count - 1) * this.h);
            if (mode == Integer.MIN_VALUE) {
                f = Math.min(f, size);
            }
        }
        int ceil = (int) FloatMath.ceil(f);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            min = size2;
        } else {
            float strokeWidth = this.b.getStrokeWidth() + getPaddingTop() + getPaddingBottom();
            min = mode2 == Integer.MIN_VALUE ? Math.min(strokeWidth, size2) : strokeWidth;
        }
        setMeasuredDimension(ceil, (int) FloatMath.ceil(min));
    }
}
