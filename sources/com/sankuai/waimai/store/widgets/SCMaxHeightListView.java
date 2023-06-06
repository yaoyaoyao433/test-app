package com.sankuai.waimai.store.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCMaxHeightListView extends ListView {
    public static ChangeQuickRedirect a;
    private int b;

    public SCMaxHeightListView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3738b439eda9d9e6feef59bcfe040bf", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3738b439eda9d9e6feef59bcfe040bf");
        } else {
            this.b = Integer.MAX_VALUE;
        }
    }

    public SCMaxHeightListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a2372625a2ce8bd564053d685d65052", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a2372625a2ce8bd564053d685d65052");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, 0);
    }

    public SCMaxHeightListView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2025e8398b2591bc1277ebdc4ce9891", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2025e8398b2591bc1277ebdc4ce9891");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        Object[] objArr = {attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "081ba5c991454e7f35eabf4df8b2bb95", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "081ba5c991454e7f35eabf4df8b2bb95");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16843040}, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        obtainStyledAttributes.recycle();
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac339ec4fe33a374ac54aedc9e26318f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac339ec4fe33a374ac54aedc9e26318f");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbb819b2215f998b9fdbc202d6f2e0de", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbb819b2215f998b9fdbc202d6f2e0de");
            return;
        }
        super.onMeasure(i, i2);
        if (this.b < getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), this.b);
        }
    }
}
