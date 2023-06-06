package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class f extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "dataUpStream";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0d0b676ffeb4849ac18f77c4587cc9c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0d0b676ffeb4849ac18f77c4587cc9c1");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge dataUpStream: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        if (!TextUtils.isEmpty(str2)) {
            try {
                HashMap hashMap = new HashMap();
                JSONObject jSONObject = new JSONObject(str2);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, jSONObject.opt(next));
                }
                if (!hashMap.isEmpty()) {
                    com.sankuai.waimai.alita.core.dataupload.b.a(hashMap);
                    a(str, mVar, str3, "");
                    return;
                }
                a(mVar, str3, "data is empty");
                return;
            } catch (Exception e) {
                a(mVar, str3, e.getMessage());
                return;
            }
        }
        a(mVar, str3, "args is empty");
    }
}
