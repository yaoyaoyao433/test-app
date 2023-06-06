package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"order_status_food_info_group"}, viewModel = h.class)
/* loaded from: classes4.dex */
public class f extends com.meituan.android.cube.pga.block.a<g, h, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a17cba253dde2554239949fe4781c5a4", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a17cba253dde2554239949fe4781c5a4") : new h();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ g z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "542385c4add8f81267a0feece9a565a5", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "542385c4add8f81267a0feece9a565a5") : new g(m());
    }

    public f(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "46a6060dd4396d8e3f4ca68a30956fd0", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "46a6060dd4396d8e3f4ca68a30956fd0");
        }
    }
}
