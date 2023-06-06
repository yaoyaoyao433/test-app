package com.sankuai.waimai.business.page.kingkong.future.tabfeed;

import android.app.Dialog;
import android.content.Context;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import com.google.gson.Gson;
import com.meituan.android.common.statistics.utils.AppUtil;
import com.meituan.android.cube.pga.common.f;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.common.list.ai.g;
import com.sankuai.waimai.business.page.common.second.b;
import com.sankuai.waimai.business.page.home.list.future.mach.RateCrownTagProcessor;
import com.sankuai.waimai.business.page.kingkong.future.ai.a;
import com.sankuai.waimai.business.page.kingkong.future.bean.FKKJsonData;
import com.sankuai.waimai.business.page.kingkong.future.bean.FkkPageInfo;
import com.sankuai.waimai.business.page.kingkong.future.bean.FooterStatusBean;
import com.sankuai.waimai.business.page.kingkong.future.bean.ResponseMsgBean;
import com.sankuai.waimai.business.page.kingkong.future.bean.ScrollToOffsetBean;
import com.sankuai.waimai.business.page.kingkong.future.network.b;
import com.sankuai.waimai.irmo.mach.effect.WmEffectTagProcessor;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.mach.component.scroller.ScrollerTagProcessor;
import com.sankuai.waimai.mach.component.swiper.SwiperTagProcessor;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.mach.tag.DynamicTagProcessor;
import com.sankuai.waimai.platform.mach.webpimage.WebpImageTagProcessor;
import com.sankuai.waimai.rocks.model.RocksServerModel;
import com.sankuai.waimai.rocks.page.tablist.rocklist.a;
import com.sankuai.waimai.rocks.page.tablist.rocklist.b;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
import com.sankuai.waimai.rocks.view.mach.d;
import com.sankuai.waimai.store.repository.model.ConfigInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class d extends com.sankuai.waimai.rocks.page.tablist.rocklist.e {
    public static ChangeQuickRedirect o;
    FragmentActivity A;
    boolean B;
    private Map<String, Object> F;
    private com.sankuai.waimai.business.page.kingkong.future.network.b G;
    private com.sankuai.waimai.business.page.common.net.request.a H;
    private boolean I;
    private f J;
    private com.meituan.android.cube.pga.block.a K;
    boolean p;
    com.sankuai.waimai.business.page.kingkong.a q;
    com.sankuai.waimai.business.page.kingkong.future.network.d r;
    int s;
    boolean t;
    int u;
    String v;
    com.sankuai.waimai.business.page.kingkong.future.ai.a w;
    int x;
    boolean y;
    final Dialog z;

    public d(com.sankuai.waimai.business.page.kingkong.a aVar, com.sankuai.waimai.rocks.page.tablist.rocklist.f fVar, FkkTabItem fkkTabItem, int i, Map<String, Object> map) {
        super(fVar, aVar.a());
        Object[] objArr = {aVar, fVar, fkkTabItem, Integer.valueOf(i), map};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b53d1000a6527e9456acacbf9f04a1c8", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b53d1000a6527e9456acacbf9f04a1c8");
            return;
        }
        this.t = false;
        this.w = new com.sankuai.waimai.business.page.kingkong.future.ai.a();
        this.x = 0;
        this.F = map;
        this.q = aVar;
        this.A = this.q.b();
        this.z = com.sankuai.waimai.platform.widget.dialog.a.a(this.A, 0, 0);
        com.sankuai.waimai.platform.widget.dialog.a.b(this.z);
        this.G = new com.sankuai.waimai.business.page.kingkong.future.network.b(this.q);
        com.sankuai.waimai.business.page.kingkong.future.network.e eVar = aVar.u.a().b;
        if (eVar != null) {
            com.sankuai.waimai.business.page.kingkong.future.ai.a aVar2 = this.w;
            Object[] objArr2 = {aVar2};
            ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.kingkong.future.network.e.a;
            if (PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "570655844dda9ae65033596861232300", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "570655844dda9ae65033596861232300");
            } else {
                eVar.c = aVar2;
                if (eVar.c != null) {
                    eVar.d = eVar.c.c;
                }
            }
            this.H = eVar.b(1);
        }
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = o;
        if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "da3bd6567a035d4059698b711edd35f2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "da3bd6567a035d4059698b711edd35f2");
            return;
        }
        this.q.aa.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr4 = {num2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a8daac1c774328c78c74fa1a581ba8d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a8daac1c774328c78c74fa1a581ba8d9");
                } else {
                    d.this.x = num2.intValue();
                }
            }
        });
        this.q.S.a(new com.meituan.android.cube.pga.action.b<Integer>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.3
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Integer num) {
                Integer num2 = num;
                Object[] objArr4 = {num2};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "269691e78e5c8aabfb76a5f38dc887ce", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "269691e78e5c8aabfb76a5f38dc887ce");
                } else {
                    d.this.b(num2.intValue());
                }
            }
        }).a(v());
        this.q.F.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.4
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar3) {
                b.a aVar4 = aVar3;
                Object[] objArr4 = {aVar4};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a41a0453adfc3d5118f218662952d562", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a41a0453adfc3d5118f218662952d562");
                } else if (aVar4 != null) {
                    try {
                        if (d.this.D != null && d.this.D.h != null) {
                            if (d.this.t) {
                                aVar4.h = new ArrayList(d.this.D.h.b);
                            } else {
                                aVar4.h = null;
                            }
                            RecyclerView recyclerView = d.this.D.g;
                            if (recyclerView != null && recyclerView.getLayoutManager() != null) {
                                aVar4.e = ((LinearLayoutManager) recyclerView.getLayoutManager()).findFirstVisibleItemPosition();
                            }
                            aVar4.i = new FooterStatusBean(d.this.u, d.this.v);
                            aVar4.j = d.this.x;
                            aVar4.k = d.this.w.c.d;
                            aVar4.l = d.this.w.c.c;
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }).a(v());
        this.q.D.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar3) {
                b.a aVar4 = aVar3;
                boolean z = true;
                Object[] objArr4 = {aVar4};
                ChangeQuickRedirect changeQuickRedirect4 = a;
                if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "24178adf8a4b22bba07fc86da345d2f8", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "24178adf8a4b22bba07fc86da345d2f8");
                } else if (aVar4 != null) {
                    try {
                        if (d.this.D != null && d.this.D.h != null && aVar4.h != null) {
                            if (!com.sankuai.waimai.foundation.utils.d.a(aVar4.h)) {
                                d.this.t = true;
                                if (d.this.D.G().o != null) {
                                    d.this.D.G().o = aVar4.h;
                                }
                                com.sankuai.waimai.rocks.view.recyclerview.a aVar5 = d.this.D.h;
                                List<com.sankuai.waimai.rocks.view.viewmodel.e> list = aVar4.h;
                                Object[] objArr5 = {list};
                                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.rocks.view.recyclerview.a.a;
                                if (PatchProxy.isSupport(objArr5, aVar5, changeQuickRedirect5, false, "20ec2a171898b92fd83d1166ff4c7ed2", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr5, aVar5, changeQuickRedirect5, false, "20ec2a171898b92fd83d1166ff4c7ed2");
                                } else {
                                    aVar5.b.clear();
                                    aVar5.b.addAll(list);
                                    aVar5.notifyDataSetChanged();
                                }
                                d.this.r.a();
                            } else {
                                d.this.t = false;
                            }
                            if (aVar4.i != null) {
                                d.this.a(aVar4.i.status, aVar4.i.text);
                                if (d.this.D.G() != null) {
                                    com.sankuai.waimai.rocks.view.viewmodel.d G = d.this.D.G();
                                    if (aVar4.i.status == 3) {
                                        z = false;
                                    }
                                    G.r = z;
                                }
                            }
                            if (d.this.q.H.a().b() && d.this.q.I.a().b() && !com.sankuai.waimai.platform.privacy.a.a().b()) {
                                d.this.q.X.a((com.meituan.android.cube.pga.common.b<ScrollToOffsetBean>) new ScrollToOffsetBean(aVar4.e, d.this.q.A.a().a(0) - com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.d));
                            }
                            d.this.q.aa.a((j<Integer>) Integer.valueOf(aVar4.j));
                            d.this.w.c.d = aVar4.k;
                            d.this.w.c.a(aVar4.l);
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }).a(v());
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final void a(com.sankuai.waimai.rocks.page.a aVar, NestedRecyclerView nestedRecyclerView) {
        Object[] objArr = {aVar, nestedRecyclerView};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a3764ce23b1d36e0cb093c41bed176c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a3764ce23b1d36e0cb093c41bed176c");
            return;
        }
        super.a(aVar, nestedRecyclerView);
        com.sankuai.waimai.business.page.home.preload.machpreload.b.a(this.E, com.sankuai.waimai.business.page.kingkong.future.network.preload.b.a().c);
        if (this.c == 0 || ((com.sankuai.waimai.rocks.page.tablist.rocklist.f) this.c).a == null || ((com.sankuai.waimai.rocks.page.tablist.rocklist.f) this.c).a.module_list_header == null) {
            return;
        }
        this.K = com.sankuai.waimai.rocks.utils.a.a(this.D.F(), "module_list_header");
        a(this.K);
        this.K.c(((com.sankuai.waimai.rocks.page.tablist.rocklist.f) this.c).a.module_list_header);
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final void a(boolean z) {
        com.sankuai.waimai.rocks.page.tablist.rocklist.f fVar;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "235008c2a2b9ad2f4d091f4ab6d46985", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "235008c2a2b9ad2f4d091f4ab6d46985");
            return;
        }
        super.a(z);
        this.I = z;
        if (!z) {
            this.r.a(false);
            if (this.c != 0 && ((com.sankuai.waimai.rocks.page.tablist.rocklist.f) this.c).a != null) {
                FkkPageInfo a = a(((com.sankuai.waimai.rocks.page.tablist.rocklist.f) this.c).a);
                if (a == null || !a.has_next_page) {
                    this.B = true;
                } else {
                    a(1, "努力加载中...");
                }
                if (!com.sankuai.waimai.foundation.utils.d.a(((com.sankuai.waimai.rocks.page.tablist.rocklist.f) this.c).a.moduleList)) {
                    this.t = true;
                } else {
                    this.t = false;
                    this.r.a("", "EMPTY_POI_LIST", null);
                    this.y = true;
                    c(2);
                }
                com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_render_start", new boolean[0]);
                com.sankuai.waimai.business.page.kingkong.future.network.preload.a.a().b = (com.sankuai.waimai.rocks.page.tablist.rocklist.f) this.c;
                com.sankuai.waimai.business.page.kingkong.future.network.preload.a a2 = com.sankuai.waimai.business.page.kingkong.future.network.preload.a.a();
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.kingkong.future.network.preload.a.a;
                if (PatchProxy.isSupport(objArr2, a2, changeQuickRedirect2, false, "98980a4aba697ea8006e9f1ea0ab5896", RobustBitConfig.DEFAULT_VALUE)) {
                    fVar = (com.sankuai.waimai.rocks.page.tablist.rocklist.f) PatchProxy.accessDispatch(objArr2, a2, changeQuickRedirect2, false, "98980a4aba697ea8006e9f1ea0ab5896");
                } else {
                    a2.c = a2.e ? 3 : 4;
                    if (a2.b == null || a2.b.a == null || a2.b.a.moduleList == null || a2.b.a.moduleList.size() < a2.c) {
                        fVar = a2.b;
                    } else {
                        a2.d = new ArrayList(a2.b.a.moduleList);
                        a2.b.a.moduleList = new ArrayList(a2.d.subList(0, a2.c));
                        fVar = a2.b;
                    }
                }
                a(fVar);
                return;
            }
            this.y = true;
            this.r.a("", "NET_ERROR", null);
        } else if (com.sankuai.waimai.platform.privacy.a.a().b() || this.y) {
        } else {
            this.y = true;
            b(3);
        }
    }

    void b(final int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "59e15cdea5789ec28ef9f928a5f798e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "59e15cdea5789ec28ef9f928a5f798e6");
            return;
        }
        this.s = i;
        new com.sankuai.waimai.business.page.kingkong.future.network.b(this.q).a(i, new b.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.business.page.kingkong.future.network.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "fca129cd0cc91abb37beee8aee81387d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "fca129cd0cc91abb37beee8aee81387d");
                    return;
                }
                if (i == 3) {
                    d.this.a(1, "努力加载中...");
                }
                if (i == 3 || i == 6 || d.this.z == null || d.this.z.isShowing() || d.this.A == null || d.this.A.isFinishing()) {
                    return;
                }
                d.this.z.show();
            }

            @Override // com.sankuai.waimai.business.page.kingkong.future.network.b.a
            public final void a(Throwable th) {
                boolean z = true;
                Object[] objArr2 = {th};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "327c2cab565182b0be2d065a787e55df", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "327c2cab565182b0be2d065a787e55df");
                    return;
                }
                String message = th.getMessage();
                if (i == 3) {
                    d.this.a(4, "加载错误，下拉重试");
                } else {
                    d dVar = d.this;
                    int i2 = i;
                    if (i2 != 1 && i2 != 2) {
                        z = false;
                    }
                    if (z) {
                        d.this.r.a();
                    }
                    d.this.r.a("", message, new b.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.1.1
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.b.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "2383a4aad23a79c34ab145bad583758b", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "2383a4aad23a79c34ab145bad583758b");
                            } else {
                                d.this.b(d.this.s);
                            }
                        }
                    });
                }
                com.sankuai.waimai.platform.widget.dialog.a.b(d.this.z);
                d.this.y = false;
                d.this.t = false;
            }

            @Override // com.sankuai.waimai.business.page.kingkong.future.network.b.a
            public final void a(BaseResponse<RocksServerModel> baseResponse) throws JSONException {
                int i2;
                int i3 = 0;
                Object[] objArr2 = {baseResponse};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "95c3c77f6f267a02c2a457ee447a52ed", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "95c3c77f6f267a02c2a457ee447a52ed");
                } else if (baseResponse != null && baseResponse.data != null && baseResponse.code == 0) {
                    if (com.sankuai.waimai.foundation.utils.d.a(baseResponse.data.moduleList)) {
                        d.this.t = false;
                    } else {
                        d.this.t = true;
                    }
                    com.sankuai.waimai.rocks.page.tablist.rocklist.f fVar = new com.sankuai.waimai.rocks.page.tablist.rocklist.f();
                    d dVar = d.this;
                    int i4 = i;
                    fVar.d = i4 == 3 || i4 == 6;
                    fVar.e = true;
                    FkkPageInfo a2 = d.this.a(baseResponse.data);
                    boolean z = a2 != null ? a2.has_next_page : false;
                    fVar.c = z;
                    fVar.a = baseResponse.data;
                    if (z) {
                        d.this.a(1, "努力加载中...");
                    } else {
                        d.this.B = true;
                    }
                    if (i == 6) {
                        com.sankuai.waimai.business.page.kingkong.future.ai.a aVar = d.this.w;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.business.page.kingkong.future.ai.a.a;
                        if (PatchProxy.isSupport(objArr3, aVar, changeQuickRedirect3, false, "bc4dffd51463f58cb95072e63a02062e", RobustBitConfig.DEFAULT_VALUE)) {
                            i3 = ((Integer) PatchProxy.accessDispatch(objArr3, aVar, changeQuickRedirect3, false, "bc4dffd51463f58cb95072e63a02062e")).intValue();
                        } else {
                            a.b bVar = aVar.c;
                            Object[] objArr4 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect4 = a.b.a;
                            if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "2dbfbce298f977bd312b763c71680bc3", RobustBitConfig.DEFAULT_VALUE)) {
                                i2 = ((Integer) PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "2dbfbce298f977bd312b763c71680bc3")).intValue();
                            } else {
                                int i5 = bVar.b + 1 + g.a().b;
                                i2 = bVar.b < i5 ? i5 : -1;
                            }
                            if (i2 != -1 && aVar.e != null && aVar.e.u() > i2) {
                                i3 = aVar.e.u() - i2;
                            }
                        }
                        fVar.f = i3;
                        fVar.d = true;
                    }
                    d.this.a(fVar);
                } else {
                    d.this.t = false;
                    d.this.y = false;
                    if (i == 3) {
                        d.this.c(4);
                    }
                }
            }
        });
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final Map<String, Object> n() {
        return this.F;
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final com.sankuai.waimai.rocks.view.recyclerview.footer.a o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "99dc8e656ba9c052112daf5f1937724a", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.recyclerview.footer.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "99dc8e656ba9c052112daf5f1937724a") : new com.sankuai.waimai.platform.rocks.view.b();
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final com.sankuai.waimai.rocks.page.tablist.rocklist.a p() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14d70a6ee68d16e032104f36deb960e7", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.page.tablist.rocklist.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14d70a6ee68d16e032104f36deb960e7") : new com.sankuai.waimai.rocks.page.tablist.rocklist.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.6
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.a
            public final com.sankuai.waimai.rocks.page.tablist.rocklist.b a(Context context, a.EnumC1131a enumC1131a) {
                Object[] objArr2 = {context, enumC1131a};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5a9aec78d76e8a79a3cc4842cb47d686", RobustBitConfig.DEFAULT_VALUE)) {
                    return (com.sankuai.waimai.rocks.page.tablist.rocklist.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5a9aec78d76e8a79a3cc4842cb47d686");
                }
                d.this.r = new com.sankuai.waimai.business.page.kingkong.future.network.d(context, d.this.q, true);
                return d.this.r;
            }
        };
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final void q() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e528a90ac349f3e8542f3f6a7cd330f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e528a90ac349f3e8542f3f6a7cd330f");
            return;
        }
        com.sankuai.waimai.platform.widget.dialog.a.b(this.z);
        com.sankuai.waimai.rocks.page.tablist.rocklist.f fVar = null;
        if (!this.q.ag.a().b.booleanValue()) {
            this.q.Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(null, 0, -1));
        }
        if (this.D != null && this.w != null && this.w.c != null) {
            this.w.e = this.D;
            this.w.c.d = this.D.u();
        }
        if (this.B) {
            c(3);
            this.B = false;
        }
        if (this.r != null && this.t) {
            this.r.a();
        }
        this.y = false;
        if (this.s == 5) {
            this.q.x.a((com.meituan.android.cube.pga.common.b<Void>) null);
            this.q.y.a((com.meituan.android.cube.pga.common.b<Integer>) 1);
        }
        if (this.s == 4 && !com.sankuai.waimai.platform.privacy.a.a().b()) {
            this.q.X.a((com.meituan.android.cube.pga.common.b<ScrollToOffsetBean>) new ScrollToOffsetBean(0, this.q.H.a().b() ? this.q.A.a().a(0) - com.sankuai.waimai.business.page.kingkong.view.poilist.categorytabblock.b.d : 0));
        }
        com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().a("fkk_render_end", true);
        if (this.I) {
            return;
        }
        this.I = true;
        com.sankuai.waimai.business.page.kingkong.future.network.preload.a a = com.sankuai.waimai.business.page.kingkong.future.network.preload.a.a();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.business.page.kingkong.future.network.preload.a.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect2, false, "f3bf95bfb4d2bae724b1329a13fd2e25", RobustBitConfig.DEFAULT_VALUE)) {
            fVar = (com.sankuai.waimai.rocks.page.tablist.rocklist.f) PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect2, false, "f3bf95bfb4d2bae724b1329a13fd2e25");
        } else if (a.b != null && a.d != null && a.d.size() > a.c) {
            a.b.a.moduleList = new ArrayList(a.d.subList(a.c, a.d.size()));
            fVar = a.b;
        }
        if (fVar != null) {
            fVar.d = true;
            a(fVar);
        }
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final void r() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "30559279f84ee53ffd67b2a674888e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "30559279f84ee53ffd67b2a674888e53");
            return;
        }
        this.y = false;
        com.sankuai.waimai.platform.widget.dialog.a.b(this.z);
        this.q.Y.a((com.meituan.android.cube.pga.common.b<ResponseMsgBean>) new ResponseMsgBean(null, -1, -1));
        this.r.a("", "NET_ERROR", null);
        com.sankuai.waimai.business.page.kingkong.future.monitor.b.a().c();
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final com.sankuai.waimai.rocks.view.mach.d s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9c28f3f1ca7b31d14dbf16747f1a4ad9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.mach.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9c28f3f1ca7b31d14dbf16747f1a4ad9") : new com.sankuai.waimai.rocks.view.mach.d(new d.a() { // from class: com.sankuai.waimai.business.page.kingkong.future.tabfeed.d.7
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.mach.d.a
            public final Mach.a a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5129a6bb5b661f100d1d14383234827f", RobustBitConfig.DEFAULT_VALUE)) {
                    return (Mach.a) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5129a6bb5b661f100d1d14383234827f");
                }
                Mach.a aVar = new Mach.a();
                aVar.b = d.this.q.a();
                aVar.f = new com.sankuai.waimai.business.page.home.list.future.mach.c();
                aVar.e = new com.sankuai.waimai.business.page.home.list.mach.a("waimai_future_kingkong_list_image", "fail", "future kingkong list image load error!", 10001, 10002, "waimai_pic_future_kingkong_try", 10001, 10002, "waimai_pic_future_kingkong_first");
                aVar.d = new com.sankuai.waimai.business.page.kingkong.future.mach.a("c_i5kxn8l", AppUtil.generatePageInfoKey(this), d.this.w, d.this.q);
                aVar.l = new com.sankuai.waimai.business.page.kingkong.future.mach.b(d.this.q, null);
                return aVar.a(new WebpImageTagProcessor()).a(new DynamicTagProcessor()).a(new ScrollerTagProcessor()).a(new RateCrownTagProcessor()).a(new SwiperTagProcessor()).a(new WmEffectTagProcessor()).a(new com.sankuai.waimai.platform.mach.statistics.d(d.this.q.b()));
            }
        });
    }

    private FkkPageInfo b(RocksServerModel rocksServerModel) {
        FKKJsonData fKKJsonData;
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1327021e0d33aa881ce68fd4d3206a1c", RobustBitConfig.DEFAULT_VALUE)) {
            return (FkkPageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1327021e0d33aa881ce68fd4d3206a1c");
        }
        if (rocksServerModel.jsonData != null) {
            Map<String, Object> map = rocksServerModel.jsonData;
            Object[] objArr2 = {map};
            ChangeQuickRedirect changeQuickRedirect2 = o;
            if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "49296d5ad89d0d161af5dad59f46f85d", RobustBitConfig.DEFAULT_VALUE)) {
                fKKJsonData = (FKKJsonData) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "49296d5ad89d0d161af5dad59f46f85d");
            } else {
                Gson gson = new Gson();
                fKKJsonData = (FKKJsonData) gson.fromJson(gson.toJson(map), (Class<Object>) FKKJsonData.class);
            }
            if (fKKJsonData != null) {
                return fKKJsonData.pageInfo;
            }
            return null;
        }
        return null;
    }

    FkkPageInfo a(RocksServerModel rocksServerModel) {
        Object[] objArr = {rocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "70cdc28f2bebb7ee39edc10e5dc1528b", RobustBitConfig.DEFAULT_VALUE)) {
            return (FkkPageInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "70cdc28f2bebb7ee39edc10e5dc1528b");
        }
        FkkPageInfo b = b(rocksServerModel);
        if (b != null) {
            if (this.H != null) {
                this.H.p = b.rank_trace_id;
                this.F.put("rank_list_id", this.H.q);
                this.F.put(ConfigInfo.MODULE_KING_KONG, "1");
                Map<String, Object> map = this.F;
                StringBuilder sb = new StringBuilder();
                sb.append(this.H.f);
                map.put("sort", sb.toString());
                this.F.put("filter", Long.valueOf(this.H.h));
                this.F.put("category_code", Long.valueOf(this.H.g));
                this.F.put("fst_cate_id", Long.valueOf(this.H.g));
                Map<String, Object> map2 = this.F;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(this.H.i);
                map2.put("sec_cate_id", sb2.toString());
                this.F.put("seqNumber", Integer.valueOf(this.H.r));
            }
            this.F.put("is_rank", Integer.valueOf(b.is_rank));
            this.F.put("rank_trace_id", b.rank_trace_id);
        }
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0a859d782685fdbabf183328b7c7055", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0a859d782685fdbabf183328b7c7055");
        } else {
            a(i, "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, String str) {
        Object[] objArr = {Integer.valueOf(i), str};
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "eb9d56e5f121d134cc7b9372851dc892", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "eb9d56e5f121d134cc7b9372851dc892");
        } else if (this.D != null) {
            this.u = i;
            this.v = str;
            this.D.a(i, str);
        }
    }

    private f v() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8762ea57aca7fd6f446f84e997c927cf", RobustBitConfig.DEFAULT_VALUE)) {
            return (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8762ea57aca7fd6f446f84e997c927cf");
        }
        if (this.J == null) {
            this.J = new f();
        }
        return this.J;
    }

    @Override // com.sankuai.waimai.rocks.page.tablist.rocklist.e
    public final void t() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = o;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "60c235828ffe73c0c0205ff4b1fe52e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "60c235828ffe73c0c0205ff4b1fe52e9");
            return;
        }
        super.t();
        if (this.J != null) {
            this.J.a();
        }
        if (this.K != null) {
            this.K = null;
        }
    }
}
