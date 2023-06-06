package com.dianping.shield.entity;

import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.sectionrecycler.layoutmanager.a;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
import java.io.Serializable;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class AgentScrollerParams implements Serializable {
    public static final float DEFAULT_SPEED = -1.0f;
    public static ChangeQuickRedirect changeQuickRedirect;
    public boolean isSmooth;
    public ArrayList<a> listenerArrayList;
    public boolean needAutoOffset;
    public boolean needPauseExpose;
    @Nullable
    private NodeInfo nodeInfo;
    public int offset;
    @NotNull
    private ScrollScope scope;
    public float speed;

    public AgentScrollerParams(ScrollScope scrollScope, NodeInfo nodeInfo) {
        Object[] objArr = {scrollScope, nodeInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "f6093c8a8f816364611b81c211bb9a16", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "f6093c8a8f816364611b81c211bb9a16");
            return;
        }
        this.speed = -1.0f;
        this.offset = 0;
        this.isSmooth = true;
        this.needAutoOffset = false;
        this.needPauseExpose = false;
        this.scope = scrollScope;
        this.nodeInfo = nodeInfo;
    }

    public static AgentScrollerParams toPage() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a23c7fb59a778242b2b3b5b7a7082e08", RobustBitConfig.DEFAULT_VALUE) ? (AgentScrollerParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a23c7fb59a778242b2b3b5b7a7082e08") : new AgentScrollerParams(ScrollScope.PAGE, null);
    }

    public static AgentScrollerParams toAgent(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ca325f92063f2770dfb9ef46ca4bcbe1", RobustBitConfig.DEFAULT_VALUE) ? (AgentScrollerParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ca325f92063f2770dfb9ef46ca4bcbe1") : new AgentScrollerParams(ScrollScope.AGENT, NodeInfo.agent(agentInterface));
    }

    public static AgentScrollerParams toSection(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "5dac759d3bda3211ade4945b66a24c41", RobustBitConfig.DEFAULT_VALUE) ? (AgentScrollerParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "5dac759d3bda3211ade4945b66a24c41") : new AgentScrollerParams(ScrollScope.SECTION, NodeInfo.section(agentInterface, i));
    }

    public static AgentScrollerParams toRow(AgentInterface agentInterface, int i, int i2) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "3fceb9d5b6c68bcd5a0dcb03d3c892a1", RobustBitConfig.DEFAULT_VALUE) ? (AgentScrollerParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "3fceb9d5b6c68bcd5a0dcb03d3c892a1") : new AgentScrollerParams(ScrollScope.ROW, NodeInfo.row(agentInterface, i, i2));
    }

    public static AgentScrollerParams toHeader(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "8cfed569d4318fe36c0bc2494cd95e22", RobustBitConfig.DEFAULT_VALUE) ? (AgentScrollerParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "8cfed569d4318fe36c0bc2494cd95e22") : new AgentScrollerParams(ScrollScope.HEADER, NodeInfo.header(agentInterface, i));
    }

    public static AgentScrollerParams toFooter(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "16ae86903890ceec7a5c2308fb31ed9a", RobustBitConfig.DEFAULT_VALUE) ? (AgentScrollerParams) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "16ae86903890ceec7a5c2308fb31ed9a") : new AgentScrollerParams(ScrollScope.FOOTER, NodeInfo.footer(agentInterface, i));
    }

    public AgentScrollerParams setOffset(int i) {
        this.offset = i;
        return this;
    }

    public AgentScrollerParams setSmooth(boolean z) {
        this.isSmooth = z;
        return this;
    }

    public AgentScrollerParams setSpeed(float f) {
        this.speed = f;
        return this;
    }

    public AgentScrollerParams setNeedAutoOffset(boolean z) {
        this.needAutoOffset = z;
        return this;
    }

    public AgentScrollerParams setNeedPauseExpose(boolean z) {
        this.needPauseExpose = z;
        return this;
    }

    public AgentScrollerParams addOnSmoothScrollListener(a aVar) {
        Object[] objArr = {aVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "846940e9c9be84c95951837073f4485f", RobustBitConfig.DEFAULT_VALUE)) {
            return (AgentScrollerParams) PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "846940e9c9be84c95951837073f4485f");
        }
        if (this.listenerArrayList == null) {
            this.listenerArrayList = new ArrayList<>();
        }
        this.listenerArrayList.add(aVar);
        return this;
    }

    public ScrollScope getScope() {
        return this.scope;
    }

    @Nullable
    public NodeInfo getNodeInfo() {
        return this.nodeInfo;
    }
}
