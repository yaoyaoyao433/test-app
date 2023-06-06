package com.sankuai.waimai.store.drug.newwidgets;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.meituan.roodesign.resfetcher.widgets.RooFrameLayout;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class AutoBackgroundFrameLayout extends RooFrameLayout {
    public static ChangeQuickRedirect b;

    public AutoBackgroundFrameLayout(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e082374b2e049cc28fdf5ee6c3db27d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e082374b2e049cc28fdf5ee6c3db27d");
        }
    }

    public AutoBackgroundFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a5348295c2458fc825e76573af1b012c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a5348295c2458fc825e76573af1b012c");
        }
    }

    @Override // android.view.View
    public int getSuggestedMinimumWidth() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6eb3c1de6a8965c849ed01674587c123", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6eb3c1de6a8965c849ed01674587c123")).intValue() : getMinimumWidth();
    }

    @Override // android.view.View
    public int getSuggestedMinimumHeight() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fa300aee2f37c1d2435d78cfeea2193", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fa300aee2f37c1d2435d78cfeea2193")).intValue() : getMinimumHeight();
    }
}
