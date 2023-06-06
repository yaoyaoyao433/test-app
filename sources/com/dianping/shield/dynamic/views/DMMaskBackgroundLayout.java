package com.dianping.shield.dynamic.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMMaskBackgroundLayout extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DMMaskBackgroundLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ff56b835c3f80d46cfb4044c6bdd9d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ff56b835c3f80d46cfb4044c6bdd9d1");
        }
    }

    public DMMaskBackgroundLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1594673afa2e6e1807b16a3de1f07673", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1594673afa2e6e1807b16a3de1f07673");
        }
    }

    public DMMaskBackgroundLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4dbf2e4bd174ffe24f6cdb01f47e3864", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4dbf2e4bd174ffe24f6cdb01f47e3864");
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b867326fc2d8fd646d508e32b5735ffc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b867326fc2d8fd646d508e32b5735ffc");
            return;
        }
        super.onMeasure(i, i2);
        int i5 = 0;
        while (true) {
            if (i5 >= getChildCount()) {
                i3 = 0;
                i4 = 0;
                break;
            }
            View childAt = getChildAt(1);
            if (!(childAt instanceof DMWrapperView)) {
                i3 = childAt.getMeasuredHeight();
                i4 = childAt.getMeasuredWidth();
                break;
            }
            i5++;
        }
        for (int i6 = 0; i6 < getChildCount(); i6++) {
            View childAt2 = getChildAt(i6);
            if (childAt2 instanceof DMWrapperView) {
                ViewGroup.LayoutParams layoutParams = childAt2.getLayoutParams();
                layoutParams.width = i4;
                layoutParams.height = i3;
            }
        }
    }
}
