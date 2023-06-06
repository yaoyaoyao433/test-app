package com.meituan.msc.modules.api.msi.hook;

import com.meituan.msc.common.utils.u;
import com.meituan.msc.extern.MSCEnvHelper;
import com.meituan.msc.modules.update.f;
import com.meituan.msi.api.ApiRequest;
import com.meituan.msi.api.IMsiApi;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.msi.RequestApi;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.tencent.open.SocialConstants;
import java.util.ArrayList;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public final class b extends com.meituan.msc.modules.api.msi.c<Object> {
    public static ChangeQuickRedirect c;

    @Override // com.meituan.msi.interceptor.a
    public final Object a(ApiRequest<?> apiRequest, Object obj) {
        return obj;
    }

    @Override // com.meituan.msc.modules.api.msi.c
    public final String a() {
        return SocialConstants.TYPE_REQUEST;
    }

    @Override // com.meituan.msi.interceptor.a
    public final void a(ApiRequest apiRequest) {
        RequestApi requestApi;
        RequestApi requestApi2;
        com.meituan.msi.api.request.RequestApi requestApi3;
        Interceptor a;
        Object[] objArr = {apiRequest};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d97f974f32e5b9ab252f71e6fbb8d8c9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d97f974f32e5b9ab252f71e6fbb8d8c9");
            return;
        }
        IMsiApi apiImpl = apiRequest.getApiImpl();
        Object[] objArr2 = {apiImpl};
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a6e9866c68576122448a714bed376fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a6e9866c68576122448a714bed376fe");
            return;
        }
        if (apiImpl instanceof com.meituan.msi.api.request.RequestApi) {
            com.meituan.msi.api.request.RequestApi requestApi4 = (com.meituan.msi.api.request.RequestApi) apiImpl;
            if (requestApi4 == null || requestApi4.a()) {
                return;
            }
            requestApi3 = requestApi4;
            requestApi2 = null;
        } else if (!(apiImpl instanceof RequestApi) || (requestApi = (RequestApi) apiImpl) == null || requestApi.a()) {
            return;
        } else {
            requestApi2 = requestApi;
            requestApi3 = null;
        }
        boolean c2 = com.meituan.msc.common.config.b.c();
        com.meituan.msc.modules.devtools.b bVar = (com.meituan.msc.modules.devtools.b) this.b.d(com.meituan.msc.modules.devtools.b.class);
        ArrayList arrayList = new ArrayList();
        if (bVar != null && (a = bVar.a(MSCEnvHelper.getContext())) != null) {
            arrayList.add(a);
        }
        if (requestApi3 != null) {
            requestApi3.a(b(), a(this.b.r), true, c2, arrayList);
        } else if (requestApi2 != null) {
            requestApi2.a(b(), a(this.b.r), true, c2, arrayList);
        }
    }

    public static String a(f fVar) {
        Object[] objArr = {fVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "643a9af67422197521f79d1f5477eadd", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "643a9af67422197521f79d1f5477eadd") : fVar.v() ? String.format("https://msc.meituan.com/%s/%s/service", fVar.j(), fVar.w()) : "https://msc.meituan.com/%s/%s/service";
    }

    public static String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7c897d680c515b50eee0160ddb769c66", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7c897d680c515b50eee0160ddb769c66") : f.e != null ? u.a(f.e) : "";
    }
}
