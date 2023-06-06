package com.meituan.msc.modules.api.msi.api;

import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.page.e;
import com.meituan.msi.annotations.MsiApiEnv;
import com.meituan.msi.annotations.MsiApiMethod;
import com.meituan.msi.bean.ContainerInfo;
import com.meituan.msi.bean.MsiContext;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
@MsiApiEnv(name = ContainerInfo.ENV_MSC)
/* loaded from: classes3.dex */
public class PullDownRefreshApi extends MSCApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(isCallback = true, name = "onPullDownRefresh", response = PullDownRefreshParam.class)
    public void onPullDownRefresh() {
    }

    @MsiApiMethod(name = "startPullDownRefresh", onUiThread = true)
    public void startPullDownRefresh(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "c8bad765e69e7a7528322af562b225e9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "c8bad765e69e7a7528322af562b225e9");
            return;
        }
        int d = d(msiContext);
        e a2 = a(d);
        if (a2 == null) {
            a(msiContext, d);
            return;
        }
        a2.startPullDownRefresh();
        e(msiContext);
    }

    @MsiApiMethod(name = "stopPullDownRefresh", onUiThread = true)
    public void stopPullDownRefresh(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "35058f621b276d9b6862c045b69c9e91", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "35058f621b276d9b6862c045b69c9e91");
            return;
        }
        int d = d(msiContext);
        e a2 = a(d);
        if (a2 == null) {
            a(msiContext, d);
            return;
        }
        a2.stopPullDownRefresh();
        e(msiContext);
    }
}
