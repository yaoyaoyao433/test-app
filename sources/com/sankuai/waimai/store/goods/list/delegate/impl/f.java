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
import com.sankuai.waimai.store.config.SCConfigPath;
import com.sankuai.waimai.store.config.j;
import com.sankuai.waimai.store.entity.RestRecommendPoi;
import com.sankuai.waimai.store.goods.list.viewblocks.l;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends d {
    public static ChangeQuickRedirect a;
    private boolean K;

    @Override // com.sankuai.waimai.store.goods.list.delegate.a, com.sankuai.waimai.store.goods.list.delegate.d
    public final String b() {
        return "c_xygemhjf";
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final int p() {
        return 1;
    }

    public f(@NonNull SCBaseActivity sCBaseActivity, int i) {
        super(sCBaseActivity, 2);
        Object[] objArr = {sCBaseActivity, 2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "44c2b2caf2fa6da2d296a4a59bfd90aa", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "44c2b2caf2fa6da2d296a4a59bfd90aa");
        } else {
            this.K = true;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void a(FragmentActivity fragmentActivity, Bundle bundle) {
        Object[] objArr = {fragmentActivity, bundle};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c95be60a6f5f3e5c2e39fdd380a5f789", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c95be60a6f5f3e5c2e39fdd380a5f789");
            return;
        }
        super.a(fragmentActivity, bundle);
        Object[] objArr2 = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "883a844a38c963398d69fdb473cbae7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "883a844a38c963398d69fdb473cbae7c");
            return;
        }
        if (this.z != null) {
            this.z.onDestroy();
        }
        this.z = new l(this);
        this.z.createAndReplaceView(this.C, R.id.layout_shop_root_scroll_container);
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void g() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6d9fa54033716ebee0073635873a61dd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6d9fa54033716ebee0073635873a61dd");
            return;
        }
        super.g();
        if (this.z != null) {
            this.z.onResume();
        }
        com.sankuai.waimai.store.manager.judas.d.a(this.y);
        if (this.K) {
            return;
        }
        u();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void h() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "66fe23a34ba54704187f591a471d3eb9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "66fe23a34ba54704187f591a471d3eb9");
            return;
        }
        super.h();
        com.sankuai.waimai.store.manager.judas.d.d(this.y, "c_xygemhjf");
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d
    public final void a(@NonNull RestMenuResponse restMenuResponse, @Nullable RestRecommendPoi restRecommendPoi) {
        Object[] objArr = {restMenuResponse, restRecommendPoi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "cb675ddac629f46ca634adb1ded81d42", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "cb675ddac629f46ca634adb1ded81d42");
            return;
        }
        super.a(restMenuResponse, restRecommendPoi);
        u();
        long f = this.x.f();
        String h = this.x.h();
        Object[] objArr2 = {new Long(f), h};
        ChangeQuickRedirect changeQuickRedirect2 = a;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "20da1166b6f46d2aff25fc3e84b378ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "20da1166b6f46d2aff25fc3e84b378ba");
        } else if (j.h().a(SCConfigPath.PAGE_GOODS_SUB_SUPERMARKET_MARKETING_REQUEST, false)) {
            a(7, f, h);
        }
        b(restMenuResponse);
    }

    private void u() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6cf1c8dd4b04cea0d10a00cd9cc06166", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6cf1c8dd4b04cea0d10a00cd9cc06166");
            return;
        }
        Poi poi = this.x.b;
        com.sankuai.waimai.store.manager.judas.d.b(this.y, "c_xygemhjf").b("poi_id", com.sankuai.waimai.store.platform.domain.manager.poi.a.a(this.d, this.c)).b("stid", poi == null ? "" : poi.abExpInfo).a();
        com.sankuai.waimai.store.manager.judas.d.a(this.y, "c_xygemhjf");
        this.K = false;
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.impl.d, com.sankuai.waimai.store.base.a
    public final void c() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8aa8caf28d526b2ba572478db17348af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8aa8caf28d526b2ba572478db17348af");
            return;
        }
        super.c();
        if (this.z != null) {
            this.z.onDestroy();
        }
    }
}
