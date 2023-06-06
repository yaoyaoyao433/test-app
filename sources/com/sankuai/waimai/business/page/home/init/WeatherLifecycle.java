package com.sankuai.waimai.business.page.home.init;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.business.page.homepage.controller.c;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class WeatherLifecycle extends Lifecycle implements com.sankuai.waimai.foundation.core.lifecycle.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToForeground(Activity activity) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "WeatherLifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.a
    public void onAppToBackground(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d23f49305a8f6e6a089bd537264c8bdd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d23f49305a8f6e6a089bd537264c8bdd");
            return;
        }
        c a = c.a();
        a.b = null;
        a.f = false;
    }
}
