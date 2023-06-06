package com.meituan.android.common.statistics.external;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.StatisticsDelegate;
import com.meituan.android.common.statistics.utils.LogUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class JsToNative {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static String jsToNative(Context context, String str) {
        Object[] objArr = {context, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9fdc7240e5591da1dbc894c3d6943eed", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9fdc7240e5591da1dbc894c3d6943eed");
        }
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        String host = parse.getHost();
        String path = parse.getPath();
        if ("statistics".equals(scheme) && Constants.JSNative.JS_HOST.equals(host) && "/".equals(path)) {
            return new JsNativeDataHandler(context).parse(parse.getQueryParameter("data"));
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ProGuard */
    /* loaded from: classes2.dex */
    public static class JsNativeDataHandler extends CommonDataHandler {
        private static final int FAILED = 1;
        private static final int SUCCESSFUL = 0;
        public static ChangeQuickRedirect changeQuickRedirect;

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public int getFailCode() {
            return 1;
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public int getSuccessCode() {
            return 0;
        }

        public JsNativeDataHandler(Context context) {
            super(context);
            Object[] objArr = {context};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3149b46ff6474b417e5d1d2500ac63ac", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3149b46ff6474b417e5d1d2500ac63ac");
            }
        }

        public String parse(String str) {
            JSONObject jSONObject;
            String optString;
            String optString2;
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0ec3eb06dceb3fb9e219c355028b1bad", 6917529027641081856L)) {
                return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0ec3eb06dceb3fb9e219c355028b1bad");
            }
            try {
                try {
                    jSONObject = new JSONObject(str);
                    optString = jSONObject.optString(Constants.JSNative.DATA_CALLBACK, "");
                    optString2 = jSONObject.optString(Constants.JSNative.DATA_METHOD, "");
                } catch (Exception unused) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("code", getFailCode());
                    return jSONObject2.toString();
                }
            } catch (Exception e) {
                LogUtil.log("statistics", "JsNativeDataHandler - parse: " + e.getMessage());
            }
            if (TextUtils.isEmpty(optString2)) {
                return null;
            }
            String optString3 = jSONObject.optString("cn", "");
            if (TextUtils.isEmpty(optString3)) {
                optString3 = StatisticsDelegate.getInstance().getDefaultChannelName();
            }
            JSONObject handleData = handleData(optString3, optString2, jSONObject);
            if (handleData != null) {
                handleData.put(Constants.JSNative.DATA_CALLBACK, optString);
                return handleData.toString();
            }
            return null;
        }

        @Override // com.meituan.android.common.statistics.external.CommonDataHandler
        public boolean isOpValid(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "469bbb91de161de028793c1655d27d82", 6917529027641081856L) ? ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "469bbb91de161de028793c1655d27d82")).booleanValue() : !TextUtils.isEmpty(str) && ("setTag".equals(str) || "getTag".equals(str) || "setEvs".equals(str) || "getSFrom".equals(str) || "setEnv".equals(str) || "getEnv".equals(str) || "getReqId".equals(str) || "setWebPageData".equals(str));
        }
    }
}
