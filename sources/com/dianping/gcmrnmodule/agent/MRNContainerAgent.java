package com.dianping.gcmrnmodule.agent;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.gcmrnmodule.hostwrapper.a;
import com.dianping.shield.dynamic.agent.DynamicContainerAgent;
import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldGAType;
import com.meituan.android.mrn.services.b;
import com.meituan.android.pay.model.OtherVerifyTypeConstants;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import com.unionpay.tsmservice.data.Constant;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0019"}, d2 = {"Lcom/dianping/gcmrnmodule/agent/MRNContainerAgent;", "Lcom/dianping/shield/dynamic/agent/DynamicContainerAgent;", "fragment", "Landroid/support/v4/app/Fragment;", "bridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "shieldGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "getAliasName", "", "getDynamicHost", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "getDynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getShieldGAInfo", "onActivityResult", "", OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, "", Constant.KEY_RESULT_CODE, "data", "Landroid/content/Intent;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNContainerAgent extends DynamicContainerAgent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ShieldGAInfo shieldGAInfo;

    public MRNContainerAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9a16492f8dfbec3db64a0bc898fe3b61", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9a16492f8dfbec3db64a0bc898fe3b61");
        }
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicContainerAgent, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public final a getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2cc0ca7266cb9d681b37b0a97b8e2c57", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2cc0ca7266cb9d681b37b0a97b8e2c57");
        }
        DynamicExecEnvironment execEnvironment = getExecEnvironment();
        DynamicHostInterface host = execEnvironment != null ? execEnvironment.getHost() : null;
        if (!(host instanceof a)) {
            host = null;
        }
        return (a) host;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicContainerAgent
    @NotNull
    public final DynamicMappingInterface getDynamicMapping() {
        return com.dianping.gcmrnmodule.mapping.a.b;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6ea680883e6eae8f1df0ac32e9b57a6c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6ea680883e6eae8f1df0ac32e9b57a6c");
            return;
        }
        super.onActivityResult(i, i2, intent);
        b.a(getHostFragment().getActivity(), i, i2, intent);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public final String getAliasName() {
        String aliasName;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f1998a459733d11519386d35bc04accf", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f1998a459733d11519386d35bc04accf");
        }
        a dynamicHost = getDynamicHost();
        return (dynamicHost == null || (aliasName = dynamicHost.getAliasName()) == null) ? getHostName() : aliasName;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.monitor.ShieldGAInterface
    @NotNull
    public final ShieldGAInfo getShieldGAInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5e748a5cc698f7eb555d9f73244754d4", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldGAInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5e748a5cc698f7eb555d9f73244754d4");
        }
        ShieldGAInfo shieldGAInfo = this.shieldGAInfo;
        return shieldGAInfo == null ? new ShieldGAInfo(ShieldGAType.MRNMODULE, getAliasName()) : shieldGAInfo;
    }
}
