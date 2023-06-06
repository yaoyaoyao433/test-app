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
public class UnderlinePageIndicator extends View implements PageIndicator {
    private final Paint a;
    private boolean b;
    private int c;
    private int d;
    private int e;
    private ViewPager f;
    private ViewPager.OnPageChangeListener g;
    private int h;
    private int i;
    private float j;
    private int k;
    private float l;
    private int m;
    private boolean n;
    private final Runnable o;

    public UnderlinePageIndicator(Context context) {
        this(context, null);
    }

    private UnderlinePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.vpiUnderlinePageIndicatorStyle);
    }

    public UnderlinePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new Paint(1);
        this.l = -1.0f;
        this.m = -1;
        this.o = new Runnable() { // from class: com.viewpagerindicator.UnderlinePageIndicator.1
            @Override // java.lang.Runnable
            public final void run() {
                if (UnderlinePageIndicator.this.b) {
                    int max = Math.max(UnderlinePageIndicator.this.a.getAlpha() - UnderlinePageIndicator.this.e, 0);
                    UnderlinePageIndicator.this.a.setAlpha(max);
                    UnderlinePageIndicator.this.invalidate();
                    if (max > 0) {
                        UnderlinePageIndicator.this.postDelayed(this, 30L);
                    }
                }
            }
        };
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        boolean z = resources.getBoolean(R.bool.default_underline_indicator_fades);
        int integer = resources.getInteger(R.integer.default_underline_indicator_fade_delay);
        int integer2 = resources.getInteger(R.integer.default_underline_indicator_fade_length);
        int color = resources.getColor(R.color.default_underline_indicator_selected_color);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842964, R.attr.selectedColor, R.attr.fades, R.attr.fadeDelay, R.attr.fadeLength}, i, 0);
        setFades(obtainStyledAttributes.getBoolean(2, z));
        setSelectedColor(obtainStyledAttributes.getColor(1, color));
        setFadeDelay(obtainStyledAttributes.getInteger(3, integer));
        setFadeLength(obtainStyledAttributes.getInteger(4, integer2));
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.k = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    public boolean getFades() {
        return this.b;
    }

    public void setFades(boolean z) {
        if (z != this.b) {
            this.b = z;
            if (z) {
                post(this.o);
                return;
            }
            removeCallbacks(this.o);
            this.a.setAlpha(255);
            invalidate();
        }
    }

    public int getFadeDelay() {
        return this.c;
    }

    public void setFadeDelay(int i) {
        this.c = i;
    }

    public int getFadeLength() {
        return this.d;
    }

    public void setFadeLength(int i) {
        this.d = i;
        this.e = 255 / (this.d / 30);
    }

    public int getSelectedColor() {
        return this.a.getColor();
    }

    public void setSelectedColor(int i) {
        this.a.setColor(i);
        invalidate();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int count;
        super.onDraw(canvas);
        if (this.f == null || (count = this.f.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.i >= count) {
            setCurrentItem(count - 1);
            return;
        }
        int paddingLeft = getPaddingLeft();
        float width = ((getWidth() - paddingLeft) - getPaddingRight()) / (count * 1.0f);
        float f = paddingLeft + ((this.i + this.j) * width);
        canvas.drawRect(f, getPaddingTop(), f + width, getHeight() - getPaddingBottom(), this.a);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.f == null || this.f.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.m = MotionEventCompat.getPointerId(motionEvent, 0);
                this.l = motionEvent.getX();
                break;
            case 1:
            case 3:
                if (!this.n) {
                    int count = this.f.getAdapter().getCount();
                    float width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    if (this.i > 0 && motionEvent.getX() < f - f2) {
                        if (action != 3) {
                            this.f.setCurrentItem(this.i - 1);
                        }
                        return true;
                    } else if (this.i < count - 1 && motionEvent.getX() > f + f2) {
                        if (action != 3) {
                            this.f.setCurrentItem(this.i + 1);
                        }
                        return true;
                    }
                }
                this.n = false;
                this.m = -1;
                if (this.f.isFakeDragging()) {
                    this.f.endFakeDrag();
                    break;
                }
                break;
            case 2:
                float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.m));
                float f3 = x - this.l;
                if (!this.n && Math.abs(f3) > this.k) {
                    this.n = true;
                }
                if (this.n) {
                    this.l = x;
                    if (this.f.isFakeDragging() || this.f.beginFakeDrag()) {
                        this.f.fakeDragBy(f3);
                        break;
                    }
                }
                break;
            case 5:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.l = MotionEventCompat.getX(motionEvent, actionIndex);
                this.m = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                break;
            case 6:
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.m) {
                    this.m = MotionEventCompat.getPointerId(motionEvent, actionIndex2 == 0 ? 1 : 0);
                }
                this.l = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.m));
                break;
        }
        return true;
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.f == viewPager) {
            return;
        }
        if (this.f != null) {
            this.f.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.f = viewPager;
        this.f.setOnPageChangeListener(this);
        invalidate();
        post(new Runnable() { // from class: com.viewpagerindicator.UnderlinePageIndicator.2
            @Override // java.lang.Runnable
            public final void run() {
                if (UnderlinePageIndicator.this.b) {
                    UnderlinePageIndicator.this.post(UnderlinePageIndicator.this.o);
                }
            }
        });
    }

    public void setCurrentItem(int i) {
        if (this.f == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.f.setCurrentItem(i);
        this.i = i;
        invalidate();
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.h = i;
        if (this.g != null) {
            this.g.onPageScrollStateChanged(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        this.i = i;
        this.j = f;
        if (this.b) {
            if (i2 > 0) {
                removeCallbacks(this.o);
                this.a.setAlpha(255);
            } else if (this.h != 1) {
                postDelayed(this.o, this.c);
            }
        }
        invalidate();
        if (this.g != null) {
            this.g.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.h == 0) {
            this.i = i;
            this.j = 0.0f;
            invalidate();
            this.o.run();
        }
        if (this.g != null) {
            this.g.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.g = onPageChangeListener;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.i = savedState.a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.i;
        return savedState;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.UnderlinePageIndicator.SavedState.1
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
