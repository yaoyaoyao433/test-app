package com.sankuai.meituan.kernel.net.impl;

import android.text.TextUtils;
import com.dianping.dataservice.mapi.impl.DefaultMApiService;
import com.meituan.android.cipstorage.q;
import com.meituan.android.cipstorage.u;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.raw.a;
import java.io.IOException;
import okhttp3.Cache;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "496eafc9a6b743c9fbaec05b35733b44", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "496eafc9a6b743c9fbaec05b35733b44") : com.sankuai.meituan.kernel.net.tunnel.b.a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(com.sankuai.meituan.kernel.net.singleton.h.a().a("okdefault")), com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(com.sankuai.meituan.kernel.net.singleton.e.a().a("nvdefault")));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class f {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        static {
            a.InterfaceC0637a a2;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "788a51a6357963f2f3b8674cde6db2db", RobustBitConfig.DEFAULT_VALUE)) {
                a2 = (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "788a51a6357963f2f3b8674cde6db2db");
            } else {
                OkHttpClient.Builder cache = com.sankuai.meituan.kernel.net.singleton.h.a().a("api").newBuilder().cache(new Cache(q.a(com.sankuai.meituan.kernel.net.impl.b.a, "mtplatform_base", "responses", u.b), 10485760L));
                cache.networkInterceptors().add(0, new Interceptor() { // from class: com.sankuai.meituan.kernel.net.impl.c.f.1
                    public static ChangeQuickRedirect a;

                    @Override // okhttp3.Interceptor
                    public final Response intercept(Interceptor.Chain chain) throws IOException {
                        Object[] objArr2 = {chain};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "38f36f3cbfc9a6479553b5595e8dadd2", RobustBitConfig.DEFAULT_VALUE)) {
                            return (Response) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "38f36f3cbfc9a6479553b5595e8dadd2");
                        }
                        Request request = chain.request();
                        Response proceed = chain.proceed(request);
                        if (!TextUtils.isEmpty(request.header("Cache-Control"))) {
                            return proceed.newBuilder().header("Cache-Control", request.header("Cache-Control")).request(request).build();
                        }
                        return proceed.newBuilder().build();
                    }
                });
                a2 = com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(cache.build());
            }
            b = a2;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class d {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13e0ad297cf7de69d49583895ec80a5d", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13e0ad297cf7de69d49583895ec80a5d") : com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(com.sankuai.meituan.kernel.net.singleton.e.a().a("nv"));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v8, types: [com.sankuai.meituan.retrofit2.raw.a$a] */
        static {
            com.sankuai.meituan.kernel.net.tunnel.b bVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "9a56121b2e8e584025c60323dc2bce66", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "9a56121b2e8e584025c60323dc2bce66");
            } else {
                com.sankuai.meituan.kernel.net.tunnel.b a2 = com.sankuai.meituan.kernel.net.tunnel.b.a(com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(com.sankuai.meituan.kernel.net.singleton.h.a().a("okdefault")), com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a.a(com.sankuai.meituan.kernel.net.singleton.e.a().a("nvdefault")));
                a2.a(true);
                bVar = a2;
            }
            b = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class g {
        public static ChangeQuickRedirect a;
        private static com.sankuai.meituan.kernel.net.tunnel.b b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "c4d44f4a68ab6943b85a103deb7e0caa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.meituan.kernel.net.tunnel.b) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "c4d44f4a68ab6943b85a103deb7e0caa") : com.sankuai.meituan.kernel.net.tunnel.b.a((com.sankuai.meituan.retrofit2.callfactory.okhttp3.a) f.b, (com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a) d.b);
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class e {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v7, types: [com.sankuai.meituan.retrofit2.raw.a$a] */
        static {
            com.sankuai.meituan.kernel.net.tunnel.b bVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "87e7c606217afd81b67b702f3b7ce5aa", RobustBitConfig.DEFAULT_VALUE)) {
                bVar = (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "87e7c606217afd81b67b702f3b7ce5aa");
            } else {
                com.sankuai.meituan.kernel.net.tunnel.b a2 = com.sankuai.meituan.kernel.net.tunnel.b.a((com.sankuai.meituan.retrofit2.callfactory.okhttp3.a) f.b, (com.sankuai.meituan.retrofit2.callfactory.nvnetwork.a) d.b);
                a2.a(true);
                bVar = a2;
            }
            b = bVar;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.kernel.net.impl.c$c  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    static class C0588c {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        static {
            a.InterfaceC0637a aVar;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3995b08d48bd668af6fed282a7fec217", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3995b08d48bd668af6fed282a7fec217");
            } else {
                DefaultMApiService a2 = com.sankuai.network.b.a(com.sankuai.meituan.kernel.net.impl.b.a).a();
                Object[] objArr2 = {a2};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.meituan.retrofit2.callfactory.mapi.a.a;
                aVar = PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "04339b07355ecf121834fb1f9a221dbf", 6917529027641081856L) ? (com.sankuai.meituan.retrofit2.callfactory.mapi.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "04339b07355ecf121834fb1f9a221dbf") : new com.sankuai.meituan.retrofit2.callfactory.mapi.a(a2);
            }
            b = aVar;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class h {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "6584aa50873cd9bc981bc0948eb276cd", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "6584aa50873cd9bc981bc0948eb276cd") : com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(com.sankuai.meituan.kernel.net.singleton.h.a().a("statistics"));
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class i {
        public static ChangeQuickRedirect a;
        private static a.InterfaceC0637a b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b7b3f7e7e3ca8f450f3b07ebee04798d", RobustBitConfig.DEFAULT_VALUE) ? (a.InterfaceC0637a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b7b3f7e7e3ca8f450f3b07ebee04798d") : com.sankuai.meituan.retrofit2.callfactory.okhttp3.a.a(com.sankuai.meituan.kernel.net.singleton.h.a().a("uuid"));
        }
    }
}
