package com.sankuai.waimai.business.page.kingkong.future.network.preload;

import android.net.Uri;
import android.os.Bundle;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.unionid.oneid.OneIdHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.ai.f;
import com.sankuai.waimai.business.page.common.model.KingkongInfo;
import com.sankuai.waimai.business.page.home.HomePageFragment;
import com.sankuai.waimai.business.page.home.preload.machpreload.PreLoadTemplate;
import com.sankuai.waimai.business.page.kingkong.future.network.FKKApi;
import com.sankuai.waimai.foundation.location.v2.WmAddress;
import com.sankuai.waimai.foundation.location.v2.g;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.model.c;
import com.sankuai.waimai.platform.preload.PreloadRunnable;
import com.sankuai.waimai.platform.preload.d;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import java.util.concurrent.CopyOnWriteArraySet;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KingKongNetworkPreLoader implements PreloadRunnable<FkkPreloadResponse> {
    public static final String KING_KONG_PRELOAD = "king_kong_preload";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    public static boolean isPreLoadFeeds = false;
    public static boolean isPreLoadRcmd = false;
    private boolean feedsTabsFinish;
    private double mLat;
    private double mLng;
    private FkkPreloadResponse mResponse;
    private boolean rcmdFinish;

    public KingKongNetworkPreLoader() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a9a0400de10cec40da1c83a7f9bc8c7b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a9a0400de10cec40da1c83a7f9bc8c7b");
            return;
        }
        this.mLat = 40.032609d;
        this.mLng = 116.417441d;
    }

    @Override // com.sankuai.waimai.platform.preload.PreloadRunnable
    public void run(Bundle bundle, Uri uri, final d<FkkPreloadResponse> dVar) {
        Object[] objArr = {bundle, uri, dVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69523b793ce4aae87d16100fafc522eb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69523b793ce4aae87d16100fafc522eb");
            return;
        }
        com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().b();
        if (dVar == null) {
            return;
        }
        if (c.a().b() == 1 || HomePageFragment.y) {
            dVar.cancel();
        } else if (bundle != null && (bundle.getInt("_wm_preload_page_id_overridable_", 0) != 0 || bundle.getInt("wm_source", 0) == 1)) {
            dVar.cancel();
        } else {
            com.sankuai.waimai.business.page.kingkong.future.network.c.g = ListIDHelper.a.a.a();
            com.sankuai.waimai.business.page.kingkong.future.network.a.g = ListIDHelper.a.a.a();
            this.rcmdFinish = false;
            this.feedsTabsFinish = false;
            com.sankuai.waimai.foundation.utils.log.a.b(KING_KONG_PRELOAD, "KingKongNetworkPreLoader run", new Object[0]);
            KingkongInfo kingkongInfo = new KingkongInfo();
            kingkongInfo.a(Uri.parse(uri.toString()));
            this.mResponse = new FkkPreloadResponse();
            isPreLoadRcmd = true;
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_rcmd_start", new boolean[0]);
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FKKApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FKKApi.class)).channelRcmd(kingkongInfo.f, kingkongInfo.d, com.sankuai.waimai.business.page.kingkong.future.network.c.g, kingkongInfo.b, com.sankuai.waimai.business.page.kingkong.future.network.c.q()), new b.AbstractC1042b<BaseResponse<RocksServerModel>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader.1
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse<RocksServerModel> baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "53b342aa7706de67a077f1245feb739f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "53b342aa7706de67a077f1245feb739f");
                        return;
                    }
                    KingKongNetworkPreLoader.this.rcmdFinish = true;
                    KingKongNetworkPreLoader.this.mResponse.a = 1;
                    KingKongNetworkPreLoader.this.mResponse.c = baseResponse;
                    com.sankuai.waimai.foundation.utils.log.a.b(KingKongNetworkPreLoader.KING_KONG_PRELOAD, "KingKongNetworkPreLoader rcmdSuccess & feedFinish = " + KingKongNetworkPreLoader.this.feedsTabsFinish, new Object[0]);
                    if (KingKongNetworkPreLoader.this.feedsTabsFinish) {
                        dVar.a(KingKongNetworkPreLoader.this.mResponse);
                    } else {
                        dVar.b(KingKongNetworkPreLoader.this.mResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "d027a34b016984093b18950278dcfefb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "d027a34b016984093b18950278dcfefb");
                        return;
                    }
                    KingKongNetworkPreLoader.this.rcmdFinish = true;
                    KingKongNetworkPreLoader.this.mResponse.a = 2;
                    KingKongNetworkPreLoader.this.mResponse.c = null;
                    com.sankuai.waimai.foundation.utils.log.a.b(KingKongNetworkPreLoader.KING_KONG_PRELOAD, "KingKongNetworkPreLoader  & feedFinish = " + KingKongNetworkPreLoader.this.feedsTabsFinish, new Object[0]);
                    if (KingKongNetworkPreLoader.this.feedsTabsFinish) {
                        dVar.a(KingKongNetworkPreLoader.this.mResponse);
                    } else {
                        dVar.b(KingKongNetworkPreLoader.this.mResponse);
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            String str = "";
            WmAddress k = g.a().k();
            if (k != null && k.hasAddress()) {
                str = k.getAddress();
            }
            String str2 = str;
            double[] e = com.sankuai.waimai.foundation.location.g.e();
            if (e != null) {
                this.mLat = e[0];
                this.mLng = e[1];
            }
            long j = (long) (this.mLat * 1000000.0d);
            long j2 = (long) (this.mLng * 1000000.0d);
            boolean b = com.sankuai.waimai.platform.privacy.a.a().b();
            String a = com.sankuai.waimai.business.page.kingkong.future.ai.b.a().a(1);
            int i = com.sankuai.waimai.business.page.kingkong.b.a(kingkongInfo) == com.sankuai.waimai.business.page.kingkong.b.FOOD ? 1 : 2;
            com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_tabs_start", new boolean[0]);
            boolean z = i != 1 ? false : f.a().c;
            isPreLoadFeeds = true;
            com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((FKKApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) FKKApi.class)).channelFeed(kingkongInfo.f, 0, 0, z, j, j2, 0L, b ? 1L : 0L, kingkongInfo.b, kingkongInfo.g, kingkongInfo.d, "", "", "", com.sankuai.waimai.business.page.kingkong.future.network.a.g, Statistics.getSession(), OneIdHandler.getInstance(com.meituan.android.singleton.b.a).getLocalOneId(), a, i, str2), new b.AbstractC1042b<BaseResponse<RocksServerModel>>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.preload.KingKongNetworkPreLoader.2
                public static ChangeQuickRedirect a;

                @Override // rx.e
                public final /* synthetic */ void onNext(Object obj) {
                    BaseResponse<RocksServerModel> baseResponse = (BaseResponse) obj;
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "01ff6bcad1ae9984f2b507573a166c34", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "01ff6bcad1ae9984f2b507573a166c34");
                        return;
                    }
                    KingKongNetworkPreLoader.this.feedsTabsFinish = true;
                    com.sankuai.waimai.foundation.utils.log.a.b(KingKongNetworkPreLoader.KING_KONG_PRELOAD, "KingKongNetworkPreLoader feedSuccess & rcmdFinish = " + KingKongNetworkPreLoader.this.rcmdFinish, new Object[0]);
                    KingKongNetworkPreLoader.this.mResponse.b = 1;
                    KingKongNetworkPreLoader.this.mResponse.d = baseResponse;
                    if (KingKongNetworkPreLoader.this.rcmdFinish) {
                        dVar.a(KingKongNetworkPreLoader.this.mResponse);
                    } else {
                        dVar.b(KingKongNetworkPreLoader.this.mResponse);
                    }
                }

                @Override // rx.e
                public final void onError(Throwable th) {
                    Object[] objArr2 = {th};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "bbb07625d212437435c5bb024d6d9cb6", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "bbb07625d212437435c5bb024d6d9cb6");
                        return;
                    }
                    KingKongNetworkPreLoader.this.feedsTabsFinish = true;
                    com.sankuai.waimai.foundation.utils.log.a.b(KingKongNetworkPreLoader.KING_KONG_PRELOAD, "KingKongNetworkPreLoader feedError & rcmdFinish = " + KingKongNetworkPreLoader.this.rcmdFinish, new Object[0]);
                    KingKongNetworkPreLoader.this.mResponse.b = 2;
                    KingKongNetworkPreLoader.this.mResponse.d = null;
                    if (KingKongNetworkPreLoader.this.rcmdFinish) {
                        dVar.a(KingKongNetworkPreLoader.this.mResponse);
                    } else {
                        dVar.b(KingKongNetworkPreLoader.this.mResponse);
                    }
                }
            }, com.sankuai.waimai.platform.capacity.network.retrofit.b.b);
            final b a2 = b.a();
            byte b2 = kingkongInfo.b == 910 ? (byte) 1 : (byte) 0;
            Object[] objArr2 = {Byte.valueOf(b2)};
            ChangeQuickRedirect changeQuickRedirect3 = b.a;
            if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect3, false, "f29e3b8ba78cb95fbf3916c3e784fdb8", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect3, false, "f29e3b8ba78cb95fbf3916c3e784fdb8");
                return;
            }
            if (a2.d == null) {
                a2.d = new CopyOnWriteArraySet();
            }
            a2.d.clear();
            if (b2 != 0) {
                a2.d.add(new PreLoadTemplate("channel-page-poi-card-component", "waimai_mach_usercenter_homepage_future_poi_style_1", "waimai_mach_usercenter_homepage_future_poi_style_1", "mach"));
            } else {
                a2.d.add(new PreLoadTemplate("channel-page-poi-card-component", "waimai_mach_usercenter_kingkong_future_poi", "waimai_mach_usercenter_kingkong_future_poi", "mach"));
            }
            rx.d.a((Iterable) a2.d).b(rx.schedulers.a.a(a2.b)).d(new rx.functions.g<PreLoadTemplate, Object>() { // from class: com.sankuai.waimai.business.page.kingkong.future.network.preload.b.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ Object call(PreLoadTemplate preLoadTemplate) {
                    PreLoadTemplate preLoadTemplate2 = preLoadTemplate;
                    Object[] objArr3 = {preLoadTemplate2};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect4, false, "7b4fa6786a6fe4c9465b73ba88e81e8d", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect4, false, "7b4fa6786a6fe4c9465b73ba88e81e8d");
                    }
                    if (preLoadTemplate2 != null) {
                        if (a2.c == null) {
                            a2.c = new com.sankuai.waimai.mach.recycler.b("waimai");
                        }
                        a2.c.a(preLoadTemplate2.templateId, preLoadTemplate2.preSetTemplateId, preLoadTemplate2.moduleId, 5000);
                        return null;
                    }
                    return null;
                }
            }).f();
        }
    }
}
