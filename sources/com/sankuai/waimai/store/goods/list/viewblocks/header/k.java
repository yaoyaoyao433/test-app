package com.sankuai.waimai.store.goods.list.viewblocks.header;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends j {
    public static ChangeQuickRedirect c;
    public com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.b d;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j
    public final int a() {
        return R.layout.wm_st_goods_list_layout_list_header_b;
    }

    public k(@NonNull com.sankuai.waimai.store.goods.list.delegate.d dVar, ViewGroup viewGroup) {
        super(dVar, viewGroup);
        Object[] objArr = {dVar, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3e43789ea4ad877ec3bb9b26224668fc", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3e43789ea4ad877ec3bb9b26224668fc");
        } else {
            createView(viewGroup);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j, com.sankuai.waimai.store.base.b
    public final View onCreateView(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Object[] objArr = {layoutInflater, viewGroup};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "077717911f0d56a2fa6315b0a67f1852", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "077717911f0d56a2fa6315b0a67f1852");
        }
        View onCreateView = super.onCreateView(layoutInflater, viewGroup);
        this.d = new com.sankuai.waimai.store.goods.list.viewblocks.header.preferential.old.a(this.a.k(), this.b, this.a.l());
        this.d.bindView(onCreateView.findViewById(R.id.preferential_view));
        return onCreateView;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j
    public final void a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75401feed3d0565f9ed0cbc47af96b72", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75401feed3d0565f9ed0cbc47af96b72");
            return;
        }
        super.a(restMenuResponse);
        this.d.a(restMenuResponse.getPoi().getLabelInfoList(), restMenuResponse.getPoi().getPoiCoupon());
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.j, com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = c;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c252012bd7c80f44cc44e7d56378ea82", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c252012bd7c80f44cc44e7d56378ea82");
            return;
        }
        super.onDestroy();
        this.d.onDestroy();
    }
}
