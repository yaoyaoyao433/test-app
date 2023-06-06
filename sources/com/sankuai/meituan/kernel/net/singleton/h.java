package com.sankuai.meituan.kernel.net.singleton;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.kernel.net.okhttp3.p;
import com.sankuai.meituan.kernel.net.okhttp3.s;
import com.sankuai.meituan.kernel.net.singleton.i;
import okhttp3.OkHttpClient;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class h {
    public static ChangeQuickRedirect a;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a {
        public static ChangeQuickRedirect a;
        private static d b;

        static {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            b = PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "a48766df7d7aef8d8799f5da4bf14601", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "a48766df7d7aef8d8799f5da4bf14601") : new d() { // from class: com.sankuai.meituan.kernel.net.singleton.h.a.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.kernel.net.singleton.d
                public final OkHttpClient a(String str) {
                    OkHttpClient okHttpClient;
                    OkHttpClient okHttpClient2;
                    OkHttpClient okHttpClient3;
                    OkHttpClient okHttpClient4;
                    OkHttpClient okHttpClient5;
                    OkHttpClient okHttpClient6;
                    Object[] objArr2 = {str};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "79f2a59c8782a2294764690b1280afd6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (OkHttpClient) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "79f2a59c8782a2294764690b1280afd6");
                    }
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = i.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ae71a55defc22ccfcd9139a30a837b09", RobustBitConfig.DEFAULT_VALUE)) {
                        return (OkHttpClient) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ae71a55defc22ccfcd9139a30a837b09");
                    }
                    if (str == null) {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = i.a;
                        if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "9626455c6b85d2c99e0d5beb69ab5ff6", RobustBitConfig.DEFAULT_VALUE)) {
                            return (OkHttpClient) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "9626455c6b85d2c99e0d5beb69ab5ff6");
                        }
                        okHttpClient6 = i.a.b;
                        return okHttpClient6;
                    } else if (str.equals("okdefault")) {
                        okHttpClient5 = i.c.b;
                        return okHttpClient5;
                    } else if (str.equals("statistics")) {
                        okHttpClient4 = i.d.b;
                        return okHttpClient4;
                    } else if (str.equals("analyser")) {
                        okHttpClient3 = i.b.b;
                        return okHttpClient3;
                    } else if (str.equals("uuid")) {
                        okHttpClient2 = i.e.b;
                        return okHttpClient2;
                    } else if (str.equals("api")) {
                        okHttpClient = i.a.b;
                        return okHttpClient;
                    } else {
                        throw new IllegalArgumentException("key: " + str + "not supported");
                    }
                }

                @Override // com.sankuai.meituan.kernel.net.singleton.d
                public final OkHttpClient a(com.sankuai.meituan.kernel.net.d dVar) {
                    Object[] objArr2 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "96f149351d31e7b1ba3f0372e65200bd", RobustBitConfig.DEFAULT_VALUE)) {
                        return (OkHttpClient) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "96f149351d31e7b1ba3f0372e65200bd");
                    }
                    Object[] objArr3 = {dVar};
                    ChangeQuickRedirect changeQuickRedirect3 = i.a;
                    if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "1e1b182aff961c54f5a6d9cfb77cc24f", RobustBitConfig.DEFAULT_VALUE)) {
                        return (OkHttpClient) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "1e1b182aff961c54f5a6d9cfb77cc24f");
                    }
                    OkHttpClient.Builder a2 = com.sankuai.meituan.kernel.net.httpDns.a.a(j.a(dVar), com.sankuai.meituan.kernel.net.base.c.b);
                    a2.interceptors().add(0, new p("defaultokhttp"));
                    a2.addInterceptor(new s());
                    return a2.build();
                }
            };
        }
    }

    public static d a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "13224ad64ee65d4910a500a4fcc1c985", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "13224ad64ee65d4910a500a4fcc1c985") : a.b;
    }
}
