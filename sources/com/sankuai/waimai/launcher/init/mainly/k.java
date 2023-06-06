package com.sankuai.waimai.launcher.init.mainly;

import android.app.Application;
import android.content.Context;
import com.meituan.passport.UserCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.assistant.report.Robust;
import com.meituan.robust.assistant.report.RobustParamsProvider;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.core.init.AbsInit;
import com.sankuai.waimai.platform.b;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public final class k extends AbsInit {
    public static ChangeQuickRedirect a;

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void asyncInit(Application application) {
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final boolean needPermission() {
        return false;
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit, com.sankuai.waimai.foundation.core.init.a
    public final int process() {
        return 1;
    }

    @Override // com.sankuai.waimai.foundation.core.init.a
    public final String tag() {
        return "HotfixInit";
    }

    @Override // com.sankuai.waimai.foundation.core.init.AbsInit
    public final void init(Application application) {
        Object[] objArr = {application};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "93683171d3d99dbec9f07cc0434fe452", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "93683171d3d99dbec9f07cc0434fe452");
            return;
        }
        Object[] objArr2 = {application};
        ChangeQuickRedirect changeQuickRedirect2 = com.sankuai.waimai.launcher.provider.a.a;
        if (PatchProxy.isSupport(objArr2, null, changeQuickRedirect2, true, "166528c6678f97627136c713f9ad4518", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, null, changeQuickRedirect2, true, "166528c6678f97627136c713f9ad4518");
        } else {
            Robust.init(application, new RobustParamsProvider() { // from class: com.sankuai.waimai.launcher.provider.a.1
                public static ChangeQuickRedirect a;

                @Override // com.meituan.robust.assistant.report.RobustParamsProvider
                public final long getUserID(Context context) {
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5ed22f270915a46cdb41e974d654b0e3", RobustBitConfig.DEFAULT_VALUE)) {
                        return ((Long) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5ed22f270915a46cdb41e974d654b0e3")).longValue();
                    }
                    if (UserCenter.getInstance(context).isLogin()) {
                        return UserCenter.getInstance(context).getUser().id;
                    }
                    return 0L;
                }

                @Override // com.meituan.robust.assistant.report.RobustParamsProvider
                public final String getVersionName(Context context) {
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "f62da1006f36f2349b9d704082fe4c0b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "f62da1006f36f2349b9d704082fe4c0b") : b.A().i();
                }

                @Override // com.meituan.robust.assistant.report.RobustParamsProvider
                public final String getChannel(Context context) {
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "db80abae5c65ad8001f84a96f7e23d59", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "db80abae5c65ad8001f84a96f7e23d59") : b.A().d();
                }

                @Override // com.meituan.robust.assistant.report.RobustParamsProvider
                public final String getUUID(Context context) {
                    Object[] objArr3 = {context};
                    ChangeQuickRedirect changeQuickRedirect3 = a;
                    return PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "5cc16eb32e3b58ffed088aba64a4372b", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "5cc16eb32e3b58ffed088aba64a4372b") : b.A().c();
                }
            });
        }
    }
}
