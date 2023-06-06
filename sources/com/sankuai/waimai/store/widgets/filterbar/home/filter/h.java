package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends com.sankuai.waimai.store.newwidgets.list.g<g, e> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* bridge */ /* synthetic */ void a(g gVar, int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc70f1e538c0e6748c3c1430fc25abe8", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc70f1e538c0e6748c3c1430fc25abe8");
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, viewGroup.getContext().getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_15)));
        return view;
    }
}
