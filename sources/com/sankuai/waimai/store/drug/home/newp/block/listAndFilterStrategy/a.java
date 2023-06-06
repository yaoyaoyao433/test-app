package com.sankuai.waimai.store.drug.home.newp.block.listAndFilterStrategy;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.store.newwidgets.list.m;
import com.sankuai.waimai.store.newwidgets.list.n;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends m {
    public static ChangeQuickRedirect a;
    private n b;
    private final int d;
    private float e;

    public a(n nVar, int i) {
        Object[] objArr = {nVar, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2dc1d4532fe7962699073971d7670044", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2dc1d4532fe7962699073971d7670044");
            return;
        }
        this.b = nVar;
        this.d = 2;
    }

    @Override // android.support.v7.widget.RecyclerView.k
    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        RecyclerView.a adapter;
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1be8d9255db6d1946e8ec9065dcfd1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1be8d9255db6d1946e8ec9065dcfd1bb");
        } else if (this.b != null && (adapter = recyclerView.getAdapter()) != null && adapter.getItemCount() > 0 && i == 0) {
            if (q.d(recyclerView)) {
                this.b.e();
            }
            if (recyclerView.getLayoutManager() != null && (recyclerView.getLayoutManager() instanceof LinearLayoutManager)) {
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
                int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                if (findLastCompletelyVisibleItemPosition < (linearLayoutManager.getItemCount() - 1) - this.d || findLastCompletelyVisibleItemPosition <= 0 || this.e < 0.0f) {
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aaa2dd0a3e5dcda2654e1ddf0ee24fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aaa2dd0a3e5dcda2654e1ddf0ee24fa");
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
        if (i3 <= 0) {
            this.e = i3;
        } else {
            this.b.bm_();
        }
    }
}
