package com.sankuai.waimai.store.widgets.filterbar.multiselect.one;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.widgets.filterbar.multiselect.one.c;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c.a {
    public static ChangeQuickRedirect c;

    public d(c.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "79afeca92317f519aa3692fbad267b1c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "79afeca92317f519aa3692fbad267b1c");
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.multiselect.one.c.a
    public final void a(List<Long> list, SGSortModel sGSortModel) {
        boolean z;
        Object[] objArr = {list, sGSortModel};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d648324cfe269252c86a1b6be1fd2bc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d648324cfe269252c86a1b6be1fd2bc0");
        } else if (sGSortModel != null && !com.sankuai.shangou.stone.util.a.b(sGSortModel.subFilterList)) {
            ArrayList arrayList = new ArrayList();
            com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.d dVar = null;
            for (SGSortModel sGSortModel2 : sGSortModel.subFilterList) {
                if (sGSortModel2 != null) {
                    if (com.sankuai.shangou.stone.util.a.b(list) || com.sankuai.shangou.stone.util.a.b(sGSortModel2.typeList)) {
                        z = com.sankuai.shangou.stone.util.a.b(list) && com.sankuai.shangou.stone.util.a.b(sGSortModel2.typeList);
                    } else {
                        z = list.containsAll(sGSortModel2.typeList);
                    }
                    com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.d dVar2 = new com.sankuai.waimai.store.widgets.filterbar.multiselect.one.sub.d(sGSortModel2, z);
                    if (z && dVar == null) {
                        dVar = dVar2;
                    }
                    arrayList.add(dVar2);
                }
            }
            if ((dVar == null || dVar.a == null || !com.sankuai.shangou.stone.util.a.a((Collection<?>) dVar.a.typeList)) ? false : true) {
                this.b.a(dVar.a.text, true);
            } else {
                this.b.a(sGSortModel.text, false);
            }
            this.b.a(arrayList);
        }
    }
}
