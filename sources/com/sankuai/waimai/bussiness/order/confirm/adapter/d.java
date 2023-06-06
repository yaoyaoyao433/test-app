package com.sankuai.waimai.bussiness.order.confirm.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private final int b;

    public d(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2a98ed7414eb02a363c5eddfed6f2ab", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2a98ed7414eb02a363c5eddfed6f2ab");
        } else {
            this.b = i;
        }
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e72b96531e1fa9a5fc33329031d41080", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e72b96531e1fa9a5fc33329031d41080");
            return;
        }
        rect.left = this.b;
        rect.right = this.b;
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.left = 0;
        }
        if (recyclerView.getChildAdapterPosition(view) == recyclerView.getAdapter().getItemCount() - 1) {
            rect.right = 0;
        }
    }
}
