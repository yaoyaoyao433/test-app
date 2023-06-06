package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a, m {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.drug.goods.list.templet.newmarket.a b;

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2270f5f5a946a3221574851fa6f75e42", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2270f5f5a946a3221574851fa6f75e42");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4727eb52dc881b2c326e40dad58b41bd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4727eb52dc881b2c326e40dad58b41bd");
            return;
        }
        super.onDestroy();
        if (this.b != null) {
            this.b.a();
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose.m
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6c4e81f2477e3a926e74fd20a3809fd4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6c4e81f2477e3a926e74fd20a3809fd4");
        } else if (this.b != null) {
            this.b.a(kVar);
        }
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8c6c856008f42e3062de6132bd72c06d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8c6c856008f42e3062de6132bd72c06d");
        } else if (this.b != null) {
            this.b.a(z);
        }
    }
}
