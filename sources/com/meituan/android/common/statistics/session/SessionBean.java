package com.meituan.android.common.statistics.session;

import android.text.TextUtils;
import com.meituan.android.common.statistics.Constants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class SessionBean {
    public static ChangeQuickRedirect changeQuickRedirect;
    public String lch;
    public String oauid;
    public String pushExt;
    public String pushid;
    public String slxcuid;
    public String sunionId;
    public String tc;
    public String tn;
    public String utmCampaign;
    public String utmContent;
    public String utmMedium;
    public String utmSource;
    public String utmTerm;

    public String toJsonStr() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "cc6581d16659a696fd070d3d385843f6", 6917529027641081856L)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "cc6581d16659a696fd070d3d385843f6");
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("lch", this.lch);
            jSONObject.put(Constants.Environment.KEY_PUSHID, this.pushid);
            jSONObject.put("utmSource", this.utmSource);
            jSONObject.put("utmMedium", this.utmMedium);
            jSONObject.put("utmTerm", this.utmTerm);
            jSONObject.put("utmContent", this.utmContent);
            jSONObject.put(Constants.Environment.KEY_TN, this.tn);
            jSONObject.put(Constants.Environment.KEY_TC, this.tc);
            jSONObject.put(Constants.Environment.KEY_SLXCUID, this.slxcuid);
            jSONObject.put("oauid", this.oauid);
            jSONObject.put("sunionId", this.sunionId);
            jSONObject.put(Constants.Environment.KEY_PUSH_EXT, this.pushExt);
            return jSONObject.toString();
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public static SessionBean fromJsonStr(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca2d464f16caea2c0ead2fd268e6a5ce", 6917529027641081856L)) {
            return (SessionBean) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca2d464f16caea2c0ead2fd268e6a5ce");
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            SessionBean sessionBean = new SessionBean();
            sessionBean.lch = jSONObject.optString("lch");
            sessionBean.pushid = jSONObject.optString(Constants.Environment.KEY_PUSHID);
            sessionBean.pushExt = jSONObject.optString(Constants.Environment.KEY_PUSH_EXT);
            sessionBean.utmSource = jSONObject.optString("utmSource");
            sessionBean.utmMedium = jSONObject.optString("utmMedium");
            sessionBean.utmTerm = jSONObject.optString("utmTerm");
            sessionBean.utmContent = jSONObject.optString("utmContent");
            sessionBean.tn = jSONObject.optString(Constants.Environment.KEY_TN);
            sessionBean.tc = jSONObject.optString(Constants.Environment.KEY_TC);
            sessionBean.slxcuid = jSONObject.optString(Constants.Environment.KEY_SLXCUID);
            sessionBean.oauid = jSONObject.optString("oauid");
            sessionBean.sunionId = jSONObject.optString("sunionId");
            return sessionBean;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }
}
