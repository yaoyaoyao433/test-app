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
public class BeforeUnloadApi extends MSCApi {
    public static ChangeQuickRedirect a;

    @MsiApiMethod(isCallback = true, name = PageBeforeUnloadParam.NAVIGATION_ONPAGE_BEFORE_UNLOAD, response = PageBeforeUnloadParam.class)
    public void onPageBeforeUnload() {
    }

    @MsiApiMethod(name = "enableBeforeUnload", onUiThread = true)
    public void enableBeforeUnload(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "51913f0ee76121fae6b9c98d39641a6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "51913f0ee76121fae6b9c98d39641a6c");
            return;
        }
        int d = d(msiContext);
        e a2 = a(d(msiContext));
        if (a2 == null) {
            msiContext.onError("no page available");
            return;
        }
        a2.a(true);
        msiContext.onSuccess("enableBeforeUnload pageId:" + d);
    }

    @MsiApiMethod(name = "disableBeforeUnload", onUiThread = true)
    public void disableBeforeUnload(MsiContext msiContext) {
        Object[] objArr = {msiContext};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "bc9cfb7bf8cafcb7db002bc903f1c82f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "bc9cfb7bf8cafcb7db002bc903f1c82f");
            return;
        }
        int d = d(msiContext);
        e a2 = a(d);
        if (a2 == null) {
            msiContext.onError("no page available");
            return;
        }
        a2.a(false);
        msiContext.onSuccess("disableBeforeUnload pageId:" + d);
    }
}
