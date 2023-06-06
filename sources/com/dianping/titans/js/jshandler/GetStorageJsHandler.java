package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.utils.StorageUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class GetStorageJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e25cd280e4a3cbc87134d5696b53da3c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e25cd280e4a3cbc87134d5696b53da3c");
            return;
        }
        String optString = jsBean().argsJson.optString("key");
        if (TextUtils.isEmpty(optString)) {
            jsCallbackErrorMsg("empty key");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            String sharedValue = StorageUtil.getSharedValue(jsHost().getContext(), optString);
            if (sharedValue == null) {
                jSONObject.put("value", JSONObject.NULL);
            } else {
                jSONObject.put("value", sharedValue);
            }
        } catch (Exception unused) {
        }
        jsCallback(jSONObject);
    }
}
