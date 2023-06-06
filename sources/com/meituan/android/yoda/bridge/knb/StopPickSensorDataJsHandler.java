package com.meituan.android.yoda.bridge.knb;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.android.yoda.model.behavior.tool.f;
import com.meituan.android.yoda.monitor.log.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class StopPickSensorDataJsHandler extends BaseJsHandler {
    private static final String TAG = "StopPickSensorDataJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "niG5Oh2DjvoW1CL7DO3iXsdouYk4P8ZU7CVwmyXS7KdHzvK7hQ76qVJaH9gQq0taSqqoxk793FvYEAWJIE35Fw==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a716a83f507c5aac0ab2775385ae2c1c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a716a83f507c5aac0ab2775385ae2c1c");
            return;
        }
        try {
            a.a(TAG, TAG, true);
            f.a().b();
            JSONObject jSONObject = new JSONObject();
            String str = f.a().f;
            jSONObject.put(OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, str);
            jsCallback(jSONObject.toString());
            a.a(TAG, "StopPickSensorDataJsHandler end, requestCode is " + str, true);
        } catch (Exception e) {
            jsCallbackError(10000, e.getMessage());
            a.a(TAG, "Exception " + e.getMessage(), true);
        }
    }
}
