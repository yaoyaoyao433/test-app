package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import org.json.JSONArray;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class j extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "getRuleList";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        JSONArray jSONArray;
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "85293df8b27cde248cf872b6f0504c03", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "85293df8b27cde248cf872b6f0504c03");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge getRuleList: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        if (!TextUtils.isEmpty(str2)) {
            try {
                String a = com.sankuai.waimai.alita.core.rule.a.a().a(str2);
                if (TextUtils.isEmpty(a)) {
                    jSONArray = new JSONArray();
                } else {
                    jSONArray = new JSONArray(a);
                }
                a(str, mVar, str3, jSONArray);
                return;
            } catch (Exception e) {
                a(mVar, str3, e.getMessage());
                return;
            }
        }
        a(mVar, str3, "args is empty");
    }
}
