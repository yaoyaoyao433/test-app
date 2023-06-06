package com.dianping.agentsdk.manager;

import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.shield.manager.LightAgentManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class CommonAgentManager extends LightAgentManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected v featureBridge;

    public CommonAgentManager(Fragment fragment, com.dianping.agentsdk.framework.a aVar, v vVar, ab abVar) {
        super(fragment, aVar, vVar, abVar);
        Object[] objArr = {fragment, aVar, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b6264c1d925964287f256bbf3e9fb22c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b6264c1d925964287f256bbf3e9fb22c");
        } else {
            this.featureBridge = vVar;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00d0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.dianping.shield.manager.LightAgentManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dianping.agentsdk.framework.AgentInterface constructAgents(com.dianping.agentsdk.framework.b r13) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.agentsdk.manager.CommonAgentManager.constructAgents(com.dianping.agentsdk.framework.b):com.dianping.agentsdk.framework.AgentInterface");
    }
}
