package com.sankuai.waimai.platform.net;

import android.app.Application;
import android.content.Context;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class NetMonitorInit extends AbsInit {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public String tag() {
        return "NetMonitorInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "03f7ea166d2c65e6bdf2758a2faa1bff", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "03f7ea166d2c65e6bdf2758a2faa1bff");
            return;
        }
        com.sankuai.waimai.foundation.utils.log.a.c("NetMonitorInit", "NetMonitorInit init done !!! ", new Object[0]);
        d a = d.a();
        Context applicationContext = application.getApplicationContext();
        Object[] objArr2 = {applicationContext};
        ChangeQuickRedirect changeQuickRedirect3 = d.a;
        if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "0f7a2d2c9d02d4dfe8c8b3762f07c579", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "0f7a2d2c9d02d4dfe8c8b3762f07c579");
        } else {
            a.a(applicationContext);
        }
    }
}
