package com.sankuai.waimai.store.drug.util;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.core.j;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b implements com.sankuai.waimai.router.core.e {
    public static ChangeQuickRedirect a;
    public final List<com.sankuai.waimai.router.core.e> b;

    public b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "95690178fe6c31a786ae19cece6e555a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "95690178fe6c31a786ae19cece6e555a");
        } else {
            this.b = new ArrayList();
        }
    }

    @Override // com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar) {
        Object[] objArr = {jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b109747556f83d2e40fa11dd45b12af0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b109747556f83d2e40fa11dd45b12af0");
            return;
        }
        for (com.sankuai.waimai.router.core.e eVar : this.b) {
            eVar.a(jVar);
        }
    }

    @Override // com.sankuai.waimai.router.core.e
    public final void a(@NonNull j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aaf46c875ea572ece72ebc48776796d9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aaf46c875ea572ece72ebc48776796d9");
            return;
        }
        for (com.sankuai.waimai.router.core.e eVar : this.b) {
            eVar.a(jVar, i);
        }
    }
}
