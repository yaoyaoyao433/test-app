package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.spulist.adapter;

import android.support.annotation.DimenRes;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends com.sankuai.waimai.store.newwidgets.list.e<d> {
    public static ChangeQuickRedirect a;
    @DimenRes
    private int c;

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void a(int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
    }

    public k(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "584b41bc9adf35bf9591868913287d0d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "584b41bc9adf35bf9591868913287d0d");
        } else {
            this.c = i;
        }
    }

    public k() {
        this(R.dimen.wm_sc_common_dimen_1000);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7eddd398a586b8d9a99a4c3ed351f934", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7eddd398a586b8d9a99a4c3ed351f934");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb28fcfd52c11f39cdb2934f7929b3d2", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb28fcfd52c11f39cdb2934f7929b3d2");
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, view.getContext().getResources().getDimensionPixelOffset(this.c)));
        return view;
    }
}
