package com.dianping.shield.components;

import android.support.v4.app.Fragment;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.ab;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.framework.v;
import com.dianping.shield.AgentConfigParser;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import com.dianping.shield.components.model.AbsTabModel;
import com.dianping.shield.components.model.TabConfigModel;
import com.dianping.shield.framework.AgentRefreshInterface;
import com.dianping.shield.framework.ShieldConfig;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.Nullable;
import rx.d;
import rx.functions.k;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ConfigurableTabAgent extends AbstractTabAgent {
    public static ChangeQuickRedirect changeQuickRedirect;
    protected ArrayList<ArrayList<ShieldConfigInfo>> shieldConfig;

    public ConfigurableTabAgent(Fragment fragment, v vVar, ab abVar) {
        super(fragment, vVar, abVar);
        Object[] objArr = {fragment, vVar, abVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "105b6544d7a07a0d5b64c474a328e97b", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "105b6544d7a07a0d5b64c474a328e97b");
        } else {
            this.shieldConfig = new ArrayList<>();
        }
    }

    public void setTabConfig(ArrayList<TabConfigModel> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "342653e175279b087927fb979d6a797e", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "342653e175279b087927fb979d6a797e");
        } else if (arrayList != null) {
            this.shieldConfig.clear();
            ArrayList<AbsTabModel> arrayList2 = new ArrayList<>();
            Iterator<TabConfigModel> it = arrayList.iterator();
            while (it.hasNext()) {
                TabConfigModel next = it.next();
                if (next != null) {
                    AbsTabModel absTabModel = new AbsTabModel(next.tabKey);
                    ArrayList<ArrayList<ShieldConfigInfo>> arrayList3 = new ArrayList<>();
                    if (next.configAgentKeys != null) {
                        arrayList3 = AgentConfigParser.getShieldConfig(next.configAgentKeys, getWhiteBoard().e("dr_abTestInfo") != null ? (HashMap) getWhiteBoard().e("dr_abTestInfo") : null);
                    } else if (next.configShieldKeys != null) {
                        arrayList3 = next.configShieldKeys;
                    } else if (next.configModuleKeys != null) {
                        arrayList3 = AgentConfigParser.getShieldConfigInfo(next.configModuleKeys, getWhiteBoard().e("dr_abTestInfo") != null ? (HashMap) getWhiteBoard().e("dr_abTestInfo") : null);
                    }
                    if (arrayList3 != null) {
                        if (next.isLinkPrevious) {
                            this.shieldConfig.get(this.shieldConfig.size() - 1).addAll(arrayList3.get(0));
                            for (int i = 1; i < arrayList3.size(); i++) {
                                this.shieldConfig.add(arrayList3.get(i));
                            }
                        } else {
                            this.shieldConfig.addAll(arrayList3);
                        }
                        Iterator<ArrayList<ShieldConfigInfo>> it2 = arrayList3.iterator();
                        while (it2.hasNext()) {
                            Iterator<ShieldConfigInfo> it3 = it2.next().iterator();
                            while (it3.hasNext()) {
                                absTabModel.agentKeys.add(it3.next().hostName);
                            }
                        }
                        if (next.tabRelatedAgentKeys != null) {
                            for (ArrayList<String> arrayList4 : next.tabRelatedAgentKeys) {
                                Iterator<String> it4 = arrayList4.iterator();
                                while (it4.hasNext()) {
                                    absTabModel.releatedKeys.add(it4.next());
                                }
                            }
                        }
                        arrayList2.add(absTabModel);
                    }
                }
            }
            setTabModels(arrayList2);
        }
    }

    public void resetTabConfig(ArrayList<TabConfigModel> arrayList) {
        Object[] objArr = {arrayList};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "57270e659535e9586a38b10aedc660db", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "57270e659535e9586a38b10aedc660db");
            return;
        }
        setTabConfig(arrayList);
        resetTabRegister();
        resetAgents(null);
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.framework.ShieldContainerInterface
    public ArrayList<c> generaterConfigs() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "eea33f69786b4cf0eb83c6a355b75fc0", RobustBitConfig.DEFAULT_VALUE)) {
            return (ArrayList) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "eea33f69786b4cf0eb83c6a355b75fc0");
        }
        ArrayList<c> arrayList = new ArrayList<>();
        arrayList.add(new ShieldConfig() { // from class: com.dianping.shield.components.ConfigurableTabAgent.1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // com.dianping.agentsdk.framework.c
            public boolean shouldShow() {
                return true;
            }

            @Override // com.dianping.shield.framework.ShieldConfig
            public ArrayList<ArrayList<ShieldConfigInfo>> getAgentGroupConfig() {
                return ConfigurableTabAgent.this.shieldConfig;
            }
        });
        return arrayList;
    }

    @Override // com.dianping.shield.agent.LightAgent, com.dianping.shield.framework.AgentRefreshInterface
    @Nullable
    public d<Object> onRefresh() {
        d<Object> onRefresh;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "76fca32653792e78f2d8b4a6a44122c4", RobustBitConfig.DEFAULT_VALUE)) {
            return (d) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "76fca32653792e78f2d8b4a6a44122c4");
        }
        if (getFeature() != null) {
            ShieldGlobalFeatureInterface feature = getFeature();
            ArrayList arrayList = new ArrayList();
            Iterator<ArrayList<ShieldConfigInfo>> it = this.shieldConfig.iterator();
            while (it.hasNext()) {
                Iterator<ShieldConfigInfo> it2 = it.next().iterator();
                while (it2.hasNext()) {
                    AgentInterface findAgent = feature.findAgent(it2.next().hostName);
                    if ((findAgent instanceof AgentRefreshInterface) && (onRefresh = ((AgentRefreshInterface) findAgent).onRefresh()) != null) {
                        arrayList.add(onRefresh);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return d.a((List) arrayList, (k) new k<Object>() { // from class: com.dianping.shield.components.ConfigurableTabAgent.2
                public static ChangeQuickRedirect changeQuickRedirect;

                @Override // rx.functions.k
                public Object call(Object... objArr2) {
                    return objArr2;
                }
            }).a(1);
        }
        return null;
    }
}
