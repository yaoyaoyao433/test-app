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
public class QQBaseJSHandler extends BaseJsHandler {
    private static final int REQUEST_CODE_QQ_BIND = 305;
    public static ChangeQuickRedirect changeQuickRedirect;

    public void doOAuthSuccess(FragmentActivity fragmentActivity, com.meituan.passport.oauthlogin.model.a aVar) {
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Intent a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6db27d63c9bec17db177aed06b6c170", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6db27d63c9bec17db177aed06b6c170");
        } else if (jsHost() == null || jsHost().getActivity() == null || (a = com.meituan.passport.oauthlogin.b.a().a(UserCenter.OAUTH_TYPE_QQ)) == null) {
        } else {
            jsHost().startActivityForResult(a, 305);
        }
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "610cd238a5714138dbef0d471a21e03c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "610cd238a5714138dbef0d471a21e03c");
        } else if (jsHost() == null || jsHost().getActivity() == null) {
        } else {
            Activity activity = jsHost().getActivity();
            if (i == 305) {
                if (i2 == -1) {
                    com.meituan.passport.oauthlogin.model.a a = com.meituan.passport.oauthlogin.b.a().a(intent);
                    if (a != null && (activity instanceof FragmentActivity)) {
                        p.a().a(activity, 1, "桥SDKQQ登录");
                        doOAuthSuccess((FragmentActivity) activity, a);
                    }
                } else if (i2 == 0) {
                    String b = com.meituan.passport.oauthlogin.b.a().b(intent);
                    if (activity instanceof FragmentActivity) {
                        p.a().a(activity, -999, "桥SDKQQ登录");
                    }
                    if (!TextUtils.isEmpty(b)) {
                        ae.a(activity, b).a();
                        doJsStatusCallback("status", "fail");
                    }
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
    }

    public void doJsStatusCallback(String str, Object obj) {
        Object[] objArr = {str, obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dba6c5ca5451d28d00c059fc3b2f21f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dba6c5ca5451d28d00c059fc3b2f21f");
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
