package com.sankuai.waimai.business.knb.bridge;

import com.dianping.titans.js.JsBean;
import com.dianping.titans.js.jshandler.BaseJsHandler;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.foundation.utils.log.a;
import com.sankuai.waimai.platform.capacity.deeplink.c;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public class RecordDeepLinkBizInfo extends BaseJsHandler {
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "ecO+j9IZEyhDclXMwlfXNeBzLrEYX1ssAhm6rDywbbM3xuJWkhkTwDaGq1Wy6eBpCVrcgaRMfm7H2VzbHFxSaA==";
    }

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public void exec() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3f38d1cea0abe445f403665f2fb3a60c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3f38d1cea0abe445f403665f2fb3a60c");
        } else if (!validateArgs()) {
            jsCallbackError(1002, "args invalid.");
        } else {
            try {
                JSONObject jSONObject = jsBean().argsJson;
                String optString = jSONObject.optString("bizKey");
                JSONObject optJSONObject = jSONObject.optJSONObject("bizInfo");
                HashMap hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, optJSONObject.get(next));
                }
                if (c.a(jsHost().getActivity(), optString, hashMap)) {
                    jsCallback();
                } else {
                    jsCallbackError(1002, "not deeplink context.");
                }
            } catch (Exception e) {
                a.b(e);
            }
        }
    }

    private boolean validateArgs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd4a17d860854b6e7125e9de438c5bd2", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd4a17d860854b6e7125e9de438c5bd2")).booleanValue();
        }
        JsBean jsBean = jsBean();
        return (jsBean == null || jsBean.argsJson == null) ? false : true;
    }
}
