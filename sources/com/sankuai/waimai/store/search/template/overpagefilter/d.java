package com.sankuai.waimai.store.search.template.overpagefilter;

import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.store.search.model.OverPageFilterGroup;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends RecyclerView.s {
    public static ChangeQuickRedirect a;
    private TextView b;
    private RecyclerView c;
    private RecyclerView.LayoutManager d;
    private b e;
    private int f;
    private int g;

    public d(View view, int i, int i2) {
        super(view);
        Object[] objArr = {view, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c649b2b4003d4baebb10d9db10df1d3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c649b2b4003d4baebb10d9db10df1d3");
            return;
        }
        this.b = (TextView) view.findViewById(R.id.search_over_page_filter_title);
        this.c = (RecyclerView) view.findViewById(R.id.search_over_page_filter_group);
        this.f = i;
        this.g = i2;
        if (i == 1) {
            this.d = new LinearLayoutManager(view.getContext(), 1, false);
        } else {
            this.d = new GridLayoutManager(view.getContext(), 3);
        }
        this.e = new b();
        this.c.setLayoutManager(this.d);
        this.c.setAdapter(this.e);
    }

    public final void a(OverPageFilterGroup overPageFilterGroup) {
        Object[] objArr = {overPageFilterGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "317f9a7d937acca8eb1757bdb9631b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "317f9a7d937acca8eb1757bdb9631b87");
        } else if (overPageFilterGroup == null) {
        } else {
            u.a(this.b, overPageFilterGroup.title);
            if (this.d instanceof GridLayoutManager) {
                ((GridLayoutManager) this.d).a(3);
            }
            this.e.a(overPageFilterGroup.showType, overPageFilterGroup.title, overPageFilterGroup.getStatisticsIndex(), overPageFilterGroup.filterItems, this.f, this.g);
        }
    }
}
