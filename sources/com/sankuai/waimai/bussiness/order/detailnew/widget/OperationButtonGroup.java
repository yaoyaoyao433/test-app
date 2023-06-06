package com.sankuai.waimai.bussiness.order.detailnew.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.view.MarginLayoutParamsCompat;
import android.support.v4.view.ViewCompat;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class OperationButtonGroup extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private boolean d;
    private int e;

    public OperationButtonGroup(@NonNull Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "018f4d9fa9f2cfb7cb1f45f527fa9e0f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "018f4d9fa9f2cfb7cb1f45f527fa9e0f");
        }
    }

    public OperationButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0acb357938dddfdef5dde2ab3064a69a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0acb357938dddfdef5dde2ab3064a69a");
        }
    }

    public OperationButtonGroup(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bd714d370b16b4483d37d5fc26c19753", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bd714d370b16b4483d37d5fc26c19753");
            return;
        }
        this.d = false;
        Object[] objArr2 = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1cdc383de07597fc9b38d5fc2b163268", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1cdc383de07597fc9b38d5fc2b163268");
            return;
        }
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.lineSpacing, R.attr.itemSpacing, R.attr.maxColumn}, 0, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.c = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        this.e = obtainStyledAttributes.getInteger(2, 5);
        obtainStyledAttributes.recycle();
    }

    public int getLineSpacing() {
        return this.b;
    }

    public void setLineSpacing(int i) {
        this.b = i;
    }

    public int getItemSpacing() {
        return this.c;
    }

    public void setItemSpacing(int i) {
        this.c = i;
    }

    public void setSingleLine(boolean z) {
        this.d = z;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e1aa2bc8963de615ee9171fddac6cb0a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e1aa2bc8963de615ee9171fddac6cb0a");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        int i6 = (mode == Integer.MIN_VALUE || mode == 1073741824) ? size : Integer.MAX_VALUE;
        a((i6 - getPaddingLeft()) - getPaddingRight(), i, i2);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = i6 - getPaddingRight();
        int i7 = paddingLeft;
        int i8 = paddingTop;
        int i9 = i8;
        int i10 = 0;
        int i11 = 0;
        while (i10 < getChildCount()) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i4 = marginLayoutParams.leftMargin + i5;
                    i3 = marginLayoutParams.rightMargin + i5;
                } else {
                    i3 = 0;
                    i4 = 0;
                }
                if (i7 + i4 + childAt.getMeasuredWidth() > paddingRight && !this.d) {
                    i7 = getPaddingLeft();
                    i9 = i8 + this.b;
                }
                int measuredWidth = i7 + i4 + childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight() + i9;
                if (measuredWidth > i11) {
                    i11 = measuredWidth;
                }
                i7 += i4 + i3 + childAt.getMeasuredWidth() + this.c;
                if (i10 == getChildCount() - 1) {
                    i11 += i3;
                }
                i8 = measuredHeight;
            }
            i10++;
            i5 = 0;
        }
        setMeasuredDimension(b(size, mode, i11 + getPaddingRight()), b(size2, mode2, i8 + getPaddingBottom()));
    }

    private int a(int i, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c5366052bf94f81ea3c8a04de147e7f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c5366052bf94f81ea3c8a04de147e7f")).intValue();
        }
        int i7 = 0;
        for (int i8 = 0; i8 < getChildCount(); i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                measureChild(childAt, i2, i3);
                int measuredWidth = childAt.getMeasuredWidth();
                if (measuredWidth <= i7) {
                    measuredWidth = i7;
                }
                i7 = measuredWidth;
            }
        }
        int childCount = getChildCount();
        Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(i7), Integer.valueOf(childCount)};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "821a767672d24fe5468092cbeede1047", RobustBitConfig.DEFAULT_VALUE)) {
            i5 = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "821a767672d24fe5468092cbeede1047")).intValue();
        } else {
            if (this.d) {
                if (childCount > this.e) {
                    int i9 = (i - this.c) / i7;
                    if (i9 > this.e) {
                        i9 = this.e;
                    }
                    i6 = (i - ((i9 - 1) * this.c)) / i9;
                } else if (i7 * childCount <= i) {
                    i5 = i / childCount;
                } else {
                    i4 = i / i7;
                    i6 = (i - ((i4 - 1) * this.c)) / i4;
                }
            } else {
                if (childCount > this.e) {
                    i4 = i / i7;
                    if (i4 > this.e) {
                        i4 = this.e;
                    }
                } else if (i7 * childCount <= i) {
                    i5 = i / childCount;
                } else {
                    i4 = i / i7;
                }
                i6 = (i - ((i4 - 1) * this.c)) / i4;
            }
            i5 = i6;
        }
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt2 = getChildAt(i10);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(1073741824 | i5, i3);
            }
        }
        return i5;
    }

    private static int b(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "db91e4e7b23121795df2f07da722e416", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "db91e4e7b23121795df2f07da722e416")).intValue();
        }
        if (i2 != Integer.MIN_VALUE) {
            return i2 != 1073741824 ? i3 : i;
        }
        return Math.min(i3, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "313b8a3fef4700998b1a504e99f1fd1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "313b8a3fef4700998b1a504e99f1fd1c");
        } else if (getChildCount() != 0) {
            boolean z2 = ViewCompat.getLayoutDirection(this) == 1;
            int paddingRight = z2 ? getPaddingRight() : getPaddingLeft();
            int paddingLeft = z2 ? getPaddingLeft() : getPaddingRight();
            int paddingTop = getPaddingTop();
            int i7 = (i3 - i) - paddingLeft;
            int i8 = paddingRight;
            int i9 = paddingTop;
            for (int i10 = 0; i10 < getChildCount(); i10++) {
                View childAt = getChildAt(i10);
                if (childAt.getVisibility() != 8) {
                    ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        i6 = MarginLayoutParamsCompat.getMarginStart(marginLayoutParams);
                        i5 = MarginLayoutParamsCompat.getMarginEnd(marginLayoutParams);
                    } else {
                        i5 = 0;
                        i6 = 0;
                    }
                    int measuredWidth = i8 + i6 + childAt.getMeasuredWidth();
                    if (!this.d && measuredWidth > i7) {
                        i9 = paddingTop + this.b;
                        i8 = paddingRight;
                    }
                    int i11 = i8 + i6;
                    int measuredWidth2 = childAt.getMeasuredWidth() + i11;
                    int measuredHeight = childAt.getMeasuredHeight() + i9;
                    if (z2) {
                        childAt.layout(i7 - measuredWidth2, i9, (i7 - i8) - i6, measuredHeight);
                    } else {
                        childAt.layout(i11, i9, measuredWidth2, measuredHeight);
                    }
                    i8 += i6 + i5 + childAt.getMeasuredWidth() + this.c;
                    paddingTop = measuredHeight;
                }
            }
        }
    }
}
