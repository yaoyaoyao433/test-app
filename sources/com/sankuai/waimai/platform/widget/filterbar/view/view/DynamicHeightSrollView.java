package com.sankuai.waimai.platform.widget.filterbar.view.view;

import android.app.Activity;
import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.widget.ScrollView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DynamicHeightSrollView extends ScrollView {
    public static ChangeQuickRedirect a;
    private int b;

    public DynamicHeightSrollView(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f06bd1bc522f0c0fb11d009b2789820", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f06bd1bc522f0c0fb11d009b2789820");
            return;
        }
        this.b = 0;
        a(context);
    }

    public DynamicHeightSrollView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c060ee649a9868b111c04d0c65964bc4", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c060ee649a9868b111c04d0c65964bc4");
            return;
        }
        this.b = 0;
        a(context);
    }

    public DynamicHeightSrollView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25a3d0b5e68468c4b1359bf2f48d454", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25a3d0b5e68468c4b1359bf2f48d454");
            return;
        }
        this.b = 0;
        a(context);
    }

    @Override // android.widget.ScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "71d67613531f95fbcdbb5948ed0ae67d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "71d67613531f95fbcdbb5948ed0ae67d");
            return;
        }
        super.onMeasure(i, i2);
        setMeasuredDimension(i, Math.min(getMeasuredHeight(), this.b) | Integer.MIN_VALUE);
    }

    public void setDynamicHeight(int i) {
        this.b = i;
    }

    private void a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bda0dfca061130f258ef4260adbe642", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bda0dfca061130f258ef4260adbe642");
            return;
        }
        try {
            if (context instanceof Activity) {
                DisplayMetrics displayMetrics = new DisplayMetrics();
                ((Activity) context).getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
                this.b = (int) (displayMetrics.heightPixels * 0.55d);
            }
        } catch (Exception unused) {
        }
    }
}
