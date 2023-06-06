package com.sankuai.waimai.store.goods.list.viewblocks.experimental.adapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.viewblocks.experimental.holder.i;
import com.sankuai.waimai.store.newwidgets.list.f;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends f<GoodsSpu, com.sankuai.waimai.store.goods.list.delegate.c> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.cell.core.b b;
    private com.sankuai.waimai.store.goods.list.delegate.impl.c c;

    public b(com.sankuai.waimai.store.goods.list.delegate.impl.c cVar, com.sankuai.waimai.store.goods.list.delegate.c cVar2, com.sankuai.waimai.store.cell.core.b bVar) {
        super(cVar2);
        Object[] objArr = {cVar, cVar2, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2bdc00cf62933e0581654bb90b169981", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2bdc00cf62933e0581654bb90b169981");
            return;
        }
        this.c = cVar;
        this.b = bVar;
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.f
    @NonNull
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b95e709f2f421c1e1a4a765d27eeb12e", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b95e709f2f421c1e1a4a765d27eeb12e") : new i(this.c, this.b, getItemCount());
    }
}
