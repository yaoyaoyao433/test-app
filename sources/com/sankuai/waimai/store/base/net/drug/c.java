package com.sankuai.waimai.store.base.net.drug;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.net.i;
import com.sankuai.waimai.store.base.net.j;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class c extends com.sankuai.waimai.store.base.net.d<DrugPlatformApiService> {
    public static ChangeQuickRedirect a;

    public static c a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "88819c57e0f521180bef6ce53e9f2b08", RobustBitConfig.DEFAULT_VALUE)) {
            return (c) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "88819c57e0f521180bef6ce53e9f2b08");
        }
        c cVar = (c) com.sankuai.waimai.store.base.net.c.a(obj, c.class);
        if (cVar == null) {
            c cVar2 = new c();
            com.sankuai.waimai.store.base.net.c.a(obj, cVar2);
            return cVar2;
        }
        return cVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7e3880940628f8d446bbf94f51b039cd", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7e3880940628f8d446bbf94f51b039cd") : new d();
    }

    public final void a(Map<String, Object> map, j<MarketingResponse> jVar) {
        Object[] objArr = {map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18e67dc54bfc69e7f59291a23ad1337e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18e67dc54bfc69e7f59291a23ad1337e");
        } else {
            a(jVar, ((DrugPlatformApiService) this.d).getMarketingEntry(map));
        }
    }
}
