package com.sankuai.eh.component.web.wm;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.dianping.nvnetwork.NVDefaultNetworkService;
import com.dianping.nvnetwork.j;
import com.meituan.metrics.traffic.reflection.OkHttp2Wrapper;
import com.meituan.metrics.traffic.reflection.SharkWrapper;
import com.meituan.passport.pojo.User;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.eh.component.service.env.b;
import com.sankuai.eh.component.service.tools.d;
import com.sankuai.eh.component.service.utils.e;
import com.sankuai.eh.component.web.b;
import com.sankuai.waimai.business.user.api.user.provider.LoginStatusProvider;
import com.sankuai.waimai.platform.net.c;
import com.sankuai.waimai.router.utils.f;
import com.squareup.okhttp.v;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WMWebComponentInit extends b {
    public static ChangeQuickRedirect c;

    @Override // com.sankuai.eh.component.web.b, com.sankuai.eh.component.service.spi.IEHInit
    public final void a(final Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "63295d6217a1cab8757e0e118507317d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "63295d6217a1cab8757e0e118507317d");
            return;
        }
        super.a(context);
        d.b("WMWebComponentInit init...");
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6d374d07e7bbc3acbb0d3b77e4884c6f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6d374d07e7bbc3acbb0d3b77e4884c6f");
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put("nickname", "waimai");
            hashMap.put("path_scheme", "inner_url");
            hashMap.put("raptorId", "11");
            com.sankuai.eh.component.service.a.a(hashMap);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = c;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "d485083438532e897f8d9a8b009e4c2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "d485083438532e897f8d9a8b009e4c2f");
        } else {
            com.sankuai.eh.component.service.a.c().e = a.a();
        }
        Object[] objArr4 = {context};
        ChangeQuickRedirect changeQuickRedirect4 = c;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "937a33f04f7309112f71e26e14a531f4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "937a33f04f7309112f71e26e14a531f4");
        } else {
            com.sankuai.eh.component.service.a.c().a(new b.a() { // from class: com.sankuai.eh.component.web.wm.WMWebComponentInit.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.eh.component.service.env.b.a
                public final String a(String str) {
                    Object[] objArr5 = {str};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "3b289c2282b793f6c58169d5b0372476", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "3b289c2282b793f6c58169d5b0372476");
                    }
                    Uri g = e.g(str);
                    Uri.Builder buildUpon = g.buildUpon();
                    User a2 = LoginStatusProvider.a(context);
                    if (a2 != null && a2.id != 0) {
                        if (TextUtils.isEmpty(g.getQueryParameter("token"))) {
                            buildUpon.appendQueryParameter("token", a2.token);
                        }
                        if (TextUtils.isEmpty(g.getQueryParameter("userid"))) {
                            buildUpon.appendQueryParameter("userid", String.valueOf(a2.id));
                        }
                    }
                    if (!"android".equals(g.getQueryParameter("f"))) {
                        buildUpon.appendQueryParameter("f", "android");
                    }
                    if (TextUtils.isEmpty(g.getQueryParameter("version"))) {
                        buildUpon.appendQueryParameter("version", String.valueOf(com.sankuai.waimai.platform.b.A().j()));
                    }
                    Uri a3 = f.a(f.a(g, com.sankuai.waimai.platform.net.e.a(g.toString())), c.a().g());
                    if (com.sankuai.waimai.business.knb.utils.c.a() != null) {
                        a3 = f.a(a3, com.sankuai.waimai.business.knb.utils.c.a());
                    }
                    return a3.toString();
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes3.dex */
    static class a {
        public static ChangeQuickRedirect a;
        private static com.sankuai.meituan.retrofit2.callfactory.oknv.a b;

        public static com.sankuai.meituan.retrofit2.callfactory.oknv.a a() {
            v a2;
            j a3;
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "b51b5db8c49b2f6956b1caa2054322dc", RobustBitConfig.DEFAULT_VALUE)) {
                return (com.sankuai.meituan.retrofit2.callfactory.oknv.a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "b51b5db8c49b2f6956b1caa2054322dc");
            }
            if (b == null) {
                synchronized (a.class) {
                    if (b == null) {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "0eef779a2de87770ba2bb215a9ef7d42", RobustBitConfig.DEFAULT_VALUE)) {
                            a2 = (v) PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "0eef779a2de87770ba2bb215a9ef7d42");
                        } else {
                            v vVar = new v();
                            OkHttp2Wrapper.addInterceptorToClient(vVar);
                            a2 = com.sankuai.waimai.launcher.util.aop.b.a(vVar);
                            a2.a(60L, TimeUnit.SECONDS);
                            a2.b(60L, TimeUnit.SECONDS);
                            a2.c(60L, TimeUnit.SECONDS);
                        }
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ef055076985b2a4abd16e1e2d1bb184d", RobustBitConfig.DEFAULT_VALUE)) {
                            a3 = (j) PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ef055076985b2a4abd16e1e2d1bb184d");
                        } else {
                            NVDefaultNetworkService.a aVar = new NVDefaultNetworkService.a(com.sankuai.eh.component.service.a.b());
                            SharkWrapper.addInterceptorToBuilder(aVar);
                            if (com.sankuai.eh.component.service.utils.f.b()) {
                                aVar.a(true);
                            }
                            a3 = aVar.a();
                        }
                        b = com.sankuai.meituan.retrofit2.callfactory.oknv.a.a(a2, a3);
                    }
                }
            }
            return b;
        }
    }
}
