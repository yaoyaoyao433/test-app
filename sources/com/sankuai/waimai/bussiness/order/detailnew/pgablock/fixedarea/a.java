package com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea;

import android.support.constraint.R;
import android.view.View;
import android.view.ViewStub;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.Iterator;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a extends com.meituan.android.cube.pga.block.a<b, c, com.sankuai.waimai.bussiness.order.detailnew.a> {
    public static ChangeQuickRedirect r;

    @Override // com.meituan.android.cube.pga.block.b
    public final /* synthetic */ com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "87bf3795476cd941c358df059c7b44d9", RobustBitConfig.DEFAULT_VALUE) ? (c) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "87bf3795476cd941c358df059c7b44d9") : new c();
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final /* synthetic */ b z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9aa74371a4c5b79c3757586346385578", RobustBitConfig.DEFAULT_VALUE) ? (b) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9aa74371a4c5b79c3757586346385578") : new b(m(), this.h);
    }

    public a(com.sankuai.waimai.bussiness.order.detailnew.a aVar, ViewStub viewStub) {
        super(aVar, viewStub);
        Object[] objArr = {aVar, viewStub};
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75704d461294ea18dc24b69f34d28016", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75704d461294ea18dc24b69f34d28016");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a, com.meituan.android.cube.pga.block.b
    public final void s() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "91b3fb6f5232e3179bb85224e318d4fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "91b3fb6f5232e3179bb85224e318d4fc");
            return;
        }
        super.s();
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.c((com.sankuai.waimai.bussiness.order.detailnew.a) F(), (ViewStub) i().findViewById(R.id.wm_order_detail_base_map_view_stub)));
        a((com.meituan.android.cube.pga.block.a) new com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.animation.c((com.sankuai.waimai.bussiness.order.detailnew.a) F(), (ViewStub) i().findViewById(R.id.wm_order_status_layout_map_animation_stub)));
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final void I() {
        View i;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = r;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4a928a0daedbaddbbda5836caea33264", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4a928a0daedbaddbbda5836caea33264");
            return;
        }
        super.I();
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
