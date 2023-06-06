package com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist;

import android.support.constraint.R;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.base.constants.a;
import com.sankuai.waimai.bussiness.order.confirm.collect.model.CollectOrderFoodParams;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.PoiOrderPreviewPoiResult;
import com.sankuai.waimai.bussiness.order.crossconfirm.model.preview.result.UnAvailableFood;
import com.sankuai.waimai.log.judas.JudasManualManager;
import com.sankuai.waimai.platform.domain.core.order.OrderedFood;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    public static /* synthetic */ void a(a aVar, int i, double d, double d2, double d3, List list, double d4) {
        Object[] objArr = {1, Double.valueOf(0.0d), Double.valueOf(0.0d), Double.valueOf(0.0d), null, Double.valueOf(0.0d)};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, aVar, changeQuickRedirect, false, "7590e42e1a7df1d344c3ed8a0404fac2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, aVar, changeQuickRedirect, false, "7590e42e1a7df1d344c3ed8a0404fac2");
        } else if (aVar.n != 0) {
            PoiOrderPreviewPoiResult poiOrderPreviewPoiResult = ((d) aVar.n).e().poiInfo;
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) aVar.F()).Y.a(new CollectOrderFoodParams(1, 0.0d, ((d) aVar.n).n(), 0.0d, 0.0d, ((d) aVar.n).p.b, ((d) aVar.n).p.c, ((b) aVar.g).e(), null, 0.0d, poiOrderPreviewPoiResult == null ? 0L : poiOrderPreviewPoiResult.poiFirstCateId));
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00c4cd1e2103cd30aa9b1bfa3757b258", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00c4cd1e2103cd30aa9b1bfa3757b258") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6918642f03e778b2fdfbb02325255cad", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6918642f03e778b2fdfbb02325255cad") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a6d1f4732e5b4e4b8580b242daadfe3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a6d1f4732e5b4e4b8580b242daadfe3");
        } else {
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).al.a(new com.meituan.android.cube.pga.action.b<i.c<Long, List<OrderedFood>>>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(i.c<Long, List<OrderedFood>> cVar) {
                    i.c<Long, List<OrderedFood>> cVar2 = cVar;
                    Object[] objArr2 = {cVar2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "bbdf9eabdaf4a2b12d80e741d0295f9b", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "bbdf9eabdaf4a2b12d80e741d0295f9b");
                    } else if (cVar2 == null || cVar2.d == null || cVar2.c.longValue() != ((d) a.this.n).p.b) {
                    } else {
                        cVar2.d.addAll(((b) a.this.g).e());
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb5b5dbef7ee626a73e6e436d9a7e9ee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb5b5dbef7ee626a73e6e436d9a7e9ee");
            return;
        }
        super.s();
        b bVar = (b) this.g;
        a.InterfaceC0897a interfaceC0897a = new a.InterfaceC0897a() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.goodslist.a.2
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.InterfaceC0897a
            public final void a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d914657005b354f20241704d2724348b", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d914657005b354f20241704d2724348b");
                } else {
                    a.a(a.this, 1, 0.0d, 0.0d, 0.0d, null, 0.0d);
                }
            }
        };
        Object[] objArr2 = {interfaceC0897a};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "7c1efa90fa69bce8c38e4153e0da2cda", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "7c1efa90fa69bce8c38e4153e0da2cda");
            return;
        }
        bVar.f = interfaceC0897a;
        if (bVar.e != null) {
            bVar.e.h = bVar.f;
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        boolean z;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a5451bc798ee12392568cfd7d240c66", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a5451bc798ee12392568cfd7d240c66");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        Object[] objArr2 = {cVar};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "df9eb97c63c32da0c85f8628edeed4d7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "df9eb97c63c32da0c85f8628edeed4d7");
            return;
        }
        bVar.g = cVar;
        com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a aVar = bVar.e;
        boolean z2 = cVar.d;
        String str = cVar.f;
        aVar.l = z2;
        aVar.e = str;
        aVar.f = true;
        final com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a aVar2 = bVar.e;
        long j = cVar.b;
        String str2 = cVar.c;
        List<OrderedFood> list = cVar.g;
        List<UnAvailableFood> list2 = cVar.h;
        Object[] objArr3 = {new Long(j), str2, list, list2};
        ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.a;
        if (PatchProxy.isSupport(objArr3, aVar2, changeQuickRedirect3, false, "b151b7387f02f12233011bee6d8ecc63", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, aVar2, changeQuickRedirect3, false, "b151b7387f02f12233011bee6d8ecc63");
            return;
        }
        aVar2.a(list);
        aVar2.i = j;
        aVar2.j = str2;
        if (list != null || !com.sankuai.waimai.foundation.utils.d.a(list2)) {
            aVar2.c.removeAllViews();
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list2)) {
            z = false;
        } else {
            aVar2.k = list2;
            z = true;
        }
        if (list != null) {
            aVar2.g.removeAllViews();
            if (list.size() > 0) {
                if (aVar2.l) {
                    Object[] objArr4 = {Byte.valueOf(aVar2.a() ? (byte) 1 : (byte) 0)};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.a;
                    if (PatchProxy.isSupport(objArr4, aVar2, changeQuickRedirect4, false, "ce8723829f51fd30a08e8a9ad08d7485", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, aVar2, changeQuickRedirect4, false, "ce8723829f51fd30a08e8a9ad08d7485");
                    } else if (aVar2.f && aVar2.e != null && !TextUtils.isEmpty(aVar2.e)) {
                        View inflate = aVar2.d.inflate(R.layout.wm_order_confirm_adapter_product_list_cart_remind_tip_new, (ViewGroup) null);
                        TextView textView = (TextView) inflate.findViewById(R.id.txt_order_confirm_product_remind_tip);
                        TextView textView2 = (TextView) inflate.findViewById(R.id.go_to_add_staple_food);
                        aVar2.m = (LinearLayout) inflate.findViewById(R.id.order_confirm_product_container);
                        textView.setText(aVar2.e);
                        if (textView.getVisibility() == 0) {
                            JudasManualManager.b(a.C0883a.h).a("c_ykhs39e").a(aVar2.b).a();
                        }
                        if (textView2.getVisibility() == 0) {
                            JudasManualManager.b("b_waimai_qr68yvct_mv").a("c_ykhs39e").a("wm_preview_tanceng", 0).a("is_multiple_transaction", 1).a(aVar2.b).a();
                        }
                        inflate.setOnClickListener(new View.OnClickListener() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.goodslist.a.2
                            public static ChangeQuickRedirect a;

                            @Override // android.view.View.OnClickListener
                            public final void onClick(View view) {
                                Object[] objArr5 = {view};
                                ChangeQuickRedirect changeQuickRedirect5 = a;
                                if (PatchProxy.isSupport(objArr5, this, changeQuickRedirect5, false, "79e8bd22e08236a846204a39ce582343", 4611686018427387906L)) {
                                    PatchProxy.accessDispatch(objArr5, this, changeQuickRedirect5, false, "79e8bd22e08236a846204a39ce582343");
                                } else if (aVar2.h != null) {
                                    aVar2.h.a();
                                    JudasManualManager.a("b_waimai_qr68yvct_mc").a("c_ykhs39e").a("wm_preview_tanceng", 0).a("is_multiple_transaction", 1).a(aVar2.b).a();
                                }
                            }
                        });
                        aVar2.c.addView(inflate);
                    }
                }
                aVar2.c.addView(aVar2.g);
                if (!z) {
                    aVar2.c();
                }
                aVar2.a(z);
            }
        }
        if (com.sankuai.waimai.foundation.utils.d.a(list2)) {
            return;
        }
        aVar2.b();
    }
}
