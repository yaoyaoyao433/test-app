package com.sankuai.waimai.store.drug.goods.list.viewblocks.drugcompose;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.store.expose.v2.entity.c;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final /* synthetic */ class i implements c.a {
    public static ChangeQuickRedirect a;
    private final String b;
    private final Activity c;

    public i(String str, Activity activity) {
        this.b = str;
        this.c = activity;
    }

    @Override // com.sankuai.waimai.store.expose.v2.entity.c.a
    public final void a() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "dc90d46e5accaaa9b1e30b0cb0212dd6", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "dc90d46e5accaaa9b1e30b0cb0212dd6");
        } else {
            DrugPoiTabMRNFragment.a(this.b, this.c);
        }
    }
}
