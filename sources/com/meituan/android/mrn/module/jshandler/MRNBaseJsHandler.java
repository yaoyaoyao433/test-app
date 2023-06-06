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
public abstract class MRNBaseJsHandler extends BaseJsHandler {
    protected static final String DATA = "data";
    public static ChangeQuickRedirect changeQuickRedirect;

    public JSONObject getParamJSONObject() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "89096c8aeb073ea58e32ec6eb4a23539", RobustBitConfig.DEFAULT_VALUE) ? (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "89096c8aeb073ea58e32ec6eb4a23539") : this.mJsBean.argsJson.optJSONObject("params");
    }

    public Activity getCurrentActivity() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0018e93c59d7bc250c368909c27115bd", RobustBitConfig.DEFAULT_VALUE)) {
            return (Activity) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0018e93c59d7bc250c368909c27115bd");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "96ad87e4756cd90c5d07a08ff67e795b", RobustBitConfig.DEFAULT_VALUE)) {
            return (View) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "96ad87e4756cd90c5d07a08ff67e795b");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d685eb5882a2389dfe4b6cd532a7a0a5", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d685eb5882a2389dfe4b6cd532a7a0a5");
        } else {
            jsCallbackError(i, th != null ? th.getMessage() : null);
        }
    }

    public void jsCallbackError(Throwable th) {
        Object[] objArr = {th};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0725504c679dcba60cddb61c721105f7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0725504c679dcba60cddb61c721105f7");
        } else {
            jsCallbackErrorMsg(th != null ? th.getMessage() : null);
        }
    }
}
