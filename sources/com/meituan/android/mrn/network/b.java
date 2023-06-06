package com.meituan.android.mrn.network;

import android.content.Context;
import com.google.gson.JsonElement;
import com.meituan.android.mrn.config.ad;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.CollectionUtils;
import com.sankuai.meituan.retrofit2.Call;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.ae;
import com.sankuai.meituan.retrofit2.ar;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class b implements MRNApiRetrofitService {
    public static ChangeQuickRedirect a;
    private ar b;

    public static b a(Context context, String str, List<Interceptor> list) {
        Object[] objArr = {context, str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b409c36ffd5abd9ae91c7d6a0b3bc6da", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b409c36ffd5abd9ae91c7d6a0b3bc6da") : new b(context, str, list);
    }

    private b(Context context, String str, List<Interceptor> list) {
        Object[] objArr = {context, str, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5131d050af1abd4e0a581fcf3b9c2437", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5131d050af1abd4e0a581fcf3b9c2437");
            return;
        }
        ar.a a2 = new ar.a().a(str).a(ad.a(context.getApplicationContext())).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a()).a(com.sankuai.meituan.retrofit2.converter.gson.a.a());
        if (!CollectionUtils.isEmpty(list)) {
            a2.a(list);
        }
        this.b = a2.a();
    }

    @Override // com.meituan.android.mrn.network.MRNApiRetrofitService
    public final Call<JsonElement> getRequest(Map<String, String> map, String str, Map<String, Object> map2) {
        Object[] objArr = {map, str, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88f5dfa69934520332cc4b718f43b7bd", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88f5dfa69934520332cc4b718f43b7bd") : ((MRNApiRetrofitService) this.b.a(MRNApiRetrofitService.class)).getRequest(map, str, map2);
    }

    @Override // com.meituan.android.mrn.network.MRNApiRetrofitService
    public final Call<JsonElement> postJsonRequest(Map<String, String> map, String str, Map<String, Object> map2, Map<String, Object> map3) {
        Object[] objArr = {map, str, map2, map3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32cc24b56b39aee98baa90a32fffdb89", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32cc24b56b39aee98baa90a32fffdb89") : ((MRNApiRetrofitService) this.b.a(MRNApiRetrofitService.class)).postJsonRequest(map, str, map2, map3);
    }

    @Override // com.meituan.android.mrn.network.MRNApiRetrofitService
    public final Call<JsonElement> postFormRequest(Map<String, String> map, String str, Map<String, Object> map2, Map<String, Object> map3) {
        Object[] objArr = {map, str, map2, map3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0082b6294d22322daa0207aa8b44acfc", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0082b6294d22322daa0207aa8b44acfc") : ((MRNApiRetrofitService) this.b.a(MRNApiRetrofitService.class)).postFormRequest(map, str, map2, map3);
    }

    @Override // com.meituan.android.mrn.network.MRNApiRetrofitService
    public final Call<JsonElement> deleteRequest(Map<String, String> map, String str, Map<String, Object> map2) {
        Object[] objArr = {map, str, map2};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c1458d73778a8c13d8b6b100df4c435", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c1458d73778a8c13d8b6b100df4c435") : ((MRNApiRetrofitService) this.b.a(MRNApiRetrofitService.class)).deleteRequest(map, str, map2);
    }

    @Override // com.meituan.android.mrn.network.MRNApiRetrofitService
    public final Call<JsonElement> putRequest(Map<String, String> map, String str, Map<String, Object> map2, Map<String, Object> map3) {
        Object[] objArr = {map, str, map2, map3};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d8aea68f9bc4f4359280eb80a4cf2e0", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d8aea68f9bc4f4359280eb80a4cf2e0") : ((MRNApiRetrofitService) this.b.a(MRNApiRetrofitService.class)).putRequest(map, str, map2, map3);
    }

    @Override // com.meituan.android.mrn.network.MRNApiRetrofitService
    public final Call<JsonElement> postMultiPartRequest(Map<String, String> map, String str, Map<String, Object> map2, List<ae.b> list) {
        Object[] objArr = {map, str, map2, list};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d6ee98b8cd2d54274e1c6a21ae5878b", RobustBitConfig.DEFAULT_VALUE) ? (Call) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d6ee98b8cd2d54274e1c6a21ae5878b") : ((MRNApiRetrofitService) this.b.a(MRNApiRetrofitService.class)).postMultiPartRequest(map, str, map2, list);
    }
}
