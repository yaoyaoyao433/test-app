package com.sankuai.waimai.store.goods.list.templet.newmarket.spulist.adapter;

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
public final class r extends com.sankuai.waimai.store.newwidgets.list.e<j> {
    public static ChangeQuickRedirect a;
    @DimenRes
    private int c;

    @Override // com.sankuai.waimai.store.newwidgets.list.e
    public final void a(int i) {
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final void a(@NonNull View view) {
    }

    public r(@DimenRes int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5ceca2cb16c1b4a9cc84285a704d205b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5ceca2cb16c1b4a9cc84285a704d205b");
        } else {
            this.c = i;
        }
    }

    public r() {
        this(R.dimen.wm_sc_common_dimen_1000);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d634ecaf69f291fcfe76225c54e077", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d634ecaf69f291fcfe76225c54e077");
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.g
    public final View a(ViewGroup viewGroup) {
        Object[] objArr = {viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d5cf0d4fa3c924b1d68c498ce8c0c0ab", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d5cf0d4fa3c924b1d68c498ce8c0c0ab");
        }
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new ViewGroup.LayoutParams(-1, view.getContext().getResources().getDimensionPixelOffset(this.c)));
        return view;
    }
}
