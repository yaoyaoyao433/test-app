package com.sankuai.waimai.store.drug.goods.list.controller;

import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class d extends a {
    public static ChangeQuickRedirect e;
    UniversalImageView f;
    float g;

    public d(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e186b63b71ac3940e9cec2ec3c5faed3", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e186b63b71ac3940e9cec2ec3c5faed3");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.a, com.sankuai.waimai.store.drug.goods.list.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2006a28d07373496a8bf4fa0a818d594", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2006a28d07373496a8bf4fa0a818d594");
            return;
        }
        this.f = (UniversalImageView) view.findViewById(R.id.collect);
        this.f.setColorFraction(1.0f);
        this.g = 1.0f;
        this.f.setOnClickListener(this.d);
        super.a(view);
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.a
    public final void b(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect = e;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8d0ad347ce908908f99d31c5310ed3d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8d0ad347ce908908f99d31c5310ed3d8");
        } else if (z) {
            this.f.setNeedChangeColor(false);
            this.f.setImageResource(R.drawable.wm_sc_super_drugstore_collected);
        } else {
            this.f.setNeedChangeColor(true);
            this.f.setImageResource(R.drawable.wm_sc_super_drugstore_collect);
            this.f.setColorFraction(this.g);
        }
    }
}
