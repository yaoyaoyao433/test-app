package com.dianping.shield.node.adapter.status;

import com.dianping.shield.dynamic.utils.DMKeys;
import com.dianping.shield.entity.ScrollDirection;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
/* compiled from: ProGuard */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&J\u001a\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H&¨\u0006\b"}, d2 = {"Lcom/dianping/shield/node/adapter/status/ElementContainerStatusInterface;", "", "onAppear", "", DMKeys.KEY_SCROLL_DIRECTION, "Lcom/dianping/shield/entity/ScrollDirection;", "data", "onDisappear", "shieldCore_release"}, k = 1, mv = {1, 1, 13})
/* loaded from: classes.dex */
public interface ElementContainerStatusInterface {
    void onAppear(@NotNull ScrollDirection scrollDirection, @Nullable Object obj);

    void onDisappear(@NotNull ScrollDirection scrollDirection, @Nullable Object obj);
}
