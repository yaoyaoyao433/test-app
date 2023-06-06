package com.sankuai.waimai.store.widgets.recycler;

import android.support.annotation.CallSuper;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.q;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class n extends RecyclerView.k {
    public static ChangeQuickRedirect c;

    public abstract void a();

    @Override // android.support.v7.widget.RecyclerView.k
    @CallSuper
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30abd27ed24b6643425da986cb3869f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30abd27ed24b6643425da986cb3869f9");
            return;
        }
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && q.c(recyclerView)) {
            a();
        }
    }
}
