package com.dianping.shield;

import com.dianping.eunomia.c;
import com.dianping.shield.framework.ShieldConfigInfo;
import com.dianping.shield.mapping.AgentProvider;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.HashMap;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentsRegisterMapping {
    private static final String EMPTY_TAG = "NA";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static boolean retry = false;
    private static int retryCountdown = 3;

    public AgentsRegisterMapping() {
    }

    public static final AgentsRegisterMapping getInstance() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a217f8a281c773d7f21f613e12c3ce7c", RobustBitConfig.DEFAULT_VALUE) ? (AgentsRegisterMapping) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a217f8a281c773d7f21f613e12c3ce7c") : LazyHolder.INSTANCE;
    }

    public void addShieldMapping(ShieldMappingInterface shieldMappingInterface) {
        Object[] objArr = {shieldMappingInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "52fbc1aa59086925caf5a127e69556c7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "52fbc1aa59086925caf5a127e69556c7");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldMapping(shieldMappingInterface);
        }
    }

    public void registerAgent(String str, Class cls) {
        Object[] objArr = {str, cls};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5ca3affc114115475a07929ebebed799", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5ca3affc114115475a07929ebebed799");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldConfigInfo(new AgentRegisterKey(str), new ShieldConfigInfo(str, cls));
        }
    }

    public void registerAgent(String str, Class cls, String str2) {
        Object[] objArr = {str, cls, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "ee1d68f6147acca10fb09c5c6bfa1e94", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "ee1d68f6147acca10fb09c5c6bfa1e94");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldConfigInfo(new AgentRegisterKey(str, str2), new ShieldConfigInfo(str, cls));
        }
    }

    public void registerAgent(String str, Class cls, String str2, String str3) {
        Object[] objArr = {str, cls, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "556d5f4ec2f5470818d663b60ced2ef7", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "556d5f4ec2f5470818d663b60ced2ef7");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldConfigInfo(new AgentRegisterKey(str, str2, str3), new ShieldConfigInfo(str, cls));
        }
    }

    public void registerAgent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "5bd059fb4528a9e0931ecd34404fa869", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "5bd059fb4528a9e0931ecd34404fa869");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldConfigInfo(new AgentRegisterKey(str), new ShieldConfigInfo(str, str2));
        }
    }

    public void registerAgent(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6a572a9d23796a757b8bfdea5b4bff25", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6a572a9d23796a757b8bfdea5b4bff25");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldConfigInfo(new AgentRegisterKey(str, str3), new ShieldConfigInfo(str, str2));
        }
    }

    public void registerAgent(String str, String str2, String str3, String str4) {
        Object[] objArr = {str, str2, str3, str4};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "18ba5c548213465ba097fd8e8b576a49", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "18ba5c548213465ba097fd8e8b576a49");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldConfigInfo(new AgentRegisterKey(str, str3, str4), new ShieldConfigInfo(str, str2));
        }
    }

    public void registerAgent(AgentRegisterKey agentRegisterKey, ShieldConfigInfo shieldConfigInfo) {
        Object[] objArr = {agentRegisterKey, shieldConfigInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "4e6544b152727f99676b6b5c56cdbedf", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "4e6544b152727f99676b6b5c56cdbedf");
        } else {
            ShieldInterfaceMapping.INSTANCE.addShieldConfigInfo(agentRegisterKey, shieldConfigInfo);
        }
    }

    public ShieldConfigInfo getAgent(AgentRegisterKey agentRegisterKey) {
        Object[] objArr = {agentRegisterKey};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "26217629769dead8850d4dbd520c5d40", RobustBitConfig.DEFAULT_VALUE) ? (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "26217629769dead8850d4dbd520c5d40") : getAgentWithRetry(agentRegisterKey, null);
    }

    private ShieldConfigInfo getAgentWithRetry(AgentRegisterKey agentRegisterKey, c cVar) {
        Object[] objArr = {agentRegisterKey, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "75c4b821d5eb6ecb9d6b862d7a48812f", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "75c4b821d5eb6ecb9d6b862d7a48812f");
        }
        ShieldConfigInfo agentInner = getAgentInner(agentRegisterKey, cVar);
        if (!retry && agentInner == null) {
            retryCountdown--;
        }
        if (retry || retryCountdown != 0) {
            return agentInner;
        }
        retry = true;
        ShieldInterfaceMapping.INSTANCE.loadDefaultMapping();
        return getAgentInner(agentRegisterKey, cVar);
    }

    private ShieldConfigInfo getAgentInner(AgentRegisterKey agentRegisterKey, c cVar) {
        Object[] objArr = {agentRegisterKey, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e229797df6fedaf9d80e7925692199ec", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e229797df6fedaf9d80e7925692199ec");
        }
        if (agentRegisterKey.extraKey == null || !EMPTY_TAG.equals(agentRegisterKey.extraKey)) {
            ShieldConfigInfo mappingDynamicAgent = cVar == null ? AgentProvider.mappingDynamicAgent(agentRegisterKey) : AgentProvider.mappingDynamicAgent(agentRegisterKey, cVar);
            return mappingDynamicAgent != null ? mappingDynamicAgent : ShieldInterfaceMapping.INSTANCE.getAgentInner(agentRegisterKey, cVar);
        }
        return null;
    }

    public ShieldConfigInfo getAgentWithPriority(AgentRegisterKey agentRegisterKey, c cVar) {
        Object[] objArr = {agentRegisterKey, cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "e44c1754157976286626e9af6be0af6d", RobustBitConfig.DEFAULT_VALUE)) {
            return (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "e44c1754157976286626e9af6be0af6d");
        }
        if (cVar == null) {
            return null;
        }
        ShieldConfigInfo agentWithRetry = getAgentWithRetry(agentRegisterKey, cVar);
        if (agentWithRetry != null) {
            agentWithRetry.priority = cVar.d;
            if (cVar.e != null && cVar.e.length > 0) {
                HashMap<String, Serializable> hashMap = new HashMap<>();
                for (int i = 0; i < cVar.e.length; i++) {
                    hashMap.put(cVar.e[i].key, cVar.e[i].val);
                }
                agentWithRetry.arguments = hashMap;
            }
        }
        return agentWithRetry;
    }

    public ShieldConfigInfo getAgent(String str) {
        Object[] objArr = {str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "12122c2b41b2a263e7538c4d001679c4", RobustBitConfig.DEFAULT_VALUE) ? (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "12122c2b41b2a263e7538c4d001679c4") : getAgent(new AgentRegisterKey(str));
    }

    public ShieldConfigInfo getAgent(String str, String str2) {
        Object[] objArr = {str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "05c8a42f71980e7557c33abf49dd9a99", RobustBitConfig.DEFAULT_VALUE) ? (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "05c8a42f71980e7557c33abf49dd9a99") : getAgent(new AgentRegisterKey(str, str2));
    }

    public ShieldConfigInfo getAgent(String str, String str2, String str3) {
        Object[] objArr = {str, str2, str3};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "0fb2572336ba6614fd93502e427064bf", RobustBitConfig.DEFAULT_VALUE) ? (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "0fb2572336ba6614fd93502e427064bf") : getAgent(new AgentRegisterKey(str, str2, str3));
    }

    public ShieldConfigInfo getAgentWithPriority(c cVar, String str, String str2) {
        Object[] objArr = {cVar, str, str2};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "fa725d6b01f46d281760cda8b92dc86c", RobustBitConfig.DEFAULT_VALUE) ? (ShieldConfigInfo) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "fa725d6b01f46d281760cda8b92dc86c") : getAgentWithPriority(new AgentRegisterKey(cVar.a, str, str2), cVar);
    }

    public HashMap<AgentRegisterKey, ShieldConfigInfo> getGlobalAgentMap() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "b732a7c5527aba392132d161a7ce6766", RobustBitConfig.DEFAULT_VALUE) ? (HashMap) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "b732a7c5527aba392132d161a7ce6766") : ShieldInterfaceMapping.INSTANCE.getAgentMap();
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public static class LazyHolder {
        private static final AgentsRegisterMapping INSTANCE = new AgentsRegisterMapping();
        public static ChangeQuickRedirect changeQuickRedirect;
    }
}
