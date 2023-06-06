package com.meituan.android.yoda.bridge.knb;

import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.yoda.monitor.log.a;
import com.meituan.android.yoda.util.x;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class YodaInfoJsHandler extends BaseJsHandler {
    private static final String TAG = "YodaInfoJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "aaG7Crprhre9fGp8H2ceqbb0DTYx5fp1UlF1mhSnZsrZIOX8lQQCkFNQ8DXCc3G6RBi74gRJwUktNJRHjCKrzA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3cc5ef75eb4e6771c6e6824254a2a0c2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3cc5ef75eb4e6771c6e6824254a2a0c2");
            return;
        }
        try {
            a.a(TAG, "YodaInfoJsHandler start", true);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", x.i());
            jSONObject.put("source", 4);
            jsCallback(jSONObject.toString());
            a.a(TAG, "YodaInfoJsHandler end ", true);
        } catch (Exception e) {
            jsCallbackError(10000, e.getMessage());
            a.a(TAG, "Exception " + e.getMessage(), true);
        }
    }
}
