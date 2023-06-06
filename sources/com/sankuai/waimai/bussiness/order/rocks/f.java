package com.sankuai.waimai.bussiness.order.rocks;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.d;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.util.LongSparseArray;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.dianping.titans.js.JsBridgeResult;
import com.meituan.android.common.mrn.analytics.library.Constants;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.cube.pga.common.j;
import com.meituan.android.cube.pga.type.b;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.metrics.Metrics;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.common.utils.NumberUtils;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.waimai.business.order.api.detail.model.RiderInfo;
import com.sankuai.waimai.business.order.api.detail.model.b;
import com.sankuai.waimai.business.order.api.store.IOrderBusinessService;
import com.sankuai.waimai.business.order.api.submit.model.ExpInfo;
import com.sankuai.waimai.business.order.api.submit.model.Invoice;
import com.sankuai.waimai.business.order.submit.SubmitOrderManager;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.base.pay.OrderPayResultManager;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderBaseRocksResponse;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.OrderExtInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.crossshoppurchase.CrossShopPurchaseApi;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendApi;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendModel;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.OrderFixAreaInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.followarea.OrderFollowAreaInfo;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo;
import com.sankuai.waimai.bussiness.order.detailnew.widget.CustomDragExpandLayout;
import com.sankuai.waimai.foundation.core.base.activity.BaseActivity;
import com.sankuai.waimai.foundation.core.service.abtest.ABStrategy;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.core.service.user.b;
import com.sankuai.waimai.foundation.utils.ColorUtils;
import com.sankuai.waimai.foundation.utils.aa;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.foundation.utils.ah;
import com.sankuai.waimai.foundation.utils.r;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.capacity.abtest.ABTestManager;
import com.sankuai.waimai.platform.capacity.log.a;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.capacity.network.retrofit.b;
import com.sankuai.waimai.platform.utils.listid.ListIDHelper;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.mach.c;
import com.sankuai.waimai.rocks.view.recyclerview.a;
import com.tencent.liteav.TXLiteAVCode;
import com.unionpay.tsmservice.data.Constant;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends com.meituan.android.cube.pga.block.a<l, Object, d> implements android.arch.lifecycle.f, com.meituan.android.cube.core.eventhandler.protocol.d, com.sankuai.waimai.business.order.api.detail.block.a, com.sankuai.waimai.business.order.api.submit.a, com.sankuai.waimai.foundation.core.service.user.b, com.sankuai.waimai.imbase.d {
    private static int ag = 30;
    public static ChangeQuickRedirect r;
    public List<String> A;
    public boolean B;
    public com.sankuai.waimai.bussiness.order.detailnew.widget.c C;
    public int D;
    public String E;
    public com.sankuai.waimai.mach.jsv8.a F;
    private OrderApi G;
    private String H;
    private String I;
    private boolean J;
    private boolean K;
    private boolean L;
    private boolean M;
    private int N;
    private int O;
    private boolean P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private boolean U;
    private boolean V;
    private OrderFollowAreaInfo W;
    private boolean X;
    private boolean Y;
    private rx.k Z;
    private rx.k aa;
    private rx.k ab;
    private android.arch.lifecycle.k<OrderRocksServerModel> ac;
    private boolean ad;
    private MetricsSpeedMeterTask ae;
    private b af;
    private int ah;
    private ABStrategy ai;
    private boolean aj;
    private RecommendModel ak;
    private e al;
    private k am;
    private Rect an;
    private d ao;
    private com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f ap;
    private boolean aq;
    private int ar;
    private com.sankuai.waimai.mach.recycler.c as;
    private com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.a at;
    private int au;
    private com.sankuai.waimai.foundation.core.service.screenshot.observer.a av;
    protected String s;
    boolean t;
    public boolean u;
    public android.arch.lifecycle.g v;
    public volatile o w;
    public NestedRecyclerView x;
    protected com.sankuai.waimai.rocks.view.a y;
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.b z;

    public static /* synthetic */ String a(f fVar, com.sankuai.waimai.platform.modular.network.error.a aVar, String str) {
        Object[] objArr = {aVar, str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "86e6f7bc713f769b9419b790d67ff43f", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "86e6f7bc713f769b9419b790d67ff43f");
        }
        if (aVar != null) {
            if (aVar.d() == null || TextUtils.isEmpty(aVar.d().getMessage())) {
                return !TextUtils.isEmpty(aVar.getMessage()) ? aVar.getMessage() : str;
            }
            return aVar.d().getMessage();
        }
        return str;
    }

    public static /* synthetic */ void a(f fVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "42e04ba4fd0d5e0471b9464ebd44626d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "42e04ba4fd0d5e0471b9464ebd44626d");
        } else if (i == 1) {
            Metrics.getInstance().startCustomScrollFPS(fVar.l());
        } else if (i == 0) {
            Metrics.getInstance().stopCustomScrollFPS(fVar.l());
        }
    }

    public static /* synthetic */ void a(f fVar, RecyclerView recyclerView, int i) {
        com.sankuai.waimai.rocks.view.block.a aVar;
        Object[] objArr = {recyclerView, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "ca8c2b3e7149c9c2c76b5fd830b24872", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "ca8c2b3e7149c9c2c76b5fd830b24872");
        } else if (i == 0) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
            int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (findFirstVisibleItemPosition < 0 || findFirstVisibleItemPosition > findLastVisibleItemPosition) {
                return;
            }
            while (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
                RecyclerView.s findViewHolderForLayoutPosition = recyclerView.findViewHolderForLayoutPosition(findFirstVisibleItemPosition);
                if ((findViewHolderForLayoutPosition instanceof a.c) && (aVar = ((a.c) findViewHolderForLayoutPosition).b) != null) {
                    String N = aVar.N();
                    if (TextUtils.equals("wm_order_status_feed_flow", N)) {
                        int i2 = findViewHolderForLayoutPosition.itemView.getTop() <= com.sankuai.waimai.foundation.utils.g.a(fVar.m(), (float) fVar.w.c.d) ? 0 : 8;
                        l lVar = (l) fVar.g;
                        Object[] objArr2 = {Integer.valueOf(i2)};
                        ChangeQuickRedirect changeQuickRedirect2 = l.d;
                        if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "a40fa8b842a88354a0c27f9300948eb3", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "a40fa8b842a88354a0c27f9300948eb3");
                        } else {
                            lVar.g.setVisibility(i2);
                        }
                        l lVar2 = (l) fVar.g;
                        Object[] objArr3 = {8};
                        ChangeQuickRedirect changeQuickRedirect3 = l.d;
                        if (PatchProxy.isSupport(objArr3, lVar2, changeQuickRedirect3, false, "293af8150ea7a1c6b5cfcbb70e89be6c", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, lVar2, changeQuickRedirect3, false, "293af8150ea7a1c6b5cfcbb70e89be6c");
                        } else if (lVar2.j != null) {
                            lVar2.j.setVisibility(8);
                        }
                    } else if (fVar.aq && fVar.w.a(N) && ah.a(findViewHolderForLayoutPosition.itemView, fVar.an) && !fVar.A.contains(N)) {
                        com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a("im_notification_response_event", com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b);
                        fVar.A.add(N);
                        if (fVar.A.size() == fVar.ar) {
                            fVar.aq = false;
                        }
                    }
                }
                findFirstVisibleItemPosition++;
            }
        }
    }

    public static /* synthetic */ void a(f fVar, OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "c6eafca60565670f4a9070d455b76f0b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "c6eafca60565670f4a9070d455b76f0b");
        } else if (fVar.w == null || fVar.w.b()) {
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_detail_status").b("order_status_info_null").b());
            ((l) fVar.g).a(new com.sankuai.waimai.platform.modular.network.error.a(-2, fVar.m().getResources().getString(R.string.takeout_loading_fail_try_afterwhile)), fVar.V());
        } else {
            fVar.ap.b();
            fVar.c(orderRocksServerModel);
            fVar.g(orderRocksServerModel);
            fVar.c((Object) orderRocksServerModel);
            fVar.d(orderRocksServerModel);
            fVar.W();
            fVar.X();
            fVar.J = true;
        }
    }

    public static /* synthetic */ void a(f fVar, n nVar) {
        Object[] objArr = {nVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "cd13e71fcaa0c0fa73779ce7dcc12cbc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "cd13e71fcaa0c0fa73779ce7dcc12cbc");
            return;
        }
        if (nVar.h == null) {
            nVar.h = new HashMap();
        }
        nVar.h.put("pageType", 4);
        nVar.h.put(Constants.EventConstants.KEY_ORDER_ID, fVar.H);
        nVar.h.put("orderPoiId", String.valueOf(((d) fVar.F()).D.a()));
        nVar.h.put("rank_list_id", ((d) fVar.F()).B.a());
    }

    public static /* synthetic */ void a(f fVar, Map map) {
        com.sankuai.waimai.mach.recycler.a aVar;
        Object[] objArr = {map};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "1d963d9db0ae50032aace07a126729dc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "1d963d9db0ae50032aace07a126729dc");
        } else if (map != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(map.get("index"));
            int a = r.a(sb.toString(), 0);
            Object[] objArr2 = {Integer.valueOf(a)};
            ChangeQuickRedirect changeQuickRedirect2 = r;
            if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect2, false, "1cfd086e0d668855b51c50a566d21e8a", RobustBitConfig.DEFAULT_VALUE)) {
                aVar = (com.sankuai.waimai.mach.recycler.a) PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect2, false, "1cfd086e0d668855b51c50a566d21e8a");
            } else {
                com.sankuai.waimai.rocks.view.recyclerview.a aVar2 = fVar.y.d.h;
                if (aVar2 != null) {
                    com.sankuai.waimai.rocks.view.viewmodel.e eVar = aVar2.b.get(a);
                    if (eVar instanceof com.sankuai.waimai.rocks.view.viewmodel.a) {
                        aVar = ((com.sankuai.waimai.rocks.view.viewmodel.a) eVar).p;
                    }
                }
                aVar = null;
            }
            if (aVar != null) {
                aVar.e();
            }
        }
    }

    public static /* synthetic */ void c(f fVar, OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "e5942a5b3baaa00bf756716a6f1a73ff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "e5942a5b3baaa00bf756716a6f1a73ff");
        } else if (orderRocksServerModel == null || com.sankuai.waimai.foundation.utils.b.b(orderRocksServerModel.moduleList)) {
        } else {
            int size = orderRocksServerModel.moduleList.size() - 1;
            while (size >= 0) {
                if (TextUtils.equals(orderRocksServerModel.moduleList.get(size).moduleId, "wm_order_status_feed_flow")) {
                    if (orderRocksServerModel.f()) {
                        size++;
                    }
                    fVar.au = size;
                    return;
                }
                size--;
            }
        }
    }

    public static /* synthetic */ boolean c(f fVar, boolean z) {
        fVar.V = false;
        return false;
    }

    public static /* synthetic */ boolean d(f fVar, boolean z) {
        fVar.t = true;
        return true;
    }

    public static /* synthetic */ void k(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "e60cd49f968ad4215588f0b0cc1107fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "e60cd49f968ad4215588f0b0cc1107fa");
        } else if (fVar.au != -1) {
            fVar.x.smoothScrollToPosition(fVar.au);
        }
    }

    public static /* synthetic */ void x(f fVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, fVar, changeQuickRedirect, false, "1ceb6a72fe5a2a3050f03265af195a39", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, fVar, changeQuickRedirect, false, "1ceb6a72fe5a2a3050f03265af195a39");
        } else if (fVar.ae != null) {
            fVar.ae.recordStep(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(Boolean.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((d) fVar.F()).ae.a().b))) ? "with_map" : "no_map");
            com.sankuai.meituan.takeoutnew.util.aop.h.a(fVar.ae.recordStep("activity_data_ready"));
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ void a(com.meituan.android.cube.pga.type.a aVar) {
        d dVar = (d) aVar;
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c331b14ca3d0e06d5255e690e9b2faa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c331b14ca3d0e06d5255e690e9b2faa");
            return;
        }
        this.G = (OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class);
        super.a((f) dVar);
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ l z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7522bf6a0b93c76dd4f0f31a303278ed", RobustBitConfig.DEFAULT_VALUE) ? (l) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7522bf6a0b93c76dd4f0f31a303278ed") : new l(m(), this);
    }

    public f(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a8758079766a85317dd50d42808b3c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a8758079766a85317dd50d42808b3c8");
            return;
        }
        this.I = "";
        this.S = false;
        this.T = true;
        this.ac = new android.arch.lifecycle.k<>();
        this.v = new android.arch.lifecycle.g(this);
        this.ad = false;
        this.ah = ag;
        this.ai = ABTestManager.getInstance(com.meituan.android.singleton.b.a).getStrategy("time_limit_interfaces_group", null);
        this.A = new ArrayList(3);
        this.au = -1;
        this.av = new com.sankuai.waimai.foundation.core.service.screenshot.observer.b() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.foundation.core.service.screenshot.observer.b, com.sankuai.waimai.foundation.core.service.screenshot.observer.a
            public final void a(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "04c18a9705bbb16eb190f530269e4d83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "04c18a9705bbb16eb190f530269e4d83");
                } else if (com.sankuai.waimai.foundation.core.a.d() && TextUtils.equals(str, f.this.m().getClass().getName())) {
                    long j = 0;
                    String str2 = "";
                    if (f.this.W != null) {
                        j = f.this.W.poiId;
                        str2 = f.this.W.poiIdStr;
                    }
                    JudasManualManager.a("b_fq46u68k").a("c_hgowsqb").a("order_id", f.this.H).a("poi_id", com.sankuai.waimai.bussiness.order.base.utils.i.a(j, str2)).a(f.this.m()).a();
                }
            }
        };
        this.ao = dVar;
        this.z = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.b(l(), (d) F(), this);
        this.ap = com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a();
    }

    @Override // com.meituan.android.cube.core.f
    public final void a(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ba63bfd8e54d5ca0f7cc1dbea828f8bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ba63bfd8e54d5ca0f7cc1dbea828f8bc");
            return;
        }
        super.a(bundle);
        this.v.a(d.a.ON_CREATE);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a160594aa292ac7cb4e9cd671a6905bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a160594aa292ac7cb4e9cd671a6905bb");
        } else if (m() instanceof BaseActivity) {
            this.ae = ((BaseActivity) m()).s();
        }
        c(l().getIntent());
        com.sankuai.waimai.platform.domain.manager.user.a.i().a(this);
        com.sankuai.waimai.imbase.manager.e.a().a(this);
        SubmitOrderManager.getInstance().registerOrderStatusObserver(this);
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().a(this.av);
        this.ac.a(this, new android.arch.lifecycle.l<OrderRocksServerModel>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.12
            public static ChangeQuickRedirect a;

            @Override // android.arch.lifecycle.l
            public final /* synthetic */ void a(@Nullable OrderRocksServerModel orderRocksServerModel) {
                OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                Object[] objArr3 = {orderRocksServerModel2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8fd13cf5dae2ca99bae035087850e45a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8fd13cf5dae2ca99bae035087850e45a");
                } else {
                    f.a(f.this, orderRocksServerModel2);
                }
            }
        });
        this.ak = new RecommendModel((com.sankuai.waimai.bussiness.order.detailnew.a) F());
        if (com.sankuai.waimai.platform.model.c.a().b() == 0) {
            final RecommendModel recommendModel = this.ak;
            final String str = this.H;
            Object[] objArr3 = {str};
            ChangeQuickRedirect changeQuickRedirect3 = RecommendModel.a;
            if (PatchProxy.isSupport(objArr3, recommendModel, changeQuickRedirect3, false, "b6ad651f6ab863170f8c36237c6b2084", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, recommendModel, changeQuickRedirect3, false, "b6ad651f6ab863170f8c36237c6b2084");
                return;
            }
            recommendModel.c = false;
            String a = ListIDHelper.a.a.a("order", "order_detail_recommend_product");
            final com.sankuai.waimai.bussiness.order.detailnew.pgablock.recommend.a aVar = recommendModel.f;
            Object[] objArr4 = {str, "c_hgowsqb", a};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.recommend.a.a;
            recommendModel.e = rx.d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<RecommendModel.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.recommend.RecommendModel.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(a aVar2) {
                    a aVar3 = aVar2;
                    Object[] objArr5 = {aVar3};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "a27f4c49eb1b3b986bcc3921d996d4b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "a27f4c49eb1b3b986bcc3921d996d4b2");
                        return;
                    }
                    recommendModel.b = aVar3;
                    if (aVar3.b == null || TextUtils.isEmpty(aVar3.b.b)) {
                        recommendModel.d.aA.a((j<Integer>) 2);
                    } else {
                        recommendModel.c = true;
                        recommendModel.d.aA.a((j<Integer>) 1);
                    }
                    recommendModel.d.az.a((j<Integer>) 1);
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar2) {
                    Object[] objArr5 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "be006834f250446f21b7c1060dfcf810", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "be006834f250446f21b7c1060dfcf810");
                        return;
                    }
                    recommendModel.d.az.a((j<Integer>) 2);
                    recommendModel.d.aA.a((j<Integer>) 2);
                }
            }, (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "66c2a8c6a856ccb53437078c31726757", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "66c2a8c6a856ccb53437078c31726757") : rx.d.b(((CrossShopPurchaseApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) CrossShopPurchaseApi.class)).crossShopPurchase(str, "c_hgowsqb"), ((RecommendApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) RecommendApi.class)).recommedProduct(str, a), new rx.functions.h<BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.crossshoppurchase.a>, BaseResponse<RecommendModel.RecommendResponse>, RecommendModel.a>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.recommend.a.1
                public static ChangeQuickRedirect a;

                @Override // rx.functions.h
                public final /* synthetic */ RecommendModel.a a(BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.crossshoppurchase.a> baseResponse, BaseResponse<RecommendModel.RecommendResponse> baseResponse2) {
                    BaseResponse<com.sankuai.waimai.bussiness.order.detailnew.pgablock.childblock.crossshoppurchase.a> baseResponse3 = baseResponse;
                    BaseResponse<RecommendModel.RecommendResponse> baseResponse4 = baseResponse2;
                    Object[] objArr5 = {baseResponse3, baseResponse4};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "051a172683e145db740c9428ce9457b3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (RecommendModel.a) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "051a172683e145db740c9428ce9457b3");
                    }
                    RecommendModel.a aVar2 = new RecommendModel.a();
                    aVar2.a = str;
                    aVar2.b = baseResponse3.data;
                    aVar2.c = baseResponse4.data;
                    return aVar2;
                }
            })).b(rx.schedulers.a.e()).a(rx.android.schedulers.a.a()));
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6ae27a99f03e07bbda5ae94223df57a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6ae27a99f03e07bbda5ae94223df57a");
            return;
        }
        super.s();
        this.s = N();
        c(l().getIntent());
        ((d) F()).C.b((android.arch.lifecycle.k<String>) this.H);
        ((d) F()).B.b((android.arch.lifecycle.k<String>) ListIDHelper.a.a.a());
        ((d) F()).U.b((android.arch.lifecycle.k<Boolean>) Boolean.TRUE);
        ((d) F()).n.a(new com.meituan.android.cube.pga.action.b<Intent>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.23
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Intent intent) {
                Intent intent2 = intent;
                Object[] objArr2 = {intent2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "71faa3d1c5d19a8d9ace859adc27690b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "71faa3d1c5d19a8d9ace859adc27690b");
                } else {
                    f.this.a(intent2);
                }
            }
        });
        ((d) F()).o.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.34
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar) {
                b.a aVar2 = aVar;
                Object[] objArr2 = {aVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2c827fbc72bc3a84edb84d5d2b741b84", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2c827fbc72bc3a84edb84d5d2b741b84");
                } else if (aVar2 != null) {
                    f.this.a(aVar2.a, aVar2.b, aVar2.c);
                }
            }
        });
        ((d) F()).R.b = new com.meituan.android.cube.pga.action.d<View>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.40
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ View a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5d856ea8946f56553f18c7421a3aa814", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5d856ea8946f56553f18c7421a3aa814") : ((l) f.this.g).k;
            }
        };
        ((d) F()).S.b = new com.meituan.android.cube.pga.action.d<TextView>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.41
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ TextView a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "eda092f606af1ac3028d19f1b0d1b820", RobustBitConfig.DEFAULT_VALUE) ? (TextView) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "eda092f606af1ac3028d19f1b0d1b820") : ((l) f.this.g).l;
            }
        };
        ((d) F()).aK.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.42
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "56351471b916fc141375ac30909dacac", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "56351471b916fc141375ac30909dacac") : f.this.x;
            }
        };
        ((d) F()).aO.b = new com.meituan.android.cube.pga.action.d<Integer>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.43
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5185d6871e188cd15b72206f1527209e", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5185d6871e188cd15b72206f1527209e");
                }
                if (f.this.as != null) {
                    return Integer.valueOf(f.this.as.c());
                }
                return 0;
            }
        };
        ((d) F()).aQ.b = new com.meituan.android.cube.pga.action.c<String, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.44
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ Map<String, Object> a(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7873285cc5c46c0f4c067fd6aa9c5792", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7873285cc5c46c0f4c067fd6aa9c5792");
                }
                if (f.this.w == null || f.this.w.c == null) {
                    return null;
                }
                return f.this.w.c.a(str2);
            }
        };
        ((d) F()).W.b = new com.meituan.android.cube.pga.action.d<CustomDragExpandLayout>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ CustomDragExpandLayout a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fe038b798538fd393d54298e97d96175", RobustBitConfig.DEFAULT_VALUE) ? (CustomDragExpandLayout) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fe038b798538fd393d54298e97d96175") : ((l) f.this.g).i;
            }
        };
        ((d) F()).u.b = new com.meituan.android.cube.pga.action.d<com.sankuai.waimai.business.order.api.detail.block.a>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.3
            @Override // com.meituan.android.cube.pga.action.d
            public final /* bridge */ /* synthetic */ com.sankuai.waimai.business.order.api.detail.block.a a() {
                return f.this;
            }
        };
        ((d) F()).v.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "646ad933f9754fd8b67e643f031a0ec4", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "646ad933f9754fd8b67e643f031a0ec4") : Boolean.valueOf(f.this.J);
            }
        };
        ((d) F()).al.b = new com.meituan.android.cube.pga.action.d<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Boolean a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9c94e85bcae81ea0d189b44b84e9cdf6", RobustBitConfig.DEFAULT_VALUE) ? (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9c94e85bcae81ea0d189b44b84e9cdf6") : Boolean.valueOf(f.this.Y);
            }
        };
        ((d) F()).an.a(new com.meituan.android.cube.pga.action.b<String>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(String str) {
                String str2 = str;
                Object[] objArr2 = {str2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9abdbf4586afee56f0c6c30d3d5867fc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9abdbf4586afee56f0c6c30d3d5867fc");
                } else {
                    f.this.I = str2;
                }
            }
        });
        ((d) F()).ao.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9e53e02354eca1bfee7248e5f3b94f19", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9e53e02354eca1bfee7248e5f3b94f19");
                } else {
                    f.this.Y = bool2.booleanValue();
                }
            }
        });
        ((d) F()).Y.b = new com.meituan.android.cube.pga.action.d<String>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.8
            @Override // com.meituan.android.cube.pga.action.d
            public final /* bridge */ /* synthetic */ String a() {
                return f.this.s;
            }
        };
        ((d) F()).aw.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.9
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Object a() {
                boolean z = false;
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "81b6d15664d1ed40b3aef32bef08e6bf", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "81b6d15664d1ed40b3aef32bef08e6bf");
                }
                if (f.this.W != null && f.this.W.showMap()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            }
        };
        ((d) F()).aL.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.10
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Object a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "33589b75baa885369b17452169a490fb", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "33589b75baa885369b17452169a490fb");
                }
                if (f.this.w != null) {
                    return f.this.w.b;
                }
                return null;
            }
        };
        ((d) F()).aG.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.11
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr2 = {bool2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "7a2046f7d8d6b3f34d09bce9c50113a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "7a2046f7d8d6b3f34d09bce9c50113a1");
                } else if (bool2 == null || !bool2.booleanValue()) {
                } else {
                    f.k(f.this);
                }
            }
        });
        this.al = new e(m());
        this.an = this.al.b;
        this.am = this.al.c;
        this.x = ((l) this.g).h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a44c06fe8b2feb774c63db6d785a3d54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a44c06fe8b2feb774c63db6d785a3d54");
        } else {
            Mach.d dVar = new Mach.d() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.24
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.mach.Mach.d
                public final void a(@NonNull String str, @Nullable Map<String, Object> map) {
                    Object[] objArr3 = {str, map};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "0c2c232c3a8acdde4c0280d92a3cfa1c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "0c2c232c3a8acdde4c0280d92a3cfa1c");
                        return;
                    }
                    f.this.z.a(str, map);
                    if (TextUtils.equals(str, "std_trigger_expose_event")) {
                        f.a(f.this, map);
                    }
                }
            };
            ((d) F()).aD.a((com.meituan.android.cube.pga.common.j<Mach.d>) dVar);
            e eVar = this.al;
            com.sankuai.waimai.rocks.view.block.c cVar = (com.sankuai.waimai.rocks.view.block.c) F();
            NestedRecyclerView nestedRecyclerView = this.x;
            c.b bVar = new c.b() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.25
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.rocks.view.mach.c.b
                public final void a(com.sankuai.waimai.mach.recycler.c cVar2) {
                    Object[] objArr3 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b0c4576d67b3fd76aae40ddceb1e7c88", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b0c4576d67b3fd76aae40ddceb1e7c88");
                    } else if (cVar2 != null) {
                        String str = cVar2.j;
                        if (TextUtils.equals(str, "wm_order_status_im_info_food_info") || TextUtils.equals(str, "wm_order_status_im_info_delivery_info")) {
                            com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a(cVar2, "im_notification_response_event");
                        } else if (TextUtils.equals(str, "wm_order_status_operatearea_buttonlist")) {
                            com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a(cVar2, "im_notification_response_event");
                            com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a(cVar2, "notification_button_visibility_event");
                        } else if (TextUtils.equals(str, "wm_order_status_operatearea_desc")) {
                            com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a(cVar2, "mach_event_activity_status");
                        } else if (TextUtils.equals(str, "wm_order_status_operatearea_bottomarea")) {
                            f.this.as = cVar2;
                        }
                    }
                }
            };
            Object[] objArr3 = {cVar, nestedRecyclerView, dVar, bVar};
            ChangeQuickRedirect changeQuickRedirect3 = e.a;
            this.y = PatchProxy.isSupport(objArr3, eVar, changeQuickRedirect3, false, "b3eef85de4f1c85b125dfa6613b5a027", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr3, eVar, changeQuickRedirect3, false, "b3eef85de4f1c85b125dfa6613b5a027") : eVar.a(cVar, nestedRecyclerView, null, dVar, bVar, null);
        }
        this.x.setItemViewCacheSize(10);
        this.x.a(new NestedRecyclerView.b() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.13
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.b
            public final void a(RecyclerView recyclerView, int i) {
                Object[] objArr4 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a33a144eb92ee416d337fb6b59cc21e4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a33a144eb92ee416d337fb6b59cc21e4");
                    return;
                }
                f.a(f.this, i);
                f.this.y.d.q();
                f.a(f.this, recyclerView, i);
                ((d) f.this.F()).aR.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(i));
            }
        });
        this.x.setChildRecyclerViewHelper(new NestedRecyclerView.a() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.14
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.a
            public final RecyclerView a() {
                Object[] objArr4 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect4 = a;
                return PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "e0ac7777175b7f4709e72ed9d9f02f52", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "e0ac7777175b7f4709e72ed9d9f02f52") : ((d) f.this.F()).V.a().b;
            }
        });
        this.at = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.abnormal.a((com.sankuai.waimai.bussiness.order.detailnew.a) F());
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a aVar = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.a((com.sankuai.waimai.bussiness.order.detailnew.a) F(), (ViewStub) i().findViewById(R.id.wm_detail_action_bar_view_stub));
        aVar.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<OrderRocksServerModel, Map<String, Object>>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.15
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ Map<String, Object> a(OrderRocksServerModel orderRocksServerModel) {
                OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                Object[] objArr4 = {orderRocksServerModel2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "00acda0d4172d02d5859ce5015888b09", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Map) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "00acda0d4172d02d5859ce5015888b09");
                }
                if (orderRocksServerModel2 != null) {
                    return orderRocksServerModel2.c("wm_order_status_action_bar");
                }
                return Collections.emptyMap();
            }
        });
        a((com.meituan.android.cube.pga.block.a) aVar);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.a aVar2 = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.a((com.sankuai.waimai.bussiness.order.detailnew.a) F(), (ViewStub) i().findViewById(R.id.wm_order_status_map_stub));
        aVar2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<OrderRocksServerModel, OrderFixAreaInfo>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.16
            public static ChangeQuickRedirect a;

            /* JADX INFO: Access modifiers changed from: private */
            @Override // com.meituan.android.cube.pga.action.c
            public OrderFixAreaInfo a(OrderRocksServerModel orderRocksServerModel) {
                Object[] objArr4 = {orderRocksServerModel};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "c716146028519978c9fb7fd977e4fdfd", RobustBitConfig.DEFAULT_VALUE)) {
                    return (OrderFixAreaInfo) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "c716146028519978c9fb7fd977e4fdfd");
                }
                if (orderRocksServerModel != null) {
                    try {
                        return OrderFixAreaInfo.convert(orderRocksServerModel.c("wm_order_status_map_area"));
                    } catch (Exception unused) {
                    }
                }
                return new OrderFixAreaInfo();
            }
        });
        a((com.meituan.android.cube.pga.block.a) aVar2);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j jVar = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.j((com.sankuai.waimai.bussiness.order.detailnew.a) F(), (ViewStub) i().findViewById(R.id.wm_img_floating_red_packet_container));
        jVar.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<OrderRocksServerModel, OrderFollowAreaInfo>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.17
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ OrderFollowAreaInfo a(OrderRocksServerModel orderRocksServerModel) {
                OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                Object[] objArr4 = {orderRocksServerModel2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "18463ca1fbc81d12a446d6ff00e86f73", RobustBitConfig.DEFAULT_VALUE)) {
                    return (OrderFollowAreaInfo) PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "18463ca1fbc81d12a446d6ff00e86f73");
                }
                if (orderRocksServerModel2 != null) {
                    return f.this.W;
                }
                return new OrderFollowAreaInfo();
            }
        });
        a((com.meituan.android.cube.pga.block.a) jVar);
        com.sankuai.waimai.bussiness.order.detailnew.a aVar3 = (com.sankuai.waimai.bussiness.order.detailnew.a) F();
        ViewStub viewStub = (ViewStub) i().findViewById(R.id.wm_order_detail_flow_guide);
        Object[] objArr4 = {aVar3, viewStub};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.b.a;
        com.meituan.android.cube.pga.block.a aVar4 = PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "47c74c02187b9e6f7f04686ab6e8a289", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.block.a) PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "47c74c02187b9e6f7f04686ab6e8a289") : new com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.guide.a(aVar3, viewStub);
        if (aVar4 != null) {
            a(aVar4);
        }
        b((com.meituan.android.cube.pga.block.b) new com.sankuai.waimai.bussiness.order.detailnew.pgablock.feedback.c((d) F()));
        b((com.meituan.android.cube.pga.block.b) new com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.c((com.sankuai.waimai.bussiness.order.detailnew.a) F()));
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.b bVar2 = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.b((com.sankuai.waimai.bussiness.order.detailnew.a) F());
        bVar2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<OrderRocksServerModel, com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.18
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a a(OrderRocksServerModel orderRocksServerModel) {
                OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                Object[] objArr5 = {orderRocksServerModel2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                return PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "774768f3f1f4d48c800d1bd06b6b51c4", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "774768f3f1f4d48c800d1bd06b6b51c4") : com.sankuai.waimai.bussiness.order.detailnew.pgablock.modifyaddress.a.a(orderRocksServerModel2);
            }
        });
        b((com.meituan.android.cube.pga.block.b) bVar2);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.e eVar2 = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.e((com.sankuai.waimai.bussiness.order.detailnew.a) F(), (ViewStub) i().findViewById(R.id.wm_order_detail_share_order));
        eVar2.a(g.a());
        a((com.meituan.android.cube.pga.block.a) eVar2);
        com.meituan.android.cube.pga.block.a a = com.sankuai.waimai.platform.dynamic.d.a(this, "wm_order_detail_sg_drug_consultation_template");
        if (a != null) {
            a.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<OrderRocksServerModel, String>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.19
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.c
                public final /* synthetic */ String a(OrderRocksServerModel orderRocksServerModel) {
                    OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                    Object[] objArr5 = {orderRocksServerModel2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "1d0dff6580cb0dc2ff85b5e9692a4191", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "1d0dff6580cb0dc2ff85b5e9692a4191");
                    }
                    if (orderRocksServerModel2 != null) {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = OrderRocksServerModel.a;
                        if (PatchProxy.isSupport(objArr6, orderRocksServerModel2, changeQuickRedirect6, false, "1201089c55cc03b77846bbb1a6baaadb", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr6, orderRocksServerModel2, changeQuickRedirect6, false, "1201089c55cc03b77846bbb1a6baaadb");
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("pharmacist_consultation_entrance", String.valueOf(orderRocksServerModel2.g.get("pharmacist_consultation_entrance")));
                        return com.sankuai.waimai.mach.utils.b.a().toJson(hashMap);
                    }
                    return "";
                }
            });
            a(a, R.id.layout_order_drug_consultation_entrance);
        }
        com.meituan.android.cube.pga.block.a a2 = com.sankuai.waimai.platform.dynamic.d.a(this, "wm_order_detail_order_promotion_template");
        if (a2 != null) {
            a2.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<OrderRocksServerModel, String>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.20
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.c
                public final /* synthetic */ String a(OrderRocksServerModel orderRocksServerModel) {
                    OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                    Object[] objArr5 = {orderRocksServerModel2};
                    ChangeQuickRedirect changeQuickRedirect5 = a;
                    if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "763c3e277072884598ce6ebac3da45f5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (String) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "763c3e277072884598ce6ebac3da45f5");
                    }
                    if (orderRocksServerModel2 != null) {
                        Object[] objArr6 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect6 = OrderRocksServerModel.a;
                        if (PatchProxy.isSupport(objArr6, orderRocksServerModel2, changeQuickRedirect6, false, "8c208ce56f40035287eb7bdc8cdf8ad1", RobustBitConfig.DEFAULT_VALUE)) {
                            return (String) PatchProxy.accessDispatch(objArr6, orderRocksServerModel2, changeQuickRedirect6, false, "8c208ce56f40035287eb7bdc8cdf8ad1");
                        }
                        Map<String, Object> c = orderRocksServerModel2.c("sg_order_status_order_promotion_entrance");
                        if (c != null) {
                            return com.sankuai.waimai.mach.utils.b.a().toJson(c.get("activity_entry_info_list"));
                        }
                        return null;
                    }
                    return "";
                }
            });
            a(a2, R.id.fl_order_detail_root);
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.b bVar3 = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.operation.bottom.b((d) F());
        bVar3.a((com.meituan.android.cube.pga.action.c) new com.meituan.android.cube.pga.action.c<OrderRocksServerModel, OrderStatusButtonListInfo>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.21
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.c
            public final /* synthetic */ OrderStatusButtonListInfo a(OrderRocksServerModel orderRocksServerModel) {
                OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                Object[] objArr5 = {orderRocksServerModel2};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "67a3a507e11882dad45f16afb44cd386", RobustBitConfig.DEFAULT_VALUE)) {
                    return (OrderStatusButtonListInfo) PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "67a3a507e11882dad45f16afb44cd386");
                }
                if (orderRocksServerModel2 != null) {
                    return OrderStatusButtonListInfo.convert(orderRocksServerModel2, "sg_order_status_operatearea_buttonlist");
                }
                return null;
            }
        });
        a(bVar3, R.id.wm_order_detail_bottom_button);
        this.af = new b(l(), (d) F());
        this.af.x = new com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.22
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c
            public final void a(boolean z) {
            }

            @Override // com.sankuai.waimai.bussiness.order.detailnew.widget.dragexpandlayout.manager.c
            public final void a(boolean z, String str) {
                Object[] objArr5 = {Byte.valueOf(z ? (byte) 1 : (byte) 0), str};
                ChangeQuickRedirect changeQuickRedirect5 = a;
                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "9d2474f7a7e969e045121001deb9d12c", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "9d2474f7a7e969e045121001deb9d12c");
                } else if (z && TextUtils.equals(str, "click_feed_guide")) {
                    ((d) f.this.F()).aH.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                }
            }
        };
    }

    public static /* synthetic */ Map b(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "755a0af70dbf3babcd80d6f74ef8a155", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "755a0af70dbf3babcd80d6f74ef8a155");
        }
        if (orderRocksServerModel != null) {
            return orderRocksServerModel.c("sg_order_status_share_entrance");
        }
        return Collections.emptyMap();
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "13de38ade4b790f501eeb7da9419e142", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "13de38ade4b790f501eeb7da9419e142");
            return;
        }
        this.J = z;
        a(z, false);
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9ba326237ed3e83dc98370d3bd8b8597", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9ba326237ed3e83dc98370d3bd8b8597");
        } else {
            d(z);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.a
    public final void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b1f92bb6e31b89ad48d0dd2fcffa9b83", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b1f92bb6e31b89ad48d0dd2fcffa9b83");
        } else {
            e(z);
        }
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.a
    public final void aS_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4fb5e0378042285334446ba61b8a7f45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4fb5e0378042285334446ba61b8a7f45");
        } else {
            P();
        }
    }

    @Override // com.sankuai.waimai.business.order.api.detail.block.a
    public final void b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d64d45b50b91056012bfaf938c28631e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d64d45b50b91056012bfaf938c28631e");
        } else {
            ((d) F()).aF.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
        }
    }

    @Override // com.meituan.android.cube.core.f
    public final void aR_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9ef64d7a1c9a5f4be197dc72f957e2f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9ef64d7a1c9a5f4be197dc72f957e2f");
            return;
        }
        super.aR_();
        this.v.a(d.a.ON_START);
        this.U = false;
        if (!this.S && !this.P && !this.u) {
            d(this.T);
            this.T = false;
        }
        this.P = false;
        this.S = false;
    }

    @Override // com.meituan.android.cube.core.f
    public final void aX_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "571cca208153692914f7beceb07ad4a9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "571cca208153692914f7beceb07ad4a9");
            return;
        }
        if (this.ap != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", 0);
            this.ap.a("mach_event_activity_status", hashMap);
            this.ap.b("mach_event_activity_status", hashMap);
        }
        super.aX_();
        this.v.a(d.a.ON_RESUME);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.b bVar = this.z;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.b.c;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "768dd9b6f3a1dcc8a2fc001f1239fe64", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "768dd9b6f3a1dcc8a2fc001f1239fe64");
            return;
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b bVar2 = bVar.h;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.a;
        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "9f46aeec85ba403ba6c48cb223d65d9b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "9f46aeec85ba403ba6c48cb223d65d9b");
        } else {
            if (bVar2.j == 0) {
                bVar2.b(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING);
            } else if (bVar2.j == 1) {
                bVar2.b(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY);
            } else if (bVar2.j == 2) {
                bVar2.b(0, 2052);
            }
            bVar2.j = -1;
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a aVar = bVar.e.b;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.a;
        if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "33efdce62fe78d7ff1f4f10b6b9c3966", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "33efdce62fe78d7ff1f4f10b6b9c3966");
            return;
        }
        if (aVar.n == 0) {
            aVar.a(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_LOADING);
        } else if (aVar.n == 1) {
            aVar.a(0, TXLiteAVCode.EVT_AUDIO_JITTER_STATE_FIRST_PLAY);
        } else if (aVar.n == 2) {
            aVar.a(0, 2052);
        }
        aVar.n = -1;
    }

    @Override // com.meituan.android.cube.core.f
    public final void bc_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31e56cd8b07dce11dbd58eaeaa76062d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31e56cd8b07dce11dbd58eaeaa76062d");
            return;
        }
        if (this.ap != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", 1);
            this.ap.a("mach_event_activity_status", hashMap);
            this.ap.b("mach_event_activity_status", hashMap);
        }
        super.bc_();
    }

    @Override // com.meituan.android.cube.core.f
    public final void bD_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb14c0cf1d28deaf29b7d90134d7c4d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb14c0cf1d28deaf29b7d90134d7c4d0");
            return;
        }
        super.bD_();
        this.v.a(d.a.ON_STOP);
        this.U = true;
        b bVar = this.af;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "82c08e9a721e97de588ee0c5dede50fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "82c08e9a721e97de588ee0c5dede50fb");
        } else if (bVar.B != null) {
            bVar.B.cancel();
        }
        if (this.u) {
            return;
        }
        a(this.aa);
    }

    @Override // com.meituan.android.cube.core.f
    public final void bE_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4c402845140299b54e6ed861db74d4fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4c402845140299b54e6ed861db74d4fa");
            return;
        }
        if (this.ap != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("status", 2);
            this.ap.a("mach_event_activity_status", hashMap);
            this.ap.b("mach_event_activity_status", hashMap);
        }
        super.bE_();
        this.v.a(d.a.ON_DESTROY);
        a(this.Z);
        a(this.ab);
        a(this.aa);
        b bVar = this.af;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "c73ec08130644a8ecb7b197fe832a7da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "c73ec08130644a8ecb7b197fe832a7da");
        } else {
            bVar.c();
            if (bVar.F != null) {
                bVar.F.removeCallbacksAndMessages(null);
            }
        }
        if (this.z != null) {
            this.z.a();
        }
        if (this.ap != null) {
            this.ap.b();
        }
        if (this.y != null) {
            this.y.a();
        }
        if (this.ak != null) {
            RecommendModel recommendModel = this.ak;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = RecommendModel.a;
            if (PatchProxy.isSupport(objArr3, recommendModel, changeQuickRedirect3, false, "7ee1d6e1b26ea0a50b2e192955014e6f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, recommendModel, changeQuickRedirect3, false, "7ee1d6e1b26ea0a50b2e192955014e6f");
            } else if (recommendModel.e != null && !recommendModel.e.isUnsubscribed()) {
                recommendModel.e.unsubscribe();
            }
        }
        SubmitOrderManager.getInstance().unregisterOrderStatusObserver(this);
        com.sankuai.waimai.platform.domain.manager.user.a.i().b(this);
        com.sankuai.waimai.imbase.manager.e.a().b(this);
        com.sankuai.waimai.platform.utils.l.cancel(((d) F()).Y.a().a());
        com.sankuai.waimai.foundation.core.service.screenshot.a.a().b(this.av);
        if (this.ae != null) {
            this.ae.disable();
        }
        super.bE_();
    }

    private String b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d193ebdd9b6c3b81301ea29e5f1f5c24", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d193ebdd9b6c3b81301ea29e5f1f5c24");
        }
        String a = com.sankuai.waimai.platform.utils.f.a(intent, "hash_id", "");
        if (TextUtils.isEmpty(a)) {
            a = com.sankuai.waimai.foundation.router.a.a(intent, "hash_id", (String) null);
        }
        return (!TextUtils.isEmpty(a) || intent.getData() == null) ? a : intent.getData().getQueryParameter("oid");
    }

    private void c(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebf0e43321349e7914ebccd9d06669ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebf0e43321349e7914ebccd9d06669ed");
            return;
        }
        this.H = b(intent);
        if (TextUtils.isEmpty(this.H)) {
            ae.a((Activity) l(), com.meituan.android.singleton.b.a.getString(R.string.wm_order_status_order_id_is_null));
            com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("show_order_detail").b("order_id_null").b());
            P();
            return;
        }
        this.Q = com.sankuai.waimai.foundation.router.a.b(intent) || com.sankuai.waimai.platform.utils.f.a(intent, "hasBubble", false);
        this.N = com.sankuai.waimai.platform.utils.f.a(intent, "position", -1);
        d(intent);
        this.X = com.sankuai.waimai.platform.utils.f.a(intent, "is_auto_start_when_pay_result_ok", false);
        this.L = com.sankuai.waimai.platform.utils.f.a(intent, "is_sc_orderlist", false);
        this.Y = this.K;
        this.I = this.K ? "" : "1";
        this.O = com.sankuai.waimai.platform.utils.f.a(intent, "ordertype", 1);
        this.N = com.sankuai.waimai.platform.utils.f.a(intent, "position", -1);
        this.M = com.sankuai.waimai.platform.utils.f.a(intent, "com.sankuai.waimai.router.from", -1) == 4;
    }

    private void d(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c38bf05c34ca1d730dc1f7c96a14294", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c38bf05c34ca1d730dc1f7c96a14294");
            return;
        }
        this.K = 1 == com.sankuai.waimai.platform.utils.f.a(intent, "", "drug_auto_pop_window", -1);
        if (this.K) {
            return;
        }
        this.K = com.sankuai.waimai.platform.utils.f.a(intent, "from_pay_to_order_detail", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(rx.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c7a03efb4745462f61f3c575d8ca249", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c7a03efb4745462f61f3c575d8ca249");
        } else if (kVar == null || kVar.isUnsubscribed()) {
        } else {
            kVar.unsubscribe();
        }
    }

    private boolean M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c47381431141e73a41a04971c6223ec1", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c47381431141e73a41a04971c6223ec1")).booleanValue() : ((Activity) m()).isFinishing();
    }

    private String N() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8cc18ef2172775d9192f4c08a35edf10", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8cc18ef2172775d9192f4c08a35edf10");
        }
        if (m() instanceof BaseActivity) {
            return ((BaseActivity) m()).w();
        }
        return getClass().getSimpleName() + System.currentTimeMillis();
    }

    private boolean O() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "31d5de8ca2e0868e38663583fb8a286d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "31d5de8ca2e0868e38663583fb8a286d")).booleanValue() : Build.VERSION.SDK_INT >= 17 && ((Activity) m()).isDestroyed();
    }

    @Override // com.sankuai.waimai.business.order.api.submit.a
    public final void a(String str, Uri uri) {
        Object[] objArr = {str, uri};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "18c7eada28c2751a21eefccea6d0396a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "18c7eada28c2751a21eefccea6d0396a");
            return;
        }
        d(false);
        if ("MedicalInsurancePayFinish".equals(str)) {
            b(-1);
        }
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onAccountInfoUpdate(b.EnumC0948b enumC0948b) {
        Object[] objArr = {enumC0948b};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0efecea984ae9c6e2133e0640107aeea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0efecea984ae9c6e2133e0640107aeea");
        } else if (enumC0948b == b.EnumC0948b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_ORDER_DETAIL_PREORDER) {
            SubmitOrderManager.getInstance().preOrder((Activity) m(), "from_order_detail");
        }
    }

    @Override // com.sankuai.waimai.imbase.d
    public final void updateUnReadCount(@NonNull LongSparseArray<Integer> longSparseArray) {
        Object[] objArr = {longSparseArray};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8145d36e2775b7b0315bce2e278c5f61", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8145d36e2775b7b0315bce2e278c5f61");
            return;
        }
        ((d) F()).at.a((com.meituan.android.cube.pga.common.b<LongSparseArray<Integer>>) longSparseArray);
        HashMap hashMap = new HashMap();
        hashMap.put("group", Integer.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(longSparseArray.get(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(Long.valueOf(this.z.h.i))))));
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b a = ((d) F()).A.a();
        if (a != null && a.k != null && a.k.i != null && a.k.i.size() != 0) {
            for (RiderInfo.b bVar : a.k.i) {
                if (bVar != null && bVar.a == com.sankuai.waimai.bussiness.order.base.utils.i.c) {
                    hashMap.put("rider", Integer.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(longSparseArray.get(bVar.e))));
                }
            }
        }
        if (a != null && a.j != null && a.j.h != null && a.j.h.size() != 0) {
            for (b.a aVar : a.j.h) {
                if (aVar != null && aVar.a != com.sankuai.waimai.bussiness.order.base.utils.i.b && aVar.e != null) {
                    hashMap.put("poi", Integer.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(longSparseArray.get(aVar.e.b))));
                }
            }
        }
        this.aq = true;
        this.A.clear();
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b.putAll(hashMap);
        PrintStream printStream = System.out;
        printStream.println("receive unReadCount:" + hashMap);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.machcontainer.f.a().a("im_notification_response_event", hashMap);
    }

    public final void a(Intent intent) {
        String a;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb4eed2a32cb182d75fca6dcc76a5f07", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb4eed2a32cb182d75fca6dcc76a5f07");
            return;
        }
        d(intent);
        this.X = com.sankuai.waimai.platform.utils.f.a(intent, "is_auto_start_when_pay_result_ok", false);
        this.L = com.sankuai.waimai.platform.utils.f.a(intent, "is_sc_orderlist", this.L);
        this.Y = this.K;
        this.I = this.K ? "" : "1";
        try {
            if (com.sankuai.waimai.foundation.router.a.b(intent)) {
                a = com.sankuai.waimai.foundation.router.a.a(intent, "hash_id", (String) null);
            } else {
                a = com.sankuai.waimai.platform.utils.f.a(intent, "hash_id", (String) null);
            }
            if (!TextUtils.isEmpty(a)) {
                if (!a.equals(this.H)) {
                    this.R = false;
                }
                this.H = a;
            }
            this.Q = false;
            this.P = true;
            d(false);
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.e("OrderActivity-onNewIntent", e.getMessage(), new Object[0]);
        }
    }

    public final void a(int i, int i2, Intent intent) {
        Invoice a;
        boolean z;
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56a4a128002c6c04ee3aafd5dacaa332", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56a4a128002c6c04ee3aafd5dacaa332");
            return;
        }
        if (i == 112) {
            b(i2);
        }
        if (i == 2000 && intent != null) {
            Map<String, Object> a2 = com.sankuai.waimai.mach.utils.b.a(com.sankuai.waimai.platform.utils.f.a(intent, "extraData"));
            if (a2 != null) {
                String str = com.sankuai.waimai.platform.domain.manager.user.a.i().d() + "_aoi_addr_tip";
                String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(m(), str, (String) null);
                Map hashMap = new HashMap();
                if (!TextUtils.isEmpty(b)) {
                    hashMap = com.sankuai.waimai.mach.utils.b.a(b);
                }
                long a3 = r.a(String.valueOf(a2.get("aoi_address_id")), 0);
                if (r.a(String.valueOf(a2.get("aoi_address_type")), 0) > 0) {
                    ArrayList arrayList = hashMap.get("enter_address_ids") != null ? (ArrayList) hashMap.get("enter_address_ids") : new ArrayList();
                    if (!arrayList.contains(Long.valueOf(a3))) {
                        arrayList.add(Long.valueOf(a3));
                    }
                    hashMap.put("enter_address_ids", arrayList);
                    ArrayList arrayList2 = hashMap.get("not_enter_address_ids") != null ? (ArrayList) hashMap.get("not_enter_address_ids") : new ArrayList();
                    if (arrayList2.contains(Long.valueOf(a3))) {
                        arrayList2.remove(Long.valueOf(a3));
                    }
                    hashMap.put("not_enter_address_ids", arrayList2);
                    z = true;
                } else {
                    ArrayList arrayList3 = hashMap.get("not_enter_address_ids") != null ? (ArrayList) hashMap.get("not_enter_address_ids") : new ArrayList();
                    if (!arrayList3.contains(Long.valueOf(a3))) {
                        arrayList3.add(Long.valueOf(a3));
                    }
                    hashMap.put("not_enter_address_ids", arrayList3);
                    ArrayList arrayList4 = hashMap.get("enter_address_ids") != null ? (ArrayList) hashMap.get("enter_address_ids") : new ArrayList();
                    if (arrayList4.contains(Long.valueOf(a3))) {
                        arrayList4.remove(Long.valueOf(a3));
                    }
                    hashMap.put("enter_address_ids", arrayList4);
                    z = false;
                }
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(m(), str, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap));
                String str2 = com.sankuai.waimai.platform.domain.manager.user.a.i().d() + CommonConstant.Symbol.UNDERLINE + a3 + "_aoi_addr_tip";
                if (z) {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(m(), str2, 1L);
                } else {
                    com.sankuai.waimai.platform.capacity.persistent.sp.a.a(m(), str2);
                }
            }
            this.S = true;
            c(false);
        }
        if (i == this.D) {
            if (this.F != null) {
                HashMap hashMap2 = new HashMap();
                hashMap2.put("status", 0);
                HashMap hashMap3 = new HashMap(2);
                hashMap2.put("data", hashMap3);
                hashMap3.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, Integer.valueOf(i));
                hashMap3.put(Constant.KEY_RESULT_CODE, Integer.valueOf(i2));
                this.F.a(this.E, com.sankuai.waimai.bussiness.order.detailnew.util.d.a().toJson(hashMap2));
            }
            this.F = null;
        }
        if (i == 23) {
            this.S = true;
            c(true);
        }
        if (i == 24) {
            this.S = true;
            final com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.b bVar = this.z.k;
            String str3 = this.H;
            Object[] objArr2 = {str3, intent};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.b.a;
            if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "e717441b410af2b2a49372e1e7b838ca", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "e717441b410af2b2a49372e1e7b838ca");
            } else if (intent != null && (a = bVar.a(intent)) != null) {
                final Dialog a4 = com.sankuai.waimai.platform.widget.dialog.a.a(bVar.c);
                com.sankuai.waimai.platform.capacity.network.retrofit.b.a(((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).submitExtraOrderInfo(NumberUtils.parseLong(str3, 0L), 2, null, a.getTitle(), a.getInvoiceType(), a.getTaxpayerId(), 0, null), new b.AbstractC1042b<BaseResponse>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.b.2
                    public static ChangeQuickRedirect a;

                    @Override // rx.e
                    public final /* synthetic */ void onNext(Object obj) {
                        BaseResponse baseResponse = (BaseResponse) obj;
                        Object[] objArr3 = {baseResponse};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "a9016256bb733f7fb57daee4d1dd656d", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "a9016256bb733f7fb57daee4d1dd656d");
                            return;
                        }
                        com.sankuai.waimai.platform.widget.dialog.a.b(a4);
                        if (baseResponse != null) {
                            if (baseResponse.code != 0) {
                                ae.a((Activity) bVar.c, baseResponse.msg);
                                return;
                            } else if (bVar.b != null) {
                                bVar.b.c(true);
                                return;
                            } else {
                                return;
                            }
                        }
                        ae.a((Activity) bVar.c, bVar.c.getResources().getString(R.string.wm_order_detail_modify_order_info_edit_error_default));
                    }

                    @Override // rx.e
                    public final void onError(Throwable th) {
                        Object[] objArr3 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = a;
                        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "ce46d5dc04160aa2c6b313219cf45876", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "ce46d5dc04160aa2c6b313219cf45876");
                            return;
                        }
                        com.sankuai.waimai.platform.widget.dialog.a.b(a4);
                        ae.a((Activity) bVar.c, bVar.c.getResources().getString(R.string.wm_order_detail_modify_order_info_edit_error_default));
                    }
                }, bVar.a());
            }
        }
        if (i == 2040 && i2 == -1) {
            this.S = true;
        }
        if (i == 311 && i2 == -1) {
            SubmitOrderManager.getInstance().preOrder((Activity) m(), "from_order_detail");
        }
        if (i == 400 && i2 == -1) {
            this.S = true;
            c(false);
        }
        if (i == 25 && i2 == -1) {
            this.S = true;
            c(true);
        }
    }

    private void b(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "490386dd0ee97e5827cfd6a7062b763f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "490386dd0ee97e5827cfd6a7062b763f");
        } else if (M()) {
        } else {
            String a = ((d) F()).O.a().a();
            if (TextUtils.isEmpty(a)) {
                com.sankuai.waimai.bussiness.order.base.utils.i.a(m(), this.H, true, i);
            } else {
                OrderPayResultManager.handleResult((Activity) m(), i, this.H, com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((d) F()).D.a()), a, new com.sankuai.waimai.business.order.api.pay.f() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.26
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.business.order.api.pay.f
                    public final void a(Activity activity, String str, String str2) {
                        Object[] objArr2 = {activity, str, str2};
                        ChangeQuickRedirect changeQuickRedirect2 = a;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "073281cb0365d9e3e0b3f2d987d160f1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "073281cb0365d9e3e0b3f2d987d160f1");
                            return;
                        }
                        if (!aa.a(str2) && !str2.contains("mach_pro_waimai_order_middle")) {
                            com.sankuai.waimai.foundation.router.a.a(activity, str2);
                        } else {
                            com.sankuai.waimai.bussiness.order.base.utils.i.a((Context) activity, str, true, i);
                        }
                        com.sankuai.waimai.platform.domain.manager.location.a.b(activity);
                    }
                });
            }
        }
    }

    private void P() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ccb72a50dbc64042a3506fde1f8c36f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ccb72a50dbc64042a3506fde1f8c36f");
            return;
        }
        JudasManualManager.a("b_X7249").a("order_id", this.H).a("c_hgowsqb").a(m()).a();
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b a = ((d) F()).A.a();
        if ((this.K || this.M) && !this.L && !R()) {
            Bundle bundle = new Bundle();
            bundle.putInt("fragment_id", 3);
            if (a != null && a.l != null) {
                bundle.putInt("order_status", a.l.e);
                bundle.putInt("order_pay_status", a.l.f);
                bundle.putInt("order_delivery_status", a.l.g);
                bundle.putInt("position", this.N);
                bundle.putString("order_id", this.H);
            }
            bundle.putInt("ordertype", this.O);
            com.sankuai.waimai.foundation.router.a.a(m(), com.sankuai.waimai.foundation.router.interfaces.c.B, bundle);
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.a aVar = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.a();
        aVar.a = this.H;
        if (a != null) {
            aVar.a = a.b;
            aVar.b = a.l;
        }
        com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(aVar);
    }

    private boolean Q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e21292de5ac746d0abb0eb66c1eae92b", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e21292de5ac746d0abb0eb66c1eae92b")).booleanValue();
        }
        try {
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar = this.w.c.c;
            Object[] objArr2 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b.a;
            return PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "5eb8dc2a4887eb208ccf4e9c477cf14d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "5eb8dc2a4887eb208ccf4e9c477cf14d")).booleanValue() : TextUtils.equals(bVar.t, "shangou");
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean R() {
        IOrderBusinessService iOrderBusinessService;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8afcdab1971cbed8cc132d2df6a31dc3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8afcdab1971cbed8cc132d2df6a31dc3")).booleanValue();
        }
        if (Q() && (iOrderBusinessService = (IOrderBusinessService) com.sankuai.waimai.router.a.a(IOrderBusinessService.class, IOrderBusinessService.KEY_STORE_BUSINESS)) != null) {
            return iOrderBusinessService.backIntercept(l());
        }
        return false;
    }

    private rx.d<OrderBaseRocksResponse<Map<String, Object>>> S() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ed621fd05ff79c732d90bad5fd1a4367", RobustBitConfig.DEFAULT_VALUE) ? (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ed621fd05ff79c732d90bad5fd1a4367") : this.G.getOrderDetailRocks(this.H).b(rx.schedulers.a.e());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public rx.d<BaseResponse<OrderRocksServerModel>> T() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b669a6f890c926fadc5271de6a1222", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b669a6f890c926fadc5271de6a1222");
        }
        String b = com.sankuai.waimai.platform.capacity.persistent.sp.a.b(com.meituan.android.singleton.b.a, com.sankuai.waimai.platform.domain.manager.user.a.i().d() + "_aoi_addr_tip", (String) null);
        OrderApi orderApi = this.G;
        String str = this.H;
        String str2 = this.I;
        Object[] objArr2 = {(byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "baed747df4b5f0e373db0ee2ac2030d3", RobustBitConfig.DEFAULT_VALUE)) {
            i = ((Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "baed747df4b5f0e373db0ee2ac2030d3")).intValue();
        } else {
            i = com.sankuai.waimai.platform.utils.i.a(m()) ? 1 : 2;
        }
        return orderApi.getOrderStatusInfoRocks(str, str2, i, b).b(rx.schedulers.a.e());
    }

    private void d(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e36df1649e55e670fee266c26d99d361", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e36df1649e55e670fee266c26d99d361");
            return;
        }
        this.J = false;
        if (this.H == null || M() || O()) {
            return;
        }
        if (!this.R) {
            b(this.P, z);
            return;
        }
        if (z) {
            ((l) this.g).e();
        }
        a(this.J, false);
    }

    private void a(final boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6a3c33e55f7677dce62c33c8e61e82e7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6a3c33e55f7677dce62c33c8e61e82e7");
        } else if (this.u) {
        } else {
            a(this.aa);
            this.aa = rx.d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<OrderRocksServerModel>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.27
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(OrderRocksServerModel orderRocksServerModel) {
                    OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                    Object[] objArr2 = {orderRocksServerModel2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2ccd8da36189ba002f147f2d79448478", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2ccd8da36189ba002f147f2d79448478");
                        return;
                    }
                    f.this.u = false;
                    f.this.ac.b((android.arch.lifecycle.k) orderRocksServerModel2);
                    if (f.this.U) {
                        ((l) f.this.g).f();
                        f.this.a(f.this.aa);
                        return;
                    }
                    com.sankuai.waimai.platform.mach.monitor.d.a(1, 1, "order_status", z ? "order/refreshstatus" : "order/status");
                }

                @Override // rx.j
                public final void onStart() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "081e49d82b5d36c86bbbe15d2a70433e", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "081e49d82b5d36c86bbbe15d2a70433e");
                        return;
                    }
                    super.onStart();
                    com.sankuai.waimai.platform.mach.monitor.d.a(f.this.J ? "order/refreshstatus" : "order/status", "order_status");
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "1677fe3b688e91d02faf4519b6d2e289", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "1677fe3b688e91d02faf4519b6d2e289");
                        return;
                    }
                    f.this.u = false;
                    if (f.this.U) {
                        f.this.a(f.this.aa);
                    }
                    ((l) f.this.g).f();
                    String a2 = f.a(f.this, aVar, "order_status_refresh_occur_apiException");
                    com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_detail_page_error").b(com.sankuai.waimai.platform.widget.emptylayout.c.a(aVar)).c(a2).d(a2).b());
                    ((l) f.this.g).a(aVar, f.this.V());
                }
            }, rx.d.a(z2 ? this.ah : 0L, this.ah, TimeUnit.SECONDS).i(new rx.functions.g<Long, Boolean>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.30
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ Boolean call(Long l) {
                    Long l2 = l;
                    Object[] objArr2 = {l2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "58321d9d30cbb3d377df457aba39a524", RobustBitConfig.DEFAULT_VALUE)) {
                        return (Boolean) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "58321d9d30cbb3d377df457aba39a524");
                    }
                    return Boolean.valueOf(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(l2) < 100);
                }
            }).c(new rx.functions.g<Long, rx.d<BaseResponse<OrderRocksServerModel>>>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.29
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ rx.d<BaseResponse<OrderRocksServerModel>> call(Long l) {
                    Object[] objArr2 = {l};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d64fc2cc2ee0f285955a9c68c74f51d5", RobustBitConfig.DEFAULT_VALUE)) {
                        return (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d64fc2cc2ee0f285955a9c68c74f51d5");
                    }
                    f.this.u = true;
                    return f.this.T();
                }
            }).c(new rx.functions.g<BaseResponse<OrderRocksServerModel>, rx.d<OrderRocksServerModel>>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.28
                public static ChangeQuickRedirect a;

                /* JADX INFO: Access modifiers changed from: private */
                @Override // rx.functions.g
                /* renamed from: a */
                public rx.d<OrderRocksServerModel> call(BaseResponse<OrderRocksServerModel> baseResponse) {
                    Object[] objArr2 = {baseResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8833ba82c039171b90d8143972c4636a", RobustBitConfig.DEFAULT_VALUE)) {
                        return (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8833ba82c039171b90d8143972c4636a");
                    }
                    if (!baseResponse.isSuccess()) {
                        throw new com.sankuai.waimai.platform.modular.network.error.a(baseResponse.code, baseResponse.msg);
                    }
                    if (baseResponse.data.moduleList != null && !baseResponse.data.moduleList.isEmpty()) {
                        if (f.this.w != null) {
                            f.this.w.c = baseResponse.data;
                            f.this.w.c();
                            return rx.d.a(f.this.w.c);
                        }
                        throw new com.sankuai.waimai.platform.modular.network.error.a(0, "系统异常，请退出重试");
                    }
                    throw new com.sankuai.waimai.platform.modular.network.error.a(0, "数据异常，请点击重试");
                }
            }).a(rx.android.schedulers.a.a()));
        }
    }

    private void U() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "484a2c3b30dcdb39aadbe3aac4d4712f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "484a2c3b30dcdb39aadbe3aac4d4712f");
            return;
        }
        this.V = true;
        a(this.ab);
        this.ab = rx.d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<n>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.31
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final /* synthetic */ void a(n nVar) {
                n nVar2 = nVar;
                Object[] objArr2 = {nVar2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d310b3f80cd62fdacce919e8d2f6f5fe", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d310b3f80cd62fdacce919e8d2f6f5fe");
                    return;
                }
                f.c(f.this, false);
                ((d) f.this.F()).aC.a((com.meituan.android.cube.pga.common.j<n>) nVar2);
            }

            @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
            public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                Object[] objArr2 = {aVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9461b071c74ec4b538fb6550a7cf386e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9461b071c74ec4b538fb6550a7cf386e");
                    return;
                }
                f.c(f.this, false);
                n nVar = new n();
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = n.e;
                if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "df65c0f5fa59b5901ccfc7563d82a555", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "df65c0f5fa59b5901ccfc7563d82a555");
                } else {
                    nVar.renderMode = "native";
                    nVar.dataType = 0;
                    nVar.layoutType = Constants.EventInfoConsts.KEY_LX_INNER_DATAS_LIST;
                    nVar.layoutInfo = "{\"vertical_space\":8,\"padding_left\":12,\"padding_right\":12}";
                    nVar.viewType = JsBridgeResult.PROPERTY_GET_MEDIA_FRAME_FRAME;
                    HashMap hashMap = new HashMap();
                    hashMap.put("has_next_page", Boolean.FALSE);
                    nVar.h = hashMap;
                }
                ((d) f.this.F()).aC.a((com.meituan.android.cube.pga.common.j<n>) nVar);
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_feed_flow_view").b(com.sankuai.waimai.platform.widget.emptylayout.c.a(aVar)).c(f.a(f.this, aVar, "order_status_feed_flow_request_exception")).b());
            }
        }, this.G.getOrderStatusFeedFlowInfo(this.H, com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((d) F()).D.a()), "c_hgowsqb", 20, 0).b(rx.schedulers.a.e()).c(new rx.functions.g<BaseResponse<n>, rx.d<n>>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.32
            public static ChangeQuickRedirect a;

            @Override // rx.functions.g
            public final /* synthetic */ rx.d<n> call(BaseResponse<n> baseResponse) {
                BaseResponse<n> baseResponse2 = baseResponse;
                Object[] objArr2 = {baseResponse2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a02d1b846935a9c7981c6e8583d132cf", RobustBitConfig.DEFAULT_VALUE)) {
                    return (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a02d1b846935a9c7981c6e8583d132cf");
                }
                if (!baseResponse2.isSuccess()) {
                    throw new com.sankuai.waimai.platform.modular.network.error.a(baseResponse2.code, baseResponse2.msg);
                }
                if (baseResponse2.data.moduleList != null && !baseResponse2.data.moduleList.isEmpty()) {
                    if (f.this.w == null) {
                        throw new com.sankuai.waimai.platform.modular.network.error.a(0, "系统异常，请退出重试");
                    }
                    n nVar = baseResponse2.data;
                    f.a(f.this, nVar);
                    nVar.f = f.this.w.c.f;
                    nVar.a(nVar.moduleList);
                    return rx.d.a(nVar);
                }
                throw new com.sankuai.waimai.platform.modular.network.error.a(0, "数据异常，请点击重试");
            }
        }).a(rx.android.schedulers.a.a()));
    }

    private void b(boolean z, boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "10e96cffffe7146b052d2d19d5a4e882", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "10e96cffffe7146b052d2d19d5a4e882");
            return;
        }
        if (z && this.aa != null && !this.aa.isUnsubscribed()) {
            this.aa.unsubscribe();
        }
        com.sankuai.waimai.platform.preload.e.a().a(l(), h.a(this, z2));
    }

    public static /* synthetic */ void a(f fVar, boolean z, com.sankuai.waimai.platform.preload.f fVar2) {
        Object[] objArr = {fVar, Byte.valueOf(z ? (byte) 1 : (byte) 0), fVar2};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "20611842a5bb48696f926265ce728451", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "20611842a5bb48696f926265ce728451");
        } else if (com.sankuai.waimai.foundation.utils.f.a(fVar.l())) {
        } else {
            switch (fVar2.b) {
                case UNKNOWN:
                    fVar.e(z);
                    return;
                case LOADING:
                    l lVar = (l) fVar.g;
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = l.d;
                    if (PatchProxy.isSupport(objArr2, lVar, changeQuickRedirect2, false, "13d5b0fd6fe6dd058b9dbfa6ceff7afe", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, lVar, changeQuickRedirect2, false, "13d5b0fd6fe6dd058b9dbfa6ceff7afe");
                    } else {
                        lVar.a(false);
                    }
                    fVar.ad = true;
                    if (fVar.ae != null) {
                        fVar.ae.recordStep("wait_preload_start");
                        return;
                    }
                    return;
                case SUCCESS:
                    o oVar = (o) fVar2.c;
                    if (oVar == null) {
                        ((l) fVar.g).a(new com.sankuai.waimai.platform.modular.network.error.a(0, "预加载异常，请重试"), fVar.V());
                        return;
                    }
                    fVar.w = oVar;
                    if (fVar.w.b()) {
                        if (fVar.ae != null) {
                            fVar.ae.disable();
                        }
                        ((l) fVar.g).a(new com.sankuai.waimai.platform.modular.network.error.a(oVar.e, oVar.d), fVar.V());
                        return;
                    }
                    if (!fVar.ad) {
                        fVar.ae.recordStep("hit_preload");
                    } else {
                        fVar.ae.recordStep("wait_preload_end");
                    }
                    fVar.a(fVar.w.c);
                    return;
                default:
                    return;
            }
        }
    }

    private void e(final boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ac91b3e601143b2f0c712f56090244ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ac91b3e601143b2f0c712f56090244ba");
        } else if (TextUtils.isEmpty(this.H) || M() || O()) {
        } else {
            a(this.Z);
            this.Z = rx.d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<OrderRocksServerModel>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.33
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(OrderRocksServerModel orderRocksServerModel) {
                    OrderRocksServerModel orderRocksServerModel2 = orderRocksServerModel;
                    Object[] objArr2 = {orderRocksServerModel2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f02a5b510daec57443b8be8e1e5ce8a5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f02a5b510daec57443b8be8e1e5ce8a5");
                        return;
                    }
                    if (f.this.ae != null) {
                        f.this.ae.recordStep("mergeResult()");
                    }
                    f.this.a(orderRocksServerModel2);
                    com.sankuai.waimai.platform.mach.monitor.d.a(1, 1, "order_status", "order/status");
                }

                @Override // rx.j
                public final void onStart() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0f422d8d0d495edd2c313dce82c2d0b2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0f422d8d0d495edd2c313dce82c2d0b2");
                        return;
                    }
                    super.onStart();
                    if (z) {
                        ((l) f.this.g).a(f.this.V());
                    }
                    if (f.this.ae != null) {
                        f.this.ae.recordStep("page_api_start");
                    }
                    com.sankuai.waimai.platform.mach.monitor.d.a("order/status", "order_status");
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "2542582c80792e41d89902ad88616162", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "2542582c80792e41d89902ad88616162");
                        return;
                    }
                    ((l) f.this.g).a(aVar, f.this.V());
                    if (f.this.ae != null) {
                        f.this.ae.disable();
                    }
                }
            }, rx.d.b(S(), T(), i.a(this)).d(new rx.functions.g<o, OrderRocksServerModel>() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.35
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ OrderRocksServerModel call(o oVar) {
                    o oVar2 = oVar;
                    Object[] objArr2 = {oVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "19a700a134c77b64fdc24747933a1fd3", RobustBitConfig.DEFAULT_VALUE)) {
                        return (OrderRocksServerModel) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "19a700a134c77b64fdc24747933a1fd3");
                    }
                    f.this.w = oVar2;
                    return oVar2.c;
                }
            }).a(rx.android.schedulers.a.a()));
        }
    }

    public static /* synthetic */ o a(f fVar, OrderBaseRocksResponse orderBaseRocksResponse, BaseResponse baseResponse) {
        Object[] objArr = {fVar, orderBaseRocksResponse, baseResponse};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "46619a554c2cb76cdbc465d746b3e392", RobustBitConfig.DEFAULT_VALUE)) {
            return (o) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "46619a554c2cb76cdbc465d746b3e392");
        }
        if (fVar.ae != null) {
            fVar.ae.recordStep("page_api_end");
        }
        if (!orderBaseRocksResponse.isSuccess()) {
            throw new com.sankuai.waimai.platform.modular.network.error.a(orderBaseRocksResponse.code, orderBaseRocksResponse.msg);
        }
        if (!baseResponse.isSuccess()) {
            a.AbstractC1040a a = new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_rocks_view");
            StringBuilder sb = new StringBuilder();
            sb.append(baseResponse.code);
            a.AbstractC1040a b = a.b(sb.toString());
            com.sankuai.waimai.platform.capacity.log.i.d(b.c("订单状态页面加载失败, " + baseResponse.msg).b(true).b());
            throw new com.sankuai.waimai.platform.modular.network.error.a(baseResponse.code, baseResponse.msg);
        }
        return new o((Map) orderBaseRocksResponse.data, (OrderRocksServerModel) baseResponse.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean V() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "62be255776623e7c2a14994a1a3cc01d", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "62be255776623e7c2a14994a1a3cc01d")).booleanValue() : (this.w == null || this.w.b()) ? false : true;
    }

    private void c(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7bd7aa8636f5ea29c742913f54995511", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7bd7aa8636f5ea29c742913f54995511");
        } else {
            this.W = OrderFollowAreaInfo.convert(orderRocksServerModel, this.Y);
        }
    }

    public void a(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08b11769575b7164f13eaf13aad07c0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08b11769575b7164f13eaf13aad07c0e");
            return;
        }
        this.R = true;
        this.ar = this.w.a();
        this.ap.b();
        g(orderRocksServerModel);
        if (orderRocksServerModel.b() && !this.V && ((d) F()).aC.a() == null) {
            ((d) F()).aE.a((com.meituan.android.cube.pga.common.j<Integer>) Integer.valueOf(orderRocksServerModel.c()));
            U();
        }
        c(orderRocksServerModel);
        c((Object) orderRocksServerModel);
        d(orderRocksServerModel);
        this.J = true;
        a(true, true);
        W();
        X();
        Y();
        Z();
        aa();
        ab();
    }

    private void d(final OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa5ba78c1664e256d54d6ea1868f4367", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa5ba78c1664e256d54d6ea1868f4367");
            return;
        }
        e(orderRocksServerModel);
        this.y.a((RocksServerModel) orderRocksServerModel, false, false, new a.c() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.36
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
            }

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "8971af7e6362c6790b0fbfebf9585361", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "8971af7e6362c6790b0fbfebf9585361");
                    return;
                }
                if (f.this.ae != null) {
                    f.this.ae.recordStep("page_render_end");
                }
                f.x(f.this);
                ((d) f.this.F()).af.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
                final b bVar = f.this.af;
                OrderFollowAreaInfo orderFollowAreaInfo = f.this.W;
                boolean z = f.this.X;
                Object[] objArr3 = {orderFollowAreaInfo, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
                ChangeQuickRedirect changeQuickRedirect3 = b.a;
                if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "89b3ee1e69e3ee0d718c0f93faea1c52", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "89b3ee1e69e3ee0d718c0f93faea1c52");
                } else {
                    bVar.D = orderFollowAreaInfo;
                    bVar.C = z;
                    if (orderFollowAreaInfo != null) {
                        bVar.t = orderFollowAreaInfo.canShareEnvelope();
                    }
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = b.a;
                    if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "798c9c3570fcb595d6827dc9673568f2", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "798c9c3570fcb595d6827dc9673568f2");
                    } else if (bVar.f != null && bVar.D != null && bVar.D.orderStatusDesc != null) {
                        com.sankuai.waimai.bussiness.order.detailnew.network.response.n nVar = bVar.D.orderStatusDesc;
                        if (!TextUtils.isEmpty(nVar.b)) {
                            Object[] objArr5 = {nVar};
                            ChangeQuickRedirect changeQuickRedirect5 = b.a;
                            if (PatchProxy.isSupport(objArr5, bVar, changeQuickRedirect5, false, "de3a3c6753a1e3591f42408a7b64194f", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr5, bVar, changeQuickRedirect5, false, "de3a3c6753a1e3591f42408a7b64194f");
                            } else if (nVar.d != null) {
                                if (nVar.b.contains("<time>")) {
                                    bVar.f.setText(com.sankuai.waimai.bussiness.order.detailnew.util.e.a(nVar.b, "#FF8000", ""));
                                } else {
                                    bVar.f.setText(com.sankuai.waimai.bussiness.order.detailnew.util.e.a(nVar.b, "#FF8000"));
                                    bVar.c();
                                }
                                if (nVar.d.a == 1) {
                                    bVar.c();
                                    if (nVar.d.c > 0) {
                                        bVar.z = new com.sankuai.waimai.platform.utils.time.a(1000 * nVar.d.c, 1000L, nVar) { // from class: com.sankuai.waimai.bussiness.order.rocks.b.12
                                            public static ChangeQuickRedirect a;
                                            public final /* synthetic */ com.sankuai.waimai.bussiness.order.detailnew.network.response.n b;

                                            {
                                                this.b = nVar;
                                            }

                                            @Override // com.sankuai.waimai.platform.utils.time.a
                                            public final void a(long j) {
                                                Object[] objArr6 = {new Long(j)};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "4f42af7095b2b8935e201a00f28a1e8d", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "4f42af7095b2b8935e201a00f28a1e8d");
                                                    return;
                                                }
                                                long j2 = j / 1000;
                                                String a2 = com.sankuai.waimai.platform.utils.time.b.a(j2);
                                                b.this.f.setText(com.sankuai.waimai.bussiness.order.detailnew.util.e.a(this.b.b, "#FF8000", a2));
                                                if (b.this.a()) {
                                                    return;
                                                }
                                                com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.event.a(a2, com.sankuai.waimai.bussiness.order.detailnew.event.a.a, j2));
                                            }

                                            @Override // com.sankuai.waimai.platform.utils.time.a
                                            public final void a() {
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "eed6d476a7ea6f826b4bd79c8a1b4911", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "eed6d476a7ea6f826b4bd79c8a1b4911");
                                                    return;
                                                }
                                                com.sankuai.waimai.platform.capacity.network.rxsupport.a.a().a(new com.sankuai.waimai.bussiness.order.detailnew.event.a(com.sankuai.waimai.platform.utils.time.b.a(0L), com.sankuai.waimai.bussiness.order.detailnew.event.a.a));
                                                if (b.this.E != null) {
                                                    b.this.E.b(false);
                                                }
                                            }
                                        };
                                        bVar.z.b();
                                    }
                                }
                            } else {
                                bVar.f.setText(com.sankuai.waimai.bussiness.order.detailnew.util.e.a(nVar.b, "#FF8000"));
                                bVar.c();
                            }
                            Drawable drawable = bVar.i.getResources().getDrawable(R.drawable.wm_order_detail_ic_arrow_biggest);
                            drawable.setBounds(0, 0, com.sankuai.waimai.foundation.utils.g.a(bVar.i, 9.0f), com.sankuai.waimai.foundation.utils.g.a(bVar.i, 21.0f));
                            bVar.f.setCompoundDrawables(null, null, drawable, null);
                            bVar.f.setCompoundDrawablePadding(com.sankuai.waimai.foundation.utils.g.a(bVar.i, 8.0f));
                        } else {
                            bVar.f.setText("");
                            bVar.f.setCompoundDrawables(null, null, null, null);
                        }
                        bVar.f.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.11
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr6 = {view};
                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "cb17bd12f4f0486f8ca71b8ec482ff42", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "cb17bd12f4f0486f8ca71b8ec482ff42");
                                } else if (bVar.D != null) {
                                    bVar.w.a(bVar.D.orderId, bVar.D.orderStatus, bVar.D.statusCode);
                                }
                            }
                        });
                    }
                    boolean z2 = bVar.t;
                    Object[] objArr6 = {Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect6 = b.a;
                    if (PatchProxy.isSupport(objArr6, bVar, changeQuickRedirect6, false, "6f6b806eefe9ec4569e0422d4d932890", RobustBitConfig.DEFAULT_VALUE)) {
                        ((Boolean) PatchProxy.accessDispatch(objArr6, bVar, changeQuickRedirect6, false, "6f6b806eefe9ec4569e0422d4d932890")).booleanValue();
                    } else {
                        boolean a2 = com.sankuai.waimai.bussiness.order.detailnew.util.a.a(bVar.b.z.a().b);
                        if (bVar.h != null) {
                            if (!z2 && !a2) {
                                bVar.h.setVisibility(8);
                                bVar.b.as.a();
                            } else {
                                bVar.h.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.sankuai.waimai.bussiness.order.rocks.b.10
                                    public static ChangeQuickRedirect a;

                                    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
                                    public final void onGlobalLayout() {
                                        int i;
                                        Object[] objArr7 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect7 = a;
                                        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f9b6082f6af11d0de10887936f98dbe6", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f9b6082f6af11d0de10887936f98dbe6");
                                        } else if (bVar.h.getDrawable() == null || bVar.h.getDrawable().getIntrinsicHeight() <= 0) {
                                        } else {
                                            bVar.h.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                                            bVar.j = bVar.h.getDrawable().getIntrinsicWidth();
                                            bVar.k = bVar.h.getDrawable().getIntrinsicHeight();
                                            bVar.b.av.a((com.meituan.android.cube.pga.common.b<Integer>) Integer.valueOf(bVar.q - bVar.k));
                                            bVar.m = (bVar.l * bVar.k) / bVar.j;
                                            bVar.n = (bVar.q - bVar.p) - bVar.k;
                                            b bVar2 = bVar;
                                            b bVar3 = bVar;
                                            Object[] objArr8 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect8 = b.a;
                                            if (PatchProxy.isSupport(objArr8, bVar3, changeQuickRedirect8, false, "490927a6cd1a23ee72e6e34fbaf981e2", RobustBitConfig.DEFAULT_VALUE)) {
                                                i = ((Integer) PatchProxy.accessDispatch(objArr8, bVar3, changeQuickRedirect8, false, "490927a6cd1a23ee72e6e34fbaf981e2")).intValue();
                                            } else {
                                                i = (bVar3.s - bVar3.m) / 2;
                                                if (b.b()) {
                                                    i += com.sankuai.waimai.foundation.utils.g.e(com.meituan.android.singleton.b.a);
                                                }
                                            }
                                            bVar2.o = i;
                                            if (bVar.h != null) {
                                                if (bVar.u) {
                                                    if (bVar.e != null && bVar.e.b()) {
                                                        bVar.a(bVar.h, bVar.n);
                                                    } else {
                                                        bVar.a(bVar.y, false);
                                                    }
                                                } else {
                                                    bVar.a(1.0f, false);
                                                }
                                                bVar.h.setVisibility(0);
                                            }
                                        }
                                    }
                                });
                            }
                        }
                    }
                    if (!bVar.v) {
                        bVar.d();
                    }
                }
                f.this.z.a(orderRocksServerModel);
                l lVar = (l) f.this.g;
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = l.d;
                if (PatchProxy.isSupport(objArr7, lVar, changeQuickRedirect7, false, "02d46f958476650b480b870d34d6cc83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, lVar, changeQuickRedirect7, false, "02d46f958476650b480b870d34d6cc83");
                } else {
                    if (lVar.e.c()) {
                        lVar.e.a();
                    }
                    com.sankuai.waimai.platform.widget.dialog.a.b(lVar.f);
                }
                final f fVar = f.this;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = f.r;
                if (PatchProxy.isSupport(objArr8, fVar, changeQuickRedirect8, false, "013958619d8ca50e3f44d044a05ade91", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, fVar, changeQuickRedirect8, false, "013958619d8ca50e3f44d044a05ade91");
                } else if (!fVar.t) {
                    fVar.i().postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.38
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "f06228884b84a0752a1d962ab28dca41", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "f06228884b84a0752a1d962ab28dca41");
                                return;
                            }
                            f.d(f.this, true);
                            f.this.am.aq_();
                        }
                    }, 300L);
                }
                f.c(f.this, orderRocksServerModel);
            }

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "45f28143883b385fb3ec66898b1bee76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "45f28143883b385fb3ec66898b1bee76");
                    return;
                }
                ((l) f.this.g).a(new com.sankuai.waimai.platform.modular.network.error.a("页面渲染失败，请重试"), false);
                if (f.this.ae != null) {
                    f.this.ae.disable();
                }
                com.sankuai.waimai.platform.capacity.log.i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_rocks_view").b("99").c("订单状态页面加载失败_页面渲染失败").b(true).b());
            }
        });
    }

    private void e(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a31574aad3f9c48f12261d16cc33e6ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a31574aad3f9c48f12261d16cc33e6ed");
            return;
        }
        RecyclerView.a adapter = this.y.d.g.getAdapter();
        if (orderRocksServerModel.f()) {
            this.at.c(orderRocksServerModel);
            if (adapter instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
                ((com.sankuai.waimai.rocks.view.recyclerview.a) adapter).f = this.at;
            }
        } else if (adapter instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
            ((com.sankuai.waimai.rocks.view.recyclerview.a) adapter).f = null;
        }
        if (this.C == null) {
            this.C = new com.sankuai.waimai.bussiness.order.detailnew.widget.c(m());
        }
        f(orderRocksServerModel);
        if (this.B) {
            return;
        }
        this.y.d.g.addItemDecoration(this.C);
        this.B = true;
    }

    private void f(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c9859aaff4c9bfed4fed71042c59fedf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c9859aaff4c9bfed4fed71042c59fedf");
            return;
        }
        boolean f = orderRocksServerModel.f();
        this.C.b = f;
        if (f) {
            Map map = (Map) orderRocksServerModel.b("wm_order_status_abnormal_remind").get("prompt_info");
            if (map != null) {
                String valueOf = String.valueOf(map.get("bg_color"));
                String valueOf2 = String.valueOf(map.get("weather_pic"));
                Integer a = ColorUtils.a(valueOf);
                if (a != null) {
                    this.C.a(a.intValue());
                } else {
                    this.C.d = null;
                }
                if (!aa.a(valueOf2)) {
                    b.C0608b a2 = com.sankuai.waimai.platform.capacity.imageloader.a.a();
                    a2.b = m();
                    a2.e = 0;
                    a2.c = valueOf2;
                    a2.a(new b.a() { // from class: com.sankuai.waimai.bussiness.order.rocks.f.37
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a(Bitmap bitmap) {
                            Object[] objArr2 = {bitmap};
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d3e086de38d89646466e88dbb2204d1e", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d3e086de38d89646466e88dbb2204d1e");
                            } else if (bitmap != null) {
                                com.sankuai.waimai.bussiness.order.detailnew.widget.c cVar = f.this.C;
                                Object[] objArr3 = {bitmap};
                                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.widget.c.a;
                                if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "e8789f738f6ca15d9933a9c11ba9487c", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "e8789f738f6ca15d9933a9c11ba9487c");
                                } else if (bitmap == null) {
                                    cVar.a();
                                } else {
                                    cVar.e = bitmap;
                                    int width = cVar.e.getWidth();
                                    int height = cVar.e.getHeight();
                                    cVar.g = height;
                                    cVar.h = cVar.g / 2;
                                    if (width <= cVar.c) {
                                        int i = (cVar.c - width) / 2;
                                        cVar.f = new Rect(i, 0, width + i, height);
                                        return;
                                    }
                                    cVar.f = new Rect(0, 0, cVar.c, height);
                                }
                            } else {
                                f.this.C.a();
                            }
                        }

                        @Override // com.sankuai.meituan.mtimageloader.config.b.a
                        public final void a() {
                            Object[] objArr2 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect2 = a;
                            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a0c904383d1cb9f61c5dac011b7129bd", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a0c904383d1cb9f61c5dac011b7129bd");
                            } else {
                                f.this.C.a();
                            }
                        }
                    });
                    return;
                }
                this.C.a();
                return;
            }
            return;
        }
        this.C.d = null;
        this.C.a();
    }

    private void g(OrderRocksServerModel orderRocksServerModel) {
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1f4244be755b6b2790e2e2a792faec6e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1f4244be755b6b2790e2e2a792faec6e");
            return;
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar = orderRocksServerModel.c;
        ((d) F()).A.b((android.arch.lifecycle.k<com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b>) bVar);
        ((d) F()).C.b((android.arch.lifecycle.k<String>) bVar.b);
        ((d) F()).D.b((android.arch.lifecycle.k<Long>) Long.valueOf(bVar.c));
        ((d) F()).E.b((android.arch.lifecycle.k<String>) bVar.d);
        ((d) F()).F.b((android.arch.lifecycle.k<String>) bVar.e);
        ((d) F()).G.b((android.arch.lifecycle.k<Integer>) Integer.valueOf(bVar.g));
        ((d) F()).H.b((android.arch.lifecycle.k<Integer>) Integer.valueOf(bVar.h));
        ((d) F()).aB.b((android.arch.lifecycle.k<Integer>) Integer.valueOf(bVar.r));
        ((d) F()).Q.b((android.arch.lifecycle.k<Integer>) Integer.valueOf(bVar.s));
        ((d) F()).I.b((android.arch.lifecycle.k<List<ExpInfo>>) bVar.p);
        ((d) F()).L.b((android.arch.lifecycle.k<RiderInfo>) bVar.k);
        ((d) F()).K.b((android.arch.lifecycle.k<com.sankuai.waimai.business.order.api.detail.model.b>) bVar.j);
        ((d) F()).J.b((android.arch.lifecycle.k<com.sankuai.waimai.business.order.api.detail.model.a>) bVar.l);
        ((d) F()).M.b((android.arch.lifecycle.k<com.sankuai.waimai.bussiness.order.detailnew.network.response.n>) bVar.m);
        ((d) F()).P.b((android.arch.lifecycle.k<OrderExtInfo>) bVar.q);
        com.sankuai.waimai.bussiness.order.base.utils.i.a(bVar.k, bVar.j);
        a(bVar.b, bVar.c, bVar.d, bVar.l);
    }

    private void a(String str, long j, String str2, com.sankuai.waimai.business.order.api.detail.model.a aVar) {
        Object[] objArr = {str, new Long(j), str2, aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2b91f96ee0a68d4369ebf29e52ce6493", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2b91f96ee0a68d4369ebf29e52ce6493");
        } else if (aVar == null) {
        } else {
            String str3 = ((d) F()).Y.a().b;
            if (aVar.a()) {
                com.sankuai.waimai.bussiness.order.detailnew.util.j.a(l(), str, j, str2, str3);
            }
        }
    }

    private void W() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b7859039cfc6d26745eb94f7bda3b644", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b7859039cfc6d26745eb94f7bda3b644");
        } else if (this.Q) {
            com.sankuai.waimai.platform.domain.manager.bubble.a.a().b();
        }
    }

    private void X() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e3e127a80cf3a0ef8ccbd7062aadb4b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e3e127a80cf3a0ef8ccbd7062aadb4b");
        } else if (this.w == null || this.w.c == null || this.w.c.c == null) {
        } else {
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar = this.w.c.c;
            if (bVar.l == null) {
                return;
            }
            this.af.a(Integer.valueOf(bVar.l.G), com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((d) F()).ae.a().b));
        }
    }

    private void Y() {
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a90e6628980095a522e9979541303a7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a90e6628980095a522e9979541303a7b");
        } else if (this.aj || (bVar = this.w.c.c) == null || bVar.l == null) {
        } else {
            JudasManualManager.b("b_waimai_umsu77hf_mv").a("c_hgowsqb").a("order_id", this.H).a("order_status", bVar.l.e).a(m()).a();
            this.aj = true;
        }
    }

    private void Z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e94a5287426ead82f5365a0baab840f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e94a5287426ead82f5365a0baab840f");
        } else if (this.ai != null) {
            com.sankuai.waimai.platform.capacity.log.c.a().a(3001, "waimai_page_" + this.ai.expName + "_WMOrderDetailActivity", SystemClock.elapsedRealtime());
        }
    }

    private void aa() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90defcd6ffaa54168cabf6eda7a068e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90defcd6ffaa54168cabf6eda7a068e3");
        } else if (com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((d) F()).w.a().b)) {
        } else {
            com.sankuai.waimai.bussiness.order.detail.a.a(m(), N(), this.w.c.c);
        }
    }

    private void ab() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ad1477775a4a2026705b77277714d62", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ad1477775a4a2026705b77277714d62");
        } else if (com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((d) F()).w.a().b)) {
        } else {
            com.sankuai.waimai.bussiness.order.detail.a.b(m(), N(), this.w.c.c);
        }
    }

    @Override // android.arch.lifecycle.f
    @NonNull
    @NotNull
    public final android.arch.lifecycle.d getLifecycle() {
        return this.v;
    }

    @Override // com.sankuai.waimai.foundation.core.service.user.b
    public final void onChanged(b.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60b2fed8918c21855807fa8bc64861d0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60b2fed8918c21855807fa8bc64861d0");
        } else if (com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_ORDER_DETAIL_PREORDER) {
            SubmitOrderManager.getInstance().preOrder((Activity) m(), "from_order_detail");
        }
    }
}
