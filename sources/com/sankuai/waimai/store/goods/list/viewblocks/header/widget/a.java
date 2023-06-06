package com.sankuai.waimai.store.goods.list.viewblocks.header.widget;

import android.support.annotation.NonNull;
import android.support.constraint.R;
import android.view.View;
import com.meituan.android.neohybrid.core.config.KernelConfig;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.delegate.d;
import com.sankuai.waimai.store.goods.list.viewblocks.header.l;
import com.sankuai.waimai.store.manager.judas.b;
import com.sankuai.waimai.store.router.g;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends l {
    public static ChangeQuickRedirect d;
    private com.sankuai.waimai.store.platform.domain.manager.poi.a e;
    private d f;

    public a(@NonNull d dVar, @NonNull View view) {
        super(dVar.k(), view);
        Object[] objArr = {dVar, view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "413420139b6cc08ce677d72fb46e2bb2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "413420139b6cc08ce677d72fb46e2bb2");
            return;
        }
        this.e = dVar.d();
        this.f = dVar;
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.l
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "765031d93ffe08ba4ca314a8714dc047", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "765031d93ffe08ba4ca314a8714dc047");
            return;
        }
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "c5f8986015b9eef9beb227a6196ff728", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "c5f8986015b9eef9beb227a6196ff728");
        } else if (this.e.c()) {
            g.a(this.f.k(), this.e.f(), this.e.b.getStringPoiId(), 101, this.e.b, 1, this.f == null ? "" : this.f.b());
        }
        if (view.getId() == R.id.shop_logo_layout) {
            a("0");
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.header.l
    public final void b(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bec0a83c3beabdf3f7a61a4b08138112", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bec0a83c3beabdf3f7a61a4b08138112");
            return;
        }
        String poiStoryUrl = this.e.b.getPoiStoryUrl();
        Object[] objArr2 = {poiStoryUrl};
        ChangeQuickRedirect changeQuickRedirect2 = d;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "dbfb66cb798f4cb96c32021e2c851cbe", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "dbfb66cb798f4cb96c32021e2c851cbe");
        } else {
            com.sankuai.waimai.store.router.d.a(this.f.k(), poiStoryUrl);
        }
        a("1");
    }

    private void a(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect = d;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "245a4d149779e15adf2df85a57bb234c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "245a4d149779e15adf2df85a57bb234c");
        } else if (this.e.c()) {
            b.a(this.f.b(), "b_TSnrt").a(this.f.k()).a("poi_id", this.e.d()).a(KernelConfig.KEY_CONTAINER_TYPE, Integer.valueOf(this.e.v())).a("direct_to", str).a();
        }
    }
}
