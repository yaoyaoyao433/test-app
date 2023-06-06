package com.meituan.passport.oauthlogin.jsbridge;

import android.support.v4.app.FragmentActivity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WechatBaseDataJSHandler extends WechatBaseJSHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "DRLpVjJm+PA7vZZRJ7lq6k3rTtcOhPnw1O/oPVoQ6QqecwxN169WzuywrdD49YdXHyFfnTY/ZzM7f5PTsb1Pmw==";
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.WechatBaseJSHandler, com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "14f9b16f564bceb6942bbac14b8e414d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "14f9b16f564bceb6942bbac14b8e414d");
        } else {
            super.exec();
        }
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.WechatBaseJSHandler
    public void doOAuthSuccess(FragmentActivity fragmentActivity, com.meituan.passport.oauthlogin.model.a aVar) {
        Object[] objArr = {fragmentActivity, aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8865e9a008cbe4f06f6debd08f8186f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8865e9a008cbe4f06f6debd08f8186f7");
        } else if (aVar == null) {
            doOAuthFail("failed");
        } else {
            JSONObject jSONObject = new JSONObject();
            String c = com.sankuai.meituan.oauth.a.c(fragmentActivity);
            try {
                jSONObject.put("authCode", aVar.e);
                jSONObject.put("appID", c);
            } catch (JSONException unused) {
            }
            jsCallback(jSONObject);
        }
    }

    @Override // com.meituan.passport.oauthlogin.jsbridge.WechatBaseJSHandler
    public void doOAuthFail(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "301f1b51c26bf2850d3632b3f61ade5c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "301f1b51c26bf2850d3632b3f61ade5c");
        } else {
            jsCallbackError(0, str);
        }
    }
}
