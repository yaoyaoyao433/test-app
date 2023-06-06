package com.sankuai.waimai.bussiness.order.confirm.collect.adapter;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends RecyclerView.f {
    public static ChangeQuickRedirect a;
    public boolean b;
    private int c;

    public a(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab200bfd327269c4ab6deb46af180a77", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab200bfd327269c4ab6deb46af180a77");
            return;
        }
        this.b = false;
        this.c = g.a(context, 37.0f);
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5317881d01229637b04cd6bd27e1a80a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5317881d01229637b04cd6bd27e1a80a");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        if (this.b && recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = this.c;
        }
    }
}
