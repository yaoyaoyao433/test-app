package com.sankuai.waimai.restaurant.shopcart.widget.draglist;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends ViewGroup {
    public static ChangeQuickRedirect a;
    private int b;

    public b(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e210818e9b92701efa8e8e6483867cd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e210818e9b92701efa8e8e6483867cd");
            return;
        }
        this.b = 48;
        setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    }

    public final void setGravity(int i) {
        this.b = i;
    }

    public final int getGravity() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16471ade855307a86a073edb052145d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16471ade855307a86a073edb052145d6");
            return;
        }
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        if (this.b == 48) {
            childAt.layout(0, 0, getMeasuredWidth(), childAt.getMeasuredHeight());
        } else {
            childAt.layout(0, getMeasuredHeight() - childAt.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a6ec77475d71c03599801544d13a830", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a6ec77475d71c03599801544d13a830");
            return;
        }
        int size = View.MeasureSpec.getSize(i2);
        int size2 = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i2);
        View childAt = getChildAt(0);
        if (childAt == null) {
            setMeasuredDimension(0, size2);
            return;
        }
        if (childAt.isLayoutRequested()) {
            measureChild(childAt, i, View.MeasureSpec.makeMeasureSpec(0, 0));
        }
        if (mode == 0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams.height > 0) {
                size = layoutParams.height;
            } else {
                size = childAt.getMeasuredHeight();
            }
        }
        setMeasuredDimension(size2, size);
    }
}
