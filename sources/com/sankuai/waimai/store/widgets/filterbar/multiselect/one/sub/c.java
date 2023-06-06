package com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.widgets.SCMaxHeightRecyclerView;
import com.sankuai.waimai.store.widgets.recycler.ExtendedGridLayoutManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public a b;
    private b c;

    public c(@NonNull Context context, b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cd3e2c9a1e83f71e4842abb4bb91b060", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cd3e2c9a1e83f71e4842abb4bb91b060");
        } else {
            this.c = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "77036b60c7e8eb267d4e5ac849d5f4a3", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "77036b60c7e8eb267d4e5ac849d5f4a3");
        }
        SCMaxHeightRecyclerView sCMaxHeightRecyclerView = new SCMaxHeightRecyclerView(viewGroup.getContext());
        sCMaxHeightRecyclerView.setNestedScrollingEnabled(false);
        sCMaxHeightRecyclerView.setPadding(0, viewGroup.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_4), 0, viewGroup.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_12));
        sCMaxHeightRecyclerView.setMaxHeight(viewGroup.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_250));
        sCMaxHeightRecyclerView.setBackgroundColor(ContextCompat.getColor(viewGroup.getContext(), R.color.wm_st_common_white));
        sCMaxHeightRecyclerView.setLayoutManager(new ExtendedGridLayoutManager(viewGroup.getContext(), 2));
        this.b = new a(this.c);
        sCMaxHeightRecyclerView.setAdapter(this.b);
        sCMaxHeightRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return sCMaxHeightRecyclerView;
    }
}
