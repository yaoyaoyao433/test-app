package com.dianping.titans.js.jshandler;

import com.dianping.titans.offline.OfflineCenter;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.tencent.connect.common.Constants;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class UnregisterServiceWorkerJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e98a2637b6f3bce59ef3823753187fc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e98a2637b6f3bce59ef3823753187fc0");
            return;
        }
        OfflineCenter.getInstance().removeProjectAssets(jsBean().argsJson.optString(Constants.PARAM_SCOPE));
        jsCallback();
    }
}
