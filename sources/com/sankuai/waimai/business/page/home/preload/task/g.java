package com.sankuai.waimai.business.page.home.preload.task;

import android.arch.lifecycle.l;
import android.os.SystemClock;
import android.support.annotation.Nullable;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.util.PageSP;
import com.sankuai.waimai.business.page.home.preload.PreloadDataModel;
import com.sankuai.waimai.business.page.home.preload.bean.RcmdNetBean;
import com.sankuai.waimai.business.page.home.utils.j;
import com.sankuai.waimai.business.page.home.utils.m;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.foundation.utils.ad;
import com.sankuai.waimai.platform.b;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import rx.k;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends i {
    public static ChangeQuickRedirect a;
    k b;
    @Nullable
    public MetricsSpeedMeterTask c;
    private boolean d;

    public g() {
        this(false);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e57ed02ec1f7cd9addce518b5e27ea19", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e57ed02ec1f7cd9addce518b5e27ea19");
        }
    }

    private g(boolean z) {
        super("RcmdTask");
        Object[] objArr = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "be916809006b6a873355a2a86bed0a92", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "be916809006b6a873355a2a86bed0a92");
        } else {
            this.d = false;
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "518f7f6d048daadc8661ba21ccec17a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "518f7f6d048daadc8661ba21ccec17a5");
        } else if (com.sankuai.waimai.foundation.core.a.d()) {
            com.sankuai.waimai.platform.b.A().a(new b.InterfaceC1037b() { // from class: com.sankuai.waimai.business.page.home.preload.task.g.1
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.b.InterfaceC1037b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "179044b697919b91ebe8df880a7ea0fd", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "179044b697919b91ebe8df880a7ea0fd");
                    } else {
                        g.this.c();
                    }
                }
            });
        } else {
            c();
        }
    }

    void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a709a41736ded387e13a210c5b41930e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a709a41736ded387e13a210c5b41930e");
            return;
        }
        WMLocation recommendedLocation = PreloadDataModel.get().getRecommendedLocation();
        WMLocation currentLocation = PreloadDataModel.get().getCurrentLocation();
        if (this.d) {
            i();
        } else if (e() && a(recommendedLocation, currentLocation)) {
            g();
        } else {
            h();
        }
    }

    @Override // com.sankuai.waimai.business.page.home.preload.task.i
    public final void cancel() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "80f6fc0b573137549c12096a8a73d5b0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "80f6fc0b573137549c12096a8a73d5b0");
            return;
        }
        super.cancel();
        if (this.b != null) {
            this.b.unsubscribe();
            this.b = null;
        }
    }

    private void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb74da13dbe9e2972a4a6b576c08e15c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb74da13dbe9e2972a4a6b576c08e15c");
            return;
        }
        if (com.sankuai.waimai.foundation.utils.log.a.b) {
            com.sankuai.waimai.foundation.utils.log.a.b("Preload", "定位校验成功，使用预请求的rcmd缓存数据", new Object[0]);
        }
        com.sankuai.waimai.platform.capacity.log.i.b(new com.sankuai.waimai.business.page.common.log.a().a("home_pre_load").d("waitForPreRequestResponse").b());
        final long j = -1;
        if (PreloadDataModel.get().getPreRequestSuccessTime() != -1) {
            com.sankuai.waimai.business.page.home.preload.a.a(15007, PreloadDataModel.get().getPreRequestSuccessTime());
            PreloadDataModel.get().setPreRequestSuccessTime(-1L);
        } else {
            j = SystemClock.elapsedRealtime();
        }
        j.a("home_head_cache_hit");
        final l<RcmdNetBean> lVar = new l<RcmdNetBean>() { // from class: com.sankuai.waimai.business.page.home.preload.task.g.2
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable RcmdNetBean rcmdNetBean) {
                RcmdNetBean rcmdNetBean2 = rcmdNetBean;
                Object[] objArr2 = {rcmdNetBean2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "043fb9548ded3bf97a942a2f7e7dd4c4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "043fb9548ded3bf97a942a2f7e7dd4c4");
                    return;
                }
                if (rcmdNetBean2 != null && rcmdNetBean2.getResponse() != null) {
                    g.this.d();
                    if (j != -1) {
                        com.sankuai.waimai.business.page.home.preload.a.a(15008, j);
                    }
                }
                PreloadDataModel.get().setRcmdResponse(rcmdNetBean2);
                PreloadDataModel.get().getPreRequestRcmdResponse().b(this);
            }
        };
        if (ad.b()) {
            PreloadDataModel.get().getPreRequestRcmdResponse().a(lVar);
        } else {
            ad.c(new Runnable() { // from class: com.sankuai.waimai.business.page.home.preload.task.g.3
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "66326e107c6e662c31517ace6e3ad306", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "66326e107c6e662c31517ace6e3ad306");
                    } else {
                        PreloadDataModel.get().getPreRequestRcmdResponse().a(lVar);
                    }
                }
            });
        }
    }

    private void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1839507aa4d7ae2aba154b9119e7d865", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1839507aa4d7ae2aba154b9119e7d865");
            return;
        }
        if (f()) {
            this.c.recordStep("miss_rcmd_cache");
            this.c.recordStep("page_api_start");
        }
        if (e()) {
            j.a("FetchData+");
        }
        final String a2 = ListIDHelper.a.a.a();
        if (com.sankuai.waimai.business.page.home.homecache.d.a().b() != null) {
            RcmdNetBean rcmdNetBean = new RcmdNetBean(com.sankuai.waimai.business.page.home.homecache.d.a().b());
            rcmdNetBean.setRankListId(a2);
            rcmdNetBean.setSourceTag(RcmdNetBean.SOURCE_FROM_DEFAULT);
            PreloadDataModel.get().setRcmdResponse(rcmdNetBean);
        }
        this.b = com.sankuai.waimai.business.page.home.preload.net.a.a(a2, new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.g.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.retrofit.b.AbstractC1042b
            public final /* synthetic */ BaseResponse<String> a(BaseResponse<String> baseResponse) {
                BaseResponse<String> baseResponse2 = baseResponse;
                Object[] objArr2 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "87905da99c1c11f1a9113b954a94d16d", RobustBitConfig.DEFAULT_VALUE)) {
                    return (BaseResponse) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "87905da99c1c11f1a9113b954a94d16d");
                }
                if (g.this.e()) {
                    j.a("FetchData-");
                }
                m.a().a("RcmdReq-");
                if (baseResponse2 != null && baseResponse2.isSuccess()) {
                    g.this.d();
                }
                return baseResponse2;
            }

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                int e;
                BaseResponse<String> baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "52dc03540e7fb709ed5fa345d2b88891", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "52dc03540e7fb709ed5fa345d2b88891");
                    return;
                }
                if (g.this.e()) {
                    j.a("BindData+");
                }
                if (g.this.f()) {
                    g.this.c.recordStep("page_api_end");
                }
                if (g.this.e() && (e = PageSP.e()) > 0) {
                    ad.a(new Runnable() { // from class: com.sankuai.waimai.business.page.home.preload.task.g.4.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.sankuai.waimai.business.page.home.preload.e.b = false;
                        }
                    }, e);
                }
                g.this.b = null;
                RcmdNetBean rcmdNetBean2 = new RcmdNetBean(baseResponse);
                rcmdNetBean2.setRankListId(a2);
                rcmdNetBean2.setSourceTag(RcmdNetBean.SOURCE_FROM_DEFAULT);
                PreloadDataModel.get().setRcmdResponse(rcmdNetBean2);
                com.sankuai.waimai.business.page.home.homecache.d.a().a(baseResponse);
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bfe206fb56a4bd6cfddd535f332ed9ff", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bfe206fb56a4bd6cfddd535f332ed9ff");
                    return;
                }
                if (g.this.f()) {
                    g.this.c.disable();
                }
                g.this.b = null;
                RcmdNetBean rcmdNetBean2 = new RcmdNetBean(th);
                rcmdNetBean2.setSourceTag(RcmdNetBean.SOURCE_FROM_DEFAULT);
                PreloadDataModel.get().setRcmdResponse(rcmdNetBean2);
            }
        });
    }

    private boolean a(WMLocation wMLocation, WMLocation wMLocation2) {
        boolean z = false;
        Object[] objArr = {wMLocation, wMLocation2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a53250e7a3e9cb455414ce8cac9752a3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a53250e7a3e9cb455414ce8cac9752a3")).booleanValue();
        }
        if (com.sankuai.waimai.foundation.core.a.d()) {
            if (!com.sankuai.waimai.business.page.home.preload.b.a().a) {
                return false;
            }
        } else {
            com.sankuai.waimai.business.page.home.preload.c cVar = (com.sankuai.waimai.business.page.home.preload.c) com.sankuai.waimai.router.a.a(com.sankuai.waimai.business.page.home.preload.c.class, "takeout_homepage_preload_valid_key");
            if (cVar == null || cVar.b()) {
                if (!com.sankuai.waimai.business.page.home.preload.b.a().a) {
                    return false;
                }
            } else if (!cVar.a()) {
                com.sankuai.waimai.business.page.home.preload.a.a(15011);
                return false;
            }
        }
        if (wMLocation == null || wMLocation2 == null) {
            com.sankuai.waimai.business.page.home.preload.a.a(15204);
            return false;
        } else if (com.sankuai.waimai.foundation.location.utils.a.a(new com.sankuai.waimai.foundation.location.model.a(wMLocation2.getLatitude(), wMLocation2.getLongitude()), new com.sankuai.waimai.foundation.location.model.a(wMLocation.getLatitude(), wMLocation.getLongitude())) > com.sankuai.waimai.business.page.home.preload.b.a().c) {
            PageSP.b(wMLocation2);
            com.sankuai.waimai.business.page.home.preload.a.a(15006);
            return false;
        } else {
            com.sankuai.waimai.business.page.home.preload.a.a(15004);
            com.sankuai.waimai.business.page.home.preload.d<RcmdNetBean> preRequestRcmdResponse = PreloadDataModel.get().getPreRequestRcmdResponse();
            z = (preRequestRcmdResponse.a() == null || preRequestRcmdResponse.a().getStatus() != 2) ? true : true;
            if (!z) {
                com.sankuai.waimai.business.page.home.preload.a.a(15206);
            }
            return z;
        }
    }

    boolean e() {
        return this.c == null;
    }

    boolean f() {
        return this.c != null;
    }

    private void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7fcf370b1de879731c9dee549fb1e001", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7fcf370b1de879731c9dee549fb1e001");
            return;
        }
        final String a2 = ListIDHelper.a.a.a();
        com.sankuai.waimai.business.page.home.preload.net.a.b(a2, new b.AbstractC1042b<BaseResponse<String>>() { // from class: com.sankuai.waimai.business.page.home.preload.task.g.5
            public static ChangeQuickRedirect a;

            @Override // rx.e
            public final /* synthetic */ void onNext(Object obj) {
                BaseResponse baseResponse = (BaseResponse) obj;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c994e0c53a2b034204e99d4a3fb63a6c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c994e0c53a2b034204e99d4a3fb63a6c");
                    return;
                }
                com.sankuai.waimai.router.a.a(com.sankuai.waimai.business.page.home.preload.c.class, "takeout_homepage_preload_valid_key");
                RcmdNetBean rcmdNetBean = new RcmdNetBean(baseResponse);
                rcmdNetBean.setRankListId(a2);
                rcmdNetBean.setSourceTag(RcmdNetBean.SOURCE_FROM_MT_HOMEPAGE_PRE_REQUEST);
                PreloadDataModel.get().setPreRequestRcmdResponse(rcmdNetBean);
                g.this.d();
            }

            @Override // rx.e
            public final void onError(Throwable th) {
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dae4a61baba0b8f0a460165f56c76eb5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dae4a61baba0b8f0a460165f56c76eb5");
                    return;
                }
                com.sankuai.waimai.router.a.a(com.sankuai.waimai.business.page.home.preload.c.class, "takeout_homepage_preload_valid_key");
                RcmdNetBean rcmdNetBean = new RcmdNetBean(th);
                rcmdNetBean.setSourceTag(RcmdNetBean.SOURCE_FROM_MT_HOMEPAGE_PRE_REQUEST);
                PreloadDataModel.get().setPreRequestRcmdResponse(rcmdNetBean);
            }
        });
    }
}
