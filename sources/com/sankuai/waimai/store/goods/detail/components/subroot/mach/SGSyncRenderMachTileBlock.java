package com.sankuai.waimai.store.goods.detail.components.subroot.mach;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.android.cube.annotation.Cube;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.detail.components.subroot.base.SGDetailRoundCornerTileBlock;
import java.util.Map;
/* compiled from: ProGuard */
@Cube(events = {b.class, c.class})
/* loaded from: classes5.dex */
public class SGSyncRenderMachTileBlock extends SGDetailRoundCornerTileBlock {
    public static ChangeQuickRedirect h;
    public d i;
    public int j;
    @NonNull
    private com.sankuai.waimai.store.platform.domain.manager.poi.a k;
    private com.sankuai.waimai.store.mach.event.b l;

    public SGSyncRenderMachTileBlock(@NonNull com.sankuai.waimai.store.platform.domain.manager.poi.a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3bcee73f86c8488d55535ab604471234", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3bcee73f86c8488d55535ab604471234");
            return;
        }
        this.j = 0;
        this.l = new com.sankuai.waimai.store.mach.event.b() { // from class: com.sankuai.waimai.store.goods.detail.components.subroot.mach.SGSyncRenderMachTileBlock.1
            public static ChangeQuickRedirect a;

            @Override // com.sankuai.waimai.store.mach.event.b
            public final void a(com.sankuai.waimai.store.mach.event.a aVar2, String str, Map<String, Object> map) {
                Object[] objArr2 = {aVar2, str, map};
                ChangeQuickRedirect changeQuickRedirect2 = a;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6e01296808f7489f73068554eb23a4b4", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6e01296808f7489f73068554eb23a4b4");
                } else {
                    SGSyncRenderMachTileBlock.this.a(new b(aVar2, str, map));
                }
            }
        };
        this.k = aVar;
    }

    @Override // com.meituan.android.cube.core.f
    public final View a(LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = h;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c3808d0d4cbbdc2150c8a03d2eda8a9e", RobustBitConfig.DEFAULT_VALUE) ? (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c3808d0d4cbbdc2150c8a03d2eda8a9e") : layoutInflater.inflate(R.layout.wm_sc_goods_detail_common_mach_tile, viewGroup, false);
    }

    public final void a(d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = h;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "23b446f546b0ec4ad530863df93de3c4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "23b446f546b0ec4ad530863df93de3c4");
            return;
        }
        this.i = dVar;
        View i = i();
        if (i == null) {
            return;
        }
        if (dVar == null) {
            i.setVisibility(8);
            return;
        }
        try {
            i.setVisibility(0);
            dVar.a(this.l);
            dVar.a((ViewGroup) i.findViewById(R.id.content), dVar);
            if ("sm_type_goods_detail_price".equals(dVar.b) || "sm_type_goods_detail_commodity_upgrade".equals(dVar.b) || "sm_type_goods_detail_priceFloat".equals(dVar.b)) {
                a(new c());
            }
        } catch (Exception e) {
            com.sankuai.waimai.store.base.log.a.a(e);
        }
    }
}
