package com.meituan.android.mrn.module.jshandler;

import android.app.Activity;
import android.view.View;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public abstract class RNBaseJsHandler extends BaseJsHandler {
    protected static final String DATA = "data";
    public static ChangeQuickRedirect changeQuickRedirect;

    public JSONObject getParamJSONObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "55778e8f211a28259d55fcd37a8f6947", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "55778e8f211a28259d55fcd37a8f6947") : this.mJsBean.argsJson.optJSONObject("params");
    }

    public Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7843a54201ff25b4d652599213edde0b", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7843a54201ff25b4d652599213edde0b");
        }
        JsHost jsHost = jsHost();
        if (jsHost == null) {
            return null;
        }
        return jsHost.getActivity();
    }

    public View getView() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fca228053e95944a23131303f967d2d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fca228053e95944a23131303f967d2d4");
        }
        JsHost jsHost = jsHost();
        if (jsHost == null) {
            return null;
        }
        return jsHost.getLayWeb();
    }

    public void jsCallbackError(int i, Throwable th) {
        Object[] objArr = {Integer.valueOf(i), th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "36efa941d73ee85f5fc7e967c9a26194", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "36efa941d73ee85f5fc7e967c9a26194");
        } else {
            jsCallbackError(i, th != null ? th.getMessage() : null);
        }
    }

    public void jsCallbackError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0922bd8e63aeb70d5cb0dfec1b1f5251", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0922bd8e63aeb70d5cb0dfec1b1f5251");
        } else {
            jsCallbackErrorMsg(th != null ? th.getMessage() : null);
        }
    }
}
