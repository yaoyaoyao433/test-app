package com.dianping.titans.js.jshandler;

import android.os.Build;
import android.webkit.CookieManager;
import com.dianping.networklog.c;
import com.dianping.titans.js.BridgeManager;
import com.dianping.titans.js.DelegatedJsHandler;
import com.dianping.titans.js.JsHost;
import com.dianping.titansmodel.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.meituan.android.knb.bean.KNBJsErrorInfo;
import com.sankuai.titans.protocol.utils.UrlUtils;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LogoutJsHandler extends DelegatedJsHandler<JSONObject, g> {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.DelegatedJsHandler, com.dianping.titans.js.jshandler.BaseJsHandler, com.dianping.titans.js.jshandler.JsHandler
    public int jsHandlerType() {
        return 1;
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "038c86d8618d0e85438cad9d1a12c039", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "038c86d8618d0e85438cad9d1a12c039");
        } else if (BridgeManager.getJSBPerformer() == null) {
            jsCallbackError(KNBJsErrorInfo.Error_7_Api_Not_Support.getErrorCode(), "jsbPerformer not init");
        } else {
            CookieManager cookieManager = CookieManager.getInstance();
            if (Build.VERSION.SDK_INT >= 21) {
                cookieManager.removeAllCookies(null);
                cookieManager.removeSessionCookies(null);
            } else {
                cookieManager.removeSessionCookie();
                cookieManager.removeAllCookie();
            }
            BridgeManager.getJSBPerformer().logout(this);
            reportLogan(jsHost());
        }
    }

    private void reportLogan(JsHost jsHost) {
        Object[] objArr = {jsHost};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5360211f79e9f8761b28269809aa12c0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5360211f79e9f8761b28269809aa12c0");
            return;
        }
        try {
            c.a("logout@logout: url is : " + UrlUtils.clearQueryAndFragment(jsHost().getUrl()), 35, new String[]{"login"});
        } catch (Exception unused) {
        }
    }
}
