package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.os.Build;
import android.os.Handler;
import android.text.TextUtils;
import com.dianping.dataservice.mapi.impl.DefaultMApiService;
import com.dianping.nvnetwork.Request;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.serviceloader.b;
import com.sankuai.waimai.business.page.home.utils.i;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.v2.City;
import com.sankuai.waimai.launcher.config.WaimaiLauncherSP;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class ac extends AbsInit {
    public static ChangeQuickRedirect a;
    private com.meituan.android.mrn.engine.r b;
    private volatile boolean c;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "RnInit";
    }

    public ac() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "05b5bbb47d04cce469123d5187683208", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "05b5bbb47d04cce469123d5187683208");
        } else {
            this.c = false;
        }
    }

    public static /* synthetic */ boolean a(ac acVar, boolean z) {
        acVar.c = true;
        return true;
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(final Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70ea786a89360bdbc243086c3e2a0e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70ea786a89360bdbc243086c3e2a0e59");
            return;
        }
        super.init(application);
        if (!com.sankuai.meituan.serviceloader.b.a()) {
            com.sankuai.meituan.serviceloader.b.a(application, new b.a() { // from class: com.sankuai.waimai.launcher.init.mainly.ac.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.meituan.serviceloader.b.a
                public final void a(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "47fa8513fe2d7874fc25fb75bb5a79e9", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "47fa8513fe2d7874fc25fb75bb5a79e9");
                    } else {
                        com.sankuai.waimai.foundation.utils.log.a.b(th);
                    }
                }
            });
        }
        this.b = com.meituan.android.mrn.engine.z.a(application).a(new a(application)).a(new b());
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a53a7362203a866ab6b5a55ab040fbc9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a53a7362203a866ab6b5a55ab040fbc9");
        } else if (com.dianping.nvnetwork.g.u()) {
            this.b.a(new DefaultMApiService(application) { // from class: com.sankuai.waimai.launcher.init.mainly.ac.4
                public static ChangeQuickRedirect a;

                @Override // com.dianping.dataservice.mapi.impl.DefaultMApiService
                public final Request transferRequest(Request request) {
                    Object[] objArr3 = {request};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7a37bb91cfb01db59a20d02ec2af1ef", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Request) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7a37bb91cfb01db59a20d02ec2af1ef");
                    }
                    if (com.sankuai.waimai.platform.net.c.a().b()) {
                        return super.transferRequest(request);
                    }
                    String str = request.d;
                    if (TextUtils.isEmpty(str)) {
                        return super.transferRequest(request);
                    }
                    if (!str.contains("mapi.dianping.com")) {
                        return super.transferRequest(request);
                    }
                    Request.Builder a2 = request.a();
                    Object[] objArr4 = {"mapi.51ping.com", str};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "451d9b4e8fc326d0db7a22a49f3edc0a", RobustBitConfig.DEFAULT_VALUE)) {
                        str = (String) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "451d9b4e8fc326d0db7a22a49f3edc0a");
                    } else if (!"mapi.51ping.com".contains("appmock.dp")) {
                        int indexOf = str.indexOf("mapi.dianping.com");
                        int i = indexOf + 17;
                        str = str.substring(0, indexOf) + "mapi.51ping.com" + str.substring(i);
                    }
                    return a2.url(str).build();
                }
            });
            com.dianping.dataservice.mapi.h.b = new com.dianping.dataservice.mapi.i() { // from class: com.sankuai.waimai.launcher.init.mainly.ac.5
                public static ChangeQuickRedirect a;

                @Override // com.dianping.dataservice.mapi.i
                public final String a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1a77744e2a4e05b32aea6220dc3d63f3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1a77744e2a4e05b32aea6220dc3d63f3") : UserCenter.getInstance(application).getToken();
                }

                private String d() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "36c3101bd171d56349d1f9bbdf25cf8c", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "36c3101bd171d56349d1f9bbdf25cf8c") : UserCenter.getInstance(application).getToken();
                }

                private String e() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b460c3f64e41182382ec6d152c3dc70e", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b460c3f64e41182382ec6d152c3dc70e");
                    }
                    StringBuilder sb = new StringBuilder("MApi 1.3 (");
                    sb.append(com.sankuai.waimai.platform.b.A().k());
                    sb.append(StringUtil.SPACE);
                    sb.append(com.sankuai.meituan.takeoutnew.a.d);
                    try {
                        String d = com.sankuai.waimai.platform.b.A().d();
                        sb.append(StringUtil.SPACE);
                        sb.append(com.sankuai.waimai.store.manager.appinfo.a.d() ? d != null ? a(d) : StringUtil.NULL : "meituanwaimaiinternaltest");
                        sb.append(StringUtil.SPACE);
                        sb.append(a(Build.MODEL));
                        sb.append("; Android ");
                        sb.append(Build.VERSION.RELEASE);
                        sb.append(CommonConstant.Symbol.BRACKET_RIGHT);
                        return sb.toString();
                    } catch (Exception unused) {
                        return "MApi 1.3 (com.sankuai.meituan.takeoutnew 7.35 null null; Android " + Build.VERSION.RELEASE + CommonConstant.Symbol.BRACKET_RIGHT;
                    }
                }

                private String a(String str) {
                    char[] charArray;
                    Object[] objArr3 = {str};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "79268416bed01d6da98e4d19b975e8b3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "79268416bed01d6da98e4d19b975e8b3");
                    }
                    StringBuilder sb = new StringBuilder();
                    for (char c : str.toCharArray()) {
                        if (c >= 'a' && c <= 'z') {
                            sb.append(c);
                        } else if (c >= 'A' && c <= 'Z') {
                            sb.append(c);
                        } else if (c >= '0' && c <= '9') {
                            sb.append(c);
                        } else if (c == '.' || c == '_' || c == '-' || c == '/') {
                            sb.append(c);
                        } else if (c == ' ') {
                            sb.append('_');
                        }
                    }
                    return sb.toString();
                }

                @Override // com.dianping.dataservice.mapi.i
                public final List<com.dianping.apache.http.a> c() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "31e38fed8e348fbc3993c9c6da93037d", RobustBitConfig.DEFAULT_VALUE)) {
                        return (List) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "31e38fed8e348fbc3993c9c6da93037d");
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new com.dianping.apache.http.message.a("User-Agent", e()));
                    arrayList.add(new com.dianping.apache.http.message.a("pragma-os", e()));
                    arrayList.add(new com.dianping.apache.http.message.a("pragma-device", com.sankuai.waimai.platform.b.A().b()));
                    if (com.sankuai.waimai.store.manager.appinfo.a.a() != null) {
                        arrayList.add(new com.dianping.apache.http.message.a("pragma-uuid", com.sankuai.waimai.platform.b.A().c()));
                    }
                    if (b() != null) {
                        arrayList.add(new com.dianping.apache.http.message.a("pragma-unionid", b()));
                    }
                    if (a() != null) {
                        arrayList.add(new com.dianping.apache.http.message.a("pragma-token", a()));
                        arrayList.add(new com.dianping.apache.http.message.a("pragma-newtoken", d() == null ? "" : d()));
                    }
                    arrayList.add(new com.dianping.apache.http.message.a("utm-source", com.sankuai.waimai.platform.b.A().d()));
                    com.sankuai.waimai.platform.b.A();
                    arrayList.add(new com.dianping.apache.http.message.a("utm-campaign", com.sankuai.waimai.platform.b.H()));
                    arrayList.add(new com.dianping.apache.http.message.a("utm-medium", com.sankuai.waimai.platform.b.A().o()));
                    arrayList.add(new com.dianping.apache.http.message.a("utm-content", com.sankuai.waimai.platform.b.A().b()));
                    arrayList.add(new com.dianping.apache.http.message.a("utm-term", String.valueOf(com.sankuai.waimai.store.manager.appinfo.a.b())));
                    return arrayList;
                }

                @Override // com.dianping.dataservice.mapi.i
                public final String b() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f881d5666a62d0e7a87a0ed2c9e4b7b3", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f881d5666a62d0e7a87a0ed2c9e4b7b3") : OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
                }

                @Override // com.dianping.dataservice.mapi.i
                public final String a(boolean z) {
                    Object[] objArr3 = {(byte) 1};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "1e425496cfe24c1e10151aed076d0816", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "1e425496cfe24c1e10151aed076d0816") : OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId();
                }
            };
        }
        com.sankuai.waimai.business.page.home.utils.i.a(new i.a() { // from class: com.sankuai.waimai.launcher.init.mainly.ac.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.home.utils.i.a
            public final void a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "75581f509c2ad64709931a1bd132b3d3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "75581f509c2ad64709931a1bd132b3d3");
                } else {
                    com.meituan.android.mrn.engine.u.a(application.getApplicationContext(), "wmhome");
                }
            }
        });
        new Handler().postDelayed(new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.ac.3
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b4bb42d5891742f349c9dd7731bc638f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b4bb42d5891742f349c9dd7731bc638f");
                } else {
                    com.sankuai.waimai.launcher.util.aop.b.a(com.sankuai.android.jarvis.c.a(), new Runnable() { // from class: com.sankuai.waimai.launcher.init.mainly.ac.3.1
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "d065c24e845a32bc6444663f3a678ae5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "d065c24e845a32bc6444663f3a678ae5");
                            } else if (ac.this.b != null) {
                                com.sankuai.waimai.reactnative.b.a(application.getApplicationContext());
                                ac.this.b.a();
                                try {
                                    if (ac.this.c) {
                                        return;
                                    }
                                    com.dianping.networklog.c.a("preload delay" + WaimaiLauncherSP.j(), 3);
                                    ac.a(ac.this, true);
                                    com.meituan.android.mrn.engine.u.a(application.getApplicationContext(), "rn_waimai_wm-order-list");
                                } catch (Exception unused) {
                                }
                            }
                        }
                    });
                }
            }
        }, WaimaiLauncherSP.j());
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class a extends com.meituan.android.mrn.config.a {
        public static ChangeQuickRedirect a;
        private Application c;

        @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
        public final boolean d() {
            return true;
        }

        @Override // com.meituan.android.mrn.config.e
        public final String e() {
            return "waimai";
        }

        @Override // com.meituan.android.mrn.config.e
        public final String h() {
            return "meituanwaimai";
        }

        @Override // com.meituan.android.mrn.config.e
        public final String j() {
            return "waimai_android_test";
        }

        public a(Application application) {
            Object[] objArr = {ac.this, application};
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d97ee2c4ec8b2cd27c50e91fab0278", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d97ee2c4ec8b2cd27c50e91fab0278");
            } else {
                this.c = application;
            }
        }

        @Override // com.meituan.android.mrn.config.e
        public final int f() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f053e2d759bb0551275a9cb087f5f1f2", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f053e2d759bb0551275a9cb087f5f1f2")).intValue() : com.sankuai.waimai.config.a.a().d();
        }

        @Override // com.meituan.android.mrn.config.e
        public final String g() {
            return com.sankuai.meituan.takeoutnew.a.g;
        }

        @Override // com.meituan.android.mrn.config.e
        public final String i() {
            return com.sankuai.meituan.takeoutnew.a.g;
        }

        @Override // com.meituan.android.mrn.config.e
        public final String k() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "41708f5e97933c407a24b9f1cc904971", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "41708f5e97933c407a24b9f1cc904971") : com.sankuai.waimai.platform.b.A().d();
        }

        @Override // com.meituan.android.mrn.config.e
        public final String l() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f2fc03b64965adc2e7b3755b4ccddf4f", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f2fc03b64965adc2e7b3755b4ccddf4f") : com.sankuai.waimai.platform.b.A().i();
        }

        @Override // com.meituan.android.mrn.config.e
        public final int m() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9faf7a6ebcff94187eab6d2b8fe00ab0", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9faf7a6ebcff94187eab6d2b8fe00ab0")).intValue() : com.sankuai.waimai.platform.b.A().j();
        }

        @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
        public final String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "acca7a828561c68a079c99a860d0c56a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "acca7a828561c68a079c99a860d0c56a") : String.valueOf(com.sankuai.meituan.takeoutnew.a.h);
        }

        @Override // com.meituan.android.mrn.config.e
        public final String n() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59306450fd958d858296f0f0aa3b2f76", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59306450fd958d858296f0f0aa3b2f76") : com.sankuai.waimai.platform.b.A().c();
        }

        @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
        public final String b() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9d2a2cdf1418ecc363db17d43b80134f", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9d2a2cdf1418ecc363db17d43b80134f");
            }
            try {
                com.sankuai.waimai.foundation.utils.p.b(this.c);
                return "";
            } catch (Exception unused) {
                return "";
            }
        }

        @Override // com.meituan.android.mrn.config.e
        public final String o() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3547c17fa465ef7cb6672fc28e65e779", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3547c17fa465ef7cb6672fc28e65e779");
            }
            return com.sankuai.waimai.foundation.router.interfaces.b.c + "/browser?inner_url=";
        }

        @Override // com.meituan.android.mrn.config.a, com.meituan.android.mrn.config.e
        public final boolean c() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16b7208ebe15ebb2cdee2271553055f7", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16b7208ebe15ebb2cdee2271553055f7")).booleanValue() : !com.sankuai.waimai.foundation.core.a.c();
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public class b implements com.meituan.android.mrn.config.city.a {
        public static ChangeQuickRedirect a;

        public b() {
        }

        @Override // com.meituan.android.mrn.config.city.a
        public final long a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a059729550a0c6987c15d4f4fb6c58a4", RobustBitConfig.DEFAULT_VALUE)) {
                return ((Long) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a059729550a0c6987c15d4f4fb6c58a4")).longValue();
            }
            City m = com.sankuai.waimai.foundation.location.v2.g.a().m();
            if (m == null) {
                return -1L;
            }
            try {
                return Long.parseLong(m.getCityCode());
            } catch (NumberFormatException e) {
                e.printStackTrace();
                return -1L;
            }
        }
    }
}
