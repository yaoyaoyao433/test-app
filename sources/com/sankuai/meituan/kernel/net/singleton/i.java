package com.sankuai.meituan.kernel.net.singleton;

import android.app.Application;
import com.meituan.android.common.mtguard.wtscore.plugin.sign.interceptors.Ok3CandyInterceptor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.okhttp3.k;
import com.sankuai.meituan.kernel.net.okhttp3.l;
import com.sankuai.meituan.kernel.net.okhttp3.m;
import com.sankuai.meituan.kernel.net.okhttp3.n;
import com.sankuai.meituan.kernel.net.okhttp3.o;
import com.sankuai.meituan.kernel.net.okhttp3.p;
import com.sankuai.meituan.kernel.net.okhttp3.q;
import com.sankuai.meituan.kernel.net.okhttp3.r;
import com.sankuai.meituan.kernel.net.okhttp3.s;
import com.sankuai.meituan.kernel.net.okhttp3.t;
import com.sankuai.meituan.kernel.net.okhttp3.u;
import com.sankuai.meituan.kernel.net.okhttp3.v;
import java.util.ArrayList;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class i {
    public static ChangeQuickRedirect a;

    public static /* synthetic */ OkHttpClient.Builder a(OkHttpClient.Builder builder) {
        Object[] objArr = {builder};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "1cf9d8baf543c0b78f0ddb23b3c9cc6f", RobustBitConfig.DEFAULT_VALUE)) {
            return (OkHttpClient.Builder) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "1cf9d8baf543c0b78f0ddb23b3c9cc6f");
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Protocol.HTTP_1_1);
        arrayList.add(Protocol.SPDY_3);
        builder.protocols(arrayList);
        return builder;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public static class c {
        public static ChangeQuickRedirect a;
        private static OkHttpClient b;

        static {
            OkHttpClient build;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ad39e08c67176a0395cd44baf72e4cbd", RobustBitConfig.DEFAULT_VALUE)) {
                build = (OkHttpClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ad39e08c67176a0395cd44baf72e4cbd");
            } else {
                OkHttpClient.Builder a2 = com.sankuai.meituan.kernel.net.httpDns.a.a(j.a(), com.sankuai.meituan.kernel.net.base.c.b);
                a2.addInterceptor(new p("defaultokhttp"));
                a2.addInterceptor(new s());
                build = a2.build();
            }
            b = build;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class e {
        public static ChangeQuickRedirect a;
        private static OkHttpClient b;

        static {
            OkHttpClient build;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cf78bfad3977644f8ee39f5fc783fa98", RobustBitConfig.DEFAULT_VALUE)) {
                build = (OkHttpClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cf78bfad3977644f8ee39f5fc783fa98");
            } else {
                Application application = com.sankuai.meituan.kernel.net.base.c.b;
                OkHttpClient.Builder a2 = com.sankuai.meituan.kernel.net.httpDns.a.a(i.a(j.a()), application);
                a2.interceptors().add(0, new m());
                a2.interceptors().add(1, new l());
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.j());
                a2.addInterceptor(new v(application));
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.e(application));
                a2.addInterceptor(new q(application));
                a2.addInterceptor(new r(application));
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.g());
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.i());
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.f(com.sankuai.meituan.kernel.net.singleton.a.a(), com.sankuai.meituan.kernel.net.base.c.a())).addInterceptor(new u()).addInterceptor(new k(application)).addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.h(application));
                a2.addInterceptor(new o());
                a2.addInterceptor(new n());
                build = a2.build();
            }
            b = build;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public static ChangeQuickRedirect a;
        private static OkHttpClient b;

        static {
            OkHttpClient build;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "11082c5051fb209ae7ef2e2e07a0c901", RobustBitConfig.DEFAULT_VALUE)) {
                build = (OkHttpClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "11082c5051fb209ae7ef2e2e07a0c901");
            } else {
                Application application = com.sankuai.meituan.kernel.net.base.c.b;
                OkHttpClient.Builder a2 = com.sankuai.meituan.kernel.net.httpDns.a.a(i.a(j.a()), application);
                a2.interceptors().add(0, new m());
                a2.interceptors().add(1, new l());
                a2.interceptors().add(2, new p("okhttp"));
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.j());
                a2.addInterceptor(new v(application));
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.e(application));
                a2.addInterceptor(new q(application));
                a2.addInterceptor(new r(application));
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.g());
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.i());
                a2.addInterceptor(new s());
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.f(com.sankuai.meituan.kernel.net.singleton.a.a(), com.sankuai.meituan.kernel.net.base.c.a())).addInterceptor(new u()).addInterceptor(new k(application)).addInterceptor(new t()).addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.h(application));
                a2.addInterceptor(new o());
                a2.addInterceptor(new n());
                build = a2.build();
            }
            b = build;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class b {
        public static ChangeQuickRedirect a;
        private static OkHttpClient b;

        static {
            OkHttpClient build;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "e4d7ca508c6ab75421a185e06dde9340", RobustBitConfig.DEFAULT_VALUE)) {
                build = (OkHttpClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "e4d7ca508c6ab75421a185e06dde9340");
            } else {
                Application application = com.sankuai.meituan.kernel.net.base.c.b;
                OkHttpClient.Builder a2 = com.sankuai.meituan.kernel.net.httpDns.a.a(j.a(), application);
                a2.interceptors().add(0, new m());
                a2.interceptors().add(1, new l());
                a2.addInterceptor(new v(application));
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.i());
                a2.addInterceptor(new com.sankuai.meituan.kernel.net.okhttp3.f(com.sankuai.meituan.kernel.net.singleton.a.a(), com.sankuai.meituan.kernel.net.base.c.a()));
                a2.addInterceptor(new u());
                a2.addInterceptor(new Ok3CandyInterceptor(application));
                a2.addInterceptor(new o());
                a2.addInterceptor(new n());
                build = a2.build();
            }
            b = build;
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class d {
        public static ChangeQuickRedirect a;
        private static OkHttpClient b;

        static {
            OkHttpClient build;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f62de7d9502782c2b4f8d60074c35626", RobustBitConfig.DEFAULT_VALUE)) {
                build = (OkHttpClient) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f62de7d9502782c2b4f8d60074c35626");
            } else {
                OkHttpClient.Builder a2 = j.a();
                a2.interceptors().add(new com.sankuai.meituan.kernel.net.okhttp3.g());
                build = a2.build();
            }
            b = build;
        }
    }
}
