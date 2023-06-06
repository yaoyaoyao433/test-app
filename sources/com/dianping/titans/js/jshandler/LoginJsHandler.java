package com.dianping.titans.js.jshandler;

import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titans.js.JsHandlerFactory;
import com.dianping.titans.utils.JavaScriptComposer;
import com.dianping.titansmodel.g;
import com.dianping.titansmodel.j;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LoginJsHandler extends DelegatedJsHandler<JSONObject, g> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2b574bcff405e0268fef8d624d342af2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2b574bcff405e0268fef8d624d342af2");
        } else if (BridgeManager.getJSBPerformer() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support.getErrorCode(), "jsbPerformer not init");
        } else {
            BridgeManager.getJSBPerformer().login(this);
        }
    }

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.IJSHandlerDelegate
    public void successCallback(g gVar) {
        Object[] objArr = {gVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "81fb2fe66284eb036debc55056551767", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "81fb2fe66284eb036debc55056551767");
            return;
        }
        super.successCallback(gVar);
        if ((gVar instanceof j) && ((j) gVar).m) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(DeviceInfo.USER_ID, ((j) gVar).b);
                jSONObject.put("deviceId", ((j) gVar).c);
            } catch (JSONException unused) {
            }
            JsHandlerFactory.publish(JavaScriptComposer.makeCustomeEvent("KNB:userLogin", jSONObject));
        }
    }
}
