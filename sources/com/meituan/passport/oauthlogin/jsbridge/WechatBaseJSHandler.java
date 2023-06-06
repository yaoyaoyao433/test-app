package com.meituan.passport.oauthlogin.jsbridge;

import android.app.Activity;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.passport.UserCenter;
import com.meituan.passport.utils.ae;
import com.meituan.passport.utils.p;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes3.dex */
public class WechatBaseJSHandler extends BaseJsHandler {
    protected static final int REQUEST_CODE = 304;
    public static ChangeQuickRedirect changeQuickRedirect;

    public void doOAuthFail(String str) {
    }

    public void doOAuthSuccess(FragmentActivity fragmentActivity, com.meituan.passport.oauthlogin.model.a aVar) {
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b11d9581ef87b004736491c8e995e34a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b11d9581ef87b004736491c8e995e34a");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
        } else {
            jsHost().startActivityForResult(com.meituan.passport.oauthlogin.b.a().a(UserCenter.OAUTH_TYPE_WEIXIN), 304);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0549ede1ebc168e010d6096ab84d8dc4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0549ede1ebc168e010d6096ab84d8dc4");
            return;
        }
        super.onActivityResult(i, i2, intent);
        if (jsHost() == null || jsHost().getActivity() == null) {
            return;
        }
        Activity activity = jsHost().getActivity();
        if (i == 304 && i2 == -1) {
            com.meituan.passport.oauthlogin.model.a a = com.meituan.passport.oauthlogin.b.a().a(intent);
            if (a != null && (activity instanceof FragmentActivity)) {
                p.a().a(activity, 1, "桥SDK微信登录");
                doOAuthSuccess((FragmentActivity) activity, a);
            }
        } else if (i == 304 && i2 == 0) {
            String b = com.meituan.passport.oauthlogin.b.a().b(intent);
            if (activity instanceof FragmentActivity) {
                p.a().a(activity, -999, "桥SDK微信登录");
            }
            if (!TextUtils.isEmpty(b)) {
                doOAuthFail(b);
                ae.a(activity, b).a();
                doJsStatusCallback("status", "fail");
            } else {
                doOAuthFail("未知错误");
            }
        }
        if (i == 11) {
            if (i2 == -1) {
                doJsStatusCallback("status", "success");
            } else {
                doJsStatusCallback("status", "fail");
            }
        }
    }

    public void doJsStatusCallback(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22768ead14d65411bbd28bdeeaf5baa5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22768ead14d65411bbd28bdeeaf5baa5");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(str, obj);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }
}
