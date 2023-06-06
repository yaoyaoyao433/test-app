package com.sankuai.waimai.business.search.ui.result.categoryfilter;

import android.support.v4.widget.ViewDragHelper;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class TabBarAnimationHelper$2 extends ViewDragHelper.Callback {
    public static ChangeQuickRedirect a;
    public final /* synthetic */ ViewGroup b;
    public final /* synthetic */ b c;
    private int d;
    private int e;

    @Override // android.support.v4.widget.ViewDragHelper.Callback
    public boolean tryCaptureView(View view, int i) {
        return true;
    }

    @Override // android.support.v4.widget.ViewDragHelper.Callback
    public void onViewCaptured(View view, int i) {
        Object[] objArr = {view, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e1f9e95383b7c7ad3d9d6722d124795", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e1f9e95383b7c7ad3d9d6722d124795");
            return;
        }
        super.onViewCaptured(view, i);
        this.d = view.getLeft();
        this.e = view.getTop();
    }

    @Override // android.support.v4.widget.ViewDragHelper.Callback
    public int clampViewPositionHorizontal(View view, int i, int i2) {
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a792dd41b639039be3d116848695d62f", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a792dd41b639039be3d116848695d62f")).intValue() : (i2 <= 0 || this.c.b.getScrollX() > 0) ? (i2 >= 0 || this.c.b.getScrollX() + this.c.m < this.c.b.getMeasuredWidth()) ? this.d : (int) (i - (i2 * (1.0f - this.c.j))) : (int) (i - (i2 * (1.0f - this.c.j)));
    }

    @Override // android.support.v4.widget.ViewDragHelper.Callback
    public void onViewReleased(View view, float f, float f2) {
        Object[] objArr = {view, Float.valueOf(f), Float.valueOf(f2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "533f2db05f78c269356a12b3a8bc8c6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "533f2db05f78c269356a12b3a8bc8c6c");
            return;
        }
        super.onViewReleased(view, f, f2);
        this.c.d.settleCapturedViewAt(this.d, this.e);
        this.b.invalidate();
    }
}
