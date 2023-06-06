package com.sankuai.waimai.bussiness.order.crossconfirm.block.publicawelfare;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
import com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, c, d> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d0943005b90427700b7a165481180034", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d0943005b90427700b7a165481180034") : new c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "83a6fb31ee5c820ab59abf70908793cc", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "83a6fb31ee5c820ab59abf70908793cc") : new b(m(), (f) F());
    }

    public a(d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e76dfb96e16ab2811d66b472a7e08f01", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e76dfb96e16ab2811d66b472a7e08f01");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ebd7356ac2443ff023a7375a91952d7f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ebd7356ac2443ff023a7375a91952d7f");
            return;
        }
        super.I();
        ((b) this.g).a(((c) this.n).p);
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "fef975b2baa56f673d566860be360d29", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "fef975b2baa56f673d566860be360d29");
            return;
        }
        super.y();
        if (((b) this.g).a().getVisibility() != 8) {
            ((b) this.g).e();
        }
    }
}
