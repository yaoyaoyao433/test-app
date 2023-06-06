package com.dianping.shield.feature;

import com.dianping.agentsdk.framework.AgentInterface;
import com.dianping.agentsdk.framework.c;
import com.dianping.shield.manager.LightAgentManager;
import com.meituan.android.common.statistics.Constants;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import rx.e;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J2\u0010\u0007\u001a\u00020\u00032\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0010\u0010\u000b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\r\u0018\u00010\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH&¨\u0006\u000f"}, d2 = {"Lcom/dianping/shield/feature/AgentManagerFeatureInterface;", "", "registerAgentLifecycleCallbacks", "", Constants.JSNative.DATA_CALLBACK, "Lcom/dianping/shield/manager/LightAgentManager$AgentLifecycleCallbacks;", "unregisterAgentLifecycleCallbacks", "updateAgentConfigures", "defaultConfig", "", "Lcom/dianping/agentsdk/framework/AgentListConfig;", "subscriber", "Lrx/Observer;", "Lcom/dianping/agentsdk/framework/AgentInterface;", "parentAgent", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface AgentManagerFeatureInterface {
    void registerAgentLifecycleCallbacks(@NotNull LightAgentManager.AgentLifecycleCallbacks agentLifecycleCallbacks);

    void unregisterAgentLifecycleCallbacks(@NotNull LightAgentManager.AgentLifecycleCallbacks agentLifecycleCallbacks);

    void updateAgentConfigures(@NotNull List<? extends c> list, @Nullable e<? super AgentInterface> eVar, @Nullable AgentInterface agentInterface);
}
