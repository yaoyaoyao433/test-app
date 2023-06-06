package com.meituan.msc.mmpviews.list.msclist.view;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class a extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    private int b;
    private int c;

    public a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6ca178b22edd6dc86e56aec93732bd9f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6ca178b22edd6dc86e56aec93732bd9f");
            return;
        }
        this.b = i;
        this.c = i2;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aab5c837098f213153a1c0a5e70933c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aab5c837098f213153a1c0a5e70933c1");
            return;
        }
        rect.left = this.b / 2;
        rect.right = this.b / 2;
        rect.bottom = 0;
        rect.top = this.c;
        int spanCount = ((StaggeredGridLayoutManager) recyclerView.getLayoutManager()).getSpanCount();
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        int b = ((StaggeredGridLayoutManager.b) view.getLayoutParams()).b() % spanCount;
        if (b == 0) {
            rect.left = 0;
        } else if (b == spanCount - 1) {
            rect.right = 0;
        }
        if (childLayoutPosition < spanCount) {
            rect.top = 0;
        }
    }
}
