package com.sankuai.waimai.platform.machpro.module;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.machpro.base.JSMethod;
import com.sankuai.waimai.machpro.instance.MPContext;
import com.sankuai.waimai.machpro.module.MPModule;
import java.text.DecimalFormat;
/* compiled from: ProGuard */
/* loaded from: classes5.dex */
public class WMCommonUtilsModule extends MPModule {
    public static ChangeQuickRedirect changeQuickRedirect;

    public WMCommonUtilsModule(MPContext mPContext) {
        super(mPContext);
        Object[] objArr = {mPContext};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f73fdcfb5b715b3eb310ba754ace5d2f", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f73fdcfb5b715b3eb310ba754ace5d2f");
        }
    }

    @JSMethod(methodName = "formatMoney")
    public String formatMoney(double d) {
        Object[] objArr = {Double.valueOf(d)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a19e26b48550792fd919757fabe2708", RobustBitConfig.DEFAULT_VALUE) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a19e26b48550792fd919757fabe2708") : new DecimalFormat("#.##").format(d);
    }
}
