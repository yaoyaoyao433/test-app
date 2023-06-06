package com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver;

import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.ButtonItem;
import com.sankuai.waimai.bussiness.order.detailnew.network.response.i;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a;
import com.sankuai.waimai.bussiness.order.detailnew.util.d;
import com.sankuai.waimai.bussiness.order.rocks.OrderRocksServerModel;
import com.sankuai.waimai.log.judas.JudasManualManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class c extends com.meituan.android.cube.pga.block.b<a, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect f;
    private com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a g;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c249ee82cc0a39446020a70186338524", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c249ee82cc0a39446020a70186338524") : new a();
    }

    public c(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "564e6cbfcc7b26d946b5d7261989581e", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "564e6cbfcc7b26d946b5d7261989581e");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        boolean z;
        int i;
        HashMap hashMap;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = f;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "36ee30dfb385912eeb7f79070f8a57e6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "36ee30dfb385912eeb7f79070f8a57e6");
            return;
        }
        super.I();
        b bVar = ((a) this.n).p;
        Object[] objArr2 = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = f;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e6707b8c77ff8c94486194624de0cb20", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e6707b8c77ff8c94486194624de0cb20");
        } else if (bVar != null && bVar.k != null && bVar.k.a != null) {
            Object[] objArr3 = new Object[0];
            ChangeQuickRedirect changeQuickRedirect3 = f;
            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "80dfee3e6a27f3821071d942632811f5", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "80dfee3e6a27f3821071d942632811f5");
            } else if (this.g == null) {
                this.g = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a(m());
                this.g.d = new a.InterfaceC0919a() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.c.1
                };
                this.g.e = new com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.c.2
                    public static ChangeQuickRedirect a;

                    @Override // com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.b
                    public final void M() {
                        Object[] objArr4 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect4 = a;
                        if (PatchProxy.isSupport(objArr4, this, changeQuickRedirect4, false, "899720b965af4eb0494bee51723d084f", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr4, this, changeQuickRedirect4, false, "899720b965af4eb0494bee51723d084f");
                            return;
                        }
                        Boolean bool = c.this.F().aa.a().b;
                        if (bool == null || !bool.booleanValue()) {
                            return;
                        }
                        c.this.F().Z.a((com.meituan.android.cube.pga.common.b<Integer>) 0);
                    }
                };
            }
            com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a aVar = this.g;
            i iVar = bVar.k;
            Object[] objArr4 = {iVar};
            ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a.a;
            if (PatchProxy.isSupport(objArr4, aVar, changeQuickRedirect4, false, "8675648326b16567d253146b3447fffb", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr4, aVar, changeQuickRedirect4, false, "8675648326b16567d253146b3447fffb");
            } else if (!aVar.c) {
                Object[] objArr5 = {iVar};
                ChangeQuickRedirect changeQuickRedirect5 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a.a;
                if (PatchProxy.isSupport(objArr5, aVar, changeQuickRedirect5, false, "c63de993eb00a5a84b7077fa4b1145f4", RobustBitConfig.DEFAULT_VALUE)) {
                    z = ((Boolean) PatchProxy.accessDispatch(objArr5, aVar, changeQuickRedirect5, false, "c63de993eb00a5a84b7077fa4b1145f4")).booleanValue();
                } else {
                    if (iVar != null && iVar.a != null) {
                        List<ButtonItem> list = iVar.a.d;
                        if (list != null) {
                            Object[] objArr6 = {list};
                            ChangeQuickRedirect changeQuickRedirect6 = com.sankuai.waimai.bussiness.order.detailnew.pgablock.noriderreceiver.a.a;
                            if (PatchProxy.isSupport(objArr6, aVar, changeQuickRedirect6, false, "5cfbbe79ebcd0618090958ab9da7b23a", RobustBitConfig.DEFAULT_VALUE)) {
                                List list2 = (List) PatchProxy.accessDispatch(objArr6, aVar, changeQuickRedirect6, false, "5cfbbe79ebcd0618090958ab9da7b23a");
                            } else {
                                int i2 = 0;
                                while (i2 < list.size()) {
                                    ButtonItem buttonItem = list.get(i2);
                                    if (buttonItem.code != 2045 && buttonItem.code != 2046) {
                                        list.remove(i2);
                                        i2--;
                                    }
                                    i2++;
                                }
                            }
                            i = list.size();
                        } else {
                            i = 0;
                        }
                        if (i > 0) {
                            String str = com.sankuai.waimai.foundation.router.interfaces.b.c;
                            if (com.sankuai.waimai.foundation.core.a.e()) {
                                str = "imeituan://www.meituan.com";
                            } else if (com.sankuai.waimai.foundation.core.a.f()) {
                                str = "dianping://waimai.dianping.com";
                            }
                            HashMap hashMap2 = new HashMap();
                            hashMap2.put("title", iVar.a.a);
                            hashMap2.put("content", iVar.a.c);
                            hashMap2.put("button_list", com.sankuai.waimai.bussiness.order.base.utils.b.a().toJson(list));
                            new HashMap().put("no_rider_receive_data", hashMap2);
                            com.sankuai.waimai.foundation.router.a.a(aVar.b, str + "/machalertview?template_id=waimai_order_status_cancel_order_dialog_style_1&data=" + hashMap.toString());
                            JudasManualManager.a("b_waimai_e8xp2iq4_mv").a("c_hgowsqb").a(aVar.b).a();
                            z = true;
                        }
                    }
                    z = false;
                }
                aVar.c = z;
            }
        }
        b bVar2 = ((a) this.n).p;
        Object[] objArr7 = {bVar2};
        ChangeQuickRedirect changeQuickRedirect7 = f;
        if (PatchProxy.isSupport(objArr7, this, changeQuickRedirect7, false, "897d0fa33a64efa366eee7b87b92520f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr7, this, changeQuickRedirect7, false, "897d0fa33a64efa366eee7b87b92520f");
        } else if (bVar2 != null) {
            if (bVar2.e == 130 || bVar2.e == 140) {
                com.sankuai.waimai.platform.capacity.persistent.sp.a.a(m(), bVar2.b + "ceres_order_no_rider_confirm_alert");
            }
        }
    }

    /* compiled from: ProGuard */
    /* loaded from: classes4.dex */
    static class a extends com.meituan.android.cube.pga.viewmodel.a<OrderRocksServerModel> {
        public static ChangeQuickRedirect o;
        @NonNull
        b p;

        public a() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b2a86e78c705742093f6309d0ba180f", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b2a86e78c705742093f6309d0ba180f");
            } else {
                this.p = new b();
            }
        }

        @Override // com.meituan.android.cube.pga.viewmodel.a
        public final void d() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect = o;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "82850cf2c3ac19aee27a87db54a5b109", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "82850cf2c3ac19aee27a87db54a5b109");
                return;
            }
            super.d();
            if (this.c != 0) {
                b bVar = this.p;
                OrderRocksServerModel orderRocksServerModel = (OrderRocksServerModel) this.c;
                Object[] objArr2 = {orderRocksServerModel};
                ChangeQuickRedirect changeQuickRedirect2 = b.a;
                if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "0de1831c487b236df2c6e9ef580a3fa3", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "0de1831c487b236df2c6e9ef580a3fa3");
                    return;
                }
                Map<String, Object> a = orderRocksServerModel.a("wm_order_status_no_rider_receive_order");
                com.sankuai.waimai.bussiness.order.detailnew.pgablock.root.b bVar2 = orderRocksServerModel.c;
                Object obj = a.get("no_rider_confirm_info");
                if (obj != null) {
                    bVar.k = (i) d.a().fromJson(d.a().toJson(obj), (Class<Object>) i.class);
                }
                bVar.b = bVar2.b;
                bVar.c = bVar2.c;
                bVar.d = bVar2.d;
                if (bVar2.l != null) {
                    bVar.e = bVar2.l.x;
                    bVar.f = bVar2.l.o;
                }
                bVar.g = bVar2.i;
                bVar.h = bVar2.d();
                bVar.i = bVar2.u;
                bVar.j = bVar2.w;
            }
        }
    }
}
