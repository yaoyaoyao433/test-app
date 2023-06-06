package com.sankuai.waimai.launcher.init.secondary;

import android.app.Application;
import com.dianping.jscore.SOLibraryLoader;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class v extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "SoLoaderInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "1e0f428b908a3c6161a46dfc88e98fc1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "1e0f428b908a3c6161a46dfc88e98fc1");
            return;
        }
        SOLibraryLoader.sContext = application.getApplicationContext();
        com.facebook.soloader.h.a(application.getApplicationContext(), false);
        com.meituan.android.soloader.k.a(application.getApplicationContext(), false);
    }
}
