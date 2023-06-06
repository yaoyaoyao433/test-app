package com.sankuai.waimai.business.page.home.list.future;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.view.nested.NestedViewPager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class HomeFutureViewPager extends NestedViewPager {
    public static ChangeQuickRedirect b;
    FutureViewModel c;

    public HomeFutureViewPager(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76e36ac505c39d62a7ff8b672ce7f569", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76e36ac505c39d62a7ff8b672ce7f569");
        }
    }

    public HomeFutureViewPager(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Object[] objArr = {context, attributeSet};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "199a3681233dabb8af8b37d840e1d167", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "199a3681233dabb8af8b37d840e1d167");
        }
    }

    @Override // com.sankuai.waimai.business.page.common.view.nested.NestedViewPager, com.sankuai.waimai.business.page.common.view.nested.c
    public final boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83e49eaaa00248eeb0399d4645b86ac3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83e49eaaa00248eeb0399d4645b86ac3")).booleanValue();
        }
        boolean a = super.a();
        return this.c != null ? a || this.c.d : a;
    }
}
