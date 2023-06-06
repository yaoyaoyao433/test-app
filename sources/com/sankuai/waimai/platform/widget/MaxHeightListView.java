package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class MaxHeightListView extends ListView {
    public static ChangeQuickRedirect a;
    private int b;

    public MaxHeightListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a01934010a346d96711930483af779", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a01934010a346d96711930483af779");
        } else {
            this.b = Integer.MAX_VALUE;
        }
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2258face1f2b8a5ddddd7f600a8ee53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2258face1f2b8a5ddddd7f600a8ee53");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, 0);
    }

    public MaxHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4eeaa6259d5737f07e871d0a619a879b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4eeaa6259d5737f07e871d0a619a879b");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        Object[] objArr = {attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7b4cc9fca9425c197b5f5980ad47734d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7b4cc9fca9425c197b5f5980ad47734d");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16843040}, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        obtainStyledAttributes.recycle();
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ea224f34173b1ec5fea9ac607f1be785", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ea224f34173b1ec5fea9ac607f1be785");
        } else if (i == this.b) {
        } else {
            this.b = i;
            requestLayout();
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a14e3f63830774700eb1c6d1bb95fb6a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a14e3f63830774700eb1c6d1bb95fb6a");
            return;
        }
        super.onMeasure(i, i2);
        if (this.b < getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), this.b);
        }
    }
}
