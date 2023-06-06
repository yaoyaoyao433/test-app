package com.dianping.shield.components.scrolltab;

import com.dianping.agentsdk.framework.v;
import com.dianping.shield.bridge.feature.ShieldGlobalFeatureInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\bf\u0018\u00002\u00020\u0001J\n\u0010\u0002\u001a\u0004\u0018\u00010\u0003H&J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/components/scrolltab/PageComposeInterface;", "", "getCurrentChildFeature", "Lcom/dianping/shield/bridge/feature/ShieldGlobalFeatureInterface;", "getSubFeatureBridgeInterface", "Lcom/dianping/agentsdk/framework/FeatureBridgeInterface;", "index", "", "shield_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface PageComposeInterface {
    @Nullable
    ShieldGlobalFeatureInterface getCurrentChildFeature();

    @Nullable
    v getSubFeatureBridgeInterface(int i);
}
