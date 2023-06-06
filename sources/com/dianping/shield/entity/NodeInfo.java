package com.dianping.shield.entity;

import com.dianping.agentsdk.framework.AgentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class NodeInfo {
    public static final int ROW_FOOTER = -2;
    public static final int ROW_HEADR = -1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private AgentInterface agent;
    private CellInfo cellInfo;
    private Scope scope;

    public NodeInfo(AgentInterface agentInterface, Scope scope, CellInfo cellInfo) {
        Object[] objArr = {agentInterface, scope, cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "77b7710c5ab6cd3d59ef65fdaa938169", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "77b7710c5ab6cd3d59ef65fdaa938169");
            return;
        }
        this.agent = agentInterface;
        this.scope = scope;
        this.cellInfo = cellInfo;
    }

    public static NodeInfo agent(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "a4d484fd4a7c88d0c338ba2ff5dae6ca", RobustBitConfig.DEFAULT_VALUE) ? (NodeInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "a4d484fd4a7c88d0c338ba2ff5dae6ca") : new NodeInfo(agentInterface, Scope.AGENT, new CellInfo(0, 0, CellType.NORMAL));
    }

    public static NodeInfo section(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "456f578f84d6c2617d1fb39fd32e5758", RobustBitConfig.DEFAULT_VALUE) ? (NodeInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "456f578f84d6c2617d1fb39fd32e5758") : new NodeInfo(agentInterface, Scope.SECTION, new CellInfo(i, 0, CellType.NORMAL));
    }

    public static NodeInfo row(AgentInterface agentInterface, int i, int i2) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f088a562a86c268f69aabc045b80d671", RobustBitConfig.DEFAULT_VALUE) ? (NodeInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f088a562a86c268f69aabc045b80d671") : new NodeInfo(agentInterface, Scope.ROW, new CellInfo(i, i2, CellType.NORMAL));
    }

    public static NodeInfo header(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c2cc19a5062d1ad79eff0be9c0691550", RobustBitConfig.DEFAULT_VALUE) ? (NodeInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c2cc19a5062d1ad79eff0be9c0691550") : new NodeInfo(agentInterface, Scope.HEADER, new CellInfo(i, -1, CellType.HEADER));
    }

    public static NodeInfo footer(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "4d872527c0e4fea59edc17dfc137ea5f", RobustBitConfig.DEFAULT_VALUE) ? (NodeInfo) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "4d872527c0e4fea59edc17dfc137ea5f") : new NodeInfo(agentInterface, Scope.FOOTER, new CellInfo(i, -2, CellType.FOOTER));
    }

    public AgentInterface getAgent() {
        return this.agent;
    }

    public int getSection() {
        return this.cellInfo.section;
    }

    public int getRow() {
        return this.cellInfo.row;
    }

    public Scope getScope() {
        return this.scope;
    }

    public CellInfo getCellInfo() {
        return this.cellInfo;
    }

    /* compiled from: ProGuard */
    /* loaded from: classes.dex */
    public enum Scope {
        AGENT,
        SECTION,
        ROW,
        HEADER,
        FOOTER;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        Scope() {
            Object[] objArr = {r10, Integer.valueOf(r11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "bf7bb82512e02c0d494b5064aa19fdd3", 6917529027641081856L)) {
                PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "bf7bb82512e02c0d494b5064aa19fdd3");
            }
        }

        public static Scope valueOf(String str) {
            Object[] objArr = {str};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f3fef4815ced1c097a52164e23a6f538", RobustBitConfig.DEFAULT_VALUE) ? (Scope) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f3fef4815ced1c097a52164e23a6f538") : (Scope) Enum.valueOf(Scope.class, str);
        }

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Scope[] valuesCustom() {
            Object[] objArr = new Object[0];
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "7a68d1461383e5c49d8d2f1bffcc7a55", RobustBitConfig.DEFAULT_VALUE) ? (Scope[]) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "7a68d1461383e5c49d8d2f1bffcc7a55") : (Scope[]) values().clone();
        }
    }
}
