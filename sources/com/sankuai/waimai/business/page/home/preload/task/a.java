package com.sankuai.waimai.business.page.home.preload.task;

import android.arch.lifecycle.l;
import android.support.annotation.Nullable;
import com.meituan.android.common.aidata.raptoruploader.RaptorUploaderImpl;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.home.gray.HomeGrayManager;
import com.sankuai.waimai.business.page.home.model.API;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.preload.bean.NetBean;
import com.sankuai.waimai.business.page.home.utils.UUIDMonitoringReporter;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.business.page.home.utils.o;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import java.util.HashMap;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends i {
    public static ChangeQuickRedirect a;
    k b;
    BaseResponse<com.sankuai.waimai.business.page.home.model.f> c;

    public a() {
        super("FutureTabsTask");
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f5234aa8823a73ba33d1bbb4f00b083", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f5234aa8823a73ba33d1bbb4f00b083");
        } else {
            PreloadDataModel.get().isCacheRender().a(new l<Boolean>() { // from class: com.sankuai.waimai.business.page.home.preload.task.a.1
                public static ChangeQuickRedirect a;

                @Override // android.arch.lifecycle.l
                public final /* synthetic */ void a(@Nullable Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "85b7d49f5438ebc844335ffa5bb83ecd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "85b7d49f5438ebc844335ffa5bb83ecd");
                    } else if (a.this.c == null || bool2 == null || !bool2.booleanValue()) {
                    } else {
                        PreloadDataModel.get().setMainLoaded(true);
                        PreloadDataModel.get().setHomeFutureTabsResponse(new NetBean(a.this.c));
                        com.sankuai.waimai.business.page.home.homecache.d.a().b(a.this.c);
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f4e5d6f5900b876ac689497a5858c85", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f4e5d6f5900b876ac689497a5858c85");
        } else if (com.sankuai.waimai.foundation.core.a.d()) {
            com.sankuai.waimai.platform.b.A().a(new b.InterfaceC1037b() { // from class: com.sankuai.waimai.business.page.home.preload.task.a.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.b.InterfaceC1037b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "429769c321f9c8e5440ae16803afe956", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "429769c321f9c8e5440ae16803afe956");
                        return;
                    }
                    com.sankuai.waimai.business.page.home.utils.h.a().a("tabs_api_start", new boolean[0]);
                    m.a().a("FeedsReq+");
                    a.this.c();
                }
            });
        } else {
            com.sankuai.waimai.business.page.home.utils.h.a().a("tabs_api_start", new boolean[0]);
            m.a().a("FeedsReq+");
            c();
        }
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d74d17fe514f4fb811c937b398917648", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d74d17fe514f4fb811c937b398917648");
            return;
        }
        if (com.sankuai.waimai.business.page.home.homecache.d.a().c() != null) {
            PreloadDataModel.get().setMainLoaded(true);
            PreloadDataModel.get().setHomeFutureTabsResponse(new NetBean(com.sankuai.waimai.business.page.home.homecache.d.a().c()));
            d();
        }
        final String a2 = ListIDHelper.a.a.a();
        UUIDMonitoringReporter.a(4);
        com.sankuai.waimai.platform.mach.monitor.d.a("home/feeds/tabs", "homepage_v2");
        String str = "";
        if (PreloadDataModel.get().getAddress() != null && PreloadDataModel.get().getAddress().a() != null) {
            str = PreloadDataModel.get().getAddress().a().getAddress();
        }
        String b = com.sankuai.waimai.business.page.common.list.ai.a.a().b();
        HashMap hashMap = new HashMap();
        if (o.b != null && o.a() == 2) {
            hashMap.putAll(o.b);
        }
        hashMap.put("refresh_type", 0);
        hashMap.put(RaptorUploaderImpl.LOAD_TYPE, 1);
        hashMap.put("rank_list_id", a2);
        hashMap.put("session_id", Statistics.getSession());
        hashMap.put(Constants.Environment.KEY_UNION_ID, OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId());
        hashMap.put("behavioral_characteristics", b);
        hashMap.put("seq_num", 0);
        hashMap.put("net_stat", Integer.valueOf(com.sankuai.waimai.business.page.home.utils.l.a()));
        hashMap.put("address_plaintext", str);
        hashMap.put("personalized_tips_show", com.sankuai.waimai.business.page.home.list.future.modulelistheader.e.c());
        final boolean b2 = com.sankuai.waimai.business.page.home.helper.b.a().b();
        if (b2) {
            com.sankuai.waimai.business.page.home.helper.b.a().a(0);
        }
        this.b = com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((API) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) API.class)).getHomeFutureTabs(hashMap), new b.AbstractC1042b<BaseResponse<com.sankuai.waimai.business.page.home.model.f>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.a.3
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse<com.sankuai.waimai.business.page.home.model.f> baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "b371f091c23eee153886734d9b8f6205", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "b371f091c23eee153886734d9b8f6205");
                    return;
                }
                com.sankuai.waimai.business.page.home.utils.h.a().a("tabs_api_success", new boolean[0]);
                m.a().a("FeedsReq-");
                m.a().a("prerenderList+");
                ListIDHelper.a.a.a("page", com.sankuai.waimai.business.page.home.utils.k.h, a2);
                if (!PreloadDataModel.get().isCacheRendering) {
                    PreloadDataModel.get().setMainLoaded(true);
                    PreloadDataModel.get().setHomeFutureTabsResponse(new NetBean(baseResponse));
                    a.this.b = null;
                    a.this.d();
                    com.sankuai.waimai.business.page.home.homecache.d.a().b(baseResponse);
                    if (b2) {
                        com.sankuai.waimai.business.page.home.helper.b.a().a(1);
                        return;
                    }
                    return;
                }
                a.this.c = baseResponse;
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4467353775f4fc4d9cdb5c26ae7c0685", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4467353775f4fc4d9cdb5c26ae7c0685");
                    return;
                }
                com.sankuai.waimai.business.page.home.utils.h.a().b();
                m.a().cancel();
                PreloadDataModel.get().setMainLoaded(true);
                PreloadDataModel.get().setHomeFutureTabsResponse(new NetBean(th));
                a.this.b = null;
                HomeGrayManager.a().a(true);
            }
        }, null);
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b342b2259e58b66dc14a0a03d4263503", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b342b2259e58b66dc14a0a03d4263503");
            return;
        }
        super.cancel();
        if (this.b != null) {
            this.b.unsubscribe();
            this.b = null;
        }
    }
}
