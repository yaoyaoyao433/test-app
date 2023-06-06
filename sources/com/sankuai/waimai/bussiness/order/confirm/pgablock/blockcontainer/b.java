package com.sankuai.waimai.bussiness.order.confirm.pgablock.blockcontainer;

import android.view.View;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.g;
import java.util.Iterator;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_confirm_order_block_container_mach"}, viewModel = a.class)
/* loaded from: classes4.dex */
public class b extends com.meituan.android.cube.pga.block.a<c, a, com.sankuai.waimai.bussiness.order.confirm.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5be953a0620db1ff7180650f2a10e05a", RobustBitConfig.DEFAULT_VALUE) ? (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5be953a0620db1ff7180650f2a10e05a") : new a();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ c z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e77faedf3574662900e8842df79f6070", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e77faedf3574662900e8842df79f6070") : new c(m());
    }

    public b(com.sankuai.waimai.bussiness.order.confirm.a aVar) {
        super(aVar);
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "790133065471783ab59ee3a04928ab3d", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "790133065471783ab59ee3a04928ab3d");
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        View i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "712e080568ea92271ac5918d2d53df08", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "712e080568ea92271ac5918d2d53df08");
            return;
        }
        super.I();
        a(0, g.a(m(), 6.0f), 0, 0);
        int i2 = 8;
        if (q().size() == 0) {
            i = i();
        } else {
            Iterator<com.meituan.android.cube.pga.block.a> it = q().iterator();
            boolean z = true;
            while (it.hasNext()) {
                if (it.next().i().getVisibility() == 8) {
                    z = true;
                    continue;
                } else {
                    z = false;
                    continue;
                }
                if (!z) {
                    break;
                }
            }
            i = i();
            if (!z) {
                i2 = 0;
            }
        }
        i.setVisibility(i2);
    }
}
