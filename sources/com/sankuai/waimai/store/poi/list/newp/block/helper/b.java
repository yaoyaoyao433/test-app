package com.sankuai.waimai.store.poi.list.newp.block.helper;

import android.app.Activity;
import android.content.Context;
import android.support.constraint.R;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.waimai.store.poi.list.newp.skeleton.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b {
    public static ChangeQuickRedirect a;

    public static void a(int i, Activity activity, RecyclerView recyclerView) {
        Object[] objArr = {Integer.valueOf(i), activity, recyclerView};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "703466f78730ae0d1d13bc178400801e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "703466f78730ae0d1d13bc178400801e");
        } else if (activity == null || recyclerView == null) {
        } else {
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.base.abtest.a.a;
            boolean booleanValue = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "75b8b0206cce42e2e40849f6502260f2", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "75b8b0206cce42e2e40849f6502260f2")).booleanValue() : com.sankuai.waimai.store.manager.abtest.a.a("sg_opt_1_wm_list_skeleton", "A").c();
            if (i == 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(activity, 1, false));
                b.a a2 = com.sankuai.waimai.store.poi.list.newp.skeleton.b.a(recyclerView);
                a2.d = 4;
                a2.c = booleanValue ? R.layout.wm_sc_channel_item_skeleton_new_default : R.layout.wm_sc_home_item_skeleton_default_layout;
                a2.a();
                return;
            }
            recyclerView.setLayoutManager(new GridLayoutManager(activity, 2));
            recyclerView.addItemDecoration(new com.sankuai.waimai.store.poi.list.newp.skeleton.a(h.a(activity, 8.0f)));
            b.a a3 = com.sankuai.waimai.store.poi.list.newp.skeleton.b.a(recyclerView);
            a3.d = (h.c(activity) / (((h.a((Context) activity) - h.a(activity, 32.0f)) / 2) + h.a(activity, 110.0f))) * 2;
            a3.e = true;
            a3.f = booleanValue;
            a3.c = booleanValue ? R.layout.wm_sc_channel_item_skeleton_new_two : R.layout.wm_sc_home_item_skeleton_two_layout;
            a3.a();
        }
    }
}
