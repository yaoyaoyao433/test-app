package com.sankuai.waimai.platform.monitor;

import android.app.Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class DoveMPModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public DoveMPModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "69455f3bae418a16ee7a3900f12576f2", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "69455f3bae418a16ee7a3900f12576f2");
        }
    }

    @JSMethod(methodName = "reportFinalStatus")
    public void reportFinalStatus(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c5b713d1f6683dfb655c146012797bbd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c5b713d1f6683dfb655c146012797bbd");
            return;
        }
        MPContext machContext = getMachContext();
        if (machContext == null || !(machContext.getContext() instanceof Activity)) {
            return;
        }
        DovePageMonitor.a((Activity) machContext.getContext(), i);
    }
}
