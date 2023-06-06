package com.sankuai.waimai.bussiness.order.base.feedback.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class a extends RecyclerView.f {
    public static ChangeQuickRedirect a = null;
    private static final String b = "a";
    private int c;
    private int d;
    private int e;
    private int f;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "40c8424828c9b3b282c7543acce1a485", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "40c8424828c9b3b282c7543acce1a485");
            return;
        }
        this.e = 0;
        this.f = 0;
        this.c = g.a(context, 12.0f);
        this.d = g.a(context, 68.0f);
        this.e = g.a(context, 20.0f);
        this.f = g.a(context, 16.0f);
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac16748be41f02902bb37f9994d13371", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac16748be41f02902bb37f9994d13371");
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        int i = gridLayoutManager.b;
        int childLayoutPosition = recyclerView.getChildLayoutPosition(view);
        gridLayoutManager.g.a(childLayoutPosition, i);
        int c = gridLayoutManager.g.c(childLayoutPosition, i);
        int c2 = gridLayoutManager.g.c(recyclerView.getAdapter().getItemCount() - 1, i);
        if (recyclerView.getChildAdapterPosition(view) != 0 && recyclerView.getChildAdapterPosition(view) != recyclerView.getAdapter().getItemCount() - 1 && childLayoutPosition % 2 != 0) {
            rect.right = this.e;
        }
        if (c != c2 - 1 && c != c2) {
            rect.bottom = this.f;
        }
        if (c == c2) {
            rect.top = this.c;
            rect.bottom = this.d;
        }
    }
}
