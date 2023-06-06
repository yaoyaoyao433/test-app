package com.sankuai.waimai.store.drug.home.refactor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class c implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final DrugPoiTemplate b;

    public c(DrugPoiTemplate drugPoiTemplate) {
        this.b = drugPoiTemplate;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4524175bfabbecf8b18c0b4d3178a094", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4524175bfabbecf8b18c0b4d3178a094");
        } else {
            DrugPoiTemplate.a(this.b, (com.sankuai.waimai.store.drug.home.refactor.event.a) obj);
        }
    }
}
