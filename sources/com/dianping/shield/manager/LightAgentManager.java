package com.dianping.shield.manager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.a;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.framework.d;
import com.dianping.agentsdk.framework.u;
import com.dianping.shield.agent.AgentLoadedObservableType;
import com.dianping.shield.bridge.ShieldLogger;
import com.dianping.shield.bridge.feature.PageAgentsPersistenceCtrlInterface;
import com.dianping.shield.bridge.feature.PageArgumentsInterface;
import com.dianping.shield.consts.ShieldConst;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.shield.entity.PageAgentsPersistenceParams;
import com.dianping.shield.env.ShieldEnvironment;
import com.dianping.shield.feature.AgentManagerFeatureInterface;
import com.dianping.shield.framework.AgentRefreshInterface;
import com.dianping.shield.framework.FullOptionMenuLifecycle;
import com.dianping.shield.framework.OptionMenuLifecycle;
import com.dianping.shield.framework.ShieldLifeCycler;
import com.dianping.shield.lifecycle.PageAppearType;
import com.dianping.shield.lifecycle.PageDisappearType;
import com.dianping.shield.manager.util.AgentManagerUtils;
import com.dianping.shield.monitor.ShieldGAInterface;
import com.dianping.shield.monitor.ShieldMetricsData;
import com.dianping.shield.monitor.ShieldMonitorKey;
import com.dianping.shield.monitor.ShieldMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedMonitorUtil;
import com.dianping.shield.monitor.ShieldSpeedStep;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.common.CommonConstant;
import com.meituan.robust.common.StringUtil;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.e;
import rx.functions.k;
import rx.subscriptions.b;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class LightAgentManager implements d, PageAgentsPersistenceCtrlInterface, PageArgumentsInterface, AgentManagerFeatureInterface {
    public static final String AGENT_SEPARATE = "@";
    public static ChangeQuickRedirect changeQuickRedirect;
    private final long BATCHLOAD_TIMEOUT;
    protected a agentCellBridgeInterface;
    private AgentLifecycleCallbacks agentLifecycleCallbacks;
    protected final ArrayList<String> agentList;
    protected final HashMap<String, AgentInterface> agents;
    protected final ArrayMap<String, AgentInterface> cacheList;
    private b compositeSubscription;
    private int currentPageState;
    private ArrayList<String> deleteKeyList;
    protected u driverInterface;
    protected Fragment fragment;
    protected boolean isPagePersistence;
    private CopyOnWriteArrayList<AgentLifecycleCallbacks> lifecycleCallbacks;
    private HashMap<String, Serializable> mapArguments;
    private ArrayList<String> newKeyList;
    private ConcurrentHashMap<AgentInterface, rx.d> observableMap;
    protected ab pageContainer;
    private Bundle savedInstanceState;
    public ConcurrentHashMap<AgentInterface, Integer> stateMap;

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static abstract class AgentLifecycleCallbacks {
        public static ChangeQuickRedirect changeQuickRedirect;

        public void onAgentConstructed(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentCreated(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentDestroyed(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentPaused(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentPreConstruct(d dVar, com.dianping.agentsdk.framework.b bVar, String str, Context context) {
        }

        public void onAgentPreCreate(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentPreDestroy(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentPrePause(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentPreResume(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentPreStart(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentPreStop(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentResumed(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentStarted(d dVar, AgentInterface agentInterface, Context context) {
        }

        public void onAgentStopped(d dVar, AgentInterface agentInterface, Context context) {
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void initViewCell() {
    }

    public LightAgentManager(ShieldLifeCycler shieldLifeCycler) {
        Object[] objArr = {shieldLifeCycler};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b417e3f41dc6c9a525a05a587caaee7c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b417e3f41dc6c9a525a05a587caaee7c");
            return;
        }
        this.agentList = new ArrayList<>();
        this.cacheList = new ArrayMap<>();
        this.agents = new HashMap<>();
        this.stateMap = new ConcurrentHashMap<>();
        this.observableMap = new ConcurrentHashMap<>();
        this.currentPageState = -99;
        this.isPagePersistence = false;
        this.compositeSubscription = new b();
        this.newKeyList = new ArrayList<>();
        this.deleteKeyList = new ArrayList<>();
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
        this.BATCHLOAD_TIMEOUT = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.agentLifecycleCallbacks = new AgentLifecycleCallbacks() { // from class: com.dianping.shield.manager.LightAgentManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentPreConstruct(d dVar, com.dianping.agentsdk.framework.b bVar, String str, Context context) {
                Object[] objArr2 = {dVar, bVar, str, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2afdec18d8fd7344b71730ac42758d9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2afdec18d8fd7344b71730ac42758d9e");
                    return;
                }
                super.onAgentPreConstruct(dVar, bVar, str, context);
                if (LightAgentManager.this.fragment instanceof ShieldGAInterface) {
                    ShieldSpeedMonitorUtil.INSTANCE.startEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), str, 1));
                }
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentConstructed(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e288dd1ab9847f56603ebb4b468266a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e288dd1ab9847f56603ebb4b468266a5");
                    return;
                }
                super.onAgentConstructed(dVar, agentInterface, context);
                if (!(LightAgentManager.this.fragment instanceof ShieldGAInterface) || agentInterface == null) {
                    return;
                }
                ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 1), ShieldSpeedStep.MF_STEP_MODULE_CONSTRUCT_END.getStep());
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentPreCreate(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0478684f04c9990942da20745d8f2e1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0478684f04c9990942da20745d8f2e1f");
                    return;
                }
                super.onAgentPreCreate(dVar, agentInterface, context);
                if (!(LightAgentManager.this.fragment instanceof ShieldGAInterface) || agentInterface == null) {
                    return;
                }
                ShieldSpeedMonitorUtil.INSTANCE.startEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 2));
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentCreated(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fbef92eaf23b574df2094dbf5971cb12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fbef92eaf23b574df2094dbf5971cb12");
                    return;
                }
                super.onAgentCreated(dVar, agentInterface, context);
                if ((LightAgentManager.this.fragment instanceof ShieldGAInterface) && (agentInterface instanceof ShieldGAInterface)) {
                    ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 2), ShieldSpeedStep.MF_STEP_MODULE_CREATE_END.getStep());
                    if (ShieldEnvironment.INSTANCE.isDebug()) {
                        LightAgentManager.this.sendAgentData(agentInterface);
                    }
                }
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentPreDestroy(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3d858543c5333696ec2d9ab6a076dfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3d858543c5333696ec2d9ab6a076dfc");
                    return;
                }
                super.onAgentPreDestroy(dVar, agentInterface, context);
                if ((LightAgentManager.this.fragment instanceof ShieldGAInterface) && (agentInterface instanceof ShieldGAInterface) && !ShieldEnvironment.INSTANCE.isDebug()) {
                    LightAgentManager.this.sendAgentData(agentInterface);
                }
            }
        };
        this.fragment = shieldLifeCycler.hostFragment;
        this.agentCellBridgeInterface = shieldLifeCycler;
        this.driverInterface = shieldLifeCycler;
        this.pageContainer = shieldLifeCycler.getPageContainer();
        this.currentPageState = -3;
        registerAgentLifecycleCallbacks(this.agentLifecycleCallbacks);
    }

    public LightAgentManager(Fragment fragment, a aVar, u uVar, ab abVar) {
        Object[] objArr = {fragment, aVar, uVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c0364b569c99010590538efd5be9e50c", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c0364b569c99010590538efd5be9e50c");
            return;
        }
        this.agentList = new ArrayList<>();
        this.cacheList = new ArrayMap<>();
        this.agents = new HashMap<>();
        this.stateMap = new ConcurrentHashMap<>();
        this.observableMap = new ConcurrentHashMap<>();
        this.currentPageState = -99;
        this.isPagePersistence = false;
        this.compositeSubscription = new b();
        this.newKeyList = new ArrayList<>();
        this.deleteKeyList = new ArrayList<>();
        this.lifecycleCallbacks = new CopyOnWriteArrayList<>();
        this.BATCHLOAD_TIMEOUT = ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE;
        this.agentLifecycleCallbacks = new AgentLifecycleCallbacks() { // from class: com.dianping.shield.manager.LightAgentManager.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentPreConstruct(d dVar, com.dianping.agentsdk.framework.b bVar, String str, Context context) {
                Object[] objArr2 = {dVar, bVar, str, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2afdec18d8fd7344b71730ac42758d9e", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2afdec18d8fd7344b71730ac42758d9e");
                    return;
                }
                super.onAgentPreConstruct(dVar, bVar, str, context);
                if (LightAgentManager.this.fragment instanceof ShieldGAInterface) {
                    ShieldSpeedMonitorUtil.INSTANCE.startEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), str, 1));
                }
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentConstructed(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "e288dd1ab9847f56603ebb4b468266a5", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "e288dd1ab9847f56603ebb4b468266a5");
                    return;
                }
                super.onAgentConstructed(dVar, agentInterface, context);
                if (!(LightAgentManager.this.fragment instanceof ShieldGAInterface) || agentInterface == null) {
                    return;
                }
                ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 1), ShieldSpeedStep.MF_STEP_MODULE_CONSTRUCT_END.getStep());
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentPreCreate(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "0478684f04c9990942da20745d8f2e1f", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "0478684f04c9990942da20745d8f2e1f");
                    return;
                }
                super.onAgentPreCreate(dVar, agentInterface, context);
                if (!(LightAgentManager.this.fragment instanceof ShieldGAInterface) || agentInterface == null) {
                    return;
                }
                ShieldSpeedMonitorUtil.INSTANCE.startEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 2));
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentCreated(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "fbef92eaf23b574df2094dbf5971cb12", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "fbef92eaf23b574df2094dbf5971cb12");
                    return;
                }
                super.onAgentCreated(dVar, agentInterface, context);
                if ((LightAgentManager.this.fragment instanceof ShieldGAInterface) && (agentInterface instanceof ShieldGAInterface)) {
                    ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) LightAgentManager.this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 2), ShieldSpeedStep.MF_STEP_MODULE_CREATE_END.getStep());
                    if (ShieldEnvironment.INSTANCE.isDebug()) {
                        LightAgentManager.this.sendAgentData(agentInterface);
                    }
                }
            }

            @Override // com.dianping.shield.manager.LightAgentManager.AgentLifecycleCallbacks
            public void onAgentPreDestroy(d dVar, AgentInterface agentInterface, Context context) {
                Object[] objArr2 = {dVar, agentInterface, context};
                ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "b3d858543c5333696ec2d9ab6a076dfc", RobustBitConfig.DEFAULT_VALUE)) {
                    PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "b3d858543c5333696ec2d9ab6a076dfc");
                    return;
                }
                super.onAgentPreDestroy(dVar, agentInterface, context);
                if ((LightAgentManager.this.fragment instanceof ShieldGAInterface) && (agentInterface instanceof ShieldGAInterface) && !ShieldEnvironment.INSTANCE.isDebug()) {
                    LightAgentManager.this.sendAgentData(agentInterface);
                }
            }
        };
        this.fragment = fragment;
        this.agentCellBridgeInterface = aVar;
        this.driverInterface = uVar;
        this.pageContainer = abVar;
        this.currentPageState = -3;
        registerAgentLifecycleCallbacks(this.agentLifecycleCallbacks);
    }

    @Override // com.dianping.shield.bridge.feature.PageAgentsPersistenceCtrlInterface
    public void setPageAgentsPersistenceInfo(@NotNull PageAgentsPersistenceParams pageAgentsPersistenceParams) {
        Object[] objArr = {pageAgentsPersistenceParams};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a54c3036677b75949cacc975ce4f04d4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a54c3036677b75949cacc975ce4f04d4");
        } else if (pageAgentsPersistenceParams != null) {
            this.isPagePersistence = pageAgentsPersistenceParams.isReserveUnUsedModule();
        } else {
            this.isPagePersistence = false;
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void setupAgents(Bundle bundle, ArrayList<c> arrayList) {
        Object[] objArr = {bundle, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "437be66209024a8dca5ba7ecd2428721", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "437be66209024a8dca5ba7ecd2428721");
            return;
        }
        this.currentPageState = -2;
        this.savedInstanceState = bundle;
        resetPagePersistenceCache();
        this.compositeSubscription.a();
        this.deleteKeyList.clear();
        this.newKeyList.clear();
        updateAgentConfigures(arrayList, null, null);
    }

    private void resetPagePersistenceCache() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "63c3d28837c085838fc7ec08d3283bee", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "63c3d28837c085838fc7ec08d3283bee");
        } else if (this.isPagePersistence || this.cacheList.size() <= 0) {
        } else {
            this.cacheList.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void deleteObsFromMap(List<rx.d<AgentInterface>> list) {
        Object[] objArr = {list};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "33e2f7b054cd944a2cad539016d3ec3d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "33e2f7b054cd944a2cad539016d3ec3d");
        } else if (list.size() != 0) {
            try {
                for (rx.d<AgentInterface> dVar : list) {
                    this.observableMap.values().remove(dVar);
                }
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public void updateAgents(@NotNull final List<? extends Map<String, ? extends com.dianping.agentsdk.framework.b>> list, @Nullable final e<? super AgentInterface> eVar, @Nullable final AgentInterface agentInterface) {
        int i;
        Object[] objArr = {list, eVar, agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e2c9122e3ee48f706bb2eee035e52790", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e2c9122e3ee48f706bb2eee035e52790");
        } else if (list.size() == 0 || this.currentPageState == 3) {
            if (eVar != null) {
                eVar.onNext(agentInterface);
                eVar.onCompleted();
            }
        } else {
            if (this.fragment instanceof ShieldGAInterface) {
                ShieldSpeedMonitorUtil.INSTANCE.startEvent(ShieldMonitorUtil.getPageKey(this.fragment, 2));
            }
            String hostName = agentInterface == null ? null : agentInterface.getHostName();
            String index = agentInterface != null ? agentInterface.getIndex() : null;
            final ArrayList arrayList = new ArrayList();
            final ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            constructAgents(list.remove(0), hostName, index, arrayList, arrayList2, arrayList3);
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!this.newKeyList.contains(str)) {
                    this.newKeyList.add(str);
                }
            }
            if (arrayList2.size() > 0 || arrayList.size() > 0) {
                if (arrayList.size() > 0) {
                    i = 1;
                    arrayList2.add(rx.d.a((List) arrayList, (k) new k<AgentInterface>() { // from class: com.dianping.shield.manager.LightAgentManager.2
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: Can't rename method to resolve collision */
                        @Override // rx.functions.k
                        public AgentInterface call(Object... objArr2) {
                            Object[] objArr3 = {objArr2};
                            ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                            if (PatchProxy.isSupport(objArr3, this, changeQuickRedirect3, false, "480382e3c1220c9fa00f934b7e6c53d6", RobustBitConfig.DEFAULT_VALUE)) {
                                return (AgentInterface) PatchProxy.accessDispatch(objArr3, this, changeQuickRedirect3, false, "480382e3c1220c9fa00f934b7e6c53d6");
                            }
                            if (objArr2 == null || objArr2.length <= 0) {
                                return null;
                            }
                            for (Object obj : objArr2) {
                                if ((obj instanceof AgentInterface) && LightAgentManager.this.observableMap.containsKey(obj)) {
                                    LightAgentManager.this.observableMap.remove(obj);
                                }
                            }
                            return null;
                        }
                    }).a(1));
                } else {
                    i = 1;
                }
                this.compositeSubscription.a(rx.d.b((Iterable) arrayList2).a(i).a(ExposeAction.DEFAULT_DELAY_FOR_AUTO_EXPOSE, TimeUnit.MILLISECONDS, (rx.d) null, rx.android.schedulers.a.a()).a((e) new e<AgentInterface>() { // from class: com.dianping.shield.manager.LightAgentManager.3
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // rx.e
                    public void onCompleted() {
                        Object[] objArr2 = new Object[0];
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "cd9b04122b187a71e244d438f04907c1", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "cd9b04122b187a71e244d438f04907c1");
                            return;
                        }
                        LightAgentManager.this.deleteObsFromMap(arrayList);
                        LightAgentManager.this.deleteObsFromMap(arrayList2);
                        LightAgentManager.this.updateAgents(list, eVar, agentInterface);
                    }

                    @Override // rx.e
                    public void onError(Throwable th) {
                        Object[] objArr2 = {th};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "2454d0c6ef786d5963c71ffc19b478a7", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "2454d0c6ef786d5963c71ffc19b478a7");
                            return;
                        }
                        LightAgentManager.this.deleteObsFromMap(arrayList);
                        LightAgentManager.this.deleteObsFromMap(arrayList2);
                        LightAgentManager.this.updateAgents(list, eVar, agentInterface);
                    }

                    @Override // rx.e
                    public void onNext(AgentInterface agentInterface2) {
                        Object[] objArr2 = {agentInterface2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "4976f4211dd7d7307e0b7b8411fec897", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "4976f4211dd7d7307e0b7b8411fec897");
                        } else if ((agentInterface2 instanceof AgentInterface) && LightAgentManager.this.observableMap.containsKey(agentInterface2)) {
                            LightAgentManager.this.observableMap.remove(agentInterface2);
                        }
                    }
                }));
            } else {
                this.compositeSubscription.a(rx.d.a("NextBatch").b(0L, TimeUnit.MICROSECONDS, rx.android.schedulers.a.a()).c(new rx.functions.b<String>() { // from class: com.dianping.shield.manager.LightAgentManager.4
                    public static ChangeQuickRedirect changeQuickRedirect;

                    @Override // rx.functions.b
                    public void call(String str2) {
                        Object[] objArr2 = {str2};
                        ChangeQuickRedirect changeQuickRedirect3 = changeQuickRedirect;
                        if (PatchProxy.isSupport(objArr2, this, changeQuickRedirect3, false, "6b73b0b5bbe5ebc9313f2e7f01f6f95b", RobustBitConfig.DEFAULT_VALUE)) {
                            PatchProxy.accessDispatch(objArr2, this, changeQuickRedirect3, false, "6b73b0b5bbe5ebc9313f2e7f01f6f95b");
                        } else {
                            LightAgentManager.this.updateAgents(list, eVar, agentInterface);
                        }
                    }
                }));
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                AgentInterface agentInterface2 = this.agents.get((String) it2.next());
                if (agentInterface2 instanceof AgentRefreshInterface) {
                    ((AgentRefreshInterface) agentInterface2).updateConfigure();
                }
            }
            updateCells();
        }
    }

    private void updateCells() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "44cfea117a28af1e4f8f70fb50c7fae1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "44cfea117a28af1e4f8f70fb50c7fae1");
        } else if (this.newKeyList.size() == 0 && this.deleteKeyList.size() == 0) {
        } else {
            ArrayList<AgentInterface> arrayList = new ArrayList<>();
            ArrayList<AgentInterface> arrayList2 = new ArrayList<>();
            ArrayList<AgentInterface> arrayList3 = new ArrayList<>();
            ArrayList arrayList4 = (ArrayList) this.newKeyList.clone();
            Iterator it = arrayList4.iterator();
            while (true) {
                Bundle bundle = null;
                if (!it.hasNext()) {
                    break;
                }
                String str = (String) it.next();
                AgentInterface agentInterface = this.agents.get(str);
                if (agentInterface != null) {
                    if (!this.agentList.contains(str)) {
                        this.agentList.add(str);
                        if (agentInterface != null) {
                            arrayList.add(agentInterface);
                        }
                        if (this.savedInstanceState != null) {
                            Bundle bundle2 = this.savedInstanceState;
                            bundle = bundle2.getBundle("agent/" + str);
                        }
                        if (this.currentPageState > 0) {
                            updateLifeCycler(agentInterface, -2, bundle);
                        } else {
                            updateLifeCycler(agentInterface, this.currentPageState, bundle);
                        }
                    } else if (agentInterface != null) {
                        arrayList2.add(agentInterface);
                    }
                }
            }
            Iterator<String> it2 = this.deleteKeyList.iterator();
            while (it2.hasNext()) {
                AgentInterface agentInterface2 = this.agents.get(it2.next());
                if (agentInterface2 != null) {
                    arrayList3.add(agentInterface2);
                }
            }
            if (this.fragment instanceof ShieldGAInterface) {
                ShieldSpeedMonitorUtil.INSTANCE.addEvent(ShieldMonitorUtil.getPageKey(this.fragment, 2), ShieldSpeedStep.MF_STEP_UPDATE_MODULES.getStep());
            }
            this.agentCellBridgeInterface.updateCells(arrayList, arrayList2, arrayList3);
            Iterator<String> it3 = this.deleteKeyList.iterator();
            while (it3.hasNext()) {
                String next = it3.next();
                AgentInterface remove = this.agents.remove(next);
                this.agentList.remove(next);
                if (remove != null) {
                    if (this.fragment.isResumed()) {
                        updateLifeCycler(remove, 1, null);
                    }
                    updateLifeCycler(remove, 2, null);
                    if (!this.cacheList.containsKey(next)) {
                        updateLifeCycler(remove, 3, null);
                    }
                }
            }
            this.deleteKeyList.clear();
            this.newKeyList.clear();
            arrayList4.clear();
            dispatchCellChanged(this.fragment.getActivity(), null, null);
        }
    }

    private void diffDeleteAgentKeys(@Nullable Map<String, ? extends com.dianping.agentsdk.framework.b> map, @Nullable String str) {
        String str2;
        Object[] objArr = {map, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c2d49c8ec7d2a6bd0eaaecb448a6e526", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c2d49c8ec7d2a6bd0eaaecb448a6e526");
        } else if (this.agentList.size() == 0) {
        } else {
            ArrayList arrayList = (ArrayList) this.agentList.clone();
            Iterator<String> it = this.agentList.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (!TextUtils.isEmpty(str) && next.length() <= str.length()) {
                    arrayList.remove(next);
                } else if (!TextUtils.isEmpty(str) && !next.startsWith(str)) {
                    arrayList.remove(next);
                } else {
                    if (TextUtils.isEmpty(str)) {
                        str2 = next;
                    } else {
                        str2 = next.substring((str + "@").length());
                    }
                    int indexOf = str2.indexOf("@");
                    if (indexOf != -1) {
                        str2 = str2.substring(0, indexOf);
                    }
                    if (map != null && map.containsKey(str2)) {
                        arrayList.remove(next);
                    }
                }
            }
            this.deleteKeyList.addAll(arrayList);
        }
    }

    public Map<String, com.dianping.agentsdk.framework.b> getDefaultAgentList(ArrayList<c> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee355fda083233caaa1a7bce50eef24a", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee355fda083233caaa1a7bce50eef24a");
        }
        if (arrayList == null) {
            return null;
        }
        Iterator<c> it = arrayList.iterator();
        while (it.hasNext()) {
            c next = it.next();
            try {
                if (next.shouldShow()) {
                    Map<String, com.dianping.agentsdk.framework.b> agentInfoList = next.getAgentInfoList();
                    if (agentInfoList == null) {
                        agentInfoList = new LinkedHashMap<>();
                        for (Map.Entry<String, Class<? extends AgentInterface>> entry : next.getAgentList().entrySet()) {
                            agentInfoList.put(entry.getKey(), new com.dianping.agentsdk.framework.b(entry.getValue(), ""));
                        }
                    }
                    return agentInfoList;
                }
            } catch (Exception e) {
                ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
                shieldLogger.e("@ReadShieldConfigException!!@FragmentName:" + this.fragment.toString() + "&Exception:" + e.toString(), new Object[0]);
                return null;
            }
        }
        ShieldLogger shieldLogger2 = ShieldEnvironment.INSTANCE.getShieldLogger();
        shieldLogger2.e("@ReadShieldConfigError!!@FragmentName:" + this.fragment.toString() + "& no one config should be shown?", new Object[0]);
        return null;
    }

    @Override // com.dianping.shield.feature.AgentManagerFeatureInterface
    public void updateAgentConfigures(@NotNull List<? extends c> list, @Nullable e<? super AgentInterface> eVar, @Nullable AgentInterface agentInterface) {
        Object[] objArr = {list, eVar, agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4bdb4141ad1692a112a53fea41e0b725", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4bdb4141ad1692a112a53fea41e0b725");
            return;
        }
        Map<String, com.dianping.agentsdk.framework.b> defaultAgentList = getDefaultAgentList((ArrayList) list);
        diffDeleteAgentKeys(defaultAgentList, agentInterface == null ? null : agentInterface.getHostName());
        if (defaultAgentList == null) {
            if (eVar != null) {
                eVar.onNext(agentInterface);
                eVar.onCompleted();
            }
            ShieldLogger shieldLogger = ShieldEnvironment.INSTANCE.getShieldLogger();
            shieldLogger.e("@ReadShieldConfigError!!@FragmentName:" + this.fragment.toString() + "&Failed to find a useful config", new Object[0]);
            return;
        }
        updateAgents(AgentManagerUtils.sortedMap(defaultAgentList), eVar, agentInterface);
    }

    private rx.d getAgentObservable(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f2bc2026d4287068a88ddfa2a940295", RobustBitConfig.DEFAULT_VALUE)) {
            return (rx.d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f2bc2026d4287068a88ddfa2a940295");
        }
        if (agentInterface instanceof AgentRefreshInterface) {
            return ((AgentRefreshInterface) agentInterface).getLoadedObservable();
        }
        return null;
    }

    private AgentLoadedObservableType getAgentLoadObservableType(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bfea9be67308cc75be6b6e4cf10fd18d", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgentLoadedObservableType) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bfea9be67308cc75be6b6e4cf10fd18d");
        }
        if (agentInterface instanceof AgentRefreshInterface) {
            return ((AgentRefreshInterface) agentInterface).getLoadedObservableType();
        }
        return AgentLoadedObservableType.AND;
    }

    private void handleLoadedObservable(AgentInterface agentInterface, List<rx.d<AgentInterface>> list, List<rx.d<AgentInterface>> list2, boolean z) {
        Object[] objArr = {agentInterface, list, list2, Byte.valueOf(z ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ec2e2ce2fcd92c411322d05b55efe805", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ec2e2ce2fcd92c411322d05b55efe805");
        } else if (z) {
            rx.d agentObservable = getAgentObservable(agentInterface);
            if (agentObservable != null) {
                ProxySubject proxySubject = new ProxySubject(agentObservable, agentInterface);
                AgentLoadedObservableType agentLoadObservableType = getAgentLoadObservableType(agentInterface);
                if (agentLoadObservableType == AgentLoadedObservableType.AND) {
                    list.add(proxySubject.getSubject());
                } else if (agentLoadObservableType == AgentLoadedObservableType.OR) {
                    list2.add(proxySubject.getSubject());
                }
                this.observableMap.put(agentInterface, proxySubject.getSubject());
            }
        } else {
            rx.d dVar = this.observableMap.get(agentInterface);
            if (dVar != null) {
                AgentLoadedObservableType agentLoadObservableType2 = getAgentLoadObservableType(agentInterface);
                if (agentLoadObservableType2 == AgentLoadedObservableType.AND) {
                    list.add(dVar);
                } else if (agentLoadObservableType2 == AgentLoadedObservableType.OR) {
                    list2.add(dVar);
                }
            }
        }
    }

    private void constructAgents(Map<String, com.dianping.agentsdk.framework.b> map, String str, String str2, List<rx.d<AgentInterface>> list, List<rx.d<AgentInterface>> list2, List<String> list3) {
        AgentInterface agentInterface;
        Object[] objArr = {map, str, str2, list, list2, list3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c09e25865944f5013759c7805d9df7c1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c09e25865944f5013759c7805d9df7c1");
        } else if (map != null && map.size() != 0) {
            for (Map.Entry<String, com.dianping.agentsdk.framework.b> entry : map.entrySet()) {
                try {
                    String key = !TextUtils.isEmpty(str) ? str + "@" + entry.getKey() : entry.getKey();
                    if (!this.agents.containsKey(key)) {
                        list3.add(key);
                        if (this.isPagePersistence && this.cacheList.containsKey(key)) {
                            AgentInterface agentInterface2 = this.cacheList.get(key);
                            if (agentInterface2 != null && this.observableMap.containsKey(agentInterface2)) {
                                handleLoadedObservable(agentInterface2, list, list2, false);
                            }
                            agentInterface = agentInterface2;
                        } else {
                            dispatchAgentPreConstruct(entry.getValue(), key);
                            AgentInterface constructAgents = constructAgents(entry.getValue());
                            if (constructAgents != null) {
                                updateStatesMap(constructAgents, -3);
                                handleLoadedObservable(constructAgents, list, list2, true);
                            }
                            agentInterface = constructAgents;
                        }
                        try {
                            updateCacheList(key, agentInterface);
                            updateIndexInfo(agentInterface, str, str2, key, entry);
                            updateArguments(entry.getValue(), agentInterface, str);
                            dispatchAgentConstructed(agentInterface);
                        } catch (Exception e) {
                            e = e;
                            ShieldEnvironment.INSTANCE.getShieldLogger().e("@ReadShieldConfigError!!@FragmentName:" + this.fragment.toString() + "&" + e.toString(), new Object[0]);
                            Log.e("Shield", e.toString());
                        }
                    } else {
                        list3.add(key);
                        AgentInterface agentInterface3 = this.agents.get(key);
                        if (agentInterface3 != null && this.observableMap.containsKey(agentInterface3)) {
                            handleLoadedObservable(agentInterface3, list, list2, false);
                        }
                        updateIndexInfo(agentInterface3, str, str2, key, entry);
                        updateArguments(entry.getValue(), agentInterface3, str);
                    }
                } catch (Exception e2) {
                    e = e2;
                }
            }
        }
    }

    private void updateIndexInfo(AgentInterface agentInterface, String str, String str2, String str3, Map.Entry<String, com.dianping.agentsdk.framework.b> entry) {
        String str4;
        Object[] objArr = {agentInterface, str, str2, str3, entry};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "aa7c78462788bd6c0cfe060bfd42d3b4", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "aa7c78462788bd6c0cfe060bfd42d3b4");
        } else if (agentInterface != null) {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                str4 = str2 + CommonConstant.Symbol.DOT + entry.getValue().d;
            } else {
                str4 = entry.getValue().d;
            }
            agentInterface.setIndex(str4);
            agentInterface.setHostName(str3);
            this.agents.put(str3, agentInterface);
        }
    }

    private void updateArguments(com.dianping.agentsdk.framework.b bVar, AgentInterface agentInterface, String str) {
        Object[] objArr = {bVar, agentInterface, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ce8add7f26bb670a850eb06ce81e4657", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ce8add7f26bb670a850eb06ce81e4657");
            return;
        }
        HashMap<String, Serializable> combineArguments = AgentManagerUtils.combineArguments(bVar, getParentArguments(str));
        if (agentInterface == null || combineArguments == null) {
            return;
        }
        agentInterface.setArguments(combineArguments);
    }

    private void updateCacheList(String str, AgentInterface agentInterface) {
        Object[] objArr = {str, agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ff15b8ed79bd5d208b753190c503e09d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ff15b8ed79bd5d208b753190c503e09d");
        } else if (agentInterface == null || !this.isPagePersistence) {
        } else {
            HashMap<String, Serializable> arguments = agentInterface.getArguments();
            if (arguments != null && arguments.containsKey(ShieldConst.SHIELDCORE_AGENT_PERSISTENCE_KEY) && !((Boolean) arguments.get(ShieldConst.SHIELDCORE_AGENT_PERSISTENCE_KEY)).booleanValue()) {
                if (this.cacheList.containsKey(str)) {
                    this.cacheList.remove(str);
                    return;
                }
                return;
            }
            this.cacheList.put(str, agentInterface);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.dianping.agentsdk.framework.AgentInterface constructAgents(com.dianping.agentsdk.framework.b r13) {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.dianping.shield.manager.LightAgentManager.constructAgents(com.dianping.agentsdk.framework.b):com.dianping.agentsdk.framework.AgentInterface");
    }

    @Override // com.dianping.agentsdk.framework.d
    public void startAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "524fa50e10183e3464c3c67b7a42d586", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "524fa50e10183e3464c3c67b7a42d586");
            return;
        }
        this.currentPageState = -1;
        Iterator it = ((ArrayList) this.agentList.clone()).iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get((String) it.next());
            if (agentInterface != null) {
                updateLifeCycler(agentInterface, this.currentPageState, null);
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public List<rx.d> refreshAgents() {
        rx.d<Object> onRefresh;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f7c01ac1b860b4117786bcef412cd1a1", RobustBitConfig.DEFAULT_VALUE)) {
            return (List) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f7c01ac1b860b4117786bcef412cd1a1");
        }
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            if (!next.contains("@")) {
                AgentInterface agentInterface = this.agents.get(next);
                if ((agentInterface instanceof AgentRefreshInterface) && (onRefresh = ((AgentRefreshInterface) agentInterface).onRefresh()) != null) {
                    arrayList.add(onRefresh);
                }
            }
        }
        return arrayList;
    }

    @Override // com.dianping.agentsdk.framework.d
    public void resumeAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b867b5a274e58e7291cb193ed38eda1", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b867b5a274e58e7291cb193ed38eda1");
            return;
        }
        this.currentPageState = 0;
        Iterator it = ((ArrayList) this.agentList.clone()).iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get((String) it.next());
            if (agentInterface != null) {
                updateLifeCycler(agentInterface, this.currentPageState, null);
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void pauseAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "302b9d9d154633d54e5f5d211a5829af", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "302b9d9d154633d54e5f5d211a5829af");
            return;
        }
        this.currentPageState = 1;
        Iterator it = ((ArrayList) this.agentList.clone()).iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get((String) it.next());
            if (agentInterface != null) {
                updateLifeCycler(agentInterface, this.currentPageState, null);
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void stopAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "df812f60cdb24a614d29a41540854e7c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "df812f60cdb24a614d29a41540854e7c");
            return;
        }
        this.currentPageState = 2;
        Iterator it = ((ArrayList) this.agentList.clone()).iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get((String) it.next());
            if (agentInterface != null) {
                updateLifeCycler(agentInterface, this.currentPageState, null);
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void destroyAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1dd808006c28fab96265904bfeb0605f", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1dd808006c28fab96265904bfeb0605f");
            return;
        }
        this.compositeSubscription.a();
        this.currentPageState = 3;
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get(it.next());
            if (agentInterface != null) {
                updateLifeCycler(agentInterface, this.currentPageState, null);
            }
        }
        destoryCacheAgents();
        this.stateMap.clear();
        this.lifecycleCallbacks.clear();
    }

    private void destoryCacheAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bb4079042ec462aac605c61058ee0cc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bb4079042ec462aac605c61058ee0cc");
            return;
        }
        ArrayMap<String, AgentInterface> diffCacheAgents = getDiffCacheAgents();
        if (diffCacheAgents == null || diffCacheAgents.size() <= 0) {
            return;
        }
        for (AgentInterface agentInterface : diffCacheAgents.values()) {
            if (agentInterface != null) {
                updateLifeCycler(agentInterface, 3, null);
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void onSaveInstanceState(Bundle bundle) {
        Bundle saveInstanceState;
        Object[] objArr = {bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5a2369b27f65dd0a5eed1fc1dd2d764c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5a2369b27f65dd0a5eed1fc1dd2d764c");
            return;
        }
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            String next = it.next();
            AgentInterface agentInterface = this.agents.get(next);
            if (agentInterface != null && (saveInstanceState = agentInterface.saveInstanceState()) != null && saveInstanceState.size() > 0) {
                bundle.putBundle("agent/" + next, saveInstanceState);
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void onActivityResult(int i, int i2, Intent intent) {
        Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), intent};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "9218aac566aa24607d9a79d4b16b03ea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "9218aac566aa24607d9a79d4b16b03ea");
            return;
        }
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get(it.next());
            if (agentInterface != null) {
                agentInterface.onActivityResult(i, i2, intent);
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public void resetAgents(Bundle bundle, ArrayList<c> arrayList) {
        Object[] objArr = {bundle, arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "c94051f6850eaa181cb526c3efb461fc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "c94051f6850eaa181cb526c3efb461fc");
        } else if (this.currentPageState == 3) {
        } else {
            this.savedInstanceState = bundle;
            this.compositeSubscription.a();
            this.deleteKeyList.clear();
            this.newKeyList.clear();
            updateAgentConfigures(arrayList, null, null);
            if (this.newKeyList.size() > 0 || this.deleteKeyList.size() > 0) {
                updateCells();
            }
        }
    }

    @Override // com.dianping.agentsdk.framework.d
    public AgentInterface findAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5f534583d82045a11f69408f8130faa0", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgentInterface) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5f534583d82045a11f69408f8130faa0");
        }
        AgentInterface agentInterface = this.agents.get(str);
        if (agentInterface == null) {
            for (Map.Entry<String, AgentInterface> entry : this.agents.entrySet()) {
                if (entry.getKey().endsWith("@" + str)) {
                    return entry.getValue();
                }
            }
        }
        return agentInterface;
    }

    @Deprecated
    public void dispatchCellChanged(FragmentActivity fragmentActivity, AgentInterface agentInterface, Bundle bundle) {
        Object[] objArr = {fragmentActivity, agentInterface, bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b41d8ada4164e5138ae090e2c82747b2", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b41d8ada4164e5138ae090e2c82747b2");
        } else if (fragmentActivity == null) {
        } else {
            Iterator<String> it = this.agentList.iterator();
            while (it.hasNext()) {
                AgentInterface agentInterface2 = this.agents.get(it.next());
                if (agentInterface == null || agentInterface == agentInterface2) {
                    if (agentInterface2 != null) {
                        agentInterface2.onAgentChanged(bundle);
                    }
                }
            }
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        Object[] objArr = {menu, menuInflater};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8fe2137a432ab7a7f0e6b66575c050f9", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8fe2137a432ab7a7f0e6b66575c050f9");
            return;
        }
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get(it.next());
            if (agentInterface != null && (agentInterface instanceof OptionMenuLifecycle)) {
                ((OptionMenuLifecycle) agentInterface).onCreateOptionsMenu(menu, menuInflater);
            }
        }
    }

    public void onPrepareOptionsMenu(Menu menu) {
        Object[] objArr = {menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77abb75f209332b4ae850b6dc3b39ecb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77abb75f209332b4ae850b6dc3b39ecb");
            return;
        }
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get(it.next());
            if (agentInterface != null && (agentInterface instanceof FullOptionMenuLifecycle)) {
                ((FullOptionMenuLifecycle) agentInterface).onPrepareOptionsMenu(menu);
            }
        }
    }

    public void onDestroyOptionsMenu() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b497863b9164ac79e96e7a34c3fbec10", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b497863b9164ac79e96e7a34c3fbec10");
            return;
        }
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get(it.next());
            if (agentInterface != null && (agentInterface instanceof FullOptionMenuLifecycle)) {
                ((FullOptionMenuLifecycle) agentInterface).onDestroyOptionsMenu();
            }
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        Object[] objArr = {menuItem};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "13c9201928d20afe1c10574a8d41abda", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Boolean) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "13c9201928d20afe1c10574a8d41abda")).booleanValue();
        }
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get(it.next());
            if (agentInterface != null && (agentInterface instanceof OptionMenuLifecycle) && ((OptionMenuLifecycle) agentInterface).onOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void onOptionsMenuClosed(Menu menu) {
        Object[] objArr = {menu};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4f5cc3c5ea83ec7c3ad730374aaad49a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4f5cc3c5ea83ec7c3ad730374aaad49a");
            return;
        }
        Iterator<String> it = this.agentList.iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get(it.next());
            if (agentInterface != null && (agentInterface instanceof FullOptionMenuLifecycle)) {
                ((FullOptionMenuLifecycle) agentInterface).onOptionsMenuClosed(menu);
            }
        }
    }

    private ArrayMap<String, AgentInterface> getDiffCacheAgents() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b076b6abfab7d7e3043e3464ef470459", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b076b6abfab7d7e3043e3464ef470459");
        }
        ArrayMap<String, AgentInterface> arrayMap = new ArrayMap<>();
        if (this.cacheList == null || this.cacheList.size() <= 0) {
            return arrayMap;
        }
        for (String str : this.cacheList.keySet()) {
            Iterator<String> it = this.agentList.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (str.equals(it.next())) {
                    z = true;
                }
            }
            if (!z) {
                arrayMap.put(str, this.cacheList.get(str) == null ? null : this.cacheList.get(str));
            }
        }
        return arrayMap;
    }

    @Override // com.dianping.shield.bridge.feature.PageArgumentsInterface
    public void setShieldArguments(@Nullable HashMap<String, Serializable> hashMap) {
        this.mapArguments = hashMap;
    }

    @Override // com.dianping.shield.bridge.feature.PageArgumentsInterface
    @Nullable
    public HashMap<String, Serializable> getShieldArguments() {
        return this.mapArguments;
    }

    private HashMap<String, Serializable> getParentArguments(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "8b7143a81aee46e539133b7f527ea0c7", RobustBitConfig.DEFAULT_VALUE)) {
            return (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "8b7143a81aee46e539133b7f527ea0c7");
        }
        if (TextUtils.isEmpty(str)) {
            return getShieldArguments();
        }
        AgentInterface agentInterface = this.agents.get(str);
        if (agentInterface == null) {
            return getShieldArguments();
        }
        return agentInterface.getArguments() == null ? getShieldArguments() : agentInterface.getArguments();
    }

    public final void updateLifeCycler(AgentInterface agentInterface, int i, Bundle bundle) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e99180da8784a51411487cccce3b49ca", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e99180da8784a51411487cccce3b49ca");
            return;
        }
        int agentState = getAgentState(agentInterface);
        if (agentInterface == null || i < -3 || agentState < -3 || i == agentState) {
            return;
        }
        updatePageAgentState(agentInterface, i, agentState, bundle);
    }

    public final void updatePageAgentState(AgentInterface agentInterface, int i, int i2, Bundle bundle) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "281e39df872eb44ebc7f54a33b2374fd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "281e39df872eb44ebc7f54a33b2374fd");
        } else if (agentInterface == null || i2 < -3) {
        } else {
            if (i <= 0) {
                if (i2 <= 0) {
                    while (i - i2 > 0) {
                        agentStateReplenish(agentInterface, i2, bundle);
                        i2++;
                    }
                    return;
                }
                while ((i + i2) - 0 > 0) {
                    agentStateReplenish(agentInterface, 0 - i2, bundle);
                    i2--;
                }
            } else if (i2 <= 0) {
                while ((i + i2) - 0 > 0) {
                    agentStateReplenish(agentInterface, 0 - i2, bundle);
                    i2--;
                }
            } else {
                while (i - i2 > 0) {
                    agentStateReplenish(agentInterface, i2, bundle);
                    i2++;
                }
            }
        }
    }

    public final void agentStateReplenish(AgentInterface agentInterface, int i, Bundle bundle) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), bundle};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a21c9cb353ca294a44ca7331ac297cc0", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a21c9cb353ca294a44ca7331ac297cc0");
            return;
        }
        switch (i) {
            case -3:
                dispatchAgentPreCreate(agentInterface);
                agentInterface.onCreate(bundle);
                updateStatesMap(agentInterface, -2);
                dispatchAgentCreated(agentInterface);
                return;
            case -2:
                dispatchAgentPreStart(agentInterface);
                agentInterface.onStart();
                updateStatesMap(agentInterface, -1);
                dispatchAgentStarted(agentInterface);
                return;
            case -1:
                dispatchAgentPreResume(agentInterface);
                agentInterface.onResume();
                updateStatesMap(agentInterface, 0);
                dispatchAgentResumed(agentInterface);
                return;
            case 0:
                dispatchAgentPrePause(agentInterface);
                agentInterface.onPause();
                updateStatesMap(agentInterface, 1);
                dispatchAgentPaused(agentInterface);
                return;
            case 1:
                dispatchAgentPreStop(agentInterface);
                agentInterface.onStop();
                updateStatesMap(agentInterface, 2);
                dispatchAgentStopped(agentInterface);
                return;
            case 2:
                dispatchAgentPreDestroy(agentInterface);
                agentInterface.onDestroy();
                removeStatesMap(agentInterface);
                dispatchAgentDestroyed(agentInterface);
                return;
            default:
                return;
        }
    }

    public final void updateStatesMap(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "439f0844eacce2c98cd7d8c6cf3e5798", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "439f0844eacce2c98cd7d8c6cf3e5798");
        } else if (this.stateMap != null) {
            this.stateMap.put(agentInterface, Integer.valueOf(i));
        } else {
            throw new RuntimeException("stateMap not init");
        }
    }

    public final void removeStatesMap(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ad760015dd5ccf32c8c566414453472b", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ad760015dd5ccf32c8c566414453472b");
        } else if (this.stateMap != null) {
            this.stateMap.remove(agentInterface);
        }
    }

    public final void removeAllStatesMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a6b0d5e273494fe2c04594fc7d45da7a", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a6b0d5e273494fe2c04594fc7d45da7a");
        } else if (this.stateMap != null) {
            this.stateMap.clear();
        }
    }

    public final int getAgentState(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b33c42674c2490ae7ebe400ed92d421e", RobustBitConfig.DEFAULT_VALUE)) {
            return ((Integer) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b33c42674c2490ae7ebe400ed92d421e")).intValue();
        }
        if (agentInterface == null) {
            return -99;
        }
        if (this.stateMap == null || !this.stateMap.containsKey(agentInterface)) {
            String thread = Looper.getMainLooper().getThread() != null ? Looper.getMainLooper().getThread().toString() : "unknown";
            String thread2 = Thread.currentThread() != null ? Thread.currentThread().toString() : "unknown";
            if (ShieldEnvironment.INSTANCE.isDebug()) {
                StringBuilder sb = new StringBuilder("agent class name is:");
                sb.append(agentInterface.getHostName());
                sb.append(", ");
                sb.append(agentInterface.getAgentCellName());
                sb.append(" not construct,main thread is:");
                sb.append(thread);
                sb.append(", current thread is:");
                sb.append(thread2);
                sb.append(",current state map is:");
                sb.append(this.stateMap == null ? StringUtil.NULL : this.stateMap.toString());
                throw new RuntimeException(sb.toString());
            }
            return -99;
        }
        return this.stateMap.get(agentInterface).intValue();
    }

    @Override // com.dianping.shield.feature.AgentManagerFeatureInterface
    public void registerAgentLifecycleCallbacks(AgentLifecycleCallbacks agentLifecycleCallbacks) {
        Object[] objArr = {agentLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b7ff19f2cd9e27e3ce87d9206c621f9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b7ff19f2cd9e27e3ce87d9206c621f9d");
        } else {
            this.lifecycleCallbacks.add(agentLifecycleCallbacks);
        }
    }

    @Override // com.dianping.shield.feature.AgentManagerFeatureInterface
    public void unregisterAgentLifecycleCallbacks(AgentLifecycleCallbacks agentLifecycleCallbacks) {
        int i = 0;
        Object[] objArr = {agentLifecycleCallbacks};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a010aa9c4597732862ce540f4972b5ac", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a010aa9c4597732862ce540f4972b5ac");
            return;
        }
        synchronized (this.lifecycleCallbacks) {
            int size = this.lifecycleCallbacks.size();
            while (true) {
                if (i >= size) {
                    break;
                } else if (this.lifecycleCallbacks.get(i) == agentLifecycleCallbacks) {
                    this.lifecycleCallbacks.remove(i);
                    break;
                } else {
                    i++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sendAgentData(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "010c8e99ff09a0fb837ba4696c5d0e53", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "010c8e99ff09a0fb837ba4696c5d0e53");
            return;
        }
        ShieldSpeedMonitorUtil.INSTANCE.replacePage(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 2), ShieldMonitorUtil.getModuleKey(this.fragment, agentInterface, 2));
        ShieldSpeedMonitorUtil.INSTANCE.sendEvent(ShieldMonitorUtil.getModuleKey(this.fragment, agentInterface, 2));
        ShieldSpeedMonitorUtil.INSTANCE.replacePage(ShieldMonitorUtil.getModuleKey(((ShieldGAInterface) this.fragment).getShieldGAInfo().getBusiness(), agentInterface.getHostName(), 1), ShieldMonitorUtil.getModuleKey(this.fragment, agentInterface, 1));
        ShieldSpeedMonitorUtil.INSTANCE.sendEvent(ShieldMonitorUtil.getModuleKey(this.fragment, agentInterface, 1));
        ShieldGAInterface shieldGAInterface = (ShieldGAInterface) agentInterface;
        ShieldMetricsData.obtain().addValues(ShieldMonitorKey.MFModuleLoad, Arrays.asList(Float.valueOf(1.0f))).addTag(ShieldMonitorKey.TAG_BUSINESS, ShieldMonitorUtil.formatBusiness(shieldGAInterface.getShieldGAInfo().getBusiness())).addTag("type", shieldGAInterface.getShieldGAInfo().getType().getType()).addTag(ShieldMonitorKey.TAG_MODULE_KEY, agentInterface.getHostName()).send();
    }

    public final void dispatchAgentPreConstruct(com.dianping.agentsdk.framework.b bVar, String str) {
        Object[] objArr = {bVar, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ef3828eac5031515c8c7a60e7e5ec614", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ef3828eac5031515c8c7a60e7e5ec614");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPreConstruct(this, bVar, str, this.fragment.getContext());
        }
    }

    public final void dispatchAgentConstructed(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18ce8111bfeb91a04970cb618f60d5ba", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18ce8111bfeb91a04970cb618f60d5ba");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentConstructed(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentPreCreate(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "38e30205fc80e79df6aa296747ee0d9d", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "38e30205fc80e79df6aa296747ee0d9d");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPreCreate(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentCreated(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e548031d473ed93fe7f301271c0bf94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e548031d473ed93fe7f301271c0bf94");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentCreated(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentPreStart(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "3efba7e7087cbda984db45d9726a04d8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "3efba7e7087cbda984db45d9726a04d8");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPreStart(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentStarted(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "d69d5a22f0c6ad4b0c783aa0ab8bde00", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "d69d5a22f0c6ad4b0c783aa0ab8bde00");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentStarted(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentPreResume(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "150044f12dd4d3ad3ea27635a695b9e8", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "150044f12dd4d3ad3ea27635a695b9e8");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPreResume(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentResumed(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "17e0c18ecdd4704030083b34e0c7e7fb", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "17e0c18ecdd4704030083b34e0c7e7fb");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentResumed(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentPrePause(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "903a9811ab76392d0c6ad4ba19869c56", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "903a9811ab76392d0c6ad4ba19869c56");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPrePause(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentPaused(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "a0cd12d9f5a07c3bf4a79317d91ed163", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "a0cd12d9f5a07c3bf4a79317d91ed163");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPaused(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentPreStop(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "87826951807343be20c9e37538c91c15", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "87826951807343be20c9e37538c91c15");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPreStop(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentStopped(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "061ba56b491694a53db1d1f9e509447c", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "061ba56b491694a53db1d1f9e509447c");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentStopped(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentPreDestroy(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "97635843c3226f23d00ba095f0530567", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "97635843c3226f23d00ba095f0530567");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentPreDestroy(this, agentInterface, this.fragment.getContext());
        }
    }

    public final void dispatchAgentDestroyed(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "7b38e316b2537afdb0855a278d090aea", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "7b38e316b2537afdb0855a278d090aea");
            return;
        }
        Iterator<AgentLifecycleCallbacks> it = this.lifecycleCallbacks.iterator();
        while (it.hasNext()) {
            it.next().onAgentDestroyed(this, agentInterface, this.fragment.getContext());
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageAppear(@NotNull PageAppearType pageAppearType) {
        Object[] objArr = {pageAppearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "00ed19e335f43962363d04586b7d30bc", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "00ed19e335f43962363d04586b7d30bc");
            return;
        }
        Iterator it = ((ArrayList) this.agentList.clone()).iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get((String) it.next());
            if (agentInterface != null) {
                agentInterface.onPageAppear(pageAppearType);
            }
        }
    }

    @Override // com.dianping.shield.lifecycle.PageLifecycleCallbacks
    public void onPageDisappear(@NotNull PageDisappearType pageDisappearType) {
        Object[] objArr = {pageDisappearType};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "92ee8f97f43f59ec05811ffcb264fadf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "92ee8f97f43f59ec05811ffcb264fadf");
            return;
        }
        Iterator it = ((ArrayList) this.agentList.clone()).iterator();
        while (it.hasNext()) {
            AgentInterface agentInterface = this.agents.get((String) it.next());
            if (agentInterface != null) {
                agentInterface.onPageDisappear(pageDisappearType);
            }
        }
    }
}
