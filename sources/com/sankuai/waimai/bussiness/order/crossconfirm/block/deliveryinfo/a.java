package com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo;

import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.b;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<c, e, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4297b817e9a9f7dc4a6d056d81c39383", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4297b817e9a9f7dc4a6d056d81c39383") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "008c5215c62795aa8953a6856946bd17", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "008c5215c62795aa8953a6856946bd17") : new c(m(), (com.sankuai.waimai.bussiness.order.crossconfirm.a) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "869348aa697c69e315ef04b2115115ef", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "869348aa697c69e315ef04b2115115ef");
            return;
        }
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).af.b = new com.meituan.android.cube.pga.action.d<String>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.a.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.d
            public final /* synthetic */ String a() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                return PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6584ee5c35745ed85e48a3f2039c0a49", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6584ee5c35745ed85e48a3f2039c0a49") : ((c) a.this.g).m;
            }
        };
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).ag.a(new com.meituan.android.cube.pga.action.b<b.a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.deliveryinfo.a.2
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(b.a aVar2) {
                b.a aVar3 = aVar2;
                boolean z = true;
                Object[] objArr2 = {aVar3};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d853b7be0df3bbcc894905aba6bd1e81", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d853b7be0df3bbcc894905aba6bd1e81");
                } else if (aVar3.a == ((e) a.this.n).p.a) {
                    c cVar = (c) a.this.g;
                    Object[] objArr3 = new Object[0];
                    ChangeQuickRedirect changeQuickRedirect3 = c.d;
                    if (PatchProxy.isSupport(objArr3, cVar, changeQuickRedirect3, false, "3ce0cae8a1e5a2767262d7dcc1b3ee55", RobustBitConfig.DEFAULT_VALUE)) {
                        z = ((Boolean) PatchProxy.accessDispatch(objArr3, cVar, changeQuickRedirect3, false, "3ce0cae8a1e5a2767262d7dcc1b3ee55")).booleanValue();
                    } else if (cVar.l && cVar.e()) {
                        z = false;
                    }
                    aVar3.b = z;
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "402d7ecf2a37f75f10b9bfe92812f1f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "402d7ecf2a37f75f10b9bfe92812f1f9");
            return;
        }
        super.I();
        c cVar = (c) this.g;
        d dVar = ((e) this.n).p;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "cf43f7c171ead4493257882f5640fb59", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "cf43f7c171ead4493257882f5640fb59");
            return;
        }
        cVar.n = dVar;
        cVar.l = dVar.d == 1;
        if (cVar.l) {
            cVar.e.setVisibility(dVar.e ? 8 : 0);
            if (dVar.f && cVar.o.v.a().b()) {
                cVar.g.setText(R.string.wm_order_confirm_not_choose_time);
            } else {
                cVar.g.setText(dVar.g);
                if (dVar.i) {
                    cVar.h.setVisibility(0);
                } else {
                    cVar.h.setVisibility(8);
                }
            }
        } else {
            cVar.e.setVisibility(8);
        }
        cVar.f.setText(dVar.c);
        cVar.a(dVar);
    }

    public final int M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3224b35937273b2cba62bfcec9c94a0d", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3224b35937273b2cba62bfcec9c94a0d")).intValue();
        }
        c cVar = (c) this.g;
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        return PatchProxy.isSupport(objArr2, cVar, changeQuickRedirect2, false, "c9c32a453b8bd452a74efcdde2dce27d", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr2, cVar, changeQuickRedirect2, false, "c9c32a453b8bd452a74efcdde2dce27d")).intValue() : cVar.k;
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58d43986dc46eed09fb9301d9a2acefd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58d43986dc46eed09fb9301d9a2acefd");
            return;
        }
        super.y();
        if (((c) this.g).a().getVisibility() != 8) {
            ((c) this.g).f();
        }
    }
}
