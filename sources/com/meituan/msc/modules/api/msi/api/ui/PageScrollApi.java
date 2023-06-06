package com.meituan.msc.modules.api.msi.api.ui;

import com.meituan.msc.common.utils.n;
import com.meituan.msc.modules.api.msi.MSCApi;
import com.meituan.msc.modules.page.e;
import com.meituan.msc.modules.reporter.g;
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
public class PageScrollApi extends MSCApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(name = "pageScrollTo", onSerializedThread = false, onUiThread = true, request = PageScrollParam.class)
    public void pageScrollTo(PageScrollParam pageScrollParam, MsiContext msiContext) {
        Object[] objArr = {pageScrollParam, msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "50e0454439b9c047fa1ac57bd3edc85c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "50e0454439b9c047fa1ac57bd3edc85c");
            return;
        }
        e c = c(msiContext);
        if (c == null) {
            msiContext.onError("pageModule is null!");
            return;
        }
        int b = n.b(pageScrollParam.scrollTop);
        int i = pageScrollParam.duration;
        if (i < 0) {
            g.e("PageScrollApi", "duration " + i + " < 0, limit to 0");
            i = 0;
        }
        if (b < 0) {
            g.e("PageScrollApi", "scrollTop " + b + " < 0, limit to 0");
            b = 0;
        }
        c.a(b, i, msiContext);
    }
}
