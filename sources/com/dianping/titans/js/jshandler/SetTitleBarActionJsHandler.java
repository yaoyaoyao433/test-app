package com.dianping.titans.js.jshandler;

import android.text.TextUtils;
import com.dianping.titans.js.JsHost;
import com.dianping.titans.js.KNBJsHost;
import com.dianping.titans.widget.LineTitleLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class SetTitleBarActionJsHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df21c73d4997e1ab46f59c62154f9620", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df21c73d4997e1ab46f59c62154f9620");
            return;
        }
        try {
            JSONObject jSONObject = jsBean().argsJson;
            String optString = jSONObject.optString("name");
            if (TextUtils.isEmpty(optString)) {
                jsCallbackErrorMsg("no name");
                return;
            }
            String optString2 = jSONObject.optString("action", "");
            JsHost jsHost = jsHost();
            if (!(jsHost instanceof KNBJsHost)) {
                jsCallbackErrorMsg("knb only");
                return;
            }
            LineTitleLayout dynamicTitleBar = ((KNBJsHost) jsHost).getDynamicTitleBar();
            if (dynamicTitleBar == null) {
                jsCallbackErrorMsg("no dynamic title bar");
            } else if (dynamicTitleBar.setElementAction(optString, optString2)) {
                jsCallback();
            } else {
                jsCallbackErrorMsg("set error");
            }
        } catch (Throwable th) {
            jsCallbackErrorMsg(th.getMessage());
        }
    }
}
