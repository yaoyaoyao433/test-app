package com.sankuai.waimai.store.goods.list.delegate.impl;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.R;
import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends d {
    public static ChangeQuickRedirect a;
    private Poi K;

    @Override // com.sankuai.waimai.store.goods.list.delegate.a, com.sankuai.waimai.store.goods.list.delegate.d
    public final String b() {
        return "c_waimai_sg_vya4pmi3";
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final int p() {
        return 2;
    }

    public b(@NonNull SCBaseActivity sCBaseActivity, int i) {
        super(sCBaseActivity, 3);
        Object[] objArr = {sCBaseActivity, 3};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a78cbf6703730d8fde77ffce0a7e5a76", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a78cbf6703730d8fde77ffce0a7e5a76");
            return;
        }
        this.x = com.sankuai.waimai.store.order.a.e().e(com.sankuai.waimai.store.goods.list.utils.d.a(sCBaseActivity.getIntent(), "wm_poi_id", "poiId", 0L));
        if (this.x == null) {
            this.x = new com.sankuai.waimai.store.platform.domain.manager.poi.a();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "aa77b4ba372c674d09aba40f234ec62c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "aa77b4ba372c674d09aba40f234ec62c");
            return;
        }
        super.a(fragmentActivity, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "6b32496acf7019ea2c82279111594bec", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "6b32496acf7019ea2c82279111594bec");
            return;
        }
        this.z = new com.sankuai.waimai.store.goods.list.viewblocks.aggregation.a(this);
        this.z.createAndReplaceView(this.C, R.id.layout_shop_root_scroll_container);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "47036b0fa714d5d245790842d62489fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "47036b0fa714d5d245790842d62489fb");
            return;
        }
        super.g();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "d5a7915af1d8439e11499945ebeb9566", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "d5a7915af1d8439e11499945ebeb9566");
            return;
        }
        this.i.put("source_type", Integer.valueOf(this.f));
        this.i.put("source_id", this.g);
        com.sankuai.waimai.store.manager.judas.d.b(this.y, "c_waimai_sg_vya4pmi3").a(this.i).b("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.d, this.c)).a();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2beee0cca2f783616d88097d4f879369", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2beee0cca2f783616d88097d4f879369");
            return;
        }
        super.h();
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "aaa0d90d70d5585a2a4b7d351ebf6db0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "aaa0d90d70d5585a2a4b7d351ebf6db0");
        } else {
            com.sankuai.waimai.store.manager.judas.d.d(this.y, "c_waimai_sg_vya4pmi3");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a o() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "67ee810ca00ce77c4454d32975ff1280", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "67ee810ca00ce77c4454d32975ff1280") : new com.sankuai.waimai.store.platform.domain.manager.poi.a(this.K);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final void a(@NonNull RestMenuResponse restMenuResponse, @Nullable RestRecommendPoi restRecommendPoi) {
        Object[] objArr = {restMenuResponse, restRecommendPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cef45723a495d2b02c25ff084e5622e4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cef45723a495d2b02c25ff084e5622e4");
            return;
        }
        this.K = restMenuResponse.mCartPoi;
        super.a(restMenuResponse, restRecommendPoi);
        b(restMenuResponse);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final boolean a(RestMenuResponse restMenuResponse) {
        Object[] objArr = {restMenuResponse};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "16d5cd855224bd0ce509d0f75acb396c", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "16d5cd855224bd0ce509d0f75acb396c")).booleanValue() : restMenuResponse.getPoi() == null;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b23820ddccb07a9c5bbf6ac89818f0f0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b23820ddccb07a9c5bbf6ac89818f0f0");
            return;
        }
        if (this.z != null) {
            this.z.onDestroy();
        }
        super.c();
    }
}
