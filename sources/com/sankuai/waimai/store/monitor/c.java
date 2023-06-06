package com.sankuai.waimai.store.monitor;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.aj;
import com.sankuai.meituan.retrofit2.ap;
import com.sankuai.meituan.retrofit2.raw.b;
import com.sankuai.meituan.retrofit2.s;
import com.sankuai.waimai.store.config.j;
import java.io.ByteArrayInputStream;
import java.io.IOException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class c implements Interceptor {
    public static ChangeQuickRedirect a;
    private d b;
    private boolean c;

    public c(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6042a81ad3594cfee3752e8f260fe4d1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6042a81ad3594cfee3752e8f260fe4d1");
            return;
        }
        this.b = dVar;
        this.c = j.h().a("sniffer/interceptor_api", true);
    }

    @Override // com.sankuai.meituan.retrofit2.Interceptor
    public final com.sankuai.meituan.retrofit2.raw.b intercept(Interceptor.a aVar) throws IOException {
        com.sankuai.meituan.retrofit2.raw.b bVar;
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e48d372dd7c76af590b37edd13774ba8", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e48d372dd7c76af590b37edd13774ba8");
        }
        aj request = aVar.request();
        String b = request.b();
        com.sankuai.waimai.store.base.monitor.time.a a2 = com.sankuai.waimai.store.base.monitor.time.a.a();
        Object[] objArr2 = {b};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.base.monitor.time.a.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "635afad232907de7263ba8216c7cfb4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "635afad232907de7263ba8216c7cfb4e");
        }
        com.sankuai.meituan.retrofit2.raw.b a3 = aVar.a(request);
        if (this.c) {
            try {
                Object[] objArr3 = {request, a3};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "974893d0e32f5f8c9fe59f73530f73a3", RobustBitConfig.DEFAULT_VALUE)) {
                    bVar = (com.sankuai.meituan.retrofit2.raw.b) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "974893d0e32f5f8c9fe59f73530f73a3");
                } else {
                    if (this.b != null) {
                        String str = null;
                        aj a4 = request != null ? request.a().a() : null;
                        if (a3 != null) {
                            b.a aVar2 = new b.a(a3);
                            ap body = a3.body();
                            if (body != null && (str = body.string()) != null) {
                                aVar2.a(body.newBuilder().a(new ByteArrayInputStream(str.getBytes())).a());
                            }
                            String str2 = str;
                            bVar = aVar2.a();
                            String a5 = s.a("M-TraceId", a3.headers());
                            if (a4 != null) {
                                this.b.a(a4.b(), a4.i(), a3.code(), str2, a5);
                            } else {
                                this.b.a("", null, a3.code(), str2, a5);
                            }
                        }
                    }
                    bVar = a3;
                }
                com.sankuai.waimai.store.base.monitor.time.a.a().a(b);
                return bVar;
            } catch (Exception e) {
                com.sankuai.waimai.store.base.log.a.a(e);
            }
        }
        com.sankuai.waimai.store.base.monitor.time.a.a().a(b);
        return a3;
    }
}
