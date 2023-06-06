package com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.order.api.model.DinersOption;
import com.sankuai.waimai.business.order.submit.model.TablewareSettingsInfo;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.a;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class b extends com.meituan.android.cube.pga.block.a<c, e, com.sankuai.waimai.bussiness.order.crossconfirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0ee5677b69e5fc60a5ca21d68b1b50a4", RobustBitConfig.DEFAULT_VALUE) ? (e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0ee5677b69e5fc60a5ca21d68b1b50a4") : new e();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3d74e2cc0f764de12e65feb821ff3fbd", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3d74e2cc0f764de12e65feb821ff3fbd") : new c(m());
    }

    public b(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar, boolean z, int i) {
        super(aVar);
        Object[] objArr = {aVar, (byte) 0, 1};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9f21fc0bc5de896b5881854804e0e4aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9f21fc0bc5de896b5881854804e0e4aa");
            return;
        }
        ((e) this.n).p.d = false;
        ((e) this.n).p.e = 1;
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "01598180e9efa40b75dcdc1693854fcc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "01598180e9efa40b75dcdc1693854fcc");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).aj.a(new com.meituan.android.cube.pga.action.b<a.C0908a>() { // from class: com.sankuai.waimai.bussiness.order.crossconfirm.block.tablewareinfo.b.1
            public static ChangeQuickRedirect a;

            @Override // com.meituan.android.cube.pga.action.b
            public final /* synthetic */ void a(a.C0908a c0908a) {
                a.C0908a c0908a2 = c0908a;
                Object[] objArr2 = {c0908a2};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "145d6b3c25441cae5816f4a664204963", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "145d6b3c25441cae5816f4a664204963");
                } else if (c0908a2 == null || c0908a2.a != ((e) b.this.n).p.b.longValue()) {
                } else {
                    c0908a2.b = ((c) b.this.g).g();
                }
            }
        });
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dbbcba1638c7d974bd441d263dedba54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dbbcba1638c7d974bd441d263dedba54");
            return;
        }
        super.I();
        int intValue = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).B.a().b.intValue();
        c cVar = (c) this.g;
        cVar.l = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).A.a().b;
        cVar.m = intValue;
        F();
        ((c) this.g).k = null;
        c cVar2 = (c) this.g;
        d dVar = ((e) this.n).p;
        Object[] objArr2 = {dVar};
        ChangeQuickRedirect changeQuickRedirect2 = c.d;
        if (PatchProxy.isSupport(objArr2, cVar2, changeQuickRedirect2, false, "433b43364f286fb114bf3486a68f0e7b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, cVar2, changeQuickRedirect2, false, "433b43364f286fb114bf3486a68f0e7b");
            return;
        }
        Object[] objArr3 = {dVar};
        ChangeQuickRedirect changeQuickRedirect3 = c.d;
        if (PatchProxy.isSupport(objArr3, cVar2, changeQuickRedirect3, false, "0e954aaeec6b68c7dc09251cd33f591c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr3, cVar2, changeQuickRedirect3, false, "0e954aaeec6b68c7dc09251cd33f591c");
            return;
        }
        cVar2.v = dVar;
        cVar2.h = dVar.d;
        cVar2.i = dVar.e;
        cVar2.n = cVar2.v.f;
        cVar2.o = cVar2.n != null ? cVar2.n.settingsId : 0L;
        if (cVar2.n != null && cVar2.n.settingsOptions != null && cVar2.n.settingsOptions.size() >= 2) {
            Iterator<TablewareSettingsInfo.SettingsOption> it = cVar2.n.settingsOptions.iterator();
            while (it.hasNext()) {
                TablewareSettingsInfo.SettingsOption next = it.next();
                if (next.code == 101) {
                    cVar2.q = next;
                } else if (next.code == 102) {
                    cVar2.r = next;
                }
            }
            cVar2.p = cVar2.q.isSelected == 1 || cVar2.r.isSelected == 1;
        }
        cVar2.a(dVar);
        Object[] objArr4 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect4 = c.d;
        if (PatchProxy.isSupport(objArr4, cVar2, changeQuickRedirect4, false, "173132fc62bcddec5bd94400ade50c45", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, cVar2, changeQuickRedirect4, false, "173132fc62bcddec5bd94400ade50c45");
            return;
        }
        if ((cVar2.v.g == null || cVar2.v.g.isEmpty()) ? false : true) {
            for (DinersOption dinersOption : cVar2.v.g) {
                if (cVar2.h && cVar2.i < 11 && cVar2.g <= 0) {
                    if (dinersOption.count == cVar2.i) {
                        cVar2.a(dinersOption);
                        return;
                    }
                } else if (cVar2.g != Integer.MIN_VALUE && dinersOption.count == cVar2.g) {
                    cVar2.a(dinersOption);
                    return;
                }
            }
        } else if (cVar2.f()) {
            if (cVar2.g == Integer.MIN_VALUE) {
                if (cVar2.s == 102) {
                    cVar2.g = 99;
                } else if (cVar2.s == 101) {
                    cVar2.g = 88;
                }
            }
            cVar2.a((DinersOption) null);
        } else {
            cVar2.j.setVisibility(8);
        }
    }

    public final int M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "852252d061ec93167608cb21f3837c62", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "852252d061ec93167608cb21f3837c62")).intValue() : ((c) this.g).e();
    }
}
