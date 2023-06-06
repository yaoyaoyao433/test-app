package com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"order_status_delivery_info_group"}, viewModel = h.class)
/* loaded from: classes4.dex */
public class d extends com.meituan.android.cube.pga.block.a<g, h, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6e687146fa9f26dc3a0638d9e03df4c1", RobustBitConfig.DEFAULT_VALUE) ? (h) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6e687146fa9f26dc3a0638d9e03df4c1") : new h();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ g z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b9a0b028e76495329967273f7525ec9", RobustBitConfig.DEFAULT_VALUE) ? (g) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b9a0b028e76495329967273f7525ec9") : new g(m());
    }

    public d(com.sankuai.waimai.bussiness.order.detailnew.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "25639e69eadb74181f43ec422c1d192d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "25639e69eadb74181f43ec422c1d192d");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9e99e5b445f9ff7fa3662ab43ec5371d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9e99e5b445f9ff7fa3662ab43ec5371d");
            return;
        }
        super.I();
        ((g) this.g).a().post(new Runnable() { // from class: com.sankuai.waimai.bussiness.order.detailnew.pgablock.rocks.d.1
            public static ChangeQuickRedirect a;

            @Override // java.lang.Runnable
            public final void run() {
                Object[] objArr2 = new Object[0];
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "ace45e4759ca3549b10198928c80ceae", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "ace45e4759ca3549b10198928c80ceae");
                    return;
                }
                ((g) d.this.g).a().setVisibility(((g) d.this.g).a().getHeight() <= 1 ? 8 : 0);
            }
        });
    }
}
