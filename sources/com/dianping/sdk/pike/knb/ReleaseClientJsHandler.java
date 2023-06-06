package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ReleaseClientJsHandler extends BaseJsHandler {
    private static final String TAG = "ReleaseClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "K1iZRcei6a0A1tyRZgQhgauk7yPHydQybcJtq9E5AGfr7ANlgOKhw2qg1Rf4nDSE/nNM3lmTQq5jI/cdul3xVA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6e17c98692eb2af18a94fcb6577f3f99", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6e17c98692eb2af18a94fcb6577f3f99");
            return;
        }
        try {
            i.a(TAG, "knb release client exec");
            String optString = jsBean().argsJson.optString("bzId");
            a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "152325718a8930c8d1c3013263e8e9dc", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "152325718a8930c8d1c3013263e8e9dc");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar != null) {
                    dVar.e();
                    a.b.remove(optString);
                }
                jsCallback();
            }
        } catch (Throwable th) {
            i.a(TAG, "knb release client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
