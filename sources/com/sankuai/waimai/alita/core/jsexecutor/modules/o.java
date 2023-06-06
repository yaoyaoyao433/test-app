package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class o extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "removeTable";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "5a92d0cfa337248c150f7579df63f7b9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "5a92d0cfa337248c150f7579df63f7b9");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge removeTable: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        try {
            JSONObject jSONObject = new JSONObject(str2);
            String optString = jSONObject.optString("bizName", "");
            String optString2 = jSONObject.optString("tableKey", "");
            if (!TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString)) {
                com.sankuai.waimai.alita.core.feature.b a = com.sankuai.waimai.alita.core.feature.c.a().a(optString);
                if (a == null) {
                    a(mVar, str3);
                    return;
                }
                com.sankuai.waimai.alita.core.feature.e eVar = new com.sankuai.waimai.alita.core.feature.e();
                eVar.b = optString;
                eVar.c = optString2;
                a.b(eVar);
                a(str, mVar, str3, "");
                return;
            }
            a(mVar, str3);
        } catch (Exception e) {
            a(mVar, str3, e.getMessage());
        }
    }
}
