package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.drug.goods.list.controller.DrugShopStatusViewModel;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class f implements android.arch.lifecycle.l {
    public static ChangeQuickRedirect a;
    private final DrugPoiTabMRNFragment b;
    private final Activity c;
    private final DrugShopStatusViewModel d;

    public f(DrugPoiTabMRNFragment drugPoiTabMRNFragment, Activity activity, DrugShopStatusViewModel drugShopStatusViewModel) {
        this.b = drugPoiTabMRNFragment;
        this.c = activity;
        this.d = drugShopStatusViewModel;
    }

    @Override // android.arch.lifecycle.l
    public final void a(Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6efa19f536282fba4dd763cc34e5b70c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6efa19f536282fba4dd763cc34e5b70c");
        } else {
            DrugPoiTabMRNFragment.a(this.b, this.c, this.d, (Boolean) obj);
        }
    }
}
