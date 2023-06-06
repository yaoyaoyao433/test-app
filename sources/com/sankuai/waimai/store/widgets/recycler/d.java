package com.sankuai.waimai.store.widgets.recycler;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.newwidgets.list.m {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.newwidgets.list.n b;
    private final int d;
    private com.sankuai.waimai.store.param.a e;

    public d(com.sankuai.waimai.store.newwidgets.list.n nVar, int i) {
        this(nVar, 0, null);
        Object[] objArr = {nVar, 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "df9c0c0b846e4c9e225e91e92428682e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "df9c0c0b846e4c9e225e91e92428682e");
        }
    }

    public d(com.sankuai.waimai.store.newwidgets.list.n nVar, int i, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {nVar, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51672e5966b17dd7f55582774e22b722", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51672e5966b17dd7f55582774e22b722");
            return;
        }
        this.b = nVar;
        this.d = i;
        this.e = aVar;
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView.a adapter;
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2cf12ff0d4ef01ec8bd61af939d6303", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2cf12ff0d4ef01ec8bd61af939d6303");
        } else if (this.b != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 0 && i == 0) {
            if (q.d(recyclerView)) {
                this.b.e();
            }
            if (recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (findLastCompletelyVisibleItemPosition < (linearLayoutManager.getItemCount() - 1) - this.d || findLastCompletelyVisibleItemPosition <= 0) {
                    return;
                }
                this.b.bm_();
            } else if (q.c(recyclerView)) {
                this.b.bm_();
            }
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.m
    public final void a(int i, int i2, RecyclerView recyclerView, int i3) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), recyclerView, Integer.valueOf(i3)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "511cb468bccbcfff933ae4b42636333b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "511cb468bccbcfff933ae4b42636333b");
            return;
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() <= 0) {
            return;
        }
        if (i < 10) {
            this.b.e();
        }
        int itemCount = adapter.getItemCount() - (i + i2);
        if (itemCount < 0 || itemCount > this.d) {
            return;
        }
        if (this.e == null || !this.e.v()) {
            this.b.bm_();
        }
    }
}
