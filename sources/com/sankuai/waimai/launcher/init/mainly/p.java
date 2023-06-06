package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.mapsdk.maps.MapsInitializer;
import com.sankuai.waimai.alita.platform.monitor.AlitaMonitorCenter;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.log.judas.JudasManualManager;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class p extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "MapInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void idleInit(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "ab14faadca5ab90ee86ffeb1983e4abc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "ab14faadca5ab90ee86ffeb1983e4abc");
            return;
        }
        super.idleInit(application);
        try {
            MapsInitializer.initMapSDK(com.meituan.android.singleton.b.a, 3, com.sankuai.waimai.config.a.a().d(), com.sankuai.waimai.platform.b.A().c(), "");
            JudasManualManager.a a2 = JudasManualManager.b("b_q86UQ").a("uuid", com.sankuai.waimai.platform.b.A().c()).a("platform", "waimai_android").a(AlitaMonitorCenter.AlitaMonitorConst.CommonEnv.TAG_KEY_APP_VERSION, com.sankuai.waimai.platform.b.A().i()).a("sdk_version", "0.2.5");
            StringBuilder sb = new StringBuilder();
            sb.append(System.currentTimeMillis());
            a2.a("time", sb.toString()).a();
        } catch (Throwable th) {
            com.sankuai.waimai.foundation.utils.log.a.b(th);
        }
    }
}
