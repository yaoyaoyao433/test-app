package com.sankuai.waimai.business.knb.handlers;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.router.a;
import com.sankuai.waimai.foundation.router.interfaces.c;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class ScanQRCodeHandler extends TakeoutBaseJsHandler {
    public static int ScanQRCodeCommon = 100;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int needResult;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "04de55ce8ea6925f08c23e641f1f4cdc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "04de55ce8ea6925f08c23e641f1f4cdc");
            return;
        }
        this.needResult = jsBean().argsJson.optInt("needResult", 0);
        Activity activity = jsHost().getActivity();
        Bundle bundle = new Bundle();
        bundle.putInt("needResult", this.needResult);
        try {
            a.a(activity, c.ao, bundle, ScanQRCodeCommon);
        } catch (Exception unused) {
            jsCallbackError();
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c6cae83410e98d2877f72ccb40138f52", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c6cae83410e98d2877f72ccb40138f52");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (i == ScanQRCodeCommon && this.needResult == 1) {
            String str = "";
            if (intent != null && intent.getExtras() != null) {
                str = intent.getExtras().getString("result");
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("scanResult", str);
                jsCallback(jSONObject);
            } catch (JSONException unused) {
                jsCallbackError();
            }
        }
    }

    private void jsCallbackError() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2e28ef921d70e1f79339f7c50cac387a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2e28ef921d70e1f79339f7c50cac387a");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("errorMsg", "internal error");
            jSONObject.put("errorCode", -1);
        } catch (Exception unused) {
        }
        jsCallback(jSONObject);
    }
}
