package com.dianping.shield.framework;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import kotlin.Metadata;
import kotlin.jvm.internal.k;
import kotlin.jvm.internal.u;
import kotlin.reflect.d;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class ShieldLifeCycler$resetAgents$1 extends k {
    public static ChangeQuickRedirect changeQuickRedirect;

    public ShieldLifeCycler$resetAgents$1(ShieldLifeCycler shieldLifeCycler) {
        super(shieldLifeCycler);
    }

    @Override // kotlin.jvm.internal.b, kotlin.reflect.b
    public final String getName() {
        return "agentManager";
    }

    @Override // kotlin.jvm.internal.b
    public final d getOwner() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c52733c68f86f241c58a0df6ac046bc", RobustBitConfig.DEFAULT_VALUE) ? (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c52733c68f86f241c58a0df6ac046bc") : u.a(ShieldLifeCycler.class);
    }

    @Override // kotlin.jvm.internal.b
    public final String getSignature() {
        return "getAgentManager()Lcom/dianping/agentsdk/framework/AgentManagerInterface;";
    }

    @Override // kotlin.reflect.j
    @Nullable
    public final Object get() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f8165b7844a7ae036764faf018156410", RobustBitConfig.DEFAULT_VALUE) ? PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f8165b7844a7ae036764faf018156410") : ((ShieldLifeCycler) this.receiver).getAgentManager();
    }

    public final void set(@Nullable Object obj) {
        Object[] objArr = {obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17f45f1bd7633f4873bb1be19285ba73", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17f45f1bd7633f4873bb1be19285ba73");
        } else {
            ((ShieldLifeCycler) this.receiver).setAgentManager((com.dianping.agentsdk.framework.d) obj);
        }
    }
}
