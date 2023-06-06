package com.dianping.shield.bridge.feature;

import java.io.Serializable;
import java.util.HashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\u0003H&J\u001e\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003H&¨\u0006\t"}, d2 = {"Lcom/dianping/shield/bridge/feature/PageArgumentsInterface;", "", "getShieldArguments", "Ljava/util/HashMap;", "", "Ljava/io/Serializable;", "setShieldArguments", "", "arguments", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface PageArgumentsInterface {
    @Nullable
    HashMap<String, Serializable> getShieldArguments();

    void setShieldArguments(@Nullable HashMap<String, Serializable> hashMap);
}
