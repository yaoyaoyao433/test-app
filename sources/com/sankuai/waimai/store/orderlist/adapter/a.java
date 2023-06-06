package com.sankuai.waimai.store.orderlist.adapter;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mtimageloader.config.b;
import com.sankuai.shangou.stone.util.ImageQualityUtil;
import com.sankuai.shangou.stone.util.h;
import com.sankuai.shangou.stone.util.t;
import com.sankuai.shangou.stone.util.u;
import com.sankuai.waimai.business.order.api.model.Order;
import com.sankuai.waimai.business.order.api.model.OrderDeliverPackInfo;
import com.sankuai.waimai.business.order.api.model.SubDeliveryInfo;
import com.sankuai.waimai.store.expose.v2.entity.c;
import com.sankuai.waimai.store.orderlist.OrderListFragment;
import com.sankuai.waimai.store.orderlist.model.c;
import com.sankuai.waimai.store.orderlist.view.PoiListViewCache;
import com.sankuai.waimai.store.orderlist.viewholder.a;
import com.sankuai.waimai.store.poilist.mach.d;
import com.sankuai.waimai.store.poilist.viewholders.e;
import com.sankuai.waimai.store.poilist.viewholders.g;
import com.sankuai.waimai.store.repository.model.PoiCardInfo;
import com.sankuai.waimai.store.repository.model.f;
import com.sankuai.waimai.store.util.e;
import com.sankuai.waimai.store.util.m;
import com.sankuai.waimai.store.widgets.recycler.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.store.widgets.recycler.a<e> {
    public static ChangeQuickRedirect a;
    @NonNull
    public final List<c> b;
    protected com.sankuai.waimai.store.orderlist.helper.b c;
    protected String d;
    OrderListFragment e;
    private Context f;
    private LayoutInflater g;
    private PoiListViewCache h;
    private int i;
    private d j;
    private com.sankuai.waimai.store.param.a k;
    private a.InterfaceC1260a l;

    public a(Activity activity, OrderListFragment orderListFragment, d dVar, com.sankuai.waimai.store.param.a aVar, String str, com.sankuai.waimai.store.orderlist.listener.b bVar, Handler handler, String str2, int i) {
        Object[] objArr = {activity, orderListFragment, dVar, aVar, str, bVar, handler, str2, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e0ef672c90054974ef7b6e58cb33035a", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e0ef672c90054974ef7b6e58cb33035a");
            return;
        }
        this.b = new ArrayList();
        this.i = 0;
        this.l = new a.InterfaceC1260a() { // from class: com.sankuai.waimai.store.orderlist.adapter.a.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.orderlist.viewholder.a.InterfaceC1260a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "06374cb3b42346d3c8dda80989146f75", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "06374cb3b42346d3c8dda80989146f75");
                } else if (a.this.e != null) {
                    a.this.e.a(1);
                }
            }
        };
        this.f = activity;
        this.e = orderListFragment;
        this.g = LayoutInflater.from(activity);
        this.d = str;
        Object[] objArr2 = {activity, Integer.valueOf(i), handler, str2, bVar};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        this.c = PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "870ae354dc9d348758cb5c2d88e963dc", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.orderlist.helper.b) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "870ae354dc9d348758cb5c2d88e963dc") : new com.sankuai.waimai.store.orderlist.helper.b(activity, i, handler, str2, bVar);
        this.h = new PoiListViewCache(activity);
        this.i = i;
        this.j = dVar;
        this.k = aVar;
    }

    public final boolean b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ee1da9529bb028084a0b3b54702f0ecc", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ee1da9529bb028084a0b3b54702f0ecc")).booleanValue();
        }
        if (com.sankuai.shangou.stone.util.a.b(this.b)) {
            return false;
        }
        for (c cVar : this.b) {
            if (cVar != null && cVar.c != null) {
                return true;
            }
        }
        return false;
    }

    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "15a64afd9b552b3c3604fb8b015b94e3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "15a64afd9b552b3c3604fb8b015b94e3");
            return;
        }
        this.b.clear();
        m();
    }

    public int a(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a0bbcbd86a01f3e5c133051840ba8c2a", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a0bbcbd86a01f3e5c133051840ba8c2a")).intValue();
        }
        for (int i = 0; i < this.b.size(); i++) {
            c cVar = this.b.get(i);
            if (cVar != null && cVar.c != null && cVar.c.getOrderId() == j) {
                return i;
            }
        }
        return -1;
    }

    public final int d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a94834dc269a4bb2e78739b354fbf28d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a94834dc269a4bb2e78739b354fbf28d")).intValue() : this.b.size();
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final boolean e() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36d44e47ddd3c1d0e6f470c1ec7f2680", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36d44e47ddd3c1d0e6f470c1ec7f2680")).booleanValue() : com.sankuai.shangou.stone.util.a.b(this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b6a7f638f15b7e9f9b23041c402e6052", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b6a7f638f15b7e9f9b23041c402e6052")).intValue() : com.sankuai.shangou.stone.util.a.a((List) this.b);
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final int a(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4d84d015896c15d78062455d06f03f7", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4d84d015896c15d78062455d06f03f7")).intValue();
        }
        c cVar = (c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (cVar == null) {
            return -1;
        }
        switch (cVar.b) {
            case 1:
                return 1000;
            case 2:
                PoiCardInfo poiCardInfo = cVar.d.i;
                if (poiCardInfo == null || poiCardInfo.cardType != 1 || poiCardInfo.moduleDesc == null || !"mach".equals(poiCardInfo.moduleDesc.nativeId)) {
                    return (poiCardInfo == null || poiCardInfo.cardType != 2) ? 1004 : 1003;
                }
                return 1002;
            case 3:
                return 1001;
            case 4:
                return 1004;
            default:
                return -1;
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final e a(ViewGroup viewGroup, int i) {
        Object[] objArr = {viewGroup, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "90aa11b8410c9b24d8d3f3edcec38b5e", RobustBitConfig.DEFAULT_VALUE)) {
            return (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "90aa11b8410c9b24d8d3f3edcec38b5e");
        }
        switch (i) {
            case 1001:
                return new com.sankuai.waimai.store.orderlist.viewholder.c(this.g.inflate(R.layout.wm_sc_order_detail_spu_recommend_header, viewGroup, false));
            case 1002:
                return new com.sankuai.waimai.store.poilist.viewholders.e(new e.a(this.f, this.k));
            case 1003:
                g gVar = new g(this.g.inflate(R.layout.wm_sc_order_detail_recycle_mach_item, viewGroup, false));
                gVar.b = this.j;
                return gVar;
            case 1004:
                return new com.sankuai.waimai.store.orderlist.viewholder.a(this.f, this.g.inflate(R.layout.wm_sc_order_list_default_no_order, viewGroup, false));
            default:
                return new com.sankuai.waimai.store.orderlist.viewholder.d(this.g.inflate(R.layout.wm_sc_order_list_adapter_item, viewGroup, false), this.c, this.h, this.i);
        }
    }

    @Override // com.sankuai.waimai.store.widgets.recycler.a
    public final void a(com.sankuai.waimai.store.widgets.recycler.e eVar, final int i) {
        boolean z;
        SubDeliveryInfo subDeliveryInfo;
        OrderDeliverPackInfo orderDeliverPackInfo;
        boolean z2;
        boolean z3;
        boolean z4;
        Object[] objArr = {eVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c1988f7de2f6ec9cc3431dee06ff2c6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c1988f7de2f6ec9cc3431dee06ff2c6");
            return;
        }
        c cVar = (c) com.sankuai.shangou.stone.util.a.a((List<Object>) this.b, i);
        if (cVar == null) {
            return;
        }
        final Order order = cVar.c;
        final f fVar = cVar.d;
        c.b bVar = cVar.e;
        if (!(eVar instanceof com.sankuai.waimai.store.orderlist.viewholder.d) || order == null) {
            if ((eVar instanceof com.sankuai.waimai.store.orderlist.viewholder.c) && bVar != null) {
                com.sankuai.waimai.store.orderlist.viewholder.c cVar2 = (com.sankuai.waimai.store.orderlist.viewholder.c) eVar;
                Object[] objArr2 = {bVar};
                ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.store.orderlist.viewholder.c.a;
                if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "bcbe2c6fbd0f97287c09b587993d79bb", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "bcbe2c6fbd0f97287c09b587993d79bb");
                    return;
                } else if (bVar != null) {
                    String str = bVar.a;
                    String str2 = bVar.b;
                    if (!t.a(str)) {
                        cVar2.b.setText(str);
                    }
                    if (t.a(str2)) {
                        return;
                    }
                    m.b(str2).a(cVar2.c);
                    return;
                } else {
                    return;
                }
            } else if ((eVar instanceof com.sankuai.waimai.store.poilist.viewholders.e) && fVar != null && fVar.i != null && fVar.i.moduleDesc != null && fVar.i.cardType == 1) {
                ((com.sankuai.waimai.store.poilist.viewholders.e) eVar).a(cVar.d.i, i);
                return;
            } else if ((eVar instanceof g) && fVar != null && fVar.i != null && fVar.i.moduleDesc != null && fVar.i.cardType == 2) {
                if (fVar.j == null) {
                    fVar.j = this.j.a(fVar.i, i);
                }
                if (this.f instanceof com.sankuai.waimai.store.expose.v2.a) {
                    com.sankuai.waimai.store.poi.list.newp.adapter.a aVar = new com.sankuai.waimai.store.poi.list.newp.adapter.a(((g) eVar).itemView, System.identityHashCode(fVar) + CommonConstant.Symbol.COLON + i);
                    aVar.a(new c.a() { // from class: com.sankuai.waimai.store.orderlist.adapter.a.2
                        public static ChangeQuickRedirect a;

                        @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
                        public final void a() {
                            Object[] objArr3 = new Object[0];
                            ChangeQuickRedirect changeQuickRedirect3 = a;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "89312461d5216aa33f80f622f10d0639", RobustBitConfig.DEFAULT_VALUE)) {
                                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "89312461d5216aa33f80f622f10d0639");
                                return;
                            }
                            com.sankuai.waimai.mach.recycler.c cVar3 = fVar.j.b;
                            if (cVar3 != null) {
                                if (cVar3.b() != null) {
                                    cVar3.b().a("index", Integer.valueOf(i));
                                }
                                cVar3.e();
                            }
                        }
                    });
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) this.f, aVar);
                }
                ((g) eVar).a(fVar.j, i);
                return;
            } else if (eVar instanceof com.sankuai.waimai.store.orderlist.viewholder.a) {
                final com.sankuai.waimai.store.orderlist.viewholder.a aVar2 = (com.sankuai.waimai.store.orderlist.viewholder.a) eVar;
                final a.InterfaceC1260a interfaceC1260a = this.l;
                Object[] objArr3 = {cVar, interfaceC1260a};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.store.orderlist.viewholder.a.a;
                if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "06236c167a0e46f47f666e456da7d551", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "06236c167a0e46f47f666e456da7d551");
                    return;
                } else if (cVar == null || cVar.f == null) {
                    return;
                } else {
                    c.a aVar3 = cVar.f;
                    u.a(aVar2.c, aVar3.e);
                    u.a(aVar2.d, aVar3.b);
                    u.a(aVar2.e, aVar3.c);
                    u.a(aVar2.f, aVar3.d);
                    u.a(new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.a.1
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr4 = {view};
                            ChangeQuickRedirect changeQuickRedirect4 = a;
                            if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "a782b9e356193818ca8750f9cd93ed44", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "a782b9e356193818ca8750f9cd93ed44");
                            } else if (interfaceC1260a != null) {
                                interfaceC1260a.a();
                            }
                        }
                    }, aVar2.f);
                    aVar2.g.e = "b_waimai_fzc8v7me_mv" + aVar3.a;
                    aVar2.g.a("page_type", Integer.valueOf(aVar3.a));
                    if (aVar2.b instanceof com.sankuai.waimai.store.expose.v2.a) {
                        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) aVar2.b, aVar2.g);
                        return;
                    } else {
                        com.sankuai.shangou.stone.util.log.a.d("OrderListNoItemAdapter", "mContext is not IExposeHost", new Object[0]);
                        return;
                    }
                }
            } else {
                return;
            }
        }
        OrderListFragment.c = false;
        final com.sankuai.waimai.store.orderlist.viewholder.d dVar = (com.sankuai.waimai.store.orderlist.viewholder.d) eVar;
        Object[] objArr4 = {order, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "879be433cbd6f1a5d177abb1b412e1bb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "879be433cbd6f1a5d177abb1b412e1bb");
        } else if (order != null) {
            Object[] objArr5 = {order, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr5, dVar, changeQuickRedirect5, false, "94551b322448a2a30a8efec375f4a0fb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr5, dVar, changeQuickRedirect5, false, "94551b322448a2a30a8efec375f4a0fb");
            } else {
                Object[] objArr6 = {order, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                if (PatchProxy.isSupport(objArr6, dVar, changeQuickRedirect6, false, "bba2b0f749a0fc897b19f2969e6a6b76", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr6, dVar, changeQuickRedirect6, false, "bba2b0f749a0fc897b19f2969e6a6b76");
                } else {
                    dVar.a(dVar.e, order, i, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.5
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr7 = {view};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "16a1dacad68b6c621e135f3cf8363edb", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "16a1dacad68b6c621e135f3cf8363edb");
                                return;
                            }
                            d.b(dVar, order, i);
                            d.c(dVar, order, i);
                        }
                    });
                    dVar.a(dVar.c, order, i, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.6
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr7 = {view};
                            ChangeQuickRedirect changeQuickRedirect7 = a;
                            if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "6129d34fd0345b15e4eb4cece2399d64", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "6129d34fd0345b15e4eb4cece2399d64");
                                return;
                            }
                            d.b(dVar, order, i);
                            d.c(dVar, order, i);
                        }
                    });
                }
                Object[] objArr7 = {order, Integer.valueOf(i)};
                ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                if (PatchProxy.isSupport(objArr7, dVar, changeQuickRedirect7, false, "58f8df1d8c1b304e47a62aef67f4306d", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr7, dVar, changeQuickRedirect7, false, "58f8df1d8c1b304e47a62aef67f4306d");
                } else {
                    dVar.a(dVar.u, order, i, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.7
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr8 = {view};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "01a1de40731e35b83ab7974df6bd0b8a", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "01a1de40731e35b83ab7974df6bd0b8a");
                            } else {
                                dVar.d(order, i);
                            }
                        }
                    });
                    dVar.a(dVar.v, order, i, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.8
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr8 = {view};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "77366cfea8da77ed9d5c1d44c377f01e", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "77366cfea8da77ed9d5c1d44c377f01e");
                            } else {
                                dVar.d(order, i);
                            }
                        }
                    });
                    dVar.a(dVar.w, order, i, new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.9
                        public static ChangeQuickRedirect a;

                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            Object[] objArr8 = {view};
                            ChangeQuickRedirect changeQuickRedirect8 = a;
                            if (PatchProxy.isSupport(objArr8, this, changeQuickRedirect8, false, "ab4b09e6b90f9f76111a3d5da54388f8", 4611686018427387906L)) {
                                PatchProxy.accessDispatch(objArr8, this, changeQuickRedirect8, false, "ab4b09e6b90f9f76111a3d5da54388f8");
                            } else {
                                dVar.d(order, i);
                            }
                        }
                    });
                }
            }
            Object[] objArr8 = {order};
            ChangeQuickRedirect changeQuickRedirect8 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr8, dVar, changeQuickRedirect8, false, "1cc68898d678df31ad50a937902e5f14", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr8, dVar, changeQuickRedirect8, false, "1cc68898d678df31ad50a937902e5f14");
            } else {
                ImageView imageView = dVar.c;
                String poiPic = order.getPoiPic();
                Object[] objArr9 = {imageView, poiPic};
                ChangeQuickRedirect changeQuickRedirect9 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                if (PatchProxy.isSupport(objArr9, dVar, changeQuickRedirect9, false, "9359a8b4b33d022b531835a79609ee56", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr9, dVar, changeQuickRedirect9, false, "9359a8b4b33d022b531835a79609ee56");
                } else {
                    b.C0608b a2 = com.sankuai.waimai.store.imageloader.a.a(poiPic);
                    a2.b = dVar.a();
                    a2.c = poiPic;
                    b.C0608b b = a2.b((int) dVar.a().getResources().getDimension(R.dimen.wm_sc_common_dimen_80));
                    b.f = ImageQualityUtil.b();
                    b.i = R.drawable.wm_sc_common_loading_large;
                    b.a(imageView);
                }
                TextView textView = dVar.d;
                Object[] objArr10 = {textView, order};
                ChangeQuickRedirect changeQuickRedirect10 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                if (PatchProxy.isSupport(objArr10, dVar, changeQuickRedirect10, false, "a20ec6fbcf916dd48b37d342202bb49f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr10, dVar, changeQuickRedirect10, false, "a20ec6fbcf916dd48b37d342202bb49f");
                } else if (order.mPoiExtensionInfo != null && ((order.mPoiExtensionInfo.c == 3 || order.mPoiExtensionInfo.c == 4) && !TextUtils.isEmpty(order.mPoiExtensionInfo.d))) {
                    textView.setText(order.mPoiExtensionInfo.d);
                    textView.setBackgroundColor(dVar.K.o);
                    textView.setVisibility(0);
                } else {
                    textView.setVisibility(8);
                }
            }
            if (order.mPoiExtensionInfo != null && !com.sankuai.shangou.stone.util.a.b(order.mPoiExtensionInfo.g)) {
                dVar.n.setVisibility(8);
                dVar.r.setVisibility(0);
                Object[] objArr11 = {order};
                ChangeQuickRedirect changeQuickRedirect11 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                if (PatchProxy.isSupport(objArr11, dVar, changeQuickRedirect11, false, "dc325019a1fcaf94f1060640780082f9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr11, dVar, changeQuickRedirect11, false, "dc325019a1fcaf94f1060640780082f9");
                } else {
                    Object[] objArr12 = {order};
                    ChangeQuickRedirect changeQuickRedirect12 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                    if (PatchProxy.isSupport(objArr12, dVar, changeQuickRedirect12, false, "d9a343e66283a008fbd9ad7a38269349", RobustBitConfig.DEFAULT_VALUE)) {
                        z2 = ((Boolean) PatchProxy.accessDispatch(objArr12, dVar, changeQuickRedirect12, false, "d9a343e66283a008fbd9ad7a38269349")).booleanValue();
                    } else {
                        if (!dVar.b(order)) {
                            Object[] objArr13 = {order};
                            ChangeQuickRedirect changeQuickRedirect13 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                            if (PatchProxy.isSupport(objArr13, dVar, changeQuickRedirect13, false, "7ea9dcf34620b2bf4ae863132f43c86c", RobustBitConfig.DEFAULT_VALUE)) {
                                z3 = ((Boolean) PatchProxy.accessDispatch(objArr13, dVar, changeQuickRedirect13, false, "7ea9dcf34620b2bf4ae863132f43c86c")).booleanValue();
                            } else {
                                z3 = (order.mPoiExtensionInfo == null || com.sankuai.shangou.stone.util.a.b(order.mPoiExtensionInfo.g)) ? false : true;
                            }
                            if (!z3) {
                                z2 = false;
                            }
                        }
                        z2 = true;
                    }
                    if (z2) {
                        com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "POI 展示扩展信息 " + order.getPoiName(), new Object[0]);
                        dVar.f.setVisibility(8);
                        dVar.h.setVisibility(0);
                        dVar.a(dVar.i, order);
                        Object[] objArr14 = {order};
                        ChangeQuickRedirect changeQuickRedirect14 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                        if (PatchProxy.isSupport(objArr14, dVar, changeQuickRedirect14, false, "cbb200e0046d1a07382129a56ddd1b99", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr14, dVar, changeQuickRedirect14, false, "cbb200e0046d1a07382129a56ddd1b99");
                        } else {
                            dVar.o.setMaxLines(1);
                            dVar.m.setVisibility(0);
                            Object[] objArr15 = {order};
                            ChangeQuickRedirect changeQuickRedirect15 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                            if (PatchProxy.isSupport(objArr15, dVar, changeQuickRedirect15, false, "1aeec8c255682f7178668f90d7e0a506", RobustBitConfig.DEFAULT_VALUE)) {
                                z4 = ((Boolean) PatchProxy.accessDispatch(objArr15, dVar, changeQuickRedirect15, false, "1aeec8c255682f7178668f90d7e0a506")).booleanValue();
                            } else {
                                z4 = (order.mPoiExtensionInfo == null || com.sankuai.shangou.stone.util.a.b(order.mPoiExtensionInfo.g)) ? false : true;
                            }
                            if (!z4) {
                                dVar.m.setVisibility(8);
                            } else {
                                dVar.m.setVisibility(0);
                                if (order.mPoiExtensionInfo != null && !com.sankuai.shangou.stone.util.a.b(order.mPoiExtensionInfo.g)) {
                                    dVar.o.setMaxLines(1);
                                    ((com.sankuai.waimai.platform.widget.tag.virtualtag.g) dVar.o.getAdapter()).b(com.sankuai.waimai.platform.widget.tag.util.a.a(dVar.o.getContext(), order.mPoiExtensionInfo.g));
                                    dVar.o.getAdapter().notifyChanged();
                                    dVar.o.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener() { // from class: com.sankuai.waimai.store.orderlist.viewholder.d.2
                                        public static ChangeQuickRedirect a;

                                        @Override // android.view.ViewTreeObserver.OnPreDrawListener
                                        public final boolean onPreDraw() {
                                            Object[] objArr16 = new Object[0];
                                            ChangeQuickRedirect changeQuickRedirect16 = a;
                                            if (PatchProxy.isSupport(objArr16, this, changeQuickRedirect16, false, "8b75def4ae0c9d2b63c8b1d1f54af83f", RobustBitConfig.DEFAULT_VALUE)) {
                                                return ((Boolean) PatchProxy.accessDispatch(objArr16, this, changeQuickRedirect16, false, "8b75def4ae0c9d2b63c8b1d1f54af83f")).booleanValue();
                                            }
                                            dVar.o.getViewTreeObserver().removeOnPreDrawListener(this);
                                            if (dVar.p.c() == null || dVar.p.c().size() == 0) {
                                                dVar.o.setVisibility(8);
                                                return false;
                                            }
                                            dVar.o.setVisibility(0);
                                            int i2 = (dVar.p.b() == null || dVar.p.b().size() <= 0) ? 0 : dVar.p.b().get(0).a(dVar.o.getContext())[0];
                                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) dVar.q.getLayoutParams();
                                            layoutParams.leftMargin = i2 + h.a(dVar.o.getContext(), 3.0f);
                                            dVar.q.setLayoutParams(layoutParams);
                                            dVar.q.setVisibility(dVar.p.d ? 0 : 4);
                                            return true;
                                        }
                                    });
                                }
                            }
                        }
                        dVar.e(order);
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "POI 不展示扩展信息 " + order.getPoiName(), new Object[0]);
                        dVar.f.setVisibility(0);
                        dVar.h.setVisibility(8);
                        dVar.a(dVar.g, order);
                    }
                    dVar.a(order);
                }
            } else {
                dVar.n.setVisibility(0);
                dVar.r.setVisibility(8);
                Object[] objArr16 = {order};
                ChangeQuickRedirect changeQuickRedirect16 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                if (PatchProxy.isSupport(objArr16, dVar, changeQuickRedirect16, false, "8bb77332a741b5b56eaa97bbfdaa04d9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr16, dVar, changeQuickRedirect16, false, "8bb77332a741b5b56eaa97bbfdaa04d9");
                } else {
                    Object[] objArr17 = {order};
                    ChangeQuickRedirect changeQuickRedirect17 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                    if (PatchProxy.isSupport(objArr17, dVar, changeQuickRedirect17, false, "278078f51e50cc798adba0ad98a801ea", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr17, dVar, changeQuickRedirect17, false, "278078f51e50cc798adba0ad98a801ea")).booleanValue();
                    } else {
                        z = dVar.b(order) || dVar.c(order);
                    }
                    if (z) {
                        com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "POI 展示扩展信息 " + order.getPoiName(), new Object[0]);
                        dVar.f.setVisibility(8);
                        dVar.h.setVisibility(0);
                        dVar.a(dVar.i, order);
                        dVar.d(order);
                        dVar.e(order);
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "POI 不展示扩展信息 " + order.getPoiName(), new Object[0]);
                        dVar.f.setVisibility(0);
                        dVar.h.setVisibility(8);
                        dVar.a(dVar.g, order);
                    }
                    dVar.a(order);
                }
            }
            Object[] objArr18 = {order};
            ChangeQuickRedirect changeQuickRedirect18 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr18, dVar, changeQuickRedirect18, false, "7d3f224b6f83f17d192a661d6c4da1fc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr18, dVar, changeQuickRedirect18, false, "7d3f224b6f83f17d192a661d6c4da1fc");
            } else {
                dVar.u.setText(order.getStatusDescription());
                TextView textView2 = dVar.u;
                Object[] objArr19 = {textView2, order};
                ChangeQuickRedirect changeQuickRedirect19 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
                if (PatchProxy.isSupport(objArr19, dVar, changeQuickRedirect19, false, "92706cb606e3d8fa3317ccc5c92e08a0", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr19, dVar, changeQuickRedirect19, false, "92706cb606e3d8fa3317ccc5c92e08a0");
                } else if (order.getStatus() == 9) {
                    if (order.getPayStatus() != 8 && order.getPayStatus() != 6) {
                        textView2.setTextColor(dVar.J);
                    }
                    textView2.setTextColor(dVar.I);
                } else {
                    if (order.getStatus() == 8 && order.getPayStatus() != 5) {
                        textView2.setTextColor(dVar.J);
                    }
                    textView2.setTextColor(dVar.I);
                }
            }
            Object[] objArr20 = {order};
            ChangeQuickRedirect changeQuickRedirect20 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr20, dVar, changeQuickRedirect20, false, "0747b012dc63e2b13dd6e06731583782", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr20, dVar, changeQuickRedirect20, false, "0747b012dc63e2b13dd6e06731583782");
            } else if (dVar.x != null) {
                if (order.isHasStatusBubble()) {
                    dVar.x.setVisibility(0);
                } else {
                    dVar.x.setVisibility(8);
                }
            }
            Object[] objArr21 = {order, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect21 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr21, dVar, changeQuickRedirect21, false, "253a01e0ec6b640cab91d3d383cf9d0a", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr21, dVar, changeQuickRedirect21, false, "253a01e0ec6b640cab91d3d383cf9d0a");
            } else {
                Context a3 = dVar.a();
                Object[] objArr22 = {a3, order, dVar};
                ChangeQuickRedirect changeQuickRedirect22 = com.sankuai.waimai.store.orderlist.view.b.a;
                com.sankuai.waimai.store.orderlist.view.base.a aVar4 = null;
                if (PatchProxy.isSupport(objArr22, null, changeQuickRedirect22, true, "83bef7213e4364ef49fedbcb500ab97c", RobustBitConfig.DEFAULT_VALUE)) {
                    aVar4 = (com.sankuai.waimai.store.orderlist.view.base.a) PatchProxy.accessDispatch(objArr22, null, changeQuickRedirect22, true, "83bef7213e4364ef49fedbcb500ab97c");
                } else if (!com.sankuai.shangou.stone.util.a.b(order.productList)) {
                    if (com.sankuai.shangou.stone.util.a.a((List) order.productList) > 1) {
                        aVar4 = new com.sankuai.waimai.store.orderlist.view.c(a3, dVar);
                    } else {
                        aVar4 = new com.sankuai.waimai.store.orderlist.view.d(a3, dVar);
                    }
                }
                if (aVar4 != null) {
                    aVar4.createAndReplaceView(dVar.v);
                    Object[] objArr23 = {order, Integer.valueOf(i)};
                    ChangeQuickRedirect changeQuickRedirect23 = com.sankuai.waimai.store.orderlist.view.base.a.d;
                    if (PatchProxy.isSupport(objArr23, aVar4, changeQuickRedirect23, false, "2cff782aee343530ddda5662570ce084", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr23, aVar4, changeQuickRedirect23, false, "2cff782aee343530ddda5662570ce084");
                    } else if (com.sankuai.shangou.stone.util.a.b(order.productList)) {
                        aVar4.hide();
                    } else {
                        aVar4.show();
                        aVar4.a(order, i);
                        aVar4.a(order);
                        aVar4.b(order);
                    }
                }
            }
            dVar.c(order, i);
            Object[] objArr24 = {order, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect24 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr24, dVar, changeQuickRedirect24, false, "23cacf54f65315c33f18a9aa0c8dd35e", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr24, dVar, changeQuickRedirect24, false, "23cacf54f65315c33f18a9aa0c8dd35e");
            } else {
                com.sankuai.waimai.store.expose.v2.entity.b bVar2 = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_m5pcse9e", "b_waimai_gb9k43ou_mv", dVar.itemView);
                bVar2.e = "b_waimai_gb9k43ou_mv" + dVar.b + i + order.getOrderId();
                bVar2.b(dVar.e(order, i));
                if (dVar.a() instanceof com.sankuai.waimai.store.expose.v2.a) {
                    com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) dVar.a(), bVar2);
                } else {
                    com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "getContext is not a IExposeHost", new Object[0]);
                }
            }
            Object[] objArr25 = {order};
            ChangeQuickRedirect changeQuickRedirect25 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr25, dVar, changeQuickRedirect25, false, "6d68da782fb86d3fda1ee3376f52dad7", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr25, dVar, changeQuickRedirect25, false, "6d68da782fb86d3fda1ee3376f52dad7");
            } else {
                Context a4 = dVar.a();
                List<SubDeliveryInfo> subDeliveryInfoList = order.getSubDeliveryInfoList();
                if (com.sankuai.shangou.stone.util.a.a((Collection<?>) subDeliveryInfoList) && (subDeliveryInfo = (SubDeliveryInfo) com.sankuai.shangou.stone.util.a.a((List<Object>) subDeliveryInfoList, 0)) != null) {
                    int a5 = h.a(a4, 6.0f);
                    if (dVar.A == null) {
                        float f = a5;
                        dVar.A = new e.a().a(com.sankuai.waimai.store.util.b.b(a4, R.color.wm_sg_color_FFECD5)).b(1).c(com.sankuai.waimai.store.util.b.b(a4, R.color.wm_sg_color_FFF6E6)).a(0.0f, 0.0f, f, f).a();
                    }
                    dVar.z.setBackground(dVar.A);
                    dVar.z.setVisibility(0);
                    u.a(dVar.B, t.a(Arrays.asList(t.b(subDeliveryInfo.deliveryCycle), t.b(subDeliveryInfo.deliveryDate), t.b(subDeliveryInfo.deliveryDayInWeek)), StringUtil.SPACE));
                    u.a(dVar.C, subDeliveryInfo.deliveryStatusDesc);
                } else {
                    dVar.z.setVisibility(8);
                }
            }
            Object[] objArr26 = {order, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect26 = com.sankuai.waimai.store.orderlist.viewholder.d.a;
            if (PatchProxy.isSupport(objArr26, dVar, changeQuickRedirect26, false, "c7e2fc6b2aac566bea59eb09efde9972", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr26, dVar, changeQuickRedirect26, false, "c7e2fc6b2aac566bea59eb09efde9972");
                return;
            }
            final com.sankuai.waimai.store.orderlist.view.a aVar5 = dVar.D;
            Object[] objArr27 = {order, Integer.valueOf(i)};
            ChangeQuickRedirect changeQuickRedirect27 = com.sankuai.waimai.store.orderlist.view.a.a;
            if (PatchProxy.isSupport(objArr27, aVar5, changeQuickRedirect27, false, "56da74886dae1f287d32cde96ec4eccb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr27, aVar5, changeQuickRedirect27, false, "56da74886dae1f287d32cde96ec4eccb");
                return;
            }
            List<OrderDeliverPackInfo> deliverPackInfo = order.getDeliverPackInfo();
            if (com.sankuai.shangou.stone.util.a.a((List) deliverPackInfo) > 0 && (orderDeliverPackInfo = deliverPackInfo.get(0)) != null && !TextUtils.isEmpty(orderDeliverPackInfo.lastPackTrackContent)) {
                aVar5.c(true);
                if (aVar5.e == null) {
                    aVar5.e = new com.sankuai.waimai.store.expose.v2.entity.b("c_waimai_m5pcse9e", "b_waimai_sg_2s7zpsxd_mv", aVar5.h());
                    aVar5.e.e = "b_waimai_sg_2s7zpsxd_mv" + i + order.getOrderId();
                    if (aVar5.f() instanceof com.sankuai.waimai.store.expose.v2.a) {
                        com.sankuai.waimai.store.expose.v2.b.a().a((com.sankuai.waimai.store.expose.v2.a) aVar5.f(), aVar5.e);
                    } else {
                        com.sankuai.shangou.stone.util.log.a.a("OrderListViewHolder", "getContext is not a IExposeHost", new Object[0]);
                    }
                } else {
                    aVar5.e.g();
                }
                aVar5.e.a("order_id", Long.valueOf(order.getOrderId()));
                aVar5.e.a("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId()));
                aVar5.e.a("status", Integer.valueOf(order.getStatus()));
                aVar5.b.setText(orderDeliverPackInfo.lastPackTrackContent);
                aVar5.c.setText(orderDeliverPackInfo.trackViewTime);
                final String str3 = orderDeliverPackInfo.logisticsSchemaUrl;
                if (TextUtils.isEmpty(str3)) {
                    aVar5.d.setVisibility(8);
                    return;
                }
                aVar5.d.setVisibility(0);
                aVar5.h().setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.store.orderlist.view.a.1
                    public static ChangeQuickRedirect a;

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        Object[] objArr28 = {view};
                        ChangeQuickRedirect changeQuickRedirect28 = a;
                        if (PatchProxy.isSupport(objArr28, this, changeQuickRedirect28, false, "41a3961303d98bba381371152b1e7a19", 4611686018427387906L)) {
                            PatchProxy.accessDispatch(objArr28, this, changeQuickRedirect28, false, "41a3961303d98bba381371152b1e7a19");
                            return;
                        }
                        HashMap hashMap = new HashMap();
                        hashMap.put("order_id", Long.valueOf(order.getOrderId()));
                        hashMap.put("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(order.getPoiIdStr(), order.getPoiId()));
                        hashMap.put("status", Integer.valueOf(order.getStatus()));
                        com.sankuai.waimai.store.manager.judas.b.a("c_waimai_m5pcse9e", "b_waimai_sg_2s7zpsxd_mc").b(hashMap).a();
                        com.sankuai.waimai.store.router.d.a(view.getContext(), str3);
                    }
                });
                return;
            }
            aVar5.c(false);
        }
    }
}
