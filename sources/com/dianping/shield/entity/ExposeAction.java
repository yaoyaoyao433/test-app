package com.dianping.shield.entity;

import com.dianping.agentsdk.framework.AgentInterface;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.utils.RobustBitConfig;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public class ExposeAction {
    public static final long DEFAULT_DELAY_FOR_AUTO_EXPOSE = 2000;
    public static ChangeQuickRedirect changeQuickRedirect;
    private ExposeControlActionType actionType;
    private AgentInterface agent;
    private CellInfo cellInfo;
    private long startDelay;

    public ExposeAction(ExposeControlActionType exposeControlActionType, long j, AgentInterface agentInterface, CellInfo cellInfo) {
        Object[] objArr = {exposeControlActionType, new Long(j), agentInterface, cellInfo};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        if (PatchProxy.isSupport(objArr, this, changeQuickRedirect2, false, "1e4e8a37ba4be5a5326b6c65e71e7ddd", 6917529027641081856L)) {
            PatchProxy.accessDispatch(objArr, this, changeQuickRedirect2, false, "1e4e8a37ba4be5a5326b6c65e71e7ddd");
            return;
        }
        this.startDelay = 0L;
        this.agent = null;
        this.cellInfo = null;
        this.actionType = exposeControlActionType;
        this.startDelay = j;
        this.agent = agentInterface;
        this.cellInfo = cellInfo;
    }

    public static ExposeAction startExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ce652902ebce958d6bf08bcb4a5c427a", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ce652902ebce958d6bf08bcb4a5c427a") : new ExposeAction(ExposeControlActionType.ACTION_START_EXPOSE, 0L, null, null);
    }

    public static ExposeAction startExpose(long j) {
        Object[] objArr = {new Long(j)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "f6df055850e19d791791ce18c36f3dcf", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "f6df055850e19d791791ce18c36f3dcf") : new ExposeAction(ExposeControlActionType.ACTION_START_EXPOSE, j, null, null);
    }

    public static ExposeAction finishExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "81980d3f322b0bd8b32e17fd6a785940", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "81980d3f322b0bd8b32e17fd6a785940") : new ExposeAction(ExposeControlActionType.ACTION_FINISH_EXPOSE, 0L, null, null);
    }

    public static ExposeAction pauseExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "9f39c068501da34a9dcffd6f0b008d2e", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "9f39c068501da34a9dcffd6f0b008d2e") : new ExposeAction(ExposeControlActionType.ACTION_PAUSE_EXPOSE, 0L, null, null);
    }

    public static ExposeAction resumeExpose() {
        Object[] objArr = new Object[0];
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "ee2f43e76d9d7eef901ccdcc19681f0b", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "ee2f43e76d9d7eef901ccdcc19681f0b") : new ExposeAction(ExposeControlActionType.ACTION_RESUME_EXPOSE, 0L, null, null);
    }

    public static ExposeAction resetAgentExpose(AgentInterface agentInterface) {
        Object[] objArr = {agentInterface};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "e06b16fef2a01d08904690f9de67ed77", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "e06b16fef2a01d08904690f9de67ed77") : new ExposeAction(ExposeControlActionType.ACTION_RESET_AGENT_EXPOSE_HISTORY, 0L, agentInterface, null);
    }

    public static ExposeAction resetRowExpose(AgentInterface agentInterface, int i, int i2) {
        Object[] objArr = {agentInterface, Integer.valueOf(i), Integer.valueOf(i2)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "c32f6576c67a5431f074c325fd524226", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "c32f6576c67a5431f074c325fd524226") : new ExposeAction(ExposeControlActionType.ACTION_RESET_AGENT_EXPOSE_HISTORY, 0L, agentInterface, new CellInfo(i, i2, CellType.NORMAL));
    }

    public static ExposeAction resetHeaderExpose(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "505b4ead87a806b8eae8c9c4da32618b", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "505b4ead87a806b8eae8c9c4da32618b") : new ExposeAction(ExposeControlActionType.ACTION_RESET_AGENT_EXPOSE_HISTORY, 0L, agentInterface, new CellInfo(i, -1, CellType.HEADER));
    }

    public static ExposeAction resetFooterExpose(AgentInterface agentInterface, int i) {
        Object[] objArr = {agentInterface, Integer.valueOf(i)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        return PatchProxy.isSupport(objArr, null, changeQuickRedirect2, true, "88ae54442dc17e06a757f6c2ac438048", RobustBitConfig.DEFAULT_VALUE) ? (ExposeAction) PatchProxy.accessDispatch(objArr, null, changeQuickRedirect2, true, "88ae54442dc17e06a757f6c2ac438048") : new ExposeAction(ExposeControlActionType.ACTION_RESET_AGENT_EXPOSE_HISTORY, 0L, agentInterface, new CellInfo(i, -2, CellType.FOOTER));
    }

    public ExposeControlActionType getActionType() {
        return this.actionType;
    }

    public long getStartDelay() {
        return this.startDelay;
    }

    public AgentInterface getAgent() {
        return this.agent;
    }

    public CellInfo getCellInfo() {
        return this.cellInfo;
    }
}
