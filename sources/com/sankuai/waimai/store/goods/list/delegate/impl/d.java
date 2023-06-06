package com.sankuai.waimai.store.goods.list.delegate.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.Statistics;
import com.meituan.android.common.statistics.entity.EventInfo;
import com.meituan.android.common.statistics.entity.EventName;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.metrics.speedmeter.MetricsSpeedMeterTask;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.util.aop.h;
import com.sankuai.shangou.stone.util.p;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.restaurant.base.repository.preload.FoodDetailNetWorkPreLoader;
import com.sankuai.waimai.foundation.core.service.user.a;
import com.sankuai.waimai.foundation.location.v2.WMLocation;
import com.sankuai.waimai.platform.domain.core.goods.GoodsAttr;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.base.net.k;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.goods.list.model.AddCrossModel;
import com.sankuai.waimai.store.goods.list.model.AddCrossSkus;
import com.sankuai.waimai.store.goods.list.model.SuperSaleModel;
import com.sankuai.waimai.store.goods.list.utils.MultiFoodsHandler;
import com.sankuai.waimai.store.goods.list.utils.g;
import com.sankuai.waimai.store.goods.list.viewblocks.j;
import com.sankuai.waimai.store.i.user.a;
import com.sankuai.waimai.store.mrn.shopcartbridge.AddProdctResult;
import com.sankuai.waimai.store.newwidgets.FloatingWindowLayout;
import com.sankuai.waimai.store.newwidgets.NetInfoLoadView;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSku;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.goods.SpuProductsResponse;
import com.sankuai.waimai.store.platform.domain.core.order.OrderedFood;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.domain.core.shop.GetMenuResponse;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.poi.list.refactor.PoiNewTemplate4;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import com.sankuai.waimai.store.shopping.cart.delegate.SCShopCartDelegate;
import com.sankuai.waimai.store.util.aa;
import com.sankuai.waimai.store.util.ab;
import com.sankuai.waimai.store.util.al;
import com.sankuai.waimai.store.util.am;
import com.sankuai.waimai.store.util.i;
import com.sankuai.waimai.store.util.monitor.monitor.SupermarketPoiLocate;
import com.sankuai.waimai.store.util.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class d implements com.sankuai.waimai.store.goods.list.delegate.b, com.sankuai.waimai.store.goods.list.delegate.d {
    public static ChangeQuickRedirect b;
    NetInfoLoadView A;
    public SCShopCartDelegate B;
    public FloatingWindowLayout C;
    View D;
    com.sankuai.shangou.stone.whiteboard.e E;
    String F;
    protected AddCrossModel G;
    protected SuperSaleModel H;
    protected boolean I;
    @Nullable
    protected MetricsSpeedMeterTask J;
    private long K;
    private long L;
    private boolean M;
    private long N;
    private int O;
    private boolean P;
    private com.sankuai.waimai.store.goods.list.viewblocks.screenshot.a Q;
    private j R;
    private com.sankuai.waimai.store.consultation.a S;
    private Set<Long> T;
    private long U;
    private long V;
    private long W;
    private boolean X;
    private com.sankuai.waimai.store.i.poi.a Y;
    private long a;
    public long c;
    public String d;
    int e;
    protected int f;
    protected String g;
    public String h;
    public Map<String, Object> i;
    protected com.sankuai.waimai.store.manager.marketing.a j;
    long k;
    protected String l;
    protected String m;
    protected String n;
    protected String o;
    protected String p;
    protected String q;
    protected String r;
    public boolean s;
    public boolean t;
    public boolean u;
    boolean v;
    boolean w;
    @NonNull
    public com.sankuai.waimai.store.platform.domain.manager.poi.a x;
    @NonNull
    public SCBaseActivity y;
    public com.sankuai.waimai.store.goods.list.viewblocks.base.a z;

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final void a(long j) {
    }

    public boolean a(RestMenuResponse restMenuResponse, int i) {
        return false;
    }

    @Override // com.sankuai.waimai.store.base.a
    public void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "76ab5dc3d8d8f437b2798fbefd9bb349", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "76ab5dc3d8d8f437b2798fbefd9bb349");
        }
    }

    public abstract int p();

    public static /* synthetic */ void a(d dVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "bde0205118567bbcdb29e347d9198e2a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "bde0205118567bbcdb29e347d9198e2a");
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) dVar.y.w()).a(dVar.c, dVar.d, -1L, dVar.V, dVar.W, -1, (String) null, new k<Poi.PoiCouponItem>() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.10
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    Poi.PoiCouponItem poiCouponItem = (Poi.PoiCouponItem) obj;
                    Object[] objArr2 = {poiCouponItem};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "13b062074b162a84bda30f1844249faf", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "13b062074b162a84bda30f1844249faf");
                    } else if (p.a(poiCouponItem)) {
                    } else {
                        com.sankuai.waimai.store.manager.coupon.b.a().a(poiCouponItem);
                        com.sankuai.waimai.store.manager.coupon.c.a().a(poiCouponItem);
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0162f851d283e4c143a5cc847179802a", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0162f851d283e4c143a5cc847179802a");
                    } else {
                        super.a(bVar);
                    }
                }
            });
        }
    }

    public static /* synthetic */ void b(d dVar, RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, dVar, changeQuickRedirect, false, "05d968b919cd4d54168ea4e60ba84778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, dVar, changeQuickRedirect, false, "05d968b919cd4d54168ea4e60ba84778");
        } else if (restMenuResponse == null || restMenuResponse.getPoi() == null || dVar.t) {
        } else {
            dVar.t = true;
            boolean z = restMenuResponse.getPoi().getBuzType() == 9;
            dVar.y.s().recordStep(!z ? "activity_data_ready_sm_with_flash" : "activity_data_ready_sm_without_flash");
            dVar.y.s().recordStep("activity_data_ready_supermarket");
            long elapsedRealtime = SystemClock.elapsedRealtime() - dVar.U;
            if (z) {
                dVar.y.s().recordStep("activity_supermarket_drug_data_ready");
            } else {
                if (dVar.J != null) {
                    dVar.J.recordStep("activity_supermarket_store_data_ready");
                }
                dVar.y.s().recordStep("activity_supermarket_store_data_ready");
                if (w.c(restMenuResponse.getPoi())) {
                    dVar.y.s().recordStep("activity_supermarket_store_union_data_ready");
                } else if (w.e(restMenuResponse.getPoi())) {
                    dVar.y.s().recordStep("activity_supermarket_store_standard_data_ready");
                } else if (!w.d(restMenuResponse.getPoi())) {
                    if (a(restMenuResponse.getPoi())) {
                        dVar.y.s().recordStep("activity_supermarket_store_default_with_video_data_ready");
                    } else {
                        dVar.y.s().recordStep("activity_supermarket_store_default_data_ready");
                    }
                }
            }
            com.sankuai.waimai.store.manager.judas.b.b(dVar.y, "b_waimai_sg_472ca63s_mv").a("duration", Long.valueOf(elapsedRealtime)).a();
            if (dVar.J != null) {
                dVar.J.recordStep("page_api_end");
            }
        }
    }

    public d(@NonNull SCBaseActivity sCBaseActivity, int i) {
        Object[] objArr = {sCBaseActivity, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "893d8b905ffcd6686ce8ea05ca5a61fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "893d8b905ffcd6686ce8ea05ca5a61fc");
            return;
        }
        this.c = -1L;
        this.d = null;
        this.a = -1L;
        this.K = -1L;
        this.L = 0L;
        this.f = 0;
        this.i = new HashMap();
        this.s = false;
        this.t = false;
        this.v = false;
        this.w = false;
        this.P = true;
        this.E = new com.sankuai.shangou.stone.whiteboard.e();
        this.T = new HashSet();
        this.X = false;
        this.Y = new com.sankuai.waimai.store.i.poi.a() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.i.poi.a
            public final void a(String str, List<com.sankuai.waimai.platform.domain.core.order.a> list) {
                Object[] objArr2 = {str, list};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bd8a5eb09563a9323fa5d6f6df3db576", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bd8a5eb09563a9323fa5d6f6df3db576");
                } else {
                    com.sankuai.waimai.store.order.a.e().d(d.this.x.d(), list);
                }
            }

            @Override // com.sankuai.waimai.store.i.poi.a
            public final void c_(String str) {
                Object[] objArr2 = {str};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dc8228345ab7bacfac54dc37f706fd83", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dc8228345ab7bacfac54dc37f706fd83");
                } else if (com.sankuai.waimai.store.order.a.e().b(str, String.valueOf(d.this.c)) || com.sankuai.waimai.store.order.a.e().b(str, d.this.d)) {
                    d.this.a(false);
                }
            }
        };
        this.y = sCBaseActivity;
        this.e = i;
        this.x = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        this.N = System.currentTimeMillis();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final MetricsSpeedMeterTask j() {
        return this.J;
    }

    @Override // com.sankuai.waimai.store.base.a
    public void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a38b915e88fc1875af0eed584e9babcf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a38b915e88fc1875af0eed584e9babcf");
            return;
        }
        this.U = SystemClock.elapsedRealtime();
        this.C = (FloatingWindowLayout) this.y.findViewById(R.id.restaurant_common_layout);
        this.D = fragmentActivity.findViewById(R.id.market_back_item);
        this.Q = new com.sankuai.waimai.store.goods.list.viewblocks.screenshot.a(this);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e0145fe2a6186a5f50a7a305a8a20019", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e0145fe2a6186a5f50a7a305a8a20019");
        } else {
            if (com.sankuai.shangou.stone.util.k.b(this.y)) {
                u.d(this.D, 0, u.a(this.y), 0, 0);
            }
            this.D.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.5
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr3 = {view};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f7ef333c2edc43c3d75c647294491f83", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f7ef333c2edc43c3d75c647294491f83");
                    } else {
                        d.this.y.onBackPressed();
                    }
                }
            });
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "bf62e4e3c3067d40a0817a3125aa587e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "bf62e4e3c3067d40a0817a3125aa587e");
        } else {
            this.A = (NetInfoLoadView) this.y.findViewById(R.id.market_net_info);
            this.A.setReloadClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.1
                public static ChangeQuickRedirect a;

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Object[] objArr4 = {view};
                    ChangeQuickRedirect changeQuickRedirect4 = a;
                    if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "2d95b1aef4fbd71f413b7dbc16a49bcd", 4611686018427387906L)) {
                        PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "2d95b1aef4fbd71f413b7dbc16a49bcd");
                    } else {
                        d.this.a(true);
                    }
                }
            });
        }
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = b;
        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "3b593878b8f226a24f0244bdb30bd8a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "3b593878b8f226a24f0244bdb30bd8a3");
        } else {
            this.R = new j(this.y);
            FrameLayout frameLayout = (FrameLayout) this.y.findViewById(R.id.poi_page_subscribe_container);
            frameLayout.addView(this.R.createView(frameLayout));
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = b;
        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "78455c2e1648f2072a592eba921d29f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "78455c2e1648f2072a592eba921d29f9");
        } else {
            com.sankuai.waimai.store.manager.poi.a.a().a(this.Y);
            com.sankuai.waimai.store.manager.user.a.a().b((com.sankuai.waimai.store.i.user.a) this);
            com.sankuai.waimai.store.order.a.e().a(this);
        }
        d(this.y.getIntent());
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = b;
        if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "87fb26413a96de838cbd7b8e4e7fe79f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "87fb26413a96de838cbd7b8e4e7fe79f");
        } else {
            this.y.s().recordStep("page_api_start");
        }
        a(true, this.c, this.d, this.K);
    }

    public com.sankuai.waimai.store.platform.domain.manager.poi.a o() {
        return this.x;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0076, code lost:
        if ((r0 instanceof android.widget.FrameLayout) != false) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r19, long r20, java.lang.String r22) {
        /*
            r18 = this;
            r7 = r18
            r8 = r20
            r10 = r22
            r0 = 3
            java.lang.Object[] r11 = new java.lang.Object[r0]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r19)
            r12 = 0
            r11[r12] = r0
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r8)
            r13 = 1
            r11[r13] = r0
            r0 = 2
            r11[r0] = r10
            com.meituan.robust.ChangeQuickRedirect r14 = com.sankuai.waimai.store.goods.list.delegate.impl.d.b
            java.lang.String r15 = "5c05455df7c2d744993b5552aa5d5415"
            r3 = 0
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r11
            r1 = r18
            r2 = r14
            r4 = r15
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L31
            com.meituan.robust.PatchProxy.accessDispatch(r11, r7, r14, r12, r15)
            return
        L31:
            r0 = 0
            int r0 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r0 > 0) goto L38
            return
        L38:
            com.sankuai.waimai.store.manager.marketing.a r0 = r7.j
            if (r0 != 0) goto L89
            com.sankuai.waimai.store.manager.marketing.a r11 = new com.sankuai.waimai.store.manager.marketing.a
            com.sankuai.waimai.store.base.SCBaseActivity r14 = r7.y
            java.lang.Object[] r15 = new java.lang.Object[r12]
            com.meituan.robust.ChangeQuickRedirect r5 = com.sankuai.waimai.store.goods.list.delegate.impl.d.b
            java.lang.String r6 = "de1a695e4b7a7ca43e00ba5678fdfc08"
            r3 = 0
            r16 = 4611686018427387904(0x4000000000000000, double:2.0)
            r0 = r15
            r1 = r18
            r2 = r5
            r4 = r6
            r13 = r5
            r12 = r6
            r5 = r16
            boolean r0 = com.meituan.robust.PatchProxy.isSupport(r0, r1, r2, r3, r4, r5)
            if (r0 == 0) goto L63
            r0 = 0
            java.lang.Object r0 = com.meituan.robust.PatchProxy.accessDispatch(r15, r7, r13, r0, r12)
            android.view.View r0 = (android.view.View) r0
        L5f:
            r1 = r0
            r0 = r19
            goto L83
        L63:
            com.sankuai.waimai.store.platform.domain.manager.poi.a r0 = r7.x
            boolean r0 = r0.t()
            if (r0 == 0) goto L79
            com.sankuai.waimai.store.newwidgets.FloatingWindowLayout r0 = r7.C
            r1 = 2131692329(0x7f0f0b29, float:1.9013755E38)
            android.view.View r0 = r0.findViewById(r1)
            boolean r1 = r0 instanceof android.widget.FrameLayout
            if (r1 == 0) goto L79
            goto L5f
        L79:
            com.sankuai.waimai.store.base.SCBaseActivity r0 = r7.y
            r1 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r0.findViewById(r1)
            goto L5f
        L83:
            r11.<init>(r14, r1, r0)
            r7.j = r11
            goto L8b
        L89:
            r0 = r19
        L8b:
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            java.lang.String r2 = "page_type"
            java.lang.String r0 = java.lang.String.valueOf(r19)
            r1.put(r2, r0)
            java.lang.String r0 = "wm_poi_id"
            java.lang.String r2 = java.lang.String.valueOf(r20)
            r1.put(r0, r2)
            java.lang.String r0 = "poi_id_str"
            r1.put(r0, r10)
            com.sankuai.waimai.store.manager.marketing.a r0 = r7.j
            com.sankuai.waimai.store.base.SCBaseActivity r2 = r7.y
            java.lang.String r2 = r2.w()
            r0.a(r1, r2)
            com.sankuai.waimai.store.manager.marketing.a r0 = r7.j
            r0.f()
            com.sankuai.waimai.store.manager.marketing.a r0 = r7.j
            r1 = 1
            r0.a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.delegate.impl.d.a(int, long, java.lang.String):void");
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "92f0d4b2665bb9d526f6461626bd43c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "92f0d4b2665bb9d526f6461626bd43c4");
        } else if (!this.P) {
            this.w = true;
        } else {
            a(z, this.c, this.d, this.K);
        }
    }

    void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2d74ee25f3276a0498a211326d0b9473", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2d74ee25f3276a0498a211326d0b9473");
        } else if (this.F == null) {
        } else {
            com.sankuai.waimai.store.base.net.sg.a.a((Object) this.y.w()).a(this.c, this.d, 1, this.F, (com.sankuai.waimai.store.base.net.j<GetMenuResponse>) new k<GetMenuResponse>() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.6
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(Object obj) {
                    ArrayList<GetMenuResponse.MenuInfo> arrayList;
                    GetMenuResponse getMenuResponse = (GetMenuResponse) obj;
                    Object[] objArr2 = {getMenuResponse};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "cb71c922dc587e2aeee5ecbb1a1ec4c4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "cb71c922dc587e2aeee5ecbb1a1ec4c4");
                        return;
                    }
                    if (!com.sankuai.waimai.imbase.manager.b.a().b() && getMenuResponse != null && (arrayList = getMenuResponse.menuInfoArrayList) != null && !arrayList.isEmpty()) {
                        Iterator<GetMenuResponse.MenuInfo> it = arrayList.iterator();
                        while (it.hasNext()) {
                            GetMenuResponse.MenuInfo next = it.next();
                            if (next != null && next.b == 3) {
                                it.remove();
                                if (!com.sankuai.waimai.imbase.manager.b.a().c()) {
                                    com.sankuai.waimai.imbase.manager.b.a().a("supermarket-inconsistent_pop_menu_im_switch");
                                }
                            }
                        }
                    }
                    d.this.E.b("restaurant_menu_data", (String) getMenuResponse);
                    com.sankuai.waimai.store.goods.list.interfaces.a aVar = (com.sankuai.waimai.store.goods.list.interfaces.a) d.this.E.c("restaurant_menu_service", (Class<Object>) com.sankuai.waimai.store.goods.list.interfaces.a.class);
                    if (aVar != null) {
                        aVar.a();
                    }
                    if (d.this.s) {
                        d.this.t();
                    }
                }
            });
        }
    }

    private boolean u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "767cbcde94080458bdf227131222d436", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "767cbcde94080458bdf227131222d436")).booleanValue() : this.K > 0;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.a, com.sankuai.waimai.store.goods.list.delegate.d
    @NonNull
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
        return this.x;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    @NonNull
    public final SCBaseActivity k() {
        return this.y;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5777ee0d441af554ba3b0fa7393e7455", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5777ee0d441af554ba3b0fa7393e7455") : this.y.w();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final com.sankuai.shangou.stone.whiteboard.e m() {
        return this.E;
    }

    @Override // com.sankuai.waimai.store.base.a
    public void f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e3e8e5d9043fc272b6ab0da2c6c95626", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e3e8e5d9043fc272b6ab0da2c6c95626");
            return;
        }
        this.P = true;
        if (this.j != null) {
            this.j.h();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f03cb572b189c87f9573841cdc444a0f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f03cb572b189c87f9573841cdc444a0f");
            return;
        }
        if (this.w) {
            a(true);
        }
        q();
    }

    @Override // com.sankuai.waimai.store.base.a
    public void i() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5f79cabe69c54e18d6027e27e60894f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5f79cabe69c54e18d6027e27e60894f2");
            return;
        }
        this.P = false;
        if (com.sankuai.waimai.store.order.a.e().i(this.x.d())) {
            this.x.f();
        }
        if (this.j != null) {
            this.j.i();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f71dd87113055f86799f12ce7275650c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f71dd87113055f86799f12ce7275650c");
            return;
        }
        com.sankuai.waimai.store.base.net.c.a(this.y.w());
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d079ee3befcb123bcb21d0a68a01ab72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d079ee3befcb123bcb21d0a68a01ab72");
        } else {
            com.sankuai.waimai.store.manager.poi.a.a().b(this.Y);
            com.sankuai.waimai.store.manager.user.a.a().a((com.sankuai.waimai.store.i.user.a) this);
            com.sankuai.waimai.store.order.a.e().b(this);
        }
        com.sankuai.waimai.store.platform.domain.core.shopcart.calculator.c.a().b();
        com.sankuai.waimai.store.goods.list.viewblocks.screenshot.a aVar = this.Q;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.viewblocks.screenshot.a.a;
        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "0a526528f0282440f45379c57277b69c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "0a526528f0282440f45379c57277b69c");
        } else {
            com.sankuai.waimai.store.manager.screenshot.a.b(aVar.c);
        }
        this.R.onDestroy();
        if (this.j != null) {
            this.j.j();
        }
        if (this.S != null) {
            com.sankuai.waimai.store.consultation.a aVar2 = this.S;
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.consultation.a.a;
            if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "137eb86cbcd09c6b0e70045f0742d877", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "137eb86cbcd09c6b0e70045f0742d877");
            } else if (aVar2.c != null) {
                aVar2.c.c();
            }
        }
        if (this.B != null) {
            this.B.a();
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "115fe42ed48cd8a04a11af8fa817c791", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "115fe42ed48cd8a04a11af8fa817c791");
        } else if (bundle != null) {
            bundle.putParcelable("android:support:fragments", null);
        }
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void b(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d10c4011285c0e17790cde6dd5bf1ffe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d10c4011285c0e17790cde6dd5bf1ffe");
            return;
        }
        this.y.setIntent(intent);
        a(intent);
    }

    public void a(Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a52e013c8faeeef0d2d956ce3324f0ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a52e013c8faeeef0d2d956ce3324f0ac");
            return;
        }
        intent.putExtra("is_NotificationWindow_show", false);
        a(d(intent));
    }

    @Override // com.sankuai.waimai.store.base.a
    public final void a(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a292b0cc8d23cf98c322509534f7790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a292b0cc8d23cf98c322509534f7790");
            return;
        }
        if (intent != null) {
            this.y.setIntent(intent);
        }
        if (i == 22) {
            if (i2 != -1 || this.B == null) {
                return;
            }
            this.B.c();
        } else if (i == 103) {
            s();
        } else {
            switch (i) {
                case 100:
                case 101:
                    if (i2 != -1 || intent == null) {
                        return;
                    }
                    a(intent);
                    return;
                default:
                    return;
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.a
    public boolean a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "006f8a4450af5598ec896408b68181f4", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "006f8a4450af5598ec896408b68181f4")).booleanValue();
        }
        if (this.G != null && this.G.isCrossOrder) {
            long j = this.c;
            String str = this.d;
            SCBaseActivity sCBaseActivity = this.y;
            Object[] objArr2 = {new Long(j), str, sCBaseActivity};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.goods.list.utils.a.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "6abf6ad1f22a108a7a7e08c62148d6e3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "6abf6ad1f22a108a7a7e08c62148d6e3");
            } else if (sCBaseActivity != null && !sCBaseActivity.isFinishing()) {
                AddProdctResult a2 = com.sankuai.waimai.store.goods.list.utils.a.a(j, str, com.sankuai.waimai.store.order.a.e().p(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(j, str)));
                Intent intent = new Intent();
                intent.putExtra("resultData", i.a(a2));
                sCBaseActivity.setResult(-1, intent);
            }
        }
        if (this.z == null || !this.z.h()) {
            SCBaseActivity sCBaseActivity2 = this.y;
            String d = this.x.d();
            int v = this.x.v();
            Object[] objArr3 = {sCBaseActivity2, d, Integer.valueOf(v)};
            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.helper.d.a;
            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "65e4cf4b2d2e3e9a3acdb9156e8d6e8f", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "65e4cf4b2d2e3e9a3acdb9156e8d6e8f");
            } else {
                EventInfo eventInfo = new EventInfo();
                HashMap hashMap = new HashMap();
                hashMap.put("poi_id", d);
                hashMap.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(v));
                eventInfo.val_lab = hashMap;
                eventInfo.nm = EventName.MGE;
                eventInfo.val_bid = "b_2lUbF";
                eventInfo.event_type = "click";
                Statistics.getChannel("waimai").writeEvent(AppUtil.generatePageInfoKey(sCBaseActivity2), eventInfo);
            }
            return (this.j == null || this.j.g()) ? false : true;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x019f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(@android.support.annotation.NonNull final com.sankuai.waimai.store.repository.model.RestMenuResponse r21, @android.support.annotation.Nullable com.sankuai.waimai.store.entity.RestRecommendPoi r22) {
        /*
            Method dump skipped, instructions count: 656
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.store.goods.list.delegate.impl.d.a(com.sankuai.waimai.store.repository.model.RestMenuResponse, com.sankuai.waimai.store.entity.RestRecommendPoi):void");
    }

    public final void b(@NonNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88fa5eb46f16b37a8eb5f912f17eaf18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88fa5eb46f16b37a8eb5f912f17eaf18");
        } else if (this.z == null) {
        } else {
            this.z.a(restMenuResponse);
            this.z.a(this.S == null ? null : this.S.d);
        }
    }

    private void a(List<GoodsSpu> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "74c7ccaf4c5ad8bf037b6454b6c3a011", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "74c7ccaf4c5ad8bf037b6454b6c3a011");
            return;
        }
        int a2 = com.sankuai.shangou.stone.util.a.a((List) list);
        for (int i = 0; i < a2; i++) {
            GoodsSpu goodsSpu = (GoodsSpu) com.sankuai.shangou.stone.util.a.a((List<Object>) list, i);
            if (goodsSpu != null) {
                if (goodsSpu.id == this.K) {
                    goodsSpu.spuSearchType = 0;
                } else if (this.T.contains(Long.valueOf(goodsSpu.id))) {
                    goodsSpu.spuSearchType = 1;
                } else {
                    goodsSpu.spuSearchType = 2;
                }
            }
        }
    }

    public boolean a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b14a8be3be9994d2e2a301b86c84400c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b14a8be3be9994d2e2a301b86c84400c")).booleanValue() : restMenuResponse.mContainerTemplate == null || restMenuResponse.getPoi() == null;
    }

    private boolean v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "afc7906a106805903dddff83646b5b23", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "afc7906a106805903dddff83646b5b23")).booleanValue() : com.sankuai.waimai.store.locate.a.c() != null;
    }

    private void a(final boolean z, final long j, final String str, final long j2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), str, new Long(j2)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4f16d06fc464d3dfd2c14beafed05633", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4f16d06fc464d3dfd2c14beafed05633");
        } else if (!v()) {
            b(z);
            this.y.s().recordStep("locate_start");
            if (this.J != null) {
                this.J.recordStep("locate_start");
            }
            com.sankuai.waimai.store.locate.a.a(this.y, "dj-2d4b04dd8aa72700", new com.sankuai.waimai.store.i.locate.c() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.8
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.i.locate.c
                public final void a(@Nullable WMLocation wMLocation) {
                    Object[] objArr2 = {wMLocation};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d18ddc2909bd639ff9d1a4f3d1b63216", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d18ddc2909bd639ff9d1a4f3d1b63216");
                        return;
                    }
                    if (d.this.j() != null) {
                        d.this.j().recordStep("location_ready");
                    }
                    if (d.this.y == null || d.this.y.isFinishing()) {
                        return;
                    }
                    d.this.a(z, j, str, j2, true);
                    d.this.c(wMLocation != null);
                }
            });
        } else {
            a(z, j, str, j2, false);
            c(true);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb52af0a6c8664589a6233d075deb6f3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb52af0a6c8664589a6233d075deb6f3");
        } else if (this.X) {
        } else {
            this.X = true;
            if (z) {
                com.sankuai.waimai.store.util.monitor.b.a().a(SupermarketPoiLocate.Normal).a(true).b(this.g).a();
            } else {
                com.sankuai.waimai.store.util.monitor.b.a().a(SupermarketPoiLocate.Fail).a(false).b(this.g).a();
            }
        }
    }

    void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "27e9b4c13bbdd70ef328e40adc230ada", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "27e9b4c13bbdd70ef328e40adc230ada");
            return;
        }
        if (this.B != null) {
            this.B.e();
        }
        if (z) {
            this.A.b();
        } else {
            this.y.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z, final long j, final String str, long j2, final boolean z2) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0), new Long(j), str, new Long(j2), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eca4f9886a8141f97645e8a12efe22e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eca4f9886a8141f97645e8a12efe22e5");
            return;
        }
        this.F = null;
        if (this.J != null) {
            this.J.recordStep("page_api_start");
        }
        com.sankuai.waimai.store.goods.list.utils.c.a(this.e, this.y.w(), j, str, j2, this.a, this.h, new k<RestMenuResponse>() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.9
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final /* synthetic */ void a(Object obj) {
                final RestMenuResponse restMenuResponse = (RestMenuResponse) obj;
                Object[] objArr2 = {restMenuResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "9f573f625fcb6e5bb8d63b1fc17047cf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "9f573f625fcb6e5bb8d63b1fc17047cf");
                    return;
                }
                d.b(d.this, restMenuResponse);
                h.a(d.this.y.s().recordStep("activity_data_ready"));
                if (d.this.j() != null) {
                    d.this.j().recordStep("activity_data_ready");
                }
                if (restMenuResponse != null) {
                    if (d.this.a(restMenuResponse)) {
                        d.this.a(d.this.y.getString(R.string.wm_sc_common_loading_fail_try_afterwhile));
                    } else if (d.this.a(restMenuResponse, d.this.e)) {
                        d.this.y.finish();
                    } else {
                        com.sankuai.waimai.store.order.a.e().a(j, com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str, j), restMenuResponse.getPoiId(), restMenuResponse.getPoi().getOfficialPoiId());
                        d.this.F = TextUtils.isEmpty(restMenuResponse.additionalFields) ? "" : restMenuResponse.additionalFields;
                        d.this.q();
                        if (w.b(restMenuResponse.getPoi()) || !com.sankuai.shangou.stone.util.a.b(restMenuResponse.mGoodPoiCategoryList)) {
                            d.this.D.setVisibility(8);
                            if (restMenuResponse.getPoiState() != 3) {
                                Intent intent = d.this.y.getIntent();
                                String a2 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(d.this.d, d.this.c);
                                Object[] objArr3 = {intent, a2};
                                ChangeQuickRedirect changeQuickRedirect3 = MultiFoodsHandler.a;
                                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "f496ee94264137397adb884ef8cb5fc9", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "f496ee94264137397adb884ef8cb5fc9");
                                } else if (MultiFoodsHandler.a(intent)) {
                                    com.sankuai.waimai.store.order.a.e().a(a2, (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                                }
                                if (d.this.G != null && d.this.G.isCrossOrder) {
                                    com.sankuai.waimai.store.order.a.e().a(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(d.this.d, d.this.c), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                                }
                                if (d.this.H != null && d.this.H.isSuperOrder) {
                                    com.sankuai.waimai.store.order.a.e().a(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(d.this.d, d.this.c), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                                }
                                d.this.a(restMenuResponse, (RestRecommendPoi) null);
                                if (d.this.G != null && d.this.G.isCrossOrder) {
                                    d.this.r();
                                }
                                if (d.this.H != null && d.this.H.isSuperOrder) {
                                    String w = d.this.y.w();
                                    final long j3 = d.this.c;
                                    final String str2 = d.this.d;
                                    final SuperSaleModel superSaleModel = d.this.H;
                                    final k<SpuProductsResponse> kVar = new k<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.9.2
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                        public final /* synthetic */ void a(Object obj2) {
                                            Object[] objArr4 = {(SpuProductsResponse) obj2};
                                            ChangeQuickRedirect changeQuickRedirect4 = a;
                                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "26f2f579da673a2e63d886750614aee1", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "26f2f579da673a2e63d886750614aee1");
                                            } else {
                                                d.this.s();
                                            }
                                        }
                                    };
                                    Object[] objArr4 = {w, new Long(j3), str2, superSaleModel, kVar};
                                    ChangeQuickRedirect changeQuickRedirect4 = g.a;
                                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "284702df5e2ee6d5bb0caaa6b50e3ac3", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "284702df5e2ee6d5bb0caaa6b50e3ac3");
                                    } else {
                                        com.sankuai.waimai.store.goods.list.utils.c.a(w, j3, str2, superSaleModel.mAddListids, new com.sankuai.waimai.store.base.net.j<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.goods.list.utils.g.1
                                            public static ChangeQuickRedirect a;

                                            @Override // com.sankuai.waimai.store.base.net.j
                                            public final /* synthetic */ void a(SpuProductsResponse spuProductsResponse) {
                                                SpuProductsResponse spuProductsResponse2;
                                                ArrayList<AddCrossSkus> arrayList;
                                                String a3;
                                                Object[] objArr5;
                                                ChangeQuickRedirect changeQuickRedirect5;
                                                SpuProductsResponse spuProductsResponse3;
                                                Iterator<AddCrossSkus> it;
                                                GoodsSku m20clone;
                                                SpuProductsResponse spuProductsResponse4 = spuProductsResponse;
                                                Object[] objArr6 = {spuProductsResponse4};
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "e04e7821fef5c81284e1d7dee53af15a", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "e04e7821fef5c81284e1d7dee53af15a");
                                                    return;
                                                }
                                                if (spuProductsResponse4 != null) {
                                                    try {
                                                        com.sankuai.waimai.store.order.a.e().a(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str2, j3), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                                                        arrayList = superSaleModel.addSuperSkus;
                                                        a3 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str2, j3);
                                                        objArr5 = new Object[]{spuProductsResponse4, arrayList, a3};
                                                        changeQuickRedirect5 = g.a;
                                                    } catch (JSONException e) {
                                                        e = e;
                                                        spuProductsResponse2 = spuProductsResponse4;
                                                    }
                                                    if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "1c33be2104ae9ca379be9e8fe3e022dd", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "1c33be2104ae9ca379be9e8fe3e022dd");
                                                    } else {
                                                        List<GoodsSpu> list = spuProductsResponse4.productSpuList;
                                                        if (!com.sankuai.shangou.stone.util.a.b(list)) {
                                                            for (GoodsSpu goodsSpu : list) {
                                                                if (goodsSpu != null) {
                                                                    List<GoodsSku> list2 = goodsSpu.skus;
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    if (list2 != null) {
                                                                        for (GoodsSku goodsSku : list2) {
                                                                            if (!com.sankuai.shangou.stone.util.a.b(arrayList)) {
                                                                                Iterator<AddCrossSkus> it2 = arrayList.iterator();
                                                                                while (it2.hasNext()) {
                                                                                    AddCrossSkus next = it2.next();
                                                                                    if (arrayList != null) {
                                                                                        spuProductsResponse2 = spuProductsResponse4;
                                                                                        it = it2;
                                                                                        try {
                                                                                            if (goodsSpu.id == next.id && (m20clone = goodsSku.m20clone()) != null) {
                                                                                                m20clone.count = next.count;
                                                                                                if (!com.sankuai.shangou.stone.util.a.b(m20clone.attrs)) {
                                                                                                    ArrayList arrayList3 = new ArrayList();
                                                                                                    arrayList3.add(m20clone.attrs.get(0));
                                                                                                    m20clone.attrs = arrayList3;
                                                                                                }
                                                                                                arrayList2.add(m20clone);
                                                                                            }
                                                                                        } catch (JSONException e2) {
                                                                                            e = e2;
                                                                                            com.sankuai.shangou.stone.util.log.a.a(e);
                                                                                            kVar.a((com.sankuai.waimai.store.base.net.j) spuProductsResponse2);
                                                                                        }
                                                                                    } else {
                                                                                        spuProductsResponse2 = spuProductsResponse4;
                                                                                        it = it2;
                                                                                    }
                                                                                    spuProductsResponse4 = spuProductsResponse2;
                                                                                    it2 = it;
                                                                                }
                                                                            }
                                                                            spuProductsResponse4 = spuProductsResponse4;
                                                                        }
                                                                    }
                                                                    spuProductsResponse3 = spuProductsResponse4;
                                                                    goodsSpu.skus = arrayList2;
                                                                } else {
                                                                    spuProductsResponse3 = spuProductsResponse4;
                                                                }
                                                                spuProductsResponse4 = spuProductsResponse3;
                                                            }
                                                            spuProductsResponse2 = spuProductsResponse4;
                                                            ArrayList arrayList4 = new ArrayList();
                                                            ArrayList arrayList5 = new ArrayList();
                                                            Iterator<AddCrossSkus> it3 = arrayList.iterator();
                                                            while (it3.hasNext()) {
                                                                AddCrossSkus next2 = it3.next();
                                                                for (GoodsSpu goodsSpu2 : list) {
                                                                    if (goodsSpu2.id == next2.id && !arrayList5.contains(Long.valueOf(goodsSpu2.id))) {
                                                                        arrayList5.add(Long.valueOf(goodsSpu2.id));
                                                                        arrayList4.add(goodsSpu2);
                                                                    }
                                                                }
                                                            }
                                                            String a4 = i.a(arrayList4);
                                                            new StringBuilder("AddProductByid: ").append(a4);
                                                            com.sankuai.waimai.store.order.a.e().f(a3, OrderedFood.fromOrderAgain(new JSONArray(a4)));
                                                            kVar.a((com.sankuai.waimai.store.base.net.j) spuProductsResponse2);
                                                        }
                                                    }
                                                }
                                                spuProductsResponse2 = spuProductsResponse4;
                                                kVar.a((com.sankuai.waimai.store.base.net.j) spuProductsResponse2);
                                            }

                                            @Override // com.sankuai.waimai.store.base.net.j
                                            public final void a() {
                                                Object[] objArr5 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "49c7000815b4cb9f3be3d6c3a37541d0", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "49c7000815b4cb9f3be3d6c3a37541d0");
                                                } else {
                                                    kVar.a();
                                                }
                                            }

                                            @Override // com.sankuai.waimai.store.base.net.j
                                            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                                Object[] objArr5 = {bVar};
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "8fbcf2659a3f61458a3bff758d07a33d", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "8fbcf2659a3f61458a3bff758d07a33d");
                                                } else {
                                                    kVar.a(bVar);
                                                }
                                            }

                                            @Override // com.sankuai.waimai.store.base.net.j
                                            public final void b() {
                                                Object[] objArr5 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "d3ce997be34e7b19f291f5ceb6c7e542", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "d3ce997be34e7b19f291f5ceb6c7e542");
                                                } else {
                                                    kVar.b();
                                                }
                                            }
                                        });
                                    }
                                }
                                Intent intent2 = d.this.y.getIntent();
                                String w2 = d.this.y.w();
                                final long j4 = d.this.c;
                                final String str3 = d.this.d;
                                final k<SpuProductsResponse> kVar2 = new k<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.9.3
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final /* synthetic */ void a(Object obj2) {
                                        Object[] objArr5 = {(SpuProductsResponse) obj2};
                                        ChangeQuickRedirect changeQuickRedirect5 = a;
                                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "36ac5b3f2f0cf74c812e6edaef983e5e", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "36ac5b3f2f0cf74c812e6edaef983e5e");
                                        } else {
                                            d.this.s();
                                        }
                                    }
                                };
                                Object[] objArr5 = {intent2, w2, new Long(j4), str3, kVar2};
                                ChangeQuickRedirect changeQuickRedirect5 = MultiFoodsHandler.a;
                                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "3d94a02de0da1ead5906a4a9144f45d4", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "3d94a02de0da1ead5906a4a9144f45d4");
                                } else if (MultiFoodsHandler.a(intent2)) {
                                    ArrayList arrayList = new ArrayList();
                                    final HashMap hashMap = new HashMap();
                                    MultiFoodsHandler.a(intent2, arrayList, hashMap);
                                    com.sankuai.waimai.store.goods.list.utils.c.a(w2, j4, str3, arrayList, new com.sankuai.waimai.store.base.net.j<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.goods.list.utils.MultiFoodsHandler.1
                                        public static ChangeQuickRedirect a;

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final /* synthetic */ void a(SpuProductsResponse spuProductsResponse) {
                                            Iterator<GoodsSpu> it;
                                            GoodsSpu goodsSpu;
                                            GoodsSku m20clone;
                                            SpuProductsResponse spuProductsResponse2 = spuProductsResponse;
                                            Object[] objArr6 = {spuProductsResponse2};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "44adc7b14ce8ae9aff78f7d095c2dbcf", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "44adc7b14ce8ae9aff78f7d095c2dbcf");
                                                return;
                                            }
                                            if (spuProductsResponse2 != null) {
                                                try {
                                                    com.sankuai.waimai.store.order.a.e().a(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str3, j4), (com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b) null);
                                                    HashMap hashMap2 = hashMap;
                                                    String a3 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(str3, j4);
                                                    Object[] objArr7 = {spuProductsResponse2, hashMap2, a3};
                                                    ChangeQuickRedirect changeQuickRedirect7 = MultiFoodsHandler.a;
                                                    if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "4ad672520e3af9eee88430c147875ffa", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "4ad672520e3af9eee88430c147875ffa");
                                                    } else {
                                                        List<GoodsSpu> list = spuProductsResponse2.productSpuList;
                                                        if (!com.sankuai.shangou.stone.util.a.b(list)) {
                                                            Iterator<GoodsSpu> it2 = list.iterator();
                                                            while (it2.hasNext()) {
                                                                GoodsSpu next = it2.next();
                                                                if (next != null) {
                                                                    List<GoodsSku> list2 = next.skus;
                                                                    ArrayList arrayList2 = new ArrayList();
                                                                    next.skus = arrayList2;
                                                                    if (list2 != null) {
                                                                        for (GoodsSku goodsSku : list2) {
                                                                            if (goodsSku != null && hashMap2.containsKey(Long.valueOf(goodsSku.id))) {
                                                                                List<SimpleGoodsSku> list3 = (List) hashMap2.get(Long.valueOf(goodsSku.id));
                                                                                if (!com.sankuai.shangou.stone.util.a.b(list3)) {
                                                                                    for (SimpleGoodsSku simpleGoodsSku : list3) {
                                                                                        if (list3 != null) {
                                                                                            it = it2;
                                                                                            goodsSpu = next;
                                                                                            if (next.id == simpleGoodsSku.id && (m20clone = goodsSku.m20clone()) != null) {
                                                                                                m20clone.count = simpleGoodsSku.count;
                                                                                                if (!com.sankuai.shangou.stone.util.a.b(simpleGoodsSku.attrs)) {
                                                                                                    m20clone.attrs = simpleGoodsSku.attrs;
                                                                                                }
                                                                                                arrayList2.add(m20clone);
                                                                                            }
                                                                                        } else {
                                                                                            it = it2;
                                                                                            goodsSpu = next;
                                                                                        }
                                                                                        it2 = it;
                                                                                        next = goodsSpu;
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            com.sankuai.waimai.store.order.a.e().f(a3, OrderedFood.fromOrderAgain(new JSONArray(i.a(list))));
                                                        }
                                                    }
                                                } catch (JSONException e) {
                                                    com.sankuai.shangou.stone.util.log.a.a(e);
                                                }
                                            }
                                            com.sankuai.waimai.store.base.net.j.this.a((com.sankuai.waimai.store.base.net.j) spuProductsResponse2);
                                        }

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final void a() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "25b43c5d59b310067ed3ce6f0f9847c1", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "25b43c5d59b310067ed3ce6f0f9847c1");
                                            } else {
                                                com.sankuai.waimai.store.base.net.j.this.a();
                                            }
                                        }

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                            Object[] objArr6 = {bVar};
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "3fc99029baaee59f3a48002771657565", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "3fc99029baaee59f3a48002771657565");
                                            } else {
                                                com.sankuai.waimai.store.base.net.j.this.a(bVar);
                                            }
                                        }

                                        @Override // com.sankuai.waimai.store.base.net.j
                                        public final void b() {
                                            Object[] objArr6 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect6 = a;
                                            if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "f4d60804ef56895458e07ef1ad3a4a58", RobustBitConfig.DEFAULT_VALUE)) {
                                                PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "f4d60804ef56895458e07ef1ad3a4a58");
                                            } else {
                                                com.sankuai.waimai.store.base.net.j.this.b();
                                            }
                                        }
                                    });
                                }
                                if (d.this.I) {
                                    if (com.sankuai.waimai.store.manager.user.a.a().b()) {
                                        d.a(d.this);
                                    } else {
                                        com.sankuai.waimai.store.manager.user.a.a(d.this.y, new Runnable() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.9.4
                                            public static ChangeQuickRedirect a;

                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                Object[] objArr6 = new Object[0];
                                                ChangeQuickRedirect changeQuickRedirect6 = a;
                                                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "69affe5cb4cd78386d82c816898eab85", RobustBitConfig.DEFAULT_VALUE)) {
                                                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "69affe5cb4cd78386d82c816898eab85");
                                                } else {
                                                    d.a(d.this);
                                                }
                                            }
                                        });
                                    }
                                }
                                try {
                                    d dVar = d.this;
                                    Object[] objArr6 = new Object[0];
                                    ChangeQuickRedirect changeQuickRedirect6 = d.b;
                                    if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "749e7507265a123fd0a6b211d187fbe4", RobustBitConfig.DEFAULT_VALUE)) {
                                        PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "749e7507265a123fd0a6b211d187fbe4");
                                        return;
                                    }
                                    HashMap hashMap2 = new HashMap();
                                    hashMap2.put("poiID", String.valueOf(dVar.c));
                                    hashMap2.put(FoodDetailNetWorkPreLoader.URI_POI_STR, String.valueOf(dVar.d));
                                    if (dVar.x != null) {
                                        hashMap2.put("poiName", dVar.x.j());
                                    }
                                    PoiNewTemplate4.a(dVar.y, hashMap2);
                                    return;
                                } catch (Exception e) {
                                    com.sankuai.waimai.store.base.log.a.a(e);
                                    return;
                                }
                            }
                            d.this.v = false;
                            final d dVar2 = d.this;
                            Object[] objArr7 = {restMenuResponse};
                            ChangeQuickRedirect changeQuickRedirect7 = d.b;
                            if (PatchProxy.isSupport(objArr7, dVar2, changeQuickRedirect7, false, "36fa7cc18a9c238909b2e5ec10bc3da2", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr7, dVar2, changeQuickRedirect7, false, "36fa7cc18a9c238909b2e5ec10bc3da2");
                            } else {
                                com.sankuai.waimai.store.base.net.wm.a.a(dVar2.y.w()).a(String.valueOf(restMenuResponse.getPoiId()), 1, new k<RestRecommendPoi>() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.12
                                    public static ChangeQuickRedirect a;

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final /* synthetic */ void a(Object obj2) {
                                        RestRecommendPoi restRecommendPoi = (RestRecommendPoi) obj2;
                                        Object[] objArr8 = {restRecommendPoi};
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ffc4e7f70f588eca8da95f88cd251546", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ffc4e7f70f588eca8da95f88cd251546");
                                        } else {
                                            d.this.a(restMenuResponse, restRecommendPoi);
                                        }
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                                        Object[] objArr8 = {bVar};
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "bf6455f9eb30964077e8015e1efeb3e2", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "bf6455f9eb30964077e8015e1efeb3e2");
                                            return;
                                        }
                                        super.a(bVar);
                                        d.this.a(restMenuResponse, (RestRecommendPoi) null);
                                    }

                                    @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
                                    public final void b() {
                                        Object[] objArr8 = new Object[0];
                                        ChangeQuickRedirect changeQuickRedirect8 = a;
                                        if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "8b74af4395499009902d80d02fc811be", RobustBitConfig.DEFAULT_VALUE)) {
                                            PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "8b74af4395499009902d80d02fc811be");
                                            return;
                                        }
                                        super.b();
                                        if (d.this.s) {
                                            al.b(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.12.1
                                                public static ChangeQuickRedirect a;

                                                @Override // java.lang.Runnable
                                                public final void run() {
                                                    Object[] objArr9 = new Object[0];
                                                    ChangeQuickRedirect changeQuickRedirect9 = a;
                                                    if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "725bc022622517306aff4c33f23104a0", RobustBitConfig.DEFAULT_VALUE)) {
                                                        PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "725bc022622517306aff4c33f23104a0");
                                                    } else {
                                                        d.this.A.e();
                                                    }
                                                }
                                            }, d.this.y.w());
                                        }
                                    }
                                });
                            }
                        } else if (d.this.A != null) {
                            NetInfoLoadView netInfoLoadView = d.this.A;
                            Object[] objArr8 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect8 = NetInfoLoadView.a;
                            if (PatchProxy.isSupport(objArr8, netInfoLoadView, changeQuickRedirect8, false, "b76a9f1e0a391b3df8935ae9ae1a2a16", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr8, netInfoLoadView, changeQuickRedirect8, false, "b76a9f1e0a391b3df8935ae9ae1a2a16");
                            } else {
                                netInfoLoadView.a("", "");
                            }
                        }
                    }
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "18872e5ecd3aea22811a25c1601e7b65", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "18872e5ecd3aea22811a25c1601e7b65");
                } else {
                    d.this.b(z);
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void b() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6ba8995d565f8acbbe2e67929c47f7a4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6ba8995d565f8acbbe2e67929c47f7a4");
                    return;
                }
                super.b();
                if (z) {
                    if (d.this.s) {
                        al.a(new Runnable() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.9.1
                            public static ChangeQuickRedirect a;

                            @Override // java.lang.Runnable
                            public final void run() {
                                Object[] objArr3 = new Object[0];
                                ChangeQuickRedirect changeQuickRedirect3 = a;
                                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8d745c15d4dc8179db49f6ad468fedbb", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8d745c15d4dc8179db49f6ad468fedbb");
                                    return;
                                }
                                d.this.w = false;
                                d.this.A.e();
                            }
                        }, d.this.w ? 100 : 0, d.this.y.w());
                    }
                } else {
                    d.this.y.v();
                }
                if (d.this.j() != null) {
                    if (z2) {
                        d.this.j().recordStep("total_with_loc");
                    } else {
                        d.this.j().recordStep("total_no_loc");
                    }
                    h.a(d.this.j());
                    d.this.k = System.currentTimeMillis();
                }
            }

            @Override // com.sankuai.waimai.store.base.net.k, com.sankuai.waimai.store.base.net.j
            public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "83ff5ead8b0f66e827545d569d46fa8f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "83ff5ead8b0f66e827545d569d46fa8f");
                    return;
                }
                if (d.this.j() != null) {
                    d.this.j().recordStep("page_api_end");
                }
                super.a(bVar);
                d.this.a(bVar.b, bVar.c != 71);
            }
        });
    }

    public static boolean a(Poi poi) {
        return (poi == null || poi.brandStory == null || poi.brandStory.type == 0) ? false : true;
    }

    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c8af195615cea18e3a24f75ab8d3759", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c8af195615cea18e3a24f75ab8d3759");
        } else {
            com.sankuai.waimai.store.goods.list.utils.c.a(this.y.w(), this.c, this.d, this.G.mAddListids, new com.sankuai.waimai.store.base.net.j<SpuProductsResponse>() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "502b088f55a717d24458e38364623128", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "502b088f55a717d24458e38364623128");
                    }
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void a(com.sankuai.waimai.store.repository.net.b bVar) {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final void b() {
                }

                @Override // com.sankuai.waimai.store.base.net.j
                public final /* synthetic */ void a(SpuProductsResponse spuProductsResponse) {
                    GoodsSku m20clone;
                    SpuProductsResponse spuProductsResponse2 = spuProductsResponse;
                    Object[] objArr2 = {spuProductsResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "53f2470e0f62dde82a787a8990d9a467", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "53f2470e0f62dde82a787a8990d9a467");
                    } else if (spuProductsResponse2 != null && d.this.G != null) {
                        try {
                            HashMap<Long, ArrayList<AddCrossSkus>> hashMap = d.this.G.addCrossSkus;
                            String a2 = com.sankuai.waimai.store.platform.domain.manager.poi.a.a(d.this.d, d.this.c);
                            Object[] objArr3 = {spuProductsResponse2, hashMap, a2};
                            ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.goods.list.utils.a.a;
                            if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "41eb82f013a7b8773817e2017cd99183", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "41eb82f013a7b8773817e2017cd99183");
                            } else {
                                List<GoodsSpu> list = spuProductsResponse2.productSpuList;
                                if (!com.sankuai.shangou.stone.util.a.b(list)) {
                                    for (GoodsSpu goodsSpu : list) {
                                        if (goodsSpu != null) {
                                            List<GoodsSku> list2 = goodsSpu.skus;
                                            ArrayList arrayList = new ArrayList();
                                            if (list2 != null) {
                                                for (GoodsSku goodsSku : list2) {
                                                    if (goodsSku != null && hashMap.containsKey(Long.valueOf(goodsSku.id))) {
                                                        ArrayList<AddCrossSkus> arrayList2 = hashMap.get(Long.valueOf(goodsSku.id));
                                                        if (!com.sankuai.shangou.stone.util.a.b(arrayList2)) {
                                                            for (AddCrossSkus addCrossSkus : arrayList2) {
                                                                if (arrayList2 != null && goodsSpu.id == addCrossSkus.id && (m20clone = goodsSku.m20clone()) != null) {
                                                                    m20clone.count = addCrossSkus.count;
                                                                    if (!com.sankuai.shangou.stone.util.a.b(addCrossSkus.attrs)) {
                                                                        m20clone.attrs = addCrossSkus.attrs;
                                                                    }
                                                                    arrayList.add(m20clone);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            goodsSpu.skus = arrayList;
                                        }
                                    }
                                    com.sankuai.waimai.store.order.a.e().f(a2, OrderedFood.fromOrderAgain(new JSONArray(i.a(list))));
                                }
                            }
                            d.this.s();
                        } catch (JSONException e) {
                            com.sankuai.shangou.stone.util.log.a.a(e);
                        }
                    }
                }
            });
        }
    }

    public void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67740f9150c7ec5aa578f050d3de0a60", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67740f9150c7ec5aa578f050d3de0a60");
        } else {
            a(str, true);
        }
    }

    public final void a(String str, boolean z) {
        Object[] objArr = {str, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e904cb113285bb45f5f84be243f8875", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e904cb113285bb45f5f84be243f8875");
            return;
        }
        this.w = false;
        this.y.v();
        if (this.A != null) {
            this.A.a(str, z);
        } else {
            this.y.b_(str);
        }
    }

    private boolean d(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "56d6841f0739bec6f9184e71f3068e32", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "56d6841f0739bec6f9184e71f3068e32")).booleanValue();
        }
        long j = this.c;
        this.c = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "restaurant_id", "poiId", j);
        if (this.c == -1) {
            this.c = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "wm_poi_id", "poiId", j);
        }
        if (this.c == -1) {
            this.c = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "poi_id", "poiId", j);
        }
        this.d = com.sankuai.waimai.store.goods.list.utils.d.a(intent, FoodDetailNetWorkPreLoader.URI_POI_STR, FoodDetailNetWorkPreLoader.URI_POI_STR, this.d);
        this.x.a(this.c);
        this.x.a(this.d);
        String a2 = aa.a(intent, "order_again");
        if (!TextUtils.isEmpty(a2)) {
            try {
                com.sankuai.waimai.store.order.a.e().e(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.d, this.c), OrderedFood.fromOrderAgain(new JSONArray(a2)));
            } catch (JSONException e) {
                com.sankuai.shangou.stone.util.log.a.a(e);
            }
        }
        this.f = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "source_type", "source_type", 0);
        this.g = com.sankuai.waimai.store.router.d.a(intent, "g_source", "g_source", "-999");
        this.m = com.sankuai.waimai.store.router.d.a(intent, "dp_source", "dp_source", "");
        this.n = com.sankuai.waimai.store.router.d.a(intent, "med_source_channel", "med_source_channel", "");
        this.h = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "extra", "extra", "");
        this.K = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "spu_id", "foodId", -1L);
        this.L = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "sku_id", "sku_id", 0L);
        this.M = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "process_multi_attr_spu", "process_multi_attr_spu", false);
        this.a = com.sankuai.waimai.store.router.d.a(intent, "tag_id", -1L);
        this.v = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "need_add", "need_add", 0) == 1;
        this.u = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "isopenshopcart", "isopenshopcart", false);
        this.l = com.sankuai.waimai.store.router.d.a(intent, "source_page_id", "source_page_id", "-999");
        this.o = com.sankuai.waimai.store.router.d.a(intent, "source_event_id", "source_event_id", "-999");
        this.p = com.sankuai.waimai.store.router.d.a(intent, "source_attribute", "source_attribute", "-999");
        this.q = com.sankuai.waimai.store.router.d.a(intent, "source_ext", "source_ext", "-999");
        this.O = com.sankuai.waimai.store.router.d.a(intent, "page_from_type", "page_from_type", -1);
        f(intent);
        Object[] objArr2 = {intent};
        ChangeQuickRedirect changeQuickRedirect2 = b;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "848c7efc784202165f95d3bc74b870be", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "848c7efc784202165f95d3bc74b870be");
        } else {
            this.G = com.sankuai.waimai.store.goods.list.utils.a.a(intent, this.h);
        }
        e(intent);
        Object[] objArr3 = {intent};
        ChangeQuickRedirect changeQuickRedirect3 = b;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "8681524a2945c1b8eaa07e9b7be60559", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "8681524a2945c1b8eaa07e9b7be60559");
        } else {
            this.H = g.a(intent, this.h);
            if (this.H != null && this.H.isSuperOrder) {
                com.sankuai.waimai.store.order.a.e().b(com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.d, this.c));
                String a3 = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "supersale_message", "supersale_message", "");
                if (!t.a(a3)) {
                    am.a((Activity) this.y, a3);
                }
            }
        }
        this.I = com.sankuai.waimai.store.router.d.a(intent, "auto_receive", "auto_receive", -1) == 1;
        if (this.I) {
            this.V = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "coupon_id", "coupon_id", -1L);
            this.W = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "activity_id", "activity_id", -1L);
        }
        return j != this.c;
    }

    public final void c(@NonNull Intent intent) {
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "686432e087091842e47b7ceb52f801bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "686432e087091842e47b7ceb52f801bb");
            return;
        }
        this.r = com.sankuai.waimai.store.router.d.a(intent, "page_toast", "page_toast", "");
        if (t.a(this.r)) {
            return;
        }
        am.a((Activity) this.y, this.r);
    }

    private void e(@NonNull Intent intent) {
        String[] split;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6760e2cef69d6ef3084e268fe47a70", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6760e2cef69d6ef3084e268fe47a70");
            return;
        }
        this.T.clear();
        String a2 = com.sankuai.waimai.store.goods.list.utils.d.a(intent, "combo_spu_list", "combo_spu_list", "");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        try {
            for (String str : a2.split(CommonConstant.Symbol.COMMA)) {
                if (!TextUtils.isEmpty(str)) {
                    this.T.add(Long.valueOf(str));
                }
            }
        } catch (Exception unused) {
        }
    }

    private static long b(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "8d2e8431ee84f9fb3b97691bbb5570a0", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Long) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "8d2e8431ee84f9fb3b97691bbb5570a0")).longValue();
        }
        try {
            return Long.parseLong(str);
        } catch (Exception unused) {
            return -1L;
        }
    }

    private void f(Intent intent) {
        Uri.Builder builder;
        Object[] objArr = {intent};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8601745f2b70fa2298bd7a848af86dc5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8601745f2b70fa2298bd7a848af86dc5");
        } else if (intent != null) {
            Uri data = intent.getData();
            if (data != null) {
                String queryParameter = data.getQueryParameter("poiId");
                if (b(queryParameter) <= 0) {
                    queryParameter = Long.toString(this.c);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(this.x.v());
                String sb2 = sb.toString();
                builder = data.buildUpon();
                builder.appendQueryParameter("poi_id", queryParameter).appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, this.d).appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, sb2);
            } else {
                builder = new Uri.Builder();
                Uri.Builder appendQueryParameter = builder.appendQueryParameter("poi_id", Long.toString(this.c)).appendQueryParameter(FoodDetailNetWorkPreLoader.URI_POI_STR, this.d);
                StringBuilder sb3 = new StringBuilder();
                sb3.append(this.x.v());
                appendQueryParameter.appendQueryParameter(KernelConfig.KEY_CONTAINER_TYPE, sb3.toString());
            }
            WMLocation b2 = com.sankuai.waimai.store.locate.a.b();
            double latitude = b2 != null ? b2.getLatitude() : 0.0d;
            double longitude = b2 != null ? b2.getLongitude() : 0.0d;
            if (com.sankuai.shangou.stone.util.i.a(Double.valueOf(latitude), Double.valueOf(0.0d)) || com.sankuai.shangou.stone.util.i.a(Double.valueOf(longitude), Double.valueOf(0.0d))) {
                return;
            }
            this.i.put(Constants.Environment.KEY_PUSHID, com.sankuai.waimai.store.router.d.a(intent, Constants.Environment.KEY_PUSHID, ""));
            this.i.put("mt_aurl", builder.build());
            this.i.put(Constants.PRIVACY.KEY_LATITUDE, String.valueOf((long) (latitude * 1000000.0d)));
            this.i.put(Constants.PRIVACY.KEY_LONGITUDE, String.valueOf((long) (longitude * 1000000.0d)));
            com.sankuai.waimai.store.manager.judas.a.a(this.i);
            this.i.put("g_source", aa.a(intent, "gSource", ""));
            if (!t.a(this.m)) {
                this.i.put("dp_source", this.m);
            }
            if (!t.a(this.n)) {
                this.i.put("med_source_channel", this.n);
            }
            this.i.put(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.x.v()));
            intent.setData(builder.build());
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.EnumC1205a enumC1205a) {
        Object[] objArr = {enumC1205a};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "42395bd90013c0fcac1c11223e0ad7a3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "42395bd90013c0fcac1c11223e0ad7a3");
        } else if (enumC1205a == a.EnumC1205a.LOGIN && com.sankuai.waimai.store.manager.user.a.a().b()) {
            if (this.P && this.B != null) {
                this.B.b();
            }
            ab.b().a((Context) this.y, "poi_coupon_need_login", false);
            a(true);
        }
    }

    @Override // com.sankuai.waimai.store.i.user.a
    public final void a(a.b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a9e08c248d7d05f258f6320db129acde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a9e08c248d7d05f258f6320db129acde");
        } else if (bVar == a.b.PHONE && com.sankuai.waimai.foundation.core.service.user.a.a == a.EnumC0947a.FROM_PRODUCT_LIST_PREORDER && this.B != null) {
            this.B.c();
        }
    }

    @Override // com.sankuai.waimai.store.observers.a
    public final void ba_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c114d07d00c2ea1349defdb5d593da4f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c114d07d00c2ea1349defdb5d593da4f");
        } else if (this.B != null) {
            this.B.h();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(@NonNull RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "734ed7c58e25ba6c0bdcca623a8b6c15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "734ed7c58e25ba6c0bdcca623a8b6c15");
            return;
        }
        com.sankuai.waimai.store.shopping.cart.cache.b.a(restMenuResponse);
        if (!restMenuResponse.getPoi().isHideShoppingCar) {
            if (this.x.r() == 3) {
                w();
            } else {
                s();
            }
        } else if (this.B != null) {
            this.B.b(false);
        }
    }

    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c6da0dd381dd0684247096b026e94460", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c6da0dd381dd0684247096b026e94460");
        } else if (com.sankuai.waimai.store.order.a.e().k(this.x.d()).j() <= 0) {
            com.sankuai.waimai.store.order.a.e().k(this.x.d()).x = null;
            if (this.B != null) {
                this.B.b(true);
            }
        } else {
            com.sankuai.waimai.store.order.a.e().c(this.x.d(), new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.2
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e350c1c21aa1000b26b898ced078aa12", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e350c1c21aa1000b26b898ced078aa12");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "197a5f8ac32fab5561cfc174c55d83e5", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "197a5f8ac32fab5561cfc174c55d83e5");
                    } else {
                        d.this.w();
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "a7f20bec2c176fdee3e4da4a2b808f67", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "a7f20bec2c176fdee3e4da4a2b808f67");
                    } else {
                        d.this.w();
                    }
                }
            });
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
        Object[] objArr = {context, view, str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84a20e2e882dacbb038c746006bb5469", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84a20e2e882dacbb038c746006bb5469");
        } else {
            a(context, view, str, goodsSpu, (GoodsPoiCategory) null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Context context, final View view, String str, final GoodsSpu goodsSpu, final GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {context, view, str, goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8bed5dc2b17843b3553e6aa1f88f6bae", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8bed5dc2b17843b3553e6aa1f88f6bae");
        } else if (context == null || goodsSpu == null) {
        } else {
            com.sankuai.waimai.store.order.a.e().a(str, goodsSpu, (GoodsSku) com.sankuai.shangou.stone.util.a.a((List<Object>) goodsSpu.getSkuList(), 0), (GoodsAttr[]) null, new com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b() { // from class: com.sankuai.waimai.store.goods.list.delegate.impl.d.3
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "84a7ecdeca7c768a7a53336ef038e2b0", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "84a7ecdeca7c768a7a53336ef038e2b0");
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.platform.domain.core.shopcart.b bVar) {
                    Object[] objArr2 = {bVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "045e42395c60fe81ae1f24c58ec0118c", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "045e42395c60fe81ae1f24c58ec0118c");
                        return;
                    }
                    d dVar = d.this;
                    View view2 = view;
                    Object[] objArr3 = {view2};
                    ChangeQuickRedirect changeQuickRedirect3 = d.b;
                    if (PatchProxy.isSupport(objArr3, dVar, changeQuickRedirect3, false, "9ff9ce8cb1f480feadb5bbe8b8101851", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, dVar, changeQuickRedirect3, false, "9ff9ce8cb1f480feadb5bbe8b8101851");
                    } else {
                        com.sankuai.waimai.store.shopping.cart.f.a().a(view2, dVar.x.d());
                    }
                    d.this.B.a(goodsSpu);
                    d dVar2 = d.this;
                    GoodsSpu goodsSpu2 = goodsSpu;
                    GoodsPoiCategory goodsPoiCategory2 = goodsPoiCategory;
                    Object[] objArr4 = {goodsSpu2, goodsPoiCategory2};
                    ChangeQuickRedirect changeQuickRedirect4 = d.b;
                    if (PatchProxy.isSupport(objArr4, dVar2, changeQuickRedirect4, false, "33e4261123e74047da0a5cf1bac23e69", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, dVar2, changeQuickRedirect4, false, "33e4261123e74047da0a5cf1bac23e69");
                    } else if (dVar2.x == null || !dVar2.x.c) {
                    } else {
                        com.meituan.android.bus.a.a().c(new a(dVar2.x, goodsSpu2, null, goodsPoiCategory2, false, dVar2.x.f()));
                    }
                }

                @Override // com.sankuai.waimai.store.platform.domain.core.shopcart.callback.b
                public final void a(com.sankuai.waimai.store.exceptions.a aVar) {
                    Object[] objArr2 = {aVar};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "4fd0f97ac65720220512971f8b5a5630", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "4fd0f97ac65720220512971f8b5a5630");
                    } else if (TextUtils.isEmpty(aVar.getMessage())) {
                    } else {
                        am.a((Activity) d.this.y, aVar.getMessage());
                    }
                }
            });
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes5.dex */
    public static class a {
        public final com.sankuai.waimai.store.platform.domain.manager.poi.a a;
        public final GoodsSpu b;
        public final GoodsSku c;
        public final GoodsPoiCategory d;
        public final long e;
        public final boolean f;

        public a(com.sankuai.waimai.store.platform.domain.manager.poi.a aVar, GoodsSpu goodsSpu, GoodsSku goodsSku, GoodsPoiCategory goodsPoiCategory, boolean z, long j) {
            this.b = goodsSpu;
            this.c = goodsSku;
            this.d = goodsPoiCategory;
            this.a = aVar;
            this.e = j;
            this.f = z;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Activity activity, GoodsSpu goodsSpu, Map map) {
        Object[] objArr = {activity, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fca66cea89b29455799f45497ce56e29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fca66cea89b29455799f45497ce56e29");
        } else if (activity == null || goodsSpu == null) {
        } else {
            int v = this.x.v();
            Poi poi = this.x.b;
            Object[] objArr2 = {activity, Integer.valueOf(v), goodsSpu, poi, map};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.router.g.a;
            if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "d4fca0ed822f53f6aaddefd57569e6d3", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "d4fca0ed822f53f6aaddefd57569e6d3");
            } else {
                com.sankuai.waimai.store.router.g.a(activity, v, goodsSpu, (GoodsSku) null, poi, map);
            }
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
        Object[] objArr = {goodsSpu, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8b5925c0ee283c1b45bf44698647f563", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8b5925c0ee283c1b45bf44698647f563");
        } else {
            com.sankuai.waimai.store.router.g.a(this.y, j, str, goodsSpu, str2);
        }
    }

    void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9290b4ecb26ce1effe6ee3e06799d0da", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9290b4ecb26ce1effe6ee3e06799d0da");
            return;
        }
        if (this.S == null) {
            this.S = new com.sankuai.waimai.store.consultation.a(this.y, l(), b(), "");
            this.S.a((ViewGroup) this.y.findViewById(R.id.drug_consultation_entry));
        }
        GetMenuResponse getMenuResponse = (GetMenuResponse) this.E.a("restaurant_menu_data", (Class<Object>) GetMenuResponse.class);
        this.S.a(getMenuResponse == null ? null : getMenuResponse.drugImEntranceEntity, 30, this.c, "");
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final SCShopCartDelegate n() {
        return this.B;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "32c44bb2698794d17f96cfc73b823082", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "32c44bb2698794d17f96cfc73b823082");
            return;
        }
        boolean z = (this.x.z() || u() || !aa.a(this.y.getIntent(), "isopenshopcart", false) || this.x.b.isHideShoppingCar) ? false : true;
        if (this.H != null && this.H.isSuperOrder) {
            z = (this.x.z() || u() || !com.sankuai.waimai.store.goods.list.utils.d.a(this.y.getIntent(), "isopenshopcart", "isopenshopcart", false) || this.x.b.isHideShoppingCar) ? false : true;
        }
        if (this.B != null) {
            this.B.b(true);
            this.B.a(z);
            this.B.h();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, Poi poi) {
        Object[] objArr = {goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eed5f7ae6f45d0c451c5cf787676f778", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eed5f7ae6f45d0c451c5cf787676f778");
        } else if (goodsSpu == null || poi == null) {
        } else {
            com.sankuai.waimai.store.router.g.a(this.y, poi.getId(), poi.getStringPoiId(), goodsSpu);
        }
    }
}
