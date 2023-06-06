package com.sankuai.waimai.platform.net.service;

import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.j;
import com.dianping.nvnetwork.r;
import com.dianping.nvnetwork.s;
import com.meituan.android.common.candy.OkCandyInterceptor;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.NVCandyInterceptor;
import com.meituan.android.httpdns.g;
import com.meituan.android.singleton.e;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.INetFactory;
import com.sankuai.meituan.retrofit2.raw.a;
import com.sankuai.meituan.retrofit2.raw.c;
import com.sankuai.waimai.metrics.annotation.SkipInstrumentation;
import com.sankuai.waimai.platform.net.interceptor.okhttp.g;
import com.sankuai.waimai.platform.net.interceptor.okhttp.h;
import com.sankuai.waimai.platform.net.interceptor.okhttp.i;
import com.sankuai.waimai.platform.net.util.f;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
@SkipInstrumentation
/* loaded from: classes5.dex */
public class INetFactoryImpl implements INetFactory {
    public static ChangeQuickRedirect a;
    private static final String[] b = {"retrofit_netlog"};
    private static final e<j> d = new e<j>() { // from class: com.sankuai.waimai.platform.net.service.INetFactoryImpl.1
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        @SkipInstrumentation
        public final /* synthetic */ j a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "69a05ece2d4056186099ec4624e55fbe", RobustBitConfig.DEFAULT_VALUE)) {
                return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "69a05ece2d4056186099ec4624e55fbe");
            }
            NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.meituan.android.singleton.b.a);
            aVar.e = true;
            return aVar.a();
        }
    };
    private static final e<v> e = new e<v>() { // from class: com.sankuai.waimai.platform.net.service.INetFactoryImpl.2
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        @SkipInstrumentation
        public final /* synthetic */ v a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6f2acdcfade4f08abdcf60b9b1cd506c", RobustBitConfig.DEFAULT_VALUE)) {
                return (v) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6f2acdcfade4f08abdcf60b9b1cd506c");
            }
            v a2 = com.sankuai.waimai.launcher.util.aop.b.a(new v());
            com.sankuai.waimai.platform.capacity.log.c a3 = com.sankuai.waimai.platform.capacity.log.c.a();
            a2.m = new com.sankuai.waimai.platform.net.interceptor.okhttp.j();
            a2.g.addAll(Arrays.asList(new com.sankuai.waimai.platform.net.interceptor.okhttp.e(a3), new i(a3), new com.sankuai.waimai.platform.net.interceptor.okhttp.c(), new com.sankuai.waimai.platform.net.interceptor.okhttp.d(a3)));
            OkHttp2Wrapper.addInterceptorToClient(a2);
            a2.h.addAll(Arrays.asList(new OkCandyInterceptor(com.meituan.android.singleton.b.a), new g()));
            if (com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "httpdns_switch", false)) {
                List asList = Arrays.asList(f.b, "wmlog.meituan.com", "api.meituan.com", "apimobile.meituan.com", "mlog.dianping.com", "open.meituan.com", "mpay.meituan.com", "api.address.meituan.com");
                g.a aVar = new g.a();
                aVar.b = new com.meituan.android.httpdns.b(asList);
                a2.s = aVar.a(com.meituan.android.singleton.b.a);
            }
            return a2;
        }
    };
    private static final e<j> f = new e<j>() { // from class: com.sankuai.waimai.platform.net.service.INetFactoryImpl.3
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        @SkipInstrumentation
        public final /* synthetic */ j a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c5290347a8c475e32ea81ef822ab7c24", RobustBitConfig.DEFAULT_VALUE)) {
                return (j) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c5290347a8c475e32ea81ef822ab7c24");
            }
            NVDefaultNetworkService.a a2 = new NVDefaultNetworkService.a(com.meituan.android.singleton.b.a).a(new com.sankuai.waimai.platform.net.interceptor.nvnetwork.d()).a(new com.sankuai.waimai.platform.net.interceptor.nvnetwork.a());
            SharkWrapper.addInterceptorToBuilder(a2);
            a2.a(new NVCandyInterceptor(com.meituan.android.singleton.b.a)).a(new com.sankuai.waimai.platform.net.interceptor.nvnetwork.c()).a(new com.sankuai.waimai.platform.net.interceptor.nvnetwork.b()).a(new com.sankuai.waimai.platform.net.interceptor.nvnetwork.e()).a(s.a()).a(new com.sankuai.waimai.platform.net.interceptor.nvnetwork.f());
            return a2.a();
        }
    };
    private static final e<a.InterfaceC0637a> g = new e<a.InterfaceC0637a>() { // from class: com.sankuai.waimai.platform.net.service.INetFactoryImpl.4
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ a.InterfaceC0637a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0fb074b18be907caecdec390b85a17c0", RobustBitConfig.DEFAULT_VALUE)) {
                return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0fb074b18be907caecdec390b85a17c0");
            }
            if (com.sankuai.waimai.platform.utils.sharedpreference.a.r()) {
                j jVar = (j) INetFactoryImpl.f.b();
                Object[] objArr2 = {jVar};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.callfactory.a.a;
                return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "472f580d60b2edb56154ac4198c24738", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.net.callfactory.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "472f580d60b2edb56154ac4198c24738") : new com.sankuai.waimai.platform.net.callfactory.a(jVar);
            }
            return com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a((j) INetFactoryImpl.f.b());
        }
    };
    private static final e<a.InterfaceC0637a> h = new e<a.InterfaceC0637a>() { // from class: com.sankuai.waimai.platform.net.service.INetFactoryImpl.5
        public static ChangeQuickRedirect a;

        @Override // com.meituan.android.singleton.e
        public final /* synthetic */ a.InterfaceC0637a a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "86418f998af202988336c09ebf05d888", RobustBitConfig.DEFAULT_VALUE)) {
                return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "86418f998af202988336c09ebf05d888");
            }
            v clone = ((v) INetFactoryImpl.e.b()).clone();
            clone.h.add(0, new t() { // from class: com.sankuai.waimai.platform.net.service.INetFactoryImpl.5.1
                public static ChangeQuickRedirect a;

                @Override // com.squareup.okhttp.t
                public final z intercept(t.a aVar) throws IOException {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "23136434c337d41411c318e7ba387f4e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (z) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "23136434c337d41411c318e7ba387f4e");
                    }
                    x a2 = aVar.a();
                    z a3 = aVar.a(a2);
                    if (!TextUtils.isEmpty(a2.a("Cache-Control"))) {
                        z.a a4 = a3.g().a("Cache-Control", a2.a("Cache-Control"));
                        a4.a = a2;
                        return a4.a();
                    }
                    return a3.g().a();
                }
            });
            clone.l = new com.squareup.okhttp.c(new File(com.meituan.android.singleton.b.a.getCacheDir(), "responses"), 10485760L);
            clone.k = null;
            Object[] objArr2 = {clone};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.callfactory.c.b;
            return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "71f8173afa3e467f93a8e1b01fca63d7", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.net.callfactory.c) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "71f8173afa3e467f93a8e1b01fca63d7") : new com.sankuai.waimai.platform.net.callfactory.c(clone);
        }
    };
    private volatile boolean c;

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final void a(com.sankuai.meituan.kernel.net.c cVar) {
        this.c = true;
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final boolean a() {
        return this.c;
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final a.InterfaceC0637a a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91fd6e46cd41df5c104e86255a1815bc", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91fd6e46cd41df5c104e86255a1815bc");
        }
        if (TextUtils.equals(str, "defaultnvnetwork")) {
            return com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(d.b());
        }
        if (TextUtils.equals(str, "defaultokhttp")) {
            OkHttpClient.Builder builder = new OkHttpClient.Builder();
            builder.addInterceptor(new h("defaultokhttp"));
            return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.build());
        }
        e<a.InterfaceC0637a> eVar = h;
        e<a.InterfaceC0637a> eVar2 = g;
        Object[] objArr2 = {eVar, eVar2};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.platform.net.callfactory.d.a;
        return PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a3f3008028fef8891af9689583a734fe", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.platform.net.callfactory.d) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a3f3008028fef8891af9689583a734fe") : new com.sankuai.waimai.platform.net.callfactory.d(eVar, eVar2);
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final a.InterfaceC0637a a(@NonNull com.sankuai.meituan.kernel.net.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36fe9ef5b5b257c437e6cd85d39f8f41", RobustBitConfig.DEFAULT_VALUE)) {
            return (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36fe9ef5b5b257c437e6cd85d39f8f41");
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (dVar != null) {
            dVar.a(builder);
        }
        if (dVar.a()) {
            NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.meituan.android.singleton.b.a);
            if (dVar != null) {
                Object[] b2 = dVar.b();
                if (b2 != null) {
                    for (Object obj : b2) {
                        if (obj instanceof r) {
                            aVar.a((r) obj);
                        }
                    }
                }
                aVar.e = false;
                aVar.c = dVar.c();
            }
            com.sankuai.meituan.retrofit2.callfactory.ok3nv.a a2 = com.sankuai.meituan.retrofit2.callfactory.ok3nv.a.a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.build()), com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(aVar.a()));
            a2.b = true;
            return a2;
        }
        return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.build());
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final c.a a(@NonNull com.sankuai.meituan.kernel.net.e eVar) {
        Object[] objArr = {eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ce146a389e7f6a2e2b95650a6c945f13", RobustBitConfig.DEFAULT_VALUE)) {
            return (c.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ce146a389e7f6a2e2b95650a6c945f13");
        }
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        if (eVar != null) {
            eVar.a(builder);
        }
        return com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(builder.build());
    }

    @Override // com.sankuai.meituan.kernel.net.INetFactory
    public final com.sankuai.meituan.kernel.net.b b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0c36fe969bf11bce720a3fc9de20a67", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.kernel.net.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0c36fe969bf11bce720a3fc9de20a67") : new com.sankuai.meituan.kernel.net.b() { // from class: com.sankuai.waimai.platform.net.service.INetFactoryImpl.6
            @Override // com.sankuai.meituan.kernel.net.b
            public final void a(long j, String str, int i, int i2, int i3, int i4, int i5, int i6, String str2, String str3, int i7) {
            }
        };
    }
}
