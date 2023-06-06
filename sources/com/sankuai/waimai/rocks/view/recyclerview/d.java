package com.sankuai.waimai.rocks.view.recyclerview;

import android.graphics.Rect;
import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    int b;

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9b4e91322229e0d1a3e4067542f71315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9b4e91322229e0d1a3e4067542f71315");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if ((layoutParams instanceof StaggeredGridLayoutManager.b) && (view.getTag(R.id.product_mode_tag_key) instanceof Integer) && -3 == ((Integer) view.getTag(R.id.product_mode_tag_key)).intValue()) {
            if (((StaggeredGridLayoutManager.b) layoutParams).b() % 2 == 0) {
                rect.right = g.a(view.getContext(), this.b) / 2;
            } else {
                rect.left = g.a(view.getContext(), this.b) / 2;
            }
        }
    }
}
