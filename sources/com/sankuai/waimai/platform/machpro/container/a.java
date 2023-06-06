package com.sankuai.waimai.platform.machpro.container;

import android.app.Activity;
import android.support.annotation.NonNull;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.restaurant.poicontainer.machpro.WMMachProActivityDelegate;
import com.sankuai.waimai.router.core.j;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class a extends com.sankuai.waimai.router.activity.c {
    public static ChangeQuickRedirect a;

    public a() {
        super(WMMPActivity.class);
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "2a9926d4c8f49890f01e9b17b95055c1", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "2a9926d4c8f49890f01e9b17b95055c1");
        }
    }

    @Override // com.sankuai.waimai.router.activity.a
    public final void a(@NonNull j jVar, int i) {
        Object[] objArr = {jVar, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "6540115578eb18002bb479f19bfc381f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "6540115578eb18002bb479f19bfc381f");
            return;
        }
        super.a(jVar, i);
        if (jVar.c instanceof Activity) {
            if ("mach_pro_waimai_restaurant_combo_page".equals(jVar.d.getQueryParameter(WMMachProActivityDelegate.MP_ENTRY)) || "mach_pro_waimai_restaurant_combo_page_general".equals(jVar.d.getQueryParameter(WMMachProActivityDelegate.MP_ENTRY))) {
                ((Activity) jVar.c).overridePendingTransition(0, 0);
            }
        }
    }
}
