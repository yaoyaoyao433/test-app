package com.sankuai.waimai.store.order.detail.blockview;

import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
import com.sankuai.waimai.store.newwidgets.list.n;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class g extends f {
    public static ChangeQuickRedirect m;

    @Override // com.sankuai.waimai.store.order.detail.blockview.f, com.meituan.android.cube.pga.view.a
    public final int d() {
        return R.layout.wm_sc_order_detail_spu_recommend_rocks;
    }

    public g(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "102a2655a48d6eb8b77f92fe30281eca", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "102a2655a48d6eb8b77f92fe30281eca");
        }
    }

    @Override // com.sankuai.waimai.store.order.detail.blockview.f
    public final void a(final n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = m;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fb6cbc9407c4c8b7c74d61b324009865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fb6cbc9407c4c8b7c74d61b324009865");
        } else if (this.g instanceof NestedRecyclerView) {
            ((NestedRecyclerView) this.g).a(new NestedRecyclerView.b() { // from class: com.sankuai.waimai.store.order.detail.blockview.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.b
                public final void a(RecyclerView recyclerView, int i) {
                    Object[] objArr2 = {recyclerView, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b51c3cba49c90750a96c3cb9a55806b4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b51c3cba49c90750a96c3cb9a55806b4");
                    } else if (i == 0) {
                        if (g.this.g.getLayoutManager() != null && (g.this.g.getLayoutManager() instanceof LinearLayoutManager)) {
                            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) g.this.g.getLayoutManager();
                            int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
                            if (findLastCompletelyVisibleItemPosition < linearLayoutManager.getItemCount() - 1 || findLastCompletelyVisibleItemPosition <= 0) {
                                return;
                            }
                            nVar.bm_();
                        } else if (q.c(g.this.g)) {
                            nVar.bm_();
                        }
                    }
                }
            });
        }
    }
}
