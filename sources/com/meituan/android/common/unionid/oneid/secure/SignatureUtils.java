package com.meituan.android.common.unionid.oneid.secure;

import android.text.TextUtils;
import android.util.Base64;
import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SignatureUtils {
    public static final String SDK_SECRET = "0Lcs8743SDLoUu0LM3fI6AF7y9MbB";
    public static final String SIGN_VERSION = "0.0.1";
    public static ChangeQuickRedirect changeQuickRedirect;

    public static final String getSignature(String str, JSONObject jSONObject, String str2, long j) {
        Object[] objArr = {str, jSONObject, str2, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        byte[] bArr = null;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "b12479d31b553e4b9f1e06304c6882d6", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "b12479d31b553e4b9f1e06304c6882d6");
        }
        String param = getParam(jSONObject, str2, j);
        String str3 = "";
        try {
            if (!TextUtils.isEmpty(param)) {
                str3 = URLEncoder.encode(param, "UTF-8");
            }
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        String str4 = "";
        try {
            if (!TextUtils.isEmpty(str)) {
                str4 = URLEncoder.encode(str, "UTF-8");
            }
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        }
        String str5 = str4 + str3;
        try {
            if (!TextUtils.isEmpty(str5)) {
                bArr = SecurityUtil.HmacSHA1Encrypt(str5, SDK_SECRET);
            }
        } catch (Exception unused) {
        }
        if (bArr != null) {
            try {
                return bArr.length > 0 ? URLEncoder.encode(Base64.encodeToString(bArr, 0), "UTF-8") : "";
            } catch (UnsupportedEncodingException e3) {
                e3.printStackTrace();
                return "";
            }
        }
        return "";
    }

    private static final String getParam(JSONObject jSONObject, String str, long j) {
        Object[] objArr = {jSONObject, str, new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e29a7f528e69151ed3cb9247227d4118", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e29a7f528e69151ed3cb9247227d4118");
        }
        StringBuilder sb = new StringBuilder();
        if (jSONObject == null) {
            return "";
        }
        JSONObject optJSONObject = jSONObject.optJSONObject("idInfo");
        if (jSONObject.optJSONObject("keyDeviceInfo") != null) {
            sb.append("androidId=");
            sb.append(optJSONObject.optString(DeviceInfo.ANDROID_ID, ""));
            sb.append("&");
            sb.append("appid=");
            sb.append(optJSONObject.optString("appid", ""));
            sb.append("&");
        }
        if (optJSONObject != null) {
            sb.append("dpid=");
            sb.append(optJSONObject.optString("dpid", ""));
            sb.append("&");
            sb.append("localId=");
            sb.append(optJSONObject.optString(DeviceInfo.LOCAL_ID, ""));
            sb.append("&");
        }
        sb.append("nonce=");
        if (str == null) {
            str = "";
        }
        sb.append(str);
        sb.append("&");
        sb.append("timestamp=");
        sb.append(j <= 0 ? Long.valueOf(System.currentTimeMillis()) : String.valueOf(j));
        sb.append("&");
        sb.append("ua=");
        sb.append(getUA(jSONObject));
        sb.append("&");
        if (optJSONObject != null) {
            sb.append("unionId=");
            sb.append(optJSONObject.optString("unionId", ""));
            sb.append("&");
            sb.append("uuid=");
            sb.append(optJSONObject.optString("uuid", ""));
        }
        return sb.toString();
    }

    private static final String getUA(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a7818de372876f7ccf75dccfc0fece45", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a7818de372876f7ccf75dccfc0fece45");
        }
        if (jSONObject == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        JSONObject optJSONObject = jSONObject.optJSONObject("appInfo");
        if (optJSONObject != null) {
            sb.append(optJSONObject.optString("app", ""));
            sb.append(optJSONObject.optString("sdkVersion", ""));
            sb.append(optJSONObject.optString("version", ""));
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("deviceInfo");
        if (optJSONObject2 != null) {
            sb.append(optJSONObject2.optString(DeviceInfo.DEVICE_MODEL, ""));
        }
        JSONObject optJSONObject3 = jSONObject.optJSONObject("environmentInfo");
        if (optJSONObject3 != null) {
            sb.append(optJSONObject3.optString(DeviceInfo.CLIENT_TYPE, ""));
            sb.append(optJSONObject3.optString(DeviceInfo.OS_NAME, ""));
            sb.append(optJSONObject3.optString("osVersion", ""));
            sb.append(optJSONObject3.optString("platform", ""));
        }
        return sb.toString();
    }
}
