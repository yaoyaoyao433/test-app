package com.dianping.shield.bridge.feature;

import com.dianping.shield.entity.NodeInfo;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/bridge/feature/AgentGlobalPositionInterface;", "", "getAgentInfoByGlobalPosition", "Lcom/dianping/shield/entity/NodeInfo;", "globalPosition", "", "getNodeGlobalPosition", "nodeInfo", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface AgentGlobalPositionInterface {
    @Nullable
    NodeInfo getAgentInfoByGlobalPosition(int i);

    int getNodeGlobalPosition(@NotNull NodeInfo nodeInfo);
}
