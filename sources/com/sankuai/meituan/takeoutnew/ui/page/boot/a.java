package com.sankuai.meituan.takeoutnew.ui.page.boot;

import android.os.Build;
import android.os.SystemClock;
import android.support.annotation.MainThread;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import com.meituan.android.common.unionid.oneid.oaid.OaidCallback;
import com.meituan.android.common.unionid.oneid.oaid.OaidManager;
import com.meituan.android.privacy.interfaces.MtTelephonyManager;
import com.meituan.android.privacy.interfaces.Privacy;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.controller.e;
import com.sankuai.meituan.takeoutnew.model.WelcomeAd;
import com.sankuai.meituan.takeoutnew.ui.page.boot.report.c;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.meituan.takeoutnew.util.tool.a;
import com.sankuai.waimai.business.page.home.cache.d;
import com.sankuai.waimai.business.page.home.utils.j;
import com.sankuai.waimai.business.page.homepage.controller.b;
import com.sankuai.waimai.business.page.homepage.model.b;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.location.g;
import com.sankuai.waimai.foundation.location.model.MtBackCityInfo;
import com.sankuai.waimai.foundation.utils.p;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.utils.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.sankuai.meituan.takeoutnew.util.tool.a<b> {
    public static ChangeQuickRedirect a = null;
    public static boolean b = false;
    private static a j;
    Map<String, String> c;
    long d;
    private boolean k;
    private AtomicBoolean l;

    public a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f25d05f2351042ab0be242bb5462dba8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f25d05f2351042ab0be242bb5462dba8");
            return;
        }
        this.l = new AtomicBoolean(false);
        this.d = 0L;
    }

    public static /* synthetic */ b a(a aVar) {
        boolean z;
        WelcomeAd welcomeAd;
        boolean z2;
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "01c9e3b698ce198884643560e4abda53", RobustBitConfig.DEFAULT_VALUE)) {
            return (b) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "01c9e3b698ce198884643560e4abda53");
        }
        aVar.k = false;
        e eVar = new e(com.meituan.android.singleton.b.a);
        WelcomeAd a2 = eVar.a();
        if (a2 != null) {
            e.a("WelcomeObservableData", "本地有下载好的cpt广告");
            return aVar.a(a2);
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "dff543189cafc78303922488e16f728c", RobustBitConfig.DEFAULT_VALUE)) {
            z2 = ((Boolean) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "dff543189cafc78303922488e16f728c")).booleanValue();
        } else {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            if (PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "4f57b87fe47c247c996fced404311ae5", RobustBitConfig.DEFAULT_VALUE)) {
                z = ((Boolean) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "4f57b87fe47c247c996fced404311ae5")).booleanValue();
            } else {
                z = eVar.c.size() == 1 && ((welcomeAd = eVar.c.get(0)) == null || welcomeAd.isVideoSource());
            }
            if (!z && eVar.e) {
                for (int i2 = 0; i2 < eVar.c.size(); i2++) {
                    WelcomeAd welcomeAd2 = eVar.c.get(i2);
                    if (welcomeAd2 != null && welcomeAd2.adType == 19 && com.sankuai.meituan.takeoutnew.controller.a.a(welcomeAd2)) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
        }
        if (z2) {
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "990cdf3dd749d4d41165601dca434959", RobustBitConfig.DEFAULT_VALUE)) {
                i = ((Integer) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "990cdf3dd749d4d41165601dca434959")).intValue();
            } else {
                String b2 = p.b(com.meituan.android.singleton.b.a);
                com.sankuai.waimai.foundation.utils.log.a.b("WelcomeObservableData", "networkType:%s", b2);
                if ("WiFi".equals(b2) || "3G".equals(b2) || "4G".equals(b2) || "5G".equals(b2)) {
                    i = 1000;
                } else {
                    e.a("WelcomeObservableData", "network poor");
                    i = -1;
                }
            }
            if (i > 0) {
                aVar.k = true;
                e.a("WelcomeObservableData", "需要下载cpt广告， waitTime：" + i);
                return aVar.a(i, eVar);
            }
            return null;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x009d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void a(com.sankuai.meituan.takeoutnew.ui.page.boot.a r29, final com.sankuai.meituan.takeoutnew.util.tool.a.InterfaceC0655a r30) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.meituan.takeoutnew.ui.page.boot.a.a(com.sankuai.meituan.takeoutnew.ui.page.boot.a, com.sankuai.meituan.takeoutnew.util.tool.a$a):void");
    }

    public static /* synthetic */ void a(a aVar, final a.InterfaceC0655a interfaceC0655a, final WelcomeAd welcomeAd) {
        Object[] objArr = {interfaceC0655a, welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "5c9b239b7e0c841983cf5ecb1bb56b30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "5c9b239b7e0c841983cf5ecb1bb56b30");
        } else if (interfaceC0655a == null || welcomeAd == null) {
        } else {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a("splash-download");
            final e eVar = new e(com.meituan.android.singleton.b.a);
            l.a(new l.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.a.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "601da00fedd979d5c7b5c39207c1e675", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "601da00fedd979d5c7b5c39207c1e675");
                        return;
                    }
                    e eVar2 = eVar;
                    WelcomeAd welcomeAd2 = welcomeAd;
                    b.a aVar2 = new b.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.a.6.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.homepage.controller.b.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f9271e06abef4b77d79977d5b4d8785b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f9271e06abef4b77d79977d5b4d8785b");
                                return;
                            }
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a("splash-downloadFinish");
                            if (c.a().c()) {
                                if (!a.this.l.get()) {
                                    e.a("WelcomeObservableData", "素材下载超时");
                                    com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17014, 0, "waimai_splash_adx");
                                }
                                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17013, (int) (c.a().d() - 1000), "splash_rt_ad_download_beyond_1s");
                                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b a2 = com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a();
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a;
                                if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "886652ef5ff3c5efa1422297d68b5bbc", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "886652ef5ff3c5efa1422297d68b5bbc");
                                } else if (!a2.e) {
                                    h.a(a2.b);
                                }
                            } else {
                                if (!a.this.l.get()) {
                                    c.a().k = true;
                                    com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17013, 0, "waimai_splash_adx");
                                }
                                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().d = true;
                            }
                            interfaceC0655a.a(welcomeAd);
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17013, 0, "waimai_splash_all");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17013, (int) (elapsedRealtime2 - elapsedRealtime), "splash_rt_download_time");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17013, (int) (elapsedRealtime2 - a.this.d), "splash_rt_ad_download_whole_time");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(welcomeAd.adType, (int) (elapsedRealtime2 - a.this.d), "splash_rt_all_download_whole_time");
                        }

                        @Override // com.sankuai.waimai.business.page.homepage.controller.b.a
                        public final void b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a7e15aa598be7385fff25155da570f41", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a7e15aa598be7385fff25155da570f41");
                                return;
                            }
                            if (!a.this.l.get()) {
                                e.a("WelcomeObservableData", "素材下载失败,接口有问题或者解码有问题");
                                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17017, 0, "waimai_splash_adx");
                            }
                            long d = c.a().d() - 1000;
                            if (d > 0) {
                                e.a("WelcomeObservableData", "时间超过1s");
                                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17000, (int) d, "splash_rt_ad_download_beyond_1s");
                            }
                            interfaceC0655a.a(null);
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17014, 0, "waimai_splash_all");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17000, (int) (elapsedRealtime2 - elapsedRealtime), "splash_rt_download_time");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17000, (int) (elapsedRealtime2 - a.this.d), "splash_rt_ad_download_whole_time");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(welcomeAd.adType, (int) (elapsedRealtime2 - a.this.d), "splash_rt_all_download_whole_time");
                        }
                    };
                    Object[] objArr3 = {welcomeAd2, aVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = e.a;
                    if (PatchProxy.isSupport(objArr3, eVar2, changeQuickRedirect3, false, "c97f7a0691cccbfd1310c1e1846e99fb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, eVar2, changeQuickRedirect3, false, "c97f7a0691cccbfd1310c1e1846e99fb");
                    } else if (TextUtils.isEmpty(welcomeAd2.matUrl)) {
                        com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a("splash_ad_mat_error", (Exception) null, welcomeAd2);
                        aVar2.b();
                    } else {
                        if (welcomeAd2.isVideoSource()) {
                            new com.sankuai.meituan.takeoutnew.controller.b(welcomeAd2, aVar2).run();
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a("splash_ad_mat_error", (Exception) null, welcomeAd2);
                        } else {
                            new com.sankuai.meituan.takeoutnew.controller.c(welcomeAd2, aVar2).run();
                        }
                        String str = welcomeAd2.clickImageUrl;
                        if (TextUtils.isEmpty(str)) {
                            return;
                        }
                        new com.sankuai.meituan.takeoutnew.ui.page.boot.ad.b(com.meituan.android.singleton.b.a).a(str, null);
                    }
                }
            }, (String) null);
        }
    }

    public static /* synthetic */ void a(a aVar, final a.InterfaceC0655a interfaceC0655a, final com.sankuai.waimai.business.page.homepage.controller.b bVar, final com.sankuai.waimai.business.page.homepage.model.a aVar2) {
        Object[] objArr = {interfaceC0655a, bVar, aVar2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "18b0a780ff6109c21839459e13c1437d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "18b0a780ff6109c21839459e13c1437d");
        } else if (interfaceC0655a == null || bVar == null || aVar2 == null) {
        } else {
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            l.a(new l.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.a.7
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "67be6cd5042983543b5fe3183536829a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "67be6cd5042983543b5fe3183536829a");
                        return;
                    }
                    final com.sankuai.waimai.business.page.homepage.controller.b bVar2 = bVar;
                    final com.sankuai.waimai.business.page.homepage.model.a aVar3 = aVar2;
                    final b.a aVar4 = new b.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.a.7.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.business.page.homepage.controller.b.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "495803b20799daab0e10e1787a75b4a5", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "495803b20799daab0e10e1787a75b4a5");
                                return;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            if (!aVar2.isVideoSource()) {
                                bVar.c(aVar2);
                            }
                            interfaceC0655a.a(aVar2);
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17013, 0, "waimai_splash_all");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17013, (int) (elapsedRealtime2 - elapsedRealtime), "yingxiao_rt_download_time");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(0, (int) (elapsedRealtime2 - a.this.d), "splash_rt_all_download_whole_time");
                        }

                        @Override // com.sankuai.waimai.business.page.homepage.controller.b.a
                        public final void b() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5c93c5d7709e31ea185be980b0946877", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5c93c5d7709e31ea185be980b0946877");
                                return;
                            }
                            long elapsedRealtime2 = SystemClock.elapsedRealtime();
                            interfaceC0655a.a(null);
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17014, 0, "waimai_splash_all");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17000, (int) (elapsedRealtime2 - elapsedRealtime), "yingxiao_rt_download_time");
                            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(0, (int) (elapsedRealtime2 - a.this.d), "splash_rt_all_download_whole_time");
                        }
                    };
                    Object[] objArr3 = {aVar3, aVar4};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.controller.b.a;
                    if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "5ef37afff02c93204f2635bc30266b36", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "5ef37afff02c93204f2635bc30266b36");
                    } else {
                        new d(bVar2.b).a(aVar3.matUrl, new d.a() { // from class: com.sankuai.waimai.business.page.homepage.controller.b.2
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.business.page.home.cache.d.a
                            public final void a(String str, Throwable th) {
                                Object[] objArr4 = {str, th};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a7c8200d1edc2f72009e234afc4641a1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a7c8200d1edc2f72009e234afc4641a1");
                                } else if (aVar4 != null) {
                                    aVar4.b();
                                }
                            }

                            @Override // com.sankuai.waimai.business.page.home.cache.d.a
                            public final void b(String str) {
                                Object[] objArr4 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "04c0c742aa6bb807119fa01633a42ac9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "04c0c742aa6bb807119fa01633a42ac9");
                                } else if (aVar4 != null) {
                                    aVar4.b();
                                }
                            }

                            @Override // com.sankuai.waimai.business.page.home.cache.d.a
                            public final void a(String str) {
                                Object[] objArr4 = {str};
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3ec5fe5d1b060fac85e29e28ac98f5f1", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3ec5fe5d1b060fac85e29e28ac98f5f1");
                                } else if (!bVar2.b(aVar3) || aVar4 == null) {
                                } else {
                                    aVar4.a();
                                }
                            }
                        });
                    }
                }
            }, (String) null);
        }
    }

    public static /* synthetic */ boolean a(a aVar, WelcomeAd welcomeAd) {
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "75a8ca3f5336f5e879f8310c4f7bdf8e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "75a8ca3f5336f5e879f8310c4f7bdf8e")).booleanValue();
        }
        if (welcomeAd == null) {
            e.a("WelcomeObservableData", "实时广告数据null");
            return false;
        }
        com.sankuai.waimai.platform.mach.monitor.d.a(1, welcomeAd.adType, "startpicture", "startpicture");
        if (welcomeAd.isAd() && welcomeAd.adType != 21) {
            e.a("WelcomeObservableData", "广告类型非实时");
            return false;
        }
        c a2 = c.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "098902bc8868ef8a99e87d833218c20e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "098902bc8868ef8a99e87d833218c20e");
        } else {
            a2.i = true;
            if (a2.d) {
                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(-1, 0, "waimai_splash_adx_skip_invalid");
            }
        }
        com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(21, (int) (SystemClock.elapsedRealtime() - aVar.d), "waimai_splash_adx_all");
        if (TextUtils.isEmpty(welcomeAd.matUrl)) {
            e.a("WelcomeObservableData", "welcomeAd.matUrl is empty");
            return false;
        }
        aVar.l.set(false);
        if (c.a().c()) {
            aVar.l.set(true);
            com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17016, 0, "waimai_splash_adx");
            e.a("WelcomeObservableData", "startup接口请求中 既超过开屏等待时间");
        }
        return true;
    }

    public static /* synthetic */ void c(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "401bc1dfd028b8540e75d961801ec481", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "401bc1dfd028b8540e75d961801ec481");
            return;
        }
        if (!aVar.l.get()) {
            if (c.a().c()) {
                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17018, 0, "waimai_splash_adx");
                e.a("WelcomeObservableData", "匹配到本地缓存，缓存不可用。检查缓存时没到等待时间，但检查完缓存过了等待时间");
            } else {
                c.a().j = true;
                com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17012, 0, "waimai_splash_adx");
                e.a("WelcomeObservableData", "匹配到本地缓存，缓存可用");
            }
        }
        com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a("splash-cache-finish");
        com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17012, 0, "waimai_splash_all");
    }

    public static a a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "2e1c670efe14ad96e7fb6799c54172a7", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "2e1c670efe14ad96e7fb6799c54172a7");
        }
        if (j == null) {
            j = new a();
            b = c();
        }
        return j;
    }

    @Override // com.sankuai.meituan.takeoutnew.util.tool.a
    @MainThread
    public final void a(@NonNull final a.InterfaceC0655a<com.sankuai.waimai.business.page.homepage.model.b> interfaceC0655a) {
        Object[] objArr = {interfaceC0655a};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c66506e9e2a482308e37f4694cdd99be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c66506e9e2a482308e37f4694cdd99be");
            return;
        }
        j.a("ad_load-->start");
        this.d = 0L;
        l.a(new l.c<com.sankuai.waimai.business.page.homepage.model.b>() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.utils.l.c
            public final /* synthetic */ com.sankuai.waimai.business.page.homepage.model.b a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c8503ff2bb8b8890af2920b806999cf9", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.business.page.homepage.model.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c8503ff2bb8b8890af2920b806999cf9");
                }
                j.a("ad_load_async-->start");
                com.sankuai.waimai.business.page.homepage.model.b a2 = a.a(a.this);
                if (a2 == null && !a.this.k) {
                    a.a(a.this, interfaceC0655a);
                }
                j.a("ad_load_async<--complete");
                return a2;
            }

            @Override // com.sankuai.waimai.platform.utils.l.c
            public final /* synthetic */ void a(com.sankuai.waimai.business.page.homepage.model.b bVar) {
                com.sankuai.waimai.business.page.homepage.model.b bVar2 = bVar;
                Object[] objArr2 = {bVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f97147e8553c80ebde45e99edbf340ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f97147e8553c80ebde45e99edbf340ce");
                    return;
                }
                j.a("ad_load<--complete");
                if (bVar2 != null) {
                    interfaceC0655a.a(bVar2);
                    com.sankuai.meituan.takeoutnew.ui.page.boot.report.b.a().a(17001, 0, "waimai_splash_all");
                }
            }
        }, this.g);
    }

    private com.sankuai.waimai.business.page.homepage.model.b a(int i, e eVar) {
        Object[] objArr = {Integer.valueOf(i), eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13444d56ee2aa1b4df9c557cce24ebbd", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.homepage.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13444d56ee2aa1b4df9c557cce24ebbd");
        }
        eVar.a(false);
        try {
            Thread.sleep(i);
        } catch (InterruptedException e) {
            com.sankuai.waimai.foundation.utils.log.a.a(e);
        }
        WelcomeAd a2 = eVar.a();
        if (a2 != null) {
            return a(a2);
        }
        e.a("WelcomeObservableData", "ad load timeout");
        j.a("ad_load<--timeout");
        return null;
    }

    private com.sankuai.waimai.business.page.homepage.model.b a(WelcomeAd welcomeAd) {
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb3181be415a23f0823c1e7bad07c98d", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.homepage.model.b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb3181be415a23f0823c1e7bad07c98d");
        }
        b(welcomeAd);
        return welcomeAd;
    }

    private void b(final WelcomeAd welcomeAd) {
        Object[] objArr = {welcomeAd};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b96d72815c8fcb649bac7857f4a0e7ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b96d72815c8fcb649bac7857f4a0e7ab");
        } else {
            l.a(new l.a() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.a.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.utils.l.a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4b6faf810173ab85ab56261a43485e07", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4b6faf810173ab85ab56261a43485e07");
                        return;
                    }
                    com.sankuai.meituan.takeoutnew.controller.d dVar = new com.sankuai.meituan.takeoutnew.controller.d();
                    WelcomeAd welcomeAd2 = welcomeAd;
                    Object[] objArr3 = {welcomeAd2};
                    ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.meituan.takeoutnew.controller.d.a;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "848cc3361e08e37b48a378b4d2e277de", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "848cc3361e08e37b48a378b4d2e277de");
                        return;
                    }
                    int b2 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "welcome_ad_report_period", 0);
                    if (b2 > 0) {
                        String b3 = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, "welcome_ad_report", (String) null);
                        JSONArray jSONArray = new JSONArray();
                        if (!TextUtils.isEmpty(b3)) {
                            try {
                                JSONArray jSONArray2 = new JSONArray(b3);
                                long currentTimeMillis = System.currentTimeMillis();
                                for (int i = 0; i < jSONArray2.length(); i++) {
                                    JSONObject optJSONObject = jSONArray2.optJSONObject(i);
                                    if (currentTimeMillis - optJSONObject.optLong("ad_exposed_time") < 86400000 * b2) {
                                        jSONArray.put(optJSONObject);
                                    }
                                }
                            } catch (JSONException e) {
                                com.sankuai.waimai.foundation.utils.log.a.a(e);
                            }
                        }
                        JSONObject a2 = dVar.a(welcomeAd2);
                        if (a2 != null) {
                            jSONArray.put(a2);
                        }
                    }
                }
            }, (String) null);
        }
    }

    @Override // com.sankuai.meituan.takeoutnew.util.tool.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8519524b64c3f6ef37e81d56c55ab206", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8519524b64c3f6ef37e81d56c55ab206");
            return;
        }
        super.b();
        j = null;
    }

    public static MtBackCityInfo a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "ccf546a0850390831ddf1098aba9f6f8", RobustBitConfig.DEFAULT_VALUE)) {
            return (MtBackCityInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "ccf546a0850390831ddf1098aba9f6f8");
        }
        List<MtBackCityInfo> s = com.sankuai.waimai.foundation.location.v2.h.s();
        if (s != null && !s.isEmpty()) {
            for (MtBackCityInfo mtBackCityInfo : s) {
                if (mtBackCityInfo != null && mtBackCityInfo.level == i) {
                    return mtBackCityInfo;
                }
            }
        }
        return null;
    }

    public final String a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "229a57525d7e9f7700b38ab46cc25167", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "229a57525d7e9f7700b38ab46cc25167");
        }
        String a2 = C0652a.a();
        try {
            JSONObject jSONObject = new JSONObject(a2);
            jSONObject.put("is_preload", z ? 1 : 0);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return a2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d() {
        ABStrategy strategy;
        Map<String, String> map;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c1c84646f99a28567831f4f11ff66e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c1c84646f99a28567831f4f11ff66e2f");
        } else if (this.c != null || (strategy = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy("splash_data_group", null)) == null || (map = strategy.paramsInfo) == null || map.isEmpty()) {
        } else {
            this.c = map;
        }
    }

    /* compiled from: ProGuard */
    /* renamed from: com.sankuai.meituan.takeoutnew.ui.page.boot.a$a  reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    public static class C0652a {
        public static ChangeQuickRedirect a = null;
        private static String b = "";
        private static String c = "";
        private static String d = "com.sankuai.waimai:shell";

        static {
            if (com.sankuai.waimai.platform.privacy.a.a().b()) {
                return;
            }
            OaidManager.getInstance().getOaid(com.meituan.android.singleton.b.a, new OaidCallback() { // from class: com.sankuai.meituan.takeoutnew.ui.page.boot.a.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public final void onFail(String str) {
                }

                @Override // com.meituan.android.common.unionid.oneid.oaid.OaidCallback
                public final void onSuccuss(boolean z, String str, boolean z2) {
                    Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str, Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect = a;
                    if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c847795b9d6874accda64b4059ce27d4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c847795b9d6874accda64b4059ce27d4");
                    } else {
                        String unused = C0652a.b = str;
                    }
                }
            });
            MtTelephonyManager createTelephonyManager = Privacy.createTelephonyManager(com.meituan.android.singleton.b.a, d);
            if (createTelephonyManager != null) {
                c = createTelephonyManager.getAndroidId();
            }
        }

        public static String a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = a;
            if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "3acf9e2f731c87f6f32a4a69b51eb78e", RobustBitConfig.DEFAULT_VALUE)) {
                return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "3acf9e2f731c87f6f32a4a69b51eb78e");
            }
            if (com.sankuai.waimai.platform.privacy.a.a().b()) {
                return "";
            }
            try {
                JSONObject jSONObject = new JSONObject();
                int i = 500;
                if (com.meituan.android.singleton.b.a.getResources() != null && com.meituan.android.singleton.b.a.getResources().getDisplayMetrics() != null) {
                    i = com.meituan.android.singleton.b.a.getResources().getDisplayMetrics().densityDpi;
                }
                jSONObject.put("ppi", String.valueOf(i));
                jSONObject.put("manufacturer", TextUtils.isEmpty(Build.MANUFACTURER) ? "unknown" : Build.MANUFACTURER);
                jSONObject.put("deviceCategory", "1");
                jSONObject.put("screenWidth", String.valueOf(com.sankuai.waimai.platform.b.A().l()));
                jSONObject.put("screenHeight", String.valueOf(com.sankuai.waimai.platform.b.A().m()));
                jSONObject.put("wm_ad_adid", TextUtils.isEmpty(c) ? "" : com.sankuai.waimai.business.page.home.cache.b.a(c));
                jSONObject.put("oid", b);
                jSONObject.put("locationAccuracy", String.valueOf(g.j().getAccuracy()));
                return jSONObject.toString();
            } catch (Exception unused) {
                return "";
            }
        }
    }

    public static boolean c() {
        String str;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "21ed28ac28b0eebf0262c2425efc7148", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "21ed28ac28b0eebf0262c2425efc7148")).booleanValue();
        }
        try {
            str = p.b(com.meituan.android.singleton.b.a.getApplicationContext());
        } catch (Exception unused) {
            str = "";
        }
        return "2G".equals(str) || "3G".equals(str);
    }
}
