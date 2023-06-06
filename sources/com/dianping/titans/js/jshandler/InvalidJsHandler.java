package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class InvalidJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String mEvent;
    private String mExceptionMsg;

    public void setErrMsg(String str, String str2) {
        String str3;
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9bc71e2ee0a70f74a0f218b441e99b87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9bc71e2ee0a70f74a0f218b441e99b87");
            return;
        }
        this.mEvent = str;
        if (TextUtils.isEmpty(str2)) {
            str3 = "未知错误";
        } else {
            str3 = " catch exception: " + str2;
        }
        this.mExceptionMsg = str3;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "34acb6dc594492c2abf958a9263423ab", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "34acb6dc594492c2abf958a9263423ab");
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", "fail");
            jSONObject.put("code", 4);
            jSONObject.put("errorCode", "4");
            jSONObject.put("errMsg", "param:" + jsBean().url + " event:" + this.mEvent + " method:" + jsBean().method + " exception:" + this.mExceptionMsg);
        } catch (JSONException unused) {
        }
        jsCallback(jSONObject);
    }
}
