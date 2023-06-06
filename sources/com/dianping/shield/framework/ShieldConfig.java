package com.dianping.shield.framework;

import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.b;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.utils.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public abstract class ShieldConfig implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    public abstract ArrayList<ArrayList<ShieldConfigInfo>> getAgentGroupConfig();

    @Override // com.dianping.agentsdk.framework.c
    public Map<String, Class<? extends AgentInterface>> getAgentList() {
        return null;
    }

    @Override // com.dianping.agentsdk.framework.c
    public Map<String, b> getAgentInfoList() {
        b a;
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "544db5d314705a401e410905e7ee48bf", RobustBitConfig.DEFAULT_VALUE)) {
            return (Map) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "544db5d314705a401e410905e7ee48bf");
        }
        ArrayList<ArrayList<ShieldConfigInfo>> agentGroupConfig = getAgentGroupConfig();
        if (agentGroupConfig == null || agentGroupConfig.isEmpty()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (int i = 0; i < agentGroupConfig.size(); i++) {
            ArrayList<ShieldConfigInfo> arrayList = agentGroupConfig.get(i);
            if (arrayList != null && !arrayList.isEmpty()) {
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    ShieldConfigInfo shieldConfigInfo = arrayList.get(i2);
                    try {
                        if (shieldConfigInfo.agentClass != null) {
                            a = a.a(shieldConfigInfo.agentClass, i, i2, agentGroupConfig.size(), arrayList.size());
                        } else {
                            a = (shieldConfigInfo.agentPath == null || "".equals(shieldConfigInfo.agentPath)) ? null : a.a(Class.forName(shieldConfigInfo.agentPath), i, i2, agentGroupConfig.size(), arrayList.size());
                        }
                        if (a != null) {
                            a.f = shieldConfigInfo.priority;
                            a.g = shieldConfigInfo.arguments;
                            linkedHashMap.put(shieldConfigInfo.hostName, a);
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
