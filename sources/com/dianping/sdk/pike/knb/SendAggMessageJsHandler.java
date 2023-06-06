package com.dianping.sdk.pike.knb;

import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SendAggMessageJsHandler extends BaseJsHandler {
    private static final String TAG = "SendAggMessageJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "W/ypcxJdY1VdjPWxukBp5a83gwrkGixEnXT0ubexdFn1ho/bK3DpFHIKG6MbEs7quA78wX78ZENm42YTQz72Jw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f15cf28e3826d09d08f52a9fa0623b51", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f15cf28e3826d09d08f52a9fa0623b51");
            return;
        }
        try {
            i.a(TAG, "knb send agg message exec");
            a.a().a(jsBean().argsJson.optString("bzId"), jsBean().argsJson.optString("alias"), jsBean().argsJson.optInt("priority", 1), jsBean().argsJson.optString("content"), this);
        } catch (Throwable th) {
            i.a(TAG, "knb send agg message ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
