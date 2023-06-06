package com.dianping.gcmrnmodule;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.gcmrnmodule.utils.d;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.component.widgets.container.CommonPageContainer;
import com.dianping.shield.dynamic.agent.DynamicAgent;
import com.dianping.shield.dynamic.agent.node.ComputeUnit;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.model.module.ModuleInfo;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.monitor.ShieldGAInfo;
import com.dianping.shield.monitor.ShieldGAType;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class MRNAgent extends DynamicAgent implements IDynamicPaintingCallback<ModuleInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ShieldGAInfo shieldGAInfo;

    public MRNAgent(Fragment fragment, v vVar, ab abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a4e9d09b14e85a5e3ac034ed63cbfc8c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a4e9d09b14e85a5e3ac034ed63cbfc8c");
        }
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicAgent
    public DynamicMappingInterface getDynamicMapping() {
        return com.dianping.gcmrnmodule.mapping.a.b;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicAgent, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    public com.dianping.gcmrnmodule.hostwrapper.a getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f9d8db99c7ffc4a4e2033f4f40577033", RobustBitConfig.DEFAULT_VALUE)) {
            return (com.dianping.gcmrnmodule.hostwrapper.a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f9d8db99c7ffc4a4e2033f4f40577033");
        }
        if (getDynamicExecEnvironment() == null || !(getDynamicExecEnvironment().getHost() instanceof com.dianping.gcmrnmodule.hostwrapper.a)) {
            return null;
        }
        return (com.dianping.gcmrnmodule.hostwrapper.a) getDynamicExecEnvironment().getHost();
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "2741723eb6800d5ba8e09339a2ba8f87", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "2741723eb6800d5ba8e09339a2ba8f87");
            return;
        }
        super.onActivityResult(i, i2, intent);
        com.meituan.android.mrn.services.b.a(getHostFragment().getActivity(), i, i2, intent);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public String getAliasName() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3fbc684f83d29ad50125db54789d4bdc", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3fbc684f83d29ad50125db54789d4bdc");
        }
        if (getDynamicHost() != null) {
            return getDynamicHost().getAliasName();
        }
        return getHostName();
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.monitor.ShieldGAInterface
    public ShieldGAInfo getShieldGAInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "032cb553e7de640d44bf38be0588413f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldGAInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "032cb553e7de640d44bf38be0588413f");
        }
        if (this.shieldGAInfo == null) {
            this.shieldGAInfo = new ShieldGAInfo(ShieldGAType.MRNMODULE, getAliasName());
        }
        return this.shieldGAInfo;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicAgent, com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(ModuleInfo moduleInfo) {
        Object[] objArr = {moduleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "35f4193ff6efd8d5697994fd512aec1b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "35f4193ff6efd8d5697994fd512aec1b");
        } else if (getContext() == null || getDynamicExecEnvironment() == null) {
        } else {
            setPaintingCount(getPaintingCount() + 1);
            if (getDynamicViewCellItem() != null) {
                ArrayList<ComputeUnit> arrayList = new ArrayList<>();
                getDynamicViewCellItem().diff2(moduleInfo, arrayList, (Integer) 0, (Integer) 0);
                d.a(this, arrayList);
                getDynamicViewCellItem().onComputingComplete();
                addTabAnchorListener();
                updateAgentCell();
            }
        }
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicAgent, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public PageContainerThemePackage getContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "939abf104274278c13267e5d659dc59d", RobustBitConfig.DEFAULT_VALUE)) {
            return (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "939abf104274278c13267e5d659dc59d");
        }
        if (this.pageContainer instanceof CommonPageContainer) {
            return ((CommonPageContainer) this.pageContainer).getThemePackage();
        }
        return new PageContainerThemePackage();
    }
}
