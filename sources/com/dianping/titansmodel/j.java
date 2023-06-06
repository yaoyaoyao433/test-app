package com.dianping.titansmodel;

import com.meituan.android.common.unionid.oneid.util.DeviceInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class j extends g {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public int g;
    public String h;
    public int i;
    public String j;
    public String k;
    public int l;
    public boolean m;

    public j() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "e15a43b57e2eeabea4c921cf7355ba62", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "e15a43b57e2eeabea4c921cf7355ba62");
        } else {
            this.m = true;
        }
    }

    @Override // com.dianping.titansmodel.g
    public void writeToJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "11ff2251d78227533a0bb864c3829034", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "11ff2251d78227533a0bb864c3829034");
            return;
        }
        try {
            jSONObject.put("result", this.result);
            jSONObject.put("errorMsg", this.errorMsg);
            jSONObject.put("status", this.status);
            jSONObject.put("errorCode", this.errorCode);
            jSONObject.put("token", this.e);
            jSONObject.put("unionId", this.c);
            jSONObject.put("unionIdV2", this.d);
            jSONObject.put(DeviceInfo.USER_ID, this.b);
            jSONObject.put("isNewUser", this.f);
            jSONObject.put("safetyLevel", this.g);
            jSONObject.put("phoneNumber", this.h);
            jSONObject.put("hasPassword", this.i);
            jSONObject.put("avatarURL", this.j);
            jSONObject.put("userName", this.k);
            jSONObject.put("userChannel", this.l);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.dianping.titansmodel.g, com.dianping.titansmodel.a
    public JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0212fce5c880402be1002365fda245d1", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0212fce5c880402be1002365fda245d1");
        }
        JSONObject jSONObject = new JSONObject();
        writeToJSON(jSONObject);
        return jSONObject;
    }
}
