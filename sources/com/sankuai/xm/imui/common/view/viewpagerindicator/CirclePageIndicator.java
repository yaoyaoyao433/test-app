package com.sankuai.xm.imui.common.view.viewpagerindicator;

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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class CirclePageIndicator extends View implements PageIndicator {
    public static ChangeQuickRedirect a;
    private final Paint b;
    private final Paint c;
    private final Paint d;
    private float e;
    private ViewPager f;
    private ViewPager.OnPageChangeListener g;
    private int h;
    private int i;
    private float j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private float p;
    private int q;
    private boolean r;

    public CirclePageIndicator(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8371b83a6bc117d5f8a55bcdc811072", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8371b83a6bc117d5f8a55bcdc811072");
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.vpiCirclePageIndicatorStyle);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3ce3f24bff515f0197b140f39cfb2f6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3ce3f24bff515f0197b140f39cfb2f6");
        }
    }

    public CirclePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e5f19d626cdc9deccdfcfc3fe8fb89b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e5f19d626cdc9deccdfcfc3fe8fb89b");
            return;
        }
        this.b = new Paint(1);
        this.c = new Paint(1);
        this.d = new Paint(1);
        this.p = -1.0f;
        this.q = -1;
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
        this.m = obtainStyledAttributes.getBoolean(2, z);
        this.l = obtainStyledAttributes.getInt(0, integer);
        this.b.setStyle(Paint.Style.FILL);
        this.b.setColor(obtainStyledAttributes.getColor(6, color));
        this.c.setStyle(Paint.Style.STROKE);
        this.c.setColor(obtainStyledAttributes.getColor(3, color3));
        this.c.setStrokeWidth(obtainStyledAttributes.getDimension(4, dimension));
        this.d.setStyle(Paint.Style.FILL);
        this.d.setColor(obtainStyledAttributes.getColor(5, color2));
        this.e = obtainStyledAttributes.getDimension(7, dimension2);
        this.n = obtainStyledAttributes.getBoolean(8, z2);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.o = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    public void setCentered(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0f206285a3cac849b615d5171481d7e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0f206285a3cac849b615d5171481d7e");
            return;
        }
        this.m = z;
        invalidate();
    }

    public int getPageColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05ffb486dd6c7bd10d4a0c4db0c4e419", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05ffb486dd6c7bd10d4a0c4db0c4e419")).intValue() : this.b.getColor();
    }

    public void setPageColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8eb36642183265f8d6a550efb4f7388c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8eb36642183265f8d6a550efb4f7388c");
            return;
        }
        this.b.setColor(i);
        invalidate();
    }

    public int getFillColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1306809f8b4feb21945d072dfdd65670", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1306809f8b4feb21945d072dfdd65670")).intValue() : this.d.getColor();
    }

    public void setFillColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fa9612ff978374973f66682e1654be4a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fa9612ff978374973f66682e1654be4a");
            return;
        }
        this.d.setColor(i);
        invalidate();
    }

    public int getOrientation() {
        return this.l;
    }

    public void setOrientation(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ea630a6b95a08afb445c9f5bec4ad8a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ea630a6b95a08afb445c9f5bec4ad8a");
            return;
        }
        switch (i) {
            case 0:
            case 1:
                this.l = i;
                requestLayout();
                return;
            default:
                throw new IllegalArgumentException("Orientation must be either HORIZONTAL or VERTICAL.");
        }
    }

    public int getStrokeColor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "927091cf986ff6bc6a477f888daadb4d", 6917529027641081856L) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "927091cf986ff6bc6a477f888daadb4d")).intValue() : this.c.getColor();
    }

    public void setStrokeColor(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb26cd0be1dc57a202ba70105793780b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb26cd0be1dc57a202ba70105793780b");
            return;
        }
        this.c.setColor(i);
        invalidate();
    }

    public float getStrokeWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4d40794f154439e6d5ca03ea08d2e438", 6917529027641081856L) ? ((Float) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4d40794f154439e6d5ca03ea08d2e438")).floatValue() : this.c.getStrokeWidth();
    }

    public void setStrokeWidth(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fafb70ba9121db671d9da7e729a4abe7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fafb70ba9121db671d9da7e729a4abe7");
            return;
        }
        this.c.setStrokeWidth(f);
        invalidate();
    }

    public float getRadius() {
        return this.e;
    }

    public void setRadius(float f) {
        Object[] objArr = {Float.valueOf(f)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6f0b6df9c25d8549d4ca1801789323", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6f0b6df9c25d8549d4ca1801789323");
            return;
        }
        this.e = f;
        invalidate();
    }

    public void setSnap(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2ddc119300cfb4738b658b3009dd838e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2ddc119300cfb4738b658b3009dd838e");
            return;
        }
        this.n = z;
        invalidate();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        int count;
        int height;
        int paddingTop;
        int paddingBottom;
        int paddingLeft;
        float f;
        float f2;
        Object[] objArr = {canvas};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a74270684891ced6baa89819f9727315", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a74270684891ced6baa89819f9727315");
            return;
        }
        super.onDraw(canvas);
        if (this.f == null || (count = this.f.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.h >= count) {
            setCurrentItem(count - 1);
            return;
        }
        if (this.l == 0) {
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
        float f3 = this.e * 5.0f;
        float f4 = paddingLeft + this.e;
        float f5 = paddingTop + this.e;
        if (this.m) {
            f5 += (((height - paddingTop) - paddingBottom) / 2.0f) - ((count * f3) / 2.0f);
        }
        float f6 = this.e;
        if (this.c.getStrokeWidth() > 0.0f) {
            f6 -= this.c.getStrokeWidth() / 2.0f;
        }
        for (int i = 0; i < count; i++) {
            float f7 = (i * f3) + f5;
            if (this.l == 0) {
                f2 = f4;
            } else {
                f2 = f7;
                f7 = f4;
            }
            if (this.b.getAlpha() > 0) {
                canvas.drawCircle(f7, f2, f6, this.b);
            }
            if (f6 != this.e) {
                canvas.drawCircle(f7, f2, this.e, this.c);
            }
        }
        float f8 = (this.n ? this.i : this.h) * f3;
        if (!this.n) {
            f8 += this.j * f3;
        }
        if (this.l == 0) {
            f = f8 + f5;
        } else {
            f4 = f8 + f5;
            f = f4;
        }
        canvas.drawCircle(f, f4, this.e, this.d);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        Object[] objArr = {motionEvent};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9624a6069956a2e85a25867e4b10985a", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9624a6069956a2e85a25867e4b10985a")).booleanValue();
        }
        try {
            Object[] objArr2 = {motionEvent};
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2e2d39a6487ecd872439d363f6ebe8ce", 6917529027641081856L)) {
                return ((Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2e2d39a6487ecd872439d363f6ebe8ce")).booleanValue();
            }
            if (super.onTouchEvent(motionEvent)) {
                return true;
            }
            if (this.f != null && this.f.getAdapter().getCount() != 0) {
                int action = motionEvent.getAction() & 255;
                switch (action) {
                    case 0:
                        this.q = MotionEventCompat.getPointerId(motionEvent, 0);
                        this.p = motionEvent.getX();
                        break;
                    case 1:
                    case 3:
                        if (!this.r) {
                            int count = this.f.getAdapter().getCount();
                            float width = getWidth();
                            float f = width / 2.0f;
                            float f2 = width / 6.0f;
                            if (this.h > 0 && motionEvent.getX() < f - f2) {
                                if (action != 3) {
                                    this.f.setCurrentItem(this.h - 1);
                                }
                                return true;
                            } else if (this.h < count - 1 && motionEvent.getX() > f + f2) {
                                if (action != 3) {
                                    this.f.setCurrentItem(this.h + 1);
                                }
                                return true;
                            }
                        }
                        this.r = false;
                        this.q = -1;
                        if (this.f.isFakeDragging()) {
                            this.f.endFakeDrag();
                            break;
                        }
                        break;
                    case 2:
                        float x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.q));
                        float f3 = x - this.p;
                        if (!this.r && Math.abs(f3) > this.o) {
                            this.r = true;
                        }
                        if (this.r) {
                            this.p = x;
                            if (this.f.isFakeDragging() || this.f.beginFakeDrag()) {
                                this.f.fakeDragBy(f3);
                                break;
                            }
                        }
                        break;
                    case 5:
                        int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                        this.p = MotionEventCompat.getX(motionEvent, actionIndex);
                        this.q = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                        break;
                    case 6:
                        int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                        if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.q) {
                            this.q = MotionEventCompat.getPointerId(motionEvent, actionIndex2 == 0 ? 1 : 0);
                        }
                        this.p = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.q));
                        break;
                }
                return true;
            }
            return false;
        } catch (Exception e) {
            e.printStackTrace();
            return super.onTouchEvent(motionEvent);
        }
    }

    public void setViewPager(ViewPager viewPager) {
        Object[] objArr = {viewPager};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b3a4328afb8eae21ede9dc565527d5e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b3a4328afb8eae21ede9dc565527d5e");
        } else if (this.f == viewPager) {
        } else {
            if (this.f != null) {
                this.f.setOnPageChangeListener(null);
            }
            if (viewPager.getAdapter() == null) {
                throw new IllegalStateException("ViewPager does not have adapter instance.");
            }
            this.f = viewPager;
            this.f.setOnPageChangeListener(this);
            invalidate();
        }
    }

    public void setCurrentItem(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "070f3a02419ebcbdd9b494d2e239fab5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "070f3a02419ebcbdd9b494d2e239fab5");
        } else if (this.f == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        } else {
            this.f.setCurrentItem(i);
            this.h = i;
            invalidate();
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "252ee1316ff6f9f0edf6e21db461eaa8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "252ee1316ff6f9f0edf6e21db461eaa8");
            return;
        }
        this.k = i;
        if (this.g != null) {
            this.g.onPageScrollStateChanged(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        Object[] objArr = {Integer.valueOf(i), Float.valueOf(f), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7026e51668d1db4c09de3aa5f776412e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7026e51668d1db4c09de3aa5f776412e");
            return;
        }
        this.h = i;
        this.j = f;
        invalidate();
        if (this.g != null) {
            this.g.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bb80351ff0339be46a891324a1076b1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bb80351ff0339be46a891324a1076b1");
            return;
        }
        if (this.n || this.k == 0) {
            this.h = i;
            this.i = i;
            invalidate();
        }
        if (this.g != null) {
            this.g.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.g = onPageChangeListener;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1b4b5cfe17ddf29289ae2e0e6ddf338e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1b4b5cfe17ddf29289ae2e0e6ddf338e");
        } else if (this.l == 0) {
            setMeasuredDimension(a(i), b(i2));
        } else {
            setMeasuredDimension(b(i), a(i2));
        }
    }

    private int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e371a1a46c4078e3500eabcd4fed8d9c", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e371a1a46c4078e3500eabcd4fed8d9c")).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824 || this.f == null) {
            return size;
        }
        int count = this.f.getAdapter().getCount();
        int paddingLeft = (int) (getPaddingLeft() + getPaddingRight() + (count * 2 * this.e) + ((count - 1) * this.e) + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingLeft, size) : paddingLeft;
    }

    private int b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "723cd9db43f47d9c3833e9aedc6df5cd", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "723cd9db43f47d9c3833e9aedc6df5cd")).intValue();
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 1073741824) {
            return size;
        }
        int paddingTop = (int) ((this.e * 2.0f) + getPaddingTop() + getPaddingBottom() + 1.0f);
        return mode == Integer.MIN_VALUE ? Math.min(paddingTop, size) : paddingTop;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        Object[] objArr = {parcelable};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb65c4aa052bb9d2ca049db943744288", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb65c4aa052bb9d2ca049db943744288");
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.h = savedState.b;
        this.i = savedState.b;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bbd9e5dad536317c78031be0fb151219", 6917529027641081856L)) {
            return (Parcelable) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bbd9e5dad536317c78031be0fb151219");
        }
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.b = this.h;
        return savedState;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.sankuai.xm.imui.common.view.viewpagerindicator.CirclePageIndicator.SavedState.1
            public static ChangeQuickRedirect a;

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SavedState createFromParcel(Parcel parcel) {
                Object[] objArr = {parcel};
                ChangeQuickRedirect changeQuickRedirect = a;
                return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b4748e06181e227dc5beed2d6d8fb93", 6917529027641081856L) ? (SavedState) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b4748e06181e227dc5beed2d6d8fb93") : new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* bridge */ /* synthetic */ SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        };
        public static ChangeQuickRedirect a;
        public int b;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
            Object[] objArr = {parcelable};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d4b64df8a919a6b2ddcc6c01b577128", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d4b64df8a919a6b2ddcc6c01b577128");
            }
        }

        private SavedState(Parcel parcel) {
            super(parcel);
            Object[] objArr = {parcel};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "468cc8f303e6f74cf67eca6586c6fd32", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "468cc8f303e6f74cf67eca6586c6fd32");
            } else {
                this.b = parcel.readInt();
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            Object[] objArr = {parcel, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d9119d02eecbdd07df6af645a541abf3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d9119d02eecbdd07df6af645a541abf3");
                return;
            }
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
        }
    }
}
