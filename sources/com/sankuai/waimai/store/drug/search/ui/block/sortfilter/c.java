package com.sankuai.waimai.store.drug.search.ui.block.sortfilter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.drug.search.ui.block.sortfilter.BrandQuickFilterListView;
import com.sankuai.waimai.store.search.model.BrandFilterItem;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c extends com.sankuai.waimai.store.base.b implements BrandQuickFilterListView.a {
    public static ChangeQuickRedirect a;
    public BrandQuickFilterListView b;
    public LinearLayout c;
    public TextView d;
    public String e;
    private com.sankuai.waimai.store.search.ui.result.b f;

    public c(@NonNull Context context, com.sankuai.waimai.store.search.ui.result.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5e152adc96b0ecef8e90eb9d300785c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5e152adc96b0ecef8e90eb9d300785c");
        } else {
            this.f = bVar;
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93c9a0209ab17a5ba28b0991620055d7", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93c9a0209ab17a5ba28b0991620055d7") : this.mInflater.inflate(R.layout.wm_drug_search_brand_filter_layout, viewGroup, false);
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9963e515a05a6281192c3f5d58b1a0d2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9963e515a05a6281192c3f5d58b1a0d2");
            return;
        }
        this.b = (BrandQuickFilterListView) findView(R.id.brand_list);
        this.c = (LinearLayout) findView(R.id.brand_tips_container);
        this.d = (TextView) findView(R.id.brand_tips);
        this.b.setFilterItemClickListener(this);
        this.e = null;
    }

    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d49c206f47e0496c83279625cf73cfd0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d49c206f47e0496c83279625cf73cfd0");
            return;
        }
        this.b.a(z);
        if (z) {
            u.c(this.c);
        } else {
            u.a(this.c);
        }
    }

    @Override // com.sankuai.waimai.store.drug.search.ui.block.sortfilter.BrandQuickFilterListView.a
    public final void a(BrandFilterItem brandFilterItem, boolean z) {
        Object[] objArr = {brandFilterItem, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9414defc975c730e324edbe3ca5afd4a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9414defc975c730e324edbe3ca5afd4a");
        } else if (this.f == null || brandFilterItem == null) {
        } else {
            if (z) {
                this.f.a(brandFilterItem.secondGuidedQuery, "_search_brand_filter");
            } else {
                this.f.a(this.e, "_search_brand_filter");
            }
        }
    }
}
