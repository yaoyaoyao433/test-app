package com.dianping.shield.framework;

import android.os.Bundle;
import com.dianping.agentsdk.framework.c;
import com.dianping.agentsdk.framework.d;
import com.dianping.agentsdk.framework.j;
import java.util.ArrayList;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H&J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0006H&J\u000e\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH&J\u0012\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH&¨\u0006\r"}, d2 = {"Lcom/dianping/shield/framework/ShieldContainerInterface;", "", "generaterConfigs", "Ljava/util/ArrayList;", "Lcom/dianping/agentsdk/framework/AgentListConfig;", "getHostAgentManager", "Lcom/dianping/agentsdk/framework/AgentManagerInterface;", "getHostCellManager", "Lcom/dianping/agentsdk/framework/CellManagerInterface;", "resetAgents", "", "savedInstanceState", "Landroid/os/Bundle;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ShieldContainerInterface {
    @Nullable
    ArrayList<c> generaterConfigs();

    @Nullable
    d getHostAgentManager();

    @Nullable
    j<?> getHostCellManager();

    void resetAgents(@Nullable Bundle bundle);
}
