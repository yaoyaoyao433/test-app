package com.meituan.android.paybase.net;

import android.net.Uri;
import android.text.TextUtils;
import com.meituan.ai.speech.sdk.knb.KnbConstants;
import com.meituan.android.common.candy.OkCandyInterceptor;
import com.meituan.android.paybase.common.analyse.a;
import com.meituan.android.paybase.utils.ah;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.retrofit2.ar;
import com.squareup.okhttp.t;
import com.squareup.okhttp.v;
import com.squareup.okhttp.x;
import com.squareup.okhttp.z;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public final class a {
    public static ChangeQuickRedirect a;
    private static volatile ar b;

    public static ar a() {
        com.sankuai.meituan.retrofit2.callfactory.okhttp.a a2;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "f39ff0ff21ffa5eb920889e1ed6c43fc", RobustBitConfig.DEFAULT_VALUE)) {
            return (ar) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "f39ff0ff21ffa5eb920889e1ed6c43fc");
        }
        if (b == null) {
            synchronized (a.class) {
                if (b == null) {
                    ar.a a3 = new ar.a().a(com.meituan.android.paybase.config.a.d().b());
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "602646f19de6635562452603bec9fc88", RobustBitConfig.DEFAULT_VALUE)) {
                        a2 = (com.sankuai.meituan.retrofit2.callfactory.okhttp.a) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "602646f19de6635562452603bec9fc88");
                    } else {
                        v vVar = new v();
                        OkHttp2Wrapper.addInterceptorToClient(vVar);
                        v a4 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
                        a4.a(60L, TimeUnit.SECONDS);
                        a4.b(60L, TimeUnit.SECONDS);
                        a4.c(60L, TimeUnit.SECONDS);
                        a4.a().add(new com.meituan.android.paybase.net.cat.c());
                        if (ah.a(com.meituan.android.paybase.config.a.d().a())) {
                            a4.a().add(new OkCandyInterceptor(com.meituan.android.paybase.config.a.d().a()));
                            a4.a().add(new C0335a());
                        } else {
                            a4.b().add(new OkCandyInterceptor(com.meituan.android.paybase.config.a.d().a()));
                        }
                        a4.a().add(new com.meituan.android.paybase.net.cat.a());
                        a2 = com.sankuai.meituan.retrofit2.callfactory.okhttp.a.a(a4);
                    }
                    b = a3.a(a2).a(new com.meituan.android.paybase.encrypt.a(com.meituan.android.paybase.config.a.d().a(), true)).a(new com.meituan.android.paybase.net.interceptor.c()).a(new com.meituan.android.paybase.net.interceptor.b()).a(new com.meituan.android.paybase.net.interceptor.a()).a(new com.meituan.android.paybase.encrypt.b(com.meituan.android.paybase.config.a.d().a(), b.b())).a();
                }
            }
        }
        return b;
    }

    public static /* synthetic */ String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "202a2a7b2925a362c3cec2f22f841b16", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "202a2a7b2925a362c3cec2f22f841b16") : com.meituan.android.paybase.config.a.d().j();
    }

    /* compiled from: ProGuard */
    /* renamed from: com.meituan.android.paybase.net.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0335a implements t {
        public static ChangeQuickRedirect a;

        @Override // com.squareup.okhttp.t
        public final z intercept(t.a aVar) throws IOException {
            Object[] objArr = {aVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c35da47402c8feb512d7e47dd11747b4", RobustBitConfig.DEFAULT_VALUE)) {
                return (z) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c35da47402c8feb512d7e47dd11747b4");
            }
            x a2 = aVar.a();
            if (com.meituan.android.paybase.config.a.d().t()) {
                a2 = a(a2);
            }
            return aVar.a(a2);
        }

        private x a(x xVar) {
            int indexOf;
            Object[] objArr = {xVar};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3009ce2dfb82fc2d89007015ddd474e3", RobustBitConfig.DEFAULT_VALUE)) {
                return (x) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3009ce2dfb82fc2d89007015ddd474e3");
            }
            try {
                String c = xVar.c();
                int indexOf2 = c.indexOf("://");
                int i = indexOf2 + 3;
                int indexOf3 = c.indexOf(47, i);
                String substring = c.substring(0, indexOf2);
                String substring2 = c.substring(i, indexOf3);
                String substring3 = c.substring(indexOf3 + 1);
                String str = substring3.split("\\?")[0];
                if (!str.endsWith(".jpg") && !str.endsWith(".png")) {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    String str2 = null;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1a016b7ff31088e5819abcf0b135310c", RobustBitConfig.DEFAULT_VALUE)) {
                        str2 = (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1a016b7ff31088e5819abcf0b135310c");
                    } else {
                        String a2 = a();
                        if (!TextUtils.isEmpty(a2) && (indexOf = a2.indexOf("://")) >= 0) {
                            int i2 = indexOf + 3;
                            int indexOf4 = a2.indexOf(47, i2);
                            String substring4 = a2.substring(0, indexOf);
                            String substring5 = indexOf4 > 0 ? a2.substring(i2, indexOf4) : a2.substring(i2);
                            if (!TextUtils.isEmpty(substring4) && !TextUtils.isEmpty(substring5)) {
                                str2 = substring4 + "://" + substring5 + "/";
                            }
                        }
                    }
                    if (TextUtils.isEmpty(str2)) {
                        return xVar;
                    }
                    x.a f = xVar.f();
                    f.a(str2 + substring3);
                    String a3 = a("portm_token");
                    String a4 = a("portm_user");
                    if (!TextUtils.isEmpty(a3) && !TextUtils.isEmpty(a4)) {
                        f.b("Portm-Token", a3).b("Portm-Target", substring2).b("Portm-User", a4);
                    } else {
                        f.b("MKOriginHost", substring2).b("MKScheme", substring).b("MKUnionId", com.meituan.android.paybase.config.a.d().j());
                    }
                    return f.a();
                }
                return xVar;
            } catch (Exception e) {
                com.meituan.android.paybase.utils.v.a("b_an74lgy8", new a.c().a(KnbConstants.PARAMS_SCENE, "OkMockInterceptor_mockRequest").a("message", e.getMessage()).b);
                return xVar;
            }
        }

        private String a(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d563e68c60804c9d89e22354c207c465", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d563e68c60804c9d89e22354c207c465") : Uri.parse(a()).getQueryParameter(str);
        }

        private String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b829f5f8226e1abb6939a4e3850eeea7", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b829f5f8226e1abb6939a4e3850eeea7") : com.meituan.android.paybase.config.a.d().v();
        }
    }
}
