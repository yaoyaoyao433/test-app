package com.sankuai.waimai.store.widgets.filterbar.sortlist;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.widgets.recycler.ExtendedLinearLayoutManager;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b implements c {
    public static ChangeQuickRedirect a;
    public int b;
    public int c;
    public int d;
    public int e;
    private com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b f;
    private a g;
    private long h;

    public b(@NonNull Context context, com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b bVar) {
        super(context);
        Object[] objArr = {context, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25c71a260cb3ccb99610e6f3daba9dd2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25c71a260cb3ccb99610e6f3daba9dd2");
            return;
        }
        this.e = -1;
        this.f = bVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "678ddb326ce10e2098bf569e2530d06a", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "678ddb326ce10e2098bf569e2530d06a");
        }
        RecyclerView recyclerView = new RecyclerView(viewGroup.getContext());
        recyclerView.setNestedScrollingEnabled(false);
        ExtendedLinearLayoutManager extendedLinearLayoutManager = new ExtendedLinearLayoutManager(viewGroup.getContext(), 0, false);
        extendedLinearLayoutManager.setStackFromEnd(true);
        recyclerView.setLayoutManager(extendedLinearLayoutManager);
        this.g = new a(this);
        recyclerView.setAdapter(this.g);
        recyclerView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        return recyclerView;
    }

    public final void a(long j, List<SGSortModel> list) {
        Object[] objArr = {new Long(j), list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7021609f530da50685225f4cee09977", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7021609f530da50685225f4cee09977");
            return;
        }
        this.h = j;
        if (this.e > 0) {
            if (com.sankuai.shangou.stone.util.a.a((List) list) > this.e) {
                this.g.b_(list.subList(0, this.e));
                return;
            } else {
                this.g.b_(list);
                return;
            }
        }
        this.g.b_(list);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(View view, long j) {
        Object[] objArr = {view, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb652749a5efc084670d791a91d53d02", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb652749a5efc084670d791a91d53d02");
        } else if (this.f != null) {
            this.f.a(view, j);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.b
    public final void a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d26b1194106c9f23676bd2f2202bbe44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d26b1194106c9f23676bd2f2202bbe44");
        } else if (this.f != null) {
            this.f.a(i, i2);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.c
    public final long a() {
        return this.h;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.c
    public final int b() {
        return this.b;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.c
    public final int c() {
        return this.c;
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.c
    public final int d() {
        return this.d;
    }
}
