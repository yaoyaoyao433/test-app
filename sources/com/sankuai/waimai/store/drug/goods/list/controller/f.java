package com.sankuai.waimai.store.drug.goods.list.controller;

import android.support.constraint.R;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.view.banner.roundview.UniversalImageView;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class f extends b {
    public static ChangeQuickRedirect b;
    UniversalImageView c;

    public f(com.sankuai.waimai.store.drug.goods.list.delegate.c cVar) {
        super(cVar);
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5783623209a2dffbbe6323e75c1be8b9", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5783623209a2dffbbe6323e75c1be8b9");
        }
    }

    @Override // com.sankuai.waimai.store.drug.goods.list.controller.g
    public final void a(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "00e5020e910799229d4323928d5f1886", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "00e5020e910799229d4323928d5f1886");
            return;
        }
        super.a(view);
        this.c = (UniversalImageView) view.findViewById(R.id.back);
        this.c.setColorFraction(1.0f);
        this.c.setOnClickListener(this.a);
    }
}
