package com.sankuai.waimai.store.goods.list.delegate.impl;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import com.sankuai.waimai.store.repository.model.RestMenuResponse;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements com.sankuai.waimai.store.goods.list.delegate.e {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.goods.list.delegate.d b;

    @Override // com.sankuai.waimai.store.goods.list.delegate.e
    public void a() {
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final void a(long j) {
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.e
    public final void a(@NonNull RestMenuResponse.NavigateItem navigateItem) {
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.e
    public final void c() {
    }

    public a(com.sankuai.waimai.store.goods.list.delegate.d dVar) {
        Object[] objArr = {dVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85cbe65cf87b2db7f36986d5ae7520b6", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85cbe65cf87b2db7f36986d5ae7520b6");
        } else {
            this.b = dVar;
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dff3513615eaba111789a280b0b6c306", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dff3513615eaba111789a280b0b6c306") : this.b.d();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final SCBaseActivity k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2c3793fe6cb913e8cabcf569236dd0dc", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2c3793fe6cb913e8cabcf569236dd0dc") : this.b.k();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0b338e24a0a96cf0444d2fa3bb9f2f0", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0b338e24a0a96cf0444d2fa3bb9f2f0") : this.b.l();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final com.sankuai.shangou.stone.whiteboard.e m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c25eb6b68c580df8b57d1bd7e09d4820", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c25eb6b68c580df8b57d1bd7e09d4820") : this.b.m();
    }

    @Override // com.sankuai.waimai.store.goods.list.delegate.d
    public final String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e64385a8dc987fa803180498cc820621", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e64385a8dc987fa803180498cc820621") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu) {
        Object[] objArr = {context, view, str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f3ceb4274ceffeee08a08220c254fcb1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f3ceb4274ceffeee08a08220c254fcb1");
        } else {
            this.b.a(context, view, str, goodsSpu, null);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {context, view, str, goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0365e17cab869457745a5302a427e8e5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0365e17cab869457745a5302a427e8e5");
        } else {
            this.b.a(context, view, str, goodsSpu, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
        Object[] objArr = {activity, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3b987d42e40a1a8dee6369cc9b05a08c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3b987d42e40a1a8dee6369cc9b05a08c");
        } else {
            this.b.a(activity, goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, long j, String str, String str2) {
        Object[] objArr = {goodsSpu, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6848b71b531d0a36aff43d2830bc6a44", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6848b71b531d0a36aff43d2830bc6a44");
        } else {
            this.b.a(goodsSpu, j, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.base.a
    public final void a(GoodsSpu goodsSpu, Poi poi) {
        Object[] objArr = {goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a19e644e94da9e163d3e7e616c82391", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a19e644e94da9e163d3e7e616c82391");
        } else {
            this.b.a(goodsSpu, poi);
        }
    }
}
