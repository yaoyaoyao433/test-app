package com.dianping.titans.js.jshandler;

import android.app.Activity;
import android.content.Intent;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetResultJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final int RESULT_CANCEL;
    private final int RESULT_OK;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    public SetResultJsHandler() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4e3bc01ecbee0c440977b6dfac01114", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4e3bc01ecbee0c440977b6dfac01114");
            return;
        }
        this.RESULT_OK = -1;
        this.RESULT_CANCEL = 0;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        int i = 0;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4da7faa87d58784cfbe201cf07af687b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4da7faa87d58784cfbe201cf07af687b");
            return;
        }
        int optInt = jsBean().argsJson.optInt(Constant.KEY_RESULT_CODE);
        String optString = jsBean().argsJson.optString("resultData");
        Activity activity = jsHost().getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra("resultData", optString);
            switch (optInt) {
                case -1:
                    i = -1;
                    break;
                case 0:
                    break;
                default:
                    i = optInt;
                    break;
            }
            intent.putExtra(Constant.KEY_RESULT_CODE, i);
            activity.setResult(i, intent);
            jsCallback();
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("errorCode", "-1");
            jSONObject.put("errorMsg", "internal error.");
            jSONObject.put("status", "fail");
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }
}
