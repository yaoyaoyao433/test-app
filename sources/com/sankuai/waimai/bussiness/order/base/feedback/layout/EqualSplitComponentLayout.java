package com.sankuai.waimai.bussiness.order.base.feedback.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class EqualSplitComponentLayout extends LinearLayout {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;
    private int d;
    private boolean e;
    private int f;
    private float g;
    private int h;
    private int i;
    private int j;
    private int k;

    public EqualSplitComponentLayout(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8635182e5b02bc3f0ff7ad029c67dd9e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8635182e5b02bc3f0ff7ad029c67dd9e");
        }
    }

    public EqualSplitComponentLayout(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "edfd531dd0c875c2c76402d549c7f719", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "edfd531dd0c875c2c76402d549c7f719");
        }
    }

    public EqualSplitComponentLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ee2b89b9f102b2c51aec66784509243", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ee2b89b9f102b2c51aec66784509243");
        }
    }

    public EqualSplitComponentLayout(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2826bff2a9677f94f0bcf5448f2d6d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2826bff2a9677f94f0bcf5448f2d6d");
            return;
        }
        this.c = -1;
        this.e = false;
        this.f = 0;
        this.g = 1.0f;
        this.i = 0;
        this.j = 0;
        this.k = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.wholeScaled, R.attr.cellWidth, R.attr.item_text_id, R.attr.item_text_size}, i, 0);
        this.e = obtainStyledAttributes.getBoolean(0, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 30);
        this.c = obtainStyledAttributes.getResourceId(2, -1);
        this.b = obtainStyledAttributes.getDimensionPixelSize(3, g.d(getContext(), 11.0f));
        int a2 = g.a(context);
        int dimensionPixelOffset = context.getResources().getDimensionPixelOffset(R.dimen.wm_order_card_default_width);
        this.f = a2 - (g.a(getContext(), 16.0f) * 2);
        this.g = (a2 * 1.0f) / dimensionPixelOffset;
        setOrientation(0);
        obtainStyledAttributes.recycle();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4a3762809b814b10af4036ad659cd7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4a3762809b814b10af4036ad659cd7d");
            return;
        }
        super.onMeasure(i, i2);
        int childCount = getChildCount();
        this.k = getMaxWidth();
        this.j = (this.f - (this.k * childCount)) / (childCount - 1);
        if (this.j <= 0) {
            int i3 = (int) ((this.f * 1.0d) / childCount);
            this.h = i3;
            this.i = 0;
            a(i, i3, i3);
            return;
        }
        this.h = this.k;
        this.i = this.j;
        if (this.e) {
            a(i, i2, this.k);
        }
    }

    private void a(int i, int i2, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4901f3d942a61808c74ddf5401384c2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4901f3d942a61808c74ddf5401384c2c");
            return;
        }
        for (int i4 = 0; i4 < getChildCount(); i4++) {
            getChildAt(i4).measure(getChildMeasureSpec(i, 0, i3), this.e ? getChildMeasureSpec(i2, 0, i3) : i2);
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        AppCompatTextView appCompatTextView;
        char c = 1;
        int i5 = 2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e8904994c897ff071116b44658862aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e8904994c897ff071116b44658862aa");
            return;
        }
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int i6 = 0;
        int i7 = 0;
        while (i6 < childCount) {
            View childAt = getChildAt(i6);
            int measuredHeight = childAt.getMeasuredHeight();
            float measuredWidth = (childAt.getMeasuredWidth() * 1.0f) / this.d;
            Object[] objArr2 = new Object[i5];
            objArr2[0] = childAt;
            objArr2[c] = Float.valueOf(measuredWidth);
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1c93af7d7b0e9521672bcab23b58cfc7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1c93af7d7b0e9521672bcab23b58cfc7");
            } else if (this.c != -1 && (appCompatTextView = (AppCompatTextView) childAt.findViewById(this.c)) != null) {
                appCompatTextView.setTextSize(0, this.b * measuredWidth);
            }
            childAt.layout(i7, 0, this.h + i7, ((i4 - i2) + measuredHeight) / 2);
            i7 += this.h + (this.i > 0 ? this.i : 0);
            i6++;
            c = 1;
            i5 = 2;
        }
    }

    private int getMaxWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e457b4a8f52c47e20df84b764b2305f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e457b4a8f52c47e20df84b764b2305f")).intValue();
        }
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            i = Math.min(Math.max(i, getChildAt(i2).getMeasuredWidth()), this.d);
        }
        return i;
    }
}
