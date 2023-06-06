package com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar;

import android.app.Activity;
import android.view.ViewStub;
import com.meituan.android.cube.pga.common.i;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.addrsdk.constants.AddressScene;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.root.LogicInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c, d, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fb982fc83c6ef12fbd6c3cf6a6728d7", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fb982fc83c6ef12fbd6c3cf6a6728d7") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e6dba5ea5bbb9bf00d594b11d19ff02e", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e6dba5ea5bbb9bf00d594b11d19ff02e") : new com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c(m(), this.h);
    }

    public a(com.sankuai.waimai.bussiness.order.confirm.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cbb283c86aa5dc11fc716d20bbb29854", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cbb283c86aa5dc11fc716d20bbb29854");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9860c36ea77c80627d6135dbaa1854a8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9860c36ea77c80627d6135dbaa1854a8");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aP.a(new com.meituan.android.cube.pga.action.b<Float>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(Float f) {
                Float f2 = f;
                Object[] objArr2 = {f2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "57416176fd6cb5eb9c91a4dc362c0103", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "57416176fd6cb5eb9c91a4dc362c0103");
                } else {
                    ((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) a.this.g).a(((d) a.this.n).p, f2.floatValue());
                }
            }
        });
        ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aQ.b = new com.meituan.android.cube.pga.action.d<Integer>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ Integer a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "64725dc5d01a02800825fa6607b15c56", RobustBitConfig.DEFAULT_VALUE) ? (Integer) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "64725dc5d01a02800825fa6607b15c56") : Integer.valueOf(((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) a.this.g).a().getHeight());
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) this.g).e();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) this.g).a(((d) this.n).p, 0.0f);
        ((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) this.g).f = new c.a() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.actionbar.a.3
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c.a
            public final void a(Activity activity) {
                Object[] objArr2 = {activity};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "5e8eceb72ccb6dc74b29dfd92c750538", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "5e8eceb72ccb6dc74b29dfd92c750538");
                    return;
                }
                Activity activity2 = (Activity) a.this.m();
                long j = ((d) a.this.n).p.b;
                String str = ((d) a.this.n).p.c;
                Object[] objArr3 = {activity2, new Long(j), str};
                ChangeQuickRedirect changeQuickRedirect3 = com.sankuai.waimai.bussiness.order.base.a.a;
                if (PatchProxy.isSupport(objArr3, null, changeQuickRedirect3, true, "ada7f027395a5c74012804c7378cc2bf", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr3, null, changeQuickRedirect3, true, "ada7f027395a5c74012804c7378cc2bf");
                } else {
                    AddressScene addressScene = AddressScene.DEFAULT_SCENE;
                    Object[] objArr4 = {activity2, addressScene, new Long(j), str};
                    ChangeQuickRedirect changeQuickRedirect4 = com.sankuai.waimai.bussiness.order.base.a.a;
                    if (PatchProxy.isSupport(objArr4, null, changeQuickRedirect4, true, "ae3190a6b79b09be53574662e5d41700", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr4, null, changeQuickRedirect4, true, "ae3190a6b79b09be53574662e5d41700");
                    } else {
                        com.sankuai.waimai.bussiness.order.base.a.a(activity2, addressScene, null, j, str, null);
                    }
                }
                JudasManualManager.a("b_waimai_h8crsg4h_mc").a("c_ykhs39e").a("address_type", ((d) a.this.n).p.d).a(a.this.l()).a();
            }

            @Override // com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c.a
            public final void a(long j, int i) {
                Object[] objArr2 = {new Long(j), 0};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "f7240ce0959ec3183a0b5fb06977a127", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "f7240ce0959ec3183a0b5fb06977a127");
                    return;
                }
                ((com.sankuai.waimai.bussiness.order.confirm.a) a.this.F()).aN.a((com.meituan.android.cube.pga.common.b<i.c<Long, Integer>>) i.a(Long.valueOf(j), 0));
                JudasManualManager.a("b_waimai_h8crsg4h_mc").a("c_ykhs39e").a("address_type", ((d) a.this.n).p.d).a(a.this.l()).a();
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa68c5dd12080c4c76d0d2cca2e55f2c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa68c5dd12080c4c76d0d2cca2e55f2c");
            return;
        }
        super.I();
        ((d) this.n).p.b = ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aH_();
        ((d) this.n).p.c = ((com.sankuai.waimai.bussiness.order.confirm.a) F()).aI_();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) this.g).a((CharSequence) ((com.sankuai.waimai.bussiness.order.confirm.a) F()).W.a().a());
        LogicInfo a = ((com.sankuai.waimai.bussiness.order.confirm.a) F()).J.a();
        if (a != null) {
            ((d) this.n).p.h = a.deliverySkin;
            ((d) this.n).p.i = a.deliverySkinTitleColor;
        }
        ((com.sankuai.waimai.bussiness.order.crossconfirm.block.actionbar.c) this.g).a(((d) this.n).p, ((com.sankuai.waimai.bussiness.order.confirm.a) F()).T.a().b);
    }
}
