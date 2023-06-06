package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class u extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "setRuleList";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "f8173f308a54d59d11095d1591315729", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "f8173f308a54d59d11095d1591315729");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge setRuleList: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        if (!TextUtils.isEmpty(str2)) {
            try {
                JSONObject jSONObject = new JSONObject(str2);
                String optString = jSONObject.optString("bizName");
                JSONArray optJSONArray = jSONObject.optJSONArray("ruleValue");
                if (!TextUtils.isEmpty(optString)) {
                    com.sankuai.waimai.alita.core.rule.a.a().a(optString, optJSONArray.toString());
                }
                a(str, mVar, str3, "success");
                return;
            } catch (Exception e) {
                a(mVar, str3, e.getMessage());
                return;
            }
        }
        a(mVar, str3, "bizName is empty");
    }
}
