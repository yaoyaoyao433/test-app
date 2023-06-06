package com.sankuai.waimai.business.knb.handlers;

import android.text.TextUtils;
import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.android.cipstorage.q;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class GetUnplHandler extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "fdDltmBe6jTIJE6Pyc1pIp5G8hmS9ESwWdTHCOFKUNSQprFjT3A82eHEoyxcWYdoSdBe1oXzgP4RQMEV7tiFDQ==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "939a775e563af0cdcdc0001e4003cc09", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "939a775e563af0cdcdc0001e4003cc09");
        } else if (validateArgs()) {
            try {
                String b = q.a(jsHost().getContext(), "waimai_takeout").b("unpl", "");
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("result", b);
                jsCallback(jSONObject);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c598606e491836d6d37f14f0a44bfd2f", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c598606e491836d6d37f14f0a44bfd2f")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || TextUtils.isEmpty(jsBean.args) || jsBean.argsJson == null) ? false : true;
    }
}
