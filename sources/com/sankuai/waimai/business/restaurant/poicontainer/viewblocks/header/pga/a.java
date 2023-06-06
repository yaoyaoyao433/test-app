package com.sankuai.waimai.business.restaurant.poicontainer.viewblocks.header.pga;

import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.DynamicBinder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@DynamicBinder(nativeId = {"wm_r_scroll_container"}, viewModel = com.meituan.android.cube.pga.viewmodel.a.class)
/* loaded from: classes4.dex */
public class a extends com.sankuai.waimai.business.restaurant.base.config.b<com.meituan.android.cube.pga.view.a, com.meituan.android.cube.pga.viewmodel.a, com.sankuai.waimai.business.restaurant.poicontainer.pga.b> {
    public static ChangeQuickRedirect t;

    public a(com.sankuai.waimai.business.restaurant.poicontainer.pga.b bVar) {
        super(bVar);
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5d5f5983bd6523a36a5f03e829397b45", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5d5f5983bd6523a36a5f03e829397b45");
        }
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final com.meituan.android.cube.pga.view.a z() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bb34049d23c9e0b6543912515896e41c", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.meituan.android.cube.pga.view.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bb34049d23c9e0b6543912515896e41c");
        }
        return new com.meituan.android.cube.pga.view.a(m(), LayoutInflater.from(m()).inflate(R.layout.wm_restaurant_container_scroll, (ViewGroup) ((com.sankuai.waimai.business.restaurant.poicontainer.pga.b) F()).B.a().b, false));
    }

    @Override // com.meituan.android.cube.pga.block.a
    public final void a(com.meituan.android.cube.pga.block.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = t;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e7438e288eba63c986d8cd5200e86829", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e7438e288eba63c986d8cd5200e86829");
        } else {
            super.a(aVar, R.id.layout_content_container);
        }
    }

    @Override // com.meituan.android.cube.pga.block.b
    public final com.meituan.android.cube.pga.viewmodel.a L() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = t;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7d866c2a8274732ed3728a6a137fdf51", RobustBitConfig.DEFAULT_VALUE) ? (com.meituan.android.cube.pga.viewmodel.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7d866c2a8274732ed3728a6a137fdf51") : new com.meituan.android.cube.pga.viewmodel.a();
    }
}
