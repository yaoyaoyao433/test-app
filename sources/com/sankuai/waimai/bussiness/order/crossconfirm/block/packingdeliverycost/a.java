package com.sankuai.waimai.bussiness.order.crossconfirm.block.packingdeliverycost;

import android.text.TextUtils;
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d06f45db130c1375050fcac30ecfb9fb", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d06f45db130c1375050fcac30ecfb9fb") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "58f59831f2e2d6841e8df3083f55fe71", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "58f59831f2e2d6841e8df3083f55fe71") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8090fa2e7a1489002def02435236cca5", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8090fa2e7a1489002def02435236cca5");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        int i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1fe72d9f1238b9b1db54122b20ef9421", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1fe72d9f1238b9b1db54122b20ef9421");
            return;
        }
        super.I();
        b bVar = (b) this.g;
        c cVar = ((d) this.n).p;
        long j = ((d) this.n).p.u;
        String str = ((d) this.n).p.v;
        boolean aM_ = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).aM_();
        int aL_ = ((com.sankuai.waimai.bussiness.order.crossconfirm.a) F()).aL_();
        F();
        Object[] objArr2 = {cVar, new Long(j), str, Byte.valueOf(aM_ ? (byte) 1 : (byte) 0), Integer.valueOf(aL_), (byte) 0};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "a2accd4c4265ad05715d89f4f0c1fff6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "a2accd4c4265ad05715d89f4f0c1fff6");
            return;
        }
        bVar.l = cVar;
        bVar.a(cVar, j, str);
        bVar.a(cVar, aM_, aL_, false);
        String str2 = cVar.m;
        Object[] objArr3 = {str2};
        ChangeQuickRedirect changeQuickRedirect3 = b.d;
        if (PatchProxy.isSupport(objArr3, bVar, changeQuickRedirect3, false, "718aa3cbfd55018cc3f55bc18687327b", RobustBitConfig.DEFAULT_VALUE)) {
            i = 0;
            PatchProxy.accessDispatch(objArr3, bVar, changeQuickRedirect3, false, "718aa3cbfd55018cc3f55bc18687327b");
        } else {
            i = 0;
            if (TextUtils.isEmpty(str2)) {
                bVar.h.setVisibility(4);
            } else {
                bVar.h.setText(str2);
                bVar.h.setVisibility(0);
            }
        }
        bVar.a(cVar.q);
        bVar.a(cVar.w);
        bVar.a(cVar.r);
        Object[] objArr4 = new Object[i];
        ChangeQuickRedirect changeQuickRedirect4 = b.d;
        if (PatchProxy.isSupport(objArr4, bVar, changeQuickRedirect4, false, "db9b2239556d74261e74bd8a67ad1359", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr4, bVar, changeQuickRedirect4, false, "db9b2239556d74261e74bd8a67ad1359");
        } else if (bVar.g.getVisibility() == 0 || bVar.f.getVisibility() == 0 || bVar.i.getVisibility() == 0) {
            bVar.e.setVisibility(0);
        } else {
            bVar.e.setVisibility(8);
        }
    }
}
