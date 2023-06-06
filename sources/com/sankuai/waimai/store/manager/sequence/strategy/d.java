package com.sankuai.waimai.store.manager.sequence.strategy;

import android.support.annotation.Nullable;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d implements a {
    public static ChangeQuickRedirect a;
    private long b;

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public final void rollback(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar) {
    }

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public final void updateValidStatus(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar) {
    }

    public d(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3987ac8d0cad204b916be87f8fdcd44", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3987ac8d0cad204b916be87f8fdcd44");
        } else {
            this.b = j;
        }
    }

    @Override // com.sankuai.waimai.store.manager.sequence.strategy.a
    public final boolean isValid(@Nullable com.sankuai.waimai.store.manager.marketing.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "634e1981c56ba2d52cec8827894f1387", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "634e1981c56ba2d52cec8827894f1387")).booleanValue();
        }
        long c = dVar == null ? 0L : dVar.c();
        return c > 0 && System.currentTimeMillis() - c >= this.b;
    }
}
