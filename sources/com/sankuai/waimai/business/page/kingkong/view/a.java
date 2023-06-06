package com.sankuai.waimai.business.page.kingkong.view;

import android.content.Context;
import android.graphics.Rect;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import com.meituan.android.cube.pga.viewmodel.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends b {
    public static ChangeQuickRedirect p;
    private List<com.meituan.android.cube.pga.viewmodel.a> q;

    @Override // com.meituan.android.cube.pga.viewmodel.b
    public final RecyclerView.LayoutManager o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06ab271436045de5ed60012698cfcbcd", RobustBitConfig.DEFAULT_VALUE)) {
            return (RecyclerView.LayoutManager) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06ab271436045de5ed60012698cfcbcd");
        }
        final Context context = this.d;
        return new LinearLayoutManager(context, 1, false) { // from class: com.sankuai.waimai.business.page.kingkong.view.KingKongRecyclerViewModel$1
            @Override // android.support.v7.widget.RecyclerView.LayoutManager
            public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
                return false;
            }

            @Override // android.support.v7.widget.RecyclerView.LayoutManager
            public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
                return false;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.viewmodel.b
    public final int n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ca4c34f5cf72304f341684c7804ef998", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ca4c34f5cf72304f341684c7804ef998")).intValue() : this.q.size();
    }

    @Override // com.meituan.android.cube.pga.viewmodel.b
    public final com.meituan.android.cube.pga.viewmodel.a b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = p;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "20eaa9fecc1f7d1842a6528d763ba201", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "20eaa9fecc1f7d1842a6528d763ba201") : this.q.get(i);
    }
}
