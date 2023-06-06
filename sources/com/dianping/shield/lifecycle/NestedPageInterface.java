package com.dianping.shield.lifecycle;

import com.dianping.shield.entity.ScrollDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0007H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/lifecycle/NestedPageInterface;", "", "onPageScrolled", "", "direction", "Lcom/dianping/shield/entity/ScrollDirection;", "shouldInterceptPageLifecycle", "", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface NestedPageInterface {
    void onPageScrolled(@NotNull ScrollDirection scrollDirection);

    boolean shouldInterceptPageLifecycle();
}
