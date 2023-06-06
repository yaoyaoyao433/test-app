package com.sankuai.waimai.store.base.net;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.Interceptor;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.store.repository.deserializer.BaseResponseDeserializer;
import com.sankuai.waimai.store.util.v;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class b implements i {
    public static ChangeQuickRedirect a;
    public static final String b = (String) v.a(new v.b<String>() { // from class: com.sankuai.waimai.store.base.net.b.1
        @Override // com.sankuai.waimai.store.util.v.b
        public final /* bridge */ /* synthetic */ String a() {
            return "/dp/";
        }

        @Override // com.sankuai.waimai.store.util.v.b
        public final /* bridge */ /* synthetic */ String b() {
            return "/sgapi/";
        }

        @Override // com.sankuai.waimai.store.util.v.b
        public final /* bridge */ /* synthetic */ String c() {
            return "/api/";
        }

        @Override // com.sankuai.waimai.store.util.v.b
        public final /* bridge */ /* synthetic */ String d() {
            return "/mtapi/";
        }
    });
    private volatile ar c;

    public abstract h e();

    public List<Class<?>> f() {
        return null;
    }

    @Override // com.sankuai.waimai.store.base.net.i
    public final ar a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53a929d863f53763c4456aba0cd897e", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53a929d863f53763c4456aba0cd897e");
        }
        if (this.c == null) {
            synchronized (this) {
                if (this.c == null) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    this.c = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e95683603d23920e1412805e9126144d", RobustBitConfig.DEFAULT_VALUE) ? (ar) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e95683603d23920e1412805e9126144d") : b().a(c()).a(g()).a();
                }
            }
        }
        return this.c;
    }

    public ar.a b() {
        List<Interceptor> arrayList;
        Interceptor interceptor;
        Interceptor interceptor2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86acf4c5724dcb821dfb4d7994903129", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86acf4c5724dcb821dfb4d7994903129");
        }
        ar.a aVar = new ar.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = f.a;
        ar.a a2 = aVar.a(PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "43300e178ca4b4f581eec899f511853d", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "43300e178ca4b4f581eec899f511853d") : com.meituan.android.singleton.i.a("oknv")).a(com.sankuai.meituan.retrofit2.adapter.rxjava.f.a());
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.foundation.core.service.net.a.a;
        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "58b6ed382cc24ef0d4cfbc9b94a2710c", RobustBitConfig.DEFAULT_VALUE)) {
            arrayList = (List) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "58b6ed382cc24ef0d4cfbc9b94a2710c");
        } else {
            arrayList = new ArrayList<>();
            if ((com.sankuai.waimai.foundation.core.a.e() || com.sankuai.waimai.foundation.core.a.f()) && (interceptor = (Interceptor) com.sankuai.waimai.router.a.a(Interceptor.class, "interceptor_server")) != null) {
                arrayList.add(interceptor);
            }
            Interceptor interceptor3 = (Interceptor) com.sankuai.waimai.router.a.a(Interceptor.class, "interceptor_crawler");
            if (interceptor3 != null) {
                arrayList.add(interceptor3);
            }
            Interceptor interceptor4 = (Interceptor) com.sankuai.waimai.router.a.a(Interceptor.class, "interceptor_business");
            if (interceptor4 != null) {
                arrayList.add(interceptor4);
            }
            if ((com.sankuai.waimai.foundation.core.a.e() || com.sankuai.waimai.foundation.core.a.f()) && (interceptor2 = (Interceptor) com.sankuai.waimai.router.a.a(Interceptor.class, "interceptor_mt_common_params")) != null) {
                arrayList.add(interceptor2);
            }
        }
        return a2.a(arrayList);
    }

    private com.sankuai.meituan.retrofit2.converter.gson.a g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fc633844a7ab657a6688651a0081c949", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.meituan.retrofit2.converter.gson.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fc633844a7ab657a6688651a0081c949");
        }
        Gson create = d().create();
        List<Class<?>> f = f();
        if (!com.sankuai.shangou.stone.util.a.b(f)) {
            for (Class<?> cls : f) {
                try {
                    create.fromJson("{}", (Class) cls);
                } catch (Exception e) {
                    com.sankuai.waimai.store.base.log.a.a(e);
                }
            }
        }
        return com.sankuai.meituan.retrofit2.converter.gson.a.a(create);
    }

    public String c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51be9c1f226971dd18eb417f82aa465", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51be9c1f226971dd18eb417f82aa465") : e().a();
    }

    public GsonBuilder d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "742ce79cda67f0dd5513ab991ad430a7", RobustBitConfig.DEFAULT_VALUE) ? (GsonBuilder) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "742ce79cda67f0dd5513ab991ad430a7") : com.sankuai.waimai.store.util.i.b().registerTypeAdapter(BaseResponse.class, new BaseResponseDeserializer());
    }
}
