package com.sankuai.waimai.store.poi.list.refactor.card.feed_flow;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private int b;

    public a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86ee14fb1cfb8fa414fc5b6bcdb800e2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86ee14fb1cfb8fa414fc5b6bcdb800e2");
        } else {
            this.b = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80d3782742d413509c7e138b0c8fe3e0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80d3782742d413509c7e138b0c8fe3e0");
            return;
        }
        rect.right = this.b * 2;
        if (recyclerView.getChildPosition(view) == 0) {
            rect.left = this.b * 2;
        }
    }
}
