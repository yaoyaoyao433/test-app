package com.sankuai.waimai.business.page.home.assist;

import android.app.Activity;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.router.method.Func2;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class KingKongSABlockInit implements Func2<Activity, View, com.sankuai.waimai.business.page.common.arch.a> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.router.method.Func2
    public com.sankuai.waimai.business.page.common.arch.a call(Activity activity, View view) {
        Object[] objArr = {activity, view};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18d958920b0be4699c53108b33000555", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.sankuai.waimai.business.page.common.arch.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18d958920b0be4699c53108b33000555");
        }
        b bVar = new b(activity);
        bVar.b(view);
        return bVar;
    }
}
