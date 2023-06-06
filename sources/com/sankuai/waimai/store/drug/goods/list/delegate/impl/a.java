package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.base.SCBaseActivity;
import com.sankuai.waimai.store.platform.domain.core.goods.GoodsSpu;
import com.sankuai.waimai.store.platform.domain.core.poi.Poi;
import com.sankuai.waimai.store.platform.shop.model.GoodsPoiCategory;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public abstract class a implements com.sankuai.waimai.store.drug.goods.list.delegate.d {
    public static ChangeQuickRedirect a;
    private com.sankuai.waimai.store.drug.goods.list.delegate.c b;

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.d
    public void a() {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public void a(long j) {
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.d
    public void c() {
    }

    public a(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0c5ab4dfc418ad540abcb1ee4c04393f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0c5ab4dfc418ad540abcb1ee4c04393f");
        } else {
            this.b = cVar;
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public final boolean n() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "017a1e0c3658e06de4e0b0b6c7ca5345", RobustBitConfig.DEFAULT_VALUE) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "017a1e0c3658e06de4e0b0b6c7ca5345")).booleanValue() : this.b.n();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public com.sankuai.waimai.store.platform.domain.manager.poi.a d() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "88b518cc095390a1f89ac51d738b5c71", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.waimai.store.platform.domain.manager.poi.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "88b518cc095390a1f89ac51d738b5c71") : this.b.d();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public SCBaseActivity k() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5e03e326cb444ef449aaa4fa387e73bf", RobustBitConfig.DEFAULT_VALUE) ? (SCBaseActivity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5e03e326cb444ef449aaa4fa387e73bf") : this.b.k();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public String l() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "a3d3594226164e30707ae146231cfd81", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "a3d3594226164e30707ae146231cfd81") : this.b.l();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public com.sankuai.shangou.stone.whiteboard.e m() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5fe71e42fd4ad2df5074605a8d1f9f53", RobustBitConfig.DEFAULT_VALUE) ? (com.sankuai.shangou.stone.whiteboard.e) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5fe71e42fd4ad2df5074605a8d1f9f53") : this.b.m();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.delegate.c
    public String b() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3751e2016305d1744733d2391363014a", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3751e2016305d1744733d2391363014a") : this.b.b();
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public void a(Context context, View view, String str, GoodsSpu goodsSpu) {
        Object[] objArr = {context, view, str, goodsSpu};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f08766fca11a082d1398a0a648eeb246", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f08766fca11a082d1398a0a648eeb246");
        } else {
            this.b.a(context, view, str, goodsSpu, null);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public void a(Context context, View view, String str, GoodsSpu goodsSpu, GoodsPoiCategory goodsPoiCategory) {
        Object[] objArr = {context, view, str, goodsSpu, goodsPoiCategory};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "170f2d44dc35c2ee860741bbf24a3d54", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "170f2d44dc35c2ee860741bbf24a3d54");
        } else {
            this.b.a(context, view, str, goodsSpu, goodsPoiCategory);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public void a(Activity activity, GoodsSpu goodsSpu, Map<String, Object> map) {
        Object[] objArr = {activity, goodsSpu, map};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2f284728aa86b9ba54fef81507f9ce18", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2f284728aa86b9ba54fef81507f9ce18");
        } else {
            this.b.a(activity, goodsSpu, map);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public void a(GoodsSpu goodsSpu, long j, String str, String str2) {
        Object[] objArr = {goodsSpu, new Long(j), str, str2};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "84047c8bbdd4f70d4de0fafb45cc8314", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "84047c8bbdd4f70d4de0fafb45cc8314");
        } else {
            this.b.a(goodsSpu, j, str, str2);
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.base.a
    public void a(GoodsSpu goodsSpu, Poi poi) {
        Object[] objArr = {goodsSpu, poi};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b5cf8685ae520057866ec63aa291d315", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b5cf8685ae520057866ec63aa291d315");
        } else {
            this.b.a(goodsSpu, poi);
        }
    }
}
