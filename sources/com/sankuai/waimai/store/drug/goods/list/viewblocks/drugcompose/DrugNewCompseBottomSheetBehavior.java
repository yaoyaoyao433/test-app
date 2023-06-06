package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomSheetBehavior;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DrugNewCompseBottomSheetBehavior extends BottomSheetBehavior<View> {
    public static ChangeQuickRedirect m;
    boolean n;

    public DrugNewCompseBottomSheetBehavior() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1773a3ee6760dcdff6676a5e7e9337ea", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1773a3ee6760dcdff6676a5e7e9337ea");
        } else {
            this.n = false;
        }
    }

    public DrugNewCompseBottomSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a1a4ae04e999d576408da7e32c8fc457", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a1a4ae04e999d576408da7e32c8fc457");
        } else {
            this.n = false;
        }
    }

    @Override // android.support.design.widget.CoordinatorLayout.a
    public void onStopNestedScroll(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2, int i) {
        Object[] objArr = {coordinatorLayout, view, view2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d1e9bdcf1c330f703f57d0b3d177c6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d1e9bdcf1c330f703f57d0b3d177c6ed");
            return;
        }
        super.onStopNestedScroll(coordinatorLayout, view, view2, i);
        if (!this.n || this.e == 3) {
            return;
        }
        b(3);
    }
}
