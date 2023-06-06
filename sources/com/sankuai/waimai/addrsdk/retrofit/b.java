package com.sankuai.waimai.addrsdk.retrofit;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.android.singleton.e;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.adapter.rxjava.f;
import com.sankuai.meituan.retrofit2.ar;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.waimai.addrsdk.api.AddressDeliveryApi;
import com.sankuai.waimai.addrsdk.api.AddressMafApi;
import com.sankuai.waimai.addrsdk.mvp.bean.BaseResponse;
import com.sankuai.waimai.addrsdk.utils.d;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b {
    public static ChangeQuickRedirect a;
    private static e<ar> b;
    private static HashMap<Class, e<ar>> c = new HashMap<>();
    private static a.InterfaceC0637a d;

    private static void a(Class cls, e<ar> eVar) {
        Object[] objArr = {cls, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b14aeb71e49397e5f5ccfbe5708dfbd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b14aeb71e49397e5f5ccfbe5708dfbd3");
        } else {
            c.put(cls, eVar);
        }
    }

    public static ar a(Class cls) {
        Object[] objArr = {cls};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f882261b77df1aad67469fe38ec8b90a", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f882261b77df1aad67469fe38ec8b90a");
        }
        e<ar> eVar = c.get(cls);
        if (eVar == null) {
            if (b == null) {
                b = new a();
            }
            eVar = b;
        }
        return eVar.b();
    }

    public static void a(a.InterfaceC0637a interfaceC0637a) {
        Object[] objArr = {interfaceC0637a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3947b2a6ddad28648b6ef833c8692710", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3947b2a6ddad28648b6ef833c8692710");
        } else if (interfaceC0637a == null) {
            throw new IllegalArgumentException("call RetrofitCallFactoryService.init first ,and factory must not be null");
        } else {
            if (d == null) {
                d = interfaceC0637a;
                a(AddressMafApi.class, new c());
                a(AddressDeliveryApi.class, new C0682b());
                return;
            }
            new StringBuilder("factory has inited: ").append(com.sankuai.waimai.addrsdk.manager.a.a().b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class a extends e<ar> {
        public static ChangeQuickRedirect a;

        public a() {
        }

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ ar a() {
            Gson create;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "287744167b1a1c0fc839fdcaf1fea7a5", RobustBitConfig.DEFAULT_VALUE)) {
                return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "287744167b1a1c0fc839fdcaf1fea7a5");
            }
            ar.a a2 = new ar.a().a("https://addressapi.meituan.com").a(b.d).a(new com.sankuai.waimai.addrsdk.retrofit.interceptor.a()).a(new com.sankuai.waimai.addrsdk.retrofit.interceptor.b()).a(f.a());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4913dbd7908ef8c3c6584dcc78c18a01", RobustBitConfig.DEFAULT_VALUE)) {
                create = (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4913dbd7908ef8c3c6584dcc78c18a01");
            } else {
                GsonBuilder gsonBuilder = new GsonBuilder();
                gsonBuilder.registerTypeAdapter(BaseResponse.class, new BaseResponse.Deserializer());
                create = gsonBuilder.create();
            }
            return a2.a(com.sankuai.meituan.retrofit2.converter.gson.a.a(create)).a();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c extends e<ar> {
        public static ChangeQuickRedirect a;

        public c() {
        }

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ ar a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "261d116eb640fc2137418bcfcf532919", RobustBitConfig.DEFAULT_VALUE)) {
                return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "261d116eb640fc2137418bcfcf532919");
            }
            ar.a a2 = new ar.a().a("https://maf.meituan.com").a(b.d).a(f.a());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return a2.a(com.sankuai.meituan.retrofit2.converter.gson.a.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "93e3165c236671eb98f82a4532650e0c", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "93e3165c236671eb98f82a4532650e0c") : new Gson())).a();
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.waimai.addrsdk.retrofit.b$b  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0682b extends e<ar> {
        public static ChangeQuickRedirect a;

        public C0682b() {
        }

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ ar a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a55b0e9006a45bdb203dccb7519dc62b", RobustBitConfig.DEFAULT_VALUE)) {
                return (ar) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a55b0e9006a45bdb203dccb7519dc62b");
            }
            ar.a a2 = new ar.a().a(d.b()).a(b.d).a(f.a());
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            return a2.a(com.sankuai.meituan.retrofit2.converter.gson.a.a(PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fadbe65023664c59d0ef59255e427915", RobustBitConfig.DEFAULT_VALUE) ? (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fadbe65023664c59d0ef59255e427915") : new Gson())).a();
        }
    }

    public static boolean a() {
        return d != null;
    }
}
