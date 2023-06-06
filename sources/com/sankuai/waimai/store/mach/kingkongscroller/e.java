package com.sankuai.waimai.store.mach.kingkongscroller;

import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.facebook.yoga.YogaEdge;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class e extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private int b;
    private com.facebook.yoga.d c;

    public e(com.facebook.yoga.d dVar, int i) {
        Object[] objArr = {dVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e5e1f9e160d35c5f657d03f1006bb63", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e5e1f9e160d35c5f657d03f1006bb63");
            return;
        }
        this.c = dVar;
        this.b = i;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "638ed6fa81188a1fee88fce38e3107c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "638ed6fa81188a1fee88fce38e3107c2");
            return;
        }
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        int i = this.c.c(YogaEdge.LEFT) == null ? 0 : (int) this.c.c(YogaEdge.LEFT).d;
        int i2 = this.c.c(YogaEdge.RIGHT) == null ? 0 : (int) this.c.c(YogaEdge.RIGHT).d;
        int i3 = this.c.c(YogaEdge.TOP) == null ? 0 : (int) this.c.c(YogaEdge.TOP).d;
        int i4 = this.c.c(YogaEdge.BOTTOM) == null ? 0 : (int) this.c.c(YogaEdge.BOTTOM).d;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager.getOrientation() == 0) {
            if (childAdapterPosition == 0) {
                rect.set(i, i3, this.b, i4);
            } else if (childAdapterPosition == linearLayoutManager.getItemCount() - 1) {
                rect.set(0, i3, i2, i4);
            } else {
                rect.set(0, i3, this.b, i4);
            }
        } else if (childAdapterPosition == 0) {
            rect.set(i, i3, i2, this.b);
        } else if (childAdapterPosition == linearLayoutManager.getItemCount() - 1) {
            rect.set(i, 0, i2, i4);
        } else {
            rect.set(i, 0, i2, this.b);
        }
    }
}
