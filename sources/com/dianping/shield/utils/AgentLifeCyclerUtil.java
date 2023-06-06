package com.dianping.shield.utils;

import com.dianping.agentsdk.framework.b;
import com.dianping.shield.env.ShieldEnvironment;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentLifeCyclerUtil {
    public static ChangeQuickRedirect changeQuickRedirect;

    public static void castConstructErrorException(b bVar) {
        Object[] objArr = {bVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "74e2259de0496ec4e4f59f1ac5bf7569", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "74e2259de0496ec4e4f59f1ac5bf7569");
        } else if (bVar != null && ShieldEnvironment.INSTANCE.isDebug()) {
            throw new RuntimeException(bVar.toString() + " construct error!");
        }
    }
}
