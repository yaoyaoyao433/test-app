package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.constraint.R;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TextWithImageLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private final int b;
    private int c;
    private boolean d;
    private int e;
    private int[] f;

    public TextWithImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3152b3349f8e6cf8ec698107efb8ddea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3152b3349f8e6cf8ec698107efb8ddea");
            return;
        }
        this.b = 4;
        this.e = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.margin, R.attr.layout_center});
        this.c = obtainStyledAttributes.getDimensionPixelSize(0, -1);
        this.d = obtainStyledAttributes.getBoolean(1, false);
        if (this.c < 0) {
            this.c = g.a(context, 4.0f);
        }
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int measuredHeight;
        int i3;
        int i4 = 0;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b6f7ceca2c126efe68d7f6eba770f75", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b6f7ceca2c126efe68d7f6eba770f75");
            return;
        }
        super.onMeasure(i, i2);
        int size = View.MeasureSpec.getSize(i);
        View.MeasureSpec.getSize(i2);
        int childCount = getChildCount();
        View childAt = getChildAt(0);
        if (childCount > 1) {
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight2 = childAt.getMeasuredHeight();
            int i5 = 1;
            int i6 = 0;
            measuredHeight = 0;
            while (i5 < childCount) {
                View childAt2 = getChildAt(i5);
                if (this.f == null) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i4, i4), View.MeasureSpec.makeMeasureSpec(i4, i4));
                    i3 = childAt2.getVisibility() == 8 ? 0 : childAt2.getMeasuredWidth();
                } else {
                    i3 = this.f[i5 - 1];
                    childAt2.measure(i3 | 1073741824, childAt2.getMeasuredHeight() | 1073741824);
                }
                i6 += i3;
                if (childAt2.getVisibility() != 8 && measuredHeight < childAt2.getMeasuredHeight()) {
                    measuredHeight = childAt2.getMeasuredHeight();
                }
                i5++;
                i4 = 0;
            }
            int i7 = this.c * (childCount - 1);
            int i8 = measuredWidth + i6 + i7;
            if (i8 > size) {
                measuredWidth = (size - i6) - i7;
            } else if (this.d) {
                this.e = (size - i8) / 2;
            }
            if (measuredHeight2 > measuredHeight) {
                measuredHeight = measuredHeight2;
            }
            childAt.measure(measuredWidth | 1073741824, measuredHeight2 | 1073741824);
        } else {
            childAt.measure(childAt.getMeasuredWidth(), childAt.getMeasuredHeight());
            measuredHeight = childAt.getMeasuredHeight();
        }
        setMeasuredDimension(size, measuredHeight);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0b6c77fffe6804fe8dc4472fffd015c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0b6c77fffe6804fe8dc4472fffd015c");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i5 = this.e;
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            int measuredWidth = childAt.getMeasuredWidth();
            int measuredHeight = childAt.getMeasuredHeight();
            int i7 = ((i4 - i2) / 2) - (measuredHeight / 2);
            int i8 = measuredWidth + i5;
            childAt.layout(i5, i7, i8, measuredHeight + i7);
            i5 = this.c + i8;
        }
    }

    public int[] getChildWidthList() {
        return this.f;
    }

    public void setChildWidthList(int[] iArr) {
        this.f = iArr;
    }
}
