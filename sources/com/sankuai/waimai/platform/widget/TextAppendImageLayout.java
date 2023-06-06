package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class TextAppendImageLayout extends ViewGroup {
    public static ChangeQuickRedirect a;
    public String b;
    private int c;
    private int d;
    private float e;
    private int f;
    private int g;

    public TextAppendImageLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6660b52eb5790174e0d5e43a0d18a159", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6660b52eb5790174e0d5e43a0d18a159");
            return;
        }
        this.b = "TextAppendImageLayout DEBUG";
        this.f = 5;
        this.g = 6;
    }

    public TextAppendImageLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "334a31c839ca6eea7ed4c9976863d01d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "334a31c839ca6eea7ed4c9976863d01d");
            return;
        }
        this.b = "TextAppendImageLayout DEBUG";
        this.f = 5;
        this.g = 6;
    }

    public TextAppendImageLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e1a550388b23f4a7eb2c449e6982239", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e1a550388b23f4a7eb2c449e6982239");
            return;
        }
        this.b = "TextAppendImageLayout DEBUG";
        this.f = 5;
        this.g = 6;
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9339705d6e949f672116844d96a6ffb7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9339705d6e949f672116844d96a6ffb7");
            return;
        }
        int childCount = getChildCount();
        int size = View.MeasureSpec.getSize(i);
        if (childCount == 2) {
            measureChildren(i, i2);
            if (getChildAt(0) instanceof TextView) {
                TextView textView = (TextView) getChildAt(0);
                Object[] objArr2 = {textView};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1ef1cadc6fe1f515c7a465b654bf7412", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1ef1cadc6fe1f515c7a465b654bf7412");
                } else {
                    Layout layout = textView.getLayout();
                    this.d = layout.getLineTop(layout.getLineCount() - 1);
                    this.e = layout.getLineRight(layout.getLineCount() - 1);
                }
                View childAt = getChildAt(1);
                if (textView.getMeasuredWidth() + childAt.getMeasuredWidth() + this.f <= size) {
                    setMeasuredDimension(textView.getMeasuredWidth() + childAt.getMeasuredWidth() + this.f, Math.max(textView.getMeasuredHeight(), childAt.getMeasuredHeight()));
                    this.c = 1;
                    return;
                } else if (getChildAt(0) instanceof TextView) {
                    if (this.e + childAt.getMeasuredWidth() + this.f > size) {
                        setMeasuredDimension(textView.getMeasuredWidth(), textView.getMeasuredHeight() + childAt.getMeasuredHeight());
                        this.c = 3;
                        return;
                    }
                    setMeasuredDimension(textView.getMeasuredWidth(), Math.max(textView.getMeasuredHeight(), this.d + childAt.getMeasuredHeight()));
                    this.c = 2;
                    return;
                } else {
                    return;
                }
            }
            throw new RuntimeException("TextAppendImageLayout first child view not a TextView");
        }
        throw new RuntimeException("TextAppendImageLayout child count must is 2");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4cc3a9b333d70865f6fe1683c9155d99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4cc3a9b333d70865f6fe1683c9155d99");
        } else if (this.c == 1 || this.c == 2) {
            TextView textView = (TextView) getChildAt(0);
            View childAt = getChildAt(1);
            textView.layout(0, 0, textView.getMeasuredWidth(), textView.getMeasuredHeight());
            int i5 = ((int) this.e) + this.f;
            int i6 = this.d;
            if (textView.getLayout().getLineCount() == 1) {
                i6 += this.g;
            }
            childAt.layout(i5, i6, childAt.getMeasuredWidth() + i5, childAt.getMeasuredHeight() + i6);
        } else if (this.c == 3) {
            View childAt2 = getChildAt(0);
            View childAt3 = getChildAt(1);
            childAt2.layout(0, 0, childAt2.getMeasuredWidth(), childAt2.getMeasuredHeight());
            childAt3.layout(0, childAt2.getMeasuredHeight(), childAt3.getMeasuredWidth(), childAt2.getMeasuredHeight() + childAt3.getMeasuredHeight());
        }
    }
}
