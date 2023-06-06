package com.sankuai.waimai.store.drug.home.new_home.filter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.platform.domain.core.poi.CategoryInfo;
import com.sankuai.waimai.store.widgets.filterbar.home.model.SortItem;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b implements e {
    public static ChangeQuickRedirect a;
    public b b;
    public CategoryInfo c;
    public long d;
    private d e;
    private com.sankuai.waimai.store.param.a f;

    public c(@NonNull Context context, com.sankuai.waimai.store.param.a aVar, d dVar) {
        super(context);
        Object[] objArr = {context, aVar, dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7967a33f76dd663b724cba83cb3c05b8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7967a33f76dd663b724cba83cb3c05b8");
            return;
        }
        this.d = -1L;
        this.e = dVar;
        this.f = aVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4e81b5b7a95c6ce791d5ae21bbafeae7", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4e81b5b7a95c6ce791d5ae21bbafeae7");
        }
        View inflate = layoutInflater.inflate(R.layout.wm_sc_drug_filter_home_bar, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.home_filter_rv);
        ExtendedLinearLayoutManager extendedLinearLayoutManager = new ExtendedLinearLayoutManager(viewGroup.getContext(), 0, false);
        extendedLinearLayoutManager.setStackFromEnd(false);
        recyclerView.setLayoutManager(extendedLinearLayoutManager);
        recyclerView.addItemDecoration(new a(h.a(viewGroup.getContext(), 4.0f), h.a(viewGroup.getContext(), 4.0f)));
        this.b = new b(this);
        recyclerView.setAdapter(this.b);
        return inflate;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.filter.e
    public final void a(SortItem sortItem, boolean z) {
        Object[] objArr = {sortItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84e668419b8de5ec506d0fd14542d7b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84e668419b8de5ec506d0fd14542d7b2");
        } else if (sortItem != null) {
            this.d = z ? sortItem.code : -1L;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "676a3df4adc7d51a885acfb6b7aa1044", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "676a3df4adc7d51a885acfb6b7aa1044");
            } else {
                this.b.notifyDataSetChanged();
            }
            if (this.e == null || this.c == null) {
                return;
            }
            this.e.a(sortItem, this.c, z);
        }
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.filter.e
    public final long a() {
        return this.d;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.filter.e
    public final com.sankuai.waimai.store.param.a b() {
        return this.f;
    }

    @Override // com.sankuai.waimai.store.drug.home.new_home.filter.e
    public final CategoryInfo c() {
        return this.c;
    }
}
