package com.sankuai.meituan.takeoutnew.ui.page.main;

import android.app.Activity;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.takeoutnew.AppApplication;
import com.sankuai.meituan.takeoutnew.controller.e;
import com.sankuai.waimai.business.page.homepage.HomePageProvider;
import com.sankuai.waimai.foundation.utils.log.a;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class MainPageProvider implements HomePageProvider {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.business.page.homepage.HomePageProvider
    public void exitApp(Activity activity) {
        Object[] objArr = {activity};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1560999941ebaae3b50dc951dda9ebf4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1560999941ebaae3b50dc951dda9ebf4");
        } else {
            AppApplication.a(activity);
        }
    }

    @Override // com.sankuai.waimai.business.page.homepage.HomePageProvider
    public void setIsExit(boolean z) {
        Object[] objArr = {Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b772812961b0d22b6428514aa66196a0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b772812961b0d22b6428514aa66196a0");
        } else {
            AppApplication.a(z);
        }
    }

    @Override // com.sankuai.waimai.business.page.homepage.HomePageProvider
    public void downloadSplash(Context context) {
        Object[] objArr = {context};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f643bfb3badf6161fd7dcbfcd6808b0c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f643bfb3badf6161fd7dcbfcd6808b0c");
            return;
        }
        a.b("WelcomeAd", "downloadSplash()", new Object[0]);
        new e(context).a(true);
    }
}
