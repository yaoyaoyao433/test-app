package com.meituan.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class HeightLimitedListView extends ListView {
    public static ChangeQuickRedirect a;
    private int b;

    public HeightLimitedListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6957a2138cc12f852182fa58105e3e09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6957a2138cc12f852182fa58105e3e09");
        } else {
            this.b = -1;
        }
    }

    public HeightLimitedListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "606bd7b4cecef53e6b824461bd2ba0e9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "606bd7b4cecef53e6b824461bd2ba0e9");
        } else {
            this.b = -1;
        }
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f799ef87985133dc19674a4ab0b4868c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f799ef87985133dc19674a4ab0b4868c");
            return;
        }
        this.b = i;
        requestLayout();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a7e18aca1b7a29e08026d07f0b0a801", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a7e18aca1b7a29e08026d07f0b0a801");
            return;
        }
        if (this.b > 0) {
            int i3 = (int) (this.b * getResources().getDisplayMetrics().density);
            int size = View.MeasureSpec.getSize(i2);
            if (size > i3) {
                size = i3;
            }
            i2 = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
        }
        super.onMeasure(i, i2);
    }
}
