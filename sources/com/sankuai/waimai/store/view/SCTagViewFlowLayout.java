package com.sankuai.waimai.store.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCTagViewFlowLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    public boolean b;
    private final int c;
    private final int d;
    private final int e;
    private int f;
    private a g;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public SCTagViewFlowLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b4c24a042f364a7c1abd2466d34df32e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b4c24a042f364a7c1abd2466d34df32e");
        }
    }

    private SCTagViewFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, null, 0);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5501aadbef06e989c9464126b016fdfd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5501aadbef06e989c9464126b016fdfd");
        }
    }

    public SCTagViewFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d3f08312a411f8db864de92355aa9789", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d3f08312a411f8db864de92355aa9789");
            return;
        }
        this.f = 0;
        this.b = true;
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, new int[]{R.attr.vertical_divider, R.attr.horizontal_divider, R.attr.max_lines}, 0, 0);
        try {
            this.c = obtainStyledAttributes.getDimensionPixelSize(1, 15);
            this.d = obtainStyledAttributes.getDimensionPixelSize(0, 10);
            this.e = obtainStyledAttributes.getInteger(2, 1);
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    public int getShowingCount() {
        return this.f + 1;
    }

    public void setExposeCallback(a aVar) {
        this.g = aVar;
    }

    @Override // android.view.View
    @SuppressLint({"DrawAllocation"})
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c85e3082e7b37506978c313764f6c6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c85e3082e7b37506978c313764f6c6e");
            return;
        }
        int size = View.MeasureSpec.getSize(i);
        measureChildren(i, i2);
        int childCount = getChildCount();
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = i4 + measuredWidth;
            this.f = i3;
            if (i7 > size) {
                i5++;
                int i8 = measuredWidth + this.c;
                if (i5 >= this.e) {
                    this.f = i3 - 1;
                    int i9 = i5 - 1;
                    i6 = ((i9 + 1) * measuredHeight) + (i9 * this.d);
                    break;
                }
                i6 = ((i5 + 1) * measuredHeight) + (this.d * i5);
                i4 = i8;
                i3++;
            } else {
                if (size - i7 <= this.c) {
                    i5++;
                    if (i5 >= this.e) {
                        int i10 = i5 - 1;
                        i6 = ((i10 + 1) * measuredHeight) + (i10 * this.d);
                        break;
                    }
                    i6 = ((i5 + 1) * measuredHeight) + (this.d * i5);
                    i4 = 0;
                } else {
                    i4 = i7 + this.c;
                    i6 = ((i5 + 1) * measuredHeight) + (this.d * i5);
                }
                i3++;
            }
        }
        setMeasuredDimension(size, i6);
        this.b = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a4dfa480a69008cd3e5b1e10f3396f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a4dfa480a69008cd3e5b1e10f3396f0");
            return;
        }
        int childCount = getChildCount();
        int i5 = i3 - i;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            if (i6 + measuredWidth > i5) {
                i7++;
                i8 = (i7 * measuredHeight) + (this.d * i7);
                i6 = 0;
            }
            int i10 = measuredWidth + i6;
            childAt.layout(i6, i8, i10, measuredHeight + i8);
            i6 = this.c + i10;
        }
    }
}
