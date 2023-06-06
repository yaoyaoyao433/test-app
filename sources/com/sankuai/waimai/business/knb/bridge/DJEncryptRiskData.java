package com.sankuai.waimai.business.knb.bridge;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.JsBridgeResult;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.k;
import com.sankuai.waimai.platform.encrypt.a;
import com.sankuai.waimai.platform.encrypt.c;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class DJEncryptRiskData extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "MAwLy2d8YrljBp43atYW4oeePzgfwOS/wo4HUxj4t7IPeO0sAhsYvdjABtuXICbMmaHqTUrwKubQ99cuWzBwGA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "99e600f7d8897514df194599c1b84009", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "99e600f7d8897514df194599c1b84009");
        } else if (validateArgs()) {
            JSONObject jSONObject = new JSONObject();
            try {
                int optInt = jsBean().argsJson.optInt(JsBridgeResult.ARG_KEY_LOCATION_MODE);
                if (optInt == 0) {
                    String optString = jsBean().argsJson.optString("data");
                    if (!TextUtils.isEmpty(optString)) {
                        jSONObject.put("encryptData", c.a().a(optString));
                    } else {
                        jSONObject.put("status", "fail");
                        jSONObject.put("reason", "请传有效的加密内容");
                        jSONObject.put("encryptData", "");
                    }
                } else if (optInt == 1) {
                    String optString2 = jsBean().argsJson.optString("url");
                    if (!TextUtils.isEmpty(optString2) && a.a().a(optString2)) {
                        jSONObject.put("encryptData", c.a().a(k.a().toJson(c.a().b())));
                    } else {
                        jSONObject.put("status", "fail");
                        jSONObject.put("reason", "请传有效的加密链接");
                        jSONObject.put("encryptData", "");
                    }
                }
            } catch (Exception e) {
                com.sankuai.waimai.foundation.utils.log.a.b(e);
            }
            jsCallback(jSONObject);
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "492a79224e2c52ddf7824f0981e845d3", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "492a79224e2c52ddf7824f0981e845d3")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
