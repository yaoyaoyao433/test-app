package com.dianping.shield.bridge.feature;

import com.dianping.agentsdk.framework.AgentInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/dianping/shield/bridge/feature/AgentFinderInterface;", "", "findAgent", "Lcom/dianping/agentsdk/framework/AgentInterface;", "name", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface AgentFinderInterface {
    @Nullable
    AgentInterface findAgent(@NotNull String str);
}
