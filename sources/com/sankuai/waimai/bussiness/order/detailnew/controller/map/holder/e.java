package com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder;

import android.content.Context;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MTMap;
import com.sankuai.meituan.mapsdk.maps.model.LatLng;
import com.sankuai.waimai.foundation.utils.g;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class e extends a {
    public static ChangeQuickRedirect v;

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int c() {
        return R.drawable.wm_order_status_map_marker_user_default_new;
    }

    public e(Context context, MTMap mTMap, LatLng latLng, String str, com.sankuai.waimai.bussiness.order.detailnew.pgablock.fixedarea.map.b bVar, com.sankuai.waimai.business.order.api.detail.block.a aVar) {
        super(context, mTMap, latLng, str, bVar, aVar);
        Object[] objArr = {context, mTMap, latLng, str, bVar, aVar};
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c7d6ab0701a233db1ec731669e268672", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c7d6ab0701a233db1ec731669e268672");
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6b3629ce28333aa13cbb44bb8adf1e96", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6b3629ce28333aa13cbb44bb8adf1e96");
        } else {
            a(R.layout.wm_order_status_layout_map_marker_user, true);
        }
    }

    @Override // com.sankuai.waimai.bussiness.order.detailnew.controller.map.holder.a
    public final int f() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = v;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "9a1a0f88cd59df6c776ae8eb9055c228", RobustBitConfig.DEFAULT_VALUE) ? ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "9a1a0f88cd59df6c776ae8eb9055c228")).intValue() : g.a(this.b, 10.0f);
    }
}
