package com.sankuai.waimai.bussiness.order.detailnew.pgablock.orderstatus;

import android.support.constraint.R;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.h;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.i;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"order_status_operatearea_group"}, viewModel = h.class)
/* loaded from: classes4.dex */
public class d extends com.sankuai.waimai.rocks.view.block.h<i, h, com.sankuai.waimai.bussiness.order.rocks.d> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6aadc659f7e837a7342e8df48ed77883", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6aadc659f7e837a7342e8df48ed77883") : new h();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "faff6830367c44d5928f672142e5febc", RobustBitConfig.DEFAULT_VALUE) ? (i) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "faff6830367c44d5928f672142e5febc") : new i(m());
    }

    public d(com.sankuai.waimai.bussiness.order.rocks.d dVar) {
        super(dVar);
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "19ff4f11727a92f4de64d35162c102f0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "19ff4f11727a92f4de64d35162c102f0");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e25eba40b71ea8a0a46f82395cff13a2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e25eba40b71ea8a0a46f82395cff13a2");
            return;
        }
        super.s();
        ((com.sankuai.waimai.bussiness.order.rocks.d) F()).aN.a((com.meituan.android.cube.pga.common.b<ViewGroup>) ((i) this.g).e);
    }

    @Override // com.sankuai.waimai.rocks.view.block.h
    public final ViewGroup M() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3841bc0d5c267075be05a7413adb1e7", RobustBitConfig.DEFAULT_VALUE)) {
            return (ViewGroup) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3841bc0d5c267075be05a7413adb1e7");
        }
        if (i() == null) {
            return null;
        }
        return (ViewGroup) i().findViewById(R.id.ll_order_status_list_area);
    }
}
