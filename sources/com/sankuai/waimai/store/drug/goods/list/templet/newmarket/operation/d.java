package com.sankuai.waimai.store.drug.goods.list.templet.newmarket.operation;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.constraint.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.templet.newmarket.h;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends com.sankuai.waimai.store.base.b {
    public static ChangeQuickRedirect a;
    public a b;
    public b c;
    public c d;
    public boolean e;
    @NonNull
    private h f;

    public d(@NonNull Context context, @NonNull h hVar) {
        super(context);
        Object[] objArr = {context, hVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f531e61ef20419ee782bee6a0e2442fd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f531e61ef20419ee782bee6a0e2442fd");
            return;
        }
        this.e = false;
        this.f = hVar;
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onViewCreated() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bf286ff322f6cda8e616aec73e702b4e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bf286ff322f6cda8e616aec73e702b4e");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3a94c13e45c340b14c6042a029ce76fa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3a94c13e45c340b14c6042a029ce76fa");
        } else {
            this.mView.setVisibility(this.e ? 4 : 8);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void show() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "d2f5792ecbb0500ec096cf516f35113f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "d2f5792ecbb0500ec096cf516f35113f");
        } else if (this.e) {
            this.mView.setVisibility(0);
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b921018e0edc94f07d7218917b8780a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b921018e0edc94f07d7218917b8780a5");
            return;
        }
        super.onDestroy();
        this.b.onDestroy();
        this.c.onDestroy();
    }
}
