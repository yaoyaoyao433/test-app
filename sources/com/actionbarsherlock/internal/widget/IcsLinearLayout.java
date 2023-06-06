package com.actionbarsherlock.internal.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class IcsLinearLayout extends LinearLayout {
    private static final boolean IS_HONEYCOMB;
    private static final int LinearLayout_divider = 0;
    private static final int LinearLayout_dividerPadding = 3;
    private static final int LinearLayout_measureWithLargestChild = 1;
    private static final int LinearLayout_showDividers = 2;
    private static final int[] R_styleable_LinearLayout = {16843049, 16843476, 16843561, 16843562};
    public static final int SHOW_DIVIDER_BEGINNING = 1;
    public static final int SHOW_DIVIDER_END = 4;
    public static final int SHOW_DIVIDER_MIDDLE = 2;
    public static final int SHOW_DIVIDER_NONE = 0;
    private boolean mClipDivider;
    private Drawable mDivider;
    protected int mDividerHeight;
    private int mDividerPadding;
    protected int mDividerWidth;
    private int mShowDividers;
    private boolean mUseLargestChild;

    static {
        IS_HONEYCOMB = Build.VERSION.SDK_INT >= 11;
    }

    public IcsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R_styleable_LinearLayout);
        setDividerDrawable(obtainStyledAttributes.getDrawable(0));
        this.mShowDividers = obtainStyledAttributes.getInt(2, 0);
        this.mDividerPadding = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.mUseLargestChild = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout
    public void setShowDividers(int i) {
        if (i != this.mShowDividers) {
            requestLayout();
            invalidate();
        }
        this.mShowDividers = i;
    }

    @Override // android.widget.LinearLayout
    public int getShowDividers() {
        return this.mShowDividers;
    }

    @Override // android.widget.LinearLayout
    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.mDivider) {
            return;
        }
        this.mDivider = drawable;
        this.mClipDivider = drawable instanceof ColorDrawable;
        if (drawable != null) {
            this.mDividerWidth = drawable.getIntrinsicWidth();
            this.mDividerHeight = drawable.getIntrinsicHeight();
        } else {
            this.mDividerWidth = 0;
            this.mDividerHeight = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    @Override // android.widget.LinearLayout
    public void setDividerPadding(int i) {
        this.mDividerPadding = i;
    }

    @Override // android.widget.LinearLayout
    public int getDividerPadding() {
        return this.mDividerPadding;
    }

    public int getDividerWidth() {
        return this.mDividerWidth;
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i, int i2, int i3, int i4) {
        int indexOfChild = indexOfChild(view);
        int orientation = getOrientation();
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        if (hasDividerBeforeChildAt(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.topMargin = this.mDividerHeight;
            } else {
                layoutParams.leftMargin = this.mDividerWidth;
            }
        }
        if (isShowDividerEnd() && isLastVisibilityChild(indexOfChild)) {
            if (orientation == 1) {
                layoutParams.bottomMargin = this.mDividerHeight;
            } else {
                layoutParams.rightMargin = this.mDividerWidth;
            }
        } else if (orientation == 1) {
            layoutParams.bottomMargin = 0;
        } else {
            layoutParams.rightMargin = 0;
        }
        super.measureChildWithMargins(view, i, i2, i3, i4);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.mDivider != null) {
            if (getOrientation() == 1) {
                drawDividersVerticalInternal(canvas);
            } else {
                drawDividersHorizontalInternal(canvas);
            }
        }
        super.onDraw(canvas);
    }

    void drawDividersVerticalInternal(Canvas canvas) {
        int bottom;
        int childCount = getChildCount();
        int i = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (hasDividerBeforeChildAt(i2)) {
                    drawHorizontalDividerInternal(canvas, childAt.getTop() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).topMargin);
                }
                i = i2;
            }
        }
        if (isShowDividerEnd()) {
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                bottom = (getHeight() - getPaddingBottom()) - this.mDividerHeight;
            } else {
                bottom = childAt2.getBottom();
            }
            drawHorizontalDividerInternal(canvas, bottom);
        }
    }

    void drawDividersHorizontalInternal(Canvas canvas) {
        int right;
        int childCount = getChildCount();
        int i = -1;
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                if (hasDividerBeforeChildAt(i2)) {
                    drawVerticalDividerInternal(canvas, childAt.getLeft() - ((LinearLayout.LayoutParams) childAt.getLayoutParams()).leftMargin);
                }
                i = i2;
            }
        }
        if (isShowDividerEnd()) {
            View childAt2 = getChildAt(i);
            if (childAt2 == null) {
                right = (getWidth() - getPaddingRight()) - this.mDividerWidth;
            } else {
                right = childAt2.getRight();
            }
            drawVerticalDividerInternal(canvas, right);
        }
    }

    void drawHorizontalDividerInternal(Canvas canvas, int i) {
        if (this.mClipDivider && !IS_HONEYCOMB) {
            canvas.save();
            canvas.clipRect(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
            this.mDivider.draw(canvas);
            canvas.restore();
            return;
        }
        this.mDivider.setBounds(getPaddingLeft() + this.mDividerPadding, i, (getWidth() - getPaddingRight()) - this.mDividerPadding, this.mDividerHeight + i);
        this.mDivider.draw(canvas);
    }

    void drawVerticalDividerInternal(Canvas canvas, int i) {
        if (this.mClipDivider && !IS_HONEYCOMB) {
            canvas.save();
            canvas.clipRect(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
            this.mDivider.draw(canvas);
            canvas.restore();
            return;
        }
        this.mDivider.setBounds(i, getPaddingTop() + this.mDividerPadding, this.mDividerWidth + i, (getHeight() - getPaddingBottom()) - this.mDividerPadding);
        this.mDivider.draw(canvas);
    }

    protected boolean hasDividerBeforeChildAt(int i) {
        if (i == 0) {
            return (this.mShowDividers & 1) != 0;
        } else if (i == getChildCount()) {
            return (this.mShowDividers & 4) != 0;
        } else if ((this.mShowDividers & 2) != 0) {
            for (int i2 = i - 1; i2 >= 0; i2--) {
                if (getChildAt(i2).getVisibility() != 8) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    private boolean isShowDividerEnd() {
        return (this.mShowDividers & 4) != 0;
    }

    @Override // android.widget.LinearLayout
    public boolean isMeasureWithLargestChildEnabled() {
        return this.mUseLargestChild;
    }

    @Override // android.widget.LinearLayout
    public void setMeasureWithLargestChildEnabled(boolean z) {
        this.mUseLargestChild = z;
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.mUseLargestChild) {
            switch (getOrientation()) {
                case 0:
                    useLargestChildHorizontal();
                    break;
                case 1:
                    useLargestChildVertical();
                    break;
            }
        }
        invalidate();
    }

    private void useLargestChildHorizontal() {
        int measuredWidth;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            i = Math.max(getChildAt(i2).getMeasuredWidth(), i);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.weight > 0.0f) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(i, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredHeight(), 1073741824));
                    measuredWidth = i3 + i;
                } else {
                    measuredWidth = i3 + childAt.getMeasuredWidth();
                }
                i3 = measuredWidth + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(i3 + getPaddingLeft() + getPaddingRight(), getMeasuredHeight());
    }

    private void useLargestChildVertical() {
        int measuredHeight;
        int childCount = getChildCount();
        int i = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            i = Math.max(getChildAt(i2).getMeasuredHeight(), i);
        }
        int i3 = 0;
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (childAt != null && childAt.getVisibility() != 8) {
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
                if (layoutParams.weight > 0.0f) {
                    childAt.measure(View.MeasureSpec.makeMeasureSpec(childAt.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i, 1073741824));
                    measuredHeight = i3 + i;
                } else {
                    measuredHeight = i3 + childAt.getMeasuredHeight();
                }
                i3 = measuredHeight + layoutParams.leftMargin + layoutParams.rightMargin;
            }
        }
        setMeasuredDimension(getMeasuredWidth(), i3 + getPaddingLeft() + getPaddingRight());
    }

    private boolean isLastVisibilityChild(int i) {
        int childCount = getChildCount();
        for (int i2 = i + 1; i2 < childCount; i2++) {
            View childAt = getChildAt(i2);
            if (childAt != null && childAt.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }
}
