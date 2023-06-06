package com.sankuai.waimai.store.msi.view.shoprest;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.newwidgets.list.g;
import com.sankuai.waimai.store.repository.model.PoiVerticality;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.newwidgets.list.c<PoiVerticality, a> {
    public static ChangeQuickRedirect a;
    private final com.sankuai.waimai.store.platform.domain.manager.poi.a b;

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public interface a extends com.sankuai.waimai.store.newwidgets.list.b {
        void a(int i);
    }

    public b(a aVar, com.sankuai.waimai.store.platform.domain.manager.poi.a aVar2) {
        super(aVar);
        Object[] objArr = {aVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9a5f79aa4acce961bc787566f5a53d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9a5f79aa4acce961bc787566f5a53d");
        } else {
            this.b = aVar2;
        }
    }

    @Override // com.sankuai.waimai.store.newwidgets.list.c
    public final g a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b3b5d9b30c9f257236a8d8f3ce9f668e", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b3b5d9b30c9f257236a8d8f3ce9f668e");
        }
        c cVar = new c();
        cVar.c = this.b;
        return cVar;
    }
}
