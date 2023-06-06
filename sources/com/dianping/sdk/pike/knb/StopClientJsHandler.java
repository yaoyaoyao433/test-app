package com.dianping.sdk.pike.knb;

import android.text.TextUtils;
import com.dianping.sdk.pike.d;
import com.dianping.sdk.pike.i;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class StopClientJsHandler extends BaseJsHandler {
    private static final String TAG = "StopClientJsHandler";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "JB+FVURvLyLAJLt/Bidq1t6Ggj1l9i8FpIIKho2mt7mqHnYAQOLaea6u4ac8LcOiLJL9M8XZV6c2nNkC6kG6Vg==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00f3df9ae2952eb359f90dcc80c8c951", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00f3df9ae2952eb359f90dcc80c8c951");
            return;
        }
        try {
            JsHandlerFactory.registerJsHandler("pike.stopClient", "JB+FVURvLyLAJLt/Bidq1t6Ggj1l9i8FpIIKho2mt7mqHnYAQOLaea6u4ac8LcOiLJL9M8XZV6c2nNkC6kG6Vg==", StopClientJsHandler.class);
            i.a(TAG, "knb stop client exec");
            String optString = jsBean().argsJson.optString("bzId");
            a a = a.a();
            Object[] objArr2 = {optString, this};
            ChangeQuickRedirect changeQuickRedirect3 = a.a;
            if (PatchProxy.isSupport(objArr2, a, changeQuickRedirect3, false, "8d3696a10366b61370e96194a1e9f2c1", RobustBitConfig.DEFAULT_VALUE)) {
                PatchProxy.accessDispatch(objArr2, a, changeQuickRedirect3, false, "8d3696a10366b61370e96194a1e9f2c1");
            } else if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("bzId is null or empty");
            } else {
                d dVar = a.b.get(optString);
                if (dVar != null) {
                    dVar.e();
                    jsCallback();
                    return;
                }
                jsCallbackErrorMsg("init client first");
            }
        } catch (Throwable th) {
            i.a(TAG, "knb stop client ", th);
            jsCallbackErrorMsg(th.toString());
        }
    }
}
