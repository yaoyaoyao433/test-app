package com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.d;
import com.sankuai.waimai.foundation.utils.ad;
import java.util.ArrayList;
import java.util.List;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.a<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;
    public List<d> s;
    private d t;

    public static /* synthetic */ void d(b bVar) {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, bVar, changeQuickRedirect, false, "7f768ac8f7fa8568b7b48bc91b1b3761", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, bVar, changeQuickRedirect, false, "7f768ac8f7fa8568b7b48bc91b1b3761");
            return;
        }
        for (d dVar : bVar.s) {
            if (dVar != null) {
                dVar.a(true);
            }
        }
    }

    public b(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c2266767de3d0c21390f9a532dc52c15", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c2266767de3d0c21390f9a532dc52c15");
            return;
        }
        this.t = null;
        this.s = new ArrayList(3);
        Object[] objArr2 = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = r;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e2cbcf19c3fbe9bd630f1e55da457af3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e2cbcf19c3fbe9bd630f1e55da457af3");
        } else {
            aVar.S.a(new com.meituan.android.cube.pga.action.b<Void>() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.b.3
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Void r11) {
                    Object[] objArr3 = {r11};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "880cfb3320b1c030127424bdc3b2bb3d", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "880cfb3320b1c030127424bdc3b2bb3d");
                    } else {
                        b.this.M();
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "af6466539a1662b4afb69aaccf86e71c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "af6466539a1662b4afb69aaccf86e71c");
        } else {
            super.I();
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0a2c6fefcde499ec9c6add083a1b48d9", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0a2c6fefcde499ec9c6add083a1b48d9") : new com.meituan.android.cube.pga.view.a(m()) { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.b.1
            @Override // com.meituan.android.cube.pga.view.a
            public final int d() {
                return R.layout.wm_order_confirm_float_layer_layout;
            }
        };
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7f9913099a33a0fe9c89209a0d2dea83", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7f9913099a33a0fe9c89209a0d2dea83") : new com.meituan.android.cube.pga.viewmodel.a();
    }

    public void M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1ba2f5e6090fbc8022a37c051c648de9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1ba2f5e6090fbc8022a37c051c648de9");
        } else if (((com.sankuai.waimai.bussiness.order.confirm.a) F()).bd.a().b()) {
        } else {
            ad.a(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.confirm.pgablock.floatlayer.rock.b.4
                public static ChangeQuickRedirect a;

                @Override // java.lang.Runnable
                public final void run() {
                    Object[] objArr2 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "e8be9f46f46dcaec28dfc942709c5ac1", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "e8be9f46f46dcaec28dfc942709c5ac1");
                        return;
                    }
                    for (d dVar : b.this.s) {
                        if (dVar != null) {
                            if ((b.this.t == null || dVar.equals(b.this.t)) && dVar.a()) {
                                b.d(b.this);
                                dVar.c();
                                b.this.t = dVar;
                                return;
                            }
                            dVar.a(!dVar.b());
                        }
                    }
                }
            }, 350L);
        }
    }
}
