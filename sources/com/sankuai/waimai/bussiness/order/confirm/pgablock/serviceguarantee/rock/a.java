package com.sankuai.waimai.bussiness.order.confirm.pgablock.serviceguarantee.rock;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.f;
import com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.g;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_confirm_order_service"}, viewModel = f.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a<g, f, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cc75b1b9fbebe4e001b560f7fb5080f0", RobustBitConfig.DEFAULT_VALUE) ? (f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cc75b1b9fbebe4e001b560f7fb5080f0") : new f();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ g z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16e8dc59bcf716678022b17046d44fb1", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16e8dc59bcf716678022b17046d44fb1") : new g(m());
    }

    public a(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "06cc4842b28ae37e7c947c699cc1b666", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "06cc4842b28ae37e7c947c699cc1b666");
        }
    }
}
