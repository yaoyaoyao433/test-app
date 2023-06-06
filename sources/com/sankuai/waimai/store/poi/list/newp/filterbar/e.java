package com.sankuai.waimai.store.poi.list.newp.filterbar;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends com.sankuai.waimai.store.base.b implements c {
    public static ChangeQuickRedirect a;
    private ViewGroup b;
    private int c;

    @Override // com.sankuai.waimai.store.base.c
    public final com.sankuai.waimai.store.base.b a() {
        return this;
    }

    public e(Context context, int i) {
        super(context);
        Object[] objArr = {context, Integer.MAX_VALUE};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "700cbe6f3fffc945688cc875c1f1ed0e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "700cbe6f3fffc945688cc875c1f1ed0e");
            return;
        }
        this.c = Integer.MAX_VALUE;
        this.c = Integer.MAX_VALUE;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "04bb8a5684b81fd0a34c6f1f0e1634b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "04bb8a5684b81fd0a34c6f1f0e1634b9");
            return;
        }
        super.onViewCreated();
        this.b = (ViewGroup) findView(R.id.layout_filter_bar);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "262824ff77f45ffc3710b75484c65f92", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "262824ff77f45ffc3710b75484c65f92") : layoutInflater.inflate(R.layout.wm_sc_sugoo_sort_view, viewGroup);
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.c
    public final ViewGroup b() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.c
    public final int c() {
        return this.c;
    }

    @Override // com.sankuai.waimai.store.poi.list.newp.filterbar.c
    public final void a(int i) {
        this.c = i;
    }
}
