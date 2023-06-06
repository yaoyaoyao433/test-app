package com.sankuai.waimai.store.newwidgets.list;

import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class m extends RecyclerView.k {
    public static ChangeQuickRedirect c;

    public abstract void a(int i, int i2, RecyclerView recyclerView, int i3);

    @Override // android.support.v7.widget.RecyclerView.k
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.LayoutManager layoutManager;
        int i3 = 0;
        Object[] objArr = {recyclerView, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b29a58c92c8160d5e9a34fd4b6b1bdf8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b29a58c92c8160d5e9a34fd4b6b1bdf8");
            return;
        }
        RecyclerView.a adapter = recyclerView.getAdapter();
        if (adapter == null || adapter.getItemCount() <= 0) {
            return;
        }
        int a = q.a(recyclerView) - (recyclerView instanceof SCRecyclerView ? ((SCRecyclerView) recyclerView).getHeaderCount() : 0);
        if (a < 0) {
            a = 0;
        }
        Object[] objArr2 = {recyclerView};
        ChangeQuickRedirect changeQuickRedirect2 = q.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a7642d84d8c0eab5ec03872704fa2ed7", RobustBitConfig.DEFAULT_VALUE)) {
            i3 = ((Integer) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a7642d84d8c0eab5ec03872704fa2ed7")).intValue();
        } else if (recyclerView != null && (layoutManager = recyclerView.getLayoutManager()) != null) {
            i3 = layoutManager.getChildCount();
        }
        a(a, i3, recyclerView, i2);
    }
}
