package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReleaseAggClientJsHandler extends BaseJsHandler {
    private static final String TAG = "ReleaseAggClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "t23Hc8R06mV2LOcaOibr2C9OkoiOMtPkA94J8+EdWzQ432EjTOUY6JqOC+8ie0yO/mnfTtwyFBgv5AkI/4w8mg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "40a99c092380193359df0ddabcd3fc16", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "40a99c092380193359df0ddabcd3fc16");
            return;
        }
        try {
            i.a(TAG, "knb release agg client exec");
            String optString = jsBean().argsJson.optString("bzId");
            a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "32a32011d07f23d330440c9b26fc078b", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "32a32011d07f23d330440c9b26fc078b");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                com.dianping.sdk.pike.agg.a aVar = a.c.get(optString);
                if (aVar != null) {
                    aVar.e();
                    a.c.remove(optString);
                }
                jsCallback();
            }
        } catch (Throwable th) {
            i.a(TAG, "knb release agg client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
