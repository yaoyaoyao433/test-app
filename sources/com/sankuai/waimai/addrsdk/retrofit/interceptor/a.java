package com.sankuai.waimai.addrsdk.retrofit.interceptor;

import android.text.TextUtils;
import com.meituan.msc.modules.engine.requestPrefetch.PrefetchConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.t;
import com.tencent.connect.common.Constants;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a implements Interceptor {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        t e;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af75e122fd38ce165d06af2afd10db58", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af75e122fd38ce165d06af2afd10db58");
        }
        com.sankuai.waimai.addrsdk.base.a b = com.sankuai.waimai.addrsdk.manager.a.a().b();
        aj request = aVar.request();
        aj.a a2 = request.a();
        a2.b("uuid", b.a());
        a2.b("dpid", b.b());
        a2.b("unionid", b.c());
        a2.b("siua", b.e());
        if (request.b().contains("address/configuration") && !request.d().contains("content-type")) {
            a2.b("content-type", PrefetchConfig.PREFETCH_POST_CONTENT_TYPE_FORM);
        }
        String b2 = request.b();
        Object[] objArr2 = {b2, b};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "26a330610f2c8626f4e2028a8c4a97ee", RobustBitConfig.DEFAULT_VALUE)) {
            b2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "26a330610f2c8626f4e2028a8c4a97ee");
        } else if (!TextUtils.isEmpty(b2) && (e = t.e(b2)) != null) {
            b2 = e.m().a("utm_medium", b.d()).a("platform", b.f()).a("partner", b.g()).a("app", b.h()).a("client_version", b.j()).a("biz_id", b.k()).a(Constants.PARAM_CLIENT_ID, b.l()).a("login_token", b.m()).a("login_token_type", b.n()).a("sdk_build_version", "7.88.5").a("device_version", b.o()).a("device_type", b.p()).a("address_sdk_version", com.sankuai.waimai.addrsdk.constants.a.f).a("address_sdk_address_bean_version", com.sankuai.waimai.addrsdk.constants.a.g).a("address_sdk_type", com.sankuai.waimai.addrsdk.constants.a.h).a("address_sdk_maf_key", b.u()).b().toString();
        }
        return aVar.a(a2.b(b2).a());
    }
}
