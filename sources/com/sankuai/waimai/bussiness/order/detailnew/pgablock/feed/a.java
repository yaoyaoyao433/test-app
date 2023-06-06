package com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed;

import android.support.constraint.R;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.android.cube.pga.common.j;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.net.OrderApi;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.endarea.a;
import com.sankuai.waimai.bussiness.order.rocks.e;
import com.sankuai.waimai.bussiness.order.rocks.k;
import com.sankuai.waimai.bussiness.order.rocks.n;
import com.sankuai.waimai.foundation.utils.ae;
import com.sankuai.waimai.mach.Mach;
import com.sankuai.waimai.platform.capacity.log.i;
import com.sankuai.waimai.platform.capacity.network.retrofit.BaseResponse;
import com.sankuai.waimai.platform.utils.h;
import com.sankuai.waimai.rocks.page.view.NestedRecyclerView;
import com.sankuai.waimai.rocks.view.a;
import com.sankuai.waimai.rocks.view.recyclerview.b;
import java.util.List;
import rx.functions.g;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"waimai_order_status_feed_flow_style_1"}, viewModel = a.b.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a<b, Object, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;
    private boolean A;
    protected com.sankuai.waimai.rocks.view.a s;
    boolean t;
    private NestedRecyclerView u;
    private k v;
    private int w;
    private n x;
    private d y;
    private boolean z;

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e75cfc781136554bad95b9e08ea39269", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e75cfc781136554bad95b9e08ea39269") : new b(m());
    }

    public static /* synthetic */ String a(a aVar, com.sankuai.waimai.platform.modular.network.error.a aVar2, String str) {
        Object[] objArr = {aVar2, str};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "ab6a6f665917e6218e5d773a5f196022", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "ab6a6f665917e6218e5d773a5f196022");
        }
        if (aVar2 != null) {
            if (aVar2.d() != null && !TextUtils.isEmpty(aVar2.d().getMessage())) {
                str = aVar2.d().getMessage();
            } else if (!TextUtils.isEmpty(aVar2.getMessage())) {
                str = aVar2.getMessage();
            }
            String a = h.a(aVar.m(), aVar2);
            return !TextUtils.isEmpty(a) ? a : str;
        }
        return str;
    }

    public static /* synthetic */ void a(a aVar, int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "315a3b7a82c91377cbec17aeaee0b637", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "315a3b7a82c91377cbec17aeaee0b637");
        } else if (aVar.A) {
        } else {
            aVar.A = true;
            rx.d.a(new com.sankuai.waimai.platform.capacity.network.rxsupport.b<n>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.11
                public static ChangeQuickRedirect a;

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final /* synthetic */ void a(n nVar) {
                    n nVar2 = nVar;
                    Object[] objArr2 = {nVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "797f1feadc11c76fe544b929dc08b95f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "797f1feadc11c76fe544b929dc08b95f");
                        return;
                    }
                    a.g(a.this);
                    a.this.x.moduleList.addAll(nVar2.moduleList);
                    a.this.x.h = nVar2.h;
                    a.a(a.this, true);
                }

                @Override // com.sankuai.waimai.platform.capacity.network.rxsupport.b
                public final void a(com.sankuai.waimai.platform.modular.network.error.a aVar2) {
                    Object[] objArr2 = {aVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5207aeb4e70fa1a2b609484975ed8677", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5207aeb4e70fa1a2b609484975ed8677");
                        return;
                    }
                    a.b(a.this, false);
                    ae.a(a.this.m(), a.a(a.this, aVar2, "加载失败，请重试"));
                    a.this.s.d.c(4);
                    i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_feed_flow_view").b(com.sankuai.waimai.platform.widget.emptylayout.c.a(aVar2)).c(a.a(a.this, aVar2, "order_status_feed_flow_request_exception")).b());
                }
            }, ((OrderApi) com.sankuai.waimai.platform.capacity.network.retrofit.b.a((Class<Object>) OrderApi.class)).getOrderStatusFeedFlowInfo(((com.sankuai.waimai.bussiness.order.detailnew.a) aVar.F()).C.a(), com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) aVar.F()).D.a()), "c_hgowsqb", 20, i).b(rx.schedulers.a.e()).c(new g<BaseResponse<n>, rx.d<n>>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.2
                public static ChangeQuickRedirect a;

                @Override // rx.functions.g
                public final /* synthetic */ rx.d<n> call(BaseResponse<n> baseResponse) {
                    BaseResponse<n> baseResponse2 = baseResponse;
                    Object[] objArr2 = {baseResponse2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "352c75ca5b8eadeabe9877ed9ccf71c6", RobustBitConfig.DEFAULT_VALUE)) {
                        return (rx.d) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "352c75ca5b8eadeabe9877ed9ccf71c6");
                    }
                    if (!baseResponse2.isSuccess()) {
                        throw new com.sankuai.waimai.platform.modular.network.error.a(baseResponse2.code, baseResponse2.msg);
                    }
                    if (baseResponse2.data.moduleList == null || baseResponse2.data.moduleList.isEmpty()) {
                        throw new com.sankuai.waimai.platform.modular.network.error.a(0, "数据异常，请重试");
                    }
                    return rx.d.a(baseResponse2.data);
                }
            }).a(rx.android.schedulers.a.a()));
        }
    }

    public static /* synthetic */ void a(a aVar, final boolean z) {
        boolean z2;
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "a426c227005ce953ff883bfa624f9109", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "a426c227005ce953ff883bfa624f9109");
            return;
        }
        aVar.z = z;
        Object[] objArr2 = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, aVar, changeQuickRedirect2, false, "a97644833bb7a4d2ad43c6403093386d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, aVar, changeQuickRedirect2, false, "a97644833bb7a4d2ad43c6403093386d");
        } else if (!z) {
            n nVar = aVar.x;
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = n.e;
            if (PatchProxy.isSupport(objArr3, nVar, changeQuickRedirect3, false, "0843dfd1f33a8f253ca983629a5b4d45", RobustBitConfig.DEFAULT_VALUE)) {
                z2 = ((Boolean) PatchProxy.accessDispatch(objArr3, nVar, changeQuickRedirect3, false, "0843dfd1f33a8f253ca983629a5b4d45")).booleanValue();
            } else {
                z2 = (nVar.moduleList == null || nVar.moduleList.isEmpty()) ? false : true;
            }
            if (z2) {
                n nVar2 = aVar.x;
                Object[] objArr4 = {nVar2};
                ChangeQuickRedirect changeQuickRedirect4 = r;
                if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "8e6cd5ae0b88368071670606c80288e1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "8e6cd5ae0b88368071670606c80288e1");
                } else {
                    boolean g = nVar2.g();
                    RecyclerView.a adapter = aVar.s.d.g.getAdapter();
                    if (g) {
                        aVar.y.c(nVar2);
                        if (adapter instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
                            ((com.sankuai.waimai.rocks.view.recyclerview.a) adapter).f = aVar.y;
                        }
                    } else if (adapter instanceof com.sankuai.waimai.rocks.view.recyclerview.a) {
                        ((com.sankuai.waimai.rocks.view.recyclerview.a) adapter).f = null;
                    }
                }
            }
        }
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = r;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "098245b3282989e8b5d074a48f0bbaca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "098245b3282989e8b5d074a48f0bbaca");
        } else if (!aVar.x.e()) {
            aVar.x.h();
        }
        aVar.s.a(aVar.x, aVar.x.g(), aVar.x.e(), z, true, 0, new a.c() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.10
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a(List<com.sankuai.waimai.rocks.node.a> list) {
            }

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void a() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "809c93f7c26e926d7d6f6153475cdba2", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "809c93f7c26e926d7d6f6153475cdba2");
                    return;
                }
                ((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).aI.a((j<Boolean>) Boolean.TRUE);
                a.b(a.this, false);
                a.c(a.this, z);
                a.e(a.this);
                b bVar = (b) a.this.g;
                Object[] objArr7 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect7 = b.d;
                if (PatchProxy.isSupport(objArr7, bVar, changeQuickRedirect7, false, "ce8bb511110f8798df0810a5fb3c278a", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, bVar, changeQuickRedirect7, false, "ce8bb511110f8798df0810a5fb3c278a");
                } else if (bVar.e.c()) {
                    bVar.e.a();
                }
                final a aVar2 = a.this;
                Object[] objArr8 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect8 = a.r;
                if (PatchProxy.isSupport(objArr8, aVar2, changeQuickRedirect8, false, "67106a8b9d1dfb412d311317c530dfc3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr8, aVar2, changeQuickRedirect8, false, "67106a8b9d1dfb412d311317c530dfc3");
                } else if (!aVar2.t) {
                    aVar2.i().postDelayed(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.3
                        public static ChangeQuickRedirect a;

                        @Override // java.lang.Runnable
                        public final void run() {
                            Object[] objArr9 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect9 = a;
                            if (PatchProxy.isSupport(objArr9, this, changeQuickRedirect9, false, "1220bd6d05581f3d5e4ae824b4c2ce63", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr9, this, changeQuickRedirect9, false, "1220bd6d05581f3d5e4ae824b4c2ce63");
                                return;
                            }
                            a.d(a.this, true);
                            a.this.v.aq_();
                        }
                    }, 300L);
                }
                ((com.sankuai.waimai.bussiness.order.detailnew.a) a.this.F()).aH.a((com.meituan.android.cube.pga.common.b<Boolean>) Boolean.TRUE);
            }

            @Override // com.sankuai.waimai.rocks.view.a.c
            public final void b() {
                Object[] objArr6 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect6 = a;
                if (PatchProxy.isSupport(objArr6, this, changeQuickRedirect6, false, "c259d29bb13e90e6fc36efc0aabfcd07", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, this, changeQuickRedirect6, false, "c259d29bb13e90e6fc36efc0aabfcd07");
                    return;
                }
                a.b(a.this, false);
                i.d(new com.sankuai.waimai.bussiness.order.base.log.a().a("order_status_feed_flow_view").b("99").c("Feed流模块加载失败_页面渲染失败").b(true).b());
            }
        });
    }

    public static /* synthetic */ boolean b(a aVar, boolean z) {
        aVar.A = false;
        return false;
    }

    public static /* synthetic */ void c(a aVar, boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "994df38aed0d5a64ecba2382f280799e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "994df38aed0d5a64ecba2382f280799e");
        } else if (z) {
        } else {
            ((b) aVar.g).a(com.sankuai.waimai.bussiness.order.detailnew.util.a.a(((com.sankuai.waimai.bussiness.order.detailnew.a) aVar.F()).aE.a()), aVar.x.moduleList.size() >= 6 ? -1 : -2);
            aVar.u.post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.9
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c7fdabd7a653e28e8170f6e1ffc93aeb", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c7fdabd7a653e28e8170f6e1ffc93aeb");
                    } else {
                        a.this.u.scrollToPosition(0);
                    }
                }
            });
        }
    }

    public static /* synthetic */ boolean d(a aVar, boolean z) {
        aVar.t = true;
        return true;
    }

    public static /* synthetic */ void e(a aVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "eb826ea3eecc95d1f194f2c27debe4e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "eb826ea3eecc95d1f194f2c27debe4e6");
        } else if (!aVar.x.e()) {
            aVar.s.d.r();
        } else {
            aVar.s.d.c(1);
        }
    }

    public static /* synthetic */ int g(a aVar) {
        int i = aVar.w;
        aVar.w = i + 1;
        return i;
    }

    public a(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f0ab9d520446e399a3dc34e8c989f304", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f0ab9d520446e399a3dc34e8c989f304");
        } else {
            this.w = 1;
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f4378605dbb76007a18b8fb53c733b98", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f4378605dbb76007a18b8fb53c733b98");
            return;
        }
        super.s();
        com.sankuai.waimai.bussiness.order.detailnew.util.g.a(i());
        this.y = new d((com.sankuai.waimai.bussiness.order.detailnew.a) F());
        e eVar = new e(m());
        this.v = eVar.c;
        this.u = (NestedRecyclerView) i().findViewById(R.id.nest_rcv_order_status_feed_flow);
        com.sankuai.waimai.rocks.view.block.c cVar = (com.sankuai.waimai.rocks.view.block.c) F();
        NestedRecyclerView nestedRecyclerView = this.u;
        Mach.d a = ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aD.a();
        b.a aVar = new b.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.view.recyclerview.b.a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "32dc002b01c78e0b31658484023543a1", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "32dc002b01c78e0b31658484023543a1");
                } else if (a.this.x.e()) {
                    a.this.s.d.c(1);
                    a.a(a.this, a.this.w);
                }
            }
        };
        Object[] objArr2 = {cVar, nestedRecyclerView, a, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = e.a;
        this.s = PatchProxy.isSupport(objArr2, eVar, changeQuickRedirect2, false, "8070ead1f8fbbff2e76f33894dd59927", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.rocks.view.a) PatchProxy.accessDispatch(objArr2, eVar, changeQuickRedirect2, false, "8070ead1f8fbbff2e76f33894dd59927") : eVar.a(cVar, nestedRecyclerView, new com.sankuai.waimai.platform.rocks.view.b(), a, null, aVar);
        this.u.a(new NestedRecyclerView.b() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.4
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.rocks.page.view.NestedRecyclerView.b
            public final void a(RecyclerView recyclerView, int i) {
                Object[] objArr3 = {recyclerView, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b99cd66ed1c0fc96cbd1b30ea3d39190", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b99cd66ed1c0fc96cbd1b30ea3d39190");
                    return;
                }
                a.this.s.d.q();
                a.this.s.d.b(i);
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).V.b = new com.meituan.android.cube.pga.action.d<RecyclerView>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.5
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ RecyclerView a() {
                Object[] objArr3 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect3 = a;
                return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f61e0da11c7cbc42faa1189b4835d23b", RobustBitConfig.DEFAULT_VALUE) ? (RecyclerView) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f61e0da11c7cbc42faa1189b4835d23b") : a.this.u;
            }
        };
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aC.a(new com.meituan.android.cube.pga.action.b<n>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.6
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(n nVar) {
                n nVar2 = nVar;
                Object[] objArr3 = {nVar2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5fe69b321dbc7961de41bc8f4f988d24", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5fe69b321dbc7961de41bc8f4f988d24");
                } else if (nVar2 != null) {
                    a.this.x = nVar2;
                    a.a(a.this, false);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).t.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.7
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b9fa1830829130b5f370e4ee681ec4e9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b9fa1830829130b5f370e4ee681ec4e9");
                } else if (bool2 == null || !bool2.booleanValue()) {
                } else {
                    a.a(a.this, a.this.z);
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aF.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.feed.a.8
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Boolean bool) {
                Boolean bool2 = bool;
                Object[] objArr3 = {bool2};
                ChangeQuickRedirect changeQuickRedirect3 = a;
                if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "b46aee897d8abaaba36cddb9a52fe770", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "b46aee897d8abaaba36cddb9a52fe770");
                } else if (bool2 == null || !bool2.booleanValue()) {
                } else {
                    a.this.u.scrollToPosition(0);
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ea2b738f933395207377162807d591b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ea2b738f933395207377162807d591b");
        } else {
            super.I();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9899a1163dc2ec1dd44fed833d40e321", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9899a1163dc2ec1dd44fed833d40e321");
            return;
        }
        super.y();
        ((com.sankuai.waimai.bussiness.order.detailnew.a) F()).aI.a((j<Boolean>) Boolean.TRUE);
    }
}
