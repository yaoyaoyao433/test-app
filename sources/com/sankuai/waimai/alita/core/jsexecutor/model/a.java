package com.sankuai.waimai.alita.core.jsexecutor.model;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.jsexecutor.AlitaJSValue;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class a {
    public static ChangeQuickRedirect a;
    public JSONObject b;
    public int c;
    public int d;
    public int e;
    public String f;
    public JSONObject g;
    public JSONObject h;

    public static a a(AlitaJSValue alitaJSValue) {
        Object[] objArr = {alitaJSValue};
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect, true, "cebe191366543a042d759ab7276d0cab", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect, true, "cebe191366543a042d759ab7276d0cab");
        }
        if (alitaJSValue != null) {
            try {
                if (alitaJSValue.getValue() != null) {
                    JSONObject optJSONObject = new JSONObject(alitaJSValue.stringValue()).optJSONObject("data");
                    a aVar = new a();
                    try {
                        aVar.b = optJSONObject.optJSONObject("action");
                        aVar.c = optJSONObject.optInt("rule_id");
                        aVar.d = optJSONObject.optInt("rule_version");
                        aVar.f = optJSONObject.optString("exp_group_key");
                        aVar.g = optJSONObject.optJSONObject("experiment_param");
                        aVar.h = optJSONObject.optJSONObject("exp_group_info");
                        return aVar;
                    } catch (Exception unused) {
                        return aVar;
                    }
                }
            } catch (Exception unused2) {
            }
        }
        return null;
    }

    public final String toString() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect = a;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5601419fd02a05d73e1462780fd00e76", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5601419fd02a05d73e1462780fd00e76");
        }
        return "AlitaRule{action=" + this.b + ", ruleID=" + this.c + ", ruleVersion=" + this.d + ", bizSceneId=" + this.e + ", expGroupKey='" + this.f + "', experimentParam=" + this.g + ", expGroupInfo=" + this.h + '}';
    }
}
