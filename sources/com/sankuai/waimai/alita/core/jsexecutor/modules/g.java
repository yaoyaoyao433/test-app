package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.event.autorunner.AlitaAutoRunManager;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class g extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "destroy";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        com.sankuai.waimai.alita.core.jsexecutor.task.d dVar;
        AlitaAutoRunManager a;
        boolean z = false;
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "0dd440f9e2857d9bf96d7636751ef9ad", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "0dd440f9e2857d9bf96d7636751ef9ad");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge destroy: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        com.sankuai.waimai.alita.core.engine.a a2 = com.sankuai.waimai.alita.core.engine.d.a().a(str);
        if (a2 != null && (dVar = a2.d) != null) {
            String str4 = dVar.b;
            String a3 = AlitaBundleUtil.a(str4, "");
            if (!TextUtils.isEmpty(a3) && (a = com.sankuai.waimai.alita.core.event.autorunner.c.a().a(a3)) != null) {
                a.a(str4);
            }
            a(str).a(dVar, str, null);
            z = true;
        }
        if (z) {
            a(str, mVar, str3, "");
        } else {
            a(mVar, str3, "JSEngine or bundleContext not found");
        }
    }
}
