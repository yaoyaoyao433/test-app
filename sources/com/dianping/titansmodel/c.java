package com.dianping.titansmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public final class c extends g {
    public static ChangeQuickRedirect a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public Boolean g;
    public Boolean h;

    @Override // com.dianping.titansmodel.g
    public final void writeToJSON(JSONObject jSONObject) {
        Object[] objArr = {jSONObject};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f7199b16b4674374e98063ba9af37850", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f7199b16b4674374e98063ba9af37850");
            return;
        }
        try {
            jSONObject.put("result", this.result);
            jSONObject.put("errorMsg", this.errorMsg);
            jSONObject.put("status", this.status);
            jSONObject.put("errorCode", this.errorCode);
            jSONObject.put("type", this.f);
            jSONObject.put("cityId", this.e);
            jSONObject.put("cityName", this.d);
            jSONObject.put("locCityId", this.c);
            jSONObject.put("locCityName", this.b);
            if (this.g != null) {
                jSONObject.put("isForeign", this.g);
            }
            if (this.h != null) {
                jSONObject.put("isChosenForeign", this.h);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // com.dianping.titansmodel.g, com.dianping.titansmodel.a
    public final JSONObject writeToJSON() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "3ed0509bf3b711479259cc5e3530a2f5", RobustBitConfig.DEFAULT_VALUE)) {
            return (JSONObject) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "3ed0509bf3b711479259cc5e3530a2f5");
        }
        JSONObject jSONObject = new JSONObject();
        writeToJSON(jSONObject);
        return jSONObject;
    }
}
