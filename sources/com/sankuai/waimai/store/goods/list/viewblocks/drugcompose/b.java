package com.sankuai.waimai.store.goods.list.viewblocks.drugcompose;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class b extends com.sankuai.waimai.store.base.b implements com.meituan.android.cube.core.pager.a, f {
    public static ChangeQuickRedirect a;
    public com.sankuai.waimai.store.goods.list.templet.newmarket.b b;

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final int bl_() {
        return 5;
    }

    public b(@NonNull Context context) {
        super(context);
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "43b23c5abe29be1ed29aeb3c655c50a1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "43b23c5abe29be1ed29aeb3c655c50a1");
        }
    }

    @Override // com.sankuai.waimai.store.base.b
    public final void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "938577fc2f1aae9295588b95914e3547", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "938577fc2f1aae9295588b95914e3547");
            return;
        }
        super.onDestroy();
        if (this.b != null) {
            this.b.b();
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final void a(RecyclerView.k kVar) {
        Object[] objArr = {kVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "b490c7ae2ba92bb4b86049e4d647d718", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "b490c7ae2ba92bb4b86049e4d647d718");
        } else if (this.b != null) {
            this.b.a(kVar);
        }
    }

    @Override // com.sankuai.waimai.store.goods.list.viewblocks.drugcompose.f
    public final void bk_() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "75fcbe7d916ec0173f2701ead2e2350b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "75fcbe7d916ec0173f2701ead2e2350b");
        } else if (this.b != null) {
            this.b.R();
        }
    }

    @Override // com.meituan.android.cube.core.pager.a
    public final void a(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c0ee5395579c891883bcc0bce3645e93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c0ee5395579c891883bcc0bce3645e93");
        } else if (this.b != null) {
            this.b.c = z;
        }
    }
}
