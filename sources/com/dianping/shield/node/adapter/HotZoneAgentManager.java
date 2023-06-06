package com.dianping.shield.node.adapter;

import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.shield.entity.HotZoneYRange;
import com.dianping.shield.entity.ScrollDirection;
import com.dianping.shield.feature.HotZoneStatusInterface;
import com.dianping.shield.node.adapter.hotzone.AgentHotZoneInfo;
import com.dianping.shield.node.adapter.hotzone.HotZoneInfo;
import com.dianping.shield.node.adapter.hotzone.HotZoneLocation;
import com.dianping.shield.node.adapter.status.ViewLocationRectInterface;
import com.dianping.shield.node.cellnode.ShieldDisplayNode;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class HotZoneAgentManager extends HotZoneManager {
    public static ChangeQuickRedirect changeQuickRedirect;
    private ArrayList<AgentHotZoneInfo> agentLocationList;
    private HotZoneStatusInterface hotZoneStatusInterface;
    private Set<String> observerAgents;
    private ArrayList<AgentHotZoneInfo> observerAgentsLocList;

    public HotZoneAgentManager(ViewLocationRectInterface viewLocationRectInterface) {
        super(viewLocationRectInterface);
        Object[] objArr = {viewLocationRectInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bd4d8ec6baff77ad36893ceec8116426", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bd4d8ec6baff77ad36893ceec8116426");
            return;
        }
        this.agentLocationList = new ArrayList<>();
        this.observerAgentsLocList = new ArrayList<>();
    }

    @Override // com.dianping.shield.node.adapter.HotZoneManager
    public HotZoneYRange getHotZoneYRange() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6eae87de0991b4b5c06653f0146f9679", RobustBitConfig.DEFAULT_VALUE)) {
            return (HotZoneYRange) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6eae87de0991b4b5c06653f0146f9679");
        }
        if (this.hotZoneStatusInterface != null) {
            return this.hotZoneStatusInterface.defineStatusHotZone();
        }
        return null;
    }

    public void setHotZoneStatusInterface(HotZoneStatusInterface hotZoneStatusInterface, String str) {
        Object[] objArr = {hotZoneStatusInterface, str};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "72093300727843e2f1621050b14f5744", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "72093300727843e2f1621050b14f5744");
            return;
        }
        this.hotZoneStatusInterface = hotZoneStatusInterface;
        if (str != null) {
            HashSet hashSet = new HashSet();
            Iterator<String> it = hotZoneStatusInterface.observerAgents().iterator();
            while (it.hasNext()) {
                hashSet.add(str + "@" + it.next());
            }
            this.observerAgents = hashSet;
            return;
        }
        this.observerAgents = hotZoneStatusInterface.observerAgents();
    }

    @Override // com.dianping.shield.node.adapter.HotZoneManager
    public void updateHotZoneLocation(ArrayList<HotZoneInfo> arrayList, ScrollDirection scrollDirection) {
        Object[] objArr = {arrayList, scrollDirection};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "6f26d5a02ed20e7185224095711aa8cd", RobustBitConfig.DEFAULT_VALUE)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "6f26d5a02ed20e7185224095711aa8cd");
        } else if (arrayList.size() != 0 && this.hotZoneStatusInterface != null) {
            this.agentLocationList.clear();
            this.observerAgentsLocList.clear();
            for (int i = 0; i < arrayList.size(); i++) {
                HotZoneInfo hotZoneInfo = arrayList.get(i);
                HotZoneLocation hotZoneLocation = hotZoneInfo.hotZoneLocation;
                ShieldDisplayNode shieldDisplayNode = hotZoneInfo.shieldDisplayNode;
                if (shieldDisplayNode == null) {
                    break;
                }
                AgentInterface agentInterface = shieldDisplayNode.rowParent.sectionParent.cellParent.owner;
                AgentHotZoneInfo agentHotZoneInfo = new AgentHotZoneInfo(agentInterface.getHostName(), hotZoneLocation);
                for (String str : this.observerAgents) {
                    if (agentInterface.getHostName().startsWith(str)) {
                        this.observerAgentsLocList.add(agentHotZoneInfo);
                    }
                }
                this.agentLocationList.add(agentHotZoneInfo);
            }
            if (this.observerAgents.size() > 0) {
                this.hotZoneStatusInterface.onHotZoneLocationChanged(this.observerAgentsLocList, scrollDirection);
            } else {
                this.hotZoneStatusInterface.onHotZoneLocationChanged(this.agentLocationList, scrollDirection);
            }
        }
    }
}
