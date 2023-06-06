package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import com.meituan.android.common.locate.util.LocationUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.foundation.location.e;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class m extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 3;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "LocationSDK";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "7a7cdd731121e79026c36f356a1affd8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "7a7cdd731121e79026c36f356a1affd8");
            return;
        }
        try {
            LocationUtils.setChannel(LocationUtils.CHANNEL.MEITUAN);
            com.sankuai.waimai.foundation.location.e.a(application, com.sankuai.meituan.takeoutnew.a.a, e.a.wm_app, new com.sankuai.waimai.platform.domain.manager.location.b());
        } catch (Exception e) {
            com.sankuai.waimai.foundation.utils.log.a.b(e);
        }
    }
}
