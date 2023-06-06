package com.dianping.gcmrnmodule.agent;

import android.content.Intent;
import android.os.Bundle;
import android.support.constraint.R;
import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.gcmrnmodule.hostwrapper.a;
import com.dianping.gcmrnmodule.wrapperviews.events.m;
import com.dianping.gcmrnmodule.wrapperviews.items.modules.f;
import com.dianping.shield.dynamic.agent.DynamicScrollTabAgent;
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
import java.util.HashMap;
import java.util.HashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000b\u001a\u00020\fH\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\nH\u0016J\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u00132\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016JD\u0010\u001c\u001a\u00020\u00132\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u001ej\b\u0012\u0004\u0012\u00020\u0015`\u001f2\"\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00150!j\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0015`\"H\u0014R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/dianping/gcmrnmodule/agent/MRNScrollTabAgent;", "Lcom/dianping/shield/dynamic/agent/DynamicScrollTabAgent;", "fragment", "Landroid/support/v4/app/Fragment;", "bridgeInterface", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "shieldGAInfo", "Lcom/dianping/shield/monitor/ShieldGAInfo;", "getAliasName", "", "getDynamicHost", "Lcom/dianping/gcmrnmodule/hostwrapper/MRNModuleBaseHostWrapper;", "getDynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getShieldGAInfo", "onActivityResult", "", OtherVerifyTypeConstants.REQUEST_CODE_IDENTITY, "", Constant.KEY_RESULT_CODE, "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPageChangedCallback", "loadedPages", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "loadedPageKeys", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "mrnmodule_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class MRNScrollTabAgent extends DynamicScrollTabAgent {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ShieldGAInfo shieldGAInfo;

    public MRNScrollTabAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "10afccfa9743612479812766dbd30a53", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "10afccfa9743612479812766dbd30a53");
        }
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicScrollTabAgent, com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public final a getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "caae227fea586cb0eaa386678cc08e46", RobustBitConfig.DEFAULT_VALUE)) {
            return (a) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "caae227fea586cb0eaa386678cc08e46");
        }
        DynamicExecEnvironment execEnvironment = getExecEnvironment();
        DynamicHostInterface host = execEnvironment != null ? execEnvironment.getHost() : null;
        if (!(host instanceof a)) {
            host = null;
        }
        return (a) host;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicScrollTabAgent
    @NotNull
    public final DynamicMappingInterface getDynamicMapping() {
        return com.dianping.gcmrnmodule.mapping.a.b;
    }

    @Override // com.dianping.shield.dynamic.agent.DynamicScrollTabAgent, com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public final void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "617d7694bc303713a59d8449f4081863", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "617d7694bc303713a59d8449f4081863");
            return;
        }
        setZFrameLayoutRes(R.layout.mrnmodule_zframelayout);
        super.onCreate(bundle);
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public final void onActivityResult(int i, int i2, @Nullable Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6c0370d884491c0c0573e259c565ce92", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6c0370d884491c0c0573e259c565ce92");
            return;
        }
        super.onActivityResult(i, i2, intent);
        b.a(getHostFragment().getActivity(), i, i2, intent);
    }

    @Override // com.dianping.shield.components.scrolltab.ConfigurableScrollTabAgent
    public final void onPageChangedCallback(@NotNull HashSet<Integer> hashSet, @NotNull HashMap<String, Integer> hashMap) {
        com.dianping.gcmrnmodule.wrapperviews.a<?> a;
        Object[] objArr = {hashSet, hashMap};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33f981c126eca9c01b115fb013585437", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33f981c126eca9c01b115fb013585437");
            return;
        }
        h.b(hashSet, "loadedPages");
        h.b(hashMap, "loadedPageKeys");
        a dynamicHost = getDynamicHost();
        if (dynamicHost == null || (a = dynamicHost.a()) == null || !(a instanceof f)) {
            return;
        }
        f fVar = (f) a;
        Object[] objArr2 = {hashSet, hashMap};
        ChangeQuickRedirect changeQuickRedirect3 = f.i;
        if (PatchProxy.isSupport(objArr2, fVar, changeQuickRedirect3, false, "27f76ef48e2a1d5317d21719324a0a81", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, fVar, changeQuickRedirect3, false, "27f76ef48e2a1d5317d21719324a0a81");
            return;
        }
        h.b(hashSet, "pages");
        h.b(hashMap, "pageKeys");
        fVar.a(new m(fVar.getId(), hashSet, hashMap));
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public final String getAliasName() {
        String aliasName;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7440d541de80dc755516c4ab96b70ed3", RobustBitConfig.DEFAULT_VALUE)) {
            return (String) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7440d541de80dc755516c4ab96b70ed3");
        }
        a dynamicHost = getDynamicHost();
        return (dynamicHost == null || (aliasName = dynamicHost.getAliasName()) == null) ? getHostName() : aliasName;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.monitor.ShieldGAInterface
    @NotNull
    public final ShieldGAInfo getShieldGAInfo() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e0df6dd0e32706fda82802a53850795", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldGAInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e0df6dd0e32706fda82802a53850795");
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
