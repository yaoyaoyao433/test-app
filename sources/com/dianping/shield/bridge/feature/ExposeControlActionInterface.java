package com.dianping.shield.bridge.feature;

import com.dianping.agentsdk.framework.f;
import com.dianping.shield.entity.ExposeAction;
import com.dianping.titans.js.JsBridgeResult;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/bridge/feature/ExposeControlActionInterface;", "", "callExposeAction", "", "action", "Lcom/dianping/shield/entity/ExposeAction;", "setExposeComputeMode", JsBridgeResult.ARG_KEY_LOCATION_MODE, "Lcom/dianping/agentsdk/framework/AutoExposeViewType$Type;", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ExposeControlActionInterface {
    void callExposeAction(@NotNull ExposeAction exposeAction);

    void setExposeComputeMode(@NotNull f.a aVar);
}
