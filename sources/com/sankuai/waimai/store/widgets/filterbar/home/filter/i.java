package com.sankuai.waimai.store.widgets.filterbar.home.filter;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class i extends com.sankuai.waimai.store.newwidgets.list.g<g, e> {
    public static ChangeQuickRedirect a;
    private TextView b;

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final int a() {
        return R.layout.wm_sc_filterbar_home_filter_dropdown_title_item;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final /* synthetic */ void a(g gVar, int i) {
        g gVar2 = gVar;
        Object[] objArr = {gVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "632447203b030192bc27d9e9f310771c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "632447203b030192bc27d9e9f310771c");
        } else {
            this.b.setText(gVar2.c);
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a5aad4121751e4eece1c1a2f9ae5d79", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a5aad4121751e4eece1c1a2f9ae5d79");
        } else {
            this.b = (TextView) view.findViewById(R.id.tv_filter_dropdown_group_title);
        }
    }
}
