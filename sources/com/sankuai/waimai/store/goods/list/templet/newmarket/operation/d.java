package com.sankuai.waimai.store.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.goods.list.templet.newmarket.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public a b;
    public b c;
    public c d;
    public boolean e;
    @NonNull
    private e f;

    public d(@NonNull Context context, @NonNull e eVar) {
        super(context);
        Object[] objArr = {context, eVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dd045b08bc3ad2418d88fd33382a9a59", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dd045b08bc3ad2418d88fd33382a9a59");
            return;
        }
        this.e = false;
        this.f = eVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7c670894db4f9a8a94d54fd9f470f0ed", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7c670894db4f9a8a94d54fd9f470f0ed");
            return;
        }
        super.onViewCreated();
        this.b = new a(this.mContext, this.f);
        this.b.bindView(this.mView);
        this.c = new b(this.mContext, this.f);
        this.c.bindView(this.mView);
        this.d = new c(this.mContext, this.f);
        this.d.bindView(findView(R.id.poi_member_entrance));
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void hide() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6158239664a931923cbfef6e375a2973", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6158239664a931923cbfef6e375a2973");
        } else {
            this.mView.setVisibility(this.e ? 4 : 8);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3c016854cc46b5c0ab6236f882c254ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3c016854cc46b5c0ab6236f882c254ea");
        } else if (this.e) {
            this.mView.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3f7e5faf35fe614b8a141eccc1de0066", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3f7e5faf35fe614b8a141eccc1de0066");
            return;
        }
        super.onDestroy();
        this.b.onDestroy();
        this.c.onDestroy();
    }
}
