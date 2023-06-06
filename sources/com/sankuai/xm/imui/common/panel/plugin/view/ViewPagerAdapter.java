package com.sankuai.xm.imui.common.panel.plugin.view;

import android.support.annotation.NonNull;
import android.support.v4.view.PagerAdapter;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes6.dex */
public class ViewPagerAdapter extends PagerAdapter {
    public static ChangeQuickRedirect a;

    @Override // android.support.v4.view.PagerAdapter
    public int getCount() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c5a3cbb95fb4bad8944bd2e958854b4", 6917529027641081856L)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c5a3cbb95fb4bad8944bd2e958854b4")).intValue();
        }
        throw new UnsupportedOperationException();
    }

    @Override // android.support.v4.view.PagerAdapter
    public boolean isViewFromObject(@NonNull View view, @NonNull Object obj) {
        Object[] objArr = {view, obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e9590bd0316e405b07153c36b6d8b9e", 6917529027641081856L)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e9590bd0316e405b07153c36b6d8b9e")).booleanValue();
        }
        throw new UnsupportedOperationException();
    }
}
