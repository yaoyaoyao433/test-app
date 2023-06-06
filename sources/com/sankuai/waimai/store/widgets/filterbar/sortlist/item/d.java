package com.sankuai.waimai.store.widgets.filterbar.sortlist.item;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.platform.shop.model.SGSortModel;
import com.sankuai.waimai.store.widgets.filterbar.sortlist.item.c;
import java.util.Collection;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends c.a {
    public static ChangeQuickRedirect c;
    private SGSortModel d;
    private int e;

    public d(@NonNull c.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "250f1e90553d0e63fc2e46c64f27f6fb", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "250f1e90553d0e63fc2e46c64f27f6fb");
        }
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.c.a
    public final void a(long j, SGSortModel sGSortModel) {
        int i = 0;
        Object[] objArr = {new Long(j), sGSortModel};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b9a07ee36f03f21d51f5685cd948b758", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b9a07ee36f03f21d51f5685cd948b758");
            return;
        }
        this.d = sGSortModel;
        if (sGSortModel == null) {
            return;
        }
        this.e = -1;
        if (com.sankuai.shangou.stone.util.a.a((Collection<?>) sGSortModel.typeList)) {
            while (true) {
                if (i < sGSortModel.typeList.size()) {
                    Long l = sGSortModel.typeList.get(i);
                    if (l != null && l.longValue() == j) {
                        this.e = i;
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        this.b.a(sGSortModel.text, this.e);
    }

    @Override // com.sankuai.waimai.store.widgets.filterbar.sortlist.item.c.a
    public final void a() {
        int a;
        Long l;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "98d8028847fc8f2c601c0a518ac7d6a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "98d8028847fc8f2c601c0a518ac7d6a2");
        } else if (this.d == null || (a = com.sankuai.shangou.stone.util.a.a((List) this.d.typeList)) == 0) {
        } else {
            int i = this.e;
            this.e++;
            if (this.e >= a) {
                this.e = 0;
            }
            if (this.e == i || (l = (Long) com.sankuai.shangou.stone.util.a.a((List<Object>) this.d.typeList, this.e)) == null) {
                return;
            }
            this.b.a((int) this.d.category, l.intValue());
        }
    }
}
