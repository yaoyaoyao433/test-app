package com.dianping.shield.dynamic.agent;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.agent.HoloAgent;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.v;
import com.dianping.eunomia.c;
import com.dianping.eunomia.f;
import com.dianping.shield.AgentConfigParser;
import com.dianping.shield.bridge.feature.AgentFinderInterface;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.component.utils.PageContainerThemePackage;
import com.dianping.shield.dynamic.env.DynamicExecEnvironment;
import com.dianping.shield.dynamic.env.DynamicExecutorInterface;
import com.dianping.shield.dynamic.mapping.DynamicMappingInterface;
import com.dianping.shield.dynamic.model.module.ContainerModuleInfo;
import com.dianping.shield.dynamic.protocols.DynamicChassisInterface;
import com.dianping.shield.dynamic.protocols.DynamicHostInterface;
import com.dianping.shield.dynamic.protocols.DynamicRefreshInterface;
import com.dianping.shield.dynamic.protocols.ICommonHost;
import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback;
import com.dianping.shield.dynamic.utils.DMUtils;
import com.dianping.shield.framework.AgentRefreshInterface;
import com.dianping.shield.framework.ShieldConfig;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.h;
import kotlin.o;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import rx.functions.k;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006B'\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f¢\u0006\u0002\u0010\rJ-\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0016\u0010\u001e\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010 0\u001f\"\u0004\u0018\u00010 H\u0016¢\u0006\u0002\u0010!J\u001c\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020#\u0018\u00010\u0017j\n\u0012\u0004\u0012\u00020#\u0018\u0001`\u0019H\u0016J\u0018\u0010$\u001a\u0012\u0012\u0004\u0012\u00020\u001d\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%H\u0016J\n\u0010'\u001a\u0004\u0018\u00010(H\u0016J\n\u0010)\u001a\u0004\u0018\u00010*H\u0016J\b\u0010+\u001a\u00020,H&J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u000e\u0010/\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fH\u0016J\u0012\u00100\u001a\u00020\u001b2\b\u00101\u001a\u0004\u0018\u000102H\u0016J\b\u00103\u001a\u00020\u001bH\u0016J\u0010\u00104\u001a\n\u0012\u0004\u0012\u00020 \u0018\u000105H\u0016J\u0010\u00106\u001a\u00020\u001b2\u0006\u00107\u001a\u00020\u0015H\u0016J\u0012\u00108\u001a\u00020\u001b2\b\u00109\u001a\u0004\u0018\u00010\u0003H\u0016J\u0012\u0010:\u001a\u00020\u001b2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0084\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e¢\u0006\u0002\n\u0000R8\u0010\u0016\u001a,\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0017j\u001a\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019\u0018\u0001`\u0019X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/dianping/shield/dynamic/agent/DynamicContainerAgent;", "Lcom/dianping/agentsdk/agent/HoloAgent;", "Lcom/dianping/shield/dynamic/protocols/IDynamicPaintingCallback;", "Lcom/dianping/shield/dynamic/model/module/ContainerModuleInfo;", "Lcom/dianping/shield/dynamic/protocols/ICommonHost;", "Lcom/dianping/shield/dynamic/protocols/DynamicChassisInterface;", "Lcom/dianping/shield/dynamic/protocols/DynamicRefreshInterface;", "fragment", "Landroid/support/v4/app/Fragment;", "bridge", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "pageContainer", "Lcom/dianping/agentsdk/framework/PageContainerInterface;", "(Landroid/support/v4/app/Fragment;Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;Lcom/dianping/agentsdk/framework/PageContainerInterface;)V", "execEnvironment", "Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "getExecEnvironment", "()Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;", "setExecEnvironment", "(Lcom/dianping/shield/dynamic/env/DynamicExecEnvironment;)V", "paintingCount", "", "shieldConfig", "Ljava/util/ArrayList;", "Lcom/dianping/shield/framework/ShieldConfigInfo;", "Lkotlin/collections/ArrayList;", "callMethod", "", "method", "", "params", "", "", "(Ljava/lang/String;[Ljava/lang/Object;)V", "generaterConfigs", "Lcom/dianping/agentsdk/framework/AgentListConfig;", "getChassisArguments", "Ljava/util/HashMap;", "Ljava/io/Serializable;", "getDynamicExecutor", "Lcom/dianping/shield/dynamic/env/DynamicExecutorInterface;", "getDynamicHost", "Lcom/dianping/shield/dynamic/protocols/DynamicHostInterface;", "getDynamicMapping", "Lcom/dianping/shield/dynamic/mapping/DynamicMappingInterface;", "getHostContext", "Landroid/content/Context;", "getPageContainer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", d.p, "Lrx/Observable;", "onRefreshEnd", "refreshId", "painting", "moduleInfo", "sendEvent", "viewSendEventInfo", "Lorg/json/JSONObject;", "shieldDynamic_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public abstract class DynamicContainerAgent extends HoloAgent implements DynamicChassisInterface, DynamicRefreshInterface, ICommonHost, IDynamicPaintingCallback<ContainerModuleInfo> {
    public static ChangeQuickRedirect changeQuickRedirect;
    @Nullable
    private DynamicExecEnvironment execEnvironment;
    private int paintingCount;
    private ArrayList<ArrayList<ShieldConfigInfo>> shieldConfig;

    @NotNull
    public abstract DynamicMappingInterface getDynamicMapping();

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void sendEvent(@Nullable JSONObject jSONObject) {
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @NotNull
    public PageContainerThemePackage getContainerThemePackage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fd06a3b71a34013992238da18ddd5c19", RobustBitConfig.DEFAULT_VALUE) ? (PageContainerThemePackage) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fd06a3b71a34013992238da18ddd5c19") : DynamicChassisInterface.DefaultImpls.getContainerThemePackage(this);
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    public void refreshHostViewItem(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem) {
        Object[] objArr = {iDynamicModuleViewItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "db6c5fdd6a2f50b52ce807cb7d7d82b1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "db6c5fdd6a2f50b52ce807cb7d7d82b1");
            return;
        }
        h.b(iDynamicModuleViewItem, "viewItem");
        DynamicChassisInterface.DefaultImpls.refreshHostViewItem(this, iDynamicModuleViewItem);
    }

    public DynamicContainerAgent(@Nullable Fragment fragment, @Nullable v vVar, @Nullable ab<?> abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0f1251116a5f2833c5044db55601508", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0f1251116a5f2833c5044db55601508");
            return;
        }
        DynamicMappingInterface.EnvCreator execEnvironment = getDynamicMapping().getExecEnvironment("Dynamic_Module");
        if (execEnvironment != null) {
            this.execEnvironment = execEnvironment.initExecEnvironment(this, this);
        }
    }

    @Nullable
    public final DynamicExecEnvironment getExecEnvironment() {
        return this.execEnvironment;
    }

    public final void setExecEnvironment(@Nullable DynamicExecEnvironment dynamicExecEnvironment) {
        this.execEnvironment = dynamicExecEnvironment;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onCreate(@Nullable Bundle bundle) {
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "140c1c4ab0f78cefb64a690017721dfa", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "140c1c4ab0f78cefb64a690017721dfa");
            return;
        }
        super.onCreate(bundle);
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onCreate();
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.framework.AgentRefreshInterface
    @Nullable
    public rx.d<Object> onRefresh() {
        rx.d<Object> onRefresh;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "319ce4333f4013ad73fe3187cf847f96", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "319ce4333f4013ad73fe3187cf847f96");
        }
        Fragment fragment = this.fragment;
        if (!(fragment instanceof DynamicChassisInterface)) {
            fragment = null;
        }
        DynamicChassisInterface dynamicChassisInterface = (DynamicChassisInterface) fragment;
        if (dynamicChassisInterface != null) {
            ShieldGlobalFeatureInterface feature = dynamicChassisInterface.getFeature();
            if (!(feature instanceof AgentFinderInterface)) {
                feature = null;
            }
            ShieldGlobalFeatureInterface shieldGlobalFeatureInterface = feature;
            if (shieldGlobalFeatureInterface != null) {
                ArrayList arrayList = new ArrayList();
                ArrayList<ArrayList<ShieldConfigInfo>> arrayList2 = this.shieldConfig;
                if (arrayList2 != null) {
                    Iterator<ArrayList<ShieldConfigInfo>> it = arrayList2.iterator();
                    while (it.hasNext()) {
                        Iterator<ShieldConfigInfo> it2 = it.next().iterator();
                        while (it2.hasNext()) {
                            String str = it2.next().hostName;
                            h.a((Object) str, "config.hostName");
                            AgentInterface findAgent = shieldGlobalFeatureInterface.findAgent(str);
                            if (findAgent != null) {
                                if (!(findAgent instanceof AgentRefreshInterface)) {
                                    findAgent = null;
                                }
                                AgentRefreshInterface agentRefreshInterface = (AgentRefreshInterface) findAgent;
                                if (agentRefreshInterface != null && (onRefresh = agentRefreshInterface.onRefresh()) != null) {
                                    arrayList.add(onRefresh);
                                }
                            }
                        }
                    }
                }
                if (!arrayList.isEmpty()) {
                    return rx.d.a((List) arrayList, (k) new k<R>() { // from class: com.dianping.shield.dynamic.agent.DynamicContainerAgent$onRefresh$1$1$2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        @Override // rx.functions.k
                        public final Object[] call(Object[] objArr2) {
                            return objArr2;
                        }
                    }).a(1);
                }
            }
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicRefreshInterface
    public void onRefreshEnd(int i) {
        Object[] objArr = {Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e25fff94fdb405f6a802f012eb157964", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e25fff94fdb405f6a802f012eb157964");
            return;
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.refreshEnd(i);
        }
    }

    @Override // com.dianping.agentsdk.agent.HoloAgent, com.dianping.shield.agent.LightAgent, com.dianping.agentsdk.framework.AgentInterface
    public void onDestroy() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "27766f512983e4631d28e141d35dc7f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "27766f512983e4631d28e141d35dc7f9");
            return;
        }
        ShieldMetricsData obtain = ShieldMetricsData.Companion.obtain();
        List<Float> asList = Arrays.asList(Float.valueOf(this.paintingCount));
        h.a((Object) asList, "Arrays.asList(paintingCount.toFloat())");
        obtain.addValues(ShieldMonitorKey.MFDynamicModulePaint, asList).addTag("type", getShieldGAInfo().getType().getType()).addTag(ShieldMonitorKey.TAG_BUSINESS, getShieldGAInfo().getBusiness()).send();
        super.onDestroy();
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.onDestroy();
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public ab<?> getPageContainer() {
        return this.pageContainer;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public Context getHostContext() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c72f227d3855937d2eb1ae2ea68f6b92", RobustBitConfig.DEFAULT_VALUE) ? (Context) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c72f227d3855937d2eb1ae2ea68f6b92") : getContext();
    }

    @Override // com.dianping.shield.dynamic.protocols.IDynamicPaintingCallback
    public void painting(@Nullable ContainerModuleInfo containerModuleInfo) {
        HashMap hashMap;
        Object[] objArr = {containerModuleInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b2ab65fc105ef9dacb2a2fd92f4836d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b2ab65fc105ef9dacb2a2fd92f4836d4");
        } else if (getContext() == null || containerModuleInfo == null) {
        } else {
            this.paintingCount++;
            String configKey = containerModuleInfo.getConfigKey();
            List<ArrayList<c>> a = !TextUtils.isEmpty(configKey) ? f.a().a(getContext(), configKey) : null;
            if (a == null || a.isEmpty()) {
                a = DMUtils.getModuleConfigItems(containerModuleInfo.getModuleKeys());
            }
            if (getWhiteBoard().e("dr_abTestInfo") != null) {
                Serializable e = getWhiteBoard().e("dr_abTestInfo");
                if (e == null) {
                    throw new o("null cannot be cast to non-null type java.util.HashMap<kotlin.String, kotlin.String>");
                }
                hashMap = (HashMap) e;
            } else {
                hashMap = null;
            }
            ArrayList<ArrayList<ShieldConfigInfo>> shieldConfigInfo = AgentConfigParser.getShieldConfigInfo(a, hashMap);
            if (shieldConfigInfo != null) {
                ArrayList<ArrayList<ShieldConfigInfo>> arrayList = new ArrayList<>();
                arrayList.addAll(shieldConfigInfo);
                this.shieldConfig = arrayList;
            }
            resetAgents(null);
        }
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.framework.ShieldContainerInterface
    @Nullable
    public ArrayList<com.dianping.agentsdk.framework.c> generaterConfigs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "301678b531d9a707c827e6b584ba59ed", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "301678b531d9a707c827e6b584ba59ed");
        }
        final ArrayList<ArrayList<ShieldConfigInfo>> arrayList = this.shieldConfig;
        if (arrayList != null) {
            ArrayList<com.dianping.agentsdk.framework.c> arrayList2 = new ArrayList<>();
            arrayList2.add(new ShieldConfig() { // from class: com.dianping.shield.dynamic.agent.DynamicContainerAgent$$special$$inlined$apply$lambda$1
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // com.dianping.agentsdk.framework.c
                public final boolean shouldShow() {
                    return true;
                }

                @Override // com.dianping.shield.framework.ShieldConfig
                @NotNull
                public final ArrayList<ArrayList<ShieldConfigInfo>> getAgentGroupConfig() {
                    return arrayList;
                }
            });
            return arrayList2;
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.ICommonHost
    public void callMethod(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArr2 = {str, objArr};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect2, false, "0d0f5fde3ad52697eef73ab6b89f7107", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect2, false, "0d0f5fde3ad52697eef73ab6b89f7107");
            return;
        }
        h.b(str, "method");
        h.b(objArr, "params");
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            dynamicExecEnvironment.callMethod(str, Arrays.copyOf(objArr, objArr.length));
        }
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public DynamicExecutorInterface getDynamicExecutor() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4c861d6994774909ae462cfe21f92d0f", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicExecutorInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4c861d6994774909ae462cfe21f92d0f");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getExecutor();
        }
        return null;
    }

    @Nullable
    public DynamicHostInterface getDynamicHost() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d4ebd1de9feef5b8d3ed843b45d823d8", RobustBitConfig.DEFAULT_VALUE)) {
            return (DynamicHostInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d4ebd1de9feef5b8d3ed843b45d823d8");
        }
        DynamicExecEnvironment dynamicExecEnvironment = this.execEnvironment;
        if (dynamicExecEnvironment != null) {
            return dynamicExecEnvironment.getHost();
        }
        return null;
    }

    @Override // com.dianping.shield.dynamic.protocols.DynamicChassisInterface
    @Nullable
    public HashMap<String, Serializable> getChassisArguments() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4ae4cefd0a731d12bb3017a8acd2cc20", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4ae4cefd0a731d12bb3017a8acd2cc20") : getArguments();
    }
}
