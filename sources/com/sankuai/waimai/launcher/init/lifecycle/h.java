package com.sankuai.waimai.launcher.init.lifecycle;

import android.app.Service;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.lifecycle.Lifecycle;
import com.sankuai.waimai.foundation.core.lifecycle.c;
import com.sankuai.waimai.launcher.model.AppInfo;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class h extends Lifecycle implements c.a {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.lifecycle.Lifecycle, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "service-lifecycle";
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.c.a
    public final void a(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "26ad4f524d52f24798250e7a27dd2dde", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "26ad4f524d52f24798250e7a27dd2dde");
            return;
        }
        AppInfo.addCreatedService(service);
        com.dianping.networklog.c.a("Service#onCreate " + service.getClass().getName(), 3);
    }

    @Override // com.sankuai.waimai.foundation.core.lifecycle.c.a
    public final void b(Service service) {
        Object[] objArr = {service};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "8839b2f197305675ecbe4c19f337c96c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "8839b2f197305675ecbe4c19f337c96c");
            return;
        }
        AppInfo.addDestroyedService(service);
        com.dianping.networklog.c.a("Service#onDestroy " + service.getClass().getName(), 3);
    }
}
