package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class h implements View.OnClickListener {
    public static ChangeQuickRedirect a;
    private final DrugShopStatusViewModel b;
    private final Activity c;
    private final String d;

    private h(DrugShopStatusViewModel drugShopStatusViewModel, Activity activity, String str) {
        this.b = drugShopStatusViewModel;
        this.c = activity;
        this.d = str;
    }

    public static View.OnClickListener a(DrugShopStatusViewModel drugShopStatusViewModel, Activity activity, String str) {
        Object[] objArr = {drugShopStatusViewModel, activity, str};
        ChangeQuickRedirect changeQuickRedirect = a;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "68254e02f9d59baf7021b0ab21bbe63f", RobustBitConfig.DEFAULT_VALUE) ? (View.OnClickListener) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "68254e02f9d59baf7021b0ab21bbe63f") : new h(drugShopStatusViewModel, activity, str);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object[] objArr = {view};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab01d93639519f4be8dfa3b654b665ee", 4611686018427387906L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab01d93639519f4be8dfa3b654b665ee");
        } else {
            DrugPoiTabMRNFragment.a(this.b, this.c, this.d, view);
        }
    }
}
