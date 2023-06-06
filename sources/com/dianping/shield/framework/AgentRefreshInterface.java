package com.dianping.shield.framework;

import com.alipay.sdk.widget.d;
import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.shield.agent.AgentLoadedObservableType;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0003H&J\b\u0010\b\u001a\u00020\tH&¨\u0006\n"}, d2 = {"Lcom/dianping/shield/framework/AgentRefreshInterface;", "Lcom/dianping/agentsdk/framework/AgentInterface;", "getLoadedObservable", "Lrx/Observable;", "getLoadedObservableType", "Lcom/dianping/shield/agent/AgentLoadedObservableType;", d.p, "", "updateConfigure", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface AgentRefreshInterface extends AgentInterface {
    @Nullable
    rx.d<AgentInterface> getLoadedObservable();

    @NotNull
    AgentLoadedObservableType getLoadedObservableType();

    @Nullable
    rx.d<Object> onRefresh();

    void updateConfigure();
}
