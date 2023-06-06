package com.sankuai.waimai.platform.net.service;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.location.geo.LocationMafApi;
import com.sankuai.waimai.foundation.location.geo.MtMobileApi;
import com.sankuai.waimai.platform.capacity.network.gsonbuilder.AbstractGsonBuilder;
import com.sankuai.waimai.platform.domain.manager.againstcheat.AgainstCheatingApi;
import com.sankuai.waimai.platform.domain.manager.location.geo.DeliveryApi;
import com.sankuai.waimai.platform.domain.manager.location.geo.MafApi;
import com.sankuai.waimai.platform.domain.manager.user.net.UCenterTspApi;
import com.sankuai.waimai.platform.net.util.f;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d {
    public static ChangeQuickRedirect a = null;
    private static volatile boolean b = false;
    private static List<AbstractGsonBuilder> c = new ArrayList();
    private static a d = null;
    private static a e = null;
    private static a f = null;
    private static a g = null;
    private static a h = null;
    private static a i = null;

    public static void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "7459da390b9750a8e02d55f4809fc23f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "7459da390b9750a8e02d55f4809fc23f");
        } else if (b) {
        } else {
            c.clear();
            c = com.sankuai.waimai.router.a.a(AbstractGsonBuilder.class);
            if (d == null) {
                d = new a() { // from class: com.sankuai.waimai.platform.net.service.d.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final String c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "324cd7f18c665639a841d47699b6fb8e", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "324cd7f18c665639a841d47699b6fb8e");
                        }
                        return com.sankuai.waimai.platform.net.c.a().e() + f.a;
                    }

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final Gson d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3c061d5eec2f474a27d2f54601d12e03", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3c061d5eec2f474a27d2f54601d12e03");
                        }
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        for (AbstractGsonBuilder abstractGsonBuilder : d.c) {
                            abstractGsonBuilder.registerWmApiProviderTypeAdapter(gsonBuilder);
                        }
                        return gsonBuilder.create();
                    }
                };
            }
            if (e == null) {
                e = new a() { // from class: com.sankuai.waimai.platform.net.service.d.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final String c() {
                        return "https://maf.meituan.com";
                    }

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final Gson d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3a66a70ffb0055d1d9b386e89011abed", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3a66a70ffb0055d1d9b386e89011abed");
                        }
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        for (AbstractGsonBuilder abstractGsonBuilder : d.c) {
                            abstractGsonBuilder.registerMafApiProviderTypeAdapter(gsonBuilder);
                        }
                        return gsonBuilder.create();
                    }
                };
            }
            if (f == null) {
                f = new a() { // from class: com.sankuai.waimai.platform.net.service.d.3
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final String c() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8be000df38e87805ef0408c5a332b3bf", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8be000df38e87805ef0408c5a332b3bf") : com.sankuai.waimai.addrsdk.utils.d.b();
                    }

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final Gson d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a8f8b1a986eaa9cdd20cf04d0c830e4", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a8f8b1a986eaa9cdd20cf04d0c830e4");
                        }
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        for (AbstractGsonBuilder abstractGsonBuilder : d.c) {
                            abstractGsonBuilder.registerDeliveryApiProviderTypeAdapter(gsonBuilder);
                        }
                        return gsonBuilder.create();
                    }
                };
            }
            if (g == null) {
                g = new a() { // from class: com.sankuai.waimai.platform.net.service.d.4
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final String c() {
                        return "http://apimobile.meituan.com";
                    }

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final Gson d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19e2c94922eb0cb0fce3539cdb4d11aa", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19e2c94922eb0cb0fce3539cdb4d11aa");
                        }
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        for (AbstractGsonBuilder abstractGsonBuilder : d.c) {
                            abstractGsonBuilder.registerMtMobileApiProviderTypeAdapter(gsonBuilder);
                        }
                        return gsonBuilder.create();
                    }
                };
            }
            if (h == null) {
                h = new a() { // from class: com.sankuai.waimai.platform.net.service.d.5
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final String c() {
                        String str;
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "3b13231bd4248df5eb97d5b41791b694", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "3b13231bd4248df5eb97d5b41791b694");
                        }
                        com.sankuai.waimai.platform.net.c a2 = com.sankuai.waimai.platform.net.c.a();
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.platform.net.c.a;
                        if (PatchProxy.isSupport(objArr3, a2, changeQuickRedirect3, false, "4ca58221280f1cdc8e143959f637744b", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr3, a2, changeQuickRedirect3, false, "4ca58221280f1cdc8e143959f637744b");
                        }
                        str = a2.m.n;
                        return str;
                    }

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final Gson d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ad937ebb69519b32b1a96d6b27a2fdd4", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ad937ebb69519b32b1a96d6b27a2fdd4");
                        }
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        for (AbstractGsonBuilder abstractGsonBuilder : d.c) {
                            abstractGsonBuilder.registerWmAgainstCheatingApiProviderTypeAdapter(gsonBuilder);
                        }
                        return gsonBuilder.create();
                    }
                };
            }
            if (i == null) {
                i = new a() { // from class: com.sankuai.waimai.platform.net.service.d.6
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final String c() {
                        return "https://waimaiucenter.meituan.com";
                    }

                    @Override // com.sankuai.waimai.platform.net.service.a
                    public final Gson d() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ff9be51faaef8bfda67ff99f219db452", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Gson) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ff9be51faaef8bfda67ff99f219db452");
                        }
                        GsonBuilder gsonBuilder = new GsonBuilder();
                        for (AbstractGsonBuilder abstractGsonBuilder : d.c) {
                            abstractGsonBuilder.registerWmApiProviderTypeAdapter(gsonBuilder);
                        }
                        return gsonBuilder.create();
                    }
                };
            }
            com.sankuai.waimai.platform.capacity.network.retrofit.c.a(d);
            com.sankuai.waimai.platform.capacity.network.retrofit.c.a(MafApi.class, e);
            com.sankuai.waimai.platform.capacity.network.retrofit.c.a(DeliveryApi.class, f);
            com.sankuai.waimai.platform.capacity.network.retrofit.c.a(MtMobileApi.class, g);
            com.sankuai.waimai.platform.capacity.network.retrofit.c.a(AgainstCheatingApi.class, h);
            com.sankuai.waimai.platform.capacity.network.retrofit.c.a(UCenterTspApi.class, i);
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "4a3a4d5cd7605cf2373680b8c833a14b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "4a3a4d5cd7605cf2373680b8c833a14b");
            } else {
                com.sankuai.waimai.foundation.location.net.a.a(d);
                com.sankuai.waimai.foundation.location.net.a.a(MafApi.class, e);
                com.sankuai.waimai.foundation.location.net.a.a(DeliveryApi.class, f);
                com.sankuai.waimai.foundation.location.net.a.a(MtMobileApi.class, g);
                com.sankuai.waimai.foundation.location.net.a.a(LocationMafApi.class, e);
            }
            b = true;
        }
    }
}
