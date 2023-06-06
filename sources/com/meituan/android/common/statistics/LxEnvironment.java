package com.meituan.android.common.statistics;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.android.common.statistics.utils.JsonUtil;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class LxEnvironment {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String appMsid;
    private String appName;
    private String dpid;
    private String lch;
    private String msid;
    private Map<String, Object> tag;
    private String unionid;
    private String uuid;

    public LxEnvironment() {
    }

    public LxEnvironment(String str, String str2, String str3, String str4, String str5, String str6, String str7, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, str7, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9567b9be74bf66b22bb3b9a8800c206c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9567b9be74bf66b22bb3b9a8800c206c");
            return;
        }
        this.unionid = str;
        this.uuid = str2;
        this.dpid = str3;
        this.msid = str4;
        this.lch = str6;
        this.appName = str7;
        this.tag = map;
        this.appMsid = str5;
    }

    public LxEnvironment(String str, String str2, String str3, String str4, String str5, String str6, Map<String, Object> map) {
        Object[] objArr = {str, str2, str3, str4, str5, str6, map};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "797e356665980122f38ac2f36f5d6985", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "797e356665980122f38ac2f36f5d6985");
            return;
        }
        this.unionid = str;
        this.uuid = str2;
        this.dpid = str3;
        this.msid = str4;
        this.lch = str5;
        this.appName = str6;
        this.tag = map;
    }

    public String getUnionid() {
        return this.unionid;
    }

    public String getUuid() {
        return this.uuid;
    }

    public String getDpid() {
        return this.dpid;
    }

    public String getMsid() {
        return this.msid;
    }

    public String getAppMsid() {
        return this.appMsid;
    }

    public String getLch() {
        return this.lch;
    }

    public String getAppName() {
        return this.appName;
    }

    public Map<String, Object> getTag() {
        return this.tag;
    }

    public void setUnionid(String str) {
        this.unionid = str;
    }

    public void setUuid(String str) {
        this.uuid = str;
    }

    public void setDpid(String str) {
        this.dpid = str;
    }

    public void setMsid(String str) {
        this.msid = str;
    }

    public void setAppMsid(String str) {
        this.appMsid = str;
    }

    public void setLch(String str) {
        this.lch = str;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setTag(Map<String, Object> map) {
        this.tag = map;
    }

    public static LxEnvironment fromJson(String str) {
        Map<String, Object> map;
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8d3bfea446a7e3b77a7536c664fa2a4b", 6917529027641081856L)) {
            return (LxEnvironment) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8d3bfea446a7e3b77a7536c664fa2a4b");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("unionid", "");
            String optString2 = jSONObject.optString("uuid", "");
            String optString3 = jSONObject.optString("dpid", "");
            String optString4 = jSONObject.optString("msid", "");
            String optString5 = jSONObject.optString(Constants.Environment.KEY_APP_SESSION, "");
            String optString6 = jSONObject.optString("lch", "");
            String optString7 = jSONObject.optString("appName", "");
            String optString8 = jSONObject.optString("tag", "");
            if (!TextUtils.isEmpty(optString8)) {
                try {
                    map = JsonUtil.toMap(new JSONObject(optString8));
                } catch (Throwable unused) {
                }
                return new LxEnvironment(optString, optString2, optString3, optString4, optString5, optString6, optString7, map);
            }
            map = null;
            return new LxEnvironment(optString, optString2, optString3, optString4, optString5, optString6, optString7, map);
        } catch (JSONException unused2) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String toJson() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9ff979b90149fb3a6aef4fc4f41cbae3", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9ff979b90149fb3a6aef4fc4f41cbae3");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("unionid", this.unionid);
            jSONObject.put("uuid", this.uuid);
            jSONObject.put("dpid", this.dpid);
            jSONObject.put("msid", this.msid);
            jSONObject.put(Constants.Environment.KEY_APP_SESSION, this.appMsid);
            jSONObject.put("lch", this.lch);
            jSONObject.put("appName", this.appName);
            if (this.tag != null) {
                jSONObject.put("tag", JsonUtil.mapToJSONString(this.tag));
            }
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
