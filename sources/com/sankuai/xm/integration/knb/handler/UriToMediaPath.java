package com.sankuai.xm.integration.knb.handler;

import android.net.Uri;
import com.meituan.metrics.common.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.sankuai.xm.base.util.ac;
import com.sankuai.xm.base.util.k;
import com.sankuai.xm.im.utils.a;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes6.dex */
public class UriToMediaPath extends BaseIMJsHandler {
    public static final String KNB_MEDIA_PREFIX = "knb-media://client?url=";
    public static ChangeQuickRedirect changeQuickRedirect;

    @Override // com.dianping.titans.js.jshandler.BaseJsHandler
    public String getSignature() {
        return "hs/MF21NdCwAoX1XHLGRAiPjNljhgDbDtbbl4hX+t4T3TbDKBqSH5PvBF4SBAtqSh1+K7WRDZPrJUPYSfdK8KA==";
    }

    @Override // com.sankuai.xm.integration.knb.handler.BaseIMJsHandler
    public void innerExe() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "22a90eea54a714acf3137f90236cbc9c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "22a90eea54a714acf3137f90236cbc9c");
            return;
        }
        try {
            JSONArray optJSONArray = jsBean().argsJson.optJSONArray("uris");
            if (optJSONArray != null && optJSONArray.length() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String protoToUriPath = protoToUriPath(optJSONArray.getString(i));
                    if (!ac.a(protoToUriPath)) {
                        Uri parse = Uri.parse(protoToUriPath);
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(Constants.TRAFFIC_URI, optJSONArray.getString(i));
                        jSONObject.put("path", parse == null ? "" : k.a(jsHost().getContext(), parse));
                        jSONArray.put(jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("paths", jSONArray);
                jsCallback(jSONObject2);
                return;
            }
            jsCallbackError(10011, "uris param error");
        } catch (Throwable th) {
            a.a(th, "UriToMediaPath::exception info: ", new Object[0]);
            jsCallbackErrorMsg("UriToMediaPath::exception info: " + th.getMessage());
        }
    }

    private String protoToUriPath(String str) {
        int indexOf;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d6d4bc6c85ec1d5987094bf63c8b750b", 6917529027641081856L) ? (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d6d4bc6c85ec1d5987094bf63c8b750b") : (!ac.a(str) && (indexOf = str.indexOf(KNB_MEDIA_PREFIX)) >= 0) ? str.substring(indexOf + 23) : str;
    }
}
