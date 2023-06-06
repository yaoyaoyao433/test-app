package com.sankuai.waimai.store.goods.list.mach;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.mach.recycler.c;
import com.sankuai.waimai.store.repository.model.g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.poilist.mach.a<g> {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final String a(String str) {
        return "sc_mach_market_goods_list";
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ String a(g gVar) {
        return gVar.g.cardModuleData.templateId;
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* synthetic */ Map a(int i, g gVar) {
        g gVar2 = gVar;
        Object[] objArr = {Integer.valueOf(i), gVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2823f9c7fc9952e371e694adaa6620ff", RobustBitConfig.DEFAULT_VALUE) ? (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2823f9c7fc9952e371e694adaa6620ff") : new HashMap(gVar2.g.cardModuleData.jsonData);
    }

    @Override // com.sankuai.waimai.store.poilist.mach.a
    public final /* bridge */ /* synthetic */ void a(g gVar, c cVar) {
        g gVar2 = gVar;
        gVar2.p.a = true;
        gVar2.p.b = cVar;
    }

    public a(@NonNull BaseActivity baseActivity, @NonNull b bVar) {
        super(baseActivity, bVar, "supermarket");
        Object[] objArr = {baseActivity, bVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f6bb0d2c7e28013d4463b4dea4d5c969", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f6bb0d2c7e28013d4463b4dea4d5c969");
        }
    }
}
