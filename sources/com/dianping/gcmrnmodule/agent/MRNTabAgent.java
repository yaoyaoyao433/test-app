package com.dianping.gcmrnmodule.agent;

import android.content.Intent;
import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.gcmrnmodule.hostwrapper.a;
import com.dianping.gcmrnmodule.wrapperviews.events.w;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.g;
import com.dianping.shield.dynamic.agent.DynamicTabAgent;
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
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u001d\u0010\u0019\u001a\u00020\u00132\u000e\u0010\u001a\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u001bH\u0014¢\u0006\u0002\u0010\u001cR\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/dianping/gcmrnmodule/agent/MRNTabAgent;", "Lcom/dianping/shield/dynamic/agent/DynamicTabAgent;", "fragment", "Landroid/support/v4/app/Fragment;", "bridgeInterface", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "tabPageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "shieldGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "getAliasName", "", "getDynamicHost", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "getDynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getShieldGAInfo", "onActivityResult", "", OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, "", Constant.KEY_RESULT_CODE, "data", "Landroid/content/Intent;", "repaintByCount", "tabKeys", "", "([Ljava/lang/String;)V", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNTabAgent extends DynamicTabAgent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private final v bridgeInterface;
    private final Fragment fragment;
    private ShieldGAInfo shieldGAInfo;
    private final ab<?> tabPageContainer;

    public MRNTabAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "60f7bfdcd64cced32fd0c963ed0f5c23", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "60f7bfdcd64cced32fd0c963ed0f5c23");
            return;
        }
        this.fragment = fragment;
        this.bridgeInterface = vVar;
        this.tabPageContainer = abVar;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicTabAgent, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public final a getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b70b16b9b387c09a7a634d475d285932", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b70b16b9b387c09a7a634d475d285932");
        }
        DynamicExecEnvironment execEnvironment = getExecEnvironment();
        DynamicHostInterface host = execEnvironment != null ? execEnvironment.getHost() : null;
        if (!(host instanceof a)) {
            host = null;
        }
        return (a) host;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicTabAgent
    @NotNull
    public final DynamicMappingInterface getDynamicMapping() {
        return com.dianping.gcmrnmodule.mapping.a.b;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72f6b7251775ebe100c4e4c119d9b64a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72f6b7251775ebe100c4e4c119d9b64a");
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
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0cd01799f6d14570140d1b9acd8dbd72", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0cd01799f6d14570140d1b9acd8dbd72");
        }
        a dynamicHost = getDynamicHost();
        return (dynamicHost == null || (aliasName = dynamicHost.getAliasName()) == null) ? getHostName() : aliasName;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicTabAgent
    public final void repaintByCount(@NotNull String[] strArr) {
        com.dianping.gcmrnmodule.wrapperviews.a<?> a;
        Object[] objArr = {strArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bb9efd1d68cd822f943184181ab5e9f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bb9efd1d68cd822f943184181ab5e9f9");
            return;
        }
        h.b(strArr, "tabKeys");
        super.repaintByCount(strArr);
        a dynamicHost = getDynamicHost();
        if (dynamicHost == null || (a = dynamicHost.a()) == null || !(a instanceof g)) {
            return;
        }
        g gVar = (g) a;
        int length = strArr.length;
        Object[] objArr2 = {Integer.valueOf(length)};
        ChangeQuickRedirect changeQuickRedirect3 = com.dianping.gcmrnmodule.wrapperviews.items.modules.a.g;
        if (PatchProxy.isSupport(objArr2, gVar, changeQuickRedirect3, false, "4300209f6bde9c07a4034404952c9382", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, gVar, changeQuickRedirect3, false, "4300209f6bde9c07a4034404952c9382");
        } else if (((com.dianping.gcmrnmodule.wrapperviews.items.modules.a) gVar).h != null) {
            com.dianping.gcmrnmodule.wrapperviews.containers.tabmodule.b bVar = ((com.dianping.gcmrnmodule.wrapperviews.items.modules.a) gVar).h;
            if (bVar == null) {
                h.a();
            }
            gVar.a(new w(bVar.getId(), length));
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.monitor.ShieldGAInterface
    @NotNull
    public final ShieldGAInfo getShieldGAInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "968544e443e7f6ed48bfbf8d62d5765b", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldGAInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "968544e443e7f6ed48bfbf8d62d5765b");
        }
        ShieldGAInfo shieldGAInfo = this.shieldGAInfo;
        if (shieldGAInfo == null) {
            ShieldGAInfo shieldGAInfo2 = new ShieldGAInfo(ShieldGAType.MRNMODULE, getAliasName());
            this.shieldGAInfo = shieldGAInfo2;
            return shieldGAInfo2;
        }
        return shieldGAInfo;
    }
}
