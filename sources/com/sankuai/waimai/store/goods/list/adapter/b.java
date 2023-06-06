package com.sankuai.waimai.store.goods.list.adapter;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.newwidgets.list.c<PoiVerticality, a> {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends com.sankuai.waimai.store.newwidgets.list.b {
        void a(int i);
    }

    public b(@NonNull a aVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2) {
        super(aVar);
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5f7c13ba502cb4c6eafdf161bcc73d9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5f7c13ba502cb4c6eafdf161bcc73d9");
        } else {
            this.b = aVar2;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "147c599c584cdb1306106a8bc82f0d24", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "147c599c584cdb1306106a8bc82f0d24");
        }
        com.sankuai.waimai.store.goods.list.viewholder.a aVar = new com.sankuai.waimai.store.goods.list.viewholder.a();
        aVar.c = this.b;
        return aVar;
    }
}
