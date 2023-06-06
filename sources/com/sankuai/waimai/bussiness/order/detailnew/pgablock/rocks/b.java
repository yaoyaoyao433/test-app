package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import android.content.Context;
import android.net.Uri;
import android.support.annotation.NonNull;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.GroupChatEntrance;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.o;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.OrderStatusButtonListInfo;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.foundation.utils.af;
import com.sankuai.waimai.imbase.manager.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.sankuai.waimai.bussiness.order.base.mach.c {
    public static ChangeQuickRedirect c;
    @NonNull
    public c d;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d e;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.b f;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.a g;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b h;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.takefood.a i;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.c j;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.b k;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.delivery.waimai.a l;
    @NonNull
    public com.sankuai.waimai.bussiness.order.detailnew.pgablock.delivery.drug.a m;
    @NonNull
    public final k n;
    @NonNull
    public final com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.a o;
    private com.sankuai.waimai.bussiness.order.rocks.d p;

    public b(Context context, com.sankuai.waimai.bussiness.order.rocks.d dVar, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        super(context);
        Object[] objArr = {context, dVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b55ac34650febc50dcd3467a2209ebda", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b55ac34650febc50dcd3467a2209ebda");
            return;
        }
        this.p = dVar;
        this.d = new c(context, aVar);
        this.e = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d(context, dVar, aVar);
        this.f = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.b(this.e.b);
        this.g = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.a(context);
        this.h = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b(context, aVar);
        this.i = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.takefood.a(context);
        this.j = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.c();
        this.k = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderedit.b(context, aVar);
        this.l = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.delivery.waimai.a();
        this.m = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.delivery.drug.a(context);
        this.n = new k(context, dVar);
        this.o = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.a(context, dVar);
    }

    public final void a(OrderRocksServerModel orderRocksServerModel) {
        long j;
        b bVar;
        Object[] objArr = {orderRocksServerModel};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d4a996c3082364e907ca460757262a59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d4a996c3082364e907ca460757262a59");
            return;
        }
        final com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d dVar = this.e;
        final OrderStatusButtonListInfo convert = OrderStatusButtonListInfo.convert(orderRocksServerModel, "wm_order_status_operatearea_buttonlist");
        Object[] objArr2 = {convert};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d.a;
        if (PatchProxy.isSupport(objArr2, dVar, changeQuickRedirect2, false, "d5a3cabd33612bb000e36a75ca619a4c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, dVar, changeQuickRedirect2, false, "d5a3cabd33612bb000e36a75ca619a4c");
        } else {
            dVar.b.a(convert, dVar.i.aM.a().b, dVar.i.ai.a());
            dVar.i.aN.a(new com.meituan.android.cube.pga.action.b<ViewGroup>() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d.2
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(ViewGroup viewGroup) {
                    ViewGroup viewGroup2 = viewGroup;
                    Object[] objArr3 = {viewGroup2};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "481df3e5e8e3d25f4ca2e39bfb221bf4", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "481df3e5e8e3d25f4ca2e39bfb221bf4");
                        return;
                    }
                    dVar.f = viewGroup2;
                    if (dVar.g != null) {
                        dVar.b();
                        dVar.a();
                    }
                }
            });
            dVar.i.O.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "83f5ddd05d4dc4fe579c6d0cd0299b39", RobustBitConfig.DEFAULT_VALUE)) {
                        return PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "83f5ddd05d4dc4fe579c6d0cd0299b39");
                    }
                    com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a aVar = dVar.b;
                    Object[] objArr4 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.a;
                    return PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "fc04756955e6e447ec3fcf612d223ea6", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "fc04756955e6e447ec3fcf612d223ea6") : aVar.c != null ? aVar.c.c : "";
                }
            };
            dVar.i.aq.b = new com.meituan.android.cube.pga.action.d() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d.4
                @Override // com.meituan.android.cube.pga.action.d
                public final Object a() {
                    return convert.orderIMInfo;
                }
            };
        }
        final com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b bVar2 = this.h;
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar3 = orderRocksServerModel.c;
        GroupChatEntrance convert2 = GroupChatEntrance.convert(orderRocksServerModel);
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e a = com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.e.a(orderRocksServerModel);
        Object[] objArr3 = {bVar3, convert2, a};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.a;
        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "2d041a2bb6a05c7c651d11373bfc0e0e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "2d041a2bb6a05c7c651d11373bfc0e0e");
            bVar = this;
        } else {
            bVar2.f = bVar3;
            bVar2.g = convert2;
            bVar2.h = a;
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b.clear();
            Object[] objArr4 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.a;
            if (PatchProxy.isSupport(objArr4, bVar2, changeQuickRedirect4, false, "40e82d1933e0a82fb0cd41f2663584b6", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, bVar2, changeQuickRedirect4, false, "40e82d1933e0a82fb0cd41f2663584b6");
            } else if (bVar2.g == null || bVar2.g.chatId == 0) {
                com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.c = false;
                bVar2.a(0, 2052);
            } else {
                bVar2.i = bVar2.g.chatId;
                long j2 = bVar2.g.chatId;
                d.a aVar = new d.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.1
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.imbase.manager.d.a
                    public final void a(int i) {
                        Object[] objArr5 = {Integer.valueOf(i)};
                        ChangeQuickRedirect changeQuickRedirect5 = a;
                        if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "46c8173f35f9aaae8bc834892d671942", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "46c8173f35f9aaae8bc834892d671942");
                            return;
                        }
                        b.c = i > 0;
                        bVar2.a(i, 2052);
                    }
                };
                Object[] objArr5 = {new Long(j2), (short) 0, "im-group", aVar};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.detailnew.im.a.a;
                if (PatchProxy.isSupport(objArr5, null, changeQuickRedirect5, true, "0ebbfa97c614db7455d5c345a794cef9", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr5, null, changeQuickRedirect5, true, "0ebbfa97c614db7455d5c345a794cef9");
                } else {
                    com.sankuai.waimai.imbase.manager.b.a().a((short) 1025, j2, 0L, (short) 0, "im-group", aVar);
                }
            }
            bVar2.b();
            bVar2.a();
            Object[] objArr6 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.a;
            if (PatchProxy.isSupport(objArr6, bVar2, changeQuickRedirect6, false, "b4d9dd96246bd864d5faf56581cd36b0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr6, bVar2, changeQuickRedirect6, false, "b4d9dd96246bd864d5faf56581cd36b0");
            } else if (bVar2.f == null || bVar2.f.o == null || com.sankuai.waimai.foundation.utils.b.c(bVar2.f.o.c) <= 0) {
                bVar2.a(0, 2053);
            } else {
                o.a aVar2 = bVar2.f.o.c.get(0);
                if (aVar2 == null || TextUtils.isEmpty(aVar2.d)) {
                    bVar2.a(0, 2053);
                } else {
                    try {
                        j = af.a(Uri.parse(aVar2.d), "chatID", 0L);
                    } catch (Exception unused) {
                        j = 0;
                    }
                    if (j != 0) {
                        d.a aVar3 = new d.a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.4
                            public static ChangeQuickRedirect a;

                            @Override // com.sankuai.waimai.imbase.manager.d.a
                            public final void a(int i) {
                                Object[] objArr7 = {Integer.valueOf(i)};
                                ChangeQuickRedirect changeQuickRedirect7 = a;
                                if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "f619d60526038349bed99e9dbbee6776", RobustBitConfig.DEFAULT_VALUE)) {
                                    PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "f619d60526038349bed99e9dbbee6776");
                                } else {
                                    bVar2.a(i, 2053);
                                }
                            }
                        };
                        Object[] objArr7 = {new Long(j), (short) 0, "pub-service", aVar3};
                        ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.detailnew.im.a.a;
                        if (PatchProxy.isSupport(objArr7, null, changeQuickRedirect7, true, "856154af06d47774d2f9fed5a98a5299", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr7, null, changeQuickRedirect7, true, "856154af06d47774d2f9fed5a98a5299");
                        } else {
                            com.sankuai.waimai.imbase.manager.b.a().a((short) 1024, j, 0L, (short) 0, "pub-service", aVar3);
                        }
                    } else {
                        bVar2.a(0, 2053);
                    }
                }
            }
            bVar = this;
        }
        bVar.l.a(bVar.p.ai.a());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x0790, code lost:
        if (r31.equals("remind_vibrate_event") != false) goto L180;
     */
    @Override // com.sankuai.waimai.bussiness.order.base.mach.c
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@android.support.annotation.NonNull java.lang.String r31, @android.support.annotation.Nullable java.util.Map<java.lang.String, java.lang.Object> r32) {
        /*
            Method dump skipped, instructions count: 2950
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.b.a(java.lang.String, java.util.Map):void");
    }

    @Override // com.sankuai.waimai.bussiness.order.base.mach.c
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b8d86a480d8786398cfed6ffe0646218", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b8d86a480d8786398cfed6ffe0646218");
            return;
        }
        super.a();
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b bVar = this.h;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.a;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "bb2fad8460b901ec435226a072357d76", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "bb2fad8460b901ec435226a072357d76");
        } else {
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.b.clear();
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.c = false;
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.e = 0;
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.food.mach.b.d = 0;
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.b bVar2 = this.f;
        Object[] objArr3 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.b.a;
        if (PatchProxy.isSupport(objArr3, bVar2, changeQuickRedirect3, false, "a078e71538f88a5f8528a20615234691", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, bVar2, changeQuickRedirect3, false, "a078e71538f88a5f8528a20615234691");
        } else if (bVar2.b != null && !bVar2.b.isUnsubscribed()) {
            bVar2.b.unsubscribe();
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d dVar = this.e;
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.mach.d.a;
        if (PatchProxy.isSupport(objArr4, dVar, changeQuickRedirect4, false, "829fcf4a1f579638f91533212669aa86", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, dVar, changeQuickRedirect4, false, "829fcf4a1f579638f91533212669aa86");
            return;
        }
        com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a aVar = dVar.b;
        Object[] objArr5 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.a;
        if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "5cd89841f48f6d571df411ac5debbcc6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "5cd89841f48f6d571df411ac5debbcc6");
            return;
        }
        Object[] objArr6 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus.a.a;
        if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "bb99da6000774d162bedb2a90ed3db52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "bb99da6000774d162bedb2a90ed3db52");
        } else {
            aVar.b = null;
            aVar.k = null;
            aVar.j = null;
            aVar.h = null;
        }
        if (aVar.e != null) {
            com.sankuai.waimai.bussiness.order.detailnew.controller.e eVar = aVar.e;
            Object[] objArr7 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect7 = com.sankuai.waimai.bussiness.order.detailnew.controller.e.a;
            if (PatchProxy.isSupport(objArr7, eVar, changeQuickRedirect7, false, "3328a49c0fe47f7448a8c388e0896ef0", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr7, eVar, changeQuickRedirect7, false, "3328a49c0fe47f7448a8c388e0896ef0");
            } else {
                eVar.b.removeCallbacks(eVar.g);
            }
        }
        if (aVar.h != null) {
            aVar.h.b();
        }
        if (aVar.f != null) {
            if (aVar.f.isShowing()) {
                aVar.f.dismiss();
            }
            aVar.f = null;
        }
    }
}
