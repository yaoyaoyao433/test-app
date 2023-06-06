package com.sankuai.waimai.store.search.template.overpagesearch;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.android.common.aidata.entity.DataConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.search.model.GuidedItem;
import com.sankuai.waimai.store.search.model.OverPageFilterGroup;
import com.sankuai.waimai.store.search.statistics.f;
import com.sankuai.waimai.store.search.template.overpagefilter.d;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.search.adapterdelegates.b<OverPageFilterGroup, d> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    @NonNull
    public final /* synthetic */ d a(LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c099e2d54c32cecbd7492dd6a4c33e62", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c099e2d54c32cecbd7492dd6a4c33e62") : new d(layoutInflater.inflate(R.layout.wm_sc_search_over_page_filter, viewGroup, false), 0, 10);
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull OverPageFilterGroup overPageFilterGroup, @NonNull d dVar, int i) {
        OverPageFilterGroup overPageFilterGroup2 = overPageFilterGroup;
        d dVar2 = dVar;
        Object[] objArr = {overPageFilterGroup2, dVar2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d8811b97d307bbbe059c2e675ba97b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d8811b97d307bbbe059c2e675ba97b0");
        } else {
            dVar2.a(overPageFilterGroup2);
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final /* synthetic */ void a(@NonNull OverPageFilterGroup overPageFilterGroup, @NonNull f fVar) {
        OverPageFilterGroup overPageFilterGroup2 = overPageFilterGroup;
        Object[] objArr = {overPageFilterGroup2, fVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6965f49a2596b243d5837764bfdffa62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6965f49a2596b243d5837764bfdffa62");
        } else if (overPageFilterGroup2 != null && !com.sankuai.shangou.stone.util.a.b(overPageFilterGroup2.filterItems) && this.l != null) {
            int a2 = com.sankuai.shangou.stone.util.a.a((List) overPageFilterGroup2.filterItems);
            for (int i = 0; i < a2; i++) {
                GuidedItem guidedItem = (GuidedItem) com.sankuai.shangou.stone.util.a.a((List<Object>) overPageFilterGroup2.filterItems, i);
                if (guidedItem != null) {
                    if (guidedItem.overPageSearchNode == null) {
                        guidedItem.overPageSearchNode = new f();
                    }
                    f a3 = guidedItem.overPageSearchNode.a();
                    a3.b = fVar;
                    a3.c = "b_waimai_2zs5rxwn_mv";
                    a3.d = "b_waimai_2zs5rxwn_mc";
                    a3.e = i;
                    a3.a("search_log_id", this.l.b(overPageFilterGroup2)).a("index", Integer.valueOf(overPageFilterGroup2.getStatisticsIndex())).a("recommend_word", guidedItem.text).a(DataConstants.INDEX, Integer.valueOf(i));
                }
            }
        }
    }

    public a(Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05a9a3d20efca86fd02442326efb46c7", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05a9a3d20efca86fd02442326efb46c7");
        }
    }

    @Override // com.sankuai.waimai.store.search.adapterdelegates.b
    public final boolean a(@NonNull String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "555b3fbb980b76b2f79c824bcd69ffc4", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "555b3fbb980b76b2f79c824bcd69ffc4")).booleanValue() : str.equals("wm_shangou_search_over_page_search");
    }
}
