package com.sankuai.waimai.bussiness.order.crossconfirm.block.timeinsurance;

import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.helper.f;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, d, com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "300867ac0cb58c6a6b4c60255477447b", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "300867ac0cb58c6a6b4c60255477447b") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a6016a00a8a26280666be316071e545b", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a6016a00a8a26280666be316071e545b") : new b(m(), (f) F());
    }

    public a(com.sankuai.waimai.bussiness.order.crossconfirm.block.root.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9042f4475ddb5654abcde1cdf4475408", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9042f4475ddb5654abcde1cdf4475408");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "854c7f0700f4e112b325982ea1f91630", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "854c7f0700f4e112b325982ea1f91630");
            return;
        }
        super.I();
        ((b) this.g).a(((d) this.n).p);
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void b(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7cbea48a0cd6bc994bdd37511d4de30", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7cbea48a0cd6bc994bdd37511d4de30");
            return;
        }
        super.b(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "97a195d7c32fafa2eb8e1212913f6ddc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "97a195d7c32fafa2eb8e1212913f6ddc");
        } else {
            bundle.putBoolean("arg_insurance_selected", bVar.g);
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void c(Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77701ede3b3989ee1d481fd03f89fca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77701ede3b3989ee1d481fd03f89fca");
            return;
        }
        super.c(bundle);
        b bVar = (b) this.g;
        Object[] objArr2 = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = b.d;
        if (PatchProxy.isSupport(objArr2, bVar, changeQuickRedirect2, false, "deac71c3c6f8daaea3f93dc6104f4f56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, bVar, changeQuickRedirect2, false, "deac71c3c6f8daaea3f93dc6104f4f56");
        } else {
            bVar.g = bundle.getBoolean("arg_insurance_selected");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void y() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ffa3c3b0cbe25a000b433c27fbf264aa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ffa3c3b0cbe25a000b433c27fbf264aa");
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
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc1d128d9f140092df8249a206b799b5", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc1d128d9f140092df8249a206b799b5")).booleanValue() : ((b) this.g).g;
    }
}
