package com.sankuai.waimai.platform.widget.coordinator;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class CoordinatorLayoutCompat extends CoordinatorLayout {
    public static ChangeQuickRedirect i;
    private a j;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a {
    }

    public CoordinatorLayoutCompat(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8885029a09123ce770f45ebba7984c61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8885029a09123ce770f45ebba7984c61");
        }
    }

    public CoordinatorLayoutCompat(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        Object[] objArr = {context, attributeSet, Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6c679e29f5e49704c795486d581fff6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6c679e29f5e49704c795486d581fff6");
        }
    }

    public void setOnScrollChangeListenerCompat(a aVar) {
        this.j = aVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i2, int i3, int i4, int i5) {
        Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)};
        ChangeQuickRedirect changeQuickRedirect = i;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69bd90f3760e63cccf1a6895d58e8229", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69bd90f3760e63cccf1a6895d58e8229");
        } else {
            super.onScrollChanged(i2, i3, i4, i5);
        }
    }
}
