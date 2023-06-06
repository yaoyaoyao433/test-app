package com.sankuai.waimai.store.drug.home.new_home.filter;

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
    private int c;

    public a(int i, int i2) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "086ea9ffc33bb536e561ed2baabe0444", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "086ea9ffc33bb536e561ed2baabe0444");
            return;
        }
        this.b = i;
        this.c = i2;
    }

    @Override // android.support.v7.widget.RecyclerView.f
    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.State state) {
        Object[] objArr = {rect, view, recyclerView, state};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca8775793d4e39aef9ace66135496f78", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca8775793d4e39aef9ace66135496f78");
            return;
        }
        super.getItemOffsets(rect, view, recyclerView, state);
        rect.left = this.b;
        rect.right = this.c;
    }
}
