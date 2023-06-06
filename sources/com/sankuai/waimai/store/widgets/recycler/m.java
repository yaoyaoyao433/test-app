package com.sankuai.waimai.store.widgets.recycler;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.store.newwidgets.list.o;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m extends com.sankuai.waimai.store.newwidgets.list.m {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.newwidgets.list.n b;
    private final int d;
    private com.sankuai.waimai.store.param.a e;

    public m(com.sankuai.waimai.store.newwidgets.list.n nVar, int i, com.sankuai.waimai.store.param.a aVar) {
        Object[] objArr = {nVar, Integer.valueOf(i), aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2fcc5f365ef05574a6e3d1646c2ba4dc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2fcc5f365ef05574a6e3d1646c2ba4dc");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7baeec0b726a09b73e2bc49b4cbde40b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7baeec0b726a09b73e2bc49b4cbde40b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41b8b1e498054d31fd279f4510ffdfc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41b8b1e498054d31fd279f4510ffdfc0");
            return;
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter == null) {
            return;
        }
        if (adapter instanceof l) {
            l lVar = (l) adapter;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = l.c;
            if ((PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "92139f207f52c593d414ae26a4360c65", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "92139f207f52c593d414ae26a4360c65")).intValue() : lVar.d.j()) <= o.n()) {
                return;
            }
        } else if (adapter instanceof j) {
            j jVar = (j) adapter;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = j.c;
            if ((PatchProxy.isSupport(objArr3, jVar, changeQuickRedirect3, false, "bfc23da4d9d7affc927afcba43989f9e", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr3, jVar, changeQuickRedirect3, false, "bfc23da4d9d7affc927afcba43989f9e")).intValue() : jVar.d.j()) <= o.n()) {
                return;
            }
        } else if (adapter.getItemCount() <= 0) {
            return;
        }
        if (i < 10) {
            this.b.e();
        }
        int itemCount = adapter.getItemCount() - (i + i2);
        if (itemCount < 0 || itemCount > this.d) {
            return;
        }
        if (this.e == null || this.e.R != 6) {
            this.b.bm_();
        }
    }
}
