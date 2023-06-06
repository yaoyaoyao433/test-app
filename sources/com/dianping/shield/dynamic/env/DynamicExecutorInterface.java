package com.dianping.shield.dynamic.env;

import com.dianping.shield.dynamic.protocols.IDynamicModuleViewItem;
import com.dianping.shield.node.processor.AsyncProcessor;
import java.util.ArrayList;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
/* compiled from: ProGuard */
/* loaded from: classes.dex */
public interface DynamicExecutorInterface {
    @Nullable
    ArrayList<AsyncProcessor> getComputeProcessors();

    void initScript();

    void onChassisCreate();

    void onChassisDestory();

    void onChassisPause();

    void onChassisResume();

    void onMonitorPaintingEnd(@NotNull Set<String> set);

    void onMonitorPaintingStart();

    void refreshScript();

    void sendEvent(@NotNull IDynamicModuleViewItem iDynamicModuleViewItem, @NotNull JSONObject jSONObject);

    void setReloadHostCallback(DynamicAgentHostReloadCallback dynamicAgentHostReloadCallback);
}
