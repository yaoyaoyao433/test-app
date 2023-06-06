package com.sankuai.waimai.business.page.home;

import android.arch.lifecycle.q;
import android.content.Context;
import android.text.TextUtils;
import com.google.gson.Gson;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.unionid.oneid.monitor.LogMonitor;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.ai.a;
import com.sankuai.waimai.business.page.home.actionbar.HomeActionBarViewModel;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.business.page.home.model.DynamicTabListInfoResponse;
import com.sankuai.waimai.business.page.home.model.NavigationBarThemeBean;
import com.sankuai.waimai.business.page.home.model.TabBubbleInfo;
import com.sankuai.waimai.business.page.home.model.f;
import com.sankuai.waimai.business.page.home.model.g;
import com.sankuai.waimai.business.page.home.preload.task.h;
import com.sankuai.waimai.business.page.home.utils.UUIDMonitoringReporter;
import com.sankuai.waimai.business.page.home.utils.k;
import com.sankuai.waimai.business.page.home.utils.l;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.platform.utils.m;
import java.util.HashMap;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c {
    public static ChangeQuickRedirect a;
    g b;
    com.sankuai.waimai.platform.domain.core.response.a c;
    b<BaseResponse<String>> d;
    a<BaseResponse<f>> e;
    boolean f;
    HomePageFragment g;
    String h;
    int i;
    boolean j;
    private boolean k;
    private boolean l;
    private BaseResponse<String> m;
    private BaseResponse<f> n;
    private boolean o;
    private boolean p;

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface a<T> {
        void a(int i);

        void a(int i, T t);

        void a(int i, T t, boolean z);

        void a(int i, Throwable th, Throwable th2);
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    public interface b<T> {
        void a(int i);

        void a(T t);

        void a(Throwable th);

        void b(T t);
    }

    public static /* synthetic */ void a(c cVar, HomePageFragment homePageFragment, BaseResponse baseResponse) {
        boolean z;
        int i;
        boolean z2;
        com.sankuai.waimai.business.page.home.model.b bVar;
        char c = 0;
        Object[] objArr = {homePageFragment, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, cVar, changeQuickRedirect, false, "f7e266cdfbac8467f2d8342fe5011f64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, cVar, changeQuickRedirect, false, "f7e266cdfbac8467f2d8342fe5011f64");
        } else if (!com.sankuai.waimai.foundation.utils.f.a(homePageFragment.F)) {
            com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "HomeRequestHelper.onNetDynamicTabResponse", new Object[0]);
            if (baseResponse != null && baseResponse.data != 0) {
                DynamicTabListInfoResponse dynamicTabListInfoResponse = (DynamicTabListInfoResponse) baseResponse.data;
                com.sankuai.waimai.business.page.homepage.bubble.g a2 = com.sankuai.waimai.business.page.homepage.bubble.g.a();
                List<TabBubbleInfo> list = dynamicTabListInfoResponse.bubbles;
                Object[] objArr2 = {list};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.homepage.bubble.g.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "8dce1564d0eb0e96dfb99cfcc32d8268", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "8dce1564d0eb0e96dfb99cfcc32d8268");
                } else if (list != null && list.size() > 0) {
                    a2.c.clear();
                    long currentTimeMillis = System.currentTimeMillis() / 1000;
                    for (int i2 = 0; i2 < list.size(); i2++) {
                        TabBubbleInfo tabBubbleInfo = list.get(i2);
                        if (tabBubbleInfo != null) {
                            if (a2.a(tabBubbleInfo) == 1) {
                                com.sankuai.waimai.business.page.homepage.bubble.b a3 = com.sankuai.waimai.business.page.homepage.bubble.b.a();
                                a3.e = false;
                                a3.b = null;
                                a3.c = null;
                                com.sankuai.waimai.business.page.homepage.bubble.b a4 = com.sankuai.waimai.business.page.homepage.bubble.b.a();
                                Object[] objArr3 = {tabBubbleInfo};
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.homepage.bubble.b.a;
                                if (PatchProxy.isSupport(objArr3, a4, changeQuickRedirect3, false, "f00316d43270d99e338040fff1b5e3c3", RobustBitConfig.DEFAULT_VALUE)) {
                                    z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, a4, changeQuickRedirect3, false, "f00316d43270d99e338040fff1b5e3c3")).booleanValue();
                                } else {
                                    if (tabBubbleInfo.extInfo != null && (bVar = (com.sankuai.waimai.business.page.home.model.b) new Gson().fromJson(tabBubbleInfo.extInfo, (Class<Object>) com.sankuai.waimai.business.page.home.model.b.class)) != null) {
                                        a4.b = bVar.a;
                                        if (a4.b != null) {
                                            a4.b.j = tabBubbleInfo.tabId;
                                        }
                                        com.sankuai.waimai.business.page.home.model.a aVar = bVar.b;
                                        if (aVar != null) {
                                            a4.c = aVar;
                                            tabBubbleInfo.message = aVar.d == 3 ? aVar.e : "";
                                            z2 = true;
                                        }
                                    }
                                    z2 = false;
                                }
                                if (z2) {
                                    a2.c.add(tabBubbleInfo);
                                }
                            } else if (tabBubbleInfo.expireTime > currentTimeMillis && !TextUtils.isEmpty(tabBubbleInfo.message) && !a2.b.a(tabBubbleInfo.id)) {
                                a2.c.add(tabBubbleInfo);
                            }
                        }
                    }
                    TabBubbleInfo tabBubbleInfo2 = a2.f;
                    TabBubbleInfo tabBubbleInfo3 = a2.g;
                    a2.f = null;
                    a2.g = null;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.business.page.homepage.bubble.g.a;
                    if (PatchProxy.isSupport(objArr4, a2, changeQuickRedirect4, false, "eecd112ec8d3a2e0a6701efba0122efe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, a2, changeQuickRedirect4, false, "eecd112ec8d3a2e0a6701efba0122efe");
                    } else {
                        int i3 = 0;
                        while (i3 < a2.c.size()) {
                            TabBubbleInfo tabBubbleInfo4 = a2.c.get(i3);
                            if (tabBubbleInfo4 != null) {
                                Object[] objArr5 = new Object[1];
                                objArr5[c] = tabBubbleInfo4;
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.business.page.homepage.bubble.g.a;
                                if (PatchProxy.isSupport(objArr5, a2, changeQuickRedirect5, false, "18bb6a4b339f9f2dd135b8d3cb62beed", RobustBitConfig.DEFAULT_VALUE)) {
                                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, a2, changeQuickRedirect5, false, "18bb6a4b339f9f2dd135b8d3cb62beed")).booleanValue();
                                } else {
                                    if (a2.a(tabBubbleInfo4) != 1 && a2.a(tabBubbleInfo4) != 2 && a2.a(tabBubbleInfo4) != 4) {
                                        z = false;
                                    }
                                    z = true;
                                }
                                if (z) {
                                    Object[] objArr6 = {tabBubbleInfo4};
                                    ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.business.page.homepage.bubble.g.a;
                                    if (PatchProxy.isSupport(objArr6, a2, changeQuickRedirect6, false, "7b9054fc57dbd13ec2c26110112fb1f4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, a2, changeQuickRedirect6, false, "7b9054fc57dbd13ec2c26110112fb1f4");
                                    } else {
                                        if (a2.g == null && (TextUtils.isEmpty(tabBubbleInfo4.message) || a2.a(tabBubbleInfo4) == 1)) {
                                            a2.g = tabBubbleInfo4;
                                        }
                                        if (a2.f == null && !TextUtils.isEmpty(tabBubbleInfo4.message) && (!a2.i || a2.a(tabBubbleInfo4) == 1)) {
                                            a2.f = tabBubbleInfo4;
                                        }
                                    }
                                }
                                if (a2.g != null && a2.f != null) {
                                    break;
                                }
                            }
                            i3++;
                            c = 0;
                        }
                    }
                    TabBubbleInfo tabBubbleInfo5 = a2.f;
                    TabBubbleInfo tabBubbleInfo6 = a2.g;
                    if (tabBubbleInfo5 == null || !(tabBubbleInfo2 == null || a2.a(tabBubbleInfo5) == a2.a(tabBubbleInfo2))) {
                        a2.f = tabBubbleInfo2;
                        i = 3;
                    } else {
                        i = 1;
                    }
                    if (tabBubbleInfo6 == null || (tabBubbleInfo3 != null && a2.a(tabBubbleInfo6) != a2.a(tabBubbleInfo3))) {
                        a2.g = tabBubbleInfo3;
                        i |= 4;
                    }
                    int i4 = i;
                    if (i4 != 1) {
                        a2.a(-1, i4);
                    }
                    a2.f = tabBubbleInfo5;
                    a2.g = tabBubbleInfo6;
                }
                if (com.sankuai.waimai.foundation.utils.d.a(dynamicTabListInfoResponse.dynamicTabList)) {
                    return;
                }
                ((com.sankuai.waimai.business.page.home.interfacer.c) homePageFragment.F).a(dynamicTabListInfoResponse);
                com.sankuai.waimai.business.page.home.ugc.a.a(homePageFragment.F, dynamicTabListInfoResponse.dynamicTabList);
                return;
            }
            ((com.sankuai.waimai.business.page.home.interfacer.c) homePageFragment.F).a((DynamicTabListInfoResponse) null);
        }
    }

    public c(String str, HomePageFragment homePageFragment) {
        Object[] objArr = {str, homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82705e078af2b12a8ee44a8251e17bcd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82705e078af2b12a8ee44a8251e17bcd");
            return;
        }
        this.c = new com.sankuai.waimai.platform.domain.core.response.a();
        this.k = false;
        this.l = false;
        this.o = false;
        this.f = false;
        this.p = false;
        this.j = true;
        this.b = new g();
        this.h = str;
        this.g = homePageFragment;
    }

    public final void a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c05d07b6c324dc8412be5b418f80877", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c05d07b6c324dc8412be5b418f80877");
        } else if (this.o) {
        } else {
            this.i = i;
            c(i);
            a.AbstractC1040a a2 = new com.sankuai.waimai.business.page.common.log.a().a("HomePageLoadData");
            i.b(a2.d("dataLoadType=" + i).b());
            com.sankuai.waimai.business.page.home.helper.d.a().b = i;
            b(i);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private void b(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00dacd256dee8ede20223d2dbe5f5100", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00dacd256dee8ede20223d2dbe5f5100");
            return;
        }
        if (this.f) {
            com.sankuai.waimai.foundation.utils.log.a.e("HomeRequestHelper", "load Data,dataLoadType:" + i, new Object[0]);
        }
        if (i == 0 || i == 4 || i == 5) {
            b();
        }
        switch (i) {
            case 0:
            case 1:
            case 2:
            case 3:
                com.sankuai.waimai.business.page.home.utils.f.a();
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                return;
            case 12:
                a();
                return;
            default:
                return;
        }
        d(i);
        if (this.g != null && this.g.m != null) {
            this.g.m.c();
        }
        e(i);
        f(i);
        if (i == 6 && com.sankuai.waimai.business.page.home.head.Dynamiclayout.spuviewextend.a.a().b) {
            com.sankuai.waimai.business.page.home.head.Dynamiclayout.spuviewextend.a.a().c = true;
        }
        com.sankuai.waimai.business.page.home.head.Dynamiclayout.spuviewextend.a.a().b = false;
    }

    private void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "922e7945a75defdc3aa420a0518f312f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "922e7945a75defdc3aa420a0518f312f");
            return;
        }
        switch (i) {
            case 0:
                this.b.d = 1;
                return;
            case 1:
            case 3:
            case 4:
            case 5:
            case 6:
                this.b.d = 2;
                return;
            case 2:
            case 8:
            case 9:
            case 10:
                this.b.d = 0;
                return;
            case 7:
            case 11:
                this.b.d = 3;
                return;
            default:
                return;
        }
    }

    private void d(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fbaba66c570ced6d7402622237937079", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fbaba66c570ced6d7402622237937079");
            return;
        }
        this.k = false;
        this.l = false;
        this.m = null;
        if (i != 3) {
            this.p = false;
        }
    }

    private void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "38fa6173cb03ed877e9e88ad7cf8163e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "38fa6173cb03ed877e9e88ad7cf8163e");
        } else {
            new com.sankuai.waimai.business.page.home.preload.task.b().a();
        }
    }

    private void f(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "803b9f8ec96c151e9eea19355cae55d1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "803b9f8ec96c151e9eea19355cae55d1");
            return;
        }
        if (i != 1) {
            new h().a();
        }
        new com.sankuai.waimai.business.page.home.preload.task.c().a();
    }

    void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9f8e268134e129607e111028fb01d6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9f8e268134e129607e111028fb01d6");
        } else {
            com.sankuai.waimai.business.page.common.list.ai.a.a().a(new a.InterfaceC0759a() { // from class: com.sankuai.waimai.business.page.home.c.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.business.page.common.list.ai.a.InterfaceC0759a
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a1b07018f8c115c9cf55cf56b23c1bbd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a1b07018f8c115c9cf55cf56b23c1bbd");
                        return;
                    }
                    final c cVar = c.this;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.a;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "a00ff2a831d0c467e9b86d94825a3191", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "a00ff2a831d0c467e9b86d94825a3191");
                        return;
                    }
                    if (cVar.e != null) {
                        ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.c.3
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr4 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect4 = a;
                                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "417b72bf4fa0b62755fe2b6413828699", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "417b72bf4fa0b62755fe2b6413828699");
                                } else {
                                    c.this.e.a(c.this.i);
                                }
                            }
                        });
                    }
                    String a2 = ListIDHelper.a.a.a();
                    ListIDHelper.a.a.a("page", k.h, a2);
                    UUIDMonitoringReporter.a(4);
                    com.sankuai.waimai.platform.mach.monitor.d.a("home/feeds/tabs", "homepage_v2");
                    String str = "";
                    if (cVar.g.getActivity() != null && cVar.g.isAdded()) {
                        HomePageViewModel homePageViewModel = (HomePageViewModel) q.a(cVar.g).a(HomePageViewModel.class);
                        if (homePageViewModel.m != null && homePageViewModel.m.a() != null) {
                            str = homePageViewModel.m.a().first;
                        }
                    }
                    String b2 = com.sankuai.waimai.business.page.common.list.ai.a.a().b();
                    HashMap hashMap = new HashMap();
                    hashMap.put("refresh_type", Integer.valueOf(cVar.i));
                    hashMap.put(RaptorUploaderImpl.LOAD_TYPE, Integer.valueOf(cVar.b.d));
                    hashMap.put("rank_list_id", a2);
                    hashMap.put("session_id", cVar.b.e);
                    hashMap.put(Constants.Environment.KEY_UNION_ID, cVar.b.f);
                    hashMap.put("behavioral_characteristics", b2);
                    hashMap.put("seq_num", 0);
                    hashMap.put("net_stat", Integer.valueOf(l.a()));
                    hashMap.put("address_plaintext", str);
                    hashMap.put("personalized_tips_show", com.sankuai.waimai.business.page.home.list.future.modulelistheader.e.c());
                    final boolean b3 = com.sankuai.waimai.business.page.home.helper.b.a().b();
                    if (b3) {
                        com.sankuai.waimai.business.page.home.helper.b.a().a(2);
                    }
                    com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).getHomeFutureTabs(hashMap), new b.AbstractC1042b<BaseResponse<f>>() { // from class: com.sankuai.waimai.business.page.home.c.4
                        public static ChangeQuickRedirect a;

                        @Override // rx.e
                        public final /* synthetic */ void onNext(Object obj) {
                            BaseResponse<f> baseResponse = (BaseResponse) obj;
                            Object[] objArr4 = {baseResponse};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "950185d3357b7a83644ce9f233221085", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "950185d3357b7a83644ce9f233221085");
                                return;
                            }
                            c.this.a(baseResponse);
                            if (b3) {
                                com.sankuai.waimai.business.page.home.helper.b.a().a(3);
                            }
                        }

                        @Override // rx.e
                        public final void onError(Throwable th) {
                            Object[] objArr4 = {th};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "6ed532fa7eb1289903fbc8d0017d936d", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "6ed532fa7eb1289903fbc8d0017d936d");
                                return;
                            }
                            i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_novice_load").b("novice_load_error").c(th.getMessage()).b(true).b());
                            c.this.a(th, (Throwable) null);
                        }
                    }, cVar.h);
                }
            });
        }
    }

    public final void a(BaseResponse<String> baseResponse, String str) {
        Object[] objArr = {baseResponse, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9afe76eed9b4947bd79fbb7d27217dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9afe76eed9b4947bd79fbb7d27217dd");
        } else if (baseResponse != null && baseResponse.isSuccess() && baseResponse.data != null) {
            this.k = true;
            this.m = baseResponse;
            if (this.g == null || this.g.getActivity() == null || !this.g.isAdded()) {
                return;
            }
            NavigationBarThemeBean a2 = com.sankuai.waimai.business.page.home.helper.b.a().a(baseResponse.data);
            if (a2 != null && a2.navigationBarTheme != null) {
                ((com.sankuai.waimai.business.page.home.interfacer.c) this.g.F).a(a2.showWindowsStyle);
            }
            ((HomePageViewModel) q.a(this.g).a(HomePageViewModel.class)).Q = str;
            g(1);
        } else {
            if (this.f) {
                com.sankuai.waimai.foundation.utils.log.a.e("HomeRequestHelper", "New Rcmdboard load data error, dataLoadType:" + this.i, new Object[0]);
            }
            if (this.d != null) {
                this.d.a((b<BaseResponse<String>>) baseResponse);
                if (this.p && baseResponse != null && baseResponse.code == 801 && !TextUtils.isEmpty(baseResponse.msg)) {
                    Context context = com.meituan.android.singleton.b.a;
                    String str2 = baseResponse.msg;
                    m.a(context, str2, new com.sankuai.waimai.platform.widget.emptylayout.a("B_" + baseResponse.code, "/home/feeds/rcmdboard"));
                }
            }
            if (this.e != null) {
                this.e.a(this.i, (int) null, true);
            }
        }
    }

    public final void a(BaseResponse<f> baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2ba634e8036785f7128234635327ccd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2ba634e8036785f7128234635327ccd");
        } else if (b(baseResponse)) {
            if (this.f) {
                com.sankuai.waimai.foundation.utils.log.a.e("HomeRequestHelper", "onNoviceTabSuccess, refreshData", new Object[0]);
            }
            this.l = true;
            this.n = baseResponse;
            g(3);
            com.sankuai.waimai.business.page.home.homecache.d.a().b(baseResponse);
        } else {
            HomeGrayManager.a().a(true);
            if (this.f) {
                com.sankuai.waimai.foundation.utils.log.a.e("HomeRequestHelper", "onNoviceTabSuccess, onDataError", new Object[0]);
            }
            i.d(new com.sankuai.waimai.business.page.common.log.a().a("home_page_novice_load").b("novice_load_error").c(LogMonitor.DATA_IS_NULL_TAG).b(true).b());
            if (this.e != null) {
                this.e.a(this.i, (int) baseResponse, false);
            }
        }
    }

    private boolean b(BaseResponse<f> baseResponse) {
        Object[] objArr = {baseResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "543a64e68ec61c155a6db7efb26889a9", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "543a64e68ec61c155a6db7efb26889a9")).booleanValue() : (baseResponse == null || baseResponse.data == null || !baseResponse.isSuccess() || com.sankuai.waimai.foundation.utils.b.b(baseResponse.data.moduleList)) ? false : true;
    }

    private void g(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa54a573787d850ae86c70a54d9dfcd3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa54a573787d850ae86c70a54d9dfcd3");
            return;
        }
        if (i == 1 && c() && this.k && this.d != null) {
            this.d.b(this.m);
            this.p = true;
            if (this.l && this.n != null && this.e != null) {
                this.e.a(this.i, this.n);
            }
        }
        if (i == 3 && this.l && this.n != null) {
            if ((!c() || (this.k && this.m != null)) && this.e != null) {
                this.e.a(this.i, this.n);
            }
        }
    }

    private boolean c() {
        return this.i == 0 || this.i == 1 || this.i == 2 || this.i == 3 || this.i == 4 || this.i == 5 || this.i == 6;
    }

    public final void a(Throwable th, Throwable th2) {
        Object[] objArr = {th, th2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11046bfc5c416c1a11c5df1ff18812e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11046bfc5c416c1a11c5df1ff18812e8");
            return;
        }
        if (this.f) {
            com.sankuai.waimai.foundation.utils.log.a.e("HomeRequestHelper", "onNetError, dataLoadType:" + this.i, new Object[0]);
        }
        if (this.e != null) {
            this.e.a(this.i, th, th2);
        }
        if (this.d != null) {
            this.d.a(th2);
        }
        this.o = false;
        HomeGrayManager.a().a(true);
    }

    private void e(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "611dd7387e8f18d5eb32dcd987652194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "611dd7387e8f18d5eb32dcd987652194");
            return;
        }
        final String a2 = ListIDHelper.a.a.a();
        if (this.d != null) {
            this.d.a(i);
        }
        ListIDHelper.a.a.a("page", k.a, a2);
        if (this.j) {
            com.sankuai.waimai.platform.mach.monitor.b.a().b();
            com.sankuai.waimai.platform.mach.monitor.d.a("home/rcmdboard", "homepage");
        }
        UUIDMonitoringReporter.a(1);
        HashMap hashMap = new HashMap();
        hashMap.put("net_stat", Integer.valueOf(l.a()));
        hashMap.put("rank_list_id", a2);
        hashMap.put("ref_list_id", "");
        hashMap.put("wm_custom_latitude", null);
        hashMap.put("wm_custom_longitude", null);
        hashMap.put("behavioral_characteristics", null);
        hashMap.put("user_agent", com.sankuai.waimai.platform.b.A().J());
        hashMap.put("callback_params", 3);
        hashMap.put("ad_params", "");
        HomeGrayManager.a().b();
        com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).getHomeNewRcmdboard(hashMap), new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.page.home.c.1
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse<String> baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "73740eca0680fbf54f4664ce8c4011ab", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "73740eca0680fbf54f4664ce8c4011ab");
                    return;
                }
                ListIDHelper.a.a.a("page", k.b, a2);
                c.this.a(baseResponse, (String) null);
                if (baseResponse == null || !baseResponse.isSuccess()) {
                    return;
                }
                c cVar = c.this;
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = c.a;
                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "1620269a7a915b9fc518bb0ed680c367", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "1620269a7a915b9fc518bb0ed680c367");
                } else if (cVar.g != null && cVar.g.getActivity() != null && cVar.g.isAdded()) {
                    ((HomeActionBarViewModel) q.a(cVar.g).a(HomeActionBarViewModel.class)).a(false);
                    ((HomePageViewModel) q.a(cVar.g).a(HomePageViewModel.class)).k(false);
                    ((HomeActionBarViewModel) q.a(cVar.g).a(HomeActionBarViewModel.class)).n = false;
                    ((HomeActionBarViewModel) q.a(cVar.g).a(HomeActionBarViewModel.class)).m = "";
                }
                c.this.a();
                com.sankuai.waimai.business.page.home.homecache.d.a().a(baseResponse);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c9a84c1c3e1c444d613c852043d92c71", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c9a84c1c3e1c444d613c852043d92c71");
                    return;
                }
                if (c.this.f) {
                    com.sankuai.waimai.foundation.utils.log.a.e("HomeRequestHelper", "New Rcmboard load data net error, dataLoadType:" + c.this.i, new Object[0]);
                }
                c.this.a((Throwable) null, th);
            }
        }, this.h);
    }

    public final void a(final HomePageFragment homePageFragment) {
        String jSONObject;
        Object[] objArr = {homePageFragment};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a2cff64db6459240141442c00029a96f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a2cff64db6459240141442c00029a96f");
        } else if (com.sankuai.waimai.foundation.utils.f.a(homePageFragment.F)) {
        } else {
            com.sankuai.waimai.foundation.utils.log.a.b("TabBubble", "HomeRequestHelper.loadDynamicTab", new Object[0]);
            ListIDHelper.a.a.a("page", k.d, ListIDHelper.a.a.a());
            String str = "0";
            String str2 = "0";
            WMLocation i = com.sankuai.waimai.foundation.location.v2.g.a().i();
            if (i != null) {
                str = String.valueOf((long) (i.getLatitude() * 1000000.0d));
                str2 = String.valueOf((long) (i.getLongitude() * 1000000.0d));
            }
            long c = com.sankuai.waimai.business.page.homepage.bubble.b.a().c();
            if (c != 0) {
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("content_id", String.valueOf(c));
                    jSONObject = jSONObject2.toString();
                } catch (JSONException unused) {
                }
                com.sankuai.waimai.business.page.homepage.bubble.b.a().a(str, str2);
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).getDynamicTabInfo(jSONObject, com.sankuai.waimai.platform.encrypt.b.a().a("last_time_actual_latitude", str).a("last_time_actual_longitude", str2).a()), new b.AbstractC1042b<BaseResponse<DynamicTabListInfoResponse>>() { // from class: com.sankuai.waimai.business.page.home.c.5
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr2 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4f75c0c1e019b7598ef1dc0a3c40ffa", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4f75c0c1e019b7598ef1dc0a3c40ffa");
                        } else {
                            c.a(c.this, homePageFragment, baseResponse);
                        }
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d0c81f04cb3ec72c6d602bf33db2b6b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d0c81f04cb3ec72c6d602bf33db2b6b");
                        } else {
                            c.a(c.this, homePageFragment, null);
                        }
                    }
                }, this.h);
            }
            jSONObject = "";
            com.sankuai.waimai.business.page.homepage.bubble.b.a().a(str, str2);
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).getDynamicTabInfo(jSONObject, com.sankuai.waimai.platform.encrypt.b.a().a("last_time_actual_latitude", str).a("last_time_actual_longitude", str2).a()), new b.AbstractC1042b<BaseResponse<DynamicTabListInfoResponse>>() { // from class: com.sankuai.waimai.business.page.home.c.5
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f4f75c0c1e019b7598ef1dc0a3c40ffa", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f4f75c0c1e019b7598ef1dc0a3c40ffa");
                    } else {
                        c.a(c.this, homePageFragment, baseResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d0c81f04cb3ec72c6d602bf33db2b6b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d0c81f04cb3ec72c6d602bf33db2b6b");
                    } else {
                        c.a(c.this, homePageFragment, null);
                    }
                }
            }, this.h);
        }
    }
}
