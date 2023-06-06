package com.sankuai.waimai.platform.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class SkuDialogLinearLayout extends LinearLayout {
    public static ChangeQuickRedirect a = null;
    private static int c = 530;
    private Context b;

    public SkuDialogLinearLayout(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1cb0787c681556eefa0f9b1fd55722b0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1cb0787c681556eefa0f9b1fd55722b0");
        } else {
            this.b = context;
        }
    }

    public SkuDialogLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e2cd7bfed85d98c6d6d139bbe8ea1536", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e2cd7bfed85d98c6d6d139bbe8ea1536");
        } else {
            this.b = context;
        }
    }

    public SkuDialogLinearLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69f578b445f335db4cf1ef01343246a5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69f578b445f335db4cf1ef01343246a5");
        } else {
            this.b = context;
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "904ac76e593aa25fbc127318b05045a1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "904ac76e593aa25fbc127318b05045a1");
            return;
        }
        try {
            i2 = View.MeasureSpec.makeMeasureSpec((int) ((c * this.b.getResources().getDisplayMetrics().density) + 0.5f), Integer.MIN_VALUE);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        super.onMeasure(i, i2);
    }

    public void setMaxHeight(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8a5e388642896b744a407caa3afd3a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8a5e388642896b744a407caa3afd3a49");
            return;
        }
        c = i;
        requestLayout();
    }
}
