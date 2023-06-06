package com.dianping.agentsdk.framework;

import java.util.Map;
/* compiled from: ProGuard */
@Deprecated
/* loaded from: classes.dex */
public interface c {
    @Deprecated
    Map<String, b> getAgentInfoList();

    @Deprecated
    Map<String, Class<? extends AgentInterface>> getAgentList();

    boolean shouldShow();
}
