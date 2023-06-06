package com.dianping.sdk.pike.knb;

import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class UnbindTagJsHandler extends BaseJsHandler {
    private static final String TAG = "UnbindTagJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "fSQqtOobbJq1SzPjSbdPx3Sa6Hz1MoOhw1JPWnqGmw7q0dcieNuWU/cc+VDmBurQsXQZqF/jkgC+1yHGYZHokA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "755066d49501495176b2e14df326def3", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "755066d49501495176b2e14df326def3");
            return;
        }
        try {
            i.a(TAG, "knb unbind tag exec");
            a.a().b(jsBean().argsJson.optString("bzId"), jsBean().argsJson.optString("tag"), this);
        } catch (Throwable th) {
            i.a(TAG, "knb unbind tag ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
