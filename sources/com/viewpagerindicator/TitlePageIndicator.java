package com.viewpagerindicator;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
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
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class TitlePageIndicator extends View implements PageIndicator {
    private c A;
    private ViewPager a;
    private ViewPager.OnPageChangeListener b;
    private int c;
    private float d;
    private int e;
    private final Paint f;
    private boolean g;
    private int h;
    private int i;
    private Path j;
    private final Rect k;
    private final Paint l;
    private a m;
    private b n;
    private final Paint o;
    private float p;
    private float q;
    private float r;
    private float s;
    private float t;
    private float u;
    private float v;
    private int w;
    private float x;
    private int y;
    private boolean z;

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public interface c {
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum a {
        None(0),
        Triangle(1),
        Underline(2);
        
        public final int d;

        a(int i) {
            this.d = i;
        }

        public static a a(int i) {
            a[] values;
            for (a aVar : values()) {
                if (aVar.d == i) {
                    return aVar;
                }
            }
            return null;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    public enum b {
        Bottom(0),
        Top(1);
        
        public final int c;

        b(int i) {
            this.c = i;
        }

        public static b a(int i) {
            b[] values;
            for (b bVar : values()) {
                if (bVar.c == i) {
                    return bVar;
                }
            }
            return null;
        }
    }

    public TitlePageIndicator(Context context) {
        this(context, null);
    }

    private TitlePageIndicator(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.vpiTitlePageIndicatorStyle);
    }

    public TitlePageIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.c = -1;
        this.f = new Paint();
        this.j = new Path();
        this.k = new Rect();
        this.l = new Paint();
        this.o = new Paint();
        this.x = -1.0f;
        this.y = -1;
        if (isInEditMode()) {
            return;
        }
        Resources resources = getResources();
        int color = resources.getColor(R.color.default_title_indicator_footer_color);
        float dimension = resources.getDimension(R.dimen.default_title_indicator_footer_line_height);
        int integer = resources.getInteger(R.integer.default_title_indicator_footer_indicator_style);
        float dimension2 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_height);
        float dimension3 = resources.getDimension(R.dimen.default_title_indicator_footer_indicator_underline_padding);
        float dimension4 = resources.getDimension(R.dimen.default_title_indicator_footer_padding);
        int integer2 = resources.getInteger(R.integer.default_title_indicator_line_position);
        int color2 = resources.getColor(R.color.default_title_indicator_selected_color);
        boolean z = resources.getBoolean(R.bool.default_title_indicator_selected_bold);
        int color3 = resources.getColor(R.color.default_title_indicator_text_color);
        float dimension5 = resources.getDimension(R.dimen.default_title_indicator_text_size);
        float dimension6 = resources.getDimension(R.dimen.default_title_indicator_title_padding);
        float dimension7 = resources.getDimension(R.dimen.default_title_indicator_clip_padding);
        float dimension8 = resources.getDimension(R.dimen.default_title_indicator_top_padding);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842901, 16842904, 16842964, R.attr.selectedColor, R.attr.clipPadding, R.attr.footerColor, R.attr.footerLineHeight, R.attr.footerIndicatorStyle, R.attr.footerIndicatorHeight, R.attr.footerIndicatorUnderlinePadding, R.attr.footerPadding, R.attr.linePosition, R.attr.selectedBold, R.attr.titlePadding, R.attr.topPadding}, i, 0);
        this.v = obtainStyledAttributes.getDimension(6, dimension);
        this.m = a.a(obtainStyledAttributes.getInteger(7, integer));
        this.p = obtainStyledAttributes.getDimension(8, dimension2);
        this.q = obtainStyledAttributes.getDimension(9, dimension3);
        this.r = obtainStyledAttributes.getDimension(10, dimension4);
        this.n = b.a(obtainStyledAttributes.getInteger(11, integer2));
        this.t = obtainStyledAttributes.getDimension(14, dimension8);
        this.s = obtainStyledAttributes.getDimension(13, dimension6);
        this.u = obtainStyledAttributes.getDimension(4, dimension7);
        this.i = obtainStyledAttributes.getColor(3, color2);
        this.h = obtainStyledAttributes.getColor(1, color3);
        this.g = obtainStyledAttributes.getBoolean(12, z);
        float dimension9 = obtainStyledAttributes.getDimension(0, dimension5);
        int color4 = obtainStyledAttributes.getColor(5, color);
        this.f.setTextSize(dimension9);
        this.f.setAntiAlias(true);
        this.l.setStyle(Paint.Style.FILL_AND_STROKE);
        this.l.setStrokeWidth(this.v);
        this.l.setColor(color4);
        this.o.setStyle(Paint.Style.FILL_AND_STROKE);
        this.o.setColor(color4);
        Drawable drawable = obtainStyledAttributes.getDrawable(2);
        if (drawable != null) {
            setBackgroundDrawable(drawable);
        }
        obtainStyledAttributes.recycle();
        this.w = ViewConfigurationCompat.getScaledPagingTouchSlop(ViewConfiguration.get(context));
    }

    public int getFooterColor() {
        return this.l.getColor();
    }

    public void setFooterColor(int i) {
        this.l.setColor(i);
        this.o.setColor(i);
        invalidate();
    }

    public float getFooterLineHeight() {
        return this.v;
    }

    public void setFooterLineHeight(float f) {
        this.v = f;
        this.l.setStrokeWidth(this.v);
        invalidate();
    }

    public float getFooterIndicatorHeight() {
        return this.p;
    }

    public void setFooterIndicatorHeight(float f) {
        this.p = f;
        invalidate();
    }

    public float getFooterIndicatorPadding() {
        return this.r;
    }

    public void setFooterIndicatorPadding(float f) {
        this.r = f;
        invalidate();
    }

    public a getFooterIndicatorStyle() {
        return this.m;
    }

    public void setFooterIndicatorStyle(a aVar) {
        this.m = aVar;
        invalidate();
    }

    public b getLinePosition() {
        return this.n;
    }

    public void setLinePosition(b bVar) {
        this.n = bVar;
        invalidate();
    }

    public int getSelectedColor() {
        return this.i;
    }

    public void setSelectedColor(int i) {
        this.i = i;
        invalidate();
    }

    public void setSelectedBold(boolean z) {
        this.g = z;
        invalidate();
    }

    public int getTextColor() {
        return this.h;
    }

    public void setTextColor(int i) {
        this.f.setColor(i);
        this.h = i;
        invalidate();
    }

    public float getTextSize() {
        return this.f.getTextSize();
    }

    public void setTextSize(float f) {
        this.f.setTextSize(f);
        invalidate();
    }

    public float getTitlePadding() {
        return this.s;
    }

    public void setTitlePadding(float f) {
        this.s = f;
        invalidate();
    }

    public float getTopPadding() {
        return this.t;
    }

    public void setTopPadding(float f) {
        this.t = f;
        invalidate();
    }

    public float getClipPadding() {
        return this.u;
    }

    public void setClipPadding(float f) {
        this.u = f;
        invalidate();
    }

    public void setTypeface(Typeface typeface) {
        this.f.setTypeface(typeface);
        invalidate();
    }

    public Typeface getTypeface() {
        return this.f.getTypeface();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int count;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int i3;
        int i4;
        float f4;
        float f5;
        super.onDraw(canvas);
        if (this.a == null || (count = this.a.getAdapter().getCount()) == 0) {
            return;
        }
        if (this.c == -1 && this.a != null) {
            this.c = this.a.getCurrentItem();
        }
        Paint paint = this.f;
        ArrayList arrayList = new ArrayList();
        int count2 = this.a.getAdapter().getCount();
        int width = getWidth();
        int i5 = width / 2;
        for (int i6 = 0; i6 < count2; i6++) {
            Rect rect = new Rect();
            CharSequence a2 = a(i6);
            rect.right = (int) paint.measureText(a2, 0, a2.length());
            rect.bottom = (int) (paint.descent() - paint.ascent());
            int i7 = rect.right - rect.left;
            int i8 = rect.bottom - rect.top;
            rect.left = (int) ((i5 - (i7 / 2.0f)) + (((i6 - this.c) - this.d) * width));
            rect.right = rect.left + i7;
            rect.top = 0;
            rect.bottom = i8;
            arrayList.add(rect);
        }
        int size = arrayList.size();
        if (this.c >= size) {
            setCurrentItem(size - 1);
            return;
        }
        int i9 = count - 1;
        float width2 = getWidth() / 2.0f;
        int left = getLeft();
        float f6 = left + this.u;
        int width3 = getWidth();
        int height = getHeight();
        int i10 = left + width3;
        float f7 = i10 - this.u;
        int i11 = this.c;
        if (this.d <= 0.5d) {
            f = this.d;
        } else {
            i11++;
            f = 1.0f - this.d;
        }
        int i12 = i11;
        boolean z = f <= 0.25f;
        boolean z2 = f <= 0.05f;
        float f8 = (0.25f - f) / 0.25f;
        Rect rect2 = (Rect) arrayList.get(this.c);
        int i13 = width3;
        float f9 = rect2.right - rect2.left;
        if (rect2.left < f6) {
            b(rect2, f9, left);
        }
        if (rect2.right > f7) {
            a(rect2, f9, i10);
        }
        if (this.c > 0) {
            int i14 = this.c - 1;
            while (i14 >= 0) {
                Rect rect3 = (Rect) arrayList.get(i14);
                if (rect3.left < f6) {
                    f4 = f6;
                    int i15 = rect3.right - rect3.left;
                    b(rect3, i15, left);
                    Rect rect4 = (Rect) arrayList.get(i14 + 1);
                    f5 = width2;
                    if (rect3.right + this.s > rect4.left) {
                        rect3.left = (int) ((rect4.left - i15) - this.s);
                        rect3.right = rect3.left + i15;
                    }
                } else {
                    f4 = f6;
                    f5 = width2;
                }
                i14--;
                f6 = f4;
                width2 = f5;
            }
        }
        float f10 = width2;
        if (this.c < i9) {
            for (int i16 = this.c + 1; i16 < count; i16++) {
                Rect rect5 = (Rect) arrayList.get(i16);
                if (rect5.right > f7) {
                    int i17 = rect5.right - rect5.left;
                    a(rect5, i17, i10);
                    Rect rect6 = (Rect) arrayList.get(i16 - 1);
                    if (rect5.left - this.s < rect6.right) {
                        rect5.left = (int) (rect6.right + this.s);
                        rect5.right = rect5.left + i17;
                    }
                }
            }
        }
        int i18 = this.h >>> 24;
        int i19 = 0;
        while (i19 < count) {
            Rect rect7 = (Rect) arrayList.get(i19);
            if ((rect7.left <= left || rect7.left >= i10) && (rect7.right <= left || rect7.right >= i10)) {
                i2 = i10;
                i3 = left;
                i4 = i13;
            } else {
                boolean z3 = i19 == i12;
                CharSequence a3 = a(i19);
                this.f.setFakeBoldText(z3 && z2 && this.g);
                this.f.setColor(this.h);
                if (z3 && z) {
                    this.f.setAlpha(i18 - ((int) (i18 * f8)));
                }
                if (i19 < size - 1) {
                    Rect rect8 = (Rect) arrayList.get(i19 + 1);
                    if (rect7.right + this.s > rect8.left) {
                        int i20 = rect7.right - rect7.left;
                        rect7.left = (int) ((rect8.left - i20) - this.s);
                        rect7.right = rect7.left + i20;
                    }
                }
                i2 = i10;
                i4 = i13;
                i3 = left;
                canvas.drawText(a3, 0, a3.length(), rect7.left, this.t + rect7.bottom, this.f);
                if (z3 && z) {
                    this.f.setColor(this.i);
                    this.f.setAlpha((int) ((this.i >>> 24) * f8));
                    canvas.drawText(a3, 0, a3.length(), rect7.left, rect7.bottom + this.t, this.f);
                }
            }
            i19++;
            left = i3;
            i10 = i2;
            i13 = i4;
        }
        int i21 = i13;
        float f11 = this.v;
        float f12 = this.p;
        if (this.n == b.Top) {
            f2 = -f12;
            f3 = -f11;
            i = 0;
        } else {
            f2 = f12;
            f3 = f11;
            i = height;
        }
        this.j.reset();
        float f13 = i;
        float f14 = f13 - (f3 / 2.0f);
        this.j.moveTo(0.0f, f14);
        this.j.lineTo(i21, f14);
        this.j.close();
        canvas.drawPath(this.j, this.l);
        float f15 = f13 - f3;
        switch (this.m) {
            case Triangle:
                this.j.reset();
                this.j.moveTo(f10, f15 - f2);
                this.j.lineTo(f10 + f2, f15);
                this.j.lineTo(f10 - f2, f15);
                this.j.close();
                canvas.drawPath(this.j, this.o);
                return;
            case Underline:
                if (!z || i12 >= size) {
                    return;
                }
                Rect rect9 = (Rect) arrayList.get(i12);
                float f16 = rect9.right + this.q;
                float f17 = rect9.left - this.q;
                float f18 = f15 - f2;
                this.j.reset();
                this.j.moveTo(f17, f15);
                this.j.lineTo(f16, f15);
                this.j.lineTo(f16, f18);
                this.j.lineTo(f17, f18);
                this.j.close();
                this.o.setAlpha((int) (f8 * 255.0f));
                canvas.drawPath(this.j, this.o);
                this.o.setAlpha(255);
                return;
            default:
                return;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (super.onTouchEvent(motionEvent)) {
            return true;
        }
        if (this.a == null || this.a.getAdapter().getCount() == 0) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        switch (action) {
            case 0:
                this.y = MotionEventCompat.getPointerId(motionEvent, 0);
                this.x = motionEvent.getX();
                break;
            case 1:
            case 3:
                if (!this.z) {
                    int count = this.a.getAdapter().getCount();
                    float width = getWidth();
                    float f = width / 2.0f;
                    float f2 = width / 6.0f;
                    float f3 = f - f2;
                    float f4 = f + f2;
                    float x = motionEvent.getX();
                    if (x < f3) {
                        if (this.c > 0) {
                            if (action != 3) {
                                this.a.setCurrentItem(this.c - 1);
                            }
                            return true;
                        }
                    } else if (x > f4 && this.c < count - 1) {
                        if (action != 3) {
                            this.a.setCurrentItem(this.c + 1);
                        }
                        return true;
                    }
                }
                this.z = false;
                this.y = -1;
                if (this.a.isFakeDragging()) {
                    this.a.endFakeDrag();
                    break;
                }
                break;
            case 2:
                float x2 = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.y));
                float f5 = x2 - this.x;
                if (!this.z && Math.abs(f5) > this.w) {
                    this.z = true;
                }
                if (this.z) {
                    this.x = x2;
                    if (this.a.isFakeDragging() || this.a.beginFakeDrag()) {
                        this.a.fakeDragBy(f5);
                        break;
                    }
                }
                break;
            case 5:
                int actionIndex = MotionEventCompat.getActionIndex(motionEvent);
                this.x = MotionEventCompat.getX(motionEvent, actionIndex);
                this.y = MotionEventCompat.getPointerId(motionEvent, actionIndex);
                break;
            case 6:
                int actionIndex2 = MotionEventCompat.getActionIndex(motionEvent);
                if (MotionEventCompat.getPointerId(motionEvent, actionIndex2) == this.y) {
                    this.y = MotionEventCompat.getPointerId(motionEvent, actionIndex2 == 0 ? 1 : 0);
                }
                this.x = MotionEventCompat.getX(motionEvent, MotionEventCompat.findPointerIndex(motionEvent, this.y));
                break;
        }
        return true;
    }

    private void a(Rect rect, float f, int i) {
        rect.right = (int) (i - this.u);
        rect.left = (int) (rect.right - f);
    }

    private void b(Rect rect, float f, int i) {
        rect.left = (int) (i + this.u);
        rect.right = (int) (this.u + f);
    }

    public void setViewPager(ViewPager viewPager) {
        if (this.a == viewPager) {
            return;
        }
        if (this.a != null) {
            this.a.setOnPageChangeListener(null);
        }
        if (viewPager.getAdapter() == null) {
            throw new IllegalStateException("ViewPager does not have adapter instance.");
        }
        this.a = viewPager;
        this.a.setOnPageChangeListener(this);
        invalidate();
    }

    public void setOnCenterItemClickListener(c cVar) {
        this.A = cVar;
    }

    public void setCurrentItem(int i) {
        if (this.a == null) {
            throw new IllegalStateException("ViewPager has not been bound.");
        }
        this.a.setCurrentItem(i);
        this.c = i;
        invalidate();
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrollStateChanged(int i) {
        this.e = i;
        if (this.b != null) {
            this.b.onPageScrollStateChanged(i);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageScrolled(int i, float f, int i2) {
        this.c = i;
        this.d = f;
        invalidate();
        if (this.b != null) {
            this.b.onPageScrolled(i, f, i2);
        }
    }

    @Override // android.support.v4.view.ViewPager.OnPageChangeListener
    public void onPageSelected(int i) {
        if (this.e == 0) {
            this.c = i;
            invalidate();
        }
        if (this.b != null) {
            this.b.onPageSelected(i);
        }
    }

    public void setOnPageChangeListener(ViewPager.OnPageChangeListener onPageChangeListener) {
        this.b = onPageChangeListener;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        float f;
        int size = View.MeasureSpec.getSize(i);
        if (View.MeasureSpec.getMode(i2) == 1073741824) {
            f = View.MeasureSpec.getSize(i2);
        } else {
            this.k.setEmpty();
            this.k.bottom = (int) (this.f.descent() - this.f.ascent());
            f = (this.k.bottom - this.k.top) + this.v + this.r + this.t;
            if (this.m != a.None) {
                f += this.p;
            }
        }
        setMeasuredDimension(size, (int) f);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.c = savedState.a;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.a = this.c;
        return savedState;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes6.dex */
    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.viewpagerindicator.TitlePageIndicator.SavedState.1
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

    private CharSequence a(int i) {
        CharSequence pageTitle = this.a.getAdapter().getPageTitle(i);
        return pageTitle == null ? "" : pageTitle;
    }
}
