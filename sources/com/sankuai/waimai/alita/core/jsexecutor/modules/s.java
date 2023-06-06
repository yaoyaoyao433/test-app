package com.sankuai.waimai.alita.core.jsexecutor.modules;

import android.text.TextUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.sankuai.waimai.alita.core.base.util.AlitaBundleUtil;
import com.sankuai.waimai.alita.core.event.AlitaRealTimeEventCenter;
import com.sankuai.waimai.alita.core.event.facade.d;
/* compiled from: ProGuard */
/* loaded from: classes4.dex */
public final class s extends a {
    public static ChangeQuickRedirect b;

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final String a() {
        return "sendAlitaEvent";
    }

    @Override // com.sankuai.waimai.alita.core.jsexecutor.modules.k
    public final void a(String str, String str2, String str3, m mVar) {
        com.sankuai.waimai.alita.core.jsexecutor.task.d dVar;
        com.sankuai.waimai.alita.core.event.a a;
        boolean z = false;
        Object[] objArr = {str, str2, str3, mVar};
        ChangeQuickRedirect changeQuickRedirect = b;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect, false, "4ba9aaac62f6a6e2730fdd05a3f0fe93", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect, false, "4ba9aaac62f6a6e2730fdd05a3f0fe93");
            return;
        }
        com.sankuai.waimai.alita.core.utils.c.a("JsBridge sendAlitaEvent: taskKey = " + str + ", callbackId = " + str3 + ", args = " + str2);
        com.sankuai.waimai.alita.core.engine.a a2 = com.sankuai.waimai.alita.core.engine.d.a().a(str);
        if (a2 != null && (dVar = a2.d) != null) {
            String a3 = AlitaBundleUtil.a(dVar.b, "");
            if (!TextUtils.isEmpty(a3) && (a = d.a.a(str2).a()) != null) {
                AlitaRealTimeEventCenter.getInstance().writeAlitaCustomEvent(a3, a);
                z = true;
            }
        }
        if (z) {
            a(str, mVar, str3, "");
        } else {
            a(mVar, str3, "JSEngine or bundleContext not found");
        }
    }
}
