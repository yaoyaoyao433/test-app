package com.sankuai.waimai.bussiness.order.confirm.pgablock.instructions;

import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ProGuard */
@DynamicBinder(modelType = Map.class, nativeId = {"wm_confirm_order_activity_instructions"}, viewModel = d.class)
/* loaded from: classes4.dex */
public class a extends com.meituan.android.cube.pga.block.a<com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.d, d, com.meituan.android.cube.pga.type.a> {
    public static ChangeQuickRedirect r;
    private com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.c s;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f9b2b9e52debf842cf9175258c27ddd2", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f9b2b9e52debf842cf9175258c27ddd2") : new d();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.d z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a9c05e4a13bd06d4f30944e3dfbf1fa", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a9c05e4a13bd06d4f30944e3dfbf1fa") : new com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.d(m(), "order_confirm_overseas");
    }

    public a(com.meituan.android.cube.pga.type.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1708c051d3774b2c99cca3c20b97162b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1708c051d3774b2c99cca3c20b97162b");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "08f211a45db2af82ad38a6786e0a43ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "08f211a45db2af82ad38a6786e0a43ca");
        } else {
            super.s();
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4aa59e4b510006bef8199565b230bd7d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4aa59e4b510006bef8199565b230bd7d");
            return;
        }
        super.I();
        a(0, g.a(m(), 6.0f), 0, g.a(m(), 45.0f));
        if (this.s == null) {
            this.s = new com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.c();
            this.s.b = "waimai_order_order_confirm_overseas_style_1";
            this.s.c = "waimai_order_order_confirm_overseas_style_1";
            this.s.i = 300;
        } else {
            this.s.i = 0;
        }
        if (((d) this.n).p != null && ((d) this.n).p.a != null) {
            this.s.g = new HashMap();
            this.s.g = ((d) this.n).p.a;
        } else {
            this.s.g = null;
        }
        ((com.sankuai.waimai.bussiness.order.confirm.pgablock.machcontainer.d) this.g).a(this.s);
    }
}
