package com.dianping.shield.dynamic.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;
import com.dianping.shield.dynamic.objects.DynamicModuleView;
import com.dianping.shield.dynamic.objects.DynamicModuleViewItemData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class DMWrapperView extends DMMarginView {
    public static ChangeQuickRedirect changeQuickRedirect;
    private DynamicModuleView dynamicModuleView;
    private boolean isClipChildren;

    public DMWrapperView(Context context) {
        this(context, null);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "94aab3de9d0982ec5dacd2e6b91a915b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "94aab3de9d0982ec5dacd2e6b91a915b");
        }
    }

    public DMWrapperView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8eac0759d830f690758e7aaf47d40e64", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8eac0759d830f690758e7aaf47d40e64");
        } else {
            this.isClipChildren = true;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b22f3689b690f3cc2676833cf9cb1b67", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b22f3689b690f3cc2676833cf9cb1b67");
        } else {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 0));
        }
    }

    public void paintInput(Object obj, DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {obj, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d710f24d62a1c1150fea82ca9782a33b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d710f24d62a1c1150fea82ca9782a33b");
            return;
        }
        DynamicModuleView dynamicView = dynamicView(obj, dynamicModuleViewItemData);
        if (dynamicModuleViewItemData != null) {
            long currentTimeMillis = System.currentTimeMillis();
            dynamicView.paintViewData(obj, dynamicModuleViewItemData);
            Log.e("Test refresh", dynamicModuleViewItemData.jsName + CommonConstant.Symbol.COLON + String.valueOf(System.currentTimeMillis() - currentTimeMillis));
        }
    }

    public DynamicModuleView dynamicView(Object obj, DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {obj, dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69b4008d6549a441ae49f93d1e5f0d8d", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicModuleView) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69b4008d6549a441ae49f93d1e5f0d8d");
        }
        if (this.dynamicModuleView == null) {
            this.dynamicModuleView = DynamicModuleView.createViewByModel(dynamicModuleViewItemData);
            this.dynamicModuleView.createView(obj, getContext(), dynamicModuleViewItemData);
            if (this.dynamicModuleView.getModuleView() != null) {
                addView(this.dynamicModuleView.getModuleView(), new LinearLayout.LayoutParams(-2, -2));
            }
        }
        return this.dynamicModuleView;
    }

    public View dynamicInnerView(DynamicModuleViewItemData dynamicModuleViewItemData) {
        Object[] objArr = {dynamicModuleViewItemData};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "138ab087739ba823669e13043c7b4f56", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "138ab087739ba823669e13043c7b4f56") : dynamicView(null, dynamicModuleViewItemData).getModuleView();
    }

    public boolean isClipChildren() {
        return this.isClipChildren;
    }

    @Override // android.view.ViewGroup
    public void setClipChildren(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6b54c59e46bee238ce971ee440f12456", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6b54c59e46bee238ce971ee440f12456");
            return;
        }
        super.setClipChildren(z);
        this.isClipChildren = z;
    }
}
