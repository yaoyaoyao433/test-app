package com.sankuai.waimai.store.widgets;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SCMaxHeightRecyclerView extends RecyclerView {
    public static ChangeQuickRedirect a;
    private int b;

    public SCMaxHeightRecyclerView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b02c9b88b5fbaee7f3439aedc77a5a09", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b02c9b88b5fbaee7f3439aedc77a5a09");
        } else {
            this.b = Integer.MAX_VALUE;
        }
    }

    public SCMaxHeightRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c995ccdb475dae708f121f0bf9647d64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c995ccdb475dae708f121f0bf9647d64");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, 0);
    }

    public SCMaxHeightRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "68416c2de2ff749855000431735dcc75", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "68416c2de2ff749855000431735dcc75");
            return;
        }
        this.b = Integer.MAX_VALUE;
        a(attributeSet, i);
    }

    private void a(AttributeSet attributeSet, int i) {
        Object[] objArr = {attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acc10263906cfda22e822216321e2f0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acc10263906cfda22e822216321e2f0f");
            return;
        }
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, new int[]{16843040}, i, 0);
        this.b = obtainStyledAttributes.getDimensionPixelSize(0, this.b);
        obtainStyledAttributes.recycle();
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c55e65c291b1c024f58dcf4f1e35ef62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c55e65c291b1c024f58dcf4f1e35ef62");
        } else if (i == this.b) {
        } else {
            this.b = i;
            requestLayout();
        }
    }

    @Override // android.support.v7.widget.RecyclerView, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15c721cc534c8338aa11351de1dbcabc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15c721cc534c8338aa11351de1dbcabc");
            return;
        }
        super.onMeasure(i, i2);
        if (this.b < getMeasuredHeight()) {
            setMeasuredDimension(getMeasuredWidth(), this.b);
        }
    }
}
