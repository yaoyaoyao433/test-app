package com.sankuai.waimai.bussiness.order.confirm.pgablock.delivery.rock;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"order_confirm_delivery_group"}, viewModel = com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.f.class)
/* loaded from: classes4.dex */
public class d extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.e, com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.f, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7a160e7aee53df1c9f6bede7b956ace", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.f) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7a160e7aee53df1c9f6bede7b956ace") : new com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.f();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.e z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "798205a634ecebb423de8502a2ef8ee9", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "798205a634ecebb423de8502a2ef8ee9") : new com.sankuai.waimai.bussiness.order.confirm.pgablock.rock.e(m());
    }

    public d(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "14dbd756c4824b9f2e27bec663acffc2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "14dbd756c4824b9f2e27bec663acffc2");
        }
    }
}
