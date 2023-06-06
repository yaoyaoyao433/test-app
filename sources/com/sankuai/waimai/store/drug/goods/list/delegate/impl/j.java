package com.sankuai.waimai.store.drug.goods.list.delegate.impl;

import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class j implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final c b;

    private j(c cVar) {
        this.b = cVar;
    }

    public static View.OnClickListener a(c cVar) {
        Object[] objArr = {cVar};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "32fe0bf87c9df4066193ea657b1c31d3", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "32fe0bf87c9df4066193ea657b1c31d3") : new j(cVar);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "114c9002b0ccd7410f81bc01885adfe2", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "114c9002b0ccd7410f81bc01885adfe2");
            return;
        }
        c cVar = this.b;
        Object[] objArr2 = {cVar, view};
        ChangeQuickRedirect changeQuickRedirect2 = c.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "a858818be748ce0b87ce6eff7b148fe4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "a858818be748ce0b87ce6eff7b148fe4");
            return;
        }
        String str = ((DrugShopStatusViewModel) android.arch.lifecycle.q.a((FragmentActivity) cVar.y).a(DrugShopStatusViewModel.class)).g;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.sankuai.waimai.store.router.d.a(cVar.y, str);
        DrugShopStatusViewModel.a(cVar.x.h(), 2, cVar.y.d());
    }
}
