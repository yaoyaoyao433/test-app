package com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d3777733df710670b8f7887a5ce9b0d", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d3777733df710670b8f7887a5ce9b0d") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "02f315746ec04804e770282edfbdad05", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "02f315746ec04804e770282edfbdad05") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a745e3873a63992cf867ceefeceaf258", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a745e3873a63992cf867ceefeceaf258");
        } else {
            ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).l.a(new com.meituan.android.cube.pga.action.b<Boolean>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.privacyprotection.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.android.cube.pga.action.b
                public final /* synthetic */ void a(Boolean bool) {
                    Boolean bool2 = bool;
                    Object[] objArr2 = {bool2};
                    ChangeQuickRedirect changeQuickRedirect2 = a;
                    if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c81fa985d9c9ab5ae7e8c76ed74f345f", RobustBitConfig.DEFAULT_VALUE)) {
                        PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c81fa985d9c9ab5ae7e8c76ed74f345f");
                    } else if (bool2.booleanValue()) {
                        b bVar = (b) a.this.g;
                        Object[] objArr3 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = b.d;
                        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "b9cf9162d9c1134b1cc94ec0b3908193", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "b9cf9162d9c1134b1cc94ec0b3908193");
                            return;
                        }
                        bVar.e.removeCallbacks(bVar.r);
                        bVar.e.removeCallbacks(bVar.s);
                        bVar.f();
                        if (bVar.m) {
                            bVar.g();
                        }
                    }
                }
            });
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5271ac5ff35cf4755a43cecb30544103", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5271ac5ff35cf4755a43cecb30544103");
            return;
        }
        super.I();
        ((b) this.g).a(((d) this.n).r);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "050a4c13ca6af1a18734f692777efac1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "050a4c13ca6af1a18734f692777efac1");
            return;
        }
        super.b(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "6261aa585c0484c0d07a6d914a34865a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "6261aa585c0484c0d07a6d914a34865a");
        } else {
            bundle.putBoolean("arg_privacy_selected", bVar.p);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91a96f838f382bfb883c5569dc54b6fe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91a96f838f382bfb883c5569dc54b6fe");
            return;
        }
        super.c(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "4367208a410ab953819b0eba974590bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "4367208a410ab953819b0eba974590bd");
        } else {
            bVar.n = bundle.getBoolean("arg_privacy_selected");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a51f48de992cc860cff0c17cf0556e59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a51f48de992cc860cff0c17cf0556e59");
            return;
        }
        super.y();
        if (((b) this.g).a().getVisibility() != 8) {
            ((b) this.g).e();
        }
    }

    public final boolean M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "73faf902322d47cf2624766a4e77495e", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "73faf902322d47cf2624766a4e77495e")).booleanValue() : ((b) this.g).n;
    }
}
