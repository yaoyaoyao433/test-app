package com.meituan.android.base.ui.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class RecommendGridLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public RecommendGridLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d0f7fbfcaa8b669ce7704b12db89992", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d0f7fbfcaa8b669ce7704b12db89992");
        }
    }

    private RecommendGridLayout(Context context, AttributeSet attributeSet) {
        this(context, null, R.attr.recommendGridLayout);
        Object[] objArr = {context, null};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d7425f7ceeea75dc3d6037cb52fa9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d7425f7ceeea75dc3d6037cb52fa9f");
        }
    }

    public RecommendGridLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e4d57331f4d37f06008aa4a4983901ac", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e4d57331f4d37f06008aa4a4983901ac");
            return;
        }
        Resources resources = getResources();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.rowPadding, R.attr.columnPadding}, i, 0);
        float dimension = resources.getDimension(R.dimen.default_row_padding);
        float dimension2 = resources.getDimension(R.dimen.default_column_padding);
        this.b = (int) obtainStyledAttributes.getDimension(0, dimension);
        this.c = (int) obtainStyledAttributes.getDimension(1, dimension2);
        obtainStyledAttributes.recycle();
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "331ed54e572292c9d21477d083fd47c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "331ed54e572292c9d21477d083fd47c7");
        } else if (getChildCount() < 4) {
            super.addView(view);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3faefb9dea3d617c68afd3e2efc6d058", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3faefb9dea3d617c68afd3e2efc6d058");
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode == 0) {
            setMeasuredDimension(0, 0);
            return;
        }
        int min = Math.min(getChildCount(), 4);
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec((size - this.c) / 2, 1073741824);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(0, 0);
        int i3 = 0;
        for (int i4 = 0; i4 < min; i4++) {
            View childAt = getChildAt(i4);
            childAt.measure(makeMeasureSpec, makeMeasureSpec2);
            if (i4 % 2 == 0) {
                i3 += childAt.getMeasuredHeight();
                if (i4 > 0) {
                    i3 += this.b;
                }
            }
        }
        setMeasuredDimension(size, i3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ae656a8a12baa85f8c76fc104113fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ae656a8a12baa85f8c76fc104113fb");
            return;
        }
        int min = Math.min(getChildCount(), 4);
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < min; i7++) {
            View childAt = getChildAt(i7);
            childAt.layout(i5, i6, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + i6);
            if (i7 % 2 == 0) {
                i5 = i5 + childAt.getMeasuredWidth() + this.c;
            } else {
                i6 = i6 + childAt.getMeasuredHeight() + this.b;
                i5 = 0;
            }
        }
    }
}
