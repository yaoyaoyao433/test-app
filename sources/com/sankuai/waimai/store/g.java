package com.sankuai.waimai.store;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.http.FieldMap;
import com.sankuai.meituan.retrofit2.http.Url;
import com.sankuai.waimai.store.goods.subscribe.SpuSubscribeResponse;
import com.sankuai.waimai.store.platform.marketing.MarketingResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class g extends com.sankuai.waimai.store.base.net.d<PlatformApiService> {
    public static ChangeQuickRedirect a;

    public static g a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e85f485657801918984745fd3a82282f", RobustBitConfig.DEFAULT_VALUE)) {
            return (g) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e85f485657801918984745fd3a82282f");
        }
        g gVar = (g) com.sankuai.waimai.store.base.net.c.a(obj, g.class);
        if (gVar == null) {
            g gVar2 = new g();
            com.sankuai.waimai.store.base.net.c.a(obj, gVar2);
            return gVar2;
        }
        return gVar;
    }

    @Override // com.sankuai.waimai.store.base.net.d
    @NonNull
    public final com.sankuai.waimai.store.base.net.i a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47f84ba4e210e75dc2260ae258e2f847", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.base.net.i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47f84ba4e210e75dc2260ae258e2f847") : new h();
    }

    public final void a(Map<String, Object> map, com.sankuai.waimai.store.base.net.j<MarketingResponse> jVar) {
        Object[] objArr = {map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18dc3802f7620a8b4ac4f04e8fa9dd25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18dc3802f7620a8b4ac4f04e8fa9dd25");
        } else {
            a(jVar, ((PlatformApiService) this.d).getMarketingEntry(map));
        }
    }

    public final void b(Map<String, Object> map, com.sankuai.waimai.store.base.net.j<MarketingResponse> jVar) {
        Object[] objArr = {map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc98e8a0e9057580232523eeb61f2105", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc98e8a0e9057580232523eeb61f2105");
        } else {
            a(jVar, ((PlatformApiService) this.d).getIMMarketingEntry(map));
        }
    }

    public final void a(@Url String str, @FieldMap Map<String, String> map, com.sankuai.waimai.store.base.net.j<Object> jVar) {
        Object[] objArr = {str, map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2e3f4669ae8797ffef7ca72865ae9e99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2e3f4669ae8797ffef7ca72865ae9e99");
        } else {
            a(jVar, ((PlatformApiService) this.d).machRequest(str, map));
        }
    }

    public final void c(Map<String, String> map, com.sankuai.waimai.store.base.net.j<SpuSubscribeResponse> jVar) {
        Object[] objArr = {map, jVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8e70a7410c81c61e69a13d3375bd332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8e70a7410c81c61e69a13d3375bd332");
        } else {
            a(jVar, ((PlatformApiService) this.d).subscribePoi(map));
        }
    }
}
