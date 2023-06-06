package com.sankuai.waimai.store.widgets.filterbar.home.sort;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.widgets.SCMaxHeightRecyclerView;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public a b;
    private c c;
    private com.sankuai.waimai.store.param.a d;

    public b(@NonNull Context context, @NonNull com.sankuai.waimai.store.param.a aVar, @NonNull c cVar) {
        super(context);
        Object[] objArr = {context, aVar, cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df15970e084a6bb184a6d67a767cd311", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df15970e084a6bb184a6d67a767cd311");
            return;
        }
        this.d = aVar;
        this.c = cVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca9f59301c417912f09090e670637497", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca9f59301c417912f09090e670637497");
        }
        SCMaxHeightRecyclerView sCMaxHeightRecyclerView = new SCMaxHeightRecyclerView(viewGroup.getContext());
        sCMaxHeightRecyclerView.setNestedScrollingEnabled(false);
        sCMaxHeightRecyclerView.setPadding(0, viewGroup.getResources().getDimensionPixelOffset(R.dimen.wm_sc_common_dimen_0), 0, h.a(this.mContext, 5.0f));
        sCMaxHeightRecyclerView.setMaxHeight((int) (h.b(getContext()) * 0.6d));
        float a2 = h.a(this.mContext, 12.0f);
        e.a c = new e.a().c(com.sankuai.waimai.store.util.b.b(this.mContext, R.color.wm_st_common_white));
        c.a(0.0f, 0.0f, a2, a2);
        sCMaxHeightRecyclerView.setBackground(c.a());
        sCMaxHeightRecyclerView.setLayoutManager(new ExtendedLinearLayoutManager(viewGroup.getContext()));
        this.b = new a(this.c, this.d);
        sCMaxHeightRecyclerView.setAdapter(this.b);
        sCMaxHeightRecyclerView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        return sCMaxHeightRecyclerView;
    }
}
